package com.illuminatingsw.myapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public static final String FIRST_RUN = "FirstRun";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonfindhelp, buttonabout, spanishbutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences settings = getSharedPreferences(FIRST_RUN, 0);
        boolean isFirstRun = settings.getBoolean("firstRun", true);

        if(isFirstRun)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Motorola Mobility Foundation Terms and Conditions");
            builder.setMessage(R.string.info);

            builder.setNeutralButton("I Agree", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int clicked) {
                    SharedPreferences settings = getSharedPreferences(FIRST_RUN, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putBoolean("firstRun", false);
                    editor.commit();
                }
            });

            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int clicked)
                {
                    Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                    homeIntent.addCategory(Intent.CATEGORY_HOME);
                    homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(homeIntent);
                }
            });
            builder.show();
        }

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
