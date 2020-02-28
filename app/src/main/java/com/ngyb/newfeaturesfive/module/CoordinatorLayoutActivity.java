package com.ngyb.newfeaturesfive.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ngyb.newfeaturesfive.R;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 21:41
 */
public class CoordinatorLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinatorlayout);
    }

    public void click(View view) {
        Snackbar.make(findViewById(R.id.coordinator_layout), R.string.app_name, 2000).setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CoordinatorLayoutActivity.this, "Action Click", Toast.LENGTH_SHORT).show();
            }
        }).setText("Message").show();
    }
}
