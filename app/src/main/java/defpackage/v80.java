package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v80 {
    public final long a;
    public final f90 b;

    public v80() {
        long d = lw.d(4284900966L);
        f90 f90Var = new f90(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = d;
        this.b = f90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v80.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        v80 v80Var = (v80) obj;
        long j = v80Var.a;
        int i = gc.g;
        return as0.a(this.a, j) && this.b.equals(v80Var.b);
    }

    public final int hashCode() {
        int i = gc.g;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + gc.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
