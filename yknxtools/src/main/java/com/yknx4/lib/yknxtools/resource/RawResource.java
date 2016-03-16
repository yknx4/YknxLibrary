package com.yknx4.lib.yknxtools.resource;

import android.content.Context;
import android.content.res.Resources;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by yknx4 on 3/16/16.
 */
public class RawResource {
    // reads resources regardless of their size
    public byte[] getResource(int id, Context context) throws IOException {
        Resources resources = context.getResources();
        InputStream is = resources.openRawResource(id);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        byte[] readBuffer = new byte[4 * 1024];

        try {
            int read;
            do {
                read = is.read(readBuffer, 0, readBuffer.length);
                if(read == -1) {
                    break;
                }
                bout.write(readBuffer, 0, read);
            } while(true);

            return bout.toByteArray();
        } finally {
            is.close();
        }
    }

    // reads a string resource
    public String getStringResource(Context context, int id, Charset encoding) throws IOException {
        return new String(getResource(id, context), encoding);
    }

    // reads an UTF-8 string resource
    public String getStringResource(Context context, int id) throws IOException {
        return getStringResource(context, id, Charset.forName("UTF-8"));
    }
}
