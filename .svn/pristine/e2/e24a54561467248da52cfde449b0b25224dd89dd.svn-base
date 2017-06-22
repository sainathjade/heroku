package net.glansa.bookmyleisure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by kundan on 6/19/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {

    private ImageLoader imageLoader;
    private DisplayImageOptions options;
    private LayoutInflater inflater;
    private Context context;
    private final String[] price;
    private final String[] imageId;
    private final String[] id;
    private final String[] title;
    private final Float[] rating;
    private final String[] des;
    public	ImageView imageView;
    TextView txtTitle,txtTitle1,txtTitle2;
    Button b1;
    RatingBar rb;

//    String[] images = {"https://2.bp.blogspot.com/-qdVGBrZpNEo/Vzs7Dyba8eI/AAAAAAAANXg/oQGukisNydIcTA733Q8qNX1xryCNrP1-gCLcB/s640/AndroidNotification.png",
//            "https://2.bp.blogspot.com/-MtTDhb_9QGw/Vr9OXfE0hqI/AAAAAAAAMZo/e9Advd4xPmY/s1600/Googleplus.png",
//            "http://3.bp.blogspot.com/-hEsy8I3DVrA/ViFFalr14kI/AAAAAAAAL74/nfZd4behDE0/s1600/material-tabs.png",
//            "https://4.bp.blogspot.com/-fzCN1en9BXY/VslDs985vvI/AAAAAAAAMbU/JycBEflEJcI/s1600/sqlitedemo.png",
//            "https://3.bp.blogspot.com/-0CvhPeUCDes/VtGVTINSNhI/AAAAAAAAMc8/CzGr-nlqgS8/s1600/FacebookIntegration.png",
//            "http://2.bp.blogspot.com/-DpC34QctSsI/Vh6JZjWY-0I/AAAAAAAAL5c/-UgJEDKYays/s1600/pushNotification.png",
//            "http://4.bp.blogspot.com/-8u_hqbGb30g/VjR9WflhCNI/AAAAAAAAMFs/namqhGH1AE0/s1600/material_mcs1_original.png",
//            "http://1.bp.blogspot.com/-5nkpiqWiPkg/Vj9jWk0IyiI/AAAAAAAAMIQ/uEBdjXr3jCY/s1600/TwitterloginAndroid.png",
//            "http://3.bp.blogspot.com/-oY46UYNjKFk/Vike7jlX05I/AAAAAAAAMBA/OjeJp6BAio8/s640/studio-hero.jpg",
//            "http://4.bp.blogspot.com/-UgboLypyx9s/Vq5LeA35rbI/AAAAAAAAMXs/4fGJQPURYwg/s1600/seekbarinandroid.png"};

//    public ListAdapter(Context context) {
//
//        this.context = context;
//        inflater = LayoutInflater.from(context);
//
//        imageLoader = ImageLoader.getInstance();
//
//        options = new DisplayImageOptions.Builder()
//                .showImageOnLoading(R.drawable.place_holder)
//                .showImageForEmptyUri(R.drawable.place_holder)
//                .showImageOnFail(R.drawable.place_holder)
//                .cacheInMemory(true)
//                .cacheOnDisk(true)
//                .considerExifParams(true)
//                .bitmapConfig(Bitmap.Config.RGB_565)
//                .build();
//
//
//    }
    public ListAdapter(Activity context,
                  String[] price,String[] imageId,String[] id,String[] title,Float[] rating,String[] des) {
//        super(context, R.layout.amusadapter, price);
        this.context = context;
        this.price = price;
        this.imageId = imageId;
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.des = des;
        inflater = LayoutInflater.from(context);
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
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.amusadapter, parent, false);
        ListHolder holder = new ListHolder(view);
         txtTitle = (TextView) view.findViewById(R.id.textView4);
         txtTitle1 = (TextView) view.findViewById(R.id.textView2);
         txtTitle2 = (TextView) view.findViewById(R.id.textView3);
         b1 = (Button) view.findViewById(R.id.button);
         rb=(RatingBar)view.findViewById(R.id.ratingBar);
        imageView = (ImageView) view.findViewById(R.id.imageView1);

//txtTitle.setText(id[position]);

        return holder;
    }

    @Override
    public void onBindViewHolder(ListHolder holder, final int position) {
        imageLoader.displayImage(imageId[position], holder.imageView, options);
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
//		imageView.setBackgroundResource(imageId[position]);
        }
//    Toast.makeText(context, "You Clicked "+id[position], Toast.LENGTH_LONG).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Description.class);
                String ids = id[position];
                String itemValue = title[position];
//            Toast.makeText(context, "You Clicked " + id[position], Toast.LENGTH_LONG).show();
//		String img=	imageView.getDrawable();
//			Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(), imageView.getDrawable());

//			Drawable myDrawable = imageView.getDrawable();
//			Log.e("imag", myDrawable.toString());
//			Bitmap icon = BitmapFactory.decodeResource(context.getResources(), myDrawable);
//			Bitmap bitmap1 = ((BitmapDrawable)myDrawable).getBitmap();
//			Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                intent.putExtra("id", ids);
                intent.putExtra("title", itemValue);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageId.length;
    }

    class ListHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ListHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
