package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class InfoActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        Button buttonfindhelp;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);

        // HANDLE THE PRESSING OF THE Find Help BUTTON
        buttonfindhelp = (Button) findViewById(R.id.findhelpbutton);
        buttonfindhelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "FindHelp Button Pressed!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getBaseContext(), ItemListActivity.class));

            };
        } );
    }
}