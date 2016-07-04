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
        attractions.add(new dcAttractions("Smithsonian Institute", "Established in 1846 \"for the increase and diffusion of knowledge,\" is a group of museums and research centers administered by the Government of the United States.", "1000 Jefferson Dr SW", R.drawable.smith));
        attractions.add(new dcAttractions("National Museum of Natural History", "The National Museum of Natural History is a natural history museum administered by the Smithsonian Institution, located on the National Mall in Washington, D.C., United States.", "10th St. & Constitution Ave. NW", R.drawable.natty));
        attractions.add(new dcAttractions("National Air and Space Museum", "Holds the largest collection of historic aircraft and spacecraft in the world.", "600 Independence Ave SW", R.drawable.airspace));
        attractions.add(new dcAttractions("United States Holocaust Memorial Museum", "Official memorial to the Holocaust. Adjacent to the National Mall in Washington, D.C., the USHMM provides for the documentation, study, and interpretation of Holocaust history. ", "100 Raoul Wallenberg Pl SW", R.drawable.holocaust));
        attractions.add(new dcAttractions("National Gallery of Art", "The National Gallery of Art, and its attached Sculpture Garden, is a national art museum in Washington, D.C.", "6th & Constitution Ave NW", R.drawable.artgallery));
        attractions.add(new dcAttractions("National Museum of American History", "The National Museum of American History: Kenneth E. Behring Center collects, preserves and displays the heritage of the United States in the areas of social, political, cultural, scientific and military history.", "14th St and Constitution Ave, NW", R.drawable.americanhist));
        attractions.add(new dcAttractions("International Spy Museum", "The International Spy Museum is a privately owned museum dedicated to the tradecraft, history and contemporary role of espionage, featuring the largest collection of international espionage artifacts currently on public display.", "800 F St NW", R.drawable.spy));
        attractions.add(new dcAttractions("Newseum", "The Newseum is an interactive museum of news and journalism located at 555 Pennsylvania Ave. NW, Washington, D.C. The seven-level, 250,000-square-foot museum features 15 theaters and 15 galleries", "555 Pennsylvania Ave NW", R.drawable.newseum));

        // Create an {@link dcAttractionsAdapter}, whose data source is a list of
        // {@link dcAttractions}s. The adapter knows how to create list item views for each item
        // in the list.
        dcAdapter attracAdapter = new dcAdapter(this, attractions, R.color.category_museums);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_attraction);
        listView.setAdapter(attracAdapter);
    }
}
