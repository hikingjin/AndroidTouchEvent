package com.wangjin.touch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by wangjin on 16/3/26.
 */
public class CentralActivity extends Activity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_touch);

        findViewById(R.id.hangzhou).setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                boolean oa = false;
                Log.e("UUU", "杭州:任务" + MotionEvent.actionToString(event.getAction()) + ", 杭州特别办公室,是否执行?" + oa);
                return oa;
            }
        });

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean ba = false;
        Log.e("UUU", "党中央:任务" + MotionEvent.actionToString(event.getAction()) + " 是否执行?" + ba);
        return ba;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("UUU", "党中央:任务" + MotionEvent.actionToString(ev.getAction()) + "分配");
        boolean oa = super.dispatchTouchEvent(ev);
        Log.e("UUU", "党中央:任务" + MotionEvent.actionToString(ev.getAction()) + "是否分配?" + oa);
        return oa;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
