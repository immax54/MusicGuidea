package com.example.youtubeplayerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LVL_S extends AppCompatActivity implements View.OnClickListener {
    Button btn_les1;
    Button btn_les2;
    Button btn_les3;
    Button btn_les_lub1;
    Button btn_les_lub2;
    Button btn_les_lub3;
    Button btn_les_prod1;
    Button btn_les_prod2;
    Button btn_les_prod3;
    Button btn_les_pro1;
    Button btn_les_pro2;
    Button btn_les_pro3;
    ImageButton btn_AB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl_sintezator);
        btn_les1 = (Button) findViewById(R.id.btn_les1);
        btn_les1.setOnClickListener(this);
        btn_les2 = (Button) findViewById(R.id.btn_les2);
        btn_les2.setOnClickListener(this);
        btn_les3 = (Button) findViewById(R.id.btn_les3);
        btn_les3.setOnClickListener(this);
        btn_AB = (ImageButton) findViewById(R.id.btn_AB);
        btn_AB.setOnClickListener(this);
        btn_les_lub1 = (Button) findViewById(R.id.btn_les_lub1);
        btn_les_lub1.setOnClickListener(this);
        btn_les_lub2 = (Button) findViewById(R.id.btn_les_lub2);
        btn_les_lub2.setOnClickListener(this);
        btn_les_lub3 = (Button) findViewById(R.id.btn_les_lub3);
        btn_les_lub3.setOnClickListener(this);
        btn_les_prod1 = (Button) findViewById(R.id.btn_les_prod1);
        btn_les_prod1.setOnClickListener(this);
        btn_les_prod2 = (Button) findViewById(R.id.btn_les_prod2);
        btn_les_prod2.setOnClickListener(this);
        btn_les_prod3 = (Button) findViewById(R.id.btn_les_prod3);
        btn_les_prod3.setOnClickListener(this);
        btn_les_pro1 = (Button) findViewById(R.id.btn_les_pro1);
        btn_les_pro1.setOnClickListener(this);
        btn_les_pro2 = (Button) findViewById(R.id.btn_les_pro2);
        btn_les_pro2.setOnClickListener(this);
        btn_les_pro3 = (Button) findViewById(R.id.btn_les_pro3);
        btn_les_pro3.setOnClickListener(this);
    }

    @Override
    public void onClick(View qq) {
        switch (qq.getId()) {
            case R.id.btn_les1:
                Intent intent = new Intent(this, sin_lesson1.class);
                startActivity(intent);
                break;
        }
        {
            switch (qq.getId()) {
                case R.id.btn_AB:
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les3:
                    Intent intent = new Intent(this, sin_lesson3.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les2:
                    Intent intent = new Intent(this, sin_lesson2.class);
                    startActivity(intent);
                    break;
            }

        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_lub1:
                    Intent intent = new Intent(this, sin_lesson4.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_lub2:
                    Intent intent = new Intent(this, sin_lesson5.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_lub3:
                    Intent intent = new Intent(this, sin_lesson6.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_prod1:
                    Intent intent = new Intent(this, sin_lesson7.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_prod2:
                    Intent intent = new Intent(this, guitar_Lesson8.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_prod3:
                    Intent intent = new Intent(this, guitar_Lesson9.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_pro1:
                    Intent intent = new Intent(this, guitar_Lesson10.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_pro2:
                    Intent intent = new Intent(this, guitar_Lesson11.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (qq.getId()) {
                case R.id.btn_les_pro3:
                    Intent intent = new Intent(this, guitar_Lesson12.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}