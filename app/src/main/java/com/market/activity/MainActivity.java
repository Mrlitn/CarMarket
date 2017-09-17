package com.market.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.market.bean.First;
import com.market.fragment.BuyCarFragment;
import com.market.fragment.MyFragment;
import com.market.fragment.SecondCarFragment;
import com.market.http.HttpTools;

import main.java.com.carmarket.R;

/**
 * 主页 加油
 * Created by litienan on 2017/4/19.
 */

public class MainActivity extends FragmentActivity implements View.OnTouchListener, View.OnClickListener {
    private BuyCarFragment buyCarFragment;
    private SecondCarFragment secondCarFragment;
    private MyFragment myFragment;
    private Fragment[] fragments;

    private ImageView touch;
    private TextView content, tab1, tab2, tab3;
    private int index, currentIndex;

    private Handler handler = new Handler() {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what) {
                case 1:
                    String s = (String) msg.obj;
                    Gson gson = new Gson();
                    First first = gson.fromJson(s, First.class);
                    content.setText(s);
                    break;

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = "\n" +
                "    {\"age\":11,\"name\":\"li\"}";
        Gson gson = new Gson();
        First first = gson.fromJson(s, First.class);
        Toast.makeText(this, first.getName(), Toast.LENGTH_SHORT).show();

        initView();
        allFragments();

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        switch (action) {
            case MotionEvent.ACTION_DOWN:

                break;

            case MotionEvent.ACTION_MOVE:

                break;
        }
        return super.onTouchEvent(event);
    }

    //初始化组件
    public void initView() {
        content = (TextView) findViewById(R.id.content);
        tab1 = (TextView) findViewById(R.id.tab1);
        tab2 = (TextView) findViewById(R.id.tab2);
        tab3 = (TextView) findViewById(R.id.tab3);

        touch = (ImageView) findViewById(R.id.touch);
        touch.setOnTouchListener(this);

        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);
    }

    public void allFragments() {
        buyCarFragment = new BuyCarFragment();
        secondCarFragment = new SecondCarFragment();
        myFragment = new MyFragment();
        fragments = new Fragment[]{buyCarFragment, secondCarFragment, myFragment};

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fcontext, fragments[0]).commit();
    }

    //get请求
    public void get(View view) {
        new Thread() {
            @Override
            public void run() {
                try {
                    String reslut = HttpTools.getUrl();

                    Message msg = Message.obtain();
                    msg.what = 1;
                    msg.obj = reslut;
                    handler.sendMessage(msg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab1:
                index = 0;
                break;

            case R.id.tab2:
                index = 1;
                break;

            case R.id.tab3:
                index = 2;
                break;
        }

        if (currentIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
            trx.hide(fragments[currentIndex]);

            if (!fragments[index].isAdded()) {
                trx.add(R.id.fcontext, fragments[index]);
            }
            trx.show(fragments[index]).commitAllowingStateLoss();
        }

        currentIndex = index;
    }

    private int lastX, lastY;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int eventX = (int) event.getRawX();
        int eventY = (int) event.getRawY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = eventX;
                lastY = eventY;

                break;
            case MotionEvent.ACTION_MOVE:
                int dx = eventX - lastX;
                int dy = eventY - lastY;

                int left = touch.getLeft() + dx;
                int right = touch.getRight() + dx;
                int top = touch.getTop() + dy;
                int bottom = touch.getBottom() + dy;

                touch.layout(left, top, right, bottom);

                lastX = eventX;
                lastY = eventY;
                break;

        }

        return true;
    }

}
