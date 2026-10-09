package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gp0 {
    public static final gp0 c = new gp0(u10.s(0), u10.s(0));
    public final long a;
    public final long b;

    public gp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp0)) {
            return false;
        }
        gp0 gp0Var = (gp0) obj;
        return bq0.a(this.a, gp0Var.a) && bq0.a(this.b, gp0Var.b);
    }

    public final int hashCode() {
        cq0[] cq0VarArr = bq0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + bq0.d(this.a) + ", restLine=" + bq0.d(this.b) + ")";
    }
}
