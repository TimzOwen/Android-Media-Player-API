package com.owen.playmusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
<<<<<<< HEAD

        mediaPlayer = MediaPlayer.create(this, R.raw.color_dusty_yellow);

=======
//immeadiately create / prepare the media file when the app is launch
        mediaPlayer = MediaPlayer.create(this, R.raw.verynicetumdo);
//start the media player from the beginneing
>>>>>>> 8d93e91c4a896e33aaa76c1b742913b33e673bf9
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {
                   @Override
                    public void onCompletion(MediaPlayer mediaPlayer)
                   {
                       Toast.makeText(MainActivity.this, "Done playing", Toast.LENGTH_SHORT).show();
                   }
                });
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

package com.owen.mediaplayerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    Button btnPause;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the Media player to play from Local raw file
        mediaPlayer = MediaPlayer.create(this,R.raw.diamondeneka );

        //create the music to play from the URI sourced system
        Uri myUri = new Uri(recreate();
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(getApplicationContext(), myUri);
        mediaPlayer.prepare();
        mediaPlayer.start();

        //platiny from requestion an HTTP . Make sure to have eventHandlers to avoid UI crushing
        String player = "https:www.mdudo.com/diamond";
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(player);
        mediaPlayer.prepare();
        mediaPlayer.start();

        btnPlay = findViewById(R.id.play_music);
        btnPause = findViewById(R.id.pause_music);

        //play the music as a raw local file
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }
}
