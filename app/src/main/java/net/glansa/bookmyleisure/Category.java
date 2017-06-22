package net.glansa.bookmyleisure;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

//import org.apache.http.NameValuePair;
//import org.apache.http.message.BasicNameValuePair;

@SuppressLint("NewApi")
public class Category extends AppCompatActivity implements  android.support.v7.widget.SearchView.OnQueryTextListener {
//	TextView temp, title;
private ImageLoader imageLoader;
	private DisplayImageOptions options;

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
	public String newKey;

	public String name;

	 SearchView searchView;
	ArrayList<Product> arrayList;
	 String activiy;
	 String backactivity;
	 SharedPreferences sp;
	 String rating1;
//	String id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.amusements);
//
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
		ImageLoader.getInstance().init(config);
		Intent intent = getIntent();
		arrayList = new ArrayList<>();
//        Bitmap img=(Bitmap) intent.getParcelableExtra("img");
		Id = intent.getExtras().getString("id");
		Title = intent.getExtras().getString("name");
//		Log.e("title",Title);
 		getSupportActionBar().setTitle(Title);
		cd = new ConnectionDetector(getApplicationContext());
		isInternetPresent = cd.isConnectingToInternet();
		if (isInternetPresent == true) {

			new LoadImage().execute();


		} else if (isInternetPresent == false) {
			Toast.makeText(getApplicationContext(), "No internet connection!",
					Toast.LENGTH_SHORT).show();

		}
//		ImgAd1 adapter = new ImgAd1(Category.this, imageId,web, price, id);
//				// list=(ListView)findViewById(R.id.list);
//				gridView.setAdapter(adapter);

		// JSONWeatherTask task = new JSONWeatherTask();
		// task.execute(new String[]{city});
		gridView = (ListView)findViewById(R.id.listView);
		Log.e("hi","create");
//		gridView1 = (GridView)findViewById(R.id.gridView);
//		gridView.setOnClickListener(this);
//		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> parent, View v,
//									int position, long id) {
//				Log.e("id","hi");
////				itemValue = (String) gridView.getItemAtPosition(position);
//				itemValue = l.get(position);
//				Intent i = new Intent(Category.this, Description.class);
//				itemValue=title[position];
////				// passing array index
////				i.putExtra("id", position);
//				startActivity(i);
//				Log.e("itemname",itemValue);
//
//				 Toast.makeText(getApplicationContext(), "hi",
//				 Toast.LENGTH_LONG).show();
//
//			}
//		});

//		gridView.setOnItemClickListener(new OnItemClickListener(){
//
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//				Intent intent = new Intent(Category.this,Description.class);
//				startActivity(intent);
//
//			}
//		});

//		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//				Toast.makeText(getApplicationContext(), "hi",
//				 Toast.LENGTH_LONG).show();
////
//			}
//		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		MenuItem item = menu.findItem(R.id.share);
//		MenuItem item1 = menu.findItem(R.id.search);
		item.setVisible(false);
		SearchManager searchManager =
				(SearchManager) getSystemService(Context.SEARCH_SERVICE);
		android.support.v7.widget.SearchView searchView =
				(android.support.v7.widget.SearchView) menu.findItem(R.id.search).getActionView();
		searchView.setSearchableInfo(
				searchManager.getSearchableInfo(getComponentName()));
		searchView.setOnQueryTextListener(this);
//
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
	@Override
	public boolean onQueryTextSubmit(String query) {
//        Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG).show();
		Intent i=new Intent(Category.this,Search.class);
		i.putExtra("id",query);
		startActivity(i);
		return false;
	}

	@Override
	public boolean onQueryTextChange(String newText) {
		return false;
	}

	private class LoadImage extends AsyncTask<String, String, String> {
	ProgressDialog pd = new ProgressDialog(Category.this);

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		pd = new ProgressDialog(Category.this);
		pd.setMessage("Loading  ....");
		pd.show();
		pd.setCancelable(false);

	}

