package com.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by litienan on 2017/8/8.
 */

public class TestView extends View {

    public TestView(Context context) {
        this(context, null);
    }

    public TestView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

//        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R)

    }

    //step1:会在初始化之后调用一到多次来测量控件或其中的子控件的宽高；
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    //step2:会在onMeasure()方法之后被调用一次，将控件或其子控件进行布局；
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

    //step3:会在onLayout()方法之后调用一次，也会在用户手指触摸屏幕时被调用多次，来绘制控件。
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /**
         * 1)  drawArc()：绘制圆弧；
         2)  drawBitmap()：绘制Bitmap图像；
         3)  drawCircle()：绘制圆圈；
         4)  drawLine()：绘制线条；
         5)  drawOval()：绘制椭圆；
         6)  drawPath()：绘制Path路径；
         7)  drawPicture()：绘制Picture图片；
         8)  drawRect()：绘制矩形；
         9)  drawRoundRect()：绘制圆角矩形；
         10) drawText()：绘制文本；
         11) drawVertices()：绘制顶点
         */

        /**
         * 1)  canvas.save()：把当前绘制的图像保存起来，让后续的操作相当于是在一个新图层上绘制；
         2)  canvas.restore()：把当前画布调整到上一个save()之前的状态；
         3)  canvas.translate(dx, dy)：把当前画布的原点移到(dx, dy)点，后续操作都以(dx, dy)点作为参照；
         4)  canvas.scale(x, y)：将当前画布在水平方向上缩放x倍，竖直方向上缩放y倍；
         5)  canvas.rotate(angle)：将当前画布顺时针旋转angle度。
         */

    }

}
