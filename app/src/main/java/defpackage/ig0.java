package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ig0 implements mu {
    public final boolean a;
    public final long b;

    public ig0(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.mu
    public final ni a(b40 b40Var) {
        return new qi(b40Var, this.a, new t3(18, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        if (this.a != ig0Var.a || !ck.b(Float.NaN, Float.NaN)) {
            return false;
        }
        long j = ig0Var.b;
        int i = gc.g;
        return as0.a(this.b, j);
    }

    @Override // defpackage.mu
    public final int hashCode() {
        int a = j2.a(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = gc.g;
        return Long.hashCode(this.b) + a;
    }
}
