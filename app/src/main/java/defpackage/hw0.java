package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hw0 {
    public final o8 a;
    public final float b;

    public hw0(Rect rect, float f) {
        this.a = new o8(rect);
        this.b = f;
    }

    public final Rect a() {
        o8 o8Var = this.a;
        o8Var.getClass();
        return new Rect(o8Var.a, o8Var.b, o8Var.c, o8Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hw0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hw0 hw0Var = (hw0) obj;
        return lw.i(this.a, hw0Var.a) && this.b == hw0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public hw0(o8 o8Var, float f) {
        this.a = o8Var;
        this.b = f;
    }
}
