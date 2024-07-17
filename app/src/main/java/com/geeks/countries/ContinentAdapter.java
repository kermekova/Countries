package com.geeks.countries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.countries.databinding.ItemContinentBinding;
import com.geeks.countries.databinding.ItemCountryBinding;

import java.util.ArrayList;
import java.util.List;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<String> continents;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<String> continents, OnItemClick onClick) {
        this.continents = continents;
        this.onItemClick = onClick;
    }

    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(continents.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

}

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ItemContinentBinding binding;

        public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void onBind (String continent){
            binding.textViewContinent.setText(continent);
        }
    }
