package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p90 {
    public String a;
    public zp0 b;
    public gp c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public si i;
    public x4 j;
    public boolean k;
    public n20 m;
    public o90 n;
    public xx o;
    public long q;
    public long h = gv.a;
    public long l = 0;
    public long p = xf.g(0, 0, 0, 0);

    public p90(String str, zp0 zp0Var, gp gpVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = zp0Var;
        this.c = gpVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean a(long j, xx xxVar) {
        long j2;
        o90 o90Var;
        int i;
        float f;
        int i2;
        this.q = (this.q << 2) | 3;
        boolean z = false;
        if (this.g > 1) {
            zp0 zp0Var = this.b;
            n20 n20Var = this.m;
            si siVar = this.i;
            siVar.getClass();
            gp gpVar = this.c;
            if ((n20Var == null || xxVar != n20Var.a || !t30.s(zp0Var, xxVar).equals(n20Var.b) || siVar.k() != n20Var.c.e || gpVar != n20Var.d) && ((n20Var = n20.h) == null || xxVar != n20Var.a || !t30.s(zp0Var, xxVar).equals(n20Var.b) || siVar.k() != n20Var.c.e || gpVar != n20Var.d)) {
                n20Var = new n20(xxVar, t30.s(zp0Var, xxVar), new vi(siVar.k(), siVar.g()), gpVar);
                n20.h = n20Var;
            }
            this.m = n20Var;
            int i3 = this.g;
            vi viVar = n20Var.c;
            zp0 zp0Var2 = n20Var.e;
            float f2 = n20Var.g;
            float f3 = n20Var.f;
            if (Float.isNaN(f2) || Float.isNaN(f3)) {
                String str = o20.a;
                gp gpVar2 = n20Var.d;
                um umVar = um.e;
                x4 x4Var = new x4(new b5(str, zp0Var2, umVar, umVar, gpVar2, viVar, false), 1, 1, xf.b(0, 0, 15));
                i = 1;
                float f4 = new x4(new b5(o20.b, zp0Var2, umVar, umVar, n20Var.d, viVar, true), 2, 1, xf.b(0, 0, 15)).f;
                f = x4Var.f;
                f3 = f4 - f;
                n20Var.g = f;
                n20Var.f = f3;
            } else {
                f = f2;
                i = 1;
            }
            if (i3 != i) {
                i2 = Math.round((f3 * (i3 - i)) + f);
                if (i2 < 0) {
                    i2 = 0;
                }
                int g = wf.g(j);
                if (i2 > g) {
                    i2 = g;
                }
            } else {
                i2 = wf.i(j);
            }
            j2 = xf.a(wf.j(j), wf.h(j), i2, wf.g(j));
        } else {
            j2 = j;
        }
        x4 x4Var2 = this.j;
        if (x4Var2 != null && (o90Var = this.n) != null && !o90Var.b() && xxVar == this.o && (wf.b(j2, this.p) || (wf.h(j2) == wf.h(this.p) && wf.j(j2) == wf.j(this.p) && wf.g(j2) >= x4Var2.f && !x4Var2.d.d))) {
            if (!wf.b(j2, this.p)) {
                x4 x4Var3 = this.j;
                x4Var3.getClass();
                long d = xf.d(j2, (m20.b(Math.min(x4Var3.a.m.c(), x4Var3.b())) << 32) | (m20.b(x4Var3.f) & 4294967295L));
                this.l = d;
                this.k = this.d != 3 && (((float) ((int) (d >> 32))) < x4Var3.b() || ((float) ((int) (d & 4294967295L))) < x4Var3.f);
                this.p = j2;
            }
            return false;
        }
        o90 o90Var2 = this.n;
        if (o90Var2 == null || xxVar != this.o || o90Var2.b()) {
            this.o = xxVar;
            String str2 = this.a;
            zp0 s = t30.s(this.b, xxVar);
            si siVar2 = this.i;
            siVar2.getClass();
            gp gpVar3 = this.c;
            boolean z2 = this.e;
            um umVar2 = um.e;
            o90Var2 = new b5(str2, s, umVar2, umVar2, gpVar3, siVar2, z2);
        }
        this.n = o90Var2;
        long m = t10.m(j2, this.e, this.d, o90Var2.c());
        boolean z3 = this.e;
        int i4 = this.d;
        int i5 = this.f;
        x4 x4Var4 = new x4((b5) o90Var2, ((z3 || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, m);
        this.p = j2;
        int b = m20.b(x4Var4.b());
        float f5 = x4Var4.f;
        this.l = xf.d(j2, (b << 32) | (m20.b(f5) & 4294967295L));
        if (this.d != 3 && (((int) (r4 >> 32)) < x4Var4.b() || ((int) (r4 & 4294967295L)) < f5)) {
            z = true;
        }
        this.k = z;
        this.j = x4Var4;
        return true;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.p = xf.g(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void c(si siVar) {
        long j;
        si siVar2 = this.i;
        if (siVar != null) {
            int i = gv.b;
            j = gv.a(siVar.k(), siVar.g());
        } else {
            j = gv.a;
        }
        if (siVar2 == null) {
            this.i = siVar;
            this.h = j;
        } else if (siVar == null || this.h != j) {
            this.i = siVar;
            this.h = j;
            this.q = (this.q << 2) | 1;
            b();
        }
    }

    public final String toString() {
        return "ParagraphLayoutCache(paragraph=" + (this.j != null ? "<paragraph>" : "null") + ", lastDensity=" + gv.b(this.h) + ", history=" + this.q + ", constraints=$)";
    }
}
