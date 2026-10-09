package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public t9(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        long j = t9Var.a;
        int i = gc.g;
        return as0.a(this.a, j) && as0.a(this.b, t9Var.b) && as0.a(this.c, t9Var.c) && as0.a(this.d, t9Var.d);
    }

    public final int hashCode() {
        int i = gc.g;
        return Long.hashCode(this.d) + j2.c(j2.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
