package com.epicodus.localbusinessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;

    private ArrayList<String> newArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        newArray.add("warm shortcake w/ seasonal fruit");
        newArray.add("glazed breakfast hushpuppies");
        newArray.add("screen door praline bacon");
        newArray.add("screen door fried chicken and waffle");

        Intent intent = getIntent();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,newArray);
        mListView.setAdapter(adapter);
    }
}
