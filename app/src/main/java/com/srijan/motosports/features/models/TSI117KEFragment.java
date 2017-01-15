package com.srijan.motosports.features.models;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.srijan.motosports.R;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class TSI117KEFragment extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener,View.OnClickListener {

    private SliderLayout tsi117keSlider;
    Button buyNow;

    public TSI117KEFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        tsi117keSlider = (SliderLayout) getView().findViewById(R.id.tsi17ke_viewflipper);
        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("TSI-17-KE 01",R.drawable.tsike01);
        file_maps.put("TSI-17-KE 02",R.drawable.tsike02);
        file_maps.put("TSI-17-KE 03",R.drawable.tsike03);
        file_maps.put("TSI-17-KE 04", R.drawable.tsike04);
        file_maps.put("TSI-17-KE 05", R.drawable.tsike05);
        file_maps.put("TSI-17-KE 06", R.drawable.tsike06);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            tsi117keSlider.addSlider(textSliderView);
        }

        tsi117keSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        tsi117keSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        tsi117keSlider.setCustomAnimation(new DescriptionAnimation());
        tsi117keSlider.setDuration(2500);
        tsi117keSlider.addOnPageChangeListener(this);
        tsi117keSlider.startAutoCycle();

        buyNow = (Button) getView().findViewById(R.id.button_buynow_tsike);
        buyNow.setOnClickListener(this);

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tsi117_ke, container, false);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(),"You bought TSI-17-KE",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        tsi117keSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {}
}
