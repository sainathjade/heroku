package net.glansa.bookmyleisure;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Glansa on 9/1/2016.
 */
public class Review extends AppCompatActivity {
    Button book;
    TextView total,internet,payment,alltotal,adults,childs,datet,timet,ttickets,name,email,no;
    Double all;
    String qty,qty1,date,time,getname,getemail,getno;
    Integer tt;


    String[] price
            = { "Necklace Road.", "Necklace Road." };
    List<String> l1 = new ArrayList<String>();
    // List<Integer> l3 = new ArrayList<Integer>();
    String Id,Title;
    ImgAd1 adapter;
    String url2 = "delete_cart.php";
    String url1 = "subitems.php";
    //	String url1 = "farmerzipcodes.php";
    Intent i;
    String url = "bml_list.php";
    // String city = "London,UK";
    String[] title={"Lumbini Park","NTR Gardens"};
    String[] id={"Boating, Children Play, Food courts...Children Play, Gaint wheal, Columbus...","Children Play, Gaint wheal, Columbus..."};
    String[] images;
    String[] des;
    Bitmap[] mg;
    Float[] rating;
    public static final String MY_PREF = "MyPreferences";
    // = { "20", "30", "50", "60" };
    List<String> l = new ArrayList<String>();
    List<String> l2 = new ArrayList<String>();
    List<String> l3 = new ArrayList<String>();
    List<Float> r = new ArrayList<Float>();
    List<String> des1 = new ArrayList<String>();
    ArrayList<Bitmap> bitmapArray = new ArrayList<Bitmap>();
    Integer[] imageId1 = { R.drawable.banner, R.drawable.banner1};
    // R.drawable.grapes,
    // R.drawable.apples,
    // // R.drawable.ic_launcher, R.drawable.tomato,
    // // R.drawable.ic_launcher, R.drawable.ic_launcher,
    // // R.drawable.ic_launcher, R.drawable.ic_launcher,
    // // R.drawable.ic_launcher, R.drawable.ic_launcher,
    // // R.drawable.ic_launcher, R.drawable.ic_launcher,
    // // R.drawable.ic_launcher,
    //
    // };

    public String loginresponse;

    public JSONArray dataJsonArr1;

    public String lastname;

    public String productname;

    public String Description;

    public String price1;
    ListView gridView;
    Gridview 	gridView1;
    ListView lv;
    // public Integer image;
    String image1;
    // Bitmap[] imageId;

    public Bitmap bitmap;

    String itemValue;
    ConnectionDetector cd;
    public String ii;
    //	ConnectionDetector cd;
    Boolean isInternetPresent;
    String Farmerid;
    Bundle savedInstanceState;
    public String newKey,i1,p;

//    public String name;

    SearchView searchView;

    String activiy;
    String backactivity;
    SharedPreferences sp;
    Float f;
    String rating1;
    String subject="Book My Leisure";
    String body="Thank You For Booking Please Check Your Booking Details.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Bundle extras = getIntent().getExtras();
        sp = getSharedPreferences(MY_PREF, 0);
//        Intent intent = getIntent();
         f = sp.getFloat("total1", 0.0f);
         qty = sp.getString("qty","");
        qty1 = sp.getString("qty1","");
        date = sp.getString("date","");
        time = sp.getString("time","");
        getemail = extras.getString("email","");
        getname = extras.getString("name","");
        getno = extras.getString("no","");
        total=(TextView)findViewById(R.id.textView28);
        internet=(TextView)findViewById(R.id.textView29);
        payment=(TextView)findViewById(R.id.textView30);
        alltotal=(TextView)findViewById(R.id.textView32);
        adults=(TextView)findViewById(R.id.textView17);
        childs=(TextView)findViewById(R.id.textView18);
        datet=(TextView)findViewById(R.id.textView22);
        timet=(TextView)findViewById(R.id.textView23);
        ttickets=(TextView)findViewById(R.id.textView24);
        name=(TextView)findViewById(R.id.textView);
        email=(TextView)findViewById(R.id.textView34);
        no=(TextView)findViewById(R.id.textView35);
        name.setText("Name: "+getname);
        email.setText("Email: "+getemail);
        no.setText("Mobile: "+getno);
         i1=internet.getText().toString();
        Double in=Double.parseDouble(i1);
         p=payment.getText().toString();
        Double pa=Double.parseDouble(p);
        total.setText(getResources().getString(R.string.Rs)+ f.toString());
         all=in+pa+f;
        alltotal.setText(getResources().getString(R.string.Rs)+ all);
        adults.setText("Adults : "+qty);
        childs.setText("Children :" + qty1);
        internet.setText(getResources().getString(R.string.Rs)+ "10");
        payment.setText(getResources().getString(R.string.Rs)+ "15");
        Integer au=Integer.valueOf(qty);
        Integer ch=Integer.valueOf(qty1);
         tt=au+ch;
        ttickets.setText(tt.toString());
        datet.setText(date);
        timet.setText(time);
        book=(Button)findViewById(R.id.button5);
        book.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//
//
//                String email = editTextEmail.getText().toString().trim();
//                String subject = editTextSubject.getText().toString().trim();
//                String message = editTextMessage.getText().toString().trim();

