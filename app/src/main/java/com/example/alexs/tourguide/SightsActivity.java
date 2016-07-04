package com.example.alexs.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create an ArrayList of DC Sights objects
        ArrayList<dcAttractions> attractions = new ArrayList<dcAttractions>();
        attractions.add(new dcAttractions(getString(R.string.washing), getString(R.string.washDesc), getString(R.string.washAdd), R.drawable.wash_thumb));
        attractions.add(new dcAttractions(getString(R.string.jeff), getString(R.string.jeffDesc), getString(R.string.jeffAdd), R.drawable.jeff_thumb));
        attractions.add(new dcAttractions(getString(R.string.linc), getString(R.string.lincDesc), getString(R.string.lincAdd), R.drawable.lincoln));
        attractions.add(new dcAttractions(getString(R.string.wii), getString(R.string.wwiiDesc), getString(R.string.wwiiAdd), R.drawable.wwii));
        attractions.add(new dcAttractions(getString(R.string.fdr), getString(R.string.fdrDesc), getString(R.string.fdrAdd), R.drawable.fdr));
        attractions.add(new dcAttractions(getString(R.string.taft), getString(R.string.taftDesc), getString(R.string.taftAdd), R.drawable.taft));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_sights);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
