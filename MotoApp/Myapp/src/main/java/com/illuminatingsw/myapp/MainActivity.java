package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonfindhelp, buttonabout, spanishbutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // HANDLE THE PRESSING OF THE Find Help BUTTON
        buttonfindhelp = (Button) findViewById(R.id.findhelpbutton);
        buttonfindhelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              // Toast.makeText(getApplicationContext(), "FindHelp Button Pressed!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getBaseContext(), InfoActivity.class));

            };
        } );


        // HANDLE THE PRESSING OF THE About BUTTON
        buttonabout = (Button) findViewById(R.id.assistbutton);
        buttonabout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              //  Toast.makeText(getApplicationContext(), "About Button Pressed!", Toast.LENGTH_SHORT).show();

               startActivity(new Intent(getBaseContext(), newactivity2.class));

            };
        } );

        // HANDLE THE PRESSING OF THE spanish BUTTON
        spanishbutton = (Button) findViewById(R.id.spanishbutton);
        spanishbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //  Toast.makeText(getApplicationContext(), "About Button Pressed!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getBaseContext(), SpanishActivity.class));

            };
        } );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
