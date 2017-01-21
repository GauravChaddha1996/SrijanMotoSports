package com.srijan.motosports.features.cookyourcar;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.srijan.motosports.R;
import com.thoughtbot.expandablecheckrecyclerview.viewholders.CheckableChildViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class CookYourCarChildViewHolder extends CheckableChildViewHolder {

    @BindView(R.id.child_title)
    CheckedTextView childTitle;
    @BindView(R.id.child_description)
    TextView childDescription;
    @BindView(R.id.child_cost)
    TextView childCost;

    public CookYourCarChildViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    @Override
    public Checkable getCheckable() {
        return childTitle;
    }
}
