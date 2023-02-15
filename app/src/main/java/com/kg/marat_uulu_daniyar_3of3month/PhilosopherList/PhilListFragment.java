package com.kg.marat_uulu_daniyar_3of3month.PhilosopherList;

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

public class PhilListFragment extends Fragment {
    private ArrayList<String> philList;
    private RecyclerView recyclerViewOfPhils;
    private PhilAdapter philAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phil_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewOfPhils = requireView().findViewById(R.id.rv_philosopher);
        loadData();
        philAdapter = new PhilAdapter(philList);
        recyclerViewOfPhils.setAdapter(philAdapter);
    }

    private void loadData() {
        philList = new ArrayList<>();
        philList.add("Аристотель");
        philList.add("Фридрик Ницше");
        philList.add("Иммануиль Кант");
        philList.add("Сократ");
        philList.add("Апполодор");
        philList.add("Никколо Маккиавелли");
        philList.add("Карл Маркс");
        philList.add("Конфуций");
        philList.add("Гераклит");
        philList.add("Дэвид Юм");
        philList.add("Рене Декарт");
        philList.add("Платон");
        philList.add("Диоген");
        philList.add("Симона де Бувуар");
        philList.add("Томас Гоббс");
        philList.add("Аврелий Августин");
        philList.add("Абу Хамид аль-Газали");
        philList.add("Барон де Монтескье");
        philList.add("Джордж Беркли");
        philList.add("Айн Рэнд");
        philList.add("Ленин");
        philList.add("Александр Александров");
    }
}