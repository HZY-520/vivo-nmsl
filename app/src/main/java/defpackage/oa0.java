package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oa0 extends sa0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public oa0(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return Float.compare(this.c, oa0Var.c) == 0 && Float.compare(this.d, oa0Var.d) == 0 && Float.compare(this.e, oa0Var.e) == 0 && Float.compare(this.f, oa0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + j2.a(this.e, j2.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ")";
    }
}
