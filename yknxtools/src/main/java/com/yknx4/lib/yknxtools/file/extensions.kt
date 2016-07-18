package com.yknx4.lib.yknxtools.file

import java.io.File

/**
 * Created by yknx4 on 7/18/16.
 */

fun File.getStringFromFile(): String {
    return StringFile.getStringFromFile(this)
}