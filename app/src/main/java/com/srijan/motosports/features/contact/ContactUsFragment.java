package com.srijan.motosports.features.contact;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srijan.motosports.R;

/**
 * Created by pari on 20-01-2017.
 */

public class ContactUsFragment extends Fragment {
    public ContactUsFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        View vv = inflater.inflate(R.layout.fragment_contact_us, container, false);
        TextView t1 = (TextView)vv.findViewById(R.id.textView6);
        TextView t2 = (TextView)vv.findViewById(R.id.textView7);
        TextView t3 = (TextView)vv.findViewById(R.id.textView8);
        TextView t4 = (TextView)vv.findViewById(R.id.textView9);
        TextView t5 = (TextView)vv.findViewById(R.id.textView10);
        TextView t6 = (TextView)vv.findViewById(R.id.textView11);
        TextView t7 = (TextView)vv.findViewById(R.id.textView12);
        TextView t8 = (TextView)vv.findViewById(R.id.textView13);

        Typeface face= Typeface.createFromAsset(getContext().getAssets(), "font/finalFont.ttf");
        t1.setTypeface(face);
        t2.setTypeface(face);
        t3.setTypeface(face);
        t4.setTypeface(face);
        t5.setTypeface(face);
        t6.setTypeface(face);
        t7.setTypeface(face);
        t8.setTypeface(face);
        return vv;
    }
}
