package net.glansa.bookmyleisure;

import android.content.Context;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.util.List;


public class Webservices {
	//static String mainurl = "http://103.1.115.197:5556/api/";
	static String mainurl="http://farmitlocal.com/staging/appservices/";


	static InputStream is = null;
	static JSONObject jObj = null;
	static String json = "";
	static Context mContext;



	public static String postRequest(Context ct, String url,
			List<NameValuePair> postvalues) throws IllegalStateException,
			IOException {
		mContext = ct;
		HttpPost post = null;


		HttpParams params = new BasicHttpParams();
		int timeoutConnection = 60 * 1000 * 1;
		HttpConnectionParams.setConnectionTimeout(params, timeoutConnection);

		int timeoutSocket = 60 * 1000 * 1;
		HttpConnectionParams.setSoTimeout(params, timeoutSocket);
		HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

		HttpClient client = new DefaultHttpClient(params);
		String srvURL = mainurl + url;
		Log.e("total url ", srvURL);



		// Log.i("Webservise", "url="+srvURL);
		post = new HttpPost(srvURL);
		post.setHeader("Content-type",	"application/x-www-form-urlencoded;charset=UTF-8");
		post.setHeader("Accept-Charset", "utf-8");
		post.setEntity(new UrlEncodedFormEntity(postvalues, HTTP.UTF_8));

		try {

			HttpResponse response = client.execute(post);
			HttpEntity entity = response.getEntity();

			is = entity.getContent();

			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, "iso-8859-1"), 8);
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				is.close();
				json = sb.toString();
				 Log.e("JSON", json);
			} catch (Exception e) {
				Log.e("Buffer Error", "Error converting result " + e.toString());
			}
			Log.e("Webservice call", "Response kp=" + json.toString());


		} catch (SocketTimeoutException ex) {
			//Toast.makeText(ct, "Request time out", Toast.LENGTH_SHORT).show();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			// Do something for all other types of exception.
		}

		// try parse the string to a JSON object
		try {
			jObj = new JSONObject(json);
		} catch (JSONException e) {
			Log.e("JSON Parser", "Error parsing data " + e.toString());
		}

		// return JSON String
		return json;

	}

	public static String getRequest(Context ct, String url)
			throws IllegalStateException, IOException {
		mContext = ct;
		DefaultHttpClient httpClient = new DefaultHttpClient();
		// String paramString = URLEncodedUtils.format(params, "utf-8");
		// url += "?" + paramString;
		HttpGet httpGet = new HttpGet(url);

		HttpResponse httpResponse = httpClient.execute(httpGet);
		HttpEntity httpEntity = httpResponse.getEntity();
		is = httpEntity.getContent();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "iso-8859-1"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			json = sb.toString();
			Log.e("JSON Response 1 ",json);
		} catch (Exception e) {
			Log.e("Buffer Error", "Error converting result " + e.toString());
		}

		// try parse the string to a JSON object
		try {

			jObj = new JSONObject(json);

		} catch (JSONException e) {
			Log.e("JSON Parser", "Error parsing data " + e.toString());
		}

		// return JSON String
		return jObj.toString();

	}

}
