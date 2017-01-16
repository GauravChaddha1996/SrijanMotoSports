package com.srijan.motosports.features.models;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.srijan.motosports.R;
import com.srijan.motosports.features.cookyourcar.CookYourCarFragment;
import com.srijan.motosports.features.home.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ModelsFragment extends Fragment  {

    Button modelTSI17SE,modelTSI17KE,modelCookYourCar;

    public ModelsFragment() {
        // Required empty public constructor
    }

    public void onClickCookCar(){
        CookYourCarFragment fragment = new CookYourCarFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_home, fragment);
        fragmentTransaction.addToBackStack(null);
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Cook your own car");
        fragmentTransaction.commit();
    }

    public void onClickTS17SE(){
        TSI117SEFragment fragment = new TSI117SEFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_home, fragment);
        fragmentTransaction.addToBackStack(null);
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("TS17SE");
        fragmentTransaction.commit();
    }

    public void onClickTS17KE(){
        TSI117KEFragment fragment = new TSI117KEFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_home, fragment);
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("TS17KE");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        modelTSI17SE = (Button) getView().findViewById(R.id.button_model_TSI_17_SE);
        modelTSI17KE = (Button) getView().findViewById(R.id.button_model_TSI_17_KE);
        modelCookYourCar = (Button) getView().findViewById(R.id.button_cook_car);

        Animation animation_SE = AnimationUtils.loadAnimation(getContext(),R.anim.anim_model_ts117se);
        Animation animation_KE = AnimationUtils.loadAnimation(getContext(),R.anim.anim_model_ts117ke);
        Animation animation_CookCar = AnimationUtils.loadAnimation(getContext(),R.anim.anim_model_cook_car);

        modelCookYourCar.startAnimation(animation_CookCar);
        modelTSI17KE.startAnimation(animation_KE);
        modelTSI17SE.startAnimation(animation_SE);

        modelCookYourCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickCookCar();
            }
        });
        modelTSI17SE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickTS17SE();
            }
        });
        modelTSI17KE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickTS17KE();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Models");
        return inflater.inflate(R.layout.fragment_models, container,false);
    }

}
