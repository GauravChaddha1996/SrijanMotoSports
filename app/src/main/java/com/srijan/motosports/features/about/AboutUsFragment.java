package com.srijan.motosports.features.about;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.srijan.motosports.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {


    public AboutUsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        View vv = inflater.inflate(R.layout.fragment_about_us, container, false);
        TextView t1 = (TextView)vv.findViewById(R.id.text_about_title);
        TextView t2 = (TextView)vv.findViewById(R.id.text_about_subtitle);
        TextView t7 = (TextView)vv.findViewById(R.id.text_about_formula_challenge_title);
        Typeface face= Typeface.createFromAsset(getContext().getAssets(), "font/finalFont.ttf");
        t1.setTypeface(face);
        t2.setTypeface(face);
        t7.setTypeface(face);
        return vv;
    }

}
