package net.glansa.bookmyleisure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belal on 2/3/2016.
 */

public class Main extends AppCompatActivity {
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
            R.drawable.park, R.drawable.amusements, R.drawable.historical, R.drawable.musemus, R.drawable.events, R.drawable.exbition,


    };
    String[] colors = {"#b8207a","#83b35d","#dfae46","#4c87bd","#b92746","#515151"};
    String itemValue,itemid;

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.tab1, container, false);
//        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(this, gridViewString, gridViewImageId,colors);
//        androidGridView = (GridView) view.findViewById(R.id.gridView);
//        androidGridView.setAdapter(adapterViewAndroid);
//        ids.add("1");
//        ids.add("2");
//        ids.add("3");
//        ids.add("4");
//        ids.add("5");
//        ids.add("6");
//        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int i, long id) {
//
////                itemValue = (String) androidGridView.getItemAtPosition(i);
//                itemValue=gridViewString[i];
//                itemid = ids.get(i);
//                Log.e("id", itemValue);
////                if(i==1) {
//                Intent in = new Intent(Main.this, Category.class);
//                in.putExtra("id",itemid);
//                in.putExtra("name",itemValue);
//                startActivity(in);
////                }
//
////                Toast.makeText(getActivity(), "GridView Item: " + gridViewString[i], Toast.LENGTH_LONG).show();
//            }
//        });
//
//        return view;
////        return inflater.inflate(R.layout.tab2, container, false);
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);
       // CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(this, gridViewString, gridViewImageId,colors);
        androidGridView = (GridView) findViewById(R.id.gridView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        androidGridView.setAdapter(adapterViewAndroid);
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

//                itemValue = (String) androidGridView.getItemAtPosition(i);
                itemValue = gridViewString[i];
                itemid = ids.get(i);
                Log.e("id", itemValue);
//                if(i==1) {
                Intent in = new Intent(Main.this, Category.class);
                in.putExtra("id", itemid);
                in.putExtra("name", itemValue);
                startActivity(in);
//                }

//                Toast.makeText(getActivity(), "GridView Item: " + gridViewString[i], Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.share);
//		MenuItem item1 = menu.findItem(R.id.search);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
//
            case android.R.id.home:
                super.onBackPressed();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
