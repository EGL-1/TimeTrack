package com.example.timetracker;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StatActivity extends AppCompatActivity {

        String[] activities = new String[] {"Хобби", "Чтение", "Игры", "Спорт", "Сон", "Работа",
                "Учёба", "Уборка", "Магазин", "Прогулка", "Интернет", "Досуг"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

        ListView lvStats = (ListView) findViewById(R.id.lvStats);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activities);

        lvStats.setAdapter(adapter);
    }
}
