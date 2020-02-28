package com.ngyb.newfeaturesfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.action.CutToActivity;
import com.ngyb.newfeaturesfive.action.RippleActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/26 09:48
 */
public class ActionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }

    public void ripple(View view) {
        Intent intent = new Intent(this, RippleActivity.class);
        startActivity(intent);
    }

    public void cutto(View view) {
        Intent intent = new Intent(this, CutToActivity.class);
        startActivity(intent);
    }
}
