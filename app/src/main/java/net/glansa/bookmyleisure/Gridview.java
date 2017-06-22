package net.glansa.bookmyleisure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Gridview extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",


    } ;
    int[] gridViewImageId = {
            R.drawable.search, R.drawable.search, R.drawable.search, R.drawable.search, R.drawable.search, R.drawable.search,


    };
    String[] colors = {"#b8207a","#83b35d","#dfae46","#4c87bd","#b92746","#515151"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

        CGV adapterViewAndroid = new CGV(Gridview.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.gridView);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                if(i==1)
                {
                    Intent in =new Intent(Gridview.this,Category.class);
                    startActivity(in);
                }
                Toast.makeText(Gridview.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}