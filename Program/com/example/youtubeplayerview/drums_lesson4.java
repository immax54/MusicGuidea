package com.example.youtubeplayerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class drums_lesson4 extends AppCompatActivity implements View.OnClickListener {
    Button btn_Next;
    ImageButton btn_AB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drums_lesson4);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
//Сохранение состояния при создании в суперклассе вывод формы по id из xml

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "TOLQt_U2Y";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
//Запуск видео в плеере
        btn_Next = (Button) findViewById(R.id.btn_Next);
        btn_Next.setOnClickListener(this);
        btn_AB = (ImageButton) findViewById(R.id.btn_AB);
        btn_AB.setOnClickListener(this);
    }
    //Взаимодействие с кнопками на форме
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btn_Next:
                Intent intent = new Intent(this, drums_lesson5.class);
                startActivity(intent);
                App.instance(this.getApplicationContext());
                App.instance().storeValueInt("DrumsL4",3);
                break;
        }
//Событие при нажатии для перехода к следующей форме и сохранение числа для вывода результата
        {
            switch (v.getId()) {
                case R.id.btn_AB:
                    Intent intent = new Intent(this, LVL_B.class);
                    startActivity(intent);
                    break;
            }
        }
//Событие при нажатии для перехода к форме выбора форм
    }
}