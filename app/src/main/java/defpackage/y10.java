package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y10 {
    public final iy a;
    public boolean c;
    public boolean d;
    public wf h;
    public final v6 b = new v6(3);
    public final p2 e = new p2(11);
    public final t40 f = new t40(new iy[16]);
    public final t40 g = new t40(new x10[16]);

    public y10(iy iyVar) {
        this.a = iyVar;
    }

    public static boolean b(iy iyVar, wf wfVar) {
        boolean b0;
        iy iyVar2 = iyVar.l;
        ly lyVar = iyVar.I;
        if (iyVar2 == null) {
            return false;
        }
        if (wfVar != null) {
            if (iyVar2 != null) {
                c10 c10Var = lyVar.p;
                c10Var.getClass();
                b0 = c10Var.b0(wfVar.a);
            }
            b0 = false;
        } else {
            c10 c10Var2 = lyVar.p;
            wf wfVar2 = c10Var2 != null ? c10Var2.q : null;
            if (wfVar2 != null && iyVar2 != null) {
                c10Var2.getClass();
                b0 = c10Var2.b0(wfVar2.a);
            }
            b0 = false;
        }
        iy n = iyVar.n();
        if (b0 && n != null) {
            if (n.l == null) {
                iy.N(n, false, 3);
                return b0;
            }
            if (iyVar.m() == gy.e) {
                iy.L(n, false, 3);
                return b0;
            }
            if (iyVar.m() == gy.f) {
                n.K(false);
            }
        }
        return b0;
    }

    public static boolean c(iy iyVar, wf wfVar) {
        boolean I = wfVar != null ? iyVar.I(wfVar) : iy.J(iyVar);
        iy n = iyVar.n();
        if (I && n != null) {
            if (iyVar.l() == gy.e) {
                iy.N(n, false, 3);
                return I;
            }
            if (iyVar.l() == gy.f) {
                n.M(false);
            }
        }
        return I;
    }

    public static boolean g(iy iyVar) {
        c10 c10Var;
        jy jyVar;
        if (iyVar.I.d) {
            return (iyVar.m() == gy.g && ((c10Var = iyVar.I.p) == null || (jyVar = c10Var.u) == null || !jyVar.e())) ? false : true;
        }
        return false;
    }

    public static boolean h(iy iyVar) {
        if (!iyVar.k()) {
            return false;
        }
        do {
            if (iyVar.l() == gy.g && !iyVar.I.o.A.e()) {
                iy n = iyVar.n();
                if ((n != null ? n.I.c : null) != fy.e) {
                    return false;
                }
            }
            iyVar = iyVar.n();
            if (iyVar == null) {
                return false;
            }
        } while (!iyVar.C());
        return true;
    }

    public static boolean i(iy iyVar) {
        c10 c10Var;
        jy jyVar;
        ly lyVar = iyVar.I;
        return iyVar.C() || lyVar.o.w || h(iyVar) || lw.i(iyVar.D(), Boolean.TRUE) || g(iyVar) || lyVar.o.A.e() || !((c10Var = lyVar.p) == null || (jyVar = c10Var.u) == null || !jyVar.e());
    }

    public final void a(boolean z) {
        p2 p2Var = this.e;
        t40 t40Var = (t40) p2Var.f;
        if (z) {
            iy iyVar = this.a;
            if (iyVar.O > 0) {
                t40Var.g();
                t40Var.b(iyVar);
                iyVar.N = true;
            }
        }
        if (t40Var.g != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                p2Var.i();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void d() {
        t40 t40Var = this.g;
        int i = t40Var.g;
        if (i != 0) {
            Object[] objArr = t40Var.e;
            for (int i2 = 0; i2 < i; i2++) {
                x10 x10Var = (x10) objArr[i2];
                if (x10Var.a.B()) {
                    boolean z = x10Var.b;
                    iy iyVar = x10Var.a;
                    boolean z2 = x10Var.c;
                    if (z) {
                        iy.L(iyVar, z2, 2);
                    } else {
                        iy.N(iyVar, z2, 2);
                    }
                }
            }
            t40Var.g();
        }
    }

    public final void e(iy iyVar, boolean z) {
        if (!this.c) {
            cv.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? iyVar.I.d : iyVar.k()) {
            cv.a("node not yet measured");
        }
        f(iyVar, z);
    }

    public final void f(iy iyVar, boolean z) {
        c10 c10Var;
        jy jyVar;
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            gy gyVar = gy.e;
            if ((!z && (iyVar2.l() == gyVar || iyVar2.I.o.A.e())) || (z && (iyVar2.m() == gyVar || ((c10Var = iyVar2.I.p) != null && (jyVar = c10Var.u) != null && jyVar.e())))) {
                boolean z2 = lw.z(iyVar2);
                ly lyVar = iyVar2.I;
                if (z2 && !z) {
                    if (lyVar.d) {
                        boolean z3 = iyVar2.l == null;
                        v6 v6Var = this.b;
                        boolean z4 = ((km0) ((t3) v6Var.a).f).contains(iyVar2) || ((km0) ((t3) v6Var.b).f).contains(iyVar2);
                        if (!z3 && z4) {
                            m(iyVar2, true);
                        }
                    }
                    e(iyVar2, true);
                }
                if (z ? lyVar.d : iyVar2.k()) {
                    m(iyVar2, z);
                }
                if (!(z ? lyVar.d : iyVar2.k())) {
                    f(iyVar2, z);
                }
            }
        }
        if (z ? iyVar.I.d : iyVar.k()) {
            m(iyVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [t20] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(eq eqVar) {
        boolean z;
        t20 t20Var;
        boolean z2;
        iy iyVar;
        boolean z3;
        boolean m;
        v6 v6Var = this.b;
        t3 t3Var = (t3) v6Var.a;
        iy iyVar2 = this.a;
        if (!iyVar2.B()) {
            cv.a("performMeasureAndLayout called with unattached root");
        }
        if (!iyVar2.C()) {
            cv.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            cv.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (v6Var.u()) {
                    z = false;
                    while (true) {
                        t3 t3Var2 = (t3) v6Var.c;
                        km0 km0Var = (km0) t3Var2.f;
                        t3 t3Var3 = (t3) v6Var.b;
                        km0 km0Var2 = (km0) t3Var3.f;
                        if (!((km0) t3Var.f).isEmpty()) {
                            iyVar = (iy) ((km0) t3Var.f).first();
                            t3Var.x(iyVar);
                            z3 = iyVar.l != null;
                            z2 = false;
                        } else if (!km0Var2.isEmpty()) {
                            iyVar = (iy) km0Var2.first();
                            t3Var3.x(iyVar);
                            z3 = iyVar.l != null;
                            z2 = true;
                        } else {
                            if (km0Var.isEmpty()) {
                                break;
                            }
                            iy iyVar3 = (iy) km0Var.first();
                            t3Var2.x(iyVar3);
                            z2 = true;
                            iyVar = iyVar3;
                            z3 = false;
                        }
                        if (z2) {
                            m = l(iyVar, z3);
                        } else {
                            m = m(iyVar, z3);
                            if (iyVar.I.e) {
                                v6Var.j(iyVar, qw.f);
                            }
                            if (iyVar.j()) {
                                v6Var.j(iyVar, qw.h);
                            }
                        }
                        if (iyVar == iyVar2 && m) {
                            z = true;
                        }
                    }
                    if (eqVar != null) {
                        eqVar.b();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        t40 t40Var = this.f;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        int i2 = 0;
        while (i2 < i) {
            y50 y50Var = ((iy) objArr[i2]).H;
            iv ivVar = y50Var.c;
            boolean f = e60.f(4194304);
            t20 t20Var2 = ivVar.e0;
            if (f || (t20Var2 = t20Var2.i) != null) {
                a60 a60Var = d60.Y;
                t20 D0 = ivVar.D0(f);
                while (D0 != null && (D0.h & 4194304) != 0) {
                    if ((D0.g & 4194304) != 0) {
                        oi oiVar = D0;
                        t40 t40Var2 = null;
                        while (oiVar != 0) {
                            if (oiVar instanceof ux) {
                                ((ux) oiVar).h(y50Var.c);
                            } else if ((oiVar.g & 4194304) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var3 = oiVar.t;
                                ?? r15 = z4;
                                t20Var = oiVar;
                                t40Var2 = t40Var2;
                                while (t20Var3 != null) {
                                    if ((t20Var3.g & 4194304) != 0) {
                                        r15++;
                                        t40Var2 = t40Var2;
                                        if (r15 == 1) {
                                            t20Var = t20Var3;
                                        } else {
                                            if (t40Var2 == null) {
                                                t40Var2 = new t40(new t20[16]);
                                            }
                                            if (t20Var != null) {
                                                t40Var2.b(t20Var);
                                                t20Var = null;
                                            }
                                            t40Var2.b(t20Var3);
                                        }
                                    }
                                    t20Var3 = t20Var3.j;
                                    t20Var = t20Var;
                                    t40Var2 = t40Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                    z4 = false;
                                    oiVar = t20Var;
                                    t40Var2 = t40Var2;
                                }
                            }
                            t20Var = nh.N(t40Var2);
                            z4 = false;
                            oiVar = t20Var;
                            t40Var2 = t40Var2;
                        }
                    }
                    if (D0 != t20Var2) {
                        D0 = D0.j;
                        z4 = false;
                    }
                }
            }
            i2++;
            z4 = false;
        }
        t40Var.g();
        return z;
    }

    public final void k() {
        v6 v6Var = this.b;
        if (v6Var.u()) {
            iy iyVar = this.a;
            if (!iyVar.B()) {
                cv.a("performMeasureAndLayout called with unattached root");
            }
            if (!iyVar.C()) {
                cv.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                cv.a("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((km0) ((t3) v6Var.c).f).isEmpty() || ((km0) ((t3) v6Var.a).f).isEmpty()) ? false : true) {
                        if (iyVar.l != null) {
                            o(iyVar, true);
                        } else {
                            n(iyVar);
                        }
                    }
                    o(iyVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean l(iy iyVar, boolean z) {
        wf wfVar;
        boolean c;
        iy n;
        iy n2;
        iy n3;
        boolean z2 = iyVar.P;
        ly lyVar = iyVar.I;
        if (z2 || !i(iyVar)) {
            return false;
        }
        iy iyVar2 = this.a;
        if (iyVar == iyVar2) {
            wfVar = this.h;
            wfVar.getClass();
        } else {
            wfVar = null;
        }
        gy gyVar = gy.g;
        boolean z3 = true;
        if (z) {
            c = lyVar.d ? b(iyVar, wfVar) : false;
            if ((c || lyVar.e) && lw.i(iyVar.D(), Boolean.TRUE)) {
                if (iyVar.E == gyVar) {
                    iyVar.d();
                }
                c10 c10Var = lyVar.p;
                c10Var.getClass();
                try {
                    c10Var.k = true;
                    if (!c10Var.o) {
                        cv.b("replace() called on item that was not placed");
                    }
                    c10Var.E = false;
                    if (c10Var.t == b10.g) {
                        z3 = false;
                    }
                    c10Var.Y(c10Var.r, c10Var.s);
                    if (z3 && !c10Var.E && (n3 = c10Var.j.a.n()) != null) {
                        n3.K(false);
                    }
                    c10Var.k = false;
                } catch (Throwable th) {
                    c10Var.k = false;
                    throw th;
                }
            }
        } else {
            c = iyVar.k() ? c(iyVar, wfVar) : false;
            if (iyVar.j() && (iyVar == iyVar2 || ((n2 = iyVar.n()) != null && n2.C() && lyVar.o.w))) {
                gy gyVar2 = iyVar.E;
                if (iyVar == iyVar2) {
                    if (gyVar2 == gyVar) {
                        iyVar.d();
                    }
                    iy n4 = iyVar.n();
                    dc0.h(n4 != null ? n4.H.c.t : nh.c0(iyVar).getPlacementScope(), lyVar.o, 0, 0);
                } else {
                    if (gyVar2 == gyVar) {
                        iyVar.d();
                    }
                    a20 a20Var = lyVar.o;
                    ly lyVar2 = a20Var.j;
                    try {
                        a20Var.k = true;
                        if (!a20Var.o) {
                            cv.b("replace called on unplaced item");
                        }
                        boolean z4 = a20Var.v;
                        a20Var.W(a20Var.q, a20Var.s, a20Var.r);
                        if (z4 && !a20Var.I && (n = lyVar2.a.n()) != null) {
                            n.M(false);
                        }
                    } finally {
                    }
                }
                if (iyVar.O > 0) {
                    ((t40) this.e.f).b(iyVar);
                    iyVar.N = true;
                }
            }
        }
        d();
        return c;
    }

    public final boolean m(iy iyVar, boolean z) {
        wf wfVar;
        boolean z2 = false;
        if (!iyVar.P && i(iyVar)) {
            if (iyVar == this.a) {
                wfVar = this.h;
                wfVar.getClass();
            } else {
                wfVar = null;
            }
            if (z) {
                if (iyVar.I.d) {
                    z2 = b(iyVar, wfVar);
                }
            } else if (iyVar.k()) {
                z2 = c(iyVar, wfVar);
            }
            d();
        }
        return z2;
    }

    public final void n(iy iyVar) {
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            if (iyVar2.l() == gy.e || iyVar2.I.o.A.e()) {
                if (lw.z(iyVar2)) {
                    o(iyVar2, true);
                } else {
                    n(iyVar2);
                }
            }
        }
    }

    public final void o(iy iyVar, boolean z) {
        wf wfVar;
        if (iyVar.P) {
            return;
        }
        if (iyVar == this.a) {
            wfVar = this.h;
            wfVar.getClass();
        } else {
            wfVar = null;
        }
        if (z) {
            b(iyVar, wfVar);
        } else {
            c(iyVar, wfVar);
        }
    }

    public final boolean p(iy iyVar, boolean z) {
        int ordinal = iyVar.I.c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.g.b(new x10(iyVar, false, z));
            } else {
                if (ordinal != 4) {
                    z6.j();
                    return false;
                }
                if (!iyVar.k() || z) {
                    iyVar.I.o.x = true;
                    if (!iyVar.P && (iyVar.C() || h(iyVar))) {
                        iy n = iyVar.n();
                        if (n == null || !n.k()) {
                            this.b.j(iyVar, qw.g);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        wf wfVar = this.h;
        if (wfVar == null ? false : wf.b(wfVar.a, j)) {
            return;
        }
        if (this.c) {
            cv.a("updateRootConstraints called while measuring");
        }
        this.h = new wf(j);
        iy iyVar = this.a;
        boolean B = iyVar.B();
        ly lyVar = iyVar.I;
        if (B) {
            iy iyVar2 = iyVar.l;
            if (iyVar2 != null) {
                lyVar.d = true;
            }
            lyVar.o.x = true;
            this.b.j(iyVar, iyVar2 != null ? qw.e : qw.g);
        }
    }
}
