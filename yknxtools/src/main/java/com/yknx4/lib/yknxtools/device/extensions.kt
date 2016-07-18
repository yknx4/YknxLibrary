package com.yknx4.lib.yknxtools.device

import android.content.Context
import java.util.*

/**
 * Created by yknx4 on 7/18/16.
 */

fun Context.getDeviceUUID(): UUID {
    return Device.getDeviceUUID(this)
}