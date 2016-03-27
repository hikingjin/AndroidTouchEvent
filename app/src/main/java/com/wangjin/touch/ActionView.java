package com.wangjin.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by wangjin on 16/3/27.
 */
public class ActionView extends View {


    public ActionView(Context context) {
        super(context);
    }

    public ActionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.e("UUU1", MotionEvent.actionToString(event.getActionMasked()));
        Log.e("UUU2", MotionEvent.actionToString(event.getAction()));
        return true;
    }
}
