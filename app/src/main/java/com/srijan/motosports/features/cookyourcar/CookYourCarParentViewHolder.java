package com.srijan.motosports.features.cookyourcar;

import android.graphics.Typeface;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.srijan.motosports.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class CookYourCarParentViewHolder extends GroupViewHolder{

    @BindView(R.id.parent_title)
    TextView parentTitle;
    @BindView(R.id.parent_expand_arrow)
    ImageView parentExpandArrow;

    public CookYourCarParentViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }

    @Override
    public void expand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        parentExpandArrow.setAnimation(rotate);
    }

    @Override
    public void collapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        parentExpandArrow.setAnimation(rotate);
    }
}
