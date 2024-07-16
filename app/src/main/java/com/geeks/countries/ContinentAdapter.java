package com.geeks.countries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private List<Continent> continents;

    public ContinentAdapter(List<Continent> continents) {
        this.continents = continents;
    }

    @Override
    public ContinentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false);
        return new ContinentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContinentViewHolder holder, int position) {
        holder.textView.setText(continents.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ContinentViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_continent);
        }
    }
}