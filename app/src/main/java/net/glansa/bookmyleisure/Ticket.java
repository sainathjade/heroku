package net.glansa.bookmyleisure;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Glansa on 10/14/2016.
 */
public class Ticket extends AppCompatActivity {
    TextView adults,childrens,total2,time,finaltotal,tt,total,date;
    SharedPreferences sp;
    public static final String MY_PREF = "MyPreferences";
    String adults1,childrens1,total1,time1,quantity1,tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        adults=(TextView)findViewById(R.id.textView2);
        time=(TextView)findViewById(R.id.textView20);
        date=(TextView)findViewById(R.id.textView38);
        tt=(TextView)findViewById(R.id.textView34);
        finaltotal=(TextView)findViewById(R.id.textView46);
        finaltotal=(TextView)findViewById(R.id.textView46);
        childrens=(TextView)findViewById(R.id.textView24);
        total=(TextView)findViewById(R.id.textView);
        total2=(TextView)findViewById(R.id.textView44);
        sp = getSharedPreferences(MY_PREF, 0);
         adults1 = sp.getString("adults", "");
         childrens1 = sp.getString("childs", "");
        time1 = sp.getString("time", "");
         total1 = sp.getString("total", "");
        quantity1 = sp.getString("total", "");
        tt1 = sp.getString("tt", "");
        adults.setText("Adults : "+adults1);
        childrens.setText("Children : "+childrens1);
        total.setText("Ticket: Rs."+total1);
        total2.setText("Ticket Amount: Rs."+total1+  "+");
        time.setText(time1);
        tt.setText("Quantity: "+tt1);
        Double f=Double.valueOf(total1);
        f=f+13.38+2+17.24;
        finaltotal.setText("Rs."+f.toString());
        Calendar c = Calendar.getInstance();
//        System.out.println("Current time => "+c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        // formattedDate have current date/time
//        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();


        // Now we display formattedDate value in TextView
//        TextView txtView = new TextView(this);
        date.setText(formattedDate);
//        txtView.setGravity(Gravity.CENTER);
//        txtView.setTextSize(20);
//        setContentView(txtView);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
//        MenuItem item = menu.findItem(R.id.share);
        MenuItem item1 = menu.findItem(R.id.search);
//		MenuItem item1 = menu.findItem(R.id.search);
//        item.setVisible(false);
        item1.setVisible(false);
//		item1.setVisible(false);
//		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//		searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//		searchView.setSearchableInfo(searchManager
//				.getSearchableInfo(getComponentName()));
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
