package net.glansa.bookmyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

public class ImgAd1 extends ArrayAdapter<String>{
	public Bitmap[] mThumbIds = {
//			R.drawable.b, R.drawable.c,
//			R.drawable.p, R.drawable.t,
//			R.drawable.ic_launcher, R.drawable.ic_launcher,
//			R.drawable.ic_launcher, R.drawable.ic_launcher,
//			R.drawable.ic_launcher, R.drawable.ic_launcher,
//			R.drawable.ic_launcher, R.drawable.ic_launcher,
//			R.drawable.ic_launcher, R.drawable.ic_launcher,
//			R.drawable.ic_launcher,
	};
private final Activity context;



private final String[] price;
	private final String[] imageId;
	private final String[] id;
	private final String[] title;
	private final Float[] rating;
	private final String[] des;
public	ImageView imageView;
	private ImageLoader imageLoader;
	private DisplayImageOptions options;


public ImgAd1(Activity context,
	String[] price,String[] imageId,String[] id,String[] title,Float[] rating,String[] des) {
super(context, R.layout.amusadapter, price);
this.context = context;
	this.price = price;
this.imageId = imageId;
	this.id = id;
this.title = title;
	this.rating = rating;
	this.des = des;
	imageLoader = ImageLoader.getInstance();

	options = new DisplayImageOptions.Builder()
			.showImageOnLoading(R.drawable.place_holder)
			.showImageForEmptyUri(R.drawable.place_holder)
			.showImageOnFail(R.drawable.place_holder)
			.cacheInMemory(true)
			.cacheOnDisk(true)
			.considerExifParams(true)
			.bitmapConfig(Bitmap.Config.RGB_565)
			.build();
}
@Override
public View getView(final  int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.amusadapter, null, true);
TextView txtTitle = (TextView) rowView.findViewById(R.id.textView4);
TextView txtTitle1 = (TextView) rowView.findViewById(R.id.textView2);
TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView3);
Button b1 = (Button) rowView.findViewById(R.id.button);
	RatingBar rb=(RatingBar)rowView.findViewById(R.id.ratingBar);
 imageView = (ImageView) rowView.findViewById(R.id.imageView1);

//txtTitle.setText(id[position]);
	if (title.length > position) {
		txtTitle1.setText(title[position]);
//	txtTitle2.setVisibility(View.GONE);
	}
if (price.length > position) {
	txtTitle2.setText(price[position]);
}
	if (des.length > position) {
		txtTitle.setText(des[position]);
	}
	if (rating.length > position) {
//		txtTitle.setText(rating[position]);
		rb.setRating(rating[position]);
	}
	if (imageId.length > position) {
//	imageView.setImageBitmap(imageId[position]);
		imageLoader.displayImage(imageId[position], imageView, options);
//		Picasso.with(context).load(imageId.getImage()).into(imageView);
//		imageView.setBackgroundResource(imageId[position]);
}
//    Toast.makeText(context, "You Clicked "+id[position], Toast.LENGTH_LONG).show();
	b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, Description.class);
            String ids=id[position];
          String  itemValue = title[position];
//            Toast.makeText(context, "You Clicked " + id[position], Toast.LENGTH_LONG).show();
//		String img=	imageView.getDrawable();
//			Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(), imageView.getDrawable());

//			Drawable myDrawable = imageView.getDrawable();
//			Log.e("imag", myDrawable.toString());
//			Bitmap icon = BitmapFactory.decodeResource(context.getResources(), myDrawable);
//			Bitmap bitmap1 = ((BitmapDrawable)myDrawable).getBitmap();
//			Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
			intent.putExtra("id",ids);
            intent.putExtra("title",itemValue);

            context.startActivity(intent);
        }
    });
//imageView.setImageBitmap(imageId[position]);
return rowView;
}
}