package com.epicodus.localbusinessapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAppNameTextView = (TextView) findViewById(R.id.textView);
        Typeface aarghFont = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        mAppNameTextView.setTypeface(aarghFont);
    }
}
