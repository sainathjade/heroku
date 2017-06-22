package net.glansa.bookmyleisure;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Glansa on 9/1/2016.
 */
public class Quickpay extends AppCompatActivity {
    TextView total;
    String[] gridViewString = {
            "Parks", "Amusements", "Historical", "Museums", "Events", "Exhibitions",


    };
    ListView ls;
    List<String> l=new ArrayList<String>();
    ArrayAdapter<String> adp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quickpay);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Bundle extras = getIntent().getExtras();
//        Intent intent = getIntent();
        Double id = extras.getDouble("total");
        total=(TextView)findViewById(R.id.textView37);
        ls=(ListView)findViewById(R.id.listView4);
        total.setText(getResources().getString(R.string.Rs) + id.toString());

//        adp=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_activated_1,l);
        adp = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, l) {

            @Override
            public View getView(int position, View convertView,
                                ViewGroup parent) {

                View view = super
                        .getView(position, convertView, parent);
                TextView text = (TextView) view
                        .findViewById(android.R.id.text1);

                // if (flag == True) {
                text.setTextColor(Color.BLACK);
                // }

                return view;
            }
        };
        l.add("Paypal");
        l.add("Paytm");
        l.add("DebitCard");
        ls.setAdapter(adp);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

//                itemValue = (String) lv.getItemAtPosition(arg2);
//                item = ids.get(arg2);
//                // Log.e("Id11", item);
                // int id1 = lv.getId();

                Intent intent = new Intent(Quickpay.this, Ticket.class);
//                intent.putExtra("message", itemValue);
//                SharedPreferences sp = getSharedPreferences(MY_PREF, 0);
//                SharedPreferences.Editor edit = sp.edit();
//
//                edit.putString("categid", item);
//                edit.putString("categname", itemValue);
//                edit.putString("activity", "mainactivity");
//                // Log.e("Id11", id);
//
//                edit.commit();
//                // Log.e("long", itemValue);
                startActivity(intent);
                // finish();

                // new SubMenu().execute();
                // Show Alert
                // Toast.makeText(getApplicationContext(), itemValue,
                // Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        // SearchManager searchManager = (SearchManager)
        // getSystemService(Context.SEARCH_SERVICE);
        // SearchView searchView = (SearchView)
        // menu.findItem(R.id.action_search)
        // .getActionView();
        // searchView.setSearchableInfo(searchManager
        // .getSearchableInfo(getComponentName()));
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

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
