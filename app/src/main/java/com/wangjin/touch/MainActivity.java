package com.wangjin.touch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.wangjin.touch.gesture.GestureActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.b_touch).setOnClickListener(this);
        findViewById(R.id.b_action).setOnClickListener(this);
        findViewById(R.id.b_gestrue).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b_touch) {
            Intent intent = new Intent(MainActivity.this, CentralActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.b_action) {
            Intent intent = new Intent(MainActivity.this, ActionActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.b_gestrue) {
            Intent intent = new Intent(MainActivity.this, GestureActivity.class);
            startActivity(intent);
        }
    }
}
