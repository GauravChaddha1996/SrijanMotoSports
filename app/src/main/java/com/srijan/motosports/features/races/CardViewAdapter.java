package com.srijan.motosports.features.races;

/**
 * Created by pari on 18-01-2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import android.view.View;
import com.srijan.motosports.R;
import com.srijan.motosports.features.spareparts.ViewHolder_Parent;

import android.view.LayoutInflater;

public class CardViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<RaceObject> items=new ArrayList<RaceObject>();

    public CardViewAdapter(ArrayList<RaceObject> items)
    {
        this.items=items;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_race_stats, parent, false);

        RaceObjectHolder raceObjectHolder = new RaceObjectHolder(view);
        return raceObjectHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RaceObjectHolder vh1 = (RaceObjectHolder) holder;
        vh1.numRaces.setText(items.get(position).getNumRaces());
        vh1.carName.setText(items.get(position).getCarName());
        vh1.lapTime.setText(items.get(position).getFastestLapTime());
        vh1.driver.setText(items.get(position).getDriver());
        vh1.points.setText(items.get(position).getPoints());

    }

        @Override
    public int getItemCount() {
        return items.size();
    }
}
