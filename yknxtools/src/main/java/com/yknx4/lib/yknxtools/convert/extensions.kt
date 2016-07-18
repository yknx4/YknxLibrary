package com.yknx4.lib.yknxtools.convert

import android.content.Context

/**
 * Created by yknx4 on 7/18/16.
 */

fun Context.getPixelsForDp(dp:Int): Float {
    return Units.getPixelsForDp(this, dp)
}