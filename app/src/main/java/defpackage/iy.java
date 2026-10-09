package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class iy implements z80, le {
    public static final mg0 Q = new mg0(1);
    public static final hf R = new hf(12);
    public static final ey S = new ey();
    public static final mp T = new mp(3);
    public si A;
    public xx B;
    public wt0 C;
    public ff D;
    public gy E;
    public gy F;
    public boolean G;
    public final y50 H;
    public final ly I;
    public d60 J;
    public boolean K;
    public u20 L;
    public u20 M;
    public boolean N;
    public int O;
    public boolean P;
    public final boolean e;
    public int f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public int k;
    public iy l;
    public int m;
    public final p2 n;
    public t40 o;
    public boolean p;
    public iy q;
    public e3 r;
    public int s;
    public boolean t;
    public boolean u;
    public qj0 v;
    public boolean w;
    public final t40 x;
    public boolean y;
    public b20 z;

    public iy(boolean z, int i) {
        this.e = z;
        this.f = i;
        this.h = 9223372034707292159L;
        this.i = true;
        this.j = true;
        this.k = -4;
        this.n = new p2(9, new t40(new iy[16]), new f5(6, this));
        this.x = new t40(new iy[16]);
        this.y = true;
        this.z = Q;
        this.A = nh.i;
        this.B = xx.e;
        this.C = S;
        ff.d.getClass();
        this.D = ef.b;
        gy gyVar = gy.g;
        this.E = gyVar;
        this.F = gyVar;
        this.H = new y50(this);
        this.I = new ly(this);
        this.K = true;
        this.L = r20.a;
    }

    public static boolean J(iy iyVar) {
        a20 a20Var = iyVar.I.o;
        return iyVar.I(a20Var.n ? new wf(a20Var.h) : null);
    }

    public static void L(iy iyVar, boolean z, int i) {
        iy n;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (iyVar.l == null) {
            cv.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        e3 e3Var = iyVar.r;
        if (e3Var == null || iyVar.t || iyVar.e) {
            return;
        }
        e3Var.u(iyVar, true, z);
        if (z2) {
            c10 c10Var = iyVar.I.p;
            c10Var.getClass();
            ly lyVar = c10Var.j;
            iy n2 = lyVar.a.n();
            gy gyVar = lyVar.a.E;
            if (n2 == null || gyVar == gy.g) {
                return;
            }
            while (n2.E == gyVar && (n = n2.n()) != null) {
                n2 = n;
            }
            int ordinal = gyVar.ordinal();
            if (ordinal == 0) {
                if (n2.l != null) {
                    L(n2, z, 6);
                    return;
                } else {
                    N(n2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                z6.m("Intrinsics isn't used by the parent");
            } else if (n2.l != null) {
                n2.K(z);
            } else {
                n2.M(z);
            }
        }
    }

    public static void N(iy iyVar, boolean z, int i) {
        e3 e3Var;
        iy n;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (iyVar.t || iyVar.e || (e3Var = iyVar.r) == null) {
            return;
        }
        e3Var.u(iyVar, false, z);
        if (z2) {
            ly lyVar = iyVar.I.o.j;
            iy n2 = lyVar.a.n();
            gy gyVar = lyVar.a.E;
            if (n2 == null || gyVar == gy.g) {
                return;
            }
            while (n2.E == gyVar && (n = n2.n()) != null) {
                n2 = n;
            }
            int ordinal = gyVar.ordinal();
            if (ordinal == 0) {
                N(n2, z, 6);
            } else if (ordinal == 1) {
                n2.M(z);
            } else {
                z6.m("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void O(iy iyVar) {
        int i = hy.a[iyVar.I.c.ordinal()];
        ly lyVar = iyVar.I;
        if (i != 1) {
            z6.k(lyVar.c, "Unexpected state ");
            return;
        }
        if (lyVar.d) {
            L(iyVar, true, 6);
            return;
        }
        if (lyVar.e) {
            iyVar.K(true);
        }
        if (iyVar.k()) {
            N(iyVar, true, 6);
        } else if (iyVar.j()) {
            iyVar.M(true);
        }
    }

    private final String h(iy iyVar) {
        String e = e(0);
        iy iyVar2 = iyVar.q;
        return "Cannot insert " + iyVar + " because it already has a parent or an owner. This tree: " + e + " Other tree: " + (iyVar2 != null ? iyVar2.e(0) : null);
    }

    public final void A() {
        iy iyVar;
        if (this.m > 0) {
            this.p = true;
        }
        if (!this.e || (iyVar = this.q) == null) {
            return;
        }
        iyVar.A();
    }

    public final boolean B() {
        return this.r != null;
    }

    public final boolean C() {
        return this.I.o.v;
    }

    public final Boolean D() {
        c10 c10Var = this.I.p;
        if (c10Var != null) {
            return Boolean.valueOf(c10Var.t != b10.g);
        }
        return null;
    }

    public final void E(iy iyVar) {
        if (iyVar.I.k > 0) {
            this.I.d(r0.k - 1);
        }
        if (this.r != null) {
            iyVar.f();
        }
        iyVar.q = null;
        if (iyVar.O > 0) {
            S(this.O - 1);
        }
        iyVar.H.d.A = null;
        if (iyVar.e) {
            this.m--;
            t40 t40Var = (t40) iyVar.n.f;
            Object[] objArr = t40Var.e;
            int i = t40Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((iy) objArr[i2]).H.d.A = null;
            }
        }
        A();
        H();
    }

    public final void F(d60 d60Var) {
        e3 e3Var = this.r;
        qe0 rectManager = e3Var != null ? e3Var.getRectManager() : null;
        ly lyVar = this.I;
        boolean z = lyVar.c != fy.i || k() || j();
        if (this.k != -4 && rectManager != null) {
            if (d60Var == this.H.d) {
                this.j = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.i = true;
                t40 t = t();
                Object[] objArr = t.e;
                int i = t.g;
                for (int i2 = 0; i2 < i; i2++) {
                    iy iyVar = (iy) objArr[i2];
                    iyVar.j = true;
                    if (!z) {
                        rectManager.g(iyVar);
                    }
                }
                if (this.k != -4) {
                    rectManager.f = true;
                    int d = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.b;
                    int i3 = d + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        lyVar.o.Y();
    }

    public final void G() {
        l2 m32getAutofillManager;
        this.P = true;
        t20 t20Var = this.H.e;
        for (t20 t20Var2 = t20Var; t20Var2 != null; t20Var2 = t20Var2.i) {
            if (t20Var2.r) {
                t20Var2.j0();
            }
        }
        for (t20 t20Var3 = t20Var; t20Var3 != null; t20Var3 = t20Var3.i) {
            if (t20Var3.r) {
                t20Var3.l0();
            }
        }
        while (t20Var != null) {
            if (t20Var.r) {
                t20Var.f0();
            }
            t20Var = t20Var.i;
        }
        if (B()) {
            this.v = null;
            this.u = false;
        }
        e3 e3Var = this.r;
        if (e3Var == null || (m32getAutofillManager = e3Var.m32getAutofillManager()) == null || !m32getAutofillManager.k.e(this.f)) {
            return;
        }
        m32getAutofillManager.e.m(m32getAutofillManager.g, this.f, false);
    }

    public final void H() {
        if (!this.e) {
            this.y = true;
            return;
        }
        iy n = n();
        if (n != null) {
            n.H();
        }
    }

    public final boolean I(wf wfVar) {
        if (wfVar == null) {
            return false;
        }
        if (this.E == gy.g) {
            c();
        }
        return this.I.o.X(wfVar.a);
    }

    public final void K(boolean z) {
        e3 e3Var;
        if (this.e || (e3Var = this.r) == null) {
            return;
        }
        e3Var.v(this, true, z);
    }

    public final void M(boolean z) {
        e3 e3Var;
        if (this.e || (e3Var = this.r) == null) {
            return;
        }
        e3Var.v(this, false, z);
    }

    public final void P() {
        t40 t = t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar = (iy) objArr[i2];
            gy gyVar = iyVar.F;
            iyVar.E = gyVar;
            if (gyVar != gy.g) {
                iyVar.P();
            }
        }
    }

    public final void Q(Throwable th) {
        ff ffVar = this.D;
        ll llVar = bf.a;
        xa0 xa0Var = (xa0) ffVar;
        xa0Var.getClass();
        throw th;
    }

    public final void R(si siVar) {
        if (lw.i(this.A, siVar)) {
            return;
        }
        this.A = siVar;
        y();
        iy n = n();
        if (n != null) {
            n.w();
        } else {
            e3 e3Var = this.r;
            if (e3Var != null) {
                e3Var.invalidate();
            }
        }
        x();
        for (t20 t20Var = this.H.f; t20Var != null; t20Var = t20Var.j) {
            t20Var.a();
        }
    }

    public final void S(int i) {
        iy n;
        iy n2;
        int i2 = this.O;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (n2 = n()) != null) {
                n2.S(n2.O + 1);
            }
            if (i == 0 && this.O > 0 && (n = n()) != null) {
                n.S(n.O - 1);
            }
            this.O = i;
        }
    }

    public final void T(iy iyVar) {
        if (lw.i(iyVar, this.l)) {
            return;
        }
        this.l = iyVar;
        ly lyVar = this.I;
        if (iyVar != null) {
            if (lyVar.p == null) {
                lyVar.p = new c10(lyVar);
            }
            y50 y50Var = this.H;
            d60 d60Var = y50Var.c.z;
            for (d60 d60Var2 = y50Var.d; !lw.i(d60Var2, d60Var) && d60Var2 != null; d60Var2 = d60Var2.z) {
                d60Var2.v0();
            }
        } else {
            lyVar.p = null;
            lyVar.e = false;
            lyVar.d = false;
        }
        y();
    }

    public final void U(u20 u20Var) {
        if (this.e && this.L != r20.a) {
            cv.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.P) {
            cv.a("modifier is updated when deactivated");
        }
        if (!B()) {
            this.M = u20Var;
            return;
        }
        a(u20Var);
        if (this.u) {
            z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void V(wt0 wt0Var) {
        if (lw.i(this.C, wt0Var)) {
            return;
        }
        this.C = wt0Var;
        t20 t20Var = this.H.f;
        if ((t20Var.h & 16) != 0) {
            while (t20Var != null) {
                if ((t20Var.g & 16) != 0) {
                    oi oiVar = t20Var;
                    ?? r2 = 0;
                    while (oiVar != 0) {
                        if (oiVar instanceof yc0) {
                            ((yc0) oiVar).L();
                        } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                            t20 t20Var2 = oiVar.t;
                            int i = 0;
                            oiVar = oiVar;
                            r2 = r2;
                            while (t20Var2 != null) {
                                if ((t20Var2.g & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        oiVar = t20Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new t40(new t20[16]);
                                        }
                                        if (oiVar != 0) {
                                            r2.b(oiVar);
                                            oiVar = 0;
                                        }
                                        r2.b(t20Var2);
                                    }
                                }
                                t20Var2 = t20Var2.j;
                                oiVar = oiVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        oiVar = nh.N(r2);
                    }
                }
                if ((t20Var.h & 16) == 0) {
                    return;
                } else {
                    t20Var = t20Var.j;
                }
            }
        }
    }

    public final void W() {
        if (this.m <= 0 || !this.p) {
            return;
        }
        this.p = false;
        t40 t40Var = this.o;
        if (t40Var == null) {
            t40Var = new t40(new iy[16]);
            this.o = t40Var;
        }
        t40Var.g();
        t40 t40Var2 = (t40) this.n.f;
        Object[] objArr = t40Var2.e;
        int i = t40Var2.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar = (iy) objArr[i2];
            if (iyVar.e) {
                t40Var.c(t40Var.g, iyVar.t());
            } else {
                t40Var.b(iyVar);
            }
        }
        ly lyVar = this.I;
        lyVar.o.C = true;
        c10 c10Var = lyVar.p;
        if (c10Var != null) {
            c10Var.w = true;
        }
    }

    public final void a(u20 u20Var) {
        int i;
        y50 y50Var;
        int i2;
        y50 y50Var2;
        x50 x50Var;
        h40 h40Var;
        h40 h40Var2;
        h40 h40Var3;
        boolean z;
        y50 y50Var3;
        y50 y50Var4 = this.H;
        boolean c = y50Var4.c(16);
        t20 t20Var = y50Var4.e;
        boolean c2 = y50Var4.c(1024);
        this.L = u20Var;
        iv ivVar = y50Var4.c;
        iy iyVar = y50Var4.a;
        t20 t20Var2 = y50Var4.f;
        x50 x50Var2 = y50Var4.b;
        if (t20Var2 == x50Var2) {
            cv.b("padChain called on already padded chain");
        }
        t20 t20Var3 = y50Var4.f;
        t20Var3.i = x50Var2;
        x50Var2.j = t20Var3;
        h40 h40Var4 = y50Var4.g;
        int i3 = h40Var4.b;
        iy iyVar2 = iyVar;
        for (iy n = iyVar.n(); n != null; n = n.n()) {
            iyVar2 = n;
        }
        y50 y50Var5 = iyVar2.H;
        h40 h40Var5 = y50Var5.h;
        if (h40Var5 == null) {
            h40Var5 = new h40();
            y50Var5.h = h40Var5;
        }
        int i4 = h40Var5.b - 1;
        h40 h40Var6 = i4 >= 0 ? (h40) h40Var5.l(i4) : new h40();
        h40 h40Var7 = y50Var5.i;
        if (h40Var7 == null) {
            h40Var7 = new h40();
        }
        boolean z2 = true;
        y50Var5.i = null;
        h40Var7.a(u20Var);
        l lVar = null;
        while (h40Var7.j()) {
            u20 u20Var2 = (u20) h40Var7.l(h40Var7.b - 1);
            l lVar2 = lVar;
            if (u20Var2 instanceof dd) {
                dd ddVar = (dd) u20Var2;
                h40Var7.a(ddVar.b);
                h40Var7.a(ddVar.a);
            } else if (u20Var2 instanceof s20) {
                h40Var6.a(u20Var2);
            } else {
                if (lVar2 == null) {
                    y50Var3 = y50Var4;
                    lVar = new l(18, h40Var6);
                } else {
                    y50Var3 = y50Var4;
                    lVar = lVar2;
                }
                u20Var2.b(lVar);
                y50Var4 = y50Var3;
            }
            lVar = lVar2;
            y50Var3 = y50Var4;
            y50Var4 = y50Var3;
        }
        y50 y50Var6 = y50Var4;
        int i5 = h40Var6.b;
        int i6 = 0;
        if (i5 == i3) {
            t20 t20Var4 = x50Var2.j;
            i = 0;
            while (t20Var4 != null && i6 < i3) {
                s20 s20Var = (s20) h40Var4.g(i6);
                s20 s20Var2 = (s20) h40Var6.g(i6);
                if (lw.i(s20Var, s20Var2)) {
                    h40Var2 = h40Var4;
                    h40Var3 = h40Var6;
                    z = 2;
                } else {
                    h40Var2 = h40Var4;
                    h40Var3 = h40Var6;
                    z = s20Var.getClass() == s20Var2.getClass() ? z2 : false;
                }
                if (!z) {
                    t20Var4 = t20Var4.i;
                    break;
                }
                if (z == z2) {
                    y50.h(s20Var, s20Var2, t20Var4);
                }
                t20Var4 = t20Var4.j;
                i6++;
                h40Var4 = h40Var2;
                h40Var6 = h40Var3;
                z2 = true;
            }
            h40Var2 = h40Var4;
            h40Var3 = h40Var6;
            t20 t20Var5 = t20Var4;
            if (i6 >= i3) {
                y50Var = y50Var6;
                h40Var4 = h40Var2;
                h40Var6 = h40Var3;
                y50Var2 = y50Var;
                x50Var = x50Var2;
                h40Var = h40Var6;
                i2 = i;
            } else {
                if (t20Var5 == null) {
                    throw j2.f("structuralUpdate requires a non-null tail");
                }
                boolean z3 = iyVar.M != null;
                y50Var2 = y50Var6;
                h40Var4 = h40Var2;
                h40Var = h40Var3;
                y50Var2.f(i6, h40Var4, h40Var, t20Var5, !z3);
                x50Var = x50Var2;
                i2 = 1;
            }
        } else {
            i = 0;
            y50Var = y50Var6;
            u20 u20Var3 = iyVar.M;
            if (u20Var3 != null && i3 == 0) {
                t20 t20Var6 = x50Var2;
                for (int i7 = 0; i7 < h40Var6.b; i7++) {
                    t20Var6 = y50.a((s20) h40Var6.g(i7), t20Var6);
                }
                t20 t20Var7 = t20Var.i;
                while (t20Var7 != null && t20Var7 != x50Var2) {
                    int i8 = i | t20Var7.g;
                    t20Var7.h = i8;
                    t20Var7 = t20Var7.i;
                    i = i8;
                }
                y50Var2 = y50Var;
                x50Var = x50Var2;
                h40Var = h40Var6;
                i2 = 1;
            } else if (i5 == 0) {
                t20 t20Var8 = x50Var2.j;
                for (int i9 = 0; t20Var8 != null && i9 < h40Var4.b; i9++) {
                    t20Var8 = y50.b(t20Var8).j;
                }
                iy n2 = iyVar.n();
                ivVar.A = n2 != null ? n2.H.c : null;
                y50Var.d = ivVar;
                y50Var2 = y50Var;
                x50Var = x50Var2;
                h40Var = h40Var6;
                i2 = i;
            } else {
                boolean z4 = u20Var3 != null;
                i2 = 1;
                y50Var2 = y50Var;
                x50Var = x50Var2;
                h40Var = h40Var6;
                y50Var2.f(0, h40Var4, h40Var, x50Var, !z4);
            }
        }
        y50Var2.g = h40Var;
        h40Var4.d();
        h40Var5.a(h40Var4);
        h40Var7.d();
        y50Var5.i = h40Var7;
        t20 t20Var9 = x50Var.j;
        if (t20Var9 != null) {
            t20Var = t20Var9;
        }
        t20Var.i = null;
        x50Var.j = null;
        x50Var.h = -1;
        x50Var.l = null;
        if (t20Var == x50Var) {
            cv.b("trimChain did not update the head");
        }
        y50Var2.f = t20Var;
        if (i2 != 0) {
            y50Var2.g();
        }
        boolean c3 = y50Var2.c(16);
        boolean c4 = y50Var2.c(1024);
        this.I.j();
        if (this.l == null && y50Var2.c(512)) {
            T(this);
        }
        if (c == c3 && c2 == c4) {
            return;
        }
        qe0 rectManager = nh.c0(this).getRectManager();
        rectManager.getClass();
        if (!B() || this.k == -4) {
            return;
        }
        t4 t4Var = rectManager.c;
        int d = rectManager.d(this);
        long[] jArr = (long[]) t4Var.b;
        int i10 = d + 2;
        jArr[i10] = (jArr[i10] & (-6917529027641081857L)) | ((c4 ? 1L : 0L) * 2305843009213693952L) | ((c3 ? 1L : 0L) * 4611686018427387904L);
    }

    public final void b(e3 e3Var) {
        iy iyVar;
        qj0 q;
        if (this.r != null) {
            cv.b("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        iy iyVar2 = this.q;
        if (iyVar2 != null && !lw.i(iyVar2.r, e3Var)) {
            iy n = n();
            e3 e3Var2 = n != null ? n.r : null;
            String e = e(0);
            iy iyVar3 = this.q;
            cv.b("Attaching to a different owner(" + e3Var + ") than the parent's owner(" + e3Var2 + "). This tree: " + e + " Parent tree: " + (iyVar3 != null ? iyVar3.e(0) : null));
        }
        iy n2 = n();
        ly lyVar = this.I;
        if (n2 == null) {
            lyVar.o.v = true;
            e3Var.getRectManager().g(this);
            c10 c10Var = lyVar.p;
            if (c10Var != null) {
                c10Var.t = b10.e;
            }
        }
        y50 y50Var = this.H;
        y50Var.d.A = n2 != null ? n2.H.c : null;
        this.r = e3Var;
        this.s = (n2 != null ? n2.s : -1) + 1;
        u20 u20Var = this.M;
        if (u20Var != null) {
            a(u20Var);
        }
        this.M = null;
        e3Var.getLayoutNodes().h(this.f, this);
        iy iyVar4 = this.q;
        if (iyVar4 == null || (iyVar = iyVar4.l) == null) {
            iyVar = this.l;
        }
        T(iyVar);
        if (this.l == null && y50Var.c(512)) {
            T(this);
        }
        if (!this.P) {
            for (t20 t20Var = y50Var.f; t20Var != null; t20Var = t20Var.j) {
                t20Var.e0();
            }
        }
        t40 t40Var = (t40) this.n.f;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((iy) objArr[i2]).b(e3Var);
        }
        if (!this.P) {
            y50Var.e();
        }
        y();
        if (n2 != null) {
            n2.y();
        }
        lyVar.j();
        if (!this.P && y50Var.c(8)) {
            z();
        }
        l2 m32getAutofillManager = e3Var.m32getAutofillManager();
        if (m32getAutofillManager == null || (q = q()) == null || !q.e.b(yj0.r)) {
            return;
        }
        m32getAutofillManager.k.a(this.f);
        m32getAutofillManager.e.m(m32getAutofillManager.g, this.f, true);
    }

    public final void c() {
        this.F = this.E;
        gy gyVar = gy.g;
        this.E = gyVar;
        t40 t = t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar = (iy) objArr[i2];
            if (iyVar.E != gyVar) {
                iyVar.c();
            }
        }
    }

    public final void d() {
        this.F = this.E;
        this.E = gy.g;
        t40 t = t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar = (iy) objArr[i2];
            if (iyVar.E == gy.f) {
                iyVar.d();
            }
        }
    }

    public final String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        t40 t = t();
        Object[] objArr = t.e;
        int i3 = t.g;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((iy) objArr[i4]).e(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void f() {
        jy jyVar;
        e3 e3Var = this.r;
        if (e3Var == null) {
            iy n = n();
            cv.c("Cannot detach node that is already detached!  Tree: " + (n != null ? n.e(0) : null));
            throw new id();
        }
        iy n2 = n();
        ly lyVar = this.I;
        if (n2 != null) {
            n2.w();
            n2.y();
            a20 a20Var = lyVar.o;
            gy gyVar = gy.g;
            a20Var.p = gyVar;
            c10 c10Var = lyVar.p;
            if (c10Var != null) {
                c10Var.n = gyVar;
            }
        }
        jy jyVar2 = lyVar.o.A;
        jyVar2.b = true;
        jyVar2.c = false;
        jyVar2.d = false;
        jyVar2.e = null;
        c10 c10Var2 = lyVar.p;
        if (c10Var2 != null && (jyVar = c10Var2.u) != null) {
            jyVar.b = true;
            jyVar.c = false;
            jyVar.d = false;
            jyVar.e = null;
        }
        y50 y50Var = this.H;
        t20 t20Var = y50Var.e;
        d60 d60Var = y50Var.c.z;
        for (d60 d60Var2 = y50Var.d; !lw.i(d60Var2, d60Var) && d60Var2 != null; d60Var2 = d60Var2.z) {
            d60Var2.U0();
            if (d60Var2.y.C()) {
                d60Var2.P0();
            }
        }
        for (t20 t20Var2 = t20Var; t20Var2 != null; t20Var2 = t20Var2.i) {
            if (t20Var2.r) {
                t20Var2.l0();
            }
        }
        this.t = true;
        t40 t40Var = (t40) this.n.f;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((iy) objArr[i2]).f();
        }
        this.t = false;
        while (t20Var != null) {
            if (t20Var.r) {
                t20Var.f0();
            }
            t20Var = t20Var.i;
        }
        e3Var.getLayoutNodes().g(this.f);
        y10 y10Var = e3Var.T;
        v6 v6Var = y10Var.b;
        ((t3) v6Var.a).x(this);
        ((t3) v6Var.b).x(this);
        ((t3) v6Var.c).x(this);
        ((t40) y10Var.e.f).i(this);
        e3Var.N = true;
        l2 m32getAutofillManager = e3Var.m32getAutofillManager();
        if (m32getAutofillManager != null && m32getAutofillManager.k.e(this.f)) {
            m32getAutofillManager.e.m(m32getAutofillManager.g, this.f, false);
        }
        e3Var.getRectManager().h(this);
        this.r = null;
        T(null);
        this.s = 0;
        a20 a20Var2 = lyVar.o;
        a20Var2.m = Integer.MAX_VALUE;
        a20Var2.l = Integer.MAX_VALUE;
        a20Var2.v = false;
        c10 c10Var3 = lyVar.p;
        if (c10Var3 != null) {
            c10Var3.m = Integer.MAX_VALUE;
            c10Var3.l = Integer.MAX_VALUE;
            c10Var3.t = b10.g;
        }
        if (y50Var.c(8)) {
            qj0 qj0Var = this.v;
            this.v = null;
            this.u = false;
            e3Var.getSemanticsOwner().b(this, qj0Var);
            e3Var.w();
        }
    }

    public final void g(ma maVar, es esVar) {
        try {
            this.H.d.t0(maVar, esVar);
        } catch (Throwable th) {
            Q(th);
            throw null;
        }
    }

    public final List i() {
        return t().f();
    }

    public final boolean j() {
        return this.I.o.y;
    }

    public final boolean k() {
        return this.I.o.x;
    }

    public final gy l() {
        return this.I.o.p;
    }

    public final gy m() {
        gy gyVar;
        c10 c10Var = this.I.p;
        return (c10Var == null || (gyVar = c10Var.n) == null) ? gy.g : gyVar;
    }

    public final iy n() {
        iy iyVar = this.q;
        while (iyVar != null && iyVar.e) {
            iyVar = iyVar.q;
        }
        return iyVar;
    }

    public final int o() {
        return this.I.o.m;
    }

    @Override // defpackage.z80
    public final boolean p() {
        return B();
    }

    public final qj0 q() {
        if (B() && !this.P && this.H.c(8)) {
            return this.v;
        }
        return null;
    }

    public final float r() {
        return this.I.o.H;
    }

    public final t40 s() {
        boolean z = this.y;
        t40 t40Var = this.x;
        if (z) {
            t40Var.g();
            t40Var.c(t40Var.g, t());
            Arrays.sort(t40Var.e, 0, t40Var.g, T);
            this.y = false;
        }
        return t40Var;
    }

    public final t40 t() {
        W();
        if (this.m == 0) {
            return (t40) this.n.f;
        }
        t40 t40Var = this.o;
        t40Var.getClass();
        return t40Var;
    }

    public final String toString() {
        return nh.f0(this) + " children: " + ((q40) i()).e.g + " measurePolicy: " + this.z + " deactivated: " + this.P + " isVirtual: " + this.e + " isPlaced: " + C();
    }

    public final void u(long j, bt btVar, int i, boolean z) {
        y50 y50Var = this.H;
        d60 d60Var = y50Var.d;
        a60 a60Var = d60.Y;
        y50Var.d.G0(d60.c0, d60Var.x0(j), btVar, i, z);
    }

    public final void v(int i, iy iyVar) {
        if (iyVar.q != null && iyVar.r != null) {
            cv.b(h(iyVar));
        }
        iyVar.q = this;
        p2 p2Var = this.n;
        ((t40) p2Var.f).a(i, iyVar);
        ((f5) p2Var.g).b();
        H();
        if (iyVar.e) {
            this.m++;
        }
        A();
        e3 e3Var = this.r;
        if (e3Var != null) {
            iyVar.b(e3Var);
        }
        if (iyVar.I.k > 0) {
            ly lyVar = this.I;
            lyVar.d(lyVar.k + 1);
        }
        if (iyVar.O > 0) {
            S(this.O + 1);
        }
    }

    public final void w() {
        if (this.K) {
            y50 y50Var = this.H;
            d60 d60Var = y50Var.c;
            d60 d60Var2 = y50Var.d.A;
            this.J = null;
            while (true) {
                if (lw.i(d60Var, d60Var2)) {
                    break;
                }
                if ((d60Var != null ? d60Var.X : null) != null) {
                    this.J = d60Var;
                    break;
                }
                d60Var = d60Var != null ? d60Var.A : null;
            }
            this.K = false;
        }
        d60 d60Var3 = this.J;
        if (d60Var3 != null && d60Var3.X == null) {
            throw j2.f("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (d60Var3 != null) {
            d60Var3.I0();
            return;
        }
        iy n = n();
        if (n != null) {
            n.w();
            return;
        }
        e3 e3Var = this.r;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public final void x() {
        y50 y50Var = this.H;
        d60 d60Var = y50Var.d;
        iv ivVar = y50Var.c;
        while (d60Var != ivVar) {
            d60Var.getClass();
            dy dyVar = (dy) d60Var;
            y80 y80Var = dyVar.X;
            if (y80Var != null) {
                ((hs) y80Var).c();
            }
            d60Var = dyVar.z;
        }
        y80 y80Var2 = ivVar.X;
        if (y80Var2 != null) {
            ((hs) y80Var2).c();
        }
    }

    public final void y() {
        if (this.e) {
            iy n = n();
            if (n != null) {
                n.y();
                return;
            }
            return;
        }
        if (this.l != null) {
            L(this, false, 7);
        } else {
            N(this, false, 7);
        }
    }

    public final void z() {
        if (this.w) {
            return;
        }
        if (this.H.b.j != null || this.M != null) {
            this.u = true;
            return;
        }
        qj0 qj0Var = this.v;
        this.w = true;
        ve0 ve0Var = new ve0();
        ve0Var.e = new qj0();
        a90 snapshotObserver = nh.c0(this).getSnapshotObserver();
        s2 s2Var = new s2(10, this, ve0Var);
        snapshotObserver.a.b(this, snapshotObserver.d, s2Var);
        this.w = false;
        this.v = (qj0) ve0Var.e;
        this.u = false;
        e3 c0 = nh.c0(this);
        c0.getSemanticsOwner().b(this, qj0Var);
        c0.w();
    }

    public iy(int i) {
        this((i & 1) == 0, rj0.a.addAndGet(1));
    }
}
