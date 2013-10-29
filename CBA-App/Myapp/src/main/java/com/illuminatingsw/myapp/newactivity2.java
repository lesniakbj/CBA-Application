package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class newactivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button homebutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity2);
        // Show the Up button in the action bar.
        setupActionBar();

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

    /**
     * Set up the {@link android.app.ActionBar}.
     */
    private void setupActionBar() {
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.newactivity2, menu);
        return true;
    }
    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
