package com.cn.chason.diarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircularImage circularImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circularImage= (CircularImage) findViewById(R.id.circularImage);
        circularImage.setImageResource(R.drawable.face);
    }
}
