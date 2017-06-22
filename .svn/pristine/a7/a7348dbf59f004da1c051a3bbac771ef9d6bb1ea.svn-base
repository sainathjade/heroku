package net.glansa.bookmyleisure;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Description extends AppCompatActivity  {

    Button book,buttonmap;
    ImageView image1;
    ConnectionDetector cd;
    Double latitude, longitude;
    Boolean isInternetPresent;
    ProgressDialog pd;
    Float rate;
    Bitmap bitmap;
    String url = "bml_list_details.php";
    public String loginresponse;
    public JSONArray dataJsonArr1;
     String title,title1,description,rating,id,images,newKey;
    RelativeLayout dec;
    TextView tt,desc;
    RatingBar rb;
    GoogleMap map;
    MarkerOptions marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.des);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
//                .getMap();

//        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//        SupportMapFragment   supportMapFragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.map);
//        map = supportMapFragment.getMap();
//        map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
////         map = getMapFragment().getMap();
//        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        setUpMapIfNeeded();
        buttonmap=(Button)findViewById(R.id.button10);
        image1=(ImageView)findViewById(R.id.imageView2);
        dec=(RelativeLayout)findViewById(R.id.dec);
//        Bundle extras = getIntent().getExtras();
        tt=(TextView)findViewById(R.id.textView5);
        desc=(TextView)findViewById(R.id.textView6);
        rb=(RatingBar)findViewById(R.id.ratingBar2);
        Intent intent = getIntent();
//        Bitmap img=(Bitmap) intent.getParcelableExtra("img");
         id = intent.getExtras().getString("id");




         title = intent.getExtras().getString("title");

        getSupportActionBar().setTitle(title);
        Log.e("desid", id);
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
//        private void InitMapFragment()
//        {
//            _mapFragment = SupportFragmentManager.FindFragmentByTag("map") as SupportMapFragment;
//            if (_mapFragment == null)
//            {
//                GoogleMapOptions mapOptions = new GoogleMapOptions()
//                        .InvokeMapType(GoogleMap.MapTypeNormal)
//                        .InvokeZoomControlsEnabled(true)
//                        .InvokeCompassEnabled(true);
//
//                FragmentTransaction fragTx = SupportFragmentManager.BeginTransaction();
//                _mapFragment = SupportMapFragment.NewInstance(mapOptions);
//                fragTx.Add(Quota.Resource.Id.mapWithOverlay, _mapFragment, "map");
//                fragTx.Commit();
//            }
//        }

        // qtysp.setText("1");
        if (isInternetPresent == true) {

            new LoadImage().execute();

        } else {
            Toast.makeText(getApplicationContext(), "No internet connection!",
                    Toast.LENGTH_SHORT).show();

        }
