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
    @Bind(R.id.imageView4) ImageView mImageOne;
    @Bind(R.id.imageView5) ImageView mImageTwo;
    @Bind(R.id.imageView6) ImageView mImageThree;
    @Bind(R.id.imageView7) ImageView mImageFour;
    @Bind(R.id.imageView8) ImageView mImageFive;
    @Bind(R.id.imageView9) ImageView mImageSix;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMenuButton.setOnClickListener(this);

        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageOne);
        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageTwo);
        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageThree);
        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageFour);
        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageFive);
        Picasso.with(this).load("http://s3-media1.fl.yelpcdn.com/bphoto/zIZHcwdQnaj1P-uRyhKU5Q/o.jpg").into(mImageSix);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}
