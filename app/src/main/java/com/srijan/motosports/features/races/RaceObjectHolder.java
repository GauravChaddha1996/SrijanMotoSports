package com.srijan.motosports.features.races;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.srijan.motosports.R;

/**
 * Created by pari on 18-01-2017.
 */

    public class RaceObjectHolder extends RecyclerView.ViewHolder {
        TextView carName,numRaces,driver,points,lapTime;
        public RaceObjectHolder(View v)
        {
            super(v);
            carName = (TextView)v.findViewById(R.id.carName);
            numRaces = (TextView)v.findViewById(R.id.numRaces);
            driver = (TextView)v.findViewById(R.id.driver);
            points = (TextView)v.findViewById(R.id.points);
            lapTime = (TextView)v.findViewById(R.id.lapTime);
        }
    }

