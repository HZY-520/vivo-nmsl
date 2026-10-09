package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j30 {
    public final long a;
    public final long b;
    public final boolean c;

    public j30(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final j30 a(j30 j30Var) {
        return new j30(s60.e(this.a, j30Var.a), Math.max(this.b, j30Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        return s60.b(this.a, j30Var.a) && this.b == j30Var.b && this.c == j30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j2.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + s60.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
