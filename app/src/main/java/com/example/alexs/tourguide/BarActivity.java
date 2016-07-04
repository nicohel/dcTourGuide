package com.example.alexs.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create an ArrayList of DC Bars objects
        ArrayList<dcAttractions> attractions = new ArrayList<dcAttractions>();
        attractions.add(new dcAttractions(getString(R.string.churchkey), getString(R.string.churchDesc), getString(R.string.churchadd)));
        attractions.add(new dcAttractions(getString(R.string.nellies), getString(R.string.nellieDesc), getString(R.string.nellie)));
        attractions.add(new dcAttractions(getString(R.string.gibson), getString(R.string.gibsonDesc), getString(R.string.gibsonAdd)));
        attractions.add(new dcAttractions(getString(R.string.room), getString(R.string.roomDesc), getString(R.string.roomAdd)));
        attractions.add(new dcAttractions(getString(R.string.jack), getString(R.string.jackDesc), getString(R.string.jackAdd)));
        attractions.add(new dcAttractions(getString(R.string.hamil), getString(R.string.hamilDesc), getString(R.string.hamilAdd)));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_bars);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
