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

public class CountriesFragment extends Fragment {

    private RecyclerView recyclerView;
    private CountriesAdapter adapter;
    private List<Country> countries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_countries);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        countries = new ArrayList<>();
        countries.add(new Country("China", "Asia"));
        countries.add(new Country("India", "Asia"));
        countries.add(new Country("United States", "North America"));
        countries.add(new Country("Brazil", "South America"));
        countries.add(new Country("Russia", "Europe"));

        adapter = new CountriesAdapter(countries);
        recyclerView.setAdapter(adapter);

        return view;
    }
}