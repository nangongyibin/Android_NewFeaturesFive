package com.ngyb.newfeaturesfive.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ngyb.newfeaturesfive.R;
import com.ngyb.newfeaturesfive.module.RecyclerViewActivity;

import java.lang.reflect.ParameterizedType;
import java.util.Random;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2020/2/27 21:09
 */
public class RecyclerViewListAdapter extends RecyclerView.Adapter<RecyclerViewListAdapter.ViewHolder> {
    private final Context context;

    public RecyclerViewListAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerViewListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewListAdapter.ViewHolder viewHolder, int i) {
        TextView tv = viewHolder.itemView.findViewById(R.id.tv);
        tv.setHeight(100+new Random().nextInt(200));
        tv.setText("Hello World"+i);
    }

    @Override
    public int getItemCount() {
        return 25;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
