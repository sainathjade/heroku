package net.glansa.bookmyleisure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    private final Context context;
    public TextView countryName;
    public ImageView countryPhoto;
    String itemid;
    List<String> ids = new ArrayList<String>();
    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
//        countryName = (TextView)itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView)itemView.findViewById(R.id.android_gridview_image);
        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
        ids.add("5");
        ids.add("6");
        context = itemView.getContext();
    }

    @Override
    public void onClick(View view) {

        Intent in = new Intent(context, Category.class);
                in.putExtra("id",itemid);
//                in.putExtra("name",itemValue);
                    context.startActivity(in);
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}