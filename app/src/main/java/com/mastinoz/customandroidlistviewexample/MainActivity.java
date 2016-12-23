package com.mastinoz.customandroidlistviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String androidListViewStrings[] = {"Android ListView Example", "Android Custom ListView Example", "Custom ListView Example",
            "Android List Adapter", "Custom Adapter ListView", "ListView Tutorial",
            "ListView with Image and Text", "Custom ListView Text and Image", "ListView Custom Tutorial"};

    Integer image_id[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidListAdapter androidListAdapter = new AndroidListAdapter(this, image_id, androidListViewStrings);
        ListView androidListView = (ListView) findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);
    }
}