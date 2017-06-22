package net.glansa.bookmyleisure;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Glansa on 9/1/2016.
 */
public class Calendar1 extends AppCompatActivity {
    DatePickerDialog datePickerDialog;
    Button btn,book,time;
    Spinner spinner1,spinner2;
    TextView adults,adults1,childs;
    Float value,value1;
    Button timePicker;
    String date,time1;
//    String[] SPINNERLIST = {};
List age = new ArrayList<Integer>();
    List age1 = new ArrayList<Integer>();
    public String Qty,Qty1;
    public static final String MY_PREF = "MyPreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        adults = (TextView) findViewById(R.id.textView11);
        adults1 = (TextView) findViewById(R.id.textView13);

        childs = (TextView) findViewById(R.id.textView14);
        timePicker = (Button) findViewById(R.id.button7);
//        timePicker.setIs24HourView(true);
        for (int i = 0; i <= 100; i++) {
            age.add(Integer.toString(i));
        }
        for (int j = 0; j <= 25; j++) {
            age1.add(Integer.toString(j));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, age);
        spinner1  = (Spinner)
                findViewById(R.id.spinner);
        spinner1.setAdapter(arrayAdapter);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, age1);
        spinner2  = (Spinner)
                findViewById(R.id.spinner2);
        spinner2.setAdapter(arrayAdapter1);
        btn=(Button)findViewById(R.id.btn1);
        time=(Button)findViewById(R.id.button7);
        book=(Button)findViewById(R.id.button4);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Calendar1.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        time.setText(selectedHour + ":" + selectedMinute);
                        time1=selectedHour + ":" + selectedMinute;

                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(Calendar1.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                btn.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);
                                 date=dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year;

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                Qty = arg0.getItemAtPosition(arg2).toString();
                Float qty = Float.valueOf(Qty);
                Log.e("age", qty.toString());
                value = qty * 50;
                adults1.setText("Adults : " + value.toString());
//                jsonParseId = "updateqty";
//                new LoadImage().execute();
                // Toast.makeText(getApplicationContext(), "hi",
                // Toast.LENGTH_SHORT).show();
                // Log.e("id1",id1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                Qty1 = arg0.getItemAtPosition(arg2).toString();
                Float qty=Float.valueOf(Qty1);
                Log.e("age",qty.toString());
                 value1=qty*20;
                childs.setText("Children : "+value1.toString());
//                jsonParseId = "updateqty";
//                new LoadImage().execute();
                // Toast.makeText(getApplicationContext(), "hi",
                // Toast.LENGTH_SHORT).show();
                // Log.e("id1",id1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(Calendar1.this, Details.class);
//                i.putExtra("total",value+value1);
//                i.putExtra("qty",Qty);
//                i.putExtra("qty1",Qty1);
//                i.putExtra("date",date);
//                i.putExtra("time",time1);
                SharedPreferences sp = getSharedPreferences(MY_PREF, 0);
                SharedPreferences.Editor edit = sp.edit();

                edit.putFloat("total1",value+value1);
                edit.putString("qty",Qty);
                edit.putString("qty1", Qty1);
                edit.putString("date",date);
                edit.putString("time",time1);

                edit.commit();
                startActivity(i);
            }
        });
    }
//    public void showDatePickerDialog(View v) {
//        DialogFragment newFragment = new DatePickerFragment();
//        newFragment.show(getSupportFragmentManager(), "datePicker");
//    }
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    MenuItem item = menu.findItem(R.id.search);
    MenuItem item1 = menu.findItem(R.id.share);
//        MenuItem item1 = menu.findItem(R.id.search);
    item.setVisible(false);
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

//    public String currentTime() {
//        String mcurrentTime = "Time: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();
//        return mcurrentTime;
//    }
}
