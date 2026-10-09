package com.vivo.cnm.lico;

import android.util.Log;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class MLog {
    private static final boolean ENABLED = false;
    private static final String PREFIX = "FucWB";
    private static volatile boolean enabled;
    public static final MLog INSTANCE = new MLog();
    public static final int $stable = 8;

    private MLog() {
    }

    public static /* synthetic */ void e$default(MLog mLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        mLog.e(str, str2, th);
    }

    private final String name(String str) {
        return "FucWB/" + str;
    }

    public final void e(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        if (enabled) {
            try {
                Log.e(name(str), str2, th);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (enabled) {
            try {
                Log.i(name(str), str2);
            } catch (Throwable unused) {
            }
        }
    }

    public final void init(Object obj) {
        obj.getClass();
    }

    public final void setEnabled(boolean z) {
        enabled = z;
    }

    public final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (enabled) {
            try {
                Log.w(name(str), str2);
            } catch (Throwable unused) {
            }
        }
    }
}
