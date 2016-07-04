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
        attractions.add(new dcAttractions("Washington Monument", "Landmark obelisk rising from the National Mall that honors America's first president.", "2 15th St NW", R.drawable.wash_thumb));
        attractions.add(new dcAttractions("Thomas Jefferson Memorial", "Columned rotunda in the style of Rome's Pantheon on the man-made reservoir known as the Tidal Basin.", "701 E Basin Dr SW", R.drawable.jeff_thumb));
        attractions.add(new dcAttractions("Lincoln Memorial", "Parthenon-inspired tribute to Abraham Lincoln with a 19-ft. marble statue, murals & reflecting pool.", "2 Lincoln Memorial Cir NW", R.drawable.lincoln));
        attractions.add(new dcAttractions("National WWII Memorial", "Iconic outdoor memorial honoring the 16 million Americans who served during World War II.", "1750 Independence Ave SW", R.drawable.wwii));
        attractions.add(new dcAttractions("Franklin Delano Roosevelt Memorial", "Memorial to FDR featuring waterfalls, sculptures & quotes from the former president.", "1750 Independence Ave SW", R.drawable.fdr));
        attractions.add(new dcAttractions("Robert A. Taft Memorial and Carillon", "Memorial to Robert Taft with obelisks , statues, and waterfall.", "New Jersey Ave NW", R.drawable.taft));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_sights);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
