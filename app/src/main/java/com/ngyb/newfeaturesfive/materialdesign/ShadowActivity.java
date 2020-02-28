package com.ngyb.newfeaturesfive.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.materialdesign.shadow.ElevateActivity;
import com.ngyb.newfeaturesfive.R;
import com.ngyb.newfeaturesfive.materialdesign.shadow.ShadeActivity;
import com.ngyb.newfeaturesfive.materialdesign.shadow.SuitActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/26 09:20
 */
public class ShadowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow);
    }

    public void elevate(View view) {
        Intent intent = new Intent(this, ElevateActivity.class);
        startActivity(intent);
    }

    public void shade(View view) {
        Intent intent = new Intent(this, ShadeActivity.class);
        startActivity(intent);
    }

    public void suit(View view) {
        Intent intent = new Intent(this, SuitActivity.class);
        startActivity(intent);
    }
}
