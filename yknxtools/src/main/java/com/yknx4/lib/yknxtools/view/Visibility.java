package com.yknx4.lib.yknxtools.view;

import android.view.View;

public class Visibility{

    public static void toggleView(View view, Boolean condition, Boolean gone){
        int mode = gone? View.GONE : View.INVISIBLE;
        if(condition)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(mode);
    }

    public static void toggleView(View view, Boolean condition){
        toggleView(view, condition, false);
    }

    public static void toggleView(View view){
        toggleView(view, view.getVisibility()==View.VISIBLE, false);
    }

    public static void toggleView(View[] views, Boolean condition, Boolean gone){
        int mode = gone? View.GONE : View.INVISIBLE;
        if(condition)
            mode = View.VISIBLE;

        for(View v : views){
            v.setVisibility(mode);
        }

    }

    public static void toggleView(View[] views, Boolean condition){
        toggleView(views, condition, false);
    }

}
