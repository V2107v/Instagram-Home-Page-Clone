package com.example.instagramhomepageclone;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView text1;
    ImageView image1, image2, image3, image4, image5;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        text1 = itemView.findViewById(R.id.text1);
        image1 = itemView.findViewById(R.id.image1);
        image2 = itemView.findViewById(R.id.image2);
        image3 = itemView.findViewById(R.id.image3);
        image4 = itemView.findViewById(R.id.image4);
        image5 = itemView.findViewById(R.id.image5);
    }
}
