package com.srijan.motosports.features.spareparts;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;
import com.srijan.motosports.R;
import android.widget.ImageButton;

/**
 * Created by pari on 15-01-2017.
 */

public class ViewHolder_Child extends ViewHolder {
    TextView heading,details;
    ImageButton image;
    public ViewHolder_Child(View itemView) {
        super(itemView);
        heading = (TextView)itemView.findViewById(R.id.child_list_item_spare_parts_text_view);
        details = (TextView)itemView.findViewById(R.id.details);
        image = (ImageButton)itemView.findViewById(R.id.child_img);
    }

    public TextView getDetails() {
        return details;
    }

    public TextView getHeading() {
        return heading;
    }

    public void setDetails(TextView details) {
        this.details = details;
    }

    public void setHeading(TextView heading) {
        this.heading = heading;
    }

    public ImageButton getImage() {
        return image;
    }

    public void setImage(ImageButton image) {
        this.image = image;
    }
}
