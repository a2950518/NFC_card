package com.egoist.profpan;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import su.levenetc.android.textsurface.TextSurface;


public class MainActivity extends Activity {
    private TextSurface textSurface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全螢幕
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        textSurface = (TextSurface) findViewById(R.id.text_surface);

        textSurface.postDelayed(new Runnable() {
            @Override
            public void run() {
                show();
            }
        }, 1000);

    }


    private void show() {
        textSurface.reset();
        CookieThumperSample.play(textSurface, getAssets());
    }


}
