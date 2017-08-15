package com.hou.immersivestatusbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hou.statusbar.StatusBarUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StatusBarUtils.setStatusBarColor(this, getResources().getColor(R.color.colorAccent), 200);
//        StatusBarUtils.showPicture(this);
    }
}
