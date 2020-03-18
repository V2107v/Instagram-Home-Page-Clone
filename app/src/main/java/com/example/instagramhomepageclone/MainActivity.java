package com.example.instagramhomepageclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    ArrayList<Model> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpBottomNav();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        models.add(new Model("joey",R.drawable.man,R.drawable.game,R.drawable.heart,R.drawable.comment,R.drawable.share));
        models.add(new Model("monica",R.drawable.woman,R.drawable.scenery,R.drawable.redheart,R.drawable.comment,R.drawable.share));
        models.add(new Model("pheobe",R.drawable.woman,R.drawable.building,R.drawable.heart,R.drawable.comment,R.drawable.share));
        models.add(new Model("ross",R.drawable.man,R.drawable.food,R.drawable.redheart,R.drawable.comment,R.drawable.share));
        models.add(new Model("rachel",R.drawable.woman,R.drawable.beauty,R.drawable.heart,R.drawable.comment,R.drawable.share));
        models.add(new Model("chandler",R.drawable.man,R.drawable.car,R.drawable.redheart,R.drawable.comment,R.drawable.share));

        myAdapter = new MyAdapter(this,models);
        recyclerView.setAdapter(myAdapter);
    }

    private void setUpBottomNav () {
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottomNav);
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
