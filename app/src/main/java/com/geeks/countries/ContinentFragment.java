package com.geeks.countries;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.countries.databinding.FragmentContinentBinding;

import java.util.ArrayList;
import java.util.List;


public class ContinentFragment extends Fragment implements OnItemClick {

    private FragmentContinentBinding binding;
    private ArrayList<String> continents = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        ContinentAdapter adapter = new ContinentAdapter(continents, this);
        binding.recyclerViewContinents.setAdapter(adapter);
    }

    private void loadData() {
        continents.add("Asia");
        continents.add("Africa");
        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");
        continents.add("Australia");
    }


    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        String continent = continents.get(position);
        bundle.putString("Key", continent);
        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, countriesFragment).addToBackStack(null).commit();

    }
}
