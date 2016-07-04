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

/**
 * {@link dcAttractions} represents a single Android platform release.
 * Each object has 3 or 4 properties: name, summary, address, and image resource ID.
 */
public class dcAttractions {

    // Attraction name
    private String mAttractionName;

    // Attraction summary
    private String mAttractionSummary;

    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE;

    // Attraction address
    private String mAttractionAddress;

    private static final int NO_IMAGE = -1;

    public dcAttractions(String vName, String vSummary, String vAddress, int imageResourceId)
    {
        mAttractionName = vName;
        mAttractionSummary = vSummary;
        mAttractionAddress = vAddress;
        mImageResourceId = imageResourceId;
    }

    public dcAttractions(String vName, String vSummary, String vAddress)
    {
        mAttractionName = vName;
        mAttractionSummary = vSummary;
        mAttractionAddress = vAddress;
    }

    /**
     * Get the name of the Attraction
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the attraction summary
     */
    public String getAttractionSummary() {
        return mAttractionSummary;
    }

    /**
     * Get the attraction summary
     */
    public String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Get the attraction's image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE; }


}
