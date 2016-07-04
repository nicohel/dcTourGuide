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
        attractions.add(new dcAttractions("Le Diplomate", "French brasserie", "1601 14th St NW"));
        attractions.add(new dcAttractions("Fiola", "High-end Italian Bistro", "601 Pennsylvania Ave NW"));
        attractions.add(new dcAttractions("Proof", "New American small plates", "775 G St NW"));
        attractions.add(new dcAttractions("Blue Duck Tavern", "New American, great brunch!", "1201 24th St NW"));
        attractions.add(new dcAttractions("Little Serow", "Intimate Northern Thai Date Spot", "1511 17th St NW"));
        attractions.add(new dcAttractions("Brasserie Beck", "High-end Belgian Cuisine and Beer", "1101 K St NW"));
        attractions.add(new dcAttractions("Osteria Morini", "Northern Italian Eatery", "301 Water St SE #109"));
        attractions.add(new dcAttractions("Daikaya", "Ramen and Japanese Cuisine", "705 6th St NW"));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_restaurants);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
