package com.kg.marat_uulu_daniyar_3of3month.GameList;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kg.marat_uulu_daniyar_3of3month.R;

import java.util.ArrayList;

public class GameListFragment extends Fragment {
    ArrayList<String> gameList;
    GameAdapter gameAdapter;
    RecyclerView recyclerViewOfGame;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_list, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        recyclerViewOfGame = requireActivity().findViewById(R.id.rv_game);
        loadData();
        gameAdapter = new GameAdapter(gameList);
        recyclerViewOfGame.setAdapter(gameAdapter);
    }

    private void loadData() {
        gameList = new ArrayList<>();
        gameList.add("Assassin's creed");
        gameList.add("Assassin's creed 2");
        gameList.add("Assassin's creed brotherhood (Легендарная игра)");
        gameList.add("Assassin's creed revelations");
        gameList.add("Assassin's creed 3");
        gameList.add("Assassin's creed 4 black flag ");
        gameList.add("Assassin's creed freedom cry");
        gameList.add("Assassin's creed Unity");
        gameList.add("Assassin's creed Origins");
        gameList.add("Assassin's creed Valhalla");
        gameList.add("Mafia 2");
        gameList.add("Far cry 3");
        gameList.add("Far cry 5");
        gameList.add("Call of duty modern warfare 4");
        gameList.add("The walking dead (Definitive edition + all seasons)");
        gameList.add("Gta san andreas");
        gameList.add("Driver san francisco");
        gameList.add("Resident Evil Village");
        gameList.add("Watch Dogs 2");
        gameList.add("Metro 2033");
        gameList.add("Metro Last light");
        gameList.add("Metro exodus");
        gameList.add("Witcher 2");
        gameList.add("Skyrim");
        gameList.add("God of War 4");
        gameList.add("Stray");
        gameList.add("Need fo speed Most wanted (2007)");
        gameList.add("left 4 dead");
        gameList.add("left 4 dead 2");
        gameList.add("BattleField 2");
        gameList.add("Prototype");
        gameList.add("Stalker call of Pripyat");
        gameList.add("Mortal Combat 9");
        gameList.add("Plant vs Zombies");
        gameList.add("Tank-o-box");
    }
}