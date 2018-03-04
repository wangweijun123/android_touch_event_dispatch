package com.example.wangweijun.toucheventdispatch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by wangweijun on 2018/3/4.
 */

public class MyLinearLayout extends LinearLayout {


    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("wang", "MyLinearLayout dispatchTouchEvent:" + MainActivity.getAction(ev.getAction()));
        boolean flag = super.dispatchTouchEvent(ev);
        Log.i("wang", "MyLinearLayout dispatchTouchEvent:" + MainActivity.getAction(ev.getAction()) + " " + flag);
        return flag;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("wang", "MyLinearLayout onInterceptTouchEvent : " + MainActivity.getAction(ev.getAction()));
        boolean flag = super.onInterceptTouchEvent(ev);
        Log.i("wang", "MyLinearLayout onInterceptTouchEvent : " + MainActivity.getAction(ev.getAction()) + " " + flag);
        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("wang", "MyLinearLayout onTouchEvent : " + MainActivity.getAction(event.getAction()));
        boolean flag = super.onTouchEvent(event);
        Log.i("wang", "MyLinearLayout onTouchEvent : " + MainActivity.getAction(event.getAction()) + " " + flag);
        return flag;
    }
}
