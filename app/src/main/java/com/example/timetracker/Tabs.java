package com.example.timetracker;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;



public class Tabs extends AppCompatActivity {

    ImageButton BtnHobbi;
    ImageButton BtnRead;
    ImageButton BtnGames;
    ImageButton BtnSport;
    ImageButton BtnSleep;
    ImageButton BtnWork;
    ImageButton BtnStudy;
    ImageButton BtnCleaning;
    ImageButton BtnShop;
    ImageButton BtnWalk;
    ImageButton BtnInternet;
    ImageButton BtnLeisure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity);

        BtnHobbi = (ImageButton) findViewById(R.id.hobbi);
        BtnRead = (ImageButton) findViewById(R.id.read);
        BtnGames = (ImageButton) findViewById(R.id.games);
        BtnSport = (ImageButton) findViewById(R.id.sport);
        BtnSleep = (ImageButton) findViewById(R.id.sleep);
        BtnWork = (ImageButton) findViewById(R.id.work);
        BtnStudy = (ImageButton) findViewById(R.id.study);
        BtnCleaning = (ImageButton) findViewById(R.id.cleaning);
        BtnShop = (ImageButton) findViewById(R.id.shop);
        BtnWalk = (ImageButton) findViewById(R.id.walk);
        BtnInternet = (ImageButton) findViewById(R.id.internet);
        BtnLeisure = (ImageButton) findViewById(R.id.leisure);

        BtnHobbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, StatActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnCleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });

        BtnLeisure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isClickable()) {
                    Intent intent = new Intent();
                    intent.setClass(Tabs.this, TimerActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
