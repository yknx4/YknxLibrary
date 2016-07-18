package com.yknx4.lib.yknxtools.resource

import android.content.Context
import java.nio.charset.Charset

/**
 * Created by yknx4 on 7/18/16.
 */

fun Context.getResourceBytes(id:Int): ByteArray {
    return RawResource.getResource(id, this)
}

fun Context.getStringResource(id:Int, encoding: Charset?): String{
    if(encoding == null){
        return RawResource.getStringResource(this, id, encoding)
    } else {
       return RawResource.getStringResource(this, id)
    }
}