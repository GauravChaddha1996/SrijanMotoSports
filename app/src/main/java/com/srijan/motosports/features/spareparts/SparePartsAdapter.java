package com.srijan.motosports.features.spareparts;

/**
 * Created by pari on 15-01-2017.
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AlertDialog;
import android.view.ViewGroup;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.content.DialogInterface;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import com.srijan.motosports.R;

public class SparePartsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Object> items;
    Context context;
    public SparePartsAdapter(Context context,List<Object> items) {
        this.items = items;
        this.context = context;
    }
    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof SparePartsItem) {
            return 1;
        } else if (items.get(position) instanceof SparePartsChildItem) {
            return 2;
        }
        return -1;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case 1:
                View v1 = inflater.inflate(R.layout.list_spare_parts_parent, viewGroup, false);
                viewHolder = new ViewHolder_Parent(v1);
                break;
            case 2:
                View v2 = inflater.inflate(R.layout.list_spare_parts_child, viewGroup, false);
                viewHolder = new ViewHolder_Child(v2);
                v2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = viewHolder.getPosition();
                        SparePartsChildItem sp = (SparePartsChildItem)items.get(position);
                        double price = sp.getPrice();
                        LayoutInflater li = LayoutInflater.from(context);
                        View promptsView = li.inflate(R.layout.quantity_prompt, null);

                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                context);

                        // set prompts.xml to alertdialog builder
                        alertDialogBuilder.setView(promptsView);

                        final EditText userInput = (EditText) promptsView
                                .findViewById(R.id.editTextDialogUserInput);

                        // set dialog message
                        alertDialogBuilder
                                .setCancelable(false)
                                .setPositiveButton("Get Cost",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                // get user input and set it to result
                                                // edit text
                                                LayoutInflater li = LayoutInflater.from(context);
                                                View promptsView = li.inflate(R.layout.price_prompt, null);

                                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                                        context);

                                                // set prompts.xml to alertdialog builder
                                                alertDialogBuilder.setView(promptsView);

                                                final TextView textView = (TextView) promptsView
                                                        .findViewById(R.id.textView_price);
                                                textView.setText("Total Cost : $"+Double.valueOf(price*Integer.parseInt(userInput.getText().toString())).toString());
                                                // set dialog message
                                                alertDialogBuilder
                                                        .setCancelable(false)
                                                        .setPositiveButton("Buy Now!",
                                                                new DialogInterface.OnClickListener() {
                                                                    public void onClick(DialogInterface dialog,int id) {
                                                                        // get user input and set it to result
                                                                        // edit text
                                                                        Toast toast = Toast.makeText(context,"Items Bought!", Toast.LENGTH_LONG);
                                                                        toast.show();
                                                                    }
                                                                })
                                                        .setNegativeButton("Cancel",
                                                                new DialogInterface.OnClickListener() {
                                                                    public void onClick(DialogInterface dialog,int id) {
                                                                        dialog.cancel();
                                                                    }
                                                                });

                                                // create alert dialog
                                                AlertDialog alertDialog = alertDialogBuilder.create();

                                                // show it
                                                alertDialog.show();

                                            }
                                        })
                                .setNegativeButton("Cancel",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                dialog.cancel();
                                            }
                                        });

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();


                    }
                });
                break;
            default:
                View v = inflater.inflate(R.layout.list_spare_parts_parent, viewGroup, false);
                viewHolder = new ViewHolder_Parent(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case 1:
                ViewHolder_Parent vh1 = (ViewHolder_Parent) viewHolder;
                configureViewHolder1(vh1, position);
                break;
            case 2:
                ViewHolder_Child vh2 = (ViewHolder_Child) viewHolder;
                configureViewHolder2(vh2, position);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }
    private BitmapDrawable resize(Drawable image)
    {
        //(int) (bitmap.getHeight() * 0.125)
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                120, 120, false);
        return new BitmapDrawable(context.getResources(), bitmapResized);
    }
    private void configureViewHolder1(ViewHolder_Parent vh1, int position) {
        SparePartsItem parent = (SparePartsItem) items.get(position);
        if (parent != null) {
            vh1.getName().setText(parent.name);
         //   vh1.setImageView().setText("Hometown: " + user.hometown);
            /*Bitmap bitmap = parent.image;
            BitmapDrawable ob = new BitmapDrawable(context.getResources(), bitmap);
            ob = resize(ob);
            vh1.getImageView().setImageDrawable(ob);*/
        }
    }

    private void configureViewHolder2(ViewHolder_Child vh2,int position) {
        SparePartsChildItem child = (SparePartsChildItem)items.get(position);
        if(child!=null)
        {
            vh2.getHeading().setText(child.heading);
            vh2.getDetails().setText(child.details);
            String image = child.image;
            String uri = "@drawable/"+image;
            Drawable res;
            int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
            Drawable ob = context.getResources().getDrawable(imageResource);
            Drawable ob2 = ob;
            ob = resize(ob);
            vh2.getImage().setImageDrawable(ob);
            vh2.getImage().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LayoutInflater li = LayoutInflater.from(context);
                    View promptsView = li.inflate(R.layout.image_prompt, null);

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set prompts.xml to alertdialog builder
                    alertDialogBuilder.setView(promptsView);
                    ImageView imageView = (ImageView)promptsView.findViewById(R.id.imageView2);
                    imageView.setImageDrawable(ob2);
                    // set dialog message
                    alertDialogBuilder
                            .setCancelable(false)
                            .setNegativeButton("Return",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,int id) {
                                            dialog.cancel();
                                        }
                                    });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();


                }
            });
        }
    }
}
