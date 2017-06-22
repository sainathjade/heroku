package net.glansa.bookmyleisure;


        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final Integer[] imageId;

    public CustomListAdapter(Activity context, String[] title, Integer[] imageId) {
        super(context, R.layout.amusadapter, title);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.title=title;
        this.imageId=imageId;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.amusadapter, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView3);

        txtTitle.setText(title[position]);
        imageView.setImageResource(imageId[position]);
        extratxt.setText("Description "+title[position]);
        return rowView;

    };
}