package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q90 implements n6 {
    public final int a;
    public final int b;
    public final long c;
    public final gp0 d;
    public final nc0 e;
    public final rz f;
    public final int g;
    public final int h;
    public final rp0 i;

    public q90(int i, int i2, long j, gp0 gp0Var, nc0 nc0Var, rz rzVar, int i3, int i4, rp0 rp0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = gp0Var;
        this.e = nc0Var;
        this.f = rzVar;
        this.g = i3;
        this.h = i4;
        this.i = rp0Var;
        cq0[] cq0VarArr = bq0.b;
        if (bq0.a(j, bq0.c)) {
            return;
        }
        if (bq0.c(j) >= 0.0f) {
            return;
        }
        dv.b("lineHeight can't be negative (" + bq0.c(j) + ")");
    }

    public final q90 a(q90 q90Var) {
        return q90Var == null ? this : r90.a(this, q90Var.a, q90Var.b, q90Var.c, q90Var.d, q90Var.e, q90Var.f, q90Var.g, q90Var.h, q90Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return this.a == q90Var.a && this.b == q90Var.b && bq0.a(this.c, q90Var.c) && lw.i(this.d, q90Var.d) && lw.i(this.e, q90Var.e) && lw.i(this.f, q90Var.f) && this.g == q90Var.g && this.h == q90Var.h && lw.i(this.i, q90Var.i);
    }

    public final int hashCode() {
        int b = j2.b(this.b, Integer.hashCode(this.a) * 31, 31);
        cq0[] cq0VarArr = bq0.b;
        int c = j2.c(b, 31, this.c);
        gp0 gp0Var = this.d;
        int hashCode = (c + (gp0Var != null ? gp0Var.hashCode() : 0)) * 31;
        nc0 nc0Var = this.e;
        int hashCode2 = (hashCode + (nc0Var != null ? nc0Var.hashCode() : 0)) * 31;
        rz rzVar = this.f;
        int b2 = j2.b(this.h, j2.b(this.g, (hashCode2 + (rzVar != null ? rzVar.hashCode() : 0)) * 31, 31), 31);
        rp0 rp0Var = this.i;
        return b2 + (rp0Var != null ? rp0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + yo0.a(this.a) + ", textDirection=" + dp0.a(this.b) + ", lineHeight=" + bq0.d(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + mz.a(this.g) + ", hyphens=" + qt.a(this.h) + ", textMotion=" + this.i + ")";
    }
}
