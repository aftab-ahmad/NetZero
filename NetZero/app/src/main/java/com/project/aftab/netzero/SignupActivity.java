package com.project.aftab.netzero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by aftab on 2015-03-28.
 */

public class SignupActivity extends ActionBarActivity {

    private Toolbar toolbar;

    private TextView fName;
    private TextView lName;
    private TextView email;
    private TextView username;
    private TextView password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fName = (TextView) findViewById(R.id.fNameField);
        lName = (TextView) findViewById(R.id.lNameField);
        email = (TextView) findViewById(R.id.emailField);

        username = (TextView) findViewById(R.id.usernameField);
        password = (TextView) findViewById(R.id.passwordField);

         /* Set the toolbar as action bar */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Submit (View view) {

        if (username.getText().length() != 0 && password.getText().length() != 0) {
            Toast.makeText(getApplicationContext(), "Signed Up.", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, MainActivity.class);
            startActivity (intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Field Entry.", Toast.LENGTH_SHORT).show();
            username.setText("");
            password.setText("");
        }
    }
}
