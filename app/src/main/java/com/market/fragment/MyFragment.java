package com.market.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.market.tools.BaseFragment;

import main.java.com.carmarket.R;

/**
 * tab3 个人
 * Created by litienan on 2017/4/19.
 */

public class MyFragment extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.three, null);
        initView();
        return view;
    }

    //
    public void initView() {

    }

}
