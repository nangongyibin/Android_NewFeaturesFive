package com.ngyb.newfeaturesfive.action;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.R;
import com.ngyb.newfeaturesfive.action.cutto.ExplodeActivity;
import com.ngyb.newfeaturesfive.action.cutto.FadeActivity;
import com.ngyb.newfeaturesfive.action.cutto.ShareElementActivity;
import com.ngyb.newfeaturesfive.action.cutto.SlideActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/26 10:12
 */
public class CutToActivity extends AppCompatActivity {

    private View redCircle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_to);
    }

    public void slide(View view) {
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, SlideActivity.class);
        ActivityCompat.startActivity(this, intent, bundle);
    }

    public void fade(View view) {
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, FadeActivity.class);
        ActivityCompat.startActivity(this,intent,bundle);
    }

    public void explode(View view) {
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, ExplodeActivity.class);
        ActivityCompat.startActivity(this,intent,bundle);
    }

    public void shareElement(View view) {
        redCircle = findViewById(R.id.red_circle);
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this, redCircle, getResources().getString(R.string.red_name)).toBundle();
        Intent intent = new Intent(this, ShareElementActivity.class);
        ActivityCompat.startActivity(this,intent,bundle);
    }
}
