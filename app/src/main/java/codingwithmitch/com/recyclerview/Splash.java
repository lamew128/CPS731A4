package codingwithmitch.com.recyclerview;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer mBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mBgm = new MediaPlayer();
        mBgm = MediaPlayer.create(this,R.raw.bgm);
        mBgm.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                mBgm.stop();
                startActivity(new Intent(Splash.this, ItemListActivity.class));

            }
        };
        Timer oppening= new Timer();
        oppening.schedule(task,5000);
    }
}