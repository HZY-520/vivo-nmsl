package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class c10 extends ec0 implements w10, g2, g30 {
    public Object A;
    public final a10 C;
    public final a10 D;
    public boolean E;
    public final ly j;
    public boolean k;
    public boolean o;
    public boolean p;
    public wf q;
    public pq s;
    public boolean x;
    public final a10 y;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public gy n = gy.g;
    public long r = 0;
    public b10 t = b10.g;
    public final jy u = new jy(this, 1);
    public final t40 v = new t40(new c10[16]);
    public boolean w = true;
    public boolean z = true;
    public long B = xf.b(0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [a10] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a10] */
    /* JADX WARN: Type inference failed for: r5v5, types: [a10] */
    public c10(ly lyVar) {
        this.j = lyVar;
        final int i = 1;
        final int i2 = 0;
        this.y = new eq(this) { // from class: a10
            public final /* synthetic */ c10 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                y00 y0;
                int i3 = i2;
                fs0 fs0Var = fs0.a;
                h40 h40Var = null;
                r2 = null;
                r2 = null;
                dc0 dc0Var = null;
                c10 c10Var = this.f;
                switch (i3) {
                    case 0:
                        ly lyVar2 = c10Var.j;
                        lyVar2.g = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            c10 c10Var2 = ((iy) objArr[i5]).I.p;
                            c10Var2.getClass();
                            c10Var2.l = c10Var2.m;
                            c10Var2.m = Integer.MAX_VALUE;
                            if (c10Var2.n == gy.f) {
                                c10Var2.n = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            c10 c10Var3 = ((iy) objArr2[i7]).I.p;
                            c10Var3.getClass();
                            c10Var3.u.getClass();
                        }
                        hv hvVar = c10Var.i().f0;
                        if (hvVar == null) {
                            z6.m("Expected lookahead delegate");
                            break;
                        } else {
                            q40 q40Var = (q40) iyVar.i();
                            int i8 = q40Var.e.g;
                            for (int i9 = 0; i9 < i8; i9++) {
                                iy iyVar2 = (iy) q40Var.get(i9);
                                y00 y02 = iyVar2.H.d.y0();
                                if (y02 != null) {
                                    if (y02.s) {
                                        if (h40Var == null) {
                                            h40Var = new h40();
                                        }
                                        h40Var.a(iyVar2);
                                    }
                                    y02.s = hvVar.s;
                                }
                            }
                            hvVar.e0().e();
                            q40 q40Var2 = (q40) iyVar.i();
                            int i10 = q40Var2.e.g;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    t40 t3 = iyVar.t();
                                    Object[] objArr3 = t3.e;
                                    int i12 = t3.g;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        c10 c10Var4 = ((iy) objArr3[i13]).I.p;
                                        c10Var4.getClass();
                                        int i14 = c10Var4.l;
                                        int i15 = c10Var4.m;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            c10Var4.U(true);
                                        }
                                    }
                                    t40 t4 = iyVar.t();
                                    Object[] objArr4 = t4.e;
                                    int i16 = t4.g;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        c10 c10Var5 = ((iy) objArr4[i17]).I.p;
                                        c10Var5.getClass();
                                        jy jyVar = c10Var5.u;
                                        jyVar.getClass();
                                        jyVar.getClass();
                                    }
                                    break;
                                } else {
                                    iy iyVar3 = (iy) q40Var2.get(i11);
                                    boolean z = h40Var != null && h40Var.e(iyVar3);
                                    y00 y03 = iyVar3.H.d.y0();
                                    if (y03 != null) {
                                        y03.s = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        y00 y04 = c10Var.j.a().y0();
                        y04.getClass();
                        y04.b(c10Var.B);
                        break;
                    default:
                        ly lyVar3 = c10Var.j;
                        if (lw.z(lyVar3.a) || lyVar3.b) {
                            d60 d60Var = lyVar3.a().A;
                            if (d60Var != null) {
                                dc0Var = d60Var.t;
                            }
                        } else {
                            d60 d60Var2 = lyVar3.a().A;
                            if (d60Var2 != null && (y0 = d60Var2.y0()) != null) {
                                dc0Var = y0.t;
                            }
                        }
                        if (dc0Var == null) {
                            dc0Var = nh.c0(lyVar3.a).getPlacementScope();
                        }
                        y00 y05 = lyVar3.a().y0();
                        y05.getClass();
                        dc0.f(dc0Var, y05, c10Var.r);
                        break;
                }
                return fs0Var;
            }
        };
        this.A = lyVar.o.u;
        this.C = new eq(this) { // from class: a10
            public final /* synthetic */ c10 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                y00 y0;
                int i3 = i;
                fs0 fs0Var = fs0.a;
                h40 h40Var = null;
                dc0Var = null;
                dc0Var = null;
                dc0 dc0Var = null;
                c10 c10Var = this.f;
                switch (i3) {
                    case 0:
                        ly lyVar2 = c10Var.j;
                        lyVar2.g = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            c10 c10Var2 = ((iy) objArr[i5]).I.p;
                            c10Var2.getClass();
                            c10Var2.l = c10Var2.m;
                            c10Var2.m = Integer.MAX_VALUE;
                            if (c10Var2.n == gy.f) {
                                c10Var2.n = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            c10 c10Var3 = ((iy) objArr2[i7]).I.p;
                            c10Var3.getClass();
                            c10Var3.u.getClass();
                        }
                        hv hvVar = c10Var.i().f0;
                        if (hvVar == null) {
                            z6.m("Expected lookahead delegate");
                            break;
                        } else {
                            q40 q40Var = (q40) iyVar.i();
                            int i8 = q40Var.e.g;
                            for (int i9 = 0; i9 < i8; i9++) {
                                iy iyVar2 = (iy) q40Var.get(i9);
                                y00 y02 = iyVar2.H.d.y0();
                                if (y02 != null) {
                                    if (y02.s) {
                                        if (h40Var == null) {
                                            h40Var = new h40();
                                        }
                                        h40Var.a(iyVar2);
                                    }
                                    y02.s = hvVar.s;
                                }
                            }
                            hvVar.e0().e();
                            q40 q40Var2 = (q40) iyVar.i();
                            int i10 = q40Var2.e.g;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    t40 t3 = iyVar.t();
                                    Object[] objArr3 = t3.e;
                                    int i12 = t3.g;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        c10 c10Var4 = ((iy) objArr3[i13]).I.p;
                                        c10Var4.getClass();
                                        int i14 = c10Var4.l;
                                        int i15 = c10Var4.m;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            c10Var4.U(true);
                                        }
                                    }
                                    t40 t4 = iyVar.t();
                                    Object[] objArr4 = t4.e;
                                    int i16 = t4.g;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        c10 c10Var5 = ((iy) objArr4[i17]).I.p;
                                        c10Var5.getClass();
                                        jy jyVar = c10Var5.u;
                                        jyVar.getClass();
                                        jyVar.getClass();
                                    }
                                    break;
                                } else {
                                    iy iyVar3 = (iy) q40Var2.get(i11);
                                    boolean z = h40Var != null && h40Var.e(iyVar3);
                                    y00 y03 = iyVar3.H.d.y0();
                                    if (y03 != null) {
                                        y03.s = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        y00 y04 = c10Var.j.a().y0();
                        y04.getClass();
                        y04.b(c10Var.B);
                        break;
                    default:
                        ly lyVar3 = c10Var.j;
                        if (lw.z(lyVar3.a) || lyVar3.b) {
                            d60 d60Var = lyVar3.a().A;
                            if (d60Var != null) {
                                dc0Var = d60Var.t;
                            }
                        } else {
                            d60 d60Var2 = lyVar3.a().A;
                            if (d60Var2 != null && (y0 = d60Var2.y0()) != null) {
                                dc0Var = y0.t;
                            }
                        }
                        if (dc0Var == null) {
                            dc0Var = nh.c0(lyVar3.a).getPlacementScope();
                        }
                        y00 y05 = lyVar3.a().y0();
                        y05.getClass();
                        dc0.f(dc0Var, y05, c10Var.r);
                        break;
                }
                return fs0Var;
            }
        };
        final int i3 = 2;
        this.D = new eq(this) { // from class: a10
            public final /* synthetic */ c10 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                y00 y0;
                int i32 = i3;
                fs0 fs0Var = fs0.a;
                h40 h40Var = null;
                dc0Var = null;
                dc0Var = null;
                dc0 dc0Var = null;
                c10 c10Var = this.f;
                switch (i32) {
                    case 0:
                        ly lyVar2 = c10Var.j;
                        lyVar2.g = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            c10 c10Var2 = ((iy) objArr[i5]).I.p;
                            c10Var2.getClass();
                            c10Var2.l = c10Var2.m;
                            c10Var2.m = Integer.MAX_VALUE;
                            if (c10Var2.n == gy.f) {
                                c10Var2.n = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            c10 c10Var3 = ((iy) objArr2[i7]).I.p;
                            c10Var3.getClass();
                            c10Var3.u.getClass();
                        }
                        hv hvVar = c10Var.i().f0;
                        if (hvVar == null) {
                            z6.m("Expected lookahead delegate");
                            break;
                        } else {
                            q40 q40Var = (q40) iyVar.i();
                            int i8 = q40Var.e.g;
                            for (int i9 = 0; i9 < i8; i9++) {
                                iy iyVar2 = (iy) q40Var.get(i9);
                                y00 y02 = iyVar2.H.d.y0();
                                if (y02 != null) {
                                    if (y02.s) {
                                        if (h40Var == null) {
                                            h40Var = new h40();
                                        }
                                        h40Var.a(iyVar2);
                                    }
                                    y02.s = hvVar.s;
                                }
                            }
                            hvVar.e0().e();
                            q40 q40Var2 = (q40) iyVar.i();
                            int i10 = q40Var2.e.g;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    t40 t3 = iyVar.t();
                                    Object[] objArr3 = t3.e;
                                    int i12 = t3.g;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        c10 c10Var4 = ((iy) objArr3[i13]).I.p;
                                        c10Var4.getClass();
                                        int i14 = c10Var4.l;
                                        int i15 = c10Var4.m;
                                        if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                            c10Var4.U(true);
                                        }
                                    }
                                    t40 t4 = iyVar.t();
                                    Object[] objArr4 = t4.e;
                                    int i16 = t4.g;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        c10 c10Var5 = ((iy) objArr4[i17]).I.p;
                                        c10Var5.getClass();
                                        jy jyVar = c10Var5.u;
                                        jyVar.getClass();
                                        jyVar.getClass();
                                    }
                                    break;
                                } else {
                                    iy iyVar3 = (iy) q40Var2.get(i11);
                                    boolean z = h40Var != null && h40Var.e(iyVar3);
                                    y00 y03 = iyVar3.H.d.y0();
                                    if (y03 != null) {
                                        y03.s = z;
                                    }
                                    i11++;
                                }
                            }
                        }
                        break;
                    case 1:
                        y00 y04 = c10Var.j.a().y0();
                        y04.getClass();
                        y04.b(c10Var.B);
                        break;
                    default:
                        ly lyVar3 = c10Var.j;
                        if (lw.z(lyVar3.a) || lyVar3.b) {
                            d60 d60Var = lyVar3.a().A;
                            if (d60Var != null) {
                                dc0Var = d60Var.t;
                            }
                        } else {
                            d60 d60Var2 = lyVar3.a().A;
                            if (d60Var2 != null && (y0 = d60Var2.y0()) != null) {
                                dc0Var = y0.t;
                            }
                        }
                        if (dc0Var == null) {
                            dc0Var = nh.c0(lyVar3.a).getPlacementScope();
                        }
                        y00 y05 = lyVar3.a().y0();
                        y05.getClass();
                        dc0.f(dc0Var, y05, c10Var.r);
                        break;
                }
                return fs0Var;
            }
        };
    }

    @Override // defpackage.g2
    public final jy F() {
        return this.u;
    }

    @Override // defpackage.g2
    public final int I() {
        return this.m;
    }

    @Override // defpackage.g2
    public final void J() {
        iy.L(this.j.a, false, 7);
    }

    @Override // defpackage.ec0
    public final void P(long j, float f, pq pqVar) {
        Y(j, pqVar);
    }

    public final boolean T() {
        ly lyVar = this.j;
        return lw.z(lyVar.a) || lyVar.b;
    }

    public final void U(boolean z) {
        if (z && T()) {
            return;
        }
        if (z || T()) {
            this.t = b10.g;
            t40 t = this.j.a.t();
            Object[] objArr = t.e;
            int i = t.g;
            for (int i2 = 0; i2 < i; i2++) {
                c10 c10Var = ((iy) objArr[i2]).I.p;
                c10Var.getClass();
                c10Var.U(true);
            }
        }
    }

    public final void V() {
        b10 b10Var = this.t;
        ly lyVar = this.j;
        boolean z = lyVar.b;
        iy iyVar = lyVar.a;
        b10 b10Var2 = b10.e;
        if (z) {
            this.t = b10.f;
        } else {
            this.t = b10Var2;
        }
        if (b10Var != b10Var2 && lyVar.d) {
            iy.L(iyVar, true, 6);
        }
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            c10 c10Var = iyVar2.I.p;
            if (c10Var == null) {
                z6.l("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c10Var.m != Integer.MAX_VALUE) {
                c10Var.V();
                iy.O(iyVar2);
            }
        }
    }

    public final void W() {
        ly lyVar = this.j;
        if (lyVar.n > 0) {
            t40 t = lyVar.a.t();
            Object[] objArr = t.e;
            int i = t.g;
            for (int i2 = 0; i2 < i; i2++) {
                iy iyVar = (iy) objArr[i2];
                ly lyVar2 = iyVar.I;
                if ((lyVar2.l || lyVar2.m) && !lyVar2.e) {
                    iyVar.K(false);
                }
                c10 c10Var = lyVar2.p;
                if (c10Var != null) {
                    c10Var.W();
                }
            }
        }
    }

    public final void X() {
        fy fyVar;
        this.E = true;
        ly lyVar = this.j;
        iy n = lyVar.a.n();
        b10 b10Var = this.t;
        if ((b10Var != b10.e && !lyVar.b) || (b10Var != b10.f && lyVar.b)) {
            V();
            if (this.k && n != null) {
                n.K(false);
            }
        }
        if (n != null) {
            ly lyVar2 = n.I;
            if (!this.k && ((fyVar = lyVar2.c) == fy.g || fyVar == fy.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    cv.b("Place was called on a node which was placed already");
                }
                int i = lyVar2.g;
                this.m = i;
                lyVar2.g = i + 1;
            }
        } else {
            this.m = 0;
        }
        q();
    }

    public final void Y(long j, pq pqVar) {
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        try {
            iy n = iyVar.n();
            fy fyVar = n != null ? n.I.c : null;
            fy fyVar2 = fy.h;
            if (fyVar == fyVar2) {
                lyVar.b = false;
            }
            if (iyVar2.P) {
                cv.a("place is called on a deactivated node");
            }
            lyVar.c = fyVar2;
            boolean z = true;
            this.o = true;
            this.E = false;
            if (!xv.a(j, this.r)) {
                if (lyVar.m || lyVar.l) {
                    lyVar.e = true;
                }
                W();
            }
            e3 c0 = nh.c0(iyVar2);
            this.r = j;
            if (!lyVar.e) {
                if (this.t == b10.g) {
                    z = false;
                }
                if (z) {
                    y00 y0 = lyVar.a().y0();
                    y0.getClass();
                    y0.q0(xv.c(j, y0.i));
                    X();
                    this.s = pqVar;
                    lyVar.c = fy.i;
                }
            }
            lyVar.h(false);
            this.u.d = false;
            a90 snapshotObserver = c0.getSnapshotObserver();
            snapshotObserver.a.b(iyVar2, snapshotObserver.g, this.D);
            this.s = pqVar;
            lyVar.c = fy.i;
        } catch (Throwable th) {
            iyVar.Q(th);
            throw null;
        }
    }

    @Override // defpackage.w10
    public final ec0 b(long j) {
        gy gyVar;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        iy n = iyVar.n();
        if ((n != null ? n.I.c : null) != fy.f) {
            iy n2 = iyVar2.n();
            if (n2 != null) {
                fy fyVar = n2.I.c;
            }
            fy fyVar2 = fy.h;
        }
        iy n3 = iyVar2.n();
        gy gyVar2 = gy.g;
        if (n3 != null) {
            ly lyVar2 = n3.I;
            if (this.n != gyVar2 && !iyVar2.G) {
                cv.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = lyVar2.c.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                gyVar = gy.e;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    z6.k(lyVar2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                gyVar = gy.f;
            }
            this.n = gyVar;
        } else {
            this.n = gyVar2;
        }
        if (iyVar2.E == gyVar2) {
            iyVar2.c();
        }
        b0(j);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0079, B:34:0x0081, B:37:0x0093, B:39:0x00b0, B:43:0x008e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0060->B:29:0x0062, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0079, B:34:0x0081, B:37:0x0093, B:39:0x00b0, B:43:0x008e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0079, B:34:0x0081, B:37:0x0093, B:39:0x00b0, B:43:0x008e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0079, B:34:0x0081, B:37:0x0093, B:39:0x00b0, B:43:0x008e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(long j) {
        boolean z;
        int i;
        int i2;
        y00 y0;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        try {
            if (iyVar.P) {
                cv.a("measure is called on a deactivated node");
            }
            iy n = iyVar2.n();
            if (!iyVar2.G && (n == null || !n.G)) {
                z = false;
                iyVar2.G = z;
                if (!iyVar2.I.d) {
                    wf wfVar = this.q;
                    if (wfVar == null ? false : wf.b(wfVar.a, j)) {
                        e3 e3Var = iyVar2.r;
                        if (e3Var != null) {
                            e3Var.i(iyVar2, true);
                        }
                        iyVar2.P();
                        return false;
                    }
                }
                this.q = new wf(j);
                R(j);
                this.u.c = false;
                t40 t = iyVar2.t();
                Object[] objArr = t.e;
                i = t.g;
                for (i2 = 0; i2 < i; i2++) {
                    c10 c10Var = ((iy) objArr[i2]).I.p;
                    c10Var.getClass();
                    c10Var.u.getClass();
                }
                long j2 = !this.p ? this.g : -9223372034707292160L;
                this.p = true;
                y0 = lyVar.a().y0();
                if (y0 != null) {
                    cv.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                lyVar.c(j);
                Q((y0.e << 32) | (y0.f & 4294967295L));
                return ((int) (j2 >> 32)) == y0.e || ((int) (j2 & 4294967295L)) != y0.f;
            }
            z = true;
            iyVar2.G = z;
            if (!iyVar2.I.d) {
            }
            this.q = new wf(j);
            R(j);
            this.u.c = false;
            t40 t2 = iyVar2.t();
            Object[] objArr2 = t2.e;
            i = t2.g;
            while (i2 < i) {
            }
            if (!this.p) {
            }
            this.p = true;
            y0 = lyVar.a().y0();
            if (y0 != null) {
            }
            lyVar.c(j);
            Q((y0.e << 32) | (y0.f & 4294967295L));
            if (((int) (j2 >> 32)) == y0.e) {
            }
        } catch (Throwable th) {
            iyVar.Q(th);
            throw null;
        }
    }

    @Override // defpackage.g2
    public final void c(l lVar) {
        t40 t = this.j.a.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            c10 c10Var = ((iy) objArr[i2]).I.p;
            c10Var.getClass();
            lVar.invoke(c10Var);
        }
    }

    @Override // defpackage.ec0, defpackage.w10
    public final Object e() {
        return this.A;
    }

    @Override // defpackage.g30
    public final void h(boolean z) {
        y00 y0;
        ly lyVar = this.j;
        y00 y02 = lyVar.a().y0();
        if (Boolean.valueOf(z).equals(y02 != null ? Boolean.valueOf(y02.p) : null) || (y0 = lyVar.a().y0()) == null) {
            return;
        }
        y0.p = z;
    }

    @Override // defpackage.g2
    public final iv i() {
        return this.j.a.H.c;
    }

    @Override // defpackage.g2
    public final g2 l() {
        ly lyVar;
        iy n = this.j.a.n();
        if (n == null || (lyVar = n.I) == null) {
            return null;
        }
        return lyVar.p;
    }

    @Override // defpackage.g2
    public final void q() {
        this.x = true;
        jy jyVar = this.u;
        jyVar.h();
        ly lyVar = this.j;
        boolean z = lyVar.e;
        iy iyVar = lyVar.a;
        if (z) {
            t40 t = iyVar.t();
            Object[] objArr = t.e;
            int i = t.g;
            for (int i2 = 0; i2 < i; i2++) {
                iy iyVar2 = (iy) objArr[i2];
                ly lyVar2 = iyVar2.I;
                if (lyVar2.d && iyVar2.m() == gy.e) {
                    c10 c10Var = lyVar2.p;
                    c10Var.getClass();
                    c10 c10Var2 = lyVar2.p;
                    wf wfVar = c10Var2 != null ? c10Var2.q : null;
                    wfVar.getClass();
                    if (c10Var.b0(wfVar.a)) {
                        iy.L(iyVar, false, 7);
                    }
                }
            }
        }
        hv hvVar = i().f0;
        hvVar.getClass();
        if (lyVar.f || (!hvVar.s && lyVar.e)) {
            lyVar.e = false;
            fy fyVar = lyVar.c;
            lyVar.c = fy.h;
            lyVar.i(false);
            a90 snapshotObserver = nh.c0(iyVar).getSnapshotObserver();
            snapshotObserver.a.b(iyVar, snapshotObserver.h, this.y);
            lyVar.c = fyVar;
            if (lyVar.l && hvVar.s) {
                requestLayout();
            }
            lyVar.f = false;
        }
        if (jyVar.b && jyVar.e()) {
            jyVar.g();
        }
        this.x = false;
    }

    @Override // defpackage.g2
    public final void requestLayout() {
        this.j.a.K(false);
    }
}
