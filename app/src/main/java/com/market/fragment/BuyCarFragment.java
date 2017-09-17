package com.market.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.market.activity.SearchActivity;
import com.market.adapter.TabOneAdAdapter;
import com.market.tools.BaseFragment;

import java.util.ArrayList;

import main.java.com.carmarket.R;

/**
 * 车行 tab1
 * Created by litienan on 2017/4/19.
 */

public class BuyCarFragment extends BaseFragment implements View.OnClickListener {
    private View view;
    private TextView tab1_search, ad_txt;

    private ViewPager ad_page;
    private LinearLayout ll_point;
    private TabOneAdAdapter adapter;
    private ArrayList<ImageView> arrayList;
    private int prePosition = 0;
    private boolean isDragging = false;

    private int[] ad_imgs = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    private String[] ad_txts = {"img1", "img2", "img3", "img4", "img5"};

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            int item = ad_page.getCurrentItem() + 1;
            ad_page.setCurrentItem(item);

            if (item >= ad_imgs.length) {
                ad_page.setCurrentItem(0);
            } else {
                ad_page.setCurrentItem(item);
            }

            handler.sendEmptyMessageDelayed(0, 3000);
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.one, null);
        initView();
        return view;
    }

    public void initView() {
        tab1_search = (TextView) view.findViewById(R.id.tab1_search);

        ad_txt = (TextView) view.findViewById(R.id.ad_txt);
        ad_page = (ViewPager) view.findViewById(R.id.ad_page);
        ll_point = (LinearLayout) view.findViewById(R.id.ll_point);
        ad_txt.setText(ad_txts[prePosition]);

        arrayList = new ArrayList<>();

        for (int i = 0; i < ad_imgs.length; i++) {
            ImageView iv = new ImageView(getActivity());
            iv.setBackgroundResource(ad_imgs[i]);
            arrayList.add(iv);

            ImageView point = new ImageView(getActivity());
            point.setBackgroundResource(R.drawable.point_seleter);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(8, 8);

            if (i == 0) {
                point.setEnabled(true);
            } else {
                point.setEnabled(false);
                params.leftMargin = 8;
            }

            point.setLayoutParams(params);
            ll_point.addView(point);
        }

        handler.sendEmptyMessageDelayed(0, 2000);

        ad_page.setAdapter(new TabOneAdAdapter(getActivity(), arrayList, handler));
        ad_page.addOnPageChangeListener(new MyPageChangeLister());
        tab1_search.setOnClickListener(this);
    }

    class MyPageChangeLister implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            ad_txt.setText(ad_txts[position]);
            ll_point.getChildAt(position).setEnabled(true);
            ll_point.getChildAt(prePosition).setEnabled(false);
            prePosition = position;
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_DRAGGING) {
                isDragging = true;
                handler.removeCallbacksAndMessages(null);
            } else if (state == ViewPager.SCROLL_STATE_SETTLING) {

            } else if (state == ViewPager.SCROLL_STATE_IDLE && isDragging) {
                isDragging = false;
                handler.removeCallbacksAndMessages(null);
                handler.sendEmptyMessageDelayed(0, 2000);
            }
        }

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tab1_search:
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
                break;
        }

    }

}
