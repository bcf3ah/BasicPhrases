package tech.bfitzsimmons.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        String buttonId = view.getResources().getResourceEntryName(view.getId());
        int resourceId = getResources().getIdentifier(buttonId, "raw", getPackageName());
        mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
    }
}
