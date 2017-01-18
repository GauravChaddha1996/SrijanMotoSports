package com.srijan.motosports.features.home.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.srijan.motosports.R;
import com.srijan.motosports.app.SrijanApplication;
import com.srijan.motosports.features.home.HomeActivity;
import com.srijan.motosports.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.R.attr.x;

public class HomeFragment extends Fragment {

    final long raceTime = 60 * 60 * 5;
    @BindView(R.id.imageSliderLayoutHomeFragment)
    SliderLayout imageSliderLayout;
    Subscription subscription;
    private ListView newsFeed;
    private ArrayAdapter<String> listAdapter ;

    public HomeFragment() {

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        newsFeed = (ListView) getView().findViewById(R.id.listview_newsfeed);
        String[] news = new String[]
                {"F1 2017 cars could be 40km/h faster in corners, claims FIA",
                        "Nice to name street after Bianchi",
                        "Renault has made a \"good step\" with F1 engine, says Newey",
                        "Lauda: Bottas will be just as fast as Rosberg",
                        "Time for Bottas to step up and prove himself, says Wolff",
                        "Bottas confident he can work with Hamilton",
                        "Rosberg accepts ambassadorial role at Mercedes",
                        "Mercedes confirms Bottas as Hamilton's teammate",
                        "Massa returns to F1 as Bottas replacement",
                        "McLaren has become the latest team to confirm the launch date of its 2017 Formula 1 car." +
                                " The Woking-based outfit will unveil its Honda-powered challenger on February 24, the same" +
                                " day that Ferrari will reveal its car in Italy.",
                        "Pascal Wehrlein will race with the Sauber Formula 1 team this year, the Swiss squad confirmed on Monday morning.",
                        "The FIA has simulated Fernando Alonso's dramatic 2016 crash in Australia with the halo as part of its analysis of" +
                                " the Formula 1 cockpit protection device.",
                        "Extensive testing of the halo both on- and off-track was completed in the second-half of last year," +
                                " with all drivers testing the device and giving their feedback to the FIA.",
                        "Formula 1 driver-turned-top-TV expert Martin Brundle believes Valtteri Bottas will rise to the challenge" +
                                " of replacing Nico Rosberg at Mercedes in 2017 – but wonders if the world champion’s shock retirement" +
                                " might leave lasting damage at the team.",
                        "Renault is to introduce a second generation Energy Recovery System (ERS) this year as part of a radical overhaul" +
                                " of its Formula 1 power unit.",
                        "Derek Warwick says Silverstone is in talks with the government regarding securing the future of the Formula 1" +
                                " British Grand Prix.",
                        "The Manor F1 team's hopes of competing in the Formula 1 season opener in Australia are fading, with sources" +
                                " indicating that the outfit has a week left to find a buyer.",
                        "Formula 1 supremo Bernie Ecclestone believes that 2017's new aero rules will not be enough to end Mercedes'" +
                                " domination of the sport, as he renews call to scrap hybrid engines.",
                        "Formula 1 intrigue over high-tech suspension systems pioneered by Mercedes has been around for several years," +
                                " but the trigger for the latest row over what is and isn't allowed can be traced back to the Abu Dhabi Grand Prix.",
                        "Force India announced on Thursday it will launch its 2017 Formula 1 car at the Silverstone circuit on February 22nd.",
                        "Leading Formula 1 teams could be forced to revise their suspension systems on the eve of the 2017 season amid a row brewing" +
                                " following a Ferrari query over trick technology that Mercedes has pioneered.",
                        "Former DTM racer and Williams F1 test driver Susie Wolff has been awarded with the MBE for services to women" +
                                " in sport in the British New Year Honours list.",
                        "In sixth place in our top 20 countdown, a collision between Mercedes teammates paves the way for Max Verstappen's maiden" +
                                " grand prix win, just a few days on from Red Bull's decision to give him Daniil Kvyat's seat.",
                        "Marciello gives up on F1 hopes amid \"stupid\" money demands. Former Ferrari junior Raffaele Marciello" +
                                " admits Formula 1 has become an unachievable goal due to budget requirements, as he looks set to " +
                                "call time on his junior single-seater career."
                };
        ArrayList<String> newsList = new ArrayList<String>();
        newsList.addAll( Arrays.asList(news) );
        listAdapter = new ArrayAdapter<String>(getContext(), R.layout.listitem_newsfeed, newsList);
        newsFeed.setAdapter(listAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Srijan Motosports");
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        setImageSlider();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        imageSliderLayout.startAutoCycle();
    }

    @Override
    public void onStop() {
        imageSliderLayout.stopAutoCycle();
        super.onStop();
    }

    @OnClick(R.id.textView_HomeFragment_CallYourRaceEngineer)
    void clickCallRaceEngineer() {
        Toast.makeText(getActivity(),"Calling your Race Engineer",Toast.LENGTH_SHORT).show();
    }

    private void setImageSlider() {
        int resId;
        for (int i = 1; i <= 8; i++) {
            resId = getActivity().getResources().getIdentifier("wallpaper" + i, "drawable",
                    getActivity().getPackageName());
            DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
            defaultSliderView.image(resId);
            imageSliderLayout.addSlider(defaultSliderView);
        }
        imageSliderLayout.setPresetTransformer(SliderLayout.Transformer.ZoomOut);
    }

}
