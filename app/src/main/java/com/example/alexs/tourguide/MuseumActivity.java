package com.example.alexs.tourguide;

import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attractions_list);

        // Create an ArrayList of DC Museums objects
        ArrayList<dcAttractions> attractions = new ArrayList<dcAttractions>();
        attractions.add(new dcAttractions(getString(R.string.smith), getString(R.string.smithDesck), getString(R.string.smithAdd), R.drawable.smith));
        attractions.add(new dcAttractions(getString(R.string.hist), getString(R.string.histDesc), getString(R.string.histAdd), R.drawable.natty));
        attractions.add(new dcAttractions(getString(R.string.air), getString(R.string.airDesc), getString(R.string.airAdd), R.drawable.airspace));
        attractions.add(new dcAttractions(getString(R.string.holo), getString(R.string.holoDesc), getString(R.string.holoAdd), R.drawable.holocaust));
        attractions.add(new dcAttractions(getString(R.string.art), getString(R.string.artDesc), getString(R.string.artAdd), R.drawable.artgallery));
        attractions.add(new dcAttractions(getString(R.string.history), getString(R.string.historyDesc), getString(R.string.histAddress), R.drawable.americanhist));
        attractions.add(new dcAttractions(getString(R.string.spy), getString(R.string.spyDesc), getString(R.string.spyAdd), R.drawable.spy));
        attractions.add(new dcAttractions(getString(R.string.news), getString(R.string.newsDesc), getString(R.string.newsAdd), R.drawable.newseum));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_museums);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
