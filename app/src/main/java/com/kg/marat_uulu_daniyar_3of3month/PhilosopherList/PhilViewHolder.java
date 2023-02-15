package com.kg.marat_uulu_daniyar_3of3month.PhilosopherList;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kg.marat_uulu_daniyar_3of3month.R;

public class PhilViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_phil;
    public PhilViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_phil = itemView.findViewById(R.id.tv_phil);
    }
    void bind(String phil){
        tv_phil.setText(phil);
    }
}
