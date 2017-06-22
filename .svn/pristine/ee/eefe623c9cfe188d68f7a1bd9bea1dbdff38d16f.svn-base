package net.glansa.bookmyleisure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belal on 2/3/2016.
 */

public class Tab3 extends Fragment {
    ListView androidGridView;

    String[] gridViewString = {
            "metro Card Recharge\n" +
                    "Flat Rs. 25 Cashback", "Electricity & Water Bill Payment\n" +
            "Upto Rs. 300 Cashback", "Recharge & Bill Payment\n"
//            "Win 1 Lakh Cashback","DTH Recharge\n" +
//            "Win Free Movie Tickets For a Year"

    };
    //    String[] ids = {
//            "1", "2", "3", "4", "5", "6",
//
//
//    };
    List<String> ids = new ArrayList<String>();
    int[] gridViewImageId = {
            R.drawable.metro, R.drawable.billpay, R.drawable.lak

    };
//    String[] colors = {"#b8207a","#83b35d","#dfae46","#4c87bd","#b92746","#515151"};
    String itemValue,itemid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab3, container, false);
        CustomGridViewActivity1 adapterViewAndroid = new CustomGridViewActivity1(getActivity(), gridViewString, gridViewImageId);
        androidGridView = (ListView) view.findViewById(R.id.listView3);
        androidGridView.setAdapter(adapterViewAndroid);
        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
//        ids.add("5");
//        ids.add("6");
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {

//                itemValue = (String) androidGridView.getItemAtPosition(i);
//                itemValue=gridViewString[i];
//                itemid = ids.get(i);
//                Log.e("id", itemValue);
////                if(i==1) {
//                Intent in = new Intent(getActivity(), Category.class);
//                in.putExtra("id",itemid);
//                in.putExtra("name",itemValue);
//                startActivity(in);
//                }

//                Toast.makeText(getActivity(), "GridView Item: " + gridViewString[i], Toast.LENGTH_LONG).show();
            }
        });

        return view;
//        return inflater.inflate(R.layout.tab2, container, false);

    }
}
