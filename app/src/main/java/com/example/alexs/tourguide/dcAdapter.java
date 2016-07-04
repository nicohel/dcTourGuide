/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.alexs.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/*
* {@link dcAttractionsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link dcAttractions} objects.
* */
public class dcAdapter extends ArrayAdapter<dcAttractions> {

    private int mColorID;

    private static final String LOG_TAG = dcAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param dcAttractionss A List of dcAttractions objects to display in a list
     */
    public dcAdapter(Activity context, ArrayList<dcAttractions> dcAttractionss, int colorID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, dcAttractionss);
        mColorID = colorID;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the TextView for the list text
        LinearLayout backColorView = (LinearLayout) listItemView.findViewById(R.id.listText);
        backColorView.setBackgroundColor(ContextCompat.getColor(getContext(), mColorID));

        // Get the {@link dcAttractions} object located at this position in the list
        dcAttractions currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the version name from the current dcAttractions object and
        // set this text on the name TextView
        nameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView summaryTextView = (TextView) listItemView.findViewById(R.id.attraction_summary);
        // Get the version number from the current dcAttractions object and
        // set this text on the number TextView
        summaryTextView.setText(currentAttraction.getAttractionSummary());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the version number from the current dcAttractions object and
        // set this text on the number TextView
        addressTextView.setText(currentAttraction.getAttractionAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current dcAttractions object and
        // set the image to iconView
        if(currentAttraction.hasImage()){
            iconView.setImageResource(currentAttraction.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
