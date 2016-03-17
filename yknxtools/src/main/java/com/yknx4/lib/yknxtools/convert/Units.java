package com.yknx4.lib.yknxtools.convert;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yknx4 on 3/16/16.
 */
public class Units {
    private static final Map<Integer, Float> pxForDp = new HashMap<>();
    public static float getPixelsForDp(Context context, int dp){
        if(pxForDp.containsKey(dp))
            return pxForDp.get(dp);
        Resources r = context.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
        pxForDp.put(dp, px);
        return px;
    }

}
