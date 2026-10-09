package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nv {
    public static final nv e = new nv(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nv(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static nv a(nv nvVar, nv nvVar2) {
        return b(Math.max(nvVar.a, nvVar2.a), Math.max(nvVar.b, nvVar2.b), Math.max(nvVar.c, nvVar2.c), Math.max(nvVar.d, nvVar2.d));
    }

    public static nv b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new nv(i, i2, i3, i4);
    }

    public static nv c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return bg.h(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nv.class != obj.getClass()) {
            return false;
        }
        nv nvVar = (nv) obj;
        return this.d == nvVar.d && this.a == nvVar.a && this.c == nvVar.c && this.b == nvVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
