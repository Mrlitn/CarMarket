package com.market.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 车名索引
 * Created by litienan on 2017/9/20.
 */

public class IndexViews extends View {
    private String[] words = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private int itemWidth, itemHeight;
    private Paint paint;
    private int touchIndex = -1;

    public IndexViews(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setTextSize(20.0f);
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);  //抗锯齿
        paint.setTypeface(Typeface.DEFAULT_BOLD); //字体
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                float y = event.getY();
                int index = (int) (y / itemHeight);

                if (index != touchIndex) {
                    touchIndex = index;
                    invalidate();

                    if (lister != null && touchIndex < words.length && touchIndex >= 0) {
                        lister.show(words[touchIndex]);
                    }
                }

                break;

            case MotionEvent.ACTION_UP:
                touchIndex = -1;
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        itemWidth = getMeasuredWidth();
        itemHeight = getMeasuredHeight() / words.length;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i = 0; i < words.length; i++) {

            if (touchIndex == i) {
                paint.setTextSize(30.0f);
                paint.setColor(Color.GRAY);
            } else {
                paint.setTextSize(20.0f);
                paint.setColor(Color.WHITE);
            }


            String word = words[i];

            Rect rect = new Rect();
            paint.getTextBounds(word, 0, 1, rect);

            int wordWidth = rect.width();
            int wordHeight = rect.height();

            float wordX = itemWidth / 2 - wordWidth / 2;
            float wordY = itemHeight / 2 + wordHeight / 2 + i * itemHeight;

            canvas.drawText(word, wordX, wordY, paint);

        }

    }

    public interface OnTouchIndexLister {
        void show(String word);
    }

    public OnTouchIndexLister lister;

    public void setLister(OnTouchIndexLister lister) {
        this.lister = lister;
    }
}
