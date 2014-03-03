package com.illuminatingsw.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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

        // Link Carpls Page
        String theString = getString(R.string.before_search2);
        SpannableStringBuilder spannedString = new SpannableStringBuilder(theString);

        ClickableSpan clickStringCarpls = new ClickableSpan()
        {
            public void onClick(View view)
            {
                startActivity(new Intent(InfoActivity.this, CarplsActivity.class));
            }
        };

        spannedString.setSpan(clickStringCarpls, 5, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(spannedString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());



        // Link ILAO Page
        String theOtherString = getString(R.string.before_search3);
        SpannableStringBuilder otherSpannedString = new SpannableStringBuilder(theOtherString);

        ClickableSpan clickStringILAO = new ClickableSpan()
        {
            public void onClick(View view)
            {
                startActivity(new Intent(InfoActivity.this, ILAOActivity.class));
            }
        };

        otherSpannedString.setSpan(clickStringILAO, 6, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        TextView otherTextView = (TextView) findViewById(R.id.textView3);
        otherTextView.setText(otherSpannedString);
        otherTextView.setMovementMethod(LinkMovementMethod.getInstance());



    }
}