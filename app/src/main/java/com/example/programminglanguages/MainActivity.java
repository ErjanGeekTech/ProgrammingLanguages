package com.example.programminglanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LanguagesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_rv);


        List<LanguagesModel> list = new ArrayList<>();
        list = Server.getData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LanguagesAdapter(list, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}