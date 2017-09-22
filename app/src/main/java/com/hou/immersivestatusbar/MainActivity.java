package com.hou.immersivestatusbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.hou.statusbar.StatusBarUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StatusBarUtils.setStatusBarColor(this, getResources().getColor(R.color.colorAccent));
//        StatusBarUtils.showPicture(this);
//        int statusBarHeight = StatusBarUtils.getStatusBarHeight(this);
//        LinearLayout llContent= (LinearLayout) findViewById(R.id.ll_content);
//        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) llContent.getLayoutParams();
//        layoutParams.topMargin = statusBarHeight;
//        llContent.setLayoutParams(layoutParams);
    }
}
