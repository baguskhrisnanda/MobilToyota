package com.example.mobiltoyota;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMobil;
    private ArrayList<Mobil> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMobil = findViewById(R.id.rv_mobil);
        rvMobil.setHasFixedSize(true);

        list.addAll(MobilData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        ListMobilAdapter listMobilAdapter = new ListMobilAdapter(list);
        rvMobil.setAdapter(listMobilAdapter);
    }
}