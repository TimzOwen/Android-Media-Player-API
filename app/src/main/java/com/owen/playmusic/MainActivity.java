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
//find the ids of all the buttons relate to the click action
        btnPlay = (Button) findViewById(R.id.btn_Play);
        btnPause = (Button) findViewById(R.id.btn_Pause);
        btnReset = (Button) findViewById(R.id.btn_Reset);
        btnStop = (Button)findViewById(R.id.btn_Stop);
//immeadiately create / prepare the media file when the app is launch
        mediaPlayer = MediaPlayer.create(this, R.raw.verynicetumdo);
//start the media player from the beginneing
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.start();
            }
        });
//stops the ,usic . and resummes from the last stop
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
                //resets the song to its origin start position
                mediaPlayer.reset();
            }
        });
    }
}
