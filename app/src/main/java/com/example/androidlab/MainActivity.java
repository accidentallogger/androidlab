package com.example.androidlab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView backgroundImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.butt);
        backgroundImage = findViewById(R.id.backgroundImage);
        mediaPlayer = MediaPlayer.create(this, R.raw.yoo_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {

                    button.setText(editText.getText().toString());

                    mediaPlayer.start();

                    backgroundImage.setVisibility(View.VISIBLE);
                   new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            backgroundImage.setVisibility(View.GONE);
                        }
                    }, 1000);
                } else {

                    Toast.makeText(MainActivity.this, "Empty text box", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
