package com.srijan.motosports.features.cookyourcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.srijan.motosports.R;
import com.srijan.motosports.database.models.CookYouCarItemChild;
import com.srijan.motosports.database.models.CookYourCarItem;
import com.thoughtbot.expandablecheckrecyclerview.CheckableChildRecyclerViewAdapter;
import com.thoughtbot.expandablecheckrecyclerview.models.CheckedExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class CookYourCarAdapter extends CheckableChildRecyclerViewAdapter<CookYourCarParentViewHolder, CookYourCarChildViewHolder> {

    LayoutInflater inflater;

    public CookYourCarAdapter(Context context, List<? extends CheckedExpandableGroup> groups) {
        super(groups);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CookYourCarChildViewHolder onCreateCheckChildViewHolder(ViewGroup parent, int viewType) {
        return new CookYourCarChildViewHolder(inflater.inflate(R.layout.cook_your_car_item_child, parent, false));
    }

    @Override
    public void onBindCheckChildViewHolder(CookYourCarChildViewHolder holder, int flatPosition, CheckedExpandableGroup group, int childIndex) {
        CookYouCarItemChild itemChild = (CookYouCarItemChild) group.getItems().get(childIndex);
        holder.childTitle.setText(itemChild.getTitle());
        holder.childCost.setText("$" + itemChild.getCost());
        holder.childDescription.setText(itemChild.getDescription());
    }

    @Override
    public CookYourCarParentViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        return new CookYourCarParentViewHolder(inflater.inflate(R.layout.cook_your_car_item_parent, parent, false));
    }

    @Override
    public void onBindGroupViewHolder(CookYourCarParentViewHolder holder, int flatPosition, ExpandableGroup group) {
        CookYourCarItem item = (CookYourCarItem) group;
        holder.parentTitle.setText(item.getTitle());
        ((CookYourCarItem) group).checkChild(0);
    }
}
