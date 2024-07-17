package com.geeks.countries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.geeks.countries.databinding.ItemCountryBinding;

import java.util.ArrayList;
import java.util.List;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountryViewHolder> {

    private ArrayList<String> countries;

    public CountriesAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        holder.onBind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;

        public CountryViewHolder( ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
        public void onBind (String country){
            binding.textViewCountry.setText(country);
        }
    }
}
