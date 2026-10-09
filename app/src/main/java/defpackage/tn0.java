package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tn0 extends t10 {
    public final float o;
    public final float p;
    public final int q;
    public final int r;

    public tn0(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.o = f;
        this.p = f2;
        this.q = i;
        this.r = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        return this.o == tn0Var.o && this.p == tn0Var.p && this.q == tn0Var.q && this.r == tn0Var.r;
    }

    public final int hashCode() {
        return j2.b(this.r, j2.b(this.q, j2.a(this.p, Float.hashCode(this.o) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.q;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.r;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        return "Stroke(width=" + this.o + ", miter=" + this.p + ", cap=" + str2 + ", join=" + str + ", pathEffect=null)";
    }
}
