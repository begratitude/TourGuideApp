package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class EatFragment extends Fragment{

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_eataly, R.string.desc_eataly,
                R.drawable.eataly));
        places.add(new Place(R.string.name_mercato, R.string.desc_mercato,
                R.drawable.almercato));
        places.add(new Place(R.string.name_doping, R.string.desc_doping,
                R.drawable.thedopingclub));

        PlaceRecyclerViewAdapter adapter = new PlaceRecyclerViewAdapter(places);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        //PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        //ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        //listView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
