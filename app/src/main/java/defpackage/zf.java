package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zf {
    public final int a;
    public final long b;
    public final ag c;
    public final t3 d;

    public zf(int i, long j, ag agVar, t3 t3Var) {
        this.a = i;
        this.b = j;
        this.c = agVar;
        this.d = t3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return this.a == zfVar.a && this.b == zfVar.b && this.c == zfVar.c && lw.i(this.d, zfVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + j2.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        t3 t3Var = this.d;
        return hashCode + (t3Var == null ? 0 : t3Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
