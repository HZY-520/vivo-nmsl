package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ja0 extends sa0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ja0(float f, float f2, float f3, float f4, float f5, float f6) {
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
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return Float.compare(this.c, ja0Var.c) == 0 && Float.compare(this.d, ja0Var.d) == 0 && Float.compare(this.e, ja0Var.e) == 0 && Float.compare(this.f, ja0Var.f) == 0 && Float.compare(this.g, ja0Var.g) == 0 && Float.compare(this.h, ja0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + j2.a(this.g, j2.a(this.f, j2.a(this.e, j2.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "RelativeCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ", dx3=" + this.g + ", dy3=" + this.h + ")";
    }
}
