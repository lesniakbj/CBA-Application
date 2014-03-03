package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brendan on 3/3/14.
 */
public class CarplsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        Button buttonHome, backButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.carpls_activity);

        // HANDLE THE PRESSING OF THE Home BUTTON
        buttonHome = (Button) findViewById(R.id.homebutton);
        buttonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "FindHelp Button Pressed!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getBaseContext(), MainActivity.class));

            };
        } );


        // HANDLE THE PRESSING OF THE Back BUTTON
        buttonHome = (Button) findViewById(R.id.backbutton);
        buttonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "FindHelp Button Pressed!", Toast.LENGTH_SHORT).show();

                finish();

            };
        } );
    }
}