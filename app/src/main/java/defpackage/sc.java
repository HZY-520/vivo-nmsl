package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sc implements ep0 {
    public final long e;

    public sc(long j) {
        this.e = j;
        if (j != 16) {
            return;
        }
        dv.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.ep0
    public final float a() {
        return gc.c(this.e);
    }

    @Override // defpackage.ep0
    public final long b() {
        return this.e;
    }

    @Override // defpackage.ep0
    public final dx0 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        long j = ((sc) obj).e;
        int i = gc.g;
        return as0.a(this.e, j);
    }

    public final int hashCode() {
        int i = gc.g;
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return j2.j("ColorStyle(value=", gc.h(this.e), ")");
    }
}
