package com.srijan.motosports.features.home.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.srijan.motosports.R;
import com.srijan.motosports.app.SrijanApplication;
import com.srijan.motosports.features.home.HomeActivity;
import com.srijan.motosports.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HomeFragment extends Fragment {

    final long raceTime = 60 * 60 * 5;
    @BindView(R.id.imageSliderLayoutHomeFragment)
    SliderLayout imageSliderLayout;
    @BindView(R.id.textView_HomeFragment_NextRaceTimer)
    TextView nextRaceTimer;
    Subscription subscription;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        setImageSlider();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        imageSliderLayout.startAutoCycle();
        listenToRaceTimer();
    }

    @Override
    public void onStop() {
        imageSliderLayout.stopAutoCycle();
        subscription.unsubscribe();
        super.onStop();
    }

    @OnClick(R.id.cardViewHomeFragmentBuyRaceCar)
    void onBuyRaceCarCardClick() {
        ((HomeActivity) getActivity()).navigateToModels();
    }

    @OnClick(R.id.cardViewHomeFragmentCookYourCar)
    void onCookYourCarCardClick() {
        ((HomeActivity) getActivity()).navigateToCookYourCar();
    }

    private void setImageSlider() {
        int resId;
        for (int i = 1; i <= 8; i++) {
            resId = getActivity().getResources().getIdentifier("wallpaper" + i, "drawable",
                    getActivity().getPackageName());
            DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
            defaultSliderView.image(resId);
            imageSliderLayout.addSlider(defaultSliderView);
        }
        imageSliderLayout.setPresetTransformer(SliderLayout.Transformer.ZoomOut);
    }

    private void listenToRaceTimer() {
        subscription = SrijanApplication.getRaceTimerObservable()
                .map(aLong -> raceTime - aLong)
                .map(Utils::splitToComponentTimes)
                .map(ints -> ints[0] + " Hrs " + ints[1] + " Min " + ints[2] + " Sec")
                .map(s -> getString(R.string.home_fragment_next_race) + s)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.immediate())
                .subscribe(s -> nextRaceTimer.setText(s), Throwable::printStackTrace);
    }

}
