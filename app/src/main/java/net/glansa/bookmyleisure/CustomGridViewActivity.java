package net.glansa.bookmyleisure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridViewActivity extends BaseAdapter {

    private Context mContext;
//    private final String[] gridViewString;
//    private final String[] colors;
    private final int[] gridViewImageId;

    public CustomGridViewActivity(Context context,  int[] gridViewImageId) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
//        this.gridViewString = gridViewString;
//        this.colors = colors;
    }

    @Override
    public int getCount() {

        return gridViewImageId.length;
//        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_custom_layout, null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.android_gridview_text);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.android_gridview_image);
//            textViewAndroid.setText(gridViewString[i]);
            imageViewAndroid.setBackgroundResource(gridViewImageId[i]);
//            imageViewAndroid.setBackgroundColor(Color.parseColor(colors[i]));
        } else {
            gridViewAndroid = (View) convertView;
        }

        return gridViewAndroid;
    }
}