package com.yknx4.lib.yknxtools.number

/**
 * Created by yknx4 on 7/18/16.
 */

fun Int.getOrdinalString(): String {
    return Ordinal.getString(this)
}