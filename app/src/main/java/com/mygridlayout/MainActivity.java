package com.mygridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView mRecyclerView;;
private List<Integer> mImages;
private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        mImages = new ArrayList<>();

        mImages.add(R.drawable.one);
        mImages.add(R.drawable.two);
        mImages.add(R.drawable.three);
        mImages.add(R.drawable.four);
        mImages.add(R.drawable.five);
        mImages.add(R.drawable.six);
        mImages.add(R.drawable.seven);
        mImages.add(R.drawable.eight);
        mImages.add(R.drawable.nine);
        mImages.add(R.drawable.ten);

        adapter = new MyAdapter(this,  mImages);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false );
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(adapter);
    }
}