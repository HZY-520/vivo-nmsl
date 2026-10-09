package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class o8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new o8(0, 0, 0, 0);
    }

    public o8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            z6.d(j2.i("Left must be less than or equal to right, left: ", i, ", right: ", i3));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        z6.d(j2.i("top must be less than or equal to bottom, top: ", i2, ", bottom: ", i4));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o8 o8Var = (o8) obj;
        return this.a == o8Var.a && this.b == o8Var.b && this.c == o8Var.c && this.d == o8Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return o8.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o8(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
