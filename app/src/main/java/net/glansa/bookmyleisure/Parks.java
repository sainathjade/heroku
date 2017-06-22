package net.glansa.bookmyleisure;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Glansa on 9/9/2016.
 */
public class Parks extends AppCompatActivity  {

    ListView lv;
    List<String> ids = new ArrayList<String>();
    ArrayAdapter<String> adp;
    String[] price
            = { "Necklace Road.", "Necklace Road." };
    String[] title={"Lumbini Park","NTR Gardens"};
    String[] id={"Boating, Children Play, Food courts...Children Play, Gaint wheal, Columbus...","Children Play, Gaint wheal, Columbus..."};
    String[] images;
    String[] des={"hi","hi"};
    Bitmap[] mg;
    Float[] rating={3.5f,1.5f};
    Integer[] imageId = { R.drawable.banner, R.drawable.banner1};
    List<String> l = new ArrayList<String>();
    List<String> l2 = new ArrayList<String>();
    List<String> l3 = new ArrayList<String>();
    List<Float> r = new ArrayList<Float>();
    List<String> des1 = new ArrayList<String>();
    ImgAd1 adapter;
    ArrayList<Bitmap> bitmapArray = new ArrayList<Bitmap>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
        ids.add("5");
        ids.add("6");
        adp=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ids);
//        adapter = new ImgAd1(this, title,imageId,price,rating,des);
        CustomListAdapter adapter=new CustomListAdapter(this,title,imageId);
        lv=(ListView)findViewById(R.id.listView2);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Slecteditem= title[+position];

                Toast.makeText(getApplicationContext(),  Slecteditem, Toast.LENGTH_LONG).show();
                // selected item
//                String product = ((TextView) view).getText().toString();

                // Launching new Activity on selecting single List Item
//                Intent i = new Intent(getApplicationContext(), SingleListItem.class);
                // sending data to new activity
//                i.putExtra("product", product);
//                startActivity(i);

            }
        });

    }
}
