package com.qq.qzone.a1336892373.fangchen;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import java.util.Timer;
import java.util.TimerTask;

public class AdsService extends Service {
    InterstitialAd mInterstitialAd;
    private Timer timer = new Timer();
    private boolean showing = false;
    private int ok = 0;
    private Handler myhandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            ok++;
            zhanshi();
            super.handleMessage(msg);
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        admob();
        TimerTask task = new TimerTask(){
            public void run() {
                myhandler.sendMessage(new Message());
            }
        };
        timer.schedule(task, 30000, 300000);

        MyReceiver myReceiver = new MyReceiver();               //Service动态注册监听注册
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.qq.qzone.a1336892373.fangchen.ads");
        registerReceiver(myReceiver, filter);
    }

    private void zhanshi(){
        if (!showing && mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
            showing = true;
        }

    }
    private void admob(){
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6630898560544189/6050523756");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                showing = false;
            }
        });
        requestNewInterstitial();
    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mInterstitialAd.loadAd(adRequest);
    }

    private void guangbo(){
        if (ok>1){
            zhanshi();
            ok = 1;
        }
    }

    private class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            guangbo();
        }
    }

}
