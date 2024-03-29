package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private LinearLayoutManager layoutManager ;

    private ArrayList<dataModel> dataSet;

    private CustomeAdapter adapter ;

    private MediaPlayer mediaPlayer;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);



        recyclerView = findViewById(R.id.res);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dataSet = new ArrayList<>() ;

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for (int i=0 ; i<MyData.drawableArray.length ; i++ )
        {
            dataSet.add(new dataModel(
                    MyData.versionArray[i],
                    MyData.nameArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }

        adapter = new CustomeAdapter(dataSet);
        recyclerView.setAdapter(adapter);

        }





}