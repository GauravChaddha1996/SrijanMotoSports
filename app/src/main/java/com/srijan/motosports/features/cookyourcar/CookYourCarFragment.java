package com.srijan.motosports.features.cookyourcar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srijan.motosports.R;
import com.srijan.motosports.database.DataManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CookYourCarFragment extends Fragment {

    @BindView(R.id.recyclerViewCookYourCar)
    RecyclerView recyclerView;

    public CookYourCarFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cook_your_car, container, false);
        ButterKnife.bind(this, view);
        setUpRecyclerView();
        return view;
    }

    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        CookYourCarAdapter cookYourCarAdapter = new CookYourCarAdapter(getActivity(),
                DataManager.getDataManager().getCookYourCarItems());
        recyclerView.setAdapter(cookYourCarAdapter);
    }

}
