package com.qq.qzone.a1336892373.fangchen;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class jiejueActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiejue);

        suipian();
    }

    private void suipian(){
        int leixin = getIntent().getIntExtra("leixin", 1);
        FragmentManager fm = getFragmentManager();
            if (leixin == 1)    fm.beginTransaction().replace( R.id.jiejue_container, new Fragment11() ).commit();
            if (leixin == 2)    fm.beginTransaction().replace( R.id.jiejue_container, new Fragment12() ).commit();
            if (leixin == 3)    fm.beginTransaction().replace( R.id.jiejue_container, new Fragment13() ).commit();
            if (leixin == 4)    fm.beginTransaction().replace( R.id.jiejue_container, new Fragment21() ).commit();
            if (leixin == 5)    fm.beginTransaction().replace( R.id.jiejue_container, new Fragment31() ).commit();

    }

}
