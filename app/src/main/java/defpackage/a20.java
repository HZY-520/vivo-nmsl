package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a20 extends ec0 implements w10, g2, g30 {
    public boolean D;
    public final z10 F;
    public final z10 G;
    public float H;
    public boolean I;
    public pq J;
    public float L;
    public final z10 M;
    public boolean N;
    public final ly j;
    public boolean k;
    public boolean n;
    public boolean o;
    public pq r;
    public float s;
    public Object u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public gy p = gy.g;
    public long q = 0;
    public boolean t = true;
    public final jy A = new jy(this, 0);
    public final t40 B = new t40(new a20[16]);
    public boolean C = true;
    public long E = xf.b(0, 0, 15);
    public long K = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [z10] */
    /* JADX WARN: Type inference failed for: r2v4, types: [z10] */
    /* JADX WARN: Type inference failed for: r7v4, types: [z10] */
    public a20(ly lyVar) {
        this.j = lyVar;
        final int i = 1;
        final int i2 = 0;
        this.F = new eq(this) { // from class: z10
            public final /* synthetic */ a20 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                boolean z;
                int i3 = i2;
                h40 h40Var = null;
                fs0 fs0Var = fs0.a;
                a20 a20Var = this.f;
                switch (i3) {
                    case 0:
                        a20Var.j.a().b(a20Var.E);
                        break;
                    case 1:
                        ly lyVar2 = a20Var.j;
                        lyVar2.h = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            a20 a20Var2 = ((iy) objArr[i5]).I.o;
                            a20Var2.l = a20Var2.m;
                            a20Var2.m = Integer.MAX_VALUE;
                            a20Var2.w = false;
                            if (a20Var2.p == gy.f) {
                                a20Var2.p = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((iy) objArr2[i7]).I.o.A.getClass();
                        }
                        q40 q40Var = (q40) iyVar.i();
                        int i8 = q40Var.e.g;
                        for (int i9 = 0; i9 < i8; i9++) {
                            iy iyVar2 = (iy) q40Var.get(i9);
                            if (iyVar2.H.d.s) {
                                if (h40Var == null) {
                                    h40Var = new h40();
                                }
                                h40Var.a(iyVar2);
                            }
                            iyVar2.H.d.s = a20Var.i().s;
                        }
                        a20Var.i().e0().e();
                        q40 q40Var2 = (q40) iyVar.i();
                        int i10 = q40Var2.e.g;
                        for (int i11 = 0; i11 < i10; i11++) {
                            iy iyVar3 = (iy) q40Var2.get(i11);
                            if (h40Var != null) {
                                z = true;
                                if (h40Var.e(iyVar3)) {
                                    iyVar3.H.d.s = z;
                                }
                            }
                            z = false;
                            iyVar3.H.d.s = z;
                        }
                        t40 t3 = iyVar.t();
                        Object[] objArr3 = t3.e;
                        int i12 = t3.g;
                        for (int i13 = 0; i13 < i12; i13++) {
                            iy iyVar4 = (iy) objArr3[i13];
                            ly lyVar3 = iyVar4.I;
                            if (lyVar3.o.l != iyVar4.o()) {
                                iyVar.H();
                                iyVar.w();
                                if (iyVar4.o() == Integer.MAX_VALUE) {
                                    if (lyVar3.b || lw.z(iyVar4)) {
                                        c10 c10Var = lyVar3.p;
                                        c10Var.getClass();
                                        c10Var.U(false);
                                    }
                                    lyVar3.o.U();
                                }
                            }
                        }
                        t40 t4 = iyVar.t();
                        Object[] objArr4 = t4.e;
                        int i14 = t4.g;
                        for (int i15 = 0; i15 < i14; i15++) {
                            jy jyVar = ((iy) objArr4[i15]).I.o.A;
                            jyVar.getClass();
                            jyVar.getClass();
                        }
                        break;
                    default:
                        ly lyVar4 = a20Var.j;
                        d60 d60Var = lyVar4.a().A;
                        dc0 placementScope = d60Var != null ? d60Var.t : nh.c0(lyVar4.a).getPlacementScope();
                        pq pqVar = a20Var.J;
                        if (pqVar == null) {
                            d60 a = lyVar4.a();
                            long j = a20Var.K;
                            float f = a20Var.L;
                            placementScope.d(a);
                            a.P(xv.c(j, a.i), f, null);
                            break;
                        } else {
                            d60 a2 = lyVar4.a();
                            long j2 = a20Var.K;
                            float f2 = a20Var.L;
                            placementScope.d(a2);
                            a2.P(xv.c(j2, a2.i), f2, pqVar);
                            break;
                        }
                }
                return fs0Var;
            }
        };
        this.G = new eq(this) { // from class: z10
            public final /* synthetic */ a20 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                boolean z;
                int i3 = i;
                h40 h40Var = null;
                fs0 fs0Var = fs0.a;
                a20 a20Var = this.f;
                switch (i3) {
                    case 0:
                        a20Var.j.a().b(a20Var.E);
                        break;
                    case 1:
                        ly lyVar2 = a20Var.j;
                        lyVar2.h = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            a20 a20Var2 = ((iy) objArr[i5]).I.o;
                            a20Var2.l = a20Var2.m;
                            a20Var2.m = Integer.MAX_VALUE;
                            a20Var2.w = false;
                            if (a20Var2.p == gy.f) {
                                a20Var2.p = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((iy) objArr2[i7]).I.o.A.getClass();
                        }
                        q40 q40Var = (q40) iyVar.i();
                        int i8 = q40Var.e.g;
                        for (int i9 = 0; i9 < i8; i9++) {
                            iy iyVar2 = (iy) q40Var.get(i9);
                            if (iyVar2.H.d.s) {
                                if (h40Var == null) {
                                    h40Var = new h40();
                                }
                                h40Var.a(iyVar2);
                            }
                            iyVar2.H.d.s = a20Var.i().s;
                        }
                        a20Var.i().e0().e();
                        q40 q40Var2 = (q40) iyVar.i();
                        int i10 = q40Var2.e.g;
                        for (int i11 = 0; i11 < i10; i11++) {
                            iy iyVar3 = (iy) q40Var2.get(i11);
                            if (h40Var != null) {
                                z = true;
                                if (h40Var.e(iyVar3)) {
                                    iyVar3.H.d.s = z;
                                }
                            }
                            z = false;
                            iyVar3.H.d.s = z;
                        }
                        t40 t3 = iyVar.t();
                        Object[] objArr3 = t3.e;
                        int i12 = t3.g;
                        for (int i13 = 0; i13 < i12; i13++) {
                            iy iyVar4 = (iy) objArr3[i13];
                            ly lyVar3 = iyVar4.I;
                            if (lyVar3.o.l != iyVar4.o()) {
                                iyVar.H();
                                iyVar.w();
                                if (iyVar4.o() == Integer.MAX_VALUE) {
                                    if (lyVar3.b || lw.z(iyVar4)) {
                                        c10 c10Var = lyVar3.p;
                                        c10Var.getClass();
                                        c10Var.U(false);
                                    }
                                    lyVar3.o.U();
                                }
                            }
                        }
                        t40 t4 = iyVar.t();
                        Object[] objArr4 = t4.e;
                        int i14 = t4.g;
                        for (int i15 = 0; i15 < i14; i15++) {
                            jy jyVar = ((iy) objArr4[i15]).I.o.A;
                            jyVar.getClass();
                            jyVar.getClass();
                        }
                        break;
                    default:
                        ly lyVar4 = a20Var.j;
                        d60 d60Var = lyVar4.a().A;
                        dc0 placementScope = d60Var != null ? d60Var.t : nh.c0(lyVar4.a).getPlacementScope();
                        pq pqVar = a20Var.J;
                        if (pqVar == null) {
                            d60 a = lyVar4.a();
                            long j = a20Var.K;
                            float f = a20Var.L;
                            placementScope.d(a);
                            a.P(xv.c(j, a.i), f, null);
                            break;
                        } else {
                            d60 a2 = lyVar4.a();
                            long j2 = a20Var.K;
                            float f2 = a20Var.L;
                            placementScope.d(a2);
                            a2.P(xv.c(j2, a2.i), f2, pqVar);
                            break;
                        }
                }
                return fs0Var;
            }
        };
        final int i3 = 2;
        this.M = new eq(this) { // from class: z10
            public final /* synthetic */ a20 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                boolean z;
                int i32 = i3;
                h40 h40Var = null;
                fs0 fs0Var = fs0.a;
                a20 a20Var = this.f;
                switch (i32) {
                    case 0:
                        a20Var.j.a().b(a20Var.E);
                        break;
                    case 1:
                        ly lyVar2 = a20Var.j;
                        lyVar2.h = 0;
                        iy iyVar = lyVar2.a;
                        t40 t = iyVar.t();
                        Object[] objArr = t.e;
                        int i4 = t.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            a20 a20Var2 = ((iy) objArr[i5]).I.o;
                            a20Var2.l = a20Var2.m;
                            a20Var2.m = Integer.MAX_VALUE;
                            a20Var2.w = false;
                            if (a20Var2.p == gy.f) {
                                a20Var2.p = gy.g;
                            }
                        }
                        t40 t2 = iyVar.t();
                        Object[] objArr2 = t2.e;
                        int i6 = t2.g;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((iy) objArr2[i7]).I.o.A.getClass();
                        }
                        q40 q40Var = (q40) iyVar.i();
                        int i8 = q40Var.e.g;
                        for (int i9 = 0; i9 < i8; i9++) {
                            iy iyVar2 = (iy) q40Var.get(i9);
                            if (iyVar2.H.d.s) {
                                if (h40Var == null) {
                                    h40Var = new h40();
                                }
                                h40Var.a(iyVar2);
                            }
                            iyVar2.H.d.s = a20Var.i().s;
                        }
                        a20Var.i().e0().e();
                        q40 q40Var2 = (q40) iyVar.i();
                        int i10 = q40Var2.e.g;
                        for (int i11 = 0; i11 < i10; i11++) {
                            iy iyVar3 = (iy) q40Var2.get(i11);
                            if (h40Var != null) {
                                z = true;
                                if (h40Var.e(iyVar3)) {
                                    iyVar3.H.d.s = z;
                                }
                            }
                            z = false;
                            iyVar3.H.d.s = z;
                        }
                        t40 t3 = iyVar.t();
                        Object[] objArr3 = t3.e;
                        int i12 = t3.g;
                        for (int i13 = 0; i13 < i12; i13++) {
                            iy iyVar4 = (iy) objArr3[i13];
                            ly lyVar3 = iyVar4.I;
                            if (lyVar3.o.l != iyVar4.o()) {
                                iyVar.H();
                                iyVar.w();
                                if (iyVar4.o() == Integer.MAX_VALUE) {
                                    if (lyVar3.b || lw.z(iyVar4)) {
                                        c10 c10Var = lyVar3.p;
                                        c10Var.getClass();
                                        c10Var.U(false);
                                    }
                                    lyVar3.o.U();
                                }
                            }
                        }
                        t40 t4 = iyVar.t();
                        Object[] objArr4 = t4.e;
                        int i14 = t4.g;
                        for (int i15 = 0; i15 < i14; i15++) {
                            jy jyVar = ((iy) objArr4[i15]).I.o.A;
                            jyVar.getClass();
                            jyVar.getClass();
                        }
                        break;
                    default:
                        ly lyVar4 = a20Var.j;
                        d60 d60Var = lyVar4.a().A;
                        dc0 placementScope = d60Var != null ? d60Var.t : nh.c0(lyVar4.a).getPlacementScope();
                        pq pqVar = a20Var.J;
                        if (pqVar == null) {
                            d60 a = lyVar4.a();
                            long j = a20Var.K;
                            float f = a20Var.L;
                            placementScope.d(a);
                            a.P(xv.c(j, a.i), f, null);
                            break;
                        } else {
                            d60 a2 = lyVar4.a();
                            long j2 = a20Var.K;
                            float f2 = a20Var.L;
                            placementScope.d(a2);
                            a2.P(xv.c(j2, a2.i), f2, pqVar);
                            break;
                        }
                }
                return fs0Var;
            }
        };
    }

    @Override // defpackage.g2
    public final jy F() {
        return this.A;
    }

    @Override // defpackage.g2
    public final int I() {
        return this.m;
    }

    @Override // defpackage.g2
    public final void J() {
        iy.N(this.j.a, false, 7);
    }

    @Override // defpackage.ec0
    public final int L() {
        return this.j.a().L();
    }

    @Override // defpackage.ec0
    public final int M() {
        return this.j.a().M();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:25:0x0060, B:27:0x006b, B:28:0x006f, B:29:0x0058, B:30:0x0083, B:32:0x0087, B:34:0x008b, B:35:0x0090, B:39:0x001c, B:41:0x0020, B:43:0x0024, B:45:0x0028), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:25:0x0060, B:27:0x006b, B:28:0x006f, B:29:0x0058, B:30:0x0083, B:32:0x0087, B:34:0x008b, B:35:0x0090, B:39:0x001c, B:41:0x0020, B:43:0x0024, B:45:0x0028), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:25:0x0060, B:27:0x006b, B:28:0x006f, B:29:0x0058, B:30:0x0083, B:32:0x0087, B:34:0x008b, B:35:0x0090, B:39:0x001c, B:41:0x0020, B:43:0x0024, B:45:0x0028), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:25:0x0060, B:27:0x006b, B:28:0x006f, B:29:0x0058, B:30:0x0083, B:32:0x0087, B:34:0x008b, B:35:0x0090, B:39:0x001c, B:41:0x0020, B:43:0x0024, B:45:0x0028), top: B:2:0x0005 }] */
    @Override // defpackage.ec0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(long j, float f, pq pqVar) {
        c10 c10Var;
        c10 c10Var2;
        c10 c10Var3;
        iy n;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        try {
            this.w = true;
            if (xv.a(j, this.q)) {
                if (pqVar == this.r) {
                    if (this.N) {
                    }
                    c10Var = lyVar.p;
                    if (c10Var != null) {
                        ly lyVar2 = c10Var.j;
                        if (c10Var.t == b10.g && !lw.z(lyVar2.a)) {
                            lyVar2.b = true;
                        }
                    }
                    c10Var2 = lyVar.p;
                    if (c10Var2 != null && c10Var2.T()) {
                        d60 d60Var = lyVar.a().A;
                        dc0 placementScope = d60Var == null ? d60Var.t : nh.c0(iyVar).getPlacementScope();
                        c10 c10Var4 = lyVar.p;
                        c10Var4.getClass();
                        n = iyVar.n();
                        if (n != null) {
                            n.I.g = 0;
                        }
                        c10Var4.m = Integer.MAX_VALUE;
                        dc0.e(placementScope, c10Var4, (int) (j >> 32), (int) (4294967295L & j));
                    }
                    c10Var3 = lyVar.p;
                    if (c10Var3 != null && !c10Var3.o) {
                        cv.b("Error: Placement happened before lookahead.");
                    }
                    W(j, f, pqVar);
                }
            }
            if (lyVar.j || lyVar.i || this.N) {
                this.y = true;
                this.N = false;
            }
            c10Var = lyVar.p;
            if (c10Var != null) {
            }
            c10Var2 = lyVar.p;
            if (c10Var2 != null) {
                d60 d60Var2 = lyVar.a().A;
                if (d60Var2 == null) {
                }
                c10 c10Var42 = lyVar.p;
                c10Var42.getClass();
                n = iyVar.n();
                if (n != null) {
                }
                c10Var42.m = Integer.MAX_VALUE;
                dc0.e(placementScope, c10Var42, (int) (j >> 32), (int) (4294967295L & j));
            }
            c10Var3 = lyVar.p;
            if (c10Var3 != null) {
                cv.b("Error: Placement happened before lookahead.");
            }
            W(j, f, pqVar);
        } catch (Throwable th) {
            iyVar.Q(th);
            throw null;
        }
    }

    public final void T() {
        boolean z = this.v;
        this.v = true;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        y50 y50Var = iyVar.H;
        if (!z) {
            y50Var.c.N0();
            nh.c0(iyVar).getRectManager().g(lyVar.a);
            if (iyVar.k()) {
                iy.N(iyVar, true, 6);
            } else if (iyVar.I.d) {
                iy.L(iyVar, true, 6);
            }
        }
        d60 d60Var = y50Var.c.z;
        for (d60 d60Var2 = y50Var.d; !lw.i(d60Var2, d60Var) && d60Var2 != null; d60Var2 = d60Var2.z) {
            if (d60Var2.W) {
                d60Var2.I0();
            }
        }
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            if (iyVar2.o() != Integer.MAX_VALUE) {
                iyVar2.I.o.T();
                iy.O(iyVar2);
            }
        }
    }

    public final void U() {
        if (this.v) {
            this.v = false;
            ly lyVar = this.j;
            iy iyVar = lyVar.a;
            iy iyVar2 = lyVar.a;
            nh.c0(iyVar).getRectManager().h(iyVar2);
            y50 y50Var = iyVar2.H;
            d60 d60Var = y50Var.c.z;
            for (d60 d60Var2 = y50Var.d; !lw.i(d60Var2, d60Var) && d60Var2 != null; d60Var2 = d60Var2.z) {
                d60Var2.P0();
                d60Var2.U0();
            }
            t40 t = iyVar2.t();
            Object[] objArr = t.e;
            int i = t.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((iy) objArr[i2]).I.o.U();
            }
        }
    }

    public final void V() {
        this.I = true;
        ly lyVar = this.j;
        iy n = lyVar.a.n();
        float f = i().K;
        iy iyVar = lyVar.a;
        y50 y50Var = iyVar.H;
        d60 d60Var = y50Var.d;
        iv ivVar = y50Var.c;
        while (d60Var != ivVar) {
            d60Var.getClass();
            dy dyVar = (dy) d60Var;
            f += dyVar.K;
            d60Var = dyVar.z;
        }
        if (f != this.H) {
            this.H = f;
            if (n != null) {
                n.H();
            }
            if (n != null) {
                n.w();
            }
        }
        if (!i().s) {
            boolean z = this.v;
            if (!z || this.A.d()) {
                T();
            }
            if (z) {
                iyVar.H.c.N0();
            } else {
                if (n != null) {
                    n.w();
                }
                if (this.k && n != null) {
                    n.M(false);
                }
            }
        }
        if (n != null) {
            ly lyVar2 = n.I;
            if (!this.k && lyVar2.c == fy.g) {
                if (this.m != Integer.MAX_VALUE) {
                    cv.b("Place was called on a node which was placed already");
                }
                int i = lyVar2.h;
                this.m = i;
                lyVar2.h = i + 1;
            }
        } else {
            this.m = 0;
        }
        q();
    }

    public final void W(long j, float f, pq pqVar) {
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        if (iyVar.P) {
            cv.a("place is called on a deactivated node");
        }
        lyVar.c = fy.g;
        this.q = j;
        this.s = f;
        this.r = pqVar;
        this.I = false;
        e3 c0 = nh.c0(iyVar2);
        if (this.y || !this.v) {
            this.A.d = false;
            lyVar.f(false);
            this.J = pqVar;
            this.K = j;
            this.L = f;
            a90 snapshotObserver = c0.getSnapshotObserver();
            snapshotObserver.a.b(iyVar2, snapshotObserver.f, this.M);
        } else {
            d60 a = lyVar.a();
            a.S0(xv.c(j, a.i), f, pqVar);
            V();
        }
        lyVar.c = fy.i;
        if (lyVar.a().s && (lyVar.j || lyVar.i)) {
            requestLayout();
        }
        this.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0050->B:23:0x0052, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        fy fyVar;
        fy fyVar2;
        fy fyVar3;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        try {
            if (iyVar.P) {
                cv.a("measure is called on a deactivated node");
            }
            e3 c0 = nh.c0(iyVar2);
            iy n = iyVar2.n();
            boolean z2 = true;
            if (!iyVar2.G && (n == null || !n.G)) {
                z = false;
                iyVar2.G = z;
                if (!iyVar2.k() && wf.b(this.h, j)) {
                    c0.i(iyVar2, false);
                    iyVar2.P();
                    return false;
                }
                this.A.c = false;
                t40 t = iyVar2.t();
                Object[] objArr = t.e;
                i = t.g;
                for (i2 = 0; i2 < i; i2++) {
                    ((iy) objArr[i2]).I.o.A.getClass();
                }
                this.n = true;
                j2 = lyVar.a().g;
                R(j);
                fyVar = lyVar.c;
                fyVar2 = fy.i;
                if (fyVar == fyVar2) {
                    cv.b("layout state is not idle before measure starts");
                }
                this.E = j;
                fyVar3 = fy.e;
                lyVar.c = fyVar3;
                this.x = false;
                a90 snapshotObserver = nh.c0(iyVar2).getSnapshotObserver();
                snapshotObserver.a.b(iyVar2, snapshotObserver.c, this.F);
                if (lyVar.c == fyVar3) {
                    this.y = true;
                    this.z = true;
                    lyVar.c = fyVar2;
                }
                if (ew.a(lyVar.a().g, j2) && lyVar.a().e == this.e && lyVar.a().f == this.f) {
                    z2 = false;
                }
                Q((lyVar.a().f & 4294967295L) | (lyVar.a().e << 32));
                return z2;
            }
            z = true;
            iyVar2.G = z;
            if (!iyVar2.k()) {
                c0.i(iyVar2, false);
                iyVar2.P();
                return false;
            }
            this.A.c = false;
            t40 t2 = iyVar2.t();
            Object[] objArr2 = t2.e;
            i = t2.g;
            while (i2 < i) {
            }
            this.n = true;
            j2 = lyVar.a().g;
            R(j);
            fyVar = lyVar.c;
            fyVar2 = fy.i;
            if (fyVar == fyVar2) {
            }
            this.E = j;
            fyVar3 = fy.e;
            lyVar.c = fyVar3;
            this.x = false;
            a90 snapshotObserver2 = nh.c0(iyVar2).getSnapshotObserver();
            snapshotObserver2.a.b(iyVar2, snapshotObserver2.c, this.F);
            if (lyVar.c == fyVar3) {
            }
            if (ew.a(lyVar.a().g, j2)) {
                z2 = false;
            }
            Q((lyVar.a().f & 4294967295L) | (lyVar.a().e << 32));
            return z2;
        } catch (Throwable th) {
            iyVar.Q(th);
            throw null;
        }
    }

    public final void Y() {
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        if (!iyVar.C() || lyVar.k <= 0) {
            return;
        }
        ly lyVar2 = iyVar2.I;
        if ((lyVar2.i || lyVar2.j) && !lyVar2.o.y) {
            iyVar2.M(false);
        }
        t40 t = iyVar2.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((iy) objArr[i2]).I.o.Y();
        }
    }

    @Override // defpackage.w10
    public final ec0 b(long j) {
        gy gyVar;
        ly lyVar = this.j;
        iy iyVar = lyVar.a;
        iy iyVar2 = lyVar.a;
        gy gyVar2 = iyVar.E;
        gy gyVar3 = gy.g;
        if (gyVar2 == gyVar3) {
            iyVar.c();
        }
        if (lw.z(iyVar2)) {
            c10 c10Var = lyVar.p;
            c10Var.getClass();
            c10Var.n = gyVar3;
            c10Var.b(j);
        }
        iy n = iyVar2.n();
        if (n != null) {
            ly lyVar2 = n.I;
            if (this.p != gyVar3 && !iyVar2.G) {
                cv.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = lyVar2.c.ordinal();
            if (ordinal == 0) {
                gyVar = gy.e;
            } else {
                if (ordinal != 2) {
                    z6.k(lyVar2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                gyVar = gy.f;
            }
            this.p = gyVar;
        } else {
            this.p = gyVar3;
        }
        X(j);
        return this;
    }

    @Override // defpackage.g2
    public final void c(l lVar) {
        t40 t = this.j.a.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            lVar.invoke(((iy) objArr[i2]).I.o);
        }
    }

    @Override // defpackage.ec0, defpackage.w10
    public final Object e() {
        return this.u;
    }

    @Override // defpackage.g30
    public final void h(boolean z) {
        ly lyVar = this.j;
        if (z != lyVar.a().p) {
            lyVar.a().p = z;
            this.N = true;
        }
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
        return lyVar.o;
    }

    @Override // defpackage.g2
    public final void q() {
        this.D = true;
        jy jyVar = this.A;
        jyVar.h();
        boolean z = this.y;
        ly lyVar = this.j;
        if (z) {
            t40 t = lyVar.a.t();
            Object[] objArr = t.e;
            int i = t.g;
            for (int i2 = 0; i2 < i; i2++) {
                iy iyVar = (iy) objArr[i2];
                if (iyVar.k() && iyVar.l() == gy.e && iy.J(iyVar)) {
                    iy.N(lyVar.a, false, 7);
                }
            }
        }
        if (this.z || (!i().s && this.y)) {
            this.y = false;
            fy fyVar = lyVar.c;
            lyVar.c = fy.g;
            lyVar.g(false);
            iy iyVar2 = lyVar.a;
            a90 snapshotObserver = nh.c0(iyVar2).getSnapshotObserver();
            snapshotObserver.a.b(iyVar2, snapshotObserver.e, this.G);
            lyVar.c = fyVar;
            this.z = false;
        }
        if (jyVar.b && jyVar.e()) {
            jyVar.g();
        }
        this.D = false;
    }

    @Override // defpackage.g2
    public final void requestLayout() {
        this.j.a.M(false);
    }
}
