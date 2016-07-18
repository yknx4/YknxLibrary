package com.yknx4.lib.yknxtools.network

import android.content.Context

/**
 * Created by yknx4 on 7/18/16.
 */

fun Context.isConnected(): Boolean {
    return Connectivity.isConnected(this)
}

fun Any?.connectionReachable(): Boolean {
    return Connectivity.connectionReachable()
}