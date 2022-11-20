package com.example.youtubeplayerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Account = (ImageButton) findViewById(R.id.Account);

        View.OnClickListener oclAccount = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (MainActivity.this, Profile.class);
                startActivity(intent);
            }
        };
//Событие при нажатии для перехода состояния
        Account.setOnClickListener(oclAccount);


        Button btn_Git = (Button) findViewById(R.id.btn_Git);
//Нахождение кнопки на форме
        View.OnClickListener oclBtn_Git = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (MainActivity.this, LVL_G.class);
                startActivity(intent);
            }
        };

        btn_Git.setOnClickListener(oclBtn_Git);


        Button btn_Sin = (Button) findViewById(R.id.btn_Sin);

        View.OnClickListener oclBtn_Sin = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (MainActivity.this, LVL_S.class);
                startActivity(intent);
            }
        };
//Событие для перехода на новую форму
        btn_Sin.setOnClickListener(oclBtn_Sin);


        Button btn_Bar = (Button) findViewById(R.id.btn_Bar);

        View.OnClickListener oclBtn_Bar = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (MainActivity.this, LVL_B.class);
                startActivity(intent);
            }
        };
//Событие для перехода на новую форму
        btn_Bar.setOnClickListener(oclBtn_Bar);


    }
}