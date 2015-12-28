package com.example.ma26.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
   private ArrayAdapter<String> mForecastArray;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecast={
                "Today- sunny- 40/25",
                "monday- sunny- 40/25",
                "Tuesday- sunny- 40/25",
                "wednesday- sunny- 40/25",
                "Thursday- sunny- 40/25",
                "friday- sunny- 40/25",
                "Saturday- sunny- 40/25",

        };
        List<String> weekForecast= new ArrayList<String>(
                Arrays.asList(forecast));

        mForecastArray = new ArrayAdapter<String>(
                getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast
        );
        ListView list=(ListView) container.findViewById(R.id.listview_forecast);
        list.setAdapter(mForecastArray);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
