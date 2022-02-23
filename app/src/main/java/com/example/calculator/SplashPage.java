package com.example.calculator;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

public class SplashPage extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TextView display;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashpage);
        display=findViewById(R.id.textview);


        Animation animation= AnimationUtils.loadAnimation(this,R.anim.move_down);
        display.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                ConstraintLayout constraintLayout =findViewById(R.id.splashpage);
                AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
                animationDrawable.setEnterFadeDuration(2500);
                animationDrawable.setExitFadeDuration(5000);
                animationDrawable.start();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(SplashPage.this,MainActivity.class);
                startActivity(intent);
                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }
}
