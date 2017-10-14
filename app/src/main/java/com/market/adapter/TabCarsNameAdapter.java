package com.market.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.market.bean.CarsNameList;
import com.market.tools.PinYinUtils;

import java.util.Collections;
import java.util.Comparator;

import main.java.com.carmarket.R;

/**
 * 车名列表适配器
 * Created by litienan on 2017/9/20.
 */

public class TabCarsNameAdapter extends BaseAdapter {
    private Context context;
    private CarsNameList list;

    public TabCarsNameAdapter(Context context) {
        this.context = context;
        list = new CarsNameList();
    }

    @Override
    public int getCount() {
        return list.getListNames().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.carsitem, null);
            holder = new ViewHolder();
            holder.car_name = (TextView) convertView.findViewById(R.id.car_name);
            holder.car_word = (TextView) convertView.findViewById(R.id.car_word);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String pinYin = PinYinUtils.getPinYin(list.getListNames().get(position).toString()).toUpperCase().substring(0, 1);
        String name = list.getListNames().get(position).toString();
//        String pinYin = PinYinUtils.getPinYinHeadChar(list.getListNames().get(position).toString());

        //排序比较
//        Collections.sort(list.getListNames(), new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        if (name != null) {
            holder.car_name.setText(name);
        }

        if (pinYin != null) {
            holder.car_word.setText(pinYin);
        }
        if (position == 0) {
            holder.car_word.setVisibility(View.VISIBLE);
        } else {
            String preWord = PinYinUtils.getPinYin(list.getListNames().get(position - 1).toString()).toUpperCase().substring(0, 1);

            if (pinYin.equals(preWord) && preWord != null) {
                holder.car_word.setVisibility(View.GONE);
            } else {
                holder.car_word.setVisibility(View.VISIBLE);
            }
        }

        return convertView;
    }

    static class ViewHolder {
        TextView car_word, car_name;
    }
}

