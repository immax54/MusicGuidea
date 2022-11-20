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

public class guitar_Lesson10 extends AppCompatActivity implements View.OnClickListener {
    Button btn_Next;
    ImageButton btn_AB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_lesson10);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "v=PlDKjbn_QJQ";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        btn_Next = (Button) findViewById(R.id.btn_Next);
        btn_Next.setOnClickListener(this);
        btn_AB = (ImageButton) findViewById(R.id.btn_AB);
        btn_AB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btn_Next:
                Intent intent = new Intent(this, guitar_Lesson11.class);
                startActivity(intent);
                App.instance(this.getApplicationContext());
                App.instance().storeValueInt("GuitL10",3);
                break;
        }

        {
            switch (v.getId()) {
                case R.id.btn_AB:
                    Intent intent = new Intent(this, LVL_G.class);
                    startActivity(intent);
                    break;
            }
        }

    }
}