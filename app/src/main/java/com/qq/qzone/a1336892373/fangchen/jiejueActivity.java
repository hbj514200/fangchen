package com.qq.qzone.a1336892373.fangchen;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class jiejueActivity extends Activity {

    private Fragment jiejueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiejue);

        suipian();
    }

    private void suipian(){
        int leixin = getIntent().getIntExtra("leixin", 1);
        FragmentManager fm = getFragmentManager();
            if (leixin == 1)    jiejueFragment = new Fragment11();
            if (leixin == 2)    jiejueFragment = new Fragment12();
            if (leixin == 3)    jiejueFragment = new Fragment13();
            if (leixin == 4)    jiejueFragment = new Fragment21();
            if (leixin == 5)    jiejueFragment = new Fragment31();
        fm.beginTransaction().replace(R.id.jiejue_container, jiejueFragment).commit();
    }

}
