package com.srijan.motosports.features.spareparts;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.srijan.motosports.R;

/**
 * Created by pari on 15-01-2017.
 */

public class ViewHolder_Parent extends ViewHolder {
    private TextView name;
   // private ImageView imageView;
    public ViewHolder_Parent(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.parent_list_item_spare_parts_text_view);
      //  imageView = (ImageView)itemView.findViewById(R.id.parent_list_item_spare_parts_image_view);
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    /*public ImageView getImageView() {
        return imageView;
    }*/

   /* public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }*/
}
