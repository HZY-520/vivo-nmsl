package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jm0 extends dx0 {
    public final long G;

    public jm0(long j) {
        this.G = j;
    }

    @Override // defpackage.dx0
    public final void e(float f, long j, v4 v4Var) {
        v4Var.b(1.0f);
        long j2 = this.G;
        if (f != 1.0f) {
            j2 = gc.b(j2, gc.c(j2) * f);
        }
        v4Var.d(j2);
        if (v4Var.c != null) {
            v4Var.c = null;
            v4Var.a.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm0)) {
            return false;
        }
        long j = ((jm0) obj).G;
        int i = gc.g;
        return as0.a(this.G, j);
    }

    public final int hashCode() {
        int i = gc.g;
        return Long.hashCode(this.G);
    }

    public final String toString() {
        return j2.j("SolidColor(value=", gc.h(this.G), ")");
    }
}
