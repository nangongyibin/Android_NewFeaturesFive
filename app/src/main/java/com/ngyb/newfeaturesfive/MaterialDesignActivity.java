package com.ngyb.newfeaturesfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.R;
import com.ngyb.newfeaturesfive.materialdesign.ShadowActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 15:19
 */
public class MaterialDesignActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
    }

    public void shadow(View view) {
        Intent intent = new Intent(this, ShadowActivity.class);
        startActivity(intent);
    }
}
