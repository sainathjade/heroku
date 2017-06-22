package net.glansa.bookmyleisure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by quocnguyen on 03/08/2016.
 */
public class CustomListAdapter1 extends ArrayAdapter<Product> {

    ArrayList<Product> products;
    Context context;
    int resource;

    public CustomListAdapter1(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);
        this.products = products;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.amusadapter, null, true);

        }
        final Product product = getItem(position);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.textView4);
        TextView txtTitle1 = (TextView) convertView.findViewById(R.id.textView2);
        TextView txtTitle2 = (TextView) convertView.findViewById(R.id.textView3);
        Button b1 = (Button) convertView.findViewById(R.id.button);
        RatingBar rb=(RatingBar)convertView.findViewById(R.id.ratingBar);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView1);

//        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewProduct);
//        Picasso.with(context).load(product.getImage()).into(imageView);

//        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
//        txtName.setText(product.getTitle());

//        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
//        txtPrice.setText(product.getPrice());
//        if (product.getTitle().length > ) {
            txtTitle1.setText(product.getTitle());
//	txtTitle2.setVisibility(View.GONE);
//        }
//        if (price.length > position) {
            txtTitle2.setText(product.getPrice());
//        }
//        if (des.length > position) {
            txtTitle.setText(product.getDes());
//        }
//        if (rating.length > position) {
//		txtTitle.setText(rating[position]);
            rb.setRating(product.getRating());
//        }
//        if (imageId.length > position) {
//	imageView.setImageBitmap(imageId[position]);
//            imageLoader.displayImage(imageId[position], imageView, options);
//		Picasso.with(context).load(imageId.getImage()).into(imageView);
            Picasso.with(context).load(product.getImage()).into(imageView);
//		imageView.setBackgroundResource(imageId[position]);
//        }
//    Toast.makeText(context, "You Clicked "+id[position], Toast.LENGTH_LONG).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Description.class);
//                String ids = id[position];
                String ids = product.getId();
                String itemValue = product.getTitle();
//            Toast.makeText(context, "You Clicked " + id[position], Toast.LENGTH_LONG).show();
//		String img=	imageView.getDrawable();
//			Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(), imageView.getDrawable());

//			Drawable myDrawable = imageView.getDrawable();
//			Log.e("imag", myDrawable.toString());
//			Bitmap icon = BitmapFactory.decodeResource(context.getResources(), myDrawable);
//			Bitmap bitmap1 = ((BitmapDrawable)myDrawable).getBitmap();
//			Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                intent.putExtra("id", ids);
                Log.e("ids", ids);
                intent.putExtra("title", itemValue);
                Log.e("name", itemValue);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
