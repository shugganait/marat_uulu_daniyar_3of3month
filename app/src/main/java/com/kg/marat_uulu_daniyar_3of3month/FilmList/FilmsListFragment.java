package com.kg.marat_uulu_daniyar_3of3month.FilmList;

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

public class FilmsListFragment extends Fragment {
    private ArrayList<String> filmsList;
    private FilmAdapter filmAdapter;
    private RecyclerView recyclerViewOfFilms;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_films_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewOfFilms = requireActivity().findViewById(R.id.rv_films);
        loadData();
        filmAdapter = new FilmAdapter(filmsList);
        recyclerViewOfFilms.setAdapter(filmAdapter);
    }

    private void loadData() {
        filmsList = new ArrayList<>();
        filmsList.add("1. Во все тяжкое(2018)");
        filmsList.add("2. Волк с уолл-стрит(2013)");
        filmsList.add("3. Не смотри вверх(2021)");
        filmsList.add("4. Титаник(1997)");
        filmsList.add("5. Поймай меня если сможешь(2002)");
        filmsList.add("6. Шоу Трумана(1998)");
        filmsList.add("7. Джанго(2012)");
        filmsList.add("8. Побег из шоушенка(1994)");
        filmsList.add("9. Список Шиндлера (1993)");
        filmsList.add("10. Зеленая миля(1999)");
        filmsList.add("11. Гладиатор(2000)");
        filmsList.add("12. Варяг(2021)");
        filmsList.add("13.12 лет рабства(2013)");
        filmsList.add("14. Леон(1994) ");
        filmsList.add("15. Бойцовский клуб(1999)");
        filmsList.add("16. Хочу сьесть твою поджелудечную (2018)");
        filmsList.add("17. Остров проклятых(2010)");
        filmsList.add("18.Игры разума (2001)");
        filmsList.add("19. Пианист(2002)");
        filmsList.add("20.ЛАЛАЛЕНД(2016)");
        filmsList.add("21. Зеленая книга(2018)");
        filmsList.add("22. Богемская рапсодия(2018)");
        filmsList.add("23. ИНТЕРСТЕЛЛАР(2014) ");
        filmsList.add("24.Достучатся до небес(1997)");
        filmsList.add("25. Пока не сыграл в ящик(2007)");
        filmsList.add("26. Последний король Шотландии(2006)");
        filmsList.add("27.В погоне за счастьем(2006)");
        filmsList.add("28. В диких условиях (2007)");
        filmsList.add("29. Далласский клуб покупателей(2013)");
        filmsList.add("30. Законопослушный гражданин(2009) ");
        filmsList.add("31. Братья (2009)");
        filmsList.add("32. Свет в океане(2016)");
        filmsList.add("33. Джобс империя соблазна(2013)");
        filmsList.add("34. Кровью и потом Анаболики(2013)");
        filmsList.add("35. Социальная сеть(2010)");
        filmsList.add("36. Американский психо(2000)");
        filmsList.add("37. 1 год жизни(2020)");
        filmsList.add("38. Разрушение(2015)");
        filmsList.add("49. Изгой(2000)");
        filmsList.add("42. Человек дождя(1988)");
        filmsList.add("43. Криминальное чтиво(1994)");
        filmsList.add("44. Вавилон(2022)");
        filmsList.add("45. Американский психо(???)");
    }
}