package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class pl {
    public static final float a = ViewConfiguration.getScrollFriction();
    public static final double b;
    public static final double c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        b = log;
        c = log - 1.0d;
    }
}
