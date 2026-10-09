package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f90 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public f90(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            av.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj;
        return ck.b(this.a, f90Var.a) && ck.b(this.b, f90Var.b) && ck.b(this.c, f90Var.c) && ck.b(this.d, f90Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ck.c(this.a) + ", top=" + ck.c(this.b) + ", end=" + ck.c(this.c) + ", bottom=" + ck.c(this.d) + ")";
    }
}
