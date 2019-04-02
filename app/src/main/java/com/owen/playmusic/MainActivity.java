package com.owen.playmusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay, btnPause, btnStop, btnReset;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btn_Play);
        btnPause = (Button) findViewById(R.id.btn_Pause);
        btnReset = (Button) findViewById(R.id.btn_Reset);
        btnStop = (Button)findViewById(R.id.btn_Stop);

        mediaPlayer = MediaPlayer.create(this, R.raw.verynicetumdo);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.pause();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.stop();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.reset();
            }
        });
    }
}
