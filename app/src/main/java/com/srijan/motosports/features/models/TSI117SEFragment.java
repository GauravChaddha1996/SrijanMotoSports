package com.srijan.motosports.features.models;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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
        TextView t1 = (TextView)getView().findViewById(R.id.text_title_tsi17se);
        TextView t2 = (TextView)getView().findViewById(R.id.t1);
    //    TextView t3 = (TextView)getView().findViewById(R.id.t2);
        TextView t4 = (TextView)getView().findViewById(R.id.t3);
      //  TextView t5 = (TextView)getView().findViewById(R.id.t4);
        TextView t7 = (TextView)getView().findViewById(R.id.t5);
       // TextView t8 = (TextView)getView().findViewById(R.id.t6);
        TextView t9 = (TextView)getView().findViewById(R.id.t7);
       // TextView t10 = (TextView)getView().findViewById(R.id.t8);
        TextView t11 = (TextView)getView().findViewById(R.id.t9);
       // TextView t12 = (TextView)getView().findViewById(R.id.t10);
        TextView t13 = (TextView)getView().findViewById(R.id.t11);
        Typeface face= Typeface.createFromAsset(getContext().getAssets(), "font/finalFont.ttf");
        t1.setTypeface(face);
        t2.setTypeface(face);
      //  t3.setTypeface(face);
        t4.setTypeface(face);
      //  t5.setTypeface(face);
        t7.setTypeface(face);
      //  t8.setTypeface(face);
        t9.setTypeface(face);
       // t10.setTypeface(face);
        t11.setTypeface(face);
      //  t12.setTypeface(face);
        t13.setTypeface(face);
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
