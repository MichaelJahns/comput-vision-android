package com.michaeljahns.computervision;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] transformTypes;
    String[] transformDescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transformTypes = getResources().getStringArray(R.array.transform_types);
        transformDescriptions = getResources().getStringArray(R.array.transform_descriptions);

        recyclerView = findViewById(R.id.recyclerView);
        TransformAdapter transformAdapter = new TransformAdapter(this, transformTypes, transformDescriptions);
        recyclerView.setAdapter(transformAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}