package com.loogibot.flashcard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    TextView flashCardTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // remove appbar on top for splash screen
        Objects.requireNonNull(getSupportActionBar()).hide();

        flashCardTitle = findViewById(R.id.flash_card_title);


        new Handler().postDelayed(() -> { // switches to MainActivity after delay
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();
        },2000); // delay in milliseconds
    }
}