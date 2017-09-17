package com.market.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by litienan on 2017/7/4.
 */

public class MyBroacaset extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String name = intent.getStringExtra("name");
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
    }

}
