package com.geeks.countries;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ContinentFragment extends Fragment {

    private RecyclerView recyclerView;
    private ContinentAdapter adapter;
    private List<Continent> continents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_continent, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_continents);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        continents = new ArrayList<>();
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("North America"));
        continents.add(new Continent("South America"));
        continents.add(new Continent("Australia"));
        continents.add(new Continent("Antarctica"));

        adapter = new ContinentAdapter(continents);
        recyclerView.setAdapter(adapter);

        return view;
    }
}