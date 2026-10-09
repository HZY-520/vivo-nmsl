package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class om0 implements n6 {
    public final ep0 a;
    public final long b;
    public final xp c;
    public final vp d;
    public final wp e;
    public final no0 f;
    public final String g;
    public final long h;
    public final c8 i;
    public final fp0 j;
    public final h00 k;
    public final long l;
    public final bp0 m;
    public final rk0 n;
    public final t10 o;

    public om0(long j, long j2, xp xpVar, vp vpVar, wp wpVar, no0 no0Var, String str, long j3, c8 c8Var, fp0 fp0Var, h00 h00Var, long j4, bp0 bp0Var, rk0 rk0Var, int i) {
        this((i & 1) != 0 ? gc.f : j, (i & 2) != 0 ? bq0.c : j2, (i & 4) != 0 ? null : xpVar, (i & 8) != 0 ? null : vpVar, (i & 16) != 0 ? null : wpVar, (i & 32) != 0 ? null : no0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? bq0.c : j3, (i & 256) != 0 ? null : c8Var, (i & 512) != 0 ? null : fp0Var, (i & 1024) != 0 ? null : h00Var, (i & 2048) != 0 ? gc.f : j4, (i & 4096) != 0 ? null : bp0Var, (i & 8192) != 0 ? null : rk0Var);
    }

    public final boolean a(om0 om0Var) {
        if (this == om0Var) {
            return true;
        }
        if (!bq0.a(this.b, om0Var.b) || !lw.i(this.c, om0Var.c) || !lw.i(this.d, om0Var.d) || !lw.i(this.e, om0Var.e) || !lw.i(this.f, om0Var.f) || !lw.i(this.g, om0Var.g) || !bq0.a(this.h, om0Var.h) || !lw.i(this.i, om0Var.i) || !lw.i(this.j, om0Var.j) || !lw.i(this.k, om0Var.k)) {
            return false;
        }
        long j = om0Var.l;
        int i = gc.g;
        return as0.a(this.l, j);
    }

    public final boolean b(om0 om0Var) {
        return lw.i(this.a, om0Var.a) && lw.i(this.m, om0Var.m) && lw.i(this.n, om0Var.n) && lw.i(this.o, om0Var.o);
    }

    public final om0 c(om0 om0Var) {
        if (om0Var == null) {
            return this;
        }
        ep0 ep0Var = om0Var.a;
        return pm0.a(this, ep0Var.b(), ep0Var.e(), ep0Var.a(), om0Var.b, om0Var.c, om0Var.d, om0Var.e, om0Var.f, om0Var.g, om0Var.h, om0Var.i, om0Var.j, om0Var.k, om0Var.l, om0Var.m, om0Var.n, om0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om0)) {
            return false;
        }
        om0 om0Var = (om0) obj;
        return a(om0Var) && b(om0Var);
    }

    public final int hashCode() {
        ep0 ep0Var = this.a;
        long b = ep0Var.b();
        int i = gc.g;
        int hashCode = Long.hashCode(b) * 31;
        dx0 e = ep0Var.e();
        int hashCode2 = (Float.hashCode(ep0Var.a()) + ((hashCode + (e != null ? e.hashCode() : 0)) * 31)) * 31;
        cq0[] cq0VarArr = bq0.b;
        int c = j2.c(hashCode2, 31, this.b);
        xp xpVar = this.c;
        int i2 = (c + (xpVar != null ? xpVar.e : 0)) * 31;
        vp vpVar = this.d;
        int hashCode3 = (i2 + (vpVar != null ? Integer.hashCode(vpVar.a) : 0)) * 31;
        wp wpVar = this.e;
        int hashCode4 = (hashCode3 + (wpVar != null ? Integer.hashCode(wpVar.a) : 0)) * 31;
        no0 no0Var = this.f;
        int hashCode5 = (hashCode4 + (no0Var != null ? no0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int c2 = j2.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        c8 c8Var = this.i;
        int hashCode6 = (c2 + (c8Var != null ? Float.hashCode(c8Var.a) : 0)) * 31;
        fp0 fp0Var = this.j;
        int hashCode7 = (hashCode6 + (fp0Var != null ? fp0Var.hashCode() : 0)) * 31;
        h00 h00Var = this.k;
        int c3 = j2.c((hashCode7 + (h00Var != null ? h00Var.e.hashCode() : 0)) * 31, 31, this.l);
        bp0 bp0Var = this.m;
        int i3 = (c3 + (bp0Var != null ? bp0Var.a : 0)) * 31;
        rk0 rk0Var = this.n;
        int hashCode8 = (i3 + (rk0Var != null ? rk0Var.hashCode() : 0)) * 961;
        t10 t10Var = this.o;
        return hashCode8 + (t10Var != null ? t10Var.hashCode() : 0);
    }

    public final String toString() {
        ep0 ep0Var = this.a;
        return "SpanStyle(color=" + gc.h(ep0Var.b()) + ", brush=" + ep0Var.e() + ", alpha=" + ep0Var.a() + ", fontSize=" + bq0.d(this.b) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + bq0.d(this.h) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + gc.h(this.l) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=null, drawStyle=" + this.o + ")";
    }

    public om0(ep0 ep0Var, long j, xp xpVar, vp vpVar, wp wpVar, no0 no0Var, String str, long j2, c8 c8Var, fp0 fp0Var, h00 h00Var, long j3, bp0 bp0Var, rk0 rk0Var, t10 t10Var) {
        this.a = ep0Var;
        this.b = j;
        this.c = xpVar;
        this.d = vpVar;
        this.e = wpVar;
        this.f = no0Var;
        this.g = str;
        this.h = j2;
        this.i = c8Var;
        this.j = fp0Var;
        this.k = h00Var;
        this.l = j3;
        this.m = bp0Var;
        this.n = rk0Var;
        this.o = t10Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public om0(long j, long j2, xp xpVar, vp vpVar, wp wpVar, no0 no0Var, String str, long j3, c8 c8Var, fp0 fp0Var, h00 h00Var, long j4, bp0 bp0Var, rk0 rk0Var) {
        this(r2, j2, xpVar, vpVar, wpVar, no0Var, str, j3, c8Var, fp0Var, h00Var, j4, bp0Var, rk0Var, (t10) null);
        ep0 ep0Var;
        if (j != 16) {
            ep0Var = new sc(j);
        } else {
            ep0Var = b2.X;
        }
    }
}
