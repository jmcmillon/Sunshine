package com.example.android.jmcmillon.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlaceHolderFragment extends Fragment {

    public PlaceHolderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Once the root view for the Fragment has been created, its time to fill the
        // ListView with some dummy data


        // Dummy data for the listView
        String[] forecastData = {"Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Thurs - Rainy - 64/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny = 76/68"};

        List<String> listForecast = new ArrayList<String>(Arrays.asList(forecastData));

        // Now that we have some dummy forecast data, create an ArrayAdapter.
        // The ArrayAdapter will take data from a source and populate the ListView it's attached to.
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                // The current context (this fragment's parent activity
                this.getActivity(),
                // ID of list item layout
                R.layout.list_item_forecast,
                // ID of the textview to populate
                R.id.list_item_forecast_textview,
                // Forecast data
                listForecast);

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
