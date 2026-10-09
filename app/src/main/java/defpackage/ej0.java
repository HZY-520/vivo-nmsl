package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ej0 extends oi implements nx, sj0, yc0, wu, df, cl {
    public boolean A;
    public boolean B;
    public jk C;
    public long D;
    public vr E;
    public vr F;
    public mk G;
    public lk H;
    public kk I;
    public kw J;
    public t3 K;
    public sq0 L;
    public vu M;
    public final l20 N;
    public n O;
    public k0 P;
    public boolean Q;
    public boolean R;
    public o30 S;
    public xq0 T;
    public final xh U;
    public final mj0 V;
    public final bj0 W;
    public final yo X;
    public final hg Y;
    public q80 u;
    public l0 v;
    public boolean w;
    public b40 x;
    public o9 y;
    public al z;

    public ej0(i4 i4Var, b40 b40Var, q80 q80Var, fj0 fj0Var, boolean z, boolean z2) {
        l0 l0Var = q3.a;
        this.u = q80Var;
        this.v = l0Var;
        this.w = z;
        this.x = b40Var;
        this.D = 0L;
        this.N = new l20();
        xh xhVar = new xh(new t3(3, new t3(zi0.c)));
        this.U = xhVar;
        mj0 mj0Var = new mj0(fj0Var, i4Var, xhVar, q80Var, z2, this.N, this, new cj0(this, 0));
        this.V = mj0Var;
        bj0 bj0Var = new bj0(mj0Var, z);
        this.W = bj0Var;
        yo yoVar = new yo(2, null, 10);
        o0(yoVar);
        this.X = yoVar;
        hg hgVar = new hg(q80Var, mj0Var, z2, new cj0(this, 1));
        o0(hgVar);
        this.Y = hgVar;
        o0(new t50(bj0Var, this.N));
        a9 a9Var = new a9();
        a9Var.s = hgVar;
        o0(a9Var);
    }

    public static void u0(ej0 ej0Var, vc0 vc0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        lk lkVar = ej0Var.H;
        if (lkVar == null) {
            lkVar = new lk();
            lkVar.w = null;
            lkVar.x = Long.MAX_VALUE;
            lkVar.y = false;
            ej0Var.H = lkVar;
        }
        lkVar.w = vc0Var;
        lkVar.x = j;
        sq0 sq0Var = ej0Var.L;
        q80 q80Var = ej0Var.u;
        if (sq0Var == null) {
            ej0Var.L = new sq0(q80Var);
        } else {
            sq0Var.a = q80Var;
            sq0Var.b = j2;
        }
        lkVar.y = false;
        ej0Var.J = lkVar;
    }

    public final t3 A0() {
        t3 t3Var = this.K;
        if (t3Var != null) {
            return t3Var;
        }
        z6.l("Velocity Tracker not initialized.");
        return null;
    }

    public final void B0(vc0 vc0Var, long j) {
        this.D = s60.e(this.D, j);
        z20.c(A0(), vc0Var);
        z0().p(new ok(j, false));
    }

    public final void C0(vc0 vc0Var, vc0 vc0Var2, long j) {
        if (this.K == null) {
            this.K = new t3(28);
        }
        z20.c(A0(), vc0Var);
        long d = s60.d(vc0Var2.c, j);
        l0 l0Var = this.v;
        int i = vc0Var.i;
        l0Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.A) {
            if (this.y == null) {
                this.y = lw.a(Integer.MAX_VALUE, 6, null);
            }
            D0();
        }
        z0().p(new pk(d));
    }

    public final void D0() {
        this.A = true;
        if (this.y == null) {
            this.y = lw.a(Integer.MAX_VALUE, 6, null);
        }
        q3.A(c0(), null, new yk(this, null), 3);
    }

    public final void E0(i4 i4Var, b40 b40Var, q80 q80Var, fj0 fj0Var, boolean z, boolean z2) {
        boolean z3;
        if (this.w != z) {
            this.W.f = z;
            this.O = null;
            this.P = null;
            p30.i(this);
        }
        mj0 mj0Var = this.V;
        boolean z4 = true;
        if (lw.i(mj0Var.a, fj0Var)) {
            z3 = false;
        } else {
            mj0Var.a = fj0Var;
            z3 = true;
        }
        mj0Var.b = i4Var;
        q80 q80Var2 = mj0Var.d;
        if (q80Var2 != q80Var) {
            mj0Var.d = q80Var;
            q80Var2 = q80Var;
            z3 = true;
        }
        if (mj0Var.e != z2) {
            mj0Var.e = z2;
            z3 = true;
        }
        mj0Var.c = this.U;
        mj0Var.f = this.N;
        hg hgVar = this.Y;
        hgVar.s = q80Var;
        hgVar.u = z2;
        l0 l0Var = q3.a;
        q80 q80Var3 = q80.e;
        if (q80Var2 != q80Var3) {
            q80Var3 = q80.f;
        }
        this.v = l0Var;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                vr vrVar = this.F;
                if (vrVar != null) {
                    p0(vrVar);
                }
                vr vrVar2 = this.E;
                if (vrVar2 != null) {
                    p0(vrVar2);
                }
                this.F = null;
                this.E = null;
                r0();
                this.M = null;
            }
            z3 = true;
        }
        if (!lw.i(this.x, b40Var)) {
            r0();
            this.x = b40Var;
        }
        if (this.u != q80Var3) {
            this.u = q80Var3;
        } else {
            z4 = z3;
        }
        if (z4) {
            boolean z5 = this.B;
            nk nkVar = nk.a;
            if (z5) {
                s0();
                if (this.A) {
                    z0().p(nkVar);
                }
                this.K = null;
            }
            vu vuVar = this.M;
            if (vuVar != null) {
                vuVar.a();
                ej0 ej0Var = vuVar.e;
                if (ej0Var.A) {
                    ej0Var.v0(nkVar);
                }
                vuVar.k = null;
                jd jdVar = vuVar.n;
                jdVar.e = 0;
                ((c40) jdVar.f).b = 0;
            }
        }
    }

    @Override // defpackage.nx
    public final boolean F(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (!this.w || ((!lx.a(lr0.b(keyEvent.getKeyCode()), lx.n) && !lx.a(lr0.b(keyEvent.getKeyCode()), lx.m)) || t10.r(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.V.d == q80.e;
        hg hgVar = this.Y;
        if (z) {
            int p0 = (int) (hgVar.p0() & 4294967295L);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(lx.a(lr0.b(keyEvent.getKeyCode()), lx.m) ? p0 : -p0));
        } else {
            int p02 = (int) (hgVar.p0() >> 32);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(lx.a(lr0.b(keyEvent.getKeyCode()), lx.m) ? p02 : -p02) << 32);
        }
        q3.A(c0(), null, new k0(this, floatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        if (this.w && (this.O == null || this.P == null)) {
            this.O = new n(1, this);
            this.P = new k0(this, null);
        }
        n nVar = this.O;
        if (nVar != null) {
            jx[] jxVarArr = zj0.a;
            bk0Var.a(pj0.d, new p0(null, nVar));
        }
        k0 k0Var = this.P;
        if (k0Var != null) {
            jx[] jxVarArr2 = zj0.a;
            bk0Var.a(pj0.e, k0Var);
        }
    }

    @Override // defpackage.yc0
    public final void P() {
        if (this.B) {
            s0();
            if (this.A) {
                z0().p(nk.a);
            }
            this.K = null;
        }
        this.B = false;
    }

    @Override // defpackage.rr
    public final String X() {
        if (!this.w) {
            return "idle";
        }
        kw kwVar = this.J;
        return kwVar instanceof jk ? ((jk) kwVar).y ? "waiting" : "idle" : ((kwVar instanceof lk) || (kwVar instanceof kk)) ? "waiting" : kwVar instanceof mk ? "recognized" : "idle";
    }

    @Override // defpackage.ni, defpackage.yc0
    public final void a() {
        P();
        o30 o30Var = this.S;
        if (o30Var != null) {
            o30Var.c = nh.a0(this).A;
        }
        xq0 xq0Var = this.T;
        if (xq0Var != null) {
            xq0Var.c = nh.a0(this).A;
        }
        P();
        if (this.r) {
            si siVar = nh.a0(this).A;
            xh xhVar = this.U;
            xhVar.getClass();
            xhVar.a = new t3(3, new t3(siVar));
        }
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.cl
    public final q80 e() {
        return this.u;
    }

    @Override // defpackage.t20
    public final void g0() {
        o30 o30Var = this.S;
        if (o30Var != null) {
            o30Var.c = nh.a0(this).A;
        }
        xq0 xq0Var = this.T;
        if (xq0Var != null) {
            xq0Var.c = nh.a0(this).A;
        }
        if (this.r) {
            si siVar = nh.a0(this).A;
            xh xhVar = this.U;
            xhVar.getClass();
            xhVar.a = new t3(3, new t3(siVar));
        }
    }

    @Override // defpackage.t20
    public final void h0() {
        this.A = false;
        r0();
        vr vrVar = this.F;
        if (vrVar != null) {
            p0(vrVar);
        }
        vr vrVar2 = this.E;
        if (vrVar2 != null) {
            p0(vrVar2);
        }
        this.F = null;
        this.E = null;
    }

    @Override // defpackage.wu
    public final void q() {
        vu vuVar = this.M;
        if (vuVar != null) {
            vuVar.a();
            ej0 ej0Var = vuVar.e;
            if (ej0Var.A) {
                ej0Var.v0(nk.a);
            }
            vuVar.k = null;
            jd jdVar = vuVar.n;
            jdVar.e = 0;
            ((c40) jdVar.f).b = 0;
        }
    }

    public final void r0() {
        al alVar = this.z;
        if (alVar != null) {
            b40 b40Var = this.x;
            if (b40Var != null) {
                b40Var.b(new zk(alVar));
            }
            this.z = null;
        }
    }

    public final void s0() {
        this.D = 0L;
        jk jkVar = this.C;
        ik ikVar = ik.g;
        if (jkVar == null) {
            jkVar = new jk();
            jkVar.w = ikVar;
            jkVar.x = false;
            jkVar.y = false;
            this.C = jkVar;
        }
        jkVar.w = ikVar;
        jkVar.x = false;
        jkVar.y = false;
        this.J = jkVar;
    }

    public final void t0(vc0 vc0Var, long j, sq0 sq0Var) {
        kk kkVar = this.I;
        if (kkVar == null) {
            kkVar = new kk();
            kkVar.w = null;
            kkVar.x = Long.MAX_VALUE;
            this.I = kkVar;
        }
        kkVar.w = vc0Var;
        kkVar.x = j;
        sq0Var.b = 0L;
        this.J = kkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [ej0, oi] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object] */
    @Override // defpackage.wu
    public final void v(t4 t4Var, sc0 sc0Var) {
        Object obj;
        float f;
        Object obj2;
        char c;
        float intBitsToFloat;
        boolean z;
        sc0 sc0Var2;
        Object obj3;
        sc0 sc0Var3;
        ou ouVar;
        ou ouVar2;
        pu puVar;
        int i = t4Var.a;
        ArrayList arrayList = (ArrayList) t4Var.b;
        if (this.w) {
            vu vuVar = this.M;
            if (vuVar == null) {
                vuVar = new vu(this);
                this.M = vuVar;
            }
            if (this.F == null) {
                vr vrVar = new vr(vuVar);
                o0(vrVar);
                this.F = vrVar;
            }
            vu vuVar2 = this.M;
            if (vuVar2 != null) {
                ej0 ej0Var = vuVar2.e;
                dx0 dx0Var = vuVar2.j;
                dx0 dx0Var2 = dx0Var;
                if (dx0Var == null) {
                    qu quVar = vuVar2.f;
                    qu quVar2 = quVar;
                    if (quVar == null) {
                        qu quVar3 = new qu();
                        quVar3.G = pu.g;
                        quVar3.H = false;
                        quVar3.I = false;
                        vuVar2.f = quVar3;
                        quVar2 = quVar3;
                    }
                    vuVar2.j = quVar2;
                    dx0Var2 = quVar2;
                }
                boolean z2 = dx0Var2 instanceof qu;
                sc0 sc0Var4 = sc0.e;
                sc0 sc0Var5 = sc0.f;
                if (z2) {
                    qu quVar4 = (qu) dx0Var2;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!q3.g((ou) arrayList.get(i2))) {
                            return;
                        }
                    }
                    ou ouVar3 = (ou) ac.Z(arrayList);
                    int i3 = uu.a[quVar4.G.ordinal()];
                    pu puVar2 = pu.f;
                    pu puVar3 = pu.e;
                    if (i3 == 1) {
                        mj0 mj0Var = ej0Var.V;
                        if (!mj0Var.a.c()) {
                            i4 i4Var = mj0Var.b;
                            if (!(i4Var != null ? i4Var.e() : false)) {
                                puVar = puVar3;
                            }
                        }
                        puVar = puVar2;
                    } else {
                        puVar = quVar4.G;
                    }
                    quVar4.G = puVar;
                    if (sc0Var == sc0Var4) {
                        if (puVar == puVar2) {
                            ouVar3.i = true;
                            quVar4.H = true;
                        }
                        quVar4.I = true;
                    }
                    if (sc0Var == sc0Var5) {
                        if (puVar == puVar3) {
                            vu.c(vuVar2, ouVar3, ouVar3.a, 0L, 12);
                            return;
                        }
                        if (quVar4.H) {
                            vuVar2.g(ouVar3, ouVar3, new nu(i), 0L);
                            vuVar2.f(ouVar3, new nu(i), 0L);
                            long j = ouVar3.a;
                            tu tuVar = vuVar2.g;
                            if (tuVar == null) {
                                tuVar = new tu();
                                tuVar.G = Long.MAX_VALUE;
                                vuVar2.g = tuVar;
                            }
                            tuVar.G = j;
                            vuVar2.j = tuVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = dx0Var2 instanceof su;
                sc0 sc0Var6 = sc0.g;
                if (z3) {
                    su suVar = (su) dx0Var2;
                    if (sc0Var == sc0Var4) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            sc0Var2 = sc0Var5;
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        sc0Var2 = sc0Var5;
                        if (u10.l(((ou) obj3).a, suVar.H)) {
                            break;
                        }
                        i4++;
                        sc0Var5 = sc0Var2;
                    }
                    ou ouVar4 = (ou) obj3;
                    if (ouVar4 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                ouVar2 = 0;
                                break;
                            }
                            ouVar2 = arrayList.get(i5);
                            if (((ou) ouVar2).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        ouVar4 = ouVar2;
                        if (ouVar4 == null) {
                            vuVar2.a();
                            return;
                        }
                        suVar.H = ouVar4.a;
                    }
                    ou ouVar5 = ouVar4;
                    if (sc0Var == sc0Var2) {
                        if (ouVar5.i) {
                            sc0Var3 = sc0Var6;
                            ou ouVar6 = suVar.G;
                            if (ouVar6 == null) {
                                z6.l("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j2 = suVar.H;
                            sq0 sq0Var = vuVar2.l;
                            if (sq0Var == null) {
                                z6.l("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            vuVar2.b(ouVar6, j2, sq0Var);
                        } else if (q3.h(ouVar5)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    ouVar = null;
                                    break;
                                }
                                ?? r9 = arrayList.get(i6);
                                if (((ou) r9).d) {
                                    ouVar = r9;
                                    break;
                                }
                                i6++;
                            }
                            ou ouVar7 = ouVar;
                            if (ouVar7 == null) {
                                vuVar2.a();
                            } else {
                                suVar.H = ouVar7.a;
                            }
                        } else {
                            wt0 wt0Var = (wt0) q3.o(ej0Var, kf.t);
                            float f2 = sk.a;
                            float b = wt0Var.b();
                            sq0 sq0Var2 = vuVar2.l;
                            if (sq0Var2 == null) {
                                z6.l("Touch slop detector not initialized.");
                                return;
                            }
                            long a = sq0.a(sq0Var2, q3.I(ouVar5, ej0Var.u, new nu(i), true), b);
                            if ((9223372034707292159L & a) != 9205357640488583168L) {
                                ouVar5.i = true;
                                sc0Var3 = sc0Var6;
                                ou ouVar8 = suVar.G;
                                ouVar8.getClass();
                                vuVar2.g(ouVar8, ouVar5, new nu(i), a);
                                vuVar2.f(ouVar5, new nu(i), a);
                                long j3 = ouVar5.a;
                                tu tuVar2 = vuVar2.g;
                                if (tuVar2 == null) {
                                    tuVar2 = new tu();
                                    tuVar2.G = Long.MAX_VALUE;
                                    vuVar2.g = tuVar2;
                                }
                                tuVar2.G = j3;
                                vuVar2.j = tuVar2;
                            } else {
                                sc0Var3 = sc0Var6;
                                suVar.I = true;
                            }
                        }
                        if (sc0Var == sc0Var3 || !suVar.I) {
                            return;
                        }
                        if (!ouVar5.i) {
                            suVar.I = false;
                            return;
                        }
                        ou ouVar9 = suVar.G;
                        if (ouVar9 == null) {
                            z6.l("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = suVar.H;
                        sq0 sq0Var3 = vuVar2.l;
                        if (sq0Var3 != null) {
                            vuVar2.b(ouVar9, j4, sq0Var3);
                            return;
                        } else {
                            z6.l("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    sc0Var3 = sc0Var6;
                    if (sc0Var == sc0Var3) {
                        return;
                    } else {
                        return;
                    }
                }
                if (dx0Var2 instanceof ru) {
                    ru ruVar = (ru) dx0Var2;
                    if (sc0Var != sc0Var6) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            z = true;
                            break;
                        } else {
                            if (((ou) arrayList.get(i7)).i) {
                                z = false;
                                break;
                            }
                            i7++;
                        }
                    }
                    int size6 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size6) {
                            break;
                        }
                        if (!((ou) arrayList.get(i8)).d) {
                            i8++;
                        } else if (!arrayList.isEmpty()) {
                            if (z) {
                                long L = q3.L((ou) ac.Z(arrayList), ej0Var.u, new nu(i));
                                ou ouVar10 = ruVar.G;
                                ouVar10.getClass();
                                long d = s60.d(L, q3.L(ouVar10, ej0Var.u, new nu(i)));
                                ou ouVar11 = ruVar.G;
                                if (ouVar11 != null) {
                                    vu.c(vuVar2, ouVar11, ruVar.H, d, 8);
                                    return;
                                } else {
                                    z6.l("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    vuVar2.a();
                    return;
                }
                if (!(dx0Var2 instanceof tu)) {
                    z6.j();
                    return;
                }
                tu tuVar3 = (tu) dx0Var2;
                if (sc0Var != sc0Var5) {
                    return;
                }
                long j5 = tuVar3.G;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i9);
                    if (u10.l(((ou) obj).a, j5)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                ou ouVar12 = (ou) obj;
                if (ouVar12 == null) {
                    return;
                }
                long j6 = ouVar12.c;
                boolean h = q3.h(ouVar12);
                nk nkVar = nk.a;
                if (!h) {
                    if (ouVar12.i) {
                        ej0Var.v0(nkVar);
                        return;
                    } else {
                        if (s60.c(q3.I(ouVar12, ej0Var.u, new nu(i), true)) == 0.0f) {
                            return;
                        }
                        vuVar2.f(ouVar12, new nu(i), q3.I(ouVar12, ej0Var.u, new nu(i), false));
                        ouVar12.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        f = 0.0f;
                        obj2 = null;
                        break;
                    } else {
                        obj2 = arrayList.get(i10);
                        f = 0.0f;
                        if (((ou) obj2).d) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                ou ouVar13 = (ou) obj2;
                if (ouVar13 != null) {
                    tuVar3.G = ouVar13.a;
                    return;
                }
                if (ouVar12.i || !q3.h(ouVar12)) {
                    ej0Var.v0(nkVar);
                } else {
                    t3 d2 = vuVar2.d();
                    q80 q80Var = ej0Var.u;
                    jd jdVar = vuVar2.m;
                    h40 h40Var = (h40) jdVar.f;
                    char c2 = ' ';
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (q3.g(ouVar12)) {
                        jdVar.e = 0;
                        h40Var.d();
                    }
                    if (q3.h(ouVar12) || q3.g(ouVar12)) {
                        c = ' ';
                    } else {
                        if (h40Var.b == 3) {
                            int i11 = jdVar.e;
                            jdVar.e = i11 + 1;
                            h40Var.o(i11, ouVar12);
                        } else {
                            h40Var.a(ouVar12);
                        }
                        if (jdVar.e == 3) {
                            jdVar.e = 0;
                        }
                        Object[] objArr = h40Var.a;
                        int i12 = h40Var.b;
                        float f3 = f;
                        int i13 = 0;
                        while (i13 < i12) {
                            char c3 = c2;
                            f3 = Float.intBitsToFloat((int) (((ou) objArr[i13]).c >> c3)) + f3;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        int i14 = h40Var.b;
                        intBitsToFloat2 = f3 / i14;
                        Object[] objArr2 = h40Var.a;
                        float f4 = f;
                        for (int i15 = 0; i15 < i14; i15++) {
                            f4 += Float.intBitsToFloat((int) (((ou) objArr2[i15]).c & 4294967295L));
                        }
                        intBitsToFloat3 = f4 / h40Var.b;
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                    if (q80Var != null) {
                        if (i == 1) {
                            intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                        } else if (i == 2) {
                            intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                        }
                        floatToRawIntBits = q80Var == q80.f ? (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << c) : (Float.floatToRawIntBits(f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                    }
                    ((e10) d2.f).a(ouVar12.b, floatToRawIntBits);
                    float a2 = ((wt0) q3.o(ej0Var, kf.t)).a();
                    long k = vuVar2.d().k(m20.a(a2, a2));
                    e10 e10Var = (e10) vuVar2.d().f;
                    ht0 ht0Var = e10Var.a;
                    lh[] lhVarArr = ht0Var.d;
                    Arrays.fill(lhVarArr, 0, lhVarArr.length, (Object) null);
                    ht0Var.e = 0;
                    ht0 ht0Var2 = e10Var.b;
                    lh[] lhVarArr2 = ht0Var2.d;
                    Arrays.fill(lhVarArr2, 0, lhVarArr2.length, (Object) null);
                    ht0Var2.e = 0;
                    e10Var.c = 0L;
                    ej0Var.v0(new qk(el.a(k), true));
                }
                vuVar2.a();
            }
        }
    }

    public final void v0(rk rkVar) {
        if ((rkVar instanceof pk) && !this.A) {
            this.A = true;
            D0();
        }
        z0().p(rkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(og ogVar) {
        vk vkVar;
        int i;
        if (ogVar instanceof vk) {
            vkVar = (vk) ogVar;
            int i2 = vkVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkVar.g = i2 - Integer.MIN_VALUE;
                Object obj = vkVar.e;
                i = vkVar.g;
                ng ngVar = null;
                if (i != 0) {
                    t30.z(obj);
                    al alVar = this.z;
                    if (alVar != null) {
                        b40 b40Var = this.x;
                        if (b40Var != null) {
                            zk zkVar = new zk(alVar);
                            vkVar.g = 1;
                            Object a = b40Var.a(zkVar, vkVar);
                            dh dhVar = dh.e;
                            if (a == dhVar) {
                                return dhVar;
                            }
                        }
                    }
                    qk qkVar = new qk(0L, false);
                    if (this.r) {
                        q3.A(this.N.j(), null, new d(qkVar, this, ngVar, 12), 3);
                    }
                    return fs0.a;
                }
                if (i != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                this.z = null;
                qk qkVar2 = new qk(0L, false);
                if (this.r) {
                }
                return fs0.a;
            }
        }
        vkVar = new vk(this, ogVar);
        Object obj2 = vkVar.e;
        i = vkVar.g;
        ng ngVar2 = null;
        if (i != 0) {
        }
        this.z = null;
        qk qkVar22 = new qk(0L, false);
        if (this.r) {
        }
        return fs0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    @Override // defpackage.yc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(rc0 rc0Var, sc0 sc0Var, long j) {
        sc0 sc0Var2;
        sc0 sc0Var3;
        int i;
        int i2;
        Object obj;
        Object obj2;
        boolean z;
        vc0 vc0Var;
        vc0 vc0Var2;
        String str;
        String str2;
        boolean z2;
        mk mkVar;
        Object obj3;
        vc0 vc0Var3;
        ik ikVar;
        ej0 ej0Var = this;
        rc0 rc0Var2 = rc0Var;
        List list = rc0Var2.a;
        int size = list.size();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            sc0Var2 = sc0.f;
            sc0Var3 = sc0.e;
            if (i3 >= size) {
                break;
            }
            vc0 vc0Var4 = (vc0) list.get(i3);
            l0 l0Var = ej0Var.v;
            int i4 = vc0Var4.i;
            l0Var.getClass();
            if (i4 == 2 ? true : z3) {
                i3++;
                rc0Var2 = rc0Var;
                z3 = false;
            } else {
                ej0Var.B = true;
                if (ej0Var.w) {
                    if (ej0Var.E == null) {
                        vr vrVar = new vr(ej0Var);
                        ej0Var.o0(vrVar);
                        ej0Var.E = vrVar;
                    }
                    kw kwVar = ej0Var.J;
                    kw kwVar2 = kwVar;
                    if (kwVar == null) {
                        jk jkVar = ej0Var.C;
                        jk jkVar2 = jkVar;
                        if (jkVar == null) {
                            jk jkVar3 = new jk();
                            jkVar3.w = ik.g;
                            jkVar3.x = z3;
                            jkVar3.y = z3;
                            ej0Var.C = jkVar3;
                            jkVar2 = jkVar3;
                        }
                        ej0Var.J = jkVar2;
                        kwVar2 = jkVar2;
                    }
                    if (kwVar2 instanceof jk) {
                        jk jkVar4 = (jk) kwVar2;
                        if (!list.isEmpty() && to0.b(rc0Var2, z3)) {
                            vc0 vc0Var5 = (vc0) ac.Z(list);
                            int i5 = uk.a[jkVar4.w.ordinal()];
                            ik ikVar2 = ik.f;
                            ik ikVar3 = ik.e;
                            if (i5 == 1) {
                                mj0 mj0Var = ej0Var.V;
                                if (!mj0Var.a.c()) {
                                    i4 i4Var = mj0Var.b;
                                    if (!(i4Var != null ? i4Var.e() : false)) {
                                        ikVar = ikVar3;
                                    }
                                }
                                ikVar = ikVar2;
                            } else {
                                ikVar = jkVar4.w;
                            }
                            jkVar4.w = ikVar;
                            if (sc0Var == sc0Var3) {
                                if (ikVar == ikVar2) {
                                    vc0Var5.a();
                                    jkVar4.x = true;
                                }
                                jkVar4.y = true;
                            }
                            if (sc0Var == sc0Var2) {
                                if (ikVar == ikVar3) {
                                    u0(ej0Var, vc0Var5, vc0Var5.a, 0L, 12);
                                } else if (jkVar4.x) {
                                    ej0Var.C0(vc0Var5, vc0Var5, 0L);
                                    ej0Var.B0(vc0Var5, 0L);
                                    long j2 = vc0Var5.a;
                                    mk mkVar2 = ej0Var.G;
                                    if (mkVar2 == null) {
                                        mkVar2 = new mk();
                                        mkVar2.w = Long.MAX_VALUE;
                                        ej0Var.G = mkVar2;
                                    }
                                    mkVar2.w = j2;
                                    ej0Var.J = mkVar2;
                                }
                            }
                        }
                    } else {
                        boolean z4 = kwVar2 instanceof lk;
                        sc0 sc0Var4 = sc0.g;
                        if (z4) {
                            lk lkVar = (lk) kwVar2;
                            if (sc0Var != sc0Var3) {
                                int size2 = list.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        vc0Var = null;
                                        break;
                                    }
                                    ?? r11 = list.get(i6);
                                    int i7 = i6;
                                    vc0Var = r11;
                                    if (u10.l(((vc0) r11).a, lkVar.x)) {
                                        break;
                                    } else {
                                        i6 = i7 + 1;
                                    }
                                }
                                vc0 vc0Var6 = vc0Var;
                                if (vc0Var6 == null) {
                                    int size3 = list.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= size3) {
                                            vc0Var3 = 0;
                                            break;
                                        }
                                        vc0Var3 = list.get(i8);
                                        if (((vc0) vc0Var3).d) {
                                            break;
                                        } else {
                                            i8++;
                                        }
                                    }
                                    vc0Var2 = vc0Var3;
                                    if (vc0Var2 == null) {
                                        ej0Var.s0();
                                    } else {
                                        lkVar.x = vc0Var2.a;
                                    }
                                } else {
                                    vc0Var2 = vc0Var6;
                                }
                                if (sc0Var == sc0Var2) {
                                    if (vc0Var2.c()) {
                                        str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                        str2 = "AwaitTouchSlop.initialDown was not initialized";
                                        vc0 vc0Var7 = lkVar.w;
                                        if (vc0Var7 == null) {
                                            z6.l(str2);
                                            return;
                                        }
                                        long j3 = lkVar.x;
                                        sq0 sq0Var = ej0Var.L;
                                        if (sq0Var == null) {
                                            z6.l(str);
                                            return;
                                        }
                                        ej0Var.t0(vc0Var7, j3, sq0Var);
                                    } else if (t30.d(vc0Var2)) {
                                        int size4 = list.size();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= size4) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = list.get(i9);
                                            if (((vc0) obj3).d) {
                                                break;
                                            } else {
                                                i9++;
                                            }
                                        }
                                        vc0 vc0Var8 = (vc0) obj3;
                                        if (vc0Var8 == null) {
                                            ej0Var.s0();
                                        } else {
                                            lkVar.x = vc0Var8.a;
                                        }
                                    } else {
                                        wt0 wt0Var = (wt0) q3.o(ej0Var, kf.t);
                                        int i10 = vc0Var2.i;
                                        float f = sk.a;
                                        float b = i10 == 2 ? wt0Var.b() * sk.a : wt0Var.b();
                                        sq0 sq0Var2 = ej0Var.L;
                                        if (sq0Var2 == null) {
                                            z6.l("Touch slop detector not initialized.");
                                            return;
                                        }
                                        long a = sq0.a(sq0Var2, t30.o(vc0Var2, true), b);
                                        if ((a & 9223372034707292159L) != 9205357640488583168L) {
                                            str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                            str2 = "AwaitTouchSlop.initialDown was not initialized";
                                            ej0Var.D = s60.e(ej0Var.D, t30.o(vc0Var2, false));
                                            float atan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (ej0Var.D & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r5 >> 32))))) * 57.29578f;
                                            q80 q80Var = ej0Var.u;
                                            if (q80Var != null) {
                                                int i11 = el.a;
                                                if (q80Var != q80.f ? atan2 <= 30.0f || atan2 > 90.0f : atan2 > 30.0f) {
                                                    z2 = false;
                                                    re0 re0Var = new re0();
                                                    tk tkVar = new tk(atan2, re0Var);
                                                    int i12 = el.a;
                                                    p30.p(ej0Var, vr.t, new wr(new l(11, tkVar), 0));
                                                    if (z2 && re0Var.e) {
                                                        lkVar.y = true;
                                                    } else {
                                                        vc0Var2.a();
                                                        vc0 vc0Var9 = lkVar.w;
                                                        vc0Var9.getClass();
                                                        ej0Var.C0(vc0Var9, vc0Var2, a);
                                                        ej0Var.B0(vc0Var2, a);
                                                        long j4 = vc0Var2.a;
                                                        mkVar = ej0Var.G;
                                                        if (mkVar == null) {
                                                            mkVar = new mk();
                                                            mkVar.w = Long.MAX_VALUE;
                                                            ej0Var.G = mkVar;
                                                        }
                                                        mkVar.w = j4;
                                                        ej0Var.J = mkVar;
                                                    }
                                                }
                                            }
                                            z2 = true;
                                            re0 re0Var2 = new re0();
                                            tk tkVar2 = new tk(atan2, re0Var2);
                                            int i122 = el.a;
                                            p30.p(ej0Var, vr.t, new wr(new l(11, tkVar2), 0));
                                            if (z2) {
                                            }
                                            vc0Var2.a();
                                            vc0 vc0Var92 = lkVar.w;
                                            vc0Var92.getClass();
                                            ej0Var.C0(vc0Var92, vc0Var2, a);
                                            ej0Var.B0(vc0Var2, a);
                                            long j42 = vc0Var2.a;
                                            mkVar = ej0Var.G;
                                            if (mkVar == null) {
                                            }
                                            mkVar.w = j42;
                                            ej0Var.J = mkVar;
                                        } else {
                                            str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                            str2 = "AwaitTouchSlop.initialDown was not initialized";
                                            lkVar.y = true;
                                            ej0Var.D = s60.e(ej0Var.D, t30.o(vc0Var2, true));
                                        }
                                    }
                                    if (sc0Var == sc0Var4 && lkVar.y) {
                                        if (vc0Var2.c()) {
                                            lkVar.y = false;
                                        } else {
                                            vc0 vc0Var10 = lkVar.w;
                                            if (vc0Var10 == null) {
                                                z6.l(str2);
                                                return;
                                            }
                                            long j5 = lkVar.x;
                                            sq0 sq0Var3 = ej0Var.L;
                                            if (sq0Var3 == null) {
                                                z6.l(str);
                                                return;
                                            }
                                            ej0Var.t0(vc0Var10, j5, sq0Var3);
                                        }
                                    }
                                }
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                str2 = "AwaitTouchSlop.initialDown was not initialized";
                                if (sc0Var == sc0Var4) {
                                    if (vc0Var2.c()) {
                                    }
                                }
                            }
                        } else if (kwVar2 instanceof kk) {
                            kk kkVar = (kk) kwVar2;
                            if (sc0Var == sc0Var4) {
                                int size5 = list.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size5) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((vc0) list.get(i13)).c()) {
                                            z = false;
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                                int size6 = list.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= size6) {
                                        break;
                                    }
                                    if (!((vc0) list.get(i14)).d) {
                                        i14++;
                                    } else if (!list.isEmpty()) {
                                        if (z) {
                                            long j6 = ((vc0) ac.Z(list)).c;
                                            vc0 vc0Var11 = kkVar.w;
                                            vc0Var11.getClass();
                                            long d = s60.d(j6, vc0Var11.c);
                                            vc0 vc0Var12 = kkVar.w;
                                            if (vc0Var12 == null) {
                                                z6.l("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                            u0(ej0Var, vc0Var12, kkVar.x, d, 8);
                                        }
                                    }
                                }
                                ej0Var.s0();
                            }
                        } else {
                            if (!(kwVar2 instanceof mk)) {
                                z6.j();
                                return;
                            }
                            mk mkVar3 = (mk) kwVar2;
                            if (sc0Var == sc0Var2) {
                                long j7 = mkVar3.w;
                                int size7 = list.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= size7) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list.get(i15);
                                    if (u10.l(((vc0) obj).a, j7)) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                                vc0 vc0Var13 = (vc0) obj;
                                if (vc0Var13 != null) {
                                    boolean d2 = t30.d(vc0Var13);
                                    nk nkVar = nk.a;
                                    if (d2) {
                                        int size8 = list.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size8) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = list.get(i16);
                                            if (((vc0) obj2).d) {
                                                break;
                                            } else {
                                                i16++;
                                            }
                                        }
                                        vc0 vc0Var14 = (vc0) obj2;
                                        if (vc0Var14 == null) {
                                            if (vc0Var13.c() || !t30.d(vc0Var13)) {
                                                ej0Var.z0().p(nkVar);
                                            } else {
                                                float a2 = ((wt0) q3.o(ej0Var, kf.t)).a();
                                                z20.c(ej0Var.A0(), vc0Var13);
                                                long k = ej0Var.A0().k(m20.a(a2, a2));
                                                e10 e10Var = (e10) ej0Var.A0().f;
                                                ht0 ht0Var = e10Var.a;
                                                lh[] lhVarArr = ht0Var.d;
                                                Arrays.fill(lhVarArr, 0, lhVarArr.length, (Object) null);
                                                ht0Var.e = 0;
                                                ht0 ht0Var2 = e10Var.b;
                                                lh[] lhVarArr2 = ht0Var2.d;
                                                Arrays.fill(lhVarArr2, 0, lhVarArr2.length, (Object) null);
                                                ht0Var2.e = 0;
                                                e10Var.c = 0L;
                                                ej0Var.z0().p(new qk(el.a(k), false));
                                                ej0Var.B = false;
                                            }
                                            ej0Var.s0();
                                        } else {
                                            mkVar3.w = vc0Var14.a;
                                        }
                                    } else if (vc0Var13.c()) {
                                        ej0Var.z0().p(nkVar);
                                    } else if (s60.c(t30.o(vc0Var13, true)) != 0.0f) {
                                        ej0Var.B0(vc0Var13, t30.o(vc0Var13, false));
                                        vc0Var13.a();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ej0Var.w) {
            if (ej0Var.E == null) {
                vr vrVar2 = new vr(ej0Var);
                ej0Var.o0(vrVar2);
                ej0Var.E = vrVar2;
            }
            if (sc0Var == sc0Var3 && rc0Var.c == 6) {
                if (ej0Var.Q) {
                    i = 0;
                } else {
                    i = 0;
                    ej0Var = this;
                    ej0Var.S = new o30(ej0Var.V, new t3(0, ViewConfiguration.get(kw.L(ej0Var).getContext())), new ae(2, this, ej0.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, 1), nh.a0(ej0Var).A);
                    ej0Var.Q = true;
                }
                o30 o30Var = ej0Var.S;
                if (o30Var != null) {
                    ch c0 = ej0Var.c0();
                    if (o30Var.h == null) {
                        o30Var.h = q3.A(c0, null, new d(o30Var, null, 8), 3);
                    }
                }
            } else {
                i = 0;
            }
            o30 o30Var2 = ej0Var.S;
            if (o30Var2 != null && rc0Var.c == 6) {
                List list2 = rc0Var.a;
                int size9 = list2.size();
                int i17 = i;
                while (true) {
                    if (i17 >= size9) {
                        if (sc0Var == sc0Var3 && o30Var2.d) {
                            o30Var2.f(rc0Var);
                            k60.a(rc0Var);
                        }
                        if (sc0Var == sc0Var2 && !o30Var2.d && o30Var2.f(rc0Var)) {
                            k60.a(rc0Var);
                        }
                    } else if (((vc0) list2.get(i17)).c()) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (sc0Var == sc0Var3 && ((i2 = rc0Var.c) == 10 || i2 == 11 || i2 == 12)) {
                if (!ej0Var.R) {
                    ej0Var = this;
                    ej0Var.T = new xq0(ej0Var.V, new ae(2, this, ej0.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), nh.a0(ej0Var).A);
                    ej0Var.R = true;
                }
                xq0 xq0Var = ej0Var.T;
                if (xq0Var != null) {
                    ch c02 = ej0Var.c0();
                    if (xq0Var.g == null) {
                        xq0Var.g = q3.A(c02, null, new z5(xq0Var, null), 3);
                    }
                }
            }
            xq0 xq0Var2 = ej0Var.T;
            if (xq0Var2 != null) {
                int i18 = rc0Var.c;
                if (i18 == 10 || i18 == 11 || i18 == 12) {
                    List list3 = rc0Var.a;
                    int size10 = list3.size();
                    for (int i19 = i; i19 < size10; i19++) {
                        if (((vc0) list3.get(i19)).c()) {
                            return;
                        }
                    }
                    if (sc0Var == sc0Var3 && xq0Var2.d) {
                        xq0Var2.d(rc0Var);
                        k60.a(rc0Var);
                    }
                    if (sc0Var == sc0Var2 && !xq0Var2.d && xq0Var2.d(rc0Var)) {
                        k60.a(rc0Var);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x0(pk pkVar, og ogVar) {
        wk wkVar;
        int i;
        al alVar;
        b40 b40Var;
        pk pkVar2;
        al alVar2;
        if (ogVar instanceof wk) {
            wkVar = (wk) ogVar;
            int i2 = wkVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wkVar.i = i2 - Integer.MIN_VALUE;
                Object obj = wkVar.g;
                i = wkVar.i;
                dh dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    al alVar3 = this.z;
                    if (alVar3 != null && (r1 = this.x) != null) {
                        zk zkVar = new zk(alVar3);
                        wkVar.e = pkVar;
                        wkVar.i = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        alVar2 = wkVar.f;
                        pkVar2 = wkVar.e;
                        t30.z(obj);
                        alVar = alVar2;
                        pkVar = pkVar2;
                        this.z = alVar;
                        long j = pkVar.a;
                        return fs0.a;
                    }
                    pkVar = wkVar.e;
                    t30.z(obj);
                }
                alVar = new al();
                b40Var = this.x;
                if (b40Var != null) {
                    wkVar.e = pkVar;
                    wkVar.f = alVar;
                    wkVar.i = 2;
                    if (b40Var.a(alVar, wkVar) != dhVar) {
                        pkVar2 = pkVar;
                        alVar2 = alVar;
                        alVar = alVar2;
                        pkVar = pkVar2;
                    }
                    return dhVar;
                }
                this.z = alVar;
                long j2 = pkVar.a;
                return fs0.a;
            }
        }
        wkVar = new wk(this, ogVar);
        Object obj2 = wkVar.g;
        i = wkVar.i;
        dh dhVar2 = dh.e;
        if (i != 0) {
        }
        alVar = new al();
        b40Var = this.x;
        if (b40Var != null) {
        }
        this.z = alVar;
        long j22 = pkVar.a;
        return fs0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y0(qk qkVar, og ogVar) {
        xk xkVar;
        int i;
        if (ogVar instanceof xk) {
            xkVar = (xk) ogVar;
            int i2 = xkVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xkVar.h = i2 - Integer.MIN_VALUE;
                Object obj = xkVar.f;
                i = xkVar.h;
                ng ngVar = null;
                if (i != 0) {
                    t30.z(obj);
                    al alVar = this.z;
                    if (alVar != null) {
                        b40 b40Var = this.x;
                        if (b40Var != null) {
                            bl blVar = new bl(alVar);
                            xkVar.e = qkVar;
                            xkVar.h = 1;
                            Object a = b40Var.a(blVar, xkVar);
                            dh dhVar = dh.e;
                            if (a == dhVar) {
                                return dhVar;
                            }
                        }
                    }
                    if (this.r) {
                        q3.A(this.N.j(), null, new d(qkVar, this, ngVar, 12), 3);
                    }
                    return fs0.a;
                }
                if (i != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qkVar = xkVar.e;
                t30.z(obj);
                this.z = null;
                if (this.r) {
                }
                return fs0.a;
            }
        }
        xkVar = new xk(this, ogVar);
        Object obj2 = xkVar.f;
        i = xkVar.h;
        ng ngVar2 = null;
        if (i != 0) {
        }
        this.z = null;
        if (this.r) {
        }
        return fs0.a;
    }

    public final va z0() {
        o9 o9Var = this.y;
        if (o9Var != null) {
            return o9Var;
        }
        z6.l("Events channel not initialized.");
        return null;
    }
}
