package com.example.alexs.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create an ArrayList of DC Restaurants objects
        ArrayList<dcAttractions> attractions = new ArrayList<dcAttractions>();
        attractions.add(new dcAttractions(getString(R.string.dip), getString(R.string.dipDesc), getString(R.string.dipAdd)));
        attractions.add(new dcAttractions(getString(R.string.fol), getString(R.string.folDesc), getString(R.string.folAdd)));
        attractions.add(new dcAttractions(getString(R.string.proof), getString(R.string.proofDesc), getString(R.string.proofAdd)));
        attractions.add(new dcAttractions(getString(R.string.blue), getString(R.string.blueDesc), getString(R.string.blueAdd)));
        attractions.add(new dcAttractions(getString(R.string.ser), getString(R.string.serDesc), getString(R.string.serAdd)));
        attractions.add(new dcAttractions(getString(R.string.belg), getString(R.string.belgDesc), getString(R.string.belgAdd)));
        attractions.add(new dcAttractions(getString(R.string.morini), getString(R.string.moriniDesc), getString(R.string.moriniAdd)));
        attractions.add(new dcAttractions(getString(R.string.daikaya), getString(R.string.daikayaDesc), getString(R.string.daikayaAdd)));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_restaurants);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
