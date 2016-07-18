package com.yknx4.lib.yknxtools.view

import android.content.Context
import android.view.View
import com.yknx4.lib.yknxtools.resource.RawResource
import java.nio.charset.Charset

/**
 * Created by yknx4 on 7/18/16.
 */

fun View.toggleView(condition:Boolean? = null, gone: Boolean = false){
    var final_condition:Boolean = this.visibility == View.VISIBLE
    if(condition != null){
        final_condition = condition
    }

    Visibility.toggleView(this, final_condition, gone)
}

fun Array<View>.toggleView(condition:Boolean, gone: Boolean = false){
    Visibility.toggleView(this, condition, gone)
}
