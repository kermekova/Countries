package com.geeks.countries;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.countries.databinding.FragmentCountriesBinding;

import java.util.ArrayList;
import java.util.Objects;

public class CountriesFragment extends Fragment {
    private FragmentCountriesBinding binding;
    private ArrayList<String> countries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();}

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CountriesAdapter countriesAdapter = new CountriesAdapter(countries);
        String continent = getArguments().getString("Key");
        position (continent);
        binding.recyclerViewCountries.setAdapter(countriesAdapter);
    }

    private void position(String continent) {
        if (Objects.equals(continent,"Europe")) {
            countries.add("Russia");
            countries.add("Germany");
            countries.add("Spain");
            countries.add("France");
            countries.add("Poland");
            countries.add("Italy");
            countries.add("Greece");
            countries.add("Austria");
            countries.add("Belgium");
        } else if (Objects.equals(continent,"Asia")) {
            countries.add("Kyrgyzstan");
            countries.add("Kasachstan");
            countries.add("China");
            countries.add("Korea");
            countries.add("Japan");
            countries.add("India");
            countries.add("Indonesia");
            countries.add("Philippines");
            countries.add("Uzbekistan");
        } else if (Objects.equals(continent,"Africa")) {
            countries.add("Algeria");
            countries.add("Angola");
            countries.add("Benin");
            countries.add("Burundi");
            countries.add("Cameroon");
            countries.add("Chad");
            countries.add("Comoros");
            countries.add("Egypt");
            countries.add("Ghana");
    } else if (Objects.equals(continent,"North America")) {
            countries.add("USA");
            countries.add("Mexico");
            countries.add("Canada");
            countries.add("Bahamas");
            countries.add("Barbados");
            countries.add("Costa Rica");
            countries.add("Grenada");
            countries.add("Haiti");
            countries.add("Jamaica");
        }else if (Objects.equals(continent,"South America")) {
            countries.add("Brasil");
            countries.add("Argentina");
            countries.add("Columbia");
            countries.add("Peru");
            countries.add("Chile");
            countries.add("Uruguay");
            countries.add("Venezuela");
            countries.add("Bolivia");
            countries.add("Ecuador");
        } else if (Objects.equals(continent,"Australia")) {
            countries.add("Australia");
            countries.add("Papua New Guinea");
            countries.add("New Zealand");
        }
    }
}