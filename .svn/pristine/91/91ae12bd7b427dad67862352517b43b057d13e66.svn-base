package net.glansa.bookmyleisure;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


//Implementing the interface OnTabSelectedListener to our MainActivity
//This interface would help in swiping views
public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener,SearchView.OnQueryTextListener{

    //This is our tablayout
    private TabLayout tabLayout;
    TextView date;

    //This is our viewPager
    private ViewPager viewPager;
    private SearchView searchView = null;
    private SearchView.OnQueryTextListener queryTextListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        date=(TextView)findViewById(R.id.textView50);
//        tabLayout.setupWithViewPager(viewPager);
        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("NEWS").setIcon(R.mipmap.news));
        tabLayout.addTab(tabLayout.newTab().setText("EXPLORE").setIcon(R.mipmap.explore));
        tabLayout.addTab(tabLayout.newTab().setText("OFFERS").setIcon(R.mipmap.offer));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//        handleIntent(getIntent());
        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

//        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        Calendar c = Calendar.getInstance();
//        System.out.println("Current time => "+c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = df.format(c.getTime());
        // formattedDate have current date/time
//        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();


        // Now we display formattedDate value in TextView
//        TextView txtView = new TextView(this);
        date.setText(formattedDate);



        //Adding adapter to pager
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this);
//        viewPager.setCurrentItem(tabLayout.getPosition());

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
//        tabLayout.getTabAt(position).select();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.share);
//		MenuItem item1 = menu.findItem(R.id.search);
        item.setVisible(false);
        MenuItem searchItem = menu.findItem(R.id.search);

//
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(this);
//

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
            case R.id.search:

                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }



//    @Override
//    protected void onNewIntent(Intent intent) {
//        handleIntent(intent);
//    }
//
//    private void handleIntent(Intent intent) {
//
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//            Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG).show();
//            //use the query to search
//        }
//    }

    @Override
    public boolean onQueryTextSubmit(String query) {
//        Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG).show();
        Intent i=new Intent(MainActivity.this,Search.class);
        i.putExtra("id",query);
        startActivity(i);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
