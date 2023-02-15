package com.kg.marat_uulu_daniyar_3of3month.FilmList;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmViewHolder> {
    private ArrayList<String> filmsAdapter;

    public FilmAdapter(ArrayList<String> filmsAdapter) {
        this.filmsAdapter = filmsAdapter;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.films_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(filmsAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return filmsAdapter.size();
    }
}
