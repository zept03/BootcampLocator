package com.lozada.bootcamplocator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class LocationsAdapter extends RecyclerView.Adapter<LocationsViewHolder>{

    private ArrayList<LocationModel> locations;

    public LocationsAdapter(ArrayList<LocationModel> locations) {
        this.locations = locations;
    }

    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {
        final LocationModel location = locations.get(position);
        holder.updateUI(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load details page
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }
}
