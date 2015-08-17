package com.chilliballoon.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> fakeForecast = new ArrayList<>();
        fakeForecast.add("Today - Sunny 88/63");
        fakeForecast.add("Tomorrow - Foggy 70/46");
        fakeForecast.add("Weds - Cloudy 72/63");
        fakeForecast.add("Thurs - Rainy 64/51");
        fakeForecast.add("Fri - Foggy 70/46");
        fakeForecast.add("Sat - Sunny 76/68");

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, fakeForecast);
        ListView listView = (ListView) v.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return v;
    }
}
