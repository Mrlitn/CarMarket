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

import com.market.activity.SearchActivity;
import com.market.tools.BaseFragment;
import com.market.views.MetionActivity;

import main.java.com.carmarket.R;

/**
 * 车行 tab1
 * Created by litienan on 2017/4/19.
 */

public class BuyCarFragment extends BaseFragment implements View.OnClickListener {
    private View view;

    private TextView tab1_search;

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
