package com.example.myrecycleractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyAdapter.MyBluetoothDeviceItem> list = new ArrayList<>();
        list.add(new MyAdapter.MyBluetoothDeviceItem("Device1", "info..."));
        list.add(new MyAdapter.MyBluetoothDeviceItem("Device2", "info..."));

        MyAdapter adapter = new MyAdapter(this, list);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}