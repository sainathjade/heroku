package net.glansa.bookmyleisure;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

/**
 * Created by Belal on 2/3/2016.
 */

public class Tab2 extends Fragment {
    EditText text;
    Button search;
    String query;
    WebView webview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.tab2, container, false);
        View view = inflater.inflate(R.layout.search, container, false);
        SearchView search=(SearchView)view.findViewById(R.id.searchView);
//         webview = (WebView)view.findViewById(R.id.webView);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
//                Toast.makeText(getActivity(), query, Toast.LENGTH_LONG).show();
//                webview.getSettings().setJavaScriptEnabled(true);
//                webview.loadUrl("http://www.google.com" + "/" + query);
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);

                intent.putExtra(SearchManager.QUERY, query);
                startActivity(intent);
//                webview.loadDataWithBaseURL("", query, "text/html", "UTF-8", "");
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                Toast.makeText(getActivity(), newText, Toast.LENGTH_LONG).show();
                return false;
            }
        });
        return view;
    }

}
