package com.ngyb.newfeaturesfive.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.ngyb.newfeaturesfive.R;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 21:33
 */
public class SnackBarActivity extends AppCompatActivity {

    private FrameLayout fl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        fl = findViewById(R.id.fl);
    }

    public void click(View view) {
        Snackbar.make(fl, R.string.app_name, 2000).setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SnackBarActivity.this, "Action Click", Toast.LENGTH_SHORT).show();
            }
        }).setText("Message").show();
    }
}
