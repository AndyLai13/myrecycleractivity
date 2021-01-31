package com.example.myrecycleractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<MyBluetoothDeviceItem> list;

    MyAdapter(Context context, ArrayList<MyBluetoothDeviceItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cell_bluetooth_item, parent, false);

        ViewHolder holder = new ViewHolder(view);
        holder.label = view.findViewById(R.id.label);
        holder.info = view.findViewById(R.id.info);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.label.setText(list.get(position).label);
        holder.info.setText(list.get(position).info);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView label;
        TextView info;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class MyBluetoothDeviceItem {
        String label;
        String info;
        MyBluetoothDeviceItem(String name, String info) {
            this.label = name;
            this.info = info;
        }
    }
}
