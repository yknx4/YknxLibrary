package com.yknx4.lib.yknxtools.device;

import android.content.Context;
import android.telephony.TelephonyManager;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * Created by yknx4 on 7/18/16.
 */
public abstract class Device {
    public static UUID getDeviceUUID(Context context){
        UUID uuid;
        final String deviceId = (
                (TelephonyManager) context
                        .getSystemService(Context.TELEPHONY_SERVICE))
                .getDeviceId();
        try {
            uuid = deviceId != null ? UUID
                    .nameUUIDFromBytes(deviceId.getBytes("utf8")) : UUID.randomUUID();
        } catch (UnsupportedEncodingException e) {
            uuid = UUID.randomUUID();
        }
        return uuid;
    }
}
