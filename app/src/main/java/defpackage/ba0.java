package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ba0 extends sa0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ba0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return Float.compare(this.c, ba0Var.c) == 0 && Float.compare(this.d, ba0Var.d) == 0 && Float.compare(this.e, ba0Var.e) == 0 && Float.compare(this.f, ba0Var.f) == 0 && Float.compare(this.g, ba0Var.g) == 0 && Float.compare(this.h, ba0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + j2.a(this.g, j2.a(this.f, j2.a(this.e, j2.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "CurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ", x3=" + this.g + ", y3=" + this.h + ")";
    }
}
