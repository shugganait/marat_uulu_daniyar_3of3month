package com.kg.marat_uulu_daniyar_3of3month.GameList;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {
    private ArrayList<String> gameAdapter;

    public GameAdapter(ArrayList<String> gameAdapter) {
        this.gameAdapter = gameAdapter;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.game_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.bind(gameAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return gameAdapter.size();
    }
}
