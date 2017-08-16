package com.market.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

import main.java.com.carmarket.R;

/**
 * Created by litienan on 2017/7/4.
 */

public class OneActivity extends Activity {
    private Imusic music;
    private MyServices services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        Intent intent = new Intent(this, oneService.class);
        startService(intent);

        services = new MyServices();
        bindService(intent, services, BIND_AUTO_CREATE);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(services);
    }

    public void click(View view) {
        music.iPlay();
    }

    public void click1(View view) {
        music.iPause();
    }

    public void click2(View view) {
        music.iStop();
    }

    //广播
    public void click3(View view) {
        Intent intent = new Intent();
        intent.setAction("com.litn.good");
        intent.putExtra("name", "货到了！！");
        sendBroadcast(intent);
    }

    public void click4(View view) {
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }

    public class MyServices implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            music = (Imusic) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }

}
