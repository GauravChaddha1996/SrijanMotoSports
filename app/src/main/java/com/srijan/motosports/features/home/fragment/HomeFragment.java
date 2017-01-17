package com.srijan.motosports.features.home.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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
    Subscription subscription;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Srijan Motosports");
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        setImageSlider();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        imageSliderLayout.startAutoCycle();
    }

    @Override
    public void onStop() {
        imageSliderLayout.stopAutoCycle();
        super.onStop();
    }

    @OnClick(R.id.textView_HomeFragment_CallYourRaceEngineer)
    void clickCallRaceEngineer() {
        Toast.makeText(getActivity(),"Calling your Race Engineer",Toast.LENGTH_SHORT).show();
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

}
