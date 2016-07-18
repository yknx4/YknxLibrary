package com.yknx4.lib.yknxtools

import android.content.Context
import com.yknx4.lib.yknxtools.convert.Units
import java.io.InputStream

/**
 * Created by yknx4 on 7/18/16.
 */

fun InputStream.getString():String{
    return StringTools.getFromStream(this)
}
