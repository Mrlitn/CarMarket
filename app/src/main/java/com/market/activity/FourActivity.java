package com.market.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import main.java.com.carmarket.R;

/**
 * Created by litienan on 2017/7/4.
 */

public class FourActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
    }

    public void click(View view) {
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }

}
