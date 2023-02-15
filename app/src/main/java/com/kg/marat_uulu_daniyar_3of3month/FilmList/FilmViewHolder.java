package com.kg.marat_uulu_daniyar_3of3month.FilmList;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

public class FilmViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_film;
    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_film = itemView.findViewById(R.id.tv_film);
    }
    void bind(String film){tv_film.setText(film);}
}
