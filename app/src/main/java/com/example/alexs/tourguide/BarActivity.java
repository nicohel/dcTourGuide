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
        attractions.add(new dcAttractions("ChurchKey", "Snacks, flatreads, huge beer selection", "1601 14th St NW"));
        attractions.add(new dcAttractions("Nellie's Sports Bar", "Casual pub with drag events, sports games, and poker night.", "900 U St NW"));
        attractions.add(new dcAttractions("The Gibson", "Sleek Prohibition style speakeasy.", "2009 14th St NW"));
        attractions.add(new dcAttractions("Room 11", "Intimate hipster nook.", "3234 11th St NW"));
        attractions.add(new dcAttractions("JackRose Saloon", "High-end whiskey bar.", "2007 18th St NW"));
        attractions.add(new dcAttractions("The Hamilton", "Iconic late night eatery and bar.", "600 14th St NW"));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_bars);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
