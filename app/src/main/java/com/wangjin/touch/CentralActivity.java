package com.wangjin.touch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by wangjin on 16/3/26.
 */
public class CentralActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_touch);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean ba = false;
        Log.e("UUU", "党中央:任务" + MotionEvent.actionToString(event.getAction()) + " 是否执行?" + ba);
        return ba;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("UUU", "党中央:任务" + MotionEvent.actionToString(ev.getAction())+"分配");
        return super.dispatchTouchEvent(ev);
    }

}
