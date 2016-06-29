package com.epicodus.localbusinessapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.menuButton) Button mMenuButton;
    @Bind (R.id.textView) TextView mAppNameTextView;
    @Bind(R.id.galleryImageView) ImageView mGalleryImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface aarghFont = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        mAppNameTextView.setTypeface(aarghFont);
        mMenuButton.setOnClickListener(this);

        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mGalleryImageView);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}
