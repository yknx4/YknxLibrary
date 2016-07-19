package com.yknx4.lib.yknxtools.models;

import android.content.Context;

import java.lang.ref.WeakReference;

/**
 * Created by yknx4 on 7/19/16.
 */
public class ContextAware {
    private final WeakReference<Context> _context;

    public Context getContext(){
        return _context.get();
    }

    public ContextAware(Context context){
        _context = new WeakReference<>(context);
    }
}
