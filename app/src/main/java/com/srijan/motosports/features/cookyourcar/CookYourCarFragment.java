package com.srijan.motosports.features.cookyourcar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;
import com.srijan.motosports.R;
import com.srijan.motosports.database.DataManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class CookYourCarFragment extends Fragment implements ItemCheckChangedListener {

    @BindView(R.id.recyclerViewCookYourCar)
    RecyclerView recyclerView;
    @BindView(R.id.totalAmount_cookYourCar)
    TextView totalAmount;
    @BindView(R.id.carImage_cookYourCar)
    ImageView carImage;

    CookYourCarAdapter cookYourCarAdapter;

    public CookYourCarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cook_your_car, container, false);
        ButterKnife.bind(this, view);
        setUpRecyclerView();
        return view;
    }

    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        cookYourCarAdapter = new CookYourCarAdapter(getActivity(),
                DataManager.getDataManager().getCookYourCarItems(), this);
        recyclerView.setAdapter(cookYourCarAdapter);
    }

    @Override
    public void itemPickedChanged(String amount) {
        totalAmount.setText(amount);
    }

    @Override
    public void animateStuff(String string) {
        switch (string) {
            case "Wheels":
                YoYo.with(Techniques.Swing)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Damper":
                YoYo.with(Techniques.Wave)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Steering Material":
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Steering Wheel":
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Seat":
                YoYo.with(Techniques.TakingOff)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.BounceIn)
                                        .duration(500)
                                        .playOn(carImage);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(carImage);
                break;
            case "Tires":
                YoYo.with(Techniques.SlideOutRight)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.SlideInLeft)
                                        .duration(500)
                                        .playOn(carImage);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(carImage);
                break;
            case "Body Works":
                YoYo.with(Techniques.RotateOut)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.RotateIn)
                                        .duration(500)
                                        .playOn(carImage);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(carImage);
                break;
            case "DashBoard":
                YoYo.with(Techniques.Landing)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Intake":
                YoYo.with(Techniques.FlipInX)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "Exhaust":
                YoYo.with(Techniques.RollIn)
                        .duration(500)
                        .playOn(carImage);
                break;
            case "ECU":
                YoYo.with(Techniques.ZoomOut)
                        .duration(500)
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.ZoomIn)
                                        .duration(500)
                                        .playOn(carImage);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(carImage);
                break;

        }
    }

    @OnClick(R.id.buy_now_cookYouCar)
    void buyNowCookYourCar() {
        Toast.makeText(getActivity(), "You have purchased the car you have cooked. Enjoy!!", Toast.LENGTH_SHORT).show();
    }
}