//        image1=(ImageView)findViewById(R.id.imageView2);
//        image.setImageBitmap(img);
        book=(Button)findViewById(R.id.button2);
        book.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Description.this,Calendar1.class));
            }
        });
        buttonmap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(Description.this,Maps.class);
                i.putExtra("latitude",latitude);
                i.putExtra("longitude",longitude);
                i.putExtra("title",title);
                startActivity(i);
            }
        });
        dec.setVisibility(View.GONE);
    }
    private  void setUpMapIfNeeded()
    {
        if(map==null)
        {
            map= ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
//        MenuItem item = menu.findItem(R.id.search);
//        MenuItem item1 = menu.findItem(R.id.search);
//        item.setVisible(false);
//        item1.setVisible(false);
//		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//		searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//		searchView.setSearchableInfo(searchManager
//				.getSearchableInfo(getComponentName()));
        return true;
    }
//    private SupportMapFragment getMapFragment() {
//        FragmentManager fm = null;
//
//
//
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//
//            fm = getFragmentManager();
//        } else {
//            Log.d(TAG, "using getChildFragmentManager");
//            fm = getChildFragmentManager();
//        }
//
//        return (SupportMapFragment) fm.findFragmentById(R.id.map);
//    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
//
            case android.R.id.home:
                super.onBackPressed();
                break;
            case R.id.share:
//                String fileName = "image-3116.jpg";//Name of an image
//                String externalStorageDirectory = Environment.getExternalStorageDirectory().toString();
//                String myDir = externalStorageDirectory + "/saved_images/"; // the file will be in saved_images
//                Uri uri = Uri.parse("file:///" + myDir + fileName);
//                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
//                shareIntent.setType("text/html");
//                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test Mail");
//                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Launcher");
////                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
//                startActivity(Intent.createChooser(shareIntent, "Share Deal"));
//                File f=new File("full image path");
//                Uri uri = Uri.parse("file://"+f.getAbsolutePath());
//                Intent share = new Intent(Intent.ACTION_SEND);
//                share.putExtra(Intent.EXTRA_STREAM, uri);
//                share.setType("image/*");
//                share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                startActivity(Intent.createChooser(share, "Share image File"));

                // Get access to the URI for the bitmap
                Uri bmpUri = getLocalBitmapUri(image1);
//                String uri = "geo:" + latitude + ","
//                        +longitude + "?q=" + latitude
//                        + "," + longitude;
                if (bmpUri != null) {
                    // Construct a ShareIntent with link to image
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
//                    shareIntent.putExtra(Intent.EXTRA_TITLE, title1);
                    shareIntent.putExtra(Intent.EXTRA_TEXT, title1);
                    shareIntent.putExtra(Intent.EXTRA_STREAM, bmpUri);
//                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, uri);


                    shareIntent.setType("image/*");
//
//                    // Launch sharing dialog for image
                    startActivity(Intent.createChooser(shareIntent, "Share Image"));
//                    startActivity(new Intent(Intent.ACTION_SEND,
//                            Uri.parse(uri)));

                } else {
                    // ...sharing failed, handle error
                }
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
    public Uri getLocalBitmapUri(ImageView imageView) {
        // Extract Bitmap from ImageView drawable
        Drawable drawable = imageView.getDrawable();
        Bitmap bmp = null;
        if (drawable instanceof BitmapDrawable){
            bmp = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        } else {
            return null;
        }
        // Store image to default external storage directory
        Uri bmpUri = null;
        try {
            // Use methods on Context to access package-specific directories on external storage.
            // This way, you don't need to request external read/write permission.
            // See https://youtu.be/5xVh-7ywKpE?t=25m25s
            File file =  new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "share_image_" + System.currentTimeMillis() + ".png");
            FileOutputStream out = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 90, out);
            out.close();
            bmpUri = Uri.fromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bmpUri;
    }
    private class LoadImage extends AsyncTask<String, String, Bitmap> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(Description.this);
            pd.setMessage("Please Wait");
            pd.show();
            pd.setCancelable(false);

        }

        protected Bitmap doInBackground(String... args) {

                List<NameValuePair> nvp = new ArrayList<NameValuePair>();
                nvp.add(new BasicNameValuePair("id", id));

                try {
                    loginresponse = Webservices.postRequest(Description.this, url, nvp);

                    Log.e("the respne", loginresponse);

                    JSONObject json = new JSONObject(loginresponse);

                    dataJsonArr1 = json.getJSONArray("Order_List");
                    Log.e("json", dataJsonArr1.toString());
                    // l.clear();
                    // // loop through all users
                    for (int i = 0; i < dataJsonArr1.length(); i++) {

                        JSONObject c = dataJsonArr1.getJSONObject(i);

                        title1 = c.getString("title");
                        description = c.getString("description");
                        rating = c.getString("rating");
                        rate=Float.valueOf(rating);
                        latitude = c.getDouble("latitude");
                        longitude = c.getDouble("longitude");
                        images = c.getString("image");
                        newKey = images.replaceAll(" ", "%20");

                        bitmap = BitmapFactory
                                .decodeStream((InputStream) new URL(newKey)
                                        .getContent());

                        // Log.e("bitmap",bitmap.toString());
                        // new LoadImage().execute(images);
                    }

                } catch (IllegalStateException e1) {

                    e1.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            return bitmap;
        }

        protected void onPostExecute(Bitmap image) {

            pd.dismiss();

                dec.setVisibility(View.VISIBLE);

                tt.setText(title1);
                desc.setText(description);
//            LatLng lang = new LatLng(latitude, longitude);
//            marker = new MarkerOptions().position(lang).title(title);
//            // marker;
////        marker.icon(BitmapDescriptorFactory
////                .fromResource(R.drawable.historical));
//            //
//            // marker.title(Name);
//            map.moveCamera(CameraUpdateFactory.newLatLng(lang));
//            map.animateCamera(CameraUpdateFactory.zoomTo(15));
//            map.getUiSettings().setZoomControlsEnabled(true);
//            map.addMarker(marker);
//				price.setText(price1);
//                id1.setText(Discount);
            if(map != null)
            {
                setUpMap();
            }
            rb.setRating(rate);




                if (image != null) {
                    image1.setImageBitmap(image);
                    // pd.dismiss();

                } else {

                    pd.dismiss();
                    Toast.makeText(Description.this,
                            "No Produce Found",
                            Toast.LENGTH_SHORT).show();


            }
        }
    }
}