                //Creating SendMail object
//                SendMail sm = new SendMail(Review.this, getemail, subject, body);

                //Executing sendmail to send email
//                sm.execute();
                SharedPreferences sp = getSharedPreferences(
                        MY_PREF, 0);
                SharedPreferences.Editor edit = sp.edit();
                edit.putString("adults", qty);
                edit.putString("childs", qty1);
//                edit.putString("date", "mainactivity");
                edit.putString("total", all.toString());
                edit.putString("tt", tt.toString());
//                edit.putString("totalprice", all);
//                edit.putString("adults", "mainactivity");
//                edit.putString("adults", "mainactivity");
                edit.commit();
                Intent i = new Intent(Review.this, Quickpay.class);
                i.putExtra("total", all);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.search);
        MenuItem item1 = menu.findItem(R.id.share);
//		MenuItem item1 = menu.findItem(R.id.search);
        item.setVisible(false);
//        MenuItem item1 = menu.findItem(R.id.search);
        item1.setVisible(false);
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
    private class LoadImage extends AsyncTask<String, String, Bitmap> {
        ProgressDialog pd = new ProgressDialog(Review.this);

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(Review.this);
            pd.setMessage("Loading  ....");
            pd.show();
            pd.setCancelable(false);

        }

        protected Bitmap doInBackground(String... args) {

            List<NameValuePair> nvp = new ArrayList<NameValuePair>();
            nvp.add(new BasicNameValuePair("id", f.toString()));
            nvp.add(new BasicNameValuePair("id", qty));
            nvp.add(new BasicNameValuePair("id", qty1));
            nvp.add(new BasicNameValuePair("id", date));
            nvp.add(new BasicNameValuePair("id", time));
            nvp.add(new BasicNameValuePair("id", getemail));
            nvp.add(new BasicNameValuePair("id", getname));
            nvp.add(new BasicNameValuePair("id", getno));
            nvp.add(new BasicNameValuePair("id", all.toString()));
            nvp.add(new BasicNameValuePair("id", getname));
            nvp.add(new BasicNameValuePair("id", getname));



//            Log.e("id", Id);
//		nvp.add(new BasicNameValuePair("farmerid", Farmerid));
//		Log.e("doinback", Id);
            try {
                loginresponse = Webservices.postRequest(Review.this, url,
                        nvp);
//                Log.e("the respne", nvp.toString());
//                Log.e("the respne", loginresponse);

//			JsonParsing jParser = new JsonParsing();

                JSONObject json = new JSONObject(loginresponse);
                dataJsonArr1 = json.getJSONArray("Order_List");
                Log.e("json", dataJsonArr1.toString());
                // l.clear();
                // // loop through all users
                for (int i = 0; i < dataJsonArr1.length(); i++) {

                    JSONObject c = dataJsonArr1.getJSONObject(i);

                    Title = c.getString("title");
                    Id = c.getString("id");
                    price1 = c.getString("location");
                    image1 = c.getString("image");
                    rating1 = c.getString("rating");
                    Description = c.getString("info");
                    Float rat=Float.valueOf(rating1);
                    newKey = image1.replaceAll(" ", "%20");
                    Log.e("price", Description);
                    l.add(Id);
                    des1.add(Description);
                    r.add(rat);
                    // l3.add(image);
                    Log.e("ids", l.toString());
                    l1.add(Title);
                    l2.add(price1);
                    l3.add(newKey);
                    Log.e("products", l1.toString());
                    Log.e("images", l3.toString());

                    // }
                }
                for (int i = 0; i < l3.size(); i++) {
                    try {
                        ii = l3.get(i);
                        // for(int j = 0; j < ii.length(); j++) {
                        bitmap = BitmapFactory
                                .decodeStream((InputStream) new URL(ii)
                                        .getContent());
                        bitmapArray.add(bitmap);
                        // Log.e("bitmap", bitmap.toString());
                        Log.e("i3", ii);
                        // }

                    } catch (MalformedURLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                Log.e("bitmap", bitmapArray.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void onPostExecute(Bitmap image) {

            if (image != null) {

                // bitmapArray.setImageBitmap(image);
                pd.dismiss();

                id = l.toArray(new String[l.size()]);

                rating = r.toArray(new Float[r.size()]);
                des = des1.toArray(new String[des1.size()]);
//                Bitmap[] imageId = { bitmap };


                price = l2.toArray(new String[l2.size()]);
                title = l1.toArray(new String[l1.size()]);
//                imageId = bitmapArray.toArray(new Bitmap[bitmapArray.size()]);
//			Log.e("img", imageId.toString());
//                adapter = new ImgAd1(Review.this, price,imageId,  id,title,rating,des);
                // list=(ListView)findViewById(R.id.list);
                gridView.setAdapter(adapter);
                Log.e("img", "postexe");


            } else {

                pd.dismiss();
                Toast.makeText(Review.this,
                        "No Data Found",
                        Toast.LENGTH_SHORT).show();

            }
        }
    }
}
