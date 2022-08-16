package com.loogibot.flashcard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Objects;

public class SplashScreen extends AppCompatActivity {

    TextView flashCardTitle;
    ConstraintSet.Motion m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // remove appbar on top for splash screen
        Objects.requireNonNull(getSupportActionBar()).hide();

        flashCardTitle = findViewById(R.id.flash_card_title);

        // fade animation

//        AlphaAnimation alphaTo0 = new AlphaAnimation(0.0f, 1.0f);
//        alphaTo0.setDuration(1000);
//        alphaTo0.setRepeatMode(Animation.REVERSE);
//        flashCardTitle.startAnimation(alphaTo0);
        // movement animation


        new Handler().postDelayed(() -> { // switches to MainActivity after delay
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();
        },2000); // delay in milliseconds
    }

}
