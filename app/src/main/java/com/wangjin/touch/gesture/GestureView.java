package com.wangjin.touch.gesture;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/**
 * Created by wangjin on 16/3/27.
 */
public class GestureView extends View {

    GestureDetector mGesture = null;

    public GestureView(Context context) {
        super(context);
    }

    public GestureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mGesture = new GestureDetector(context, new GestureListener());
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean oa = true;//true 否则获取不到事件,因为有些事件是down move up综合判定之后的结果
        mGesture.onTouchEvent(event);
        return oa;
    }

    class GestureListener extends SimpleOnGestureListener {
        public GestureListener() {
            super();
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {

            Log.e("UUU", "onSingleTapUp " + MotionEvent.actionToString(e.getAction()));

            return super.onSingleTapUp(e);
        }

        @Override
        public void onLongPress(MotionEvent e) {
            Log.e("UUU", "onLongPress " + MotionEvent.actionToString(e.getAction()));
            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Log.e("UUU", "onScroll " + MotionEvent.actionToString(e1.getAction()) + "  " + MotionEvent.actionToString(e2.getAction()));

            Log.e("UUU", "distanceX" + distanceX + "     distanceY" + distanceY);
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Log.e("UUU", "onFling " + MotionEvent.actionToString(e1.getAction()) + "  " + MotionEvent.actionToString(e2.getAction()));
            Log.e("UUU", "down的点" + e1.getX() + "," + e1.getY() + "     " + e2.getX() + "," + e2.getY());
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(MotionEvent e) {
            Log.e("UUU", "onShowPress " + MotionEvent.actionToString(e.getAction()));

            super.onShowPress(e);
        }

        @Override
        public boolean onDown(MotionEvent e) {
            Log.e("UUU", "onDown " + MotionEvent.actionToString(e.getAction()));
            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Log.e("UUU", "onDoubleTap " + MotionEvent.actionToString(e.getAction()));
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            Log.e("UUU", "onDoubleTapEvent " + MotionEvent.actionToString(e.getAction()));
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Log.e("UUU", "onSingleTapConfirmed " + MotionEvent.actionToString(e.getAction()));
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public boolean onContextClick(MotionEvent e) {
            Log.e("UUU", "onContextClick " + MotionEvent.actionToString(e.getAction()));
            return super.onContextClick(e);
        }
    }
}
