package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rk0 {
    public static final rk0 d = new rk0(0.0f, lw.d(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public rk0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        long j = rk0Var.a;
        int i = gc.g;
        return as0.a(this.a, j) && s60.b(this.b, rk0Var.b) && this.c == rk0Var.c;
    }

    public final int hashCode() {
        int i = gc.g;
        return Float.hashCode(this.c) + j2.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Shadow(color=" + gc.h(this.a) + ", offset=" + s60.g(this.b) + ", blurRadius=" + this.c + ")";
    }
}
