package com.kg.marat_uulu_daniyar_3of3month.GameList;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

public class GameViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_game;
    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_game = itemView.findViewById(R.id.tv_game);
    }
    void bind(String game){tv_game.setText(game);}
}
