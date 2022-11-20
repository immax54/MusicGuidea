package com.example.youtubeplayerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class Sin_Practic extends AppCompatActivity implements View.OnClickListener {
    Button button5;
    Button button4;
    SharedPreferences sharedPreferences;
    static int Sin1P;
    static int task2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_practic);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.buttonCompleteSin);
        button4.setOnClickListener(this);
//Нахождение компонентов с формы по id
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
         task2 = sharedPreferences.getInt("Task", Sin1P);
        Sin1P = task2;
//Запись выполнения урока
        if (Sin1P >0) {
            button4.setText("Выполнено");
            button4.setEnabled(false);
            button4.setBackgroundColor(Color.GREEN);
        }
    }
//Изменения свойства кнопки
    @Override
    public void onClick(View qq) {
        switch (qq.getId()) {
            case R.id.button5:
                Intent intent = new Intent(this, Sin_Main.class);
                startActivity(intent);
                break;
        }
        switch (qq.getId()) {
            case R.id.buttonCompleteSin:
                Sin1P +=10;
                button4.setEnabled(false);
                button4.setBackgroundColor(Color.GREEN);
                button4.setText("Выполнено");
                SharedPreferences prefs  = PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("Task", Sin1P);
                editor.commit();
                break;
        }
    }
}
//Переходы по формам и изменения свойств кнопки