package com.kg.marat_uulu_daniyar_3of3month.PhilosopherList;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

import java.util.ArrayList;

public class PhilAdapter extends RecyclerView.Adapter<PhilViewHolder> {
    private ArrayList<String> philAdapter;

    public PhilAdapter(ArrayList<String> philAdapter) {
        this.philAdapter = philAdapter;
    }

    @NonNull
    @Override
    public PhilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhilViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.philosopher_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhilViewHolder holder, int position) {
        holder.bind(philAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return philAdapter.size();
    }
}
