package com.yknx4.lib.yknxtools.file;


import com.yknx4.lib.yknxtools.StringTools;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by yknx4 on 3/31/16.
 */
public class StringFile {

    public static String getStringFromFile (File fl) throws Exception {
        FileInputStream fin = new FileInputStream(fl);
        String ret = StringTools.getFromStream(fin);
        //Make sure you close all streams.
        fin.close();
        return ret;
    }
}
