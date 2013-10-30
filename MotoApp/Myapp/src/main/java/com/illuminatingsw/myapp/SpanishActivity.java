package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpanishActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        Button homebutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_activity);

        // HANDLE THE PRESSING OF THE Find Help BUTTON
        homebutton = (Button) findViewById(R.id.homebutton);
        homebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "FindHelp Button Pressed!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getBaseContext(), MainActivity.class));

            };
        } );
    }
}