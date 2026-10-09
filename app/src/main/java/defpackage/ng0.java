package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ng0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        v10.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public ng0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return Float.compare(this.a, ng0Var.a) == 0 && Float.compare(this.b, ng0Var.b) == 0 && Float.compare(this.c, ng0Var.c) == 0 && Float.compare(this.d, ng0Var.d) == 0 && dx0.p(this.e, ng0Var.e) && dx0.p(this.f, ng0Var.f) && dx0.p(this.g, ng0Var.g) && dx0.p(this.h, ng0Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + j2.c(j2.c(j2.c(j2.a(this.d, j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = nh.j0(this.a) + ", " + nh.j0(this.b) + ", " + nh.j0(this.c) + ", " + nh.j0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean p = dx0.p(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!p || !dx0.p(j2, j3) || !dx0.p(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + dx0.F(j) + ", topRight=" + dx0.F(j2) + ", bottomRight=" + dx0.F(j3) + ", bottomLeft=" + dx0.F(j4) + ")";
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + nh.j0(Float.intBitsToFloat(i)) + ")";
        }
        return "RoundRect(rect=" + str + ", x=" + nh.j0(Float.intBitsToFloat(i)) + ", y=" + nh.j0(Float.intBitsToFloat(i2)) + ")";
    }
}
