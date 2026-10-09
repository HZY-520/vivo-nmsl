package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z90 extends sa0 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public z90(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z90)) {
            return false;
        }
        z90 z90Var = (z90) obj;
        return Float.compare(this.c, z90Var.c) == 0 && Float.compare(this.d, z90Var.d) == 0 && Float.compare(this.e, z90Var.e) == 0 && this.f == z90Var.f && this.g == z90Var.g && Float.compare(this.h, z90Var.h) == 0 && Float.compare(this.i, z90Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + j2.a(this.h, j2.e(this.g, j2.e(this.f, j2.a(this.e, j2.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartX=" + this.h + ", arcStartY=" + this.i + ")";
    }
}
