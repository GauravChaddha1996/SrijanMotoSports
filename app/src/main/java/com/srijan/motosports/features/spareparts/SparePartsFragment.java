package com.srijan.motosports.features.spareparts;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srijan.motosports.R;
import com.srijan.motosports.features.home.HomeActivity;

import java.util.List;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SparePartsFragment extends Fragment {


    public SparePartsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View sparePartsView = inflater.inflate(R.layout.fragment_spare_parts, container, false);
        RecyclerView rvItems = (RecyclerView)sparePartsView.findViewById(R.id.rvItems);

        List<Object> sparePartsItems = new ArrayList<Object>() ;
        SparePartsItem spItem[] = new SparePartsItem[4];
        String images[] = new String[4];
        SparePartsChildItem spChild[] = new SparePartsChildItem[4];
        /*images[0] = BitmapFactory.decodeResource(getResources(), R.drawable.wheel_0);
        images[1] = BitmapFactory.decodeResource(getResources(), R.drawable.wheel_1);
        images[2] = BitmapFactory.decodeResource(getResources(), R.drawable.wheel_2);*/
        images[0] = "wheel_0";
        images[1]="wheel_1";
        images[2]="wheel_2";
        images[3]="wheel_3";
        spChild[0] = new SparePartsChildItem("Hiper Racing","(Carbon Plastic CFI),Lower,10inch,$37.5",37.5,images[0]);
        spChild[1] = new SparePartsChildItem("Keizer","Standard,10inch,$77.5",77.5,images[1]);
        spChild[2] = new SparePartsChildItem("O.Z.","Higher,10inch,$150",150,images[2]);
        spChild[3] = new SparePartsChildItem("DWT (Al , 001-05)","10inch,$63",63,images[3]);
        ArrayList<SparePartsChildItem> spChildItems = new ArrayList<SparePartsChildItem>();
        spChildItems.add(spChild[0]);
        spChildItems.add(spChild[1]);
        spChildItems.add(spChild[2]);
        spChildItems.add(spChild[3]);
        spItem[0]=new SparePartsItem("Wheel",3,spChildItems);
        sparePartsItems.add(spItem[0]);
        sparePartsItems.add(spChild[0]);
        sparePartsItems.add(spChild[1]);
        sparePartsItems.add(spChild[2]);
        sparePartsItems.add(spChild[3]);
     //   image = BitmapFactory.decodeResource(getResources(), R.drawable.exhaust);
        ArrayList<SparePartsChildItem> spChildItems2 = new ArrayList<SparePartsChildItem>();
        /*images[0] = BitmapFactory.decodeResource(getResources(), R.drawable.exhaust_0);
        images[1] = BitmapFactory.decodeResource(getResources(), R.drawable.exhaust_1);*/
        images[0] = "exhaust_0";
        images[1] = "exhaust_1";
        spChild[0] = new SparePartsChildItem("DB Killer Exhaust","Lower,$100",100,images[0]);
        spChild[1] = new SparePartsChildItem("Higher","Carbon Fiber coated premium exhaust,$150",150,images[1]);
        spChildItems2.add(spChild[0]);
        spChildItems2.add(spChild[1]);
        spItem[1]=new SparePartsItem("Exhaust",2,spChildItems2);
        sparePartsItems.add(spItem[1]);
        sparePartsItems.add(spChild[0]);
        sparePartsItems.add(spChild[1]);
      //  image = BitmapFactory.decodeResource(getResources(), R.drawable.ecu);
        /*images[0] = BitmapFactory.decodeResource(getResources(), R.drawable.ecu_0);
        images[1] = BitmapFactory.decodeResource(getResources(), R.drawable.ecu_1);
        images[2] = BitmapFactory.decodeResource(getResources(), R.drawable.img_na);*/
        images[0]="ecu_0";
        images[1]="ecu_1";
        images[2]="ecu_2";
        spChild[0] = new SparePartsChildItem("Stock ECU","Lower,$153",153,images[0]);
        spChild[1] = new SparePartsChildItem("Race Dynamics ECU with GFRP","Standard,$275",275,images[1]);
        spChild[2] = new SparePartsChildItem("Race Dynamics ECU with CFRP","Higher,$350",350,image);

        ArrayList<SparePartsChildItem> spChildItems3 = new ArrayList<SparePartsChildItem>();
        spChildItems3.add(spChild[0]);
        spChildItems3.add(spChild[1]);
        spChildItems3.add(spChild[2]);
        spItem[2]=new SparePartsItem("ECU",3,spChildItems3);
        sparePartsItems.add(spItem[2]);
        sparePartsItems.add(spChild[0]);
        sparePartsItems.add(spChild[1]);
        sparePartsItems.add(spChild[2]);
      //  image = BitmapFactory.decodeResource(getResources(), R.drawable.damper);
        /*images[0] = BitmapFactory.decodeResource(getResources(), R.drawable.img_na);
        images[1] = BitmapFactory.decodeResource(getResources(), R.drawable.img_na);
        images[2] = BitmapFactory.decodeResource(getResources(), R.drawable.img_na);
        images[3] = BitmapFactory.decodeResource(getResources(), R.drawable.img_na);*/
        images[0]="damper_0";
        images[1]="damper_1";
        images[2]="damper_2";
        images[3]="damper_3";
        spChild[0] = new SparePartsChildItem("Fox DHX 5.0","Lower,$210",210,images[0]);
        spChild[1] = new SparePartsChildItem("Ohlins TTX 25","Standard,$450",450,images[1]);
        spChild[2] = new SparePartsChildItem("Ohlins TTX 36","Higher,$500",500,images[2]);
        spChild[3] = new SparePartsChildItem("Quantum (Two zroo)","Two Way adjustable,$325",325,images[3]);
        ArrayList<SparePartsChildItem> spChildItems4 = new ArrayList<SparePartsChildItem>();
        spChildItems4.add(spChild[0]);
        spChildItems4.add(spChild[1]);
        spChildItems4.add(spChild[2]);
        spChildItems4.add(spChild[3]);
        spItem[3]=new SparePartsItem("Damper",4,spChildItems4);
        sparePartsItems.add(spItem[3]);
        sparePartsItems.add(spChild[0]);
        sparePartsItems.add(spChild[1]);
        sparePartsItems.add(spChild[2]);
        sparePartsItems.add(spChild[3]);



        SparePartsAdapter sparePartsAdapter = new SparePartsAdapter(getContext(),sparePartsItems);
        rvItems.setLayoutManager(new LinearLayoutManager(getContext()));
        rvItems.setAdapter(sparePartsAdapter);
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Spare parts");
        return inflater.inflate(R.layout.fragment_spare_parts, container,false);
    }

}
