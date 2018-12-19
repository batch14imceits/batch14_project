package com.imceits.custom;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Khine Lae on 12/19/2018.
 */
public class CustomImageAdapter extends BaseAdapter {
    Integer[] arr;
    Context ctx;

    public CustomImageAdapter(Integer[] arr, Context ctx) {
        this.arr = arr;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView v=new ImageView(ctx);
        v.setImageResource(arr[i]);
        return v;
    }
}
