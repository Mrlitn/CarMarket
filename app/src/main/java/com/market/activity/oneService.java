package com.market.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by litienan on 2017/7/4.
 */

public class oneService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.print("onBind");
        return new ServiceBinder();
    }

    public void play() {
        Toast.makeText(getApplicationContext(), "播放", Toast.LENGTH_SHORT).show();
    }

    public void pause() {
        Toast.makeText(getApplicationContext(), "停止", Toast.LENGTH_SHORT).show();
    }

    public void stop() {
        Toast.makeText(getApplicationContext(), "暂停", Toast.LENGTH_SHORT).show();
    }

    private class ServiceBinder extends Binder implements Imusic {

        @Override
        public void iPlay() {
            play();
        }

        @Override
        public void iPause() {
            pause();
        }

        @Override
        public void iStop() {
            stop();
        }
    }

}
