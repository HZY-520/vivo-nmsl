package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kw0 implements jw0 {
    public final ti b;

    public kw0() {
        this.b = Build.VERSION.SDK_INT >= 34 ? ui.e : b2.F;
        kw.e(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
