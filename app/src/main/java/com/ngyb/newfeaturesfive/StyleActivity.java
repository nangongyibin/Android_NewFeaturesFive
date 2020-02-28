package com.ngyb.newfeaturesfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.style.TintActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 18:34
 */
public class StyleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
    }

    public void tint(View view) {
        Intent intent = new Intent(this, TintActivity.class);
        startActivity(intent);
    }
}
