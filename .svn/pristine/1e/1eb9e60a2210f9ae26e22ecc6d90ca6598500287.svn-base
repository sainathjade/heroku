package net.glansa.bookmyleisure;

/**
 * Created by Glansa on 9/14/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Details extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText inputName, inputEmail, inputPassword;
    private TextInputLayout inputLayoutName, inputLayoutEmail, inputLayoutPassword;
    private Button btnSignUp;
    String getname,getemail,getmobileno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        inputLayoutName = (TextInputLayout) findViewById(R.id.input_layout_name);
        inputLayoutEmail = (TextInputLayout) findViewById(R.id.input_layout_email);
        inputLayoutPassword = (TextInputLayout) findViewById(R.id.input_layout_password);
        inputName = (EditText) findViewById(R.id.input_name);
        inputEmail = (EditText) findViewById(R.id.input_email);
        inputPassword = (EditText) findViewById(R.id.input_password);
        btnSignUp = (Button) findViewById(R.id.btn_signup);

//        inputName.addTextChangedListener(new MyTextWatcher(inputName));
//        inputEmail.addTextChangedListener(new MyTextWatcher(inputEmail));
//        inputPassword.addTextChangedListener(new MyTextWatcher(inputPassword));

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                submitForm();if (isNetworkAvailable() == true) {
                getname=inputName.getText().toString();
                getemail=inputEmail.getText().toString();
                getmobileno=inputPassword.getText().toString();
                Boolean isValidDetail = ValidaionMethod();
                if (isValidDetail == true) {




                Intent i=new Intent(Details.this, Review.class);
                i.putExtra("name",getname);
                i.putExtra("email",getemail);
                i.putExtra("no", getmobileno);
//                i.putExtra("date",date);
//                i.putExtra("time",time1);
                startActivity(i);

            }
//                else {
//                Toast.makeText(getApplicationContext(),
//                        "No internet connection!", Toast.LENGTH_SHORT).show();
//
//            }

            }
        });
    }
    private Boolean ValidaionMethod() {

        if (getname.equals("")) {
            // ERROR_MESSAGE = "Please Enter  Address";
            inputName.setError("Enter Name");

            return false;
        } else {
            inputName.setError(null);
            // return true;
        }
        if (getemail.equals("")) {
            // ERROR_MESSAGE = "Please Enter  EmailId";
            inputEmail.setError("Enter EmailId");
            return false;

        } else {
            inputEmail.setError(null);
            // return true;
        }
        if (!isValidEmail(getemail)) {
            // ERROR_MESSAGE = "Please Enter  EmailId";
            inputEmail.setError("Invalid EmailId");

            return false;

        } else {
            inputEmail.setError(null);
            // return true;
        }
        if (getmobileno.equals("")) {
            // ERROR_MESSAGE = "Please Enter  Address";
            inputPassword.setError("Enter MobileNo");

            return false;
        } else {
            inputPassword.setError(null);
            // return true;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    /**
     * Validating form
     */
//    private void submitForm() {
//        if (!validateName()) {
//            return;
//        }
//
//        if (!validateEmail()) {
//            return;
//        }
//
//        if (!validatePassword()) {
//            return;
//        }
//
//        Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
//    }

//    private boolean validateName() {
//        if (inputName.getText().toString().trim().isEmpty()) {
//            inputLayoutName.setError(getString(R.string.err_msg_name));
//            requestFocus(inputName);
//            return false;
//        } else {
//            inputLayoutName.setErrorEnabled(false);
//        }
//
//        return true;
//    }
//
//    private boolean validateEmail() {
//        String email = inputEmail.getText().toString().trim();
//
//        if (email.isEmpty() || !isValidEmail(email)) {
//            inputLayoutEmail.setError(getString(R.string.err_msg_email));
//            requestFocus(inputEmail);
//            return false;
//        } else {
//            inputLayoutEmail.setErrorEnabled(false);
//        }
//
//        return true;
//    }
//
//    private boolean validatePassword() {
//        if (inputPassword.getText().toString().trim().isEmpty()) {
//            inputLayoutPassword.setError(getString(R.string.err_msg_password));
//            requestFocus(inputPassword);
//            return false;
//        } else {
//            inputLayoutPassword.setErrorEnabled(false);
//        }
//
//        return true;
//    }
//
//    private static boolean isValidEmail(String email) {
//        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
//    }
//
//    private void requestFocus(View view) {
//        if (view.requestFocus()) {
//            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//        }
//    }

//    private class MyTextWatcher implements TextWatcher {
//
//        private View view;
//
//        private MyTextWatcher(View view) {
//            this.view = view;
//        }
//
//        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//        }
//
//        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//        }
//
//        public void afterTextChanged(Editable editable) {
//            switch (view.getId()) {
//                case R.id.input_name:
//                    validateName();
//                    break;
//                case R.id.input_email:
//                    validateEmail();
//                    break;
//                case R.id.input_password:
//                    validatePassword();
//                    break;
//            }
//        }
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.search);
        MenuItem item1 = menu.findItem(R.id.share);
//        MenuItem item1 = menu.findItem(R.id.search);
        item.setVisible(false);
        item1.setVisible(false);
//        item1.setVisible(false);
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
            case R.id.share:
//                String fileName = "image-3116.jpg";//Name of an image
//                String externalStorageDirectory = Environment.getExternalStorageDirectory().toString();
//                String myDir = externalStorageDirectory + "/saved_images/"; // the file will be in saved_images
//                Uri uri = Uri.parse("file:///" + myDir + fileName);
//                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
//                shareIntent.setType("text/html");
//                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test Mail");
//                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Launcher");
////                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
//                startActivity(Intent.createChooser(shareIntent, "Share Deal"));
//                File f=new File("full image path");
//                Uri uri = Uri.parse("file://"+f.getAbsolutePath());
//                Intent share = new Intent(Intent.ACTION_SEND);
//                share.putExtra(Intent.EXTRA_STREAM, uri);
//                share.setType("image/*");
//                share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                startActivity(Intent.createChooser(share, "Share image File"));
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}