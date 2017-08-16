package com.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by litienan on 2017/7/10.
 */

public class MyView extends View {

    public MyView(Context context, AttributeSet set) {
        super(context, set);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

}
