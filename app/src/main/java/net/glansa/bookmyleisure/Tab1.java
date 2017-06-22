package net.glansa.bookmyleisure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belal on 2/3/2016.
 */

public class Tab1 extends Fragment {
    GridView androidGridView;

    String[] gridViewString = {
            "Parks", "Amusements", "Historical", "Museums", "Events", "Exhibitions",


    };
//    String[] ids = {
//            "1", "2", "3", "4", "5", "6",
//
//
//    };
    List<String> ids = new ArrayList<String>();
    int[] gridViewImageId = {
            R.drawable.p, R.drawable.a, R.drawable.h, R.drawable.m, R.drawable.e, R.drawable.ex,


    };
    String[] colors = {"#b8207a","#83b35d","#dfae46","#4c87bd","#b92746","#515151"};
    String itemValue,itemid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1, container, false);
        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(getActivity(), gridViewImageId);
        androidGridView = (GridView) view.findViewById(R.id.gridView);
        androidGridView.setAdapter(adapterViewAndroid);
        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
        ids.add("5");
        ids.add("6");
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {

                itemValue = (String) androidGridView.getItemAtPosition(i);
                itemValue=gridViewString[i];
                itemid = ids.get(i);
                Log.e("id", itemValue);
//                if(i==1) {
                    Intent in = new Intent(getActivity(), Category.class);
                in.putExtra("id",itemid);
                in.putExtra("name",itemValue);
                    startActivity(in);
//                }

//                Toast.makeText(getActivity(), "GridView Item: " + gridViewString[i], Toast.LENGTH_LONG).show();
            }
        });

        return view;
//        return inflater.inflate(R.layout.tab2, container, false);

    }

}
