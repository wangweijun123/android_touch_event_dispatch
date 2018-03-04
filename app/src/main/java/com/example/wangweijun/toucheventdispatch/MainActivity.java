package com.example.wangweijun.toucheventdispatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("wang", "MainActivity dispatchTouchEvent:"+getAction(ev.getAction()));
        boolean flag = super.dispatchTouchEvent(ev);
        Log.i("wang", "MainActivity dispatchTouchEvent:"+getAction(ev.getAction()) + " "+flag);
        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("wang", "MainActivity onTouchEvent :"+getAction(event.getAction()));
        boolean flag = super.onTouchEvent(event);
        Log.i("wang", "MainActivity onTouchEvent :"+getAction(event.getAction()) + " "+flag);
        return flag;
    }

    public static String getAction(int action){
        String result = "";
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                result = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                result = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                result = "ACTION_UP";
                break;
        }
        return result;
    }
}
