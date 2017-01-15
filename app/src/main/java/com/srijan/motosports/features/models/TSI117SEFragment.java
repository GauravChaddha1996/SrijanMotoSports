package com.srijan.motosports.features.models;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.srijan.motosports.R;

import java.util.HashMap;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * A simple {@link Fragment} subclass.
 */
public class TSI117SEFragment extends Fragment implements View.OnClickListener,BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private SliderLayout tsi117seSlider;
    Button buyNow;

    public TSI117SEFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        tsi117seSlider = (SliderLayout) getView().findViewById(R.id.tsi17se_viewflipper);
        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("TSI-17-SE 01",R.drawable.tsise01);
        file_maps.put("TSI-17-SE 0",R.drawable.tsise02);
        file_maps.put("TSI-17-SE 03",R.drawable.tsise03);
        file_maps.put("TSI-17-SE 04", R.drawable.tsise04);
        file_maps.put("TSI-17-SE 05", R.drawable.tsise05);
        file_maps.put("TSI-17-SE 06", R.drawable.tsise06);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            tsi117seSlider.addSlider(textSliderView);
        }

        tsi117seSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        //tsi117seSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        tsi117seSlider.setCustomAnimation(new DescriptionAnimation());
        tsi117seSlider.setDuration(2500);
        tsi117seSlider.addOnPageChangeListener(this);
        tsi117seSlider.startAutoCycle();

        buyNow = (Button) getView().findViewById(R.id.button_buynow_tsise);
        buyNow.setOnClickListener(this);

        super.onActivityCreated(savedInstanceState);
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tsi117_se, container, false);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(),"You bought TSI-17-SE",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        tsi117seSlider.stopAutoCycle();
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
