package com.example.instagramhomepageclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context context;
    ArrayList<Model> models;

    public MyAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.text1.setText(models.get(position).getText1());
        holder.image1.setImageDrawable(context.getResources().getDrawable(models.get(position).getImage1()));
        holder.image2.setImageDrawable(context.getResources().getDrawable(models.get(position).getImage2()));
        holder.image3.setImageDrawable(context.getResources().getDrawable(models.get(position).getImage3()));
        holder.image4.setImageDrawable(context.getResources().getDrawable(models.get(position).getImage4()));
        holder.image5.setImageDrawable(context.getResources().getDrawable(models.get(position).getImage5()));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
