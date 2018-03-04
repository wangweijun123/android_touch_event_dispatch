package com.example.wangweijun.toucheventdispatch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by wangweijun on 2018/3/4.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("wang", "MyView dispatchTouchEvent : " + MainActivity.getAction(ev.getAction()));
        boolean flag = super.dispatchTouchEvent(ev);
        Log.i("wang", "MyView dispatchTouchEvent : " + MainActivity.getAction(ev.getAction()) + " " + flag);
        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("wang", "MyView onTouchEvent: " + MainActivity.getAction(event.getAction()));
        boolean flag = super.onTouchEvent(event);
        Log.i("wang", "MyView onTouchEvent: " + MainActivity.getAction(event.getAction()) + " " + flag);
        return flag;
    }
}
