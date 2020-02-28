package com.ngyb.newfeaturesfive.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ngyb.newfeaturesfive.R;
import com.ngyb.newfeaturesfive.adapter.RecyclerViewListAdapter;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/28 10:49
 */
public class AppBarLayoutActivity extends AppCompatActivity {
    private RecyclerView rv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbarlayout);
        rv = findViewById(R.id.recycler_view);
//        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //网络形式
//        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.setAdapter(new RecyclerViewListAdapter(this));
    }
}
