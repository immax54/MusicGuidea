package com.example.youtubeplayerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Sin_Main extends AppCompatActivity implements View.OnClickListener {
    Button button2;
    Button button3;
    Button ButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_main);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "g7ACnx_dFoM";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        //Вывод видео на плеер
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(this);
    }
//Нахождение компонентов с формы по id
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, Sin_Practic.class);
                startActivity(intent);
                break;
        }
        {
            switch (v.getId())
            {
                case R.id.button3:
                    Intent intent = new Intent(this, Sin_Teory.class);
                    startActivity(intent);
                    break;
            }
        }
        {
            switch (v.getId()) {
                case R.id.ButtonBack:
                    Intent intent = new Intent(this, LVL_S.class);
                    startActivity(intent);
                    break;
            }
        }
//Переходы по формам
    }
}