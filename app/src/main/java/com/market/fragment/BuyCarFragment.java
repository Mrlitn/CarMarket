package com.market.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.market.activity.SearchActivity;
import com.market.tools.BaseFragment;
import com.market.views.MetionActivity;

import java.util.ArrayList;

import main.java.com.carmarket.R;

/**
 * 车行 tab1
 * Created by litienan on 2017/4/19.
 */

public class BuyCarFragment extends BaseFragment implements View.OnClickListener {
    private View view;
    private TextView tab1_search;
//    private AdPlayBanner mAdPlayBanner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.one, null);
        initView();
        return view;
    }

    public void initView() {
        tab1_search = (TextView) view.findViewById(R.id.tab1_search);
        tab1_search.setOnClickListener(this);

//        ArrayList<AdPageInfo> mDatas = new ArrayList<>();
//        AdPageInfo info1 = new AdPageInfo("拜仁球场冠绝全球", "http://onq81n53u.bkt.clouddn.com/photo1.jpg", "http://www.bairen.com", 1);
//        AdPageInfo info2 = new AdPageInfo("日落东单一起战斗", "http://onq81n53u.bkt.clouddn.com/photo2.jpg", "http://www.riluodongdan.com", 4);
//        AdPageInfo info3 = new AdPageInfo("香港夜景流连忘返", "http://onq81n53u.bkt.clouddn.com/photo3333.jpg", "http://www.hongkong.com", 2);
//        AdPageInfo info4 = new AdPageInfo("耐克大法绝顶天下", "http://7xrwkh.com1.z0.glb.clouddn.com/1.jpg", "http://www.nike.com", 3);
//
//        mDatas.add(info1);
//        mDatas.add(info2);
//        mDatas.add(info3);
//        mDatas.add(info4);
//
//        mAdPlayBanner = (AdPlayBanner) findViewById(R.id.ad_banner);
//        mAdPlayBanner
//                .setImageLoadType(GLIDE)
//                .setOnPageClickListener(new AdPlayBanner.OnPageClickListener() {
//                    @Override
//                    public void onPageClick(AdPageInfo info, int postion) {
//                        Toast.makeText(getActivity(), "你点击了图片 " + info.getTitle() + "\n 跳转链接为：" + info.getClickUlr() + "\n 当前位置是：" + postion +"\n 当前优先级是：" + info.getOrder(), Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .setAutoPlay(true)
//                .setIndicatorType(POINT_INDICATOR)
//                .setNumberViewColor(0xcc00A600, 0xccea0000, 0xffffffff)
//                .setInterval(3000)
//                .addTitleView(new TitleView(this).setPosition(PARENT_TOP).setTitlePadding(5, 5, 5, 5).setTitleMargin(0, 0, 0, 25).setTitleSize(16).setViewBackground(0x55000000).setTitleColor(getResources().getColor(R.color.white)))
//                .setBannerBackground(0xff000000)
//                .setPageTransfromer(new FadeInFadeOutTransformer())
//                .setInfoList((ArrayList<AdPageInfo>) mDatas)
//                .setUp();
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
