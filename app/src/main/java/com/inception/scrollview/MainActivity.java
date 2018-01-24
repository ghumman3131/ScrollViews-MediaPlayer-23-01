package com.inception.scrollview;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Boolean playing = false;

    MediaPlayer mp  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_layout);

      mp  = MediaPlayer.create(MainActivity.this , R.raw.mm);

    }



    public void green_music(View v)
    {

        if(playing)
        {
            mp.stop();
            playing = false;

        }

        else {

            mp.start();
            playing = true;
        }
    }
}
