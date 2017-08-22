package com.young.jdpulltorefresh.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 钟志鹏 on 2017/8/22.
 */

public class RecyclerAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(parent.getContext());
        textView.setText("我是条目");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        return new RecyclerView.ViewHolder(textView) {};
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
