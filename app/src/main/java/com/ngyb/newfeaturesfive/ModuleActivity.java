package com.ngyb.newfeaturesfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ngyb.newfeaturesfive.module.AppBarLayoutActivity;
import com.ngyb.newfeaturesfive.module.CardViewActivity;
import com.ngyb.newfeaturesfive.module.CoordinatorLayoutActivity;
import com.ngyb.newfeaturesfive.module.CtlActivity;
import com.ngyb.newfeaturesfive.module.FabActivity;
import com.ngyb.newfeaturesfive.module.NavigationBottomViewActivity;
import com.ngyb.newfeaturesfive.module.NavigationViewActivity;
import com.ngyb.newfeaturesfive.module.RecyclerViewActivity;
import com.ngyb.newfeaturesfive.module.RfabActivity;
import com.ngyb.newfeaturesfive.module.SnackBarActivity;
import com.ngyb.newfeaturesfive.module.SwipeRefreshLayoutActivity;
import com.ngyb.newfeaturesfive.module.TabLayoutActivity;
import com.ngyb.newfeaturesfive.module.ToolBarActivity;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/26 10:15
 */
public class ModuleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
    }

    public void CardView(View view) {
        Intent intent = new Intent(this, CardViewActivity.class);
        startActivity(intent);
    }

    public void RecyclerView(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void FloatingActionButton(View view) {
        Intent intent = new Intent(this, FabActivity.class);
        startActivity(intent);
    }

    public void SnackBar(View view) {
        Intent intent = new Intent(this, SnackBarActivity.class);
        startActivity(intent);
    }

    public void CoordinatorLayout(View view) {
        Intent intent = new Intent(this, CoordinatorLayoutActivity.class);
        startActivity(intent);
    }

    public void rfab(View view) {
        Intent intent = new Intent(this, RfabActivity.class);
        startActivity(intent);
    }

    public void ToolBar(View view) {
        Intent intent = new Intent(this, ToolBarActivity.class);
        startActivity(intent);
    }

    public void AppBarLayout(View view) {
        Intent intent = new Intent(this, AppBarLayoutActivity.class);
        startActivity(intent);
    }

    public void CollapsingToolbarLayout(View view) {
        Intent intent = new Intent(this, CtlActivity.class);
        startActivity(intent);
    }

    public void NavigationBottomView(View view) {
        Intent intent = new Intent(this, NavigationBottomViewActivity.class);
        startActivity(intent);
    }

    public void SwipeRefreshLayout(View view) {
        Intent intent = new Intent(this, SwipeRefreshLayoutActivity.class);
        startActivity(intent);
    }

    public void TabLayout(View view) {
        Intent intent = new Intent(this, TabLayoutActivity.class);
        startActivity(intent);
    }

    public void NavigationView(View view) {
        Intent intent = new Intent(this, NavigationViewActivity.class);
        startActivity(intent);
    }
}
