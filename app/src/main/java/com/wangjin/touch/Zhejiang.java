package com.wangjin.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by wangjin on 16/3/20.
 */
public class Zhejiang extends LinearLayout {
    public Zhejiang(Context context) {
        super(context);
    }

    public Zhejiang(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean oa = true;
        Log.e("UUU", "浙江省:任务" + MotionEvent.actionToString(event.getAction()) + " 是否执行了?" + oa);
        return oa;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean oa = false;
        Log.e("UUU", "浙江省:任务" + MotionEvent.actionToString(ev.getAction()) + " 是否拦截自己执行?" + oa);
        return oa;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("UUU", "浙江省:任务" + MotionEvent.actionToString(ev.getAction()) + " 接收任务,分配任务");
        return super.dispatchTouchEvent(ev);
    }
}
