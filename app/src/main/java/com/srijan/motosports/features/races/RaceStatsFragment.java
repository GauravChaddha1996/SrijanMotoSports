package com.srijan.motosports.features.races;

/**
 * Created by pari on 17-01-2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import com.srijan.motosports.R;
import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;
import android.util.Log;
public class RaceStatsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    public RaceStatsFragment() {
    // Required empty public constructor
}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        View v = inflater.inflate(R.layout.fragment_race_stats, container, false);
        ArrayList<RaceObject> items= new ArrayList<RaceObject>();
        recyclerView = (RecyclerView) v.findViewById(R.id.cvRaceStats);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        RaceObject raceObject;
        raceObject = new RaceObject("Car Name: SM0001","Driver: Tom","Fastest Lap Time: 10min","Number of Races: 2","Points: 100");
        /*raceObject.setCarName("Car Name: SM0001");
        raceObject.setDriver("Driver: Tom");
        raceObject.setFastestLapTime("Fastest Lap Time: 10min");
        raceObject.setNumRaces("Number of Races: 2");
        raceObject.setPoints("Points: 100");*/
        items.add(raceObject);
        RaceObject raceObject1 = new RaceObject("Car Name: SM0002","Driver: Harry","Fastest Lap Time: 12min","Number of Races: 3","Points: 200");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0002");
        raceObject.setDriver("Driver: Harry");
        raceObject.setFastestLapTime("Fastest Lap Time: 12min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 200");*/
        items.add(raceObject1);
        Log.v("secondItem",items.get(1).getCarName());
        RaceObject raceObject2 = new RaceObject("Car Name: SM0003","Driver: Louis","Fastest Lap Time: 13min","Number of Races: 3","Points: 150");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0003");
        raceObject.setDriver("Driver: Louis");
        raceObject.setFastestLapTime("Fastest Lap Time: 13min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 150");*/
        items.add(raceObject2);
        RaceObject raceObject3 = new RaceObject("Car Name: SM0004","Driver: Liam","Fastest Lap Time: 11min","Number of Races: 4","Points: 200");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0004");
        raceObject.setDriver("Driver: Liam");
        raceObject.setFastestLapTime("Fastest Lap Time: 11min");
        raceObject.setNumRaces("Number of Races: 4");
        raceObject.setPoints("Points: 200");*/
        items.add(raceObject3);
        RaceObject raceObject4 = new RaceObject("Car Name: SM0005","Driver: Niall","Fastest Lap Time: 12min","Number of Races: 3","Points: 200");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0005");
        raceObject.setDriver("Driver: Niall");
        raceObject.setFastestLapTime("Fastest Lap Time: 12min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 200");*/
        items.add(raceObject4);
        RaceObject raceObject5 = new RaceObject("Car Name: SM0006","Driver: Ryan","Fastest Lap Time: 12min","Number of Races: 2","Points: 400");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0006");
        raceObject.setDriver("Driver: Ryan");
        raceObject.setFastestLapTime("Fastest Lap Time: 12min");
        raceObject.setNumRaces("Number of Races: 2");
        raceObject.setPoints("Points: 400");*/
        items.add(raceObject5);
        RaceObject raceObject6 = new RaceObject("Car Name: SM0007","Driver: Ron","Fastest Lap Time: 13min","Number of Races: 3","Points: 300");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0007");
        raceObject.setDriver("Driver: Ron");
        raceObject.setFastestLapTime("Fastest Lap Time: 13min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 300");*/
        items.add(raceObject6);
        RaceObject raceObject7 = new RaceObject("Car Name: SM0008","Driver: Paul","Fastest Lap Time: 14min","Number of Races: 1","Points: 200");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0008");
        raceObject.setDriver("Driver: Paul");
        raceObject.setFastestLapTime("Fastest Lap Time: 14min");
        raceObject.setNumRaces("Number of Races: 1");
        raceObject.setPoints("Points: 200");*/
        items.add(raceObject7);
        RaceObject raceObject8 = new RaceObject("Car Name: SM0009","Driver: Justin","Fastest Lap Time: 12min","Number of Races: 3","Points: 300");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0009");
        raceObject.setDriver("Driver: Justin");
        raceObject.setFastestLapTime("Fastest Lap Time: 12min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 300");*/
        items.add(raceObject8);
        RaceObject raceObject9 = new RaceObject("Car Name: SM0010","Driver: Max","Fastest Lap Time: 10min","Number of Races: 3","Points: 500");
        /*raceObject = new RaceObject();
        raceObject.setCarName("Car Name: SM0010");
        raceObject.setDriver("Driver: Max");
        raceObject.setFastestLapTime("Fastest Lap Time: 10min");
        raceObject.setNumRaces("Number of Races: 3");
        raceObject.setPoints("Points: 500");*/
        items.add(raceObject9);
        adapter = new CardViewAdapter(items);
        recyclerView.setAdapter(adapter);
        return v;
    }
}