	protected String doInBackground(String... args) {

		List<NameValuePair> nvp = new ArrayList<NameValuePair>();
		nvp.add(new BasicNameValuePair("id", Id));
		Log.e("id",Id);
//		nvp.add(new BasicNameValuePair("farmerid", Farmerid));
//		Log.e("doinback", Id);
		try {
			loginresponse = Webservices.postRequest(Category.this, url,
					nvp);
			Log.e("the respne", nvp.toString());
			Log.e("the respne", loginresponse);

//			JsonParsing jParser = new JsonParsing();


//			for (int i = 0; i < l3.size(); i++) {
//				try {
//					ii = l3.get(i);
//					// for(int j = 0; j < ii.length(); j++) {
//					bitmap = BitmapFactory
//							.decodeStream((InputStream) new URL(ii)
//									.getContent());
//					bitmapArray.add(bitmap);
//					// Log.e("bitmap", bitmap.toString());
//					Log.e("i3", ii);
//					// }
//
//				} catch (MalformedURLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}

//			Log.e("bitmap", bitmapArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginresponse;
	}

	protected void onPostExecute(String image) {
		pd.dismiss();
//		if (image != null) {
try {

	// bitmapArray.setImageBitmap(image);
	JSONObject json = new JSONObject(loginresponse);
	dataJsonArr1 = json.getJSONArray("Order_List");
	Log.e("json", dataJsonArr1.toString());
	// l.clear();
	// // loop through all users
	for (int i = 0; i < dataJsonArr1.length(); i++) {

		JSONObject c = dataJsonArr1.getJSONObject(i);

//		Title = c.getString("title");
//		Id = c.getString("id");
//		price1 = c.getString("location");
//		image1 = c.getString("image");
//		rating1 = c.getString("rating");
//		Description = c.getString("info");
//		Float rat = Float.valueOf(rating1);
//		newKey = image1.replaceAll(" ", "%20");
//		Log.e("price", Description);
//		l.add(Id);
//		des1.add(Description);
//		r.add(rat);
//		// l3.add(image);
//		Log.e("ids", l.toString());
//		l1.add(Title);
//		l2.add(price1);
//		l3.add(newKey);
//		Log.e("products", l1.toString());
//		Log.e("images", l3.toString());
		arrayList.add(new Product(
				c.getString("location"),
				c.getString("image"),
				c.getString("id"),
				c.getString("title"),
				Float.valueOf(c.getString("rating")),
				c.getString("info")
		));
		// }
	}
		Log.e("array",arrayList.toString());

//			id = l.toArray(new String[l.size()]);
//
//			rating = r.toArray(new Float[r.size()]);
//			des = des1.toArray(new String[des1.size()]);
////			String[] imageId = { bitmap };
//
//			String[] imageId = l3.toArray(new String[l3.size()]);
//
//			price = l2.toArray(new String[l2.size()]);
//			title = l1.toArray(new String[l1.size()]);
//			imageLoader = ImageLoader.getInstance();
//
//			options = new DisplayImageOptions.Builder()
//					.showImageOnLoading(R.drawable.place_holder)
//					.showImageForEmptyUri(R.drawable.place_holder)
//					.showImageOnFail(R.drawable.place_holder)
//					.cacheInMemory(true)
//					.cacheOnDisk(true)
//					.considerExifParams(true)
//					.bitmapConfig(Bitmap.Config.RGB_565)
//					.build();
//			imageId = bitmapArray.toArray(new Bitmap[bitmapArray.size()]);
//			Log.e("img", imageId.toString());
//			 adapter = new ImgAd1(Category.this, price,imageId,  id,title,rating,des);
			CustomListAdapter1 adapter1 = new CustomListAdapter1(
					getApplicationContext(), R.layout.amusadapter, arrayList
			);
			// list=(ListView)findViewById(R.id.list);
//			adapter = new DataAdapter(Category.this, price,imageId);
//			gridView.setAdapter(adapter);
			gridView.setAdapter(adapter1);
			Log.e("img", "postexe");


//		} else {

//			pd.dismiss();
//			Toast.makeText(Category.this,
//					"No Data Found",
//					Toast.LENGTH_SHORT).show();
//
//		}
} catch (JSONException e) {
	e.printStackTrace();
}

	}
}



}