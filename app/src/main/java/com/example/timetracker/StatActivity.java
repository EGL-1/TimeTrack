package com.example.timetracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StatActivity extends AppCompatActivity {

    String[] activities = new String[] {"Хобби", "Чтение", "Игры", "Спорт", "Сон", "Работа",
            "Учёба", "Уборка", "Магазин", "Прогулка", "Интернет", "Досуг"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

        // Создание подключения к базе
        DataBase dataBase = new DataBase(this);
        // Получение всех записей
        ArrayList<Track> allTrack = dataBase.getT();

        ListView lvStats = (ListView) findViewById(R.id.lvStats);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activities);

        lvStats.setAdapter(adapter);
    }
}
