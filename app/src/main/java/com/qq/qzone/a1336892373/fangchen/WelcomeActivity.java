package com.qq.qzone.a1336892373.fangchen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try { Thread.sleep(2500); } catch (Exception e) { }
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                finish();
            }
        }).start();
    }

}
