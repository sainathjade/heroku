package net.glansa.bookmyleisure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Glansa on 9/16/2016.
 */
public class Maps extends AppCompatActivity implements OnMapReadyCallback
       {
    GoogleMap map;
    String title;
MarkerOptions marker;

    Double latitude, longitude;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);


        Intent intent = getIntent();
//        Bitmap img=(Bitmap) intent.getParcelableExtra("img");
        latitude = intent.getExtras().getDouble("latitude");
        longitude = intent.getExtras().getDouble("longitude");
        title = intent.getExtras().getString("title");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMap();
//        map = getMapFragment().getMap();
//        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
//                .getMap();
//        map= ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//        map = ((SupportMapFragment) android.support.v4.app.Fragment.getChildFragmentManager().findFragmentById(R.id.map)).getMap();
//         map = getMapFragment().getMap();
//        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        setUpMapIfNeeded();


    }
           private  void setUpMapIfNeeded()
           {
               if(map==null)
               {
                   map= ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
                   if(map != null)
                   {
                       setUpMap();
                   }
               }
           }
           private  void setUpMap()
           {
               LatLng lang = new LatLng(latitude, longitude);
               marker = new MarkerOptions().position(lang).title(title);
               // marker;
//        marker.icon(BitmapDescriptorFactory
//                .fromResource(R.drawable.historical));
               //
               // marker.title(Name);
               map.moveCamera(CameraUpdateFactory.newLatLng(lang));
               map.animateCamera(CameraUpdateFactory.zoomTo(15));
               map.getUiSettings().setZoomControlsEnabled(true);
               map.addMarker(marker);
           }
           @Override
           public void onMapReady(GoogleMap googleMap) {

           }
//           private MapFragment getMapFragment() {
//               FragmentManager fm = null;
//
//
//
//               if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//
//                   fm = getFragmentManager();
//               } else {
//
////                   fm = getChildFragmentManager();
//               }
//
//               return (MapFragment) fm.findFragmentById(R.id.map);
//           }
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    MenuItem item = menu.findItem(R.id.share);
    MenuItem item1 = menu.findItem(R.id.search);
//		MenuItem item1 = menu.findItem(R.id.search);
    item.setVisible(false);
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
