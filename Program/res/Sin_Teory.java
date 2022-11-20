package com.example.youtubeplayerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sin_Teory extends AppCompatActivity implements View.OnClickListener {
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_teory);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
    }
    @Override
    public void onClick(View ww) {
        switch (ww.getId()) {
            case R.id.button7:
                Intent intent = new Intent(this, Sin_Main.class);
                startActivity(intent);
                break;
        }
    }
}