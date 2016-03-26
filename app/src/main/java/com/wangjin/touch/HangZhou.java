package com.wangjin.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by wangjin on 16/3/26.
 */
public class HangZhou extends TextView {
    public HangZhou(Context context) {
        super(context);
    }

    public HangZhou(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean oa = false;
        Log.e("UUU", "杭州:任务" + MotionEvent.actionToString(event.getAction()) + ", 是否执行了?" + oa);
        return oa;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("UUU", "杭州:任务" + MotionEvent.actionToString(ev.getAction()) + ",接收任务,分配任务");
        return super.dispatchTouchEvent(ev);
    }
}
