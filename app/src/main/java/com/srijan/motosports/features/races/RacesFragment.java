package com.srijan.motosports.features.races;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.srijan.motosports.R;
import com.srijan.motosports.app.SrijanApplication;
import com.srijan.motosports.features.home.HomeActivity;
import com.srijan.motosports.utils.Utils;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * A simple {@link Fragment} subclass.
 */
public class RacesFragment extends Fragment {

    Subscription subscription;
    TextView nextRaceTimer;
    final long raceTime = 60 * 60 * 5;
    public RacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_races, container, false);
        Button enterRace = (Button)v.findViewById(R.id.enterRace);
        Button raceStats = (Button)v.findViewById(R.id.raceStats);
        nextRaceTimer = (TextView)v.findViewById(R.id.timer);
        Context context = getContext();
        enterRace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.enter_race_prompt, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);
                // set dialog message
                alertDialogBuilder.setView(promptsView);
                /*alertDialogBuilder
                        .setCancelable(false)
                        .setNegativeButton("Return",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
*/
                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });
        raceStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RaceStatsFragment fragment = new RaceStatsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout_home, fragment);
                fragmentTransaction.addToBackStack(null);
                ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Race Stats");
                fragmentTransaction.commit();
            }
        });
        return v;
    }
    @Override
    public void onStart()
    {
        super.onStart();
        listenToRaceTimer();
    }
    @Override
    public void onStop() {
        subscription.unsubscribe();
        super.onStop();
    }
    private void listenToRaceTimer() {
        subscription = SrijanApplication.getRaceTimerObservable()
                .map(aLong -> raceTime - aLong)
                .map(Utils::splitToComponentTimes)
                .map(ints -> ints[0] + " Hrs " + ints[1] + " Min " + ints[2] + " Sec")
                .map(s -> getString(R.string.home_fragment_next_race) +" "+ s)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.immediate())
                .subscribe(s -> nextRaceTimer.setText(s), Throwable::printStackTrace);
    }
}
