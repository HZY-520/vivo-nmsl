package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zp0 {
    public static final zp0 d;
    public final om0 a;
    public final q90 b;
    public final qc0 c;

    static {
        long j = gc.f;
        long j2 = bq0.c;
        d = new zp0(new om0(j, j2, null, null, null, null, null, j2, null, null, null, j, null, null), new q90(0, 0, j2, null, null, null, 0, 0, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zp0(om0 om0Var, q90 q90Var) {
        this(om0Var, q90Var, r0 == null ? null : new qc0(r0));
        om0Var.getClass();
        nc0 nc0Var = q90Var.e;
    }

    public static zp0 a(zp0 zp0Var, long j, xp xpVar, no0 no0Var, long j2, long j3, rz rzVar, int i) {
        c8 c8Var;
        fp0 fp0Var;
        long j4;
        qc0 qc0Var = t10.b;
        long b = zp0Var.a.a.b();
        long j5 = (i & 2) != 0 ? zp0Var.a.b : j;
        xp xpVar2 = (i & 4) != 0 ? zp0Var.a.c : xpVar;
        om0 om0Var = zp0Var.a;
        vp vpVar = om0Var.d;
        wp wpVar = om0Var.e;
        no0 no0Var2 = (i & 32) != 0 ? om0Var.f : no0Var;
        String str = om0Var.g;
        long j6 = (i & 128) != 0 ? om0Var.h : j2;
        c8 c8Var2 = om0Var.i;
        fp0 fp0Var2 = om0Var.j;
        h00 h00Var = om0Var.k;
        long j7 = om0Var.l;
        bp0 bp0Var = om0Var.m;
        rk0 rk0Var = om0Var.n;
        t10 t10Var = om0Var.o;
        q90 q90Var = zp0Var.b;
        int i2 = q90Var.a;
        int i3 = q90Var.b;
        if ((i & 131072) != 0) {
            c8Var = c8Var2;
            fp0Var = fp0Var2;
            j4 = q90Var.c;
        } else {
            c8Var = c8Var2;
            fp0Var = fp0Var2;
            j4 = j3;
        }
        gp0 gp0Var = q90Var.d;
        qc0 qc0Var2 = (i & 524288) != 0 ? zp0Var.c : qc0Var;
        rz rzVar2 = (i & 1048576) != 0 ? q90Var.f : rzVar;
        int i4 = q90Var.g;
        int i5 = q90Var.h;
        rp0 rp0Var = q90Var.i;
        long b2 = om0Var.a.b();
        int i6 = gc.g;
        return new zp0(new om0(as0.a(b, b2) ? om0Var.a : b != 16 ? new sc(b) : b2.X, j5, xpVar2, vpVar, wpVar, no0Var2, str, j6, c8Var, fp0Var, h00Var, j7, bp0Var, rk0Var, t10Var), new q90(i2, i3, j4, gp0Var, qc0Var2 != null ? qc0Var2.a : null, rzVar2, i4, i5, rp0Var), qc0Var2);
    }

    public static zp0 d(zp0 zp0Var, long j, long j2, xp xpVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? bq0.c : j2;
        xp xpVar2 = (i2 & 4) != 0 ? null : xpVar;
        long j6 = (i2 & 128) != 0 ? bq0.c : j3;
        long j7 = gc.f;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? bq0.c : j4;
        om0 a = pm0.a(zp0Var.a, j, null, Float.NaN, j5, xpVar2, null, null, null, null, j6, null, null, null, j7, null, null, null);
        q90 a2 = r90.a(zp0Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (zp0Var.a == a && zp0Var.b == a2) ? zp0Var : new zp0(a, a2);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final zp0 c(zp0 zp0Var) {
        return (zp0Var == null || zp0Var.equals(d)) ? this : new zp0(this.a.c(zp0Var.a), this.b.a(zp0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp0)) {
            return false;
        }
        zp0 zp0Var = (zp0) obj;
        return lw.i(this.a, zp0Var.a) && lw.i(this.b, zp0Var.b) && lw.i(this.c, zp0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qc0 qc0Var = this.c;
        return hashCode + (qc0Var != null ? qc0Var.hashCode() : 0);
    }

    public final String toString() {
        String h = gc.h(b());
        om0 om0Var = this.a;
        dx0 e = om0Var.a.e();
        float a = om0Var.a.a();
        String d2 = bq0.d(om0Var.b);
        xp xpVar = om0Var.c;
        vp vpVar = om0Var.d;
        wp wpVar = om0Var.e;
        no0 no0Var = om0Var.f;
        String str = om0Var.g;
        String d3 = bq0.d(om0Var.h);
        c8 c8Var = om0Var.i;
        fp0 fp0Var = om0Var.j;
        h00 h00Var = om0Var.k;
        String h2 = gc.h(om0Var.l);
        bp0 bp0Var = om0Var.m;
        rk0 rk0Var = om0Var.n;
        t10 t10Var = om0Var.o;
        q90 q90Var = this.b;
        return "TextStyle(color=" + h + ", brush=" + e + ", alpha=" + a + ", fontSize=" + d2 + ", fontWeight=" + xpVar + ", fontStyle=" + vpVar + ", fontSynthesis=" + wpVar + ", fontFamily=" + no0Var + ", fontFeatureSettings=" + str + ", letterSpacing=" + d3 + ", baselineShift=" + c8Var + ", textGeometricTransform=" + fp0Var + ", localeList=" + h00Var + ", background=" + h2 + ", textDecoration=" + bp0Var + ", shadow=" + rk0Var + ", drawStyle=" + t10Var + ", textAlign=" + yo0.a(q90Var.a) + ", textDirection=" + dp0.a(q90Var.b) + ", lineHeight=" + bq0.d(q90Var.c) + ", textIndent=" + q90Var.d + ", platformStyle=" + this.c + ", lineHeightStyle=" + q90Var.f + ", lineBreak=" + mz.a(q90Var.g) + ", hyphens=" + qt.a(q90Var.h) + ", textMotion=" + q90Var.i + ")";
    }

    public zp0(om0 om0Var, q90 q90Var, qc0 qc0Var) {
        this.a = om0Var;
        this.b = q90Var;
        this.c = qc0Var;
    }
}
