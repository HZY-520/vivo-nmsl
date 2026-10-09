package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yo extends t20 implements df, q60, w20, ni {
    public final tq s;
    public boolean t;
    public boolean u;
    public final int v;
    public v6 w;

    public yo(int i, tq tqVar, int i2) {
        this.s = (i2 & 4) != 0 ? null : tqVar;
        this.v = i;
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    @Override // defpackage.t20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        v6 v6Var;
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                nh.b0(this).getFocusOwner();
                kw.m(this);
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    z6.j();
                    return;
                }
            }
            v6Var = this.w;
            if (v6Var != null) {
                v6Var.D();
            }
            this.w = null;
        }
        uo uoVar = (uo) nh.b0(this).getFocusOwner();
        uoVar.b(8, true, false);
        uoVar.d.a();
        v6Var = this.w;
        if (v6Var != null) {
        }
        this.w = null;
    }

    @Override // defpackage.t20
    public final void i0() {
        if (t0().a()) {
            ((uo) nh.b0(this).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [t20] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final boolean o0() {
        t40 t40Var;
        y50 y50Var;
        uo uoVar;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        y50 y50Var2;
        int ordinal = nh.L(this).ordinal();
        if (ordinal == 0) {
            uo uoVar2 = (uo) nh.b0(this).getFocusOwner();
            yo f = uoVar2.f();
            xo t0 = t0();
            if (f == this) {
                p0(t0, t0);
                return true;
            }
            if (f != null || ((uo) nh.b0(this).getFocusOwner()).a.B()) {
                if (f != null) {
                    t40Var = new t40(new yo[16]);
                    if (!f.e.r) {
                        cv.b("visitAncestors called on an unattached node");
                    }
                    t20 t20Var = f.e.i;
                    iy a0 = nh.a0(f);
                    while (a0 != null) {
                        if ((a0.H.f.h & 1024) != 0) {
                            while (t20Var != null) {
                                if ((t20Var.g & 1024) != 0) {
                                    t20 t20Var2 = t20Var;
                                    t40 t40Var2 = null;
                                    while (t20Var2 != null) {
                                        if (t20Var2 instanceof yo) {
                                            t40Var.b((yo) t20Var2);
                                        } else if ((t20Var2.g & 1024) != 0 && (t20Var2 instanceof oi)) {
                                            int i4 = 0;
                                            for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                                if ((t20Var3.g & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        t20Var2 = t20Var3;
                                                    } else {
                                                        if (t40Var2 == null) {
                                                            t40Var2 = new t40(new t20[16]);
                                                        }
                                                        if (t20Var2 != null) {
                                                            t40Var2.b(t20Var2);
                                                            t20Var2 = null;
                                                        }
                                                        t40Var2.b(t20Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        t20Var2 = nh.N(t40Var2);
                                    }
                                }
                                t20Var = t20Var.i;
                            }
                        }
                        a0 = a0.n();
                        t20Var = (a0 == null || (y50Var2 = a0.H) == null) ? null : y50Var2.e;
                    }
                } else {
                    t40Var = null;
                }
                yo[] yoVarArr = new yo[16];
                yo[] yoVarArr2 = new yo[16];
                if (!this.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var4 = this.e.i;
                iy a02 = nh.a0(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (a02 != null) {
                    if ((a02.H.f.h & 1024) != 0) {
                        while (t20Var4 != null) {
                            if ((t20Var4.g & 1024) != 0) {
                                yo yoVar = t20Var4;
                                t40 t40Var3 = null;
                                while (yoVar != 0) {
                                    if (yoVar instanceof yo) {
                                        yo yoVar2 = yoVar;
                                        if (lw.i(t40Var != null ? Boolean.valueOf(t40Var.i(yoVar2)) : null, Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (yoVarArr.length < i7) {
                                                int length = yoVarArr.length;
                                                uoVar = uoVar2;
                                                ?? r1 = new Object[Math.max(i7, length * 2)];
                                                i3 = i7;
                                                System.arraycopy(yoVarArr, 0, r1, 0, length);
                                                yoVarArr = r1;
                                            } else {
                                                uoVar = uoVar2;
                                                i3 = i7;
                                            }
                                            yoVarArr[i5] = yoVar2;
                                            i5 = i3;
                                        } else {
                                            uoVar = uoVar2;
                                            int i8 = i6 + 1;
                                            if (yoVarArr2.length < i8) {
                                                int length2 = yoVarArr2.length;
                                                ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                System.arraycopy(yoVarArr2, 0, r52, 0, length2);
                                                yoVarArr2 = r52;
                                            } else {
                                                i2 = i8;
                                            }
                                            yoVarArr2[i6] = yoVar2;
                                            i6 = i2;
                                        }
                                        if (yoVar2 == f) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        uoVar = uoVar2;
                                        z = true;
                                    }
                                    if (z && (yoVar.g & 1024) != 0 && (yoVar instanceof oi)) {
                                        t20 t20Var5 = yoVar.t;
                                        int i9 = 0;
                                        yoVar = yoVar;
                                        while (t20Var5 != null) {
                                            if ((t20Var5.g & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    yoVar = t20Var5;
                                                    i = i10;
                                                } else {
                                                    if (t40Var3 == null) {
                                                        i = i10;
                                                        r5 = new t40(new t20[16]);
                                                    } else {
                                                        i = i10;
                                                        r5 = t40Var3;
                                                    }
                                                    if (yoVar != 0) {
                                                        r5.b(yoVar);
                                                        yoVar = 0;
                                                    }
                                                    r5.b(t20Var5);
                                                    t40Var3 = r5;
                                                    yoVar = yoVar;
                                                }
                                                i9 = i;
                                            }
                                            t20Var5 = t20Var5.j;
                                            yoVar = yoVar;
                                        }
                                        if (i9 == 1) {
                                            uoVar2 = uoVar;
                                        }
                                    }
                                    yoVar = nh.N(t40Var3);
                                    uoVar2 = uoVar;
                                }
                            }
                            t20Var4 = t20Var4.i;
                            uoVar2 = uoVar2;
                        }
                    }
                    uo uoVar3 = uoVar2;
                    a02 = a02.n();
                    t20Var4 = (a02 == null || (y50Var = a02.H) == null) ? null : y50Var.e;
                    uoVar2 = uoVar3;
                }
                uo uoVar4 = uoVar2;
                if (!z2 || f == null || nh.O(f, false)) {
                    m20.h(this, new f5(3, this));
                    int ordinal2 = t0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    z6.j();
                                    return false;
                                }
                            }
                        }
                        ((uo) nh.b0(this).getFocusOwner()).h(this);
                    }
                    xo xoVar = xo.g;
                    xo xoVar2 = xo.e;
                    if (z2 && f != null) {
                        f.p0(xoVar2, xoVar);
                    }
                    xo xoVar3 = xo.f;
                    if (t40Var != null) {
                        int i11 = t40Var.g - 1;
                        Object[] objArr = t40Var.e;
                        if (i11 < objArr.length) {
                            while (i11 >= 0) {
                                yo yoVar3 = (yo) objArr[i11];
                                if (uoVar4.f() != this) {
                                    break;
                                }
                                yoVar3.p0(xoVar3, xoVar);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < yoVarArr2.length) {
                        while (i12 >= 0) {
                            yo yoVar4 = yoVarArr2[i12];
                            if (uoVar4.f() != this) {
                                break;
                            }
                            yoVar4.p0(yoVar4 == f ? xoVar2 : xoVar, xoVar3);
                            i12--;
                        }
                    }
                    if (uoVar4.f() == this) {
                        p0(t0, xoVar2);
                        if (uoVar4.f() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                z6.j();
                return false;
            }
        }
        return false;
    }

    public final void p0(xo xoVar, xo xoVar2) {
        y50 y50Var;
        tq tqVar;
        uo uoVar = (uo) nh.b0(this).getFocusOwner();
        yo f = uoVar.f();
        if (!xoVar.equals(xoVar2) && (tqVar = this.s) != null) {
            tqVar.invoke(xoVar, xoVar2);
        }
        t20 t20Var = this.e;
        if (!t20Var.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var2 = this.e;
        iy a0 = nh.a0(this);
        while (a0 != null) {
            if ((a0.H.f.h & 5120) != 0) {
                while (t20Var2 != null) {
                    int i = t20Var2.g;
                    if ((i & 5120) != 0) {
                        if (t20Var2 != t20Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            t20 t20Var3 = t20Var2;
                            t40 t40Var = null;
                            while (t20Var3 != null) {
                                if (t20Var3 instanceof a8) {
                                    a8 a8Var = (a8) t20Var3;
                                    if (f == uoVar.f()) {
                                        a8Var.p0();
                                        throw null;
                                    }
                                } else if ((t20Var3.g & 4096) != 0 && (t20Var3 instanceof oi)) {
                                    int i2 = 0;
                                    for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                        if ((t20Var4.g & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                t20Var3 = t20Var4;
                                            } else {
                                                if (t40Var == null) {
                                                    t40Var = new t40(new t20[16]);
                                                }
                                                if (t20Var3 != null) {
                                                    t40Var.b(t20Var3);
                                                    t20Var3 = null;
                                                }
                                                t40Var.b(t20Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                t20Var3 = nh.N(t40Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    t20Var2 = t20Var2.i;
                }
            }
            a0 = a0.n();
            t20Var2 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
        }
    }

    public final vo q0() {
        boolean z;
        y50 y50Var;
        vo voVar = new vo();
        voVar.a = true;
        wo woVar = wo.b;
        voVar.b = woVar;
        voVar.c = woVar;
        voVar.d = woVar;
        voVar.e = woVar;
        voVar.f = woVar;
        voVar.g = woVar;
        voVar.h = woVar;
        voVar.i = woVar;
        byte b = 0;
        voVar.j = new l0(21, b);
        voVar.k = new l0(22, b);
        voVar.l = b2.J;
        int i = this.v;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((kv) ((mv) ((lv) q3.o(this, kf.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                z6.m("Unknown Focusability");
                return null;
            }
            z = false;
        }
        voVar.a = z;
        t20 t20Var = this.e;
        if (!t20Var.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var2 = this.e;
        iy a0 = nh.a0(this);
        loop0: while (a0 != null) {
            if ((a0.H.f.h & 3072) != 0) {
                while (t20Var2 != null) {
                    int i2 = t20Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (t20Var2 != t20Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            t40 t40Var = null;
                            t20 t20Var3 = t20Var2;
                            while (t20Var3 != null) {
                                if (t20Var3 instanceof a8) {
                                    s20 s20Var = ((a8) t20Var3).s;
                                    cv.b("applyFocusProperties called on wrong node");
                                    s20Var.getClass();
                                    z6.c();
                                    return null;
                                }
                                if ((t20Var3.g & 2048) != 0 && (t20Var3 instanceof oi)) {
                                    int i3 = 0;
                                    for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                        if ((t20Var4.g & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t20Var3 = t20Var4;
                                            } else {
                                                if (t40Var == null) {
                                                    t40Var = new t40(new t20[16]);
                                                }
                                                if (t20Var3 != null) {
                                                    t40Var.b(t20Var3);
                                                    t20Var3 = null;
                                                }
                                                t40Var.b(t20Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t20Var3 = nh.N(t40Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    t20Var2 = t20Var2.i;
                }
            }
            a0 = a0.n();
            t20Var2 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
        }
        return voVar;
    }

    public final oe0 r0(wx wxVar) {
        oe0 oe0Var = q0().l;
        return oe0Var != b2.J ? wxVar == null ? oe0Var : oe0Var.f(wxVar.z(nh.Z(this), 0L)) : wxVar != null ? wxVar.A(nh.Z(this), false) : z20.a(0L, t10.G(nh.Z(this).g));
    }

    public final void s0() {
        y50 y50Var;
        Object obj;
        if (!this.e.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var = this.e.i;
        iy a0 = nh.a0(this);
        while (a0 != null) {
            if ((a0.H.f.h & 8388640) != 0) {
                while (t20Var != null) {
                    int i = t20Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (t20Var instanceof oi) {
                                for (t20 t20Var2 = ((oi) t20Var).t; t20Var2 != null; t20Var2 = t20Var2.j) {
                                }
                                return;
                            }
                            return;
                        }
                        if ((i & 32) != 0) {
                            if (t20Var instanceof w20) {
                                obj = t20Var;
                            } else if (t20Var instanceof oi) {
                                obj = null;
                                for (t20 t20Var3 = ((oi) t20Var).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                    if (t20Var3 instanceof w20) {
                                        obj = t20Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            w20 w20Var = (w20) obj;
                            if (w20Var != null) {
                                w20Var.d();
                            }
                        }
                    }
                    t20Var = t20Var.i;
                }
            }
            a0 = a0.n();
            t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
        }
    }

    public final xo t0() {
        y50 y50Var;
        boolean z = this.r;
        xo xoVar = xo.g;
        if (!z) {
            return xoVar;
        }
        yo f = ((uo) nh.b0(this).getFocusOwner()).f();
        if (f == null) {
            return xoVar;
        }
        if (this == f) {
            return xo.e;
        }
        if (f.r) {
            if (!f.e.r) {
                cv.b("visitAncestors called on an unattached node");
            }
            t20 t20Var = f.e.i;
            iy a0 = nh.a0(f);
            while (a0 != null) {
                if ((a0.H.f.h & 1024) != 0) {
                    while (t20Var != null) {
                        if ((t20Var.g & 1024) != 0) {
                            t20 t20Var2 = t20Var;
                            t40 t40Var = null;
                            while (t20Var2 != null) {
                                if (t20Var2 instanceof yo) {
                                    if (this == ((yo) t20Var2)) {
                                        return xo.f;
                                    }
                                } else if ((t20Var2.g & 1024) != 0 && (t20Var2 instanceof oi)) {
                                    int i = 0;
                                    for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                        if ((t20Var3.g & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t20Var2 = t20Var3;
                                            } else {
                                                if (t40Var == null) {
                                                    t40Var = new t40(new t20[16]);
                                                }
                                                if (t20Var2 != null) {
                                                    t40Var.b(t20Var2);
                                                    t20Var2 = null;
                                                }
                                                t40Var.b(t20Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t20Var2 = nh.N(t40Var);
                            }
                        }
                        t20Var = t20Var.i;
                    }
                }
                a0 = a0.n();
                t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
            }
        }
        return xoVar;
    }

    public final void u0() {
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                z6.j();
                return;
            }
        }
        ve0 ve0Var = new ve0();
        m20.h(this, new s2(6, ve0Var, this));
        Object obj = ve0Var.e;
        if (obj == null) {
            lw.E("focusProperties");
            throw null;
        }
        if (((vo) obj).a) {
            return;
        }
        ((uo) nh.b0(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean w0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return q0().a ? o0() : u10.n(this, i, new l0(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.q60
    public final void z() {
        u0();
    }

    @Override // defpackage.t20
    public final void g0() {
    }

    public final void v0() {
    }
}
