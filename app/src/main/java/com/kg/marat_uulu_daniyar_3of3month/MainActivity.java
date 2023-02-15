package com.kg.marat_uulu_daniyar_3of3month;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kg.marat_uulu_daniyar_3of3month.FilmList.FilmsListFragment;
import com.kg.marat_uulu_daniyar_3of3month.GameList.GameListFragment;
import com.kg.marat_uulu_daniyar_3of3month.PhilosopherList.PhilListFragment;

public class MainActivity extends AppCompatActivity {
    private Button btn_filmList, btn_gameList, btn_philList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        btn_filmList.setOnClickListener(view -> {
            if(savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new FilmsListFragment()).addToBackStack(null).commit();
            }
        });

        btn_philList.setOnClickListener(view -> {
            if(savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_container, new PhilListFragment()).addToBackStack(null).commit();
            }
        });
        btn_gameList.setOnClickListener(view -> {
            if(savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new GameListFragment()).addToBackStack(null).commit();
            }
        });


    }




    private void initView() {
        btn_filmList = findViewById(R.id.btn_filmList);
        btn_gameList = findViewById(R.id.btn_gamesList);
        btn_philList = findViewById(R.id.btn_philList);
    }
}