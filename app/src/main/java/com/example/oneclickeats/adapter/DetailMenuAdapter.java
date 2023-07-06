package com.example.oneclickeats.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.oneclickeats.R;
import com.example.oneclickeats.models.DetailMenuModel;

import java.util.List;

public class DetailMenuAdapter extends RecyclerView.Adapter<DetailMenuAdapter.ViewHolder> {
    List<DetailMenuModel> list;

    public DetailMenuAdapter(List<DetailMenuModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_menu_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getPrice());
        holder.description.setText(list.get(position).getDesciption());
        holder.rating.setText(list.get(position).getRating());
        holder.timing.setText(list.get(position).getTiming());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,price,description,rating,timing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detail_img);
            name = itemView.findViewById(R.id.detail_name);
            price = itemView.findViewById(R.id.detail_price);
            description = itemView.findViewById(R.id.detail_description);
            rating = itemView.findViewById(R.id.detail_rating);
            timing = itemView.findViewById(R.id.timing);
        }
    }
}
