package com.market.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import main.java.com.carmarket.R;

/**
 * Created by litienan on 2017/8/3.
 */

public class MetionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motionactivity);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
