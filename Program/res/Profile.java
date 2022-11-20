package com.example.youtubeplayerview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Profile extends AppCompatActivity implements View.OnClickListener {

    Button button_practic;
    EditText editText;
    TextView textView5;
    TextView textView9;
    TextView textView8;
    int count;
    ProgressBar progressBar;
    ProgressBar progressBar1;
    ProgressBar progressBar2;
    Button button3;
    ImageButton btn_AB;
    public static SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.instance(this.getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editText = (EditText) findViewById(R.id.editText);
        progressBar = findViewById(R.id.progressBar2);
        progressBar1 = findViewById(R.id.progressBar);
        progressBar2 = findViewById(R.id.progressBar3);
        textView5 = findViewById(R.id.textView5);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        editText.setText(App.instance().fetchValueStringStr("Name"));
        //Связь с компонентами по ID

        for (int i=1;i<=12;i++)
        {
            String s;
            s = "GuitL"+String.valueOf(i);
            count = count + (App.instance().fetchValueString(s));
        }

        for (int i=1;i<=12;i++)
        {
            String s;
            s = "SinL"+String.valueOf(i);
            count = count + (App.instance().fetchValueString(s));
        }
        for (int i=1;i<=12;i++)
        {
            String s;
            s = "DrumsL"+String.valueOf(i);
            count = count + (App.instance().fetchValueString(s));
        }
//Подсчет выполнения уроков и вывод в общий результат


        textView5.setText(count + "%");
        textView8.setText(count + "%");
        textView9.setText(count + "%");
        progressBar.setProgress(count);
        progressBar1.setProgress(count);
        progressBar2.setProgress(count);
//Вывод прогресса на форму
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        btn_AB = (ImageButton) findViewById(R.id.btn_AB);
        btn_AB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
        {

            switch (v.getId()) {
                case R.id.btn_AB:
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
            }
            {
                switch (v.getId()) {
                    case R.id.button3:
                        Intent intent = new Intent(this, Profile.class);
                        startActivity(intent);
                        App.instance().storeValueString("Name",(editText.getText().toString()));
                        for (int i=1;i<=12;i++)
                    {
                        String s;
                        s = "GuitL"+String.valueOf(i);
                        App.instance().storeValueInt(s, 0);
                    }
                        for (int i=1;i<=12;i++)
                        {
                            String s;
                            s = "DrumsL"+String.valueOf(i);
                            App.instance().storeValueInt(s, 0);
                        }

                        for (int i=1;i<=12;i++)
                        {
                            String s;
                            s = "SinL"+String.valueOf(i);
                            App.instance().storeValueInt(s, 0);
                        }
                        //Нахождение чисел по id из уроков и вывод их числа из таблицы

                        textView5.setText(count + "%");
                        textView8.setText(count + "%");
                        textView9.setText(count + "%");
                        progressBar.setProgress(count);
                        progressBar1.setProgress(count);
                        progressBar2.setProgress(count);
                        break;
                        //Вывод на форму прогресса
                }
            }
        }
}