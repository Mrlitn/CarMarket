package com.market.fragment;

import android.os.Bundle;
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.three, null);
        initView();
        return view;
    }

    //
    public void initView() {

    }

}
