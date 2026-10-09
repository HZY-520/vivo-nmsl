package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class d60 extends w00 implements w10, wx {
    public static final a60 Y = new a60(0);
    public static final a60 Z = new a60(1);
    public static final uf0 a0;
    public static final tx b0;
    public static final b60 c0;
    public static final i2 d0;
    public d60 A;
    public boolean B;
    public boolean C;
    public pq D;
    public si E;
    public xx F;
    public v00 H;
    public g40 I;
    public float K;
    public j40 L;
    public tx M;
    public oe0 O;
    public oe0 P;
    public boolean Q;
    public boolean R;
    public es S;
    public ma T;
    public u3 U;
    public final z50 V;
    public boolean W;
    public y80 X;
    public final iy y;
    public d60 z;
    public float G = 0.8f;
    public long J = 0;
    public tk0 N = lw.q;

    static {
        uf0 uf0Var = new uf0();
        uf0Var.f = 1.0f;
        uf0Var.g = 1.0f;
        uf0Var.h = 1.0f;
        long j = is.a;
        uf0Var.l = j;
        uf0Var.m = j;
        uf0Var.q = 8.0f;
        uf0Var.r = zq0.a;
        uf0Var.s = lw.q;
        uf0Var.u = 0;
        uf0Var.v = 9205357640488583168L;
        uf0Var.w = sx.a;
        uf0Var.x = new vi(1.0f, 1.0f);
        uf0Var.y = xx.e;
        uf0Var.A = 3;
        a0 = uf0Var;
        b0 = new tx();
        c0 = new b60();
        d0 = new i2(27);
    }

    public d60(iy iyVar) {
        this.y = iyVar;
        this.E = iyVar.A;
        this.F = iyVar.B;
        oe0 oe0Var = oe0.e;
        this.O = oe0Var;
        this.P = oe0Var;
        this.V = new z50(this, 1);
    }

    @Override // defpackage.wx
    public final oe0 A(wx wxVar, boolean z) {
        d60 d60Var;
        if (!A0().r) {
            cv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!wxVar.x()) {
            cv.b("LayoutCoordinates " + wxVar + " is not attached!");
        }
        z00 z00Var = wxVar instanceof z00 ? (z00) wxVar : null;
        if (z00Var == null || (d60Var = z00Var.e.y) == null) {
            d60Var = (d60) wxVar;
        }
        d60Var.L0();
        d60 w0 = w0(d60Var);
        j40 j40Var = this.L;
        if (j40Var == null) {
            j40Var = new j40();
            this.L = j40Var;
        }
        j40Var.a = 0.0f;
        j40Var.b = 0.0f;
        j40Var.c = (int) (wxVar.B() >> 32);
        j40Var.d = (int) (wxVar.B() & 4294967295L);
        while (d60Var != w0) {
            d60Var.T0(j40Var, z, false);
            if (j40Var.b()) {
                return oe0.e;
            }
            d60Var = d60Var.A;
            d60Var.getClass();
        }
        p0(w0, j40Var, z);
        return new oe0(j40Var.a, j40Var.b, j40Var.c, j40Var.d);
    }

    public abstract t20 A0();

    @Override // defpackage.wx
    public final long B() {
        return this.g;
    }

    public final boolean B0() {
        return this.Q && !this.O.d();
    }

    public final t20 C0(int i) {
        boolean f = e60.f(i);
        t20 A0 = A0();
        if (!f && (A0 = A0.i) == null) {
            return null;
        }
        for (t20 D0 = D0(f); D0 != null && (D0.h & i) != 0; D0 = D0.j) {
            if ((D0.g & i) != 0) {
                return D0;
            }
            if (D0 == A0) {
                return null;
            }
        }
        return null;
    }

    public final t20 D0(boolean z) {
        t20 A0;
        y50 y50Var = this.y.H;
        if (y50Var.d == this) {
            return y50Var.f;
        }
        d60 d60Var = this.A;
        if (!z) {
            if (d60Var != null) {
                return d60Var.A0();
            }
            return null;
        }
        if (d60Var == null || (A0 = d60Var.A0()) == null) {
            return null;
        }
        return A0.j;
    }

    public final void E0(t20 t20Var, c60 c60Var, long j, bt btVar, int i, boolean z) {
        if (t20Var == null) {
            H0(c60Var, j, btVar, i, z);
            return;
        }
        if (!c60Var.d(t20Var)) {
            E0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z);
            return;
        }
        int i2 = btVar.g;
        h40 h40Var = btVar.e;
        btVar.b(i2 + 1, h40Var.b);
        btVar.g++;
        h40Var.a(t20Var);
        btVar.f.a(kw.c(-1.0f, z, false));
        E0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z);
        btVar.g = i2;
    }

    public final void F0(t20 t20Var, c60 c60Var, long j, bt btVar, int i, boolean z, float f) {
        if (t20Var == null) {
            H0(c60Var, j, btVar, i, z);
            return;
        }
        if (!c60Var.d(t20Var)) {
            F0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f);
            return;
        }
        int i2 = btVar.g;
        h40 h40Var = btVar.e;
        btVar.b(i2 + 1, h40Var.b);
        btVar.g++;
        h40Var.a(t20Var);
        btVar.f.a(kw.c(f, z, false));
        Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f, true);
        btVar.g = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.lr0.g(r19.a(), defpackage.kw.c(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(c60 c60Var, long j, bt btVar, int i, boolean z) {
        boolean z2;
        h40 h40Var = btVar.e;
        t20 C0 = C0(c60Var.c());
        boolean z3 = false;
        if (!a1(j)) {
            if (i == 1) {
                float s0 = s0(j, z0());
                if ((Float.floatToRawIntBits(s0) & Integer.MAX_VALUE) < 2139095040) {
                    if (btVar.g != h40Var.b - 1) {
                        if (lr0.g(btVar.a(), kw.c(s0, false, false)) <= 0) {
                            return;
                        }
                    }
                    F0(C0, c60Var, j, btVar, i, false, s0);
                    return;
                }
                return;
            }
            return;
        }
        if (C0 == null) {
            H0(c60Var, j, btVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < M() && intBitsToFloat2 < L()) {
            E0(C0, c60Var, j, btVar, i, z);
            return;
        }
        float s02 = i == 1 ? s0(j, z0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(s02) & Integer.MAX_VALUE) < 2139095040) {
            if (btVar.g == h40Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
        } else {
            z2 = z;
        }
        Q0(C0, c60Var, j, btVar, i, z2, s02, z3);
    }

    public void H0(c60 c60Var, long j, bt btVar, int i, boolean z) {
        d60 d60Var = this.z;
        if (d60Var != null) {
            d60Var.G0(c60Var, d60Var.x0(j), btVar, i, z);
        }
    }

    public final void I0() {
        y80 y80Var = this.X;
        if (y80Var != null) {
            ((hs) y80Var).c();
            return;
        }
        d60 d60Var = this.A;
        if (d60Var != null) {
            d60Var.I0();
        }
    }

    public final boolean J0() {
        if (this.X != null && this.G <= 0.0f) {
            return true;
        }
        d60 d60Var = this.A;
        if (d60Var != null) {
            return d60Var.J0();
        }
        return false;
    }

    public final long K0(long j) {
        if (!A0().r) {
            cv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L0();
        while (this != null) {
            iy iyVar = this.y;
            if (this == iyVar.H.d && !iyVar.g) {
                long b = nh.c0(iyVar).getRectManager().b(iyVar);
                if (!xv.a(b, 9223372034707292159L)) {
                    return kw.E(j, b);
                }
            }
            y80 y80Var = this.X;
            if (y80Var != null) {
                hs hsVar = (hs) y80Var;
                float[] b2 = hsVar.b();
                if (!hsVar.w) {
                    j = u10.y(b2, j);
                }
            }
            j = kw.E(j, this.J);
            this = this.A;
        }
        return j;
    }

    public final void L0() {
        this.y.I.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v7, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void M0() {
        t20 t20Var;
        boolean f = e60.f(128);
        t20 D0 = D0(f);
        if (D0 == null || (D0.e.h & 128) == 0) {
            return;
        }
        ql0 ql0Var = (ql0) xl0.b.n();
        pq e = ql0Var != null ? ql0Var.e() : null;
        ql0 h = j20.h(ql0Var);
        try {
            if (f) {
                t20Var = A0();
            } else {
                t20Var = A0().i;
                if (t20Var == null) {
                }
            }
            for (t20 D02 = D0(f); D02 != null; D02 = D02.j) {
                if ((D02.h & 128) == 0) {
                    break;
                }
                if ((D02.g & 128) != 0) {
                    oi oiVar = D02;
                    ?? r8 = 0;
                    while (oiVar != 0) {
                        if (oiVar instanceof c20) {
                            ((c20) oiVar).b(this.g);
                        } else if ((oiVar.g & 128) != 0 && (oiVar instanceof oi)) {
                            t20 t20Var2 = oiVar.t;
                            int i = 0;
                            oiVar = oiVar;
                            r8 = r8;
                            while (t20Var2 != null) {
                                if ((t20Var2.g & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        oiVar = t20Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new t40(new t20[16]);
                                        }
                                        if (oiVar != 0) {
                                            r8.b(oiVar);
                                            oiVar = 0;
                                        }
                                        r8.b(t20Var2);
                                    }
                                }
                                t20Var2 = t20Var2.j;
                                oiVar = oiVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        oiVar = nh.N(r8);
                    }
                }
                if (D02 == t20Var) {
                    break;
                }
            }
        } finally {
            j20.p(ql0Var, h, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void N0() {
        boolean f = e60.f(4194304);
        t20 A0 = A0();
        if (!f && (A0 = A0.i) == null) {
            return;
        }
        for (t20 D0 = D0(f); D0 != null && (D0.h & 4194304) != 0; D0 = D0.j) {
            if ((D0.g & 4194304) != 0) {
                oi oiVar = D0;
                ?? r5 = 0;
                while (oiVar != 0) {
                    if (oiVar instanceof ux) {
                        ((ux) oiVar).h(this);
                    } else if ((oiVar.g & 4194304) != 0 && (oiVar instanceof oi)) {
                        t20 t20Var = oiVar.t;
                        int i = 0;
                        oiVar = oiVar;
                        r5 = r5;
                        while (t20Var != null) {
                            if ((t20Var.g & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    oiVar = t20Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new t40(new t20[16]);
                                    }
                                    if (oiVar != 0) {
                                        r5.b(oiVar);
                                        oiVar = 0;
                                    }
                                    r5.b(t20Var);
                                }
                            }
                            t20Var = t20Var.j;
                            oiVar = oiVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    oiVar = nh.N(r5);
                }
            }
            if (D0 == A0) {
                return;
            }
        }
    }

    public final void O0() {
        this.B = true;
        this.V.b();
        U0();
        if (xv.a(this.J, 0L)) {
            return;
        }
        this.y.F(this);
    }

    public final void P0() {
        boolean f = e60.f(1048576);
        t20 D0 = D0(f);
        if (D0 == null || (D0.e.h & 1048576) == 0) {
            return;
        }
        t20 A0 = A0();
        if (!f && (A0 = A0.i) == null) {
            return;
        }
        for (t20 D02 = D0(f); D02 != null && (D02.h & 1048576) != 0; D02 = D02.j) {
            if ((D02.g & 1048576) != 0) {
                t20 t20Var = D02;
                t40 t40Var = null;
                while (t20Var != null) {
                    if (t20Var instanceof yo) {
                    } else if ((t20Var.g & 1048576) != 0 && (t20Var instanceof oi)) {
                        int i = 0;
                        for (t20 t20Var2 = ((oi) t20Var).t; t20Var2 != null; t20Var2 = t20Var2.j) {
                            if ((t20Var2.g & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    t20Var = t20Var2;
                                } else {
                                    if (t40Var == null) {
                                        t40Var = new t40(new t20[16]);
                                    }
                                    if (t20Var != null) {
                                        t40Var.b(t20Var);
                                        t20Var = null;
                                    }
                                    t40Var.b(t20Var2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    t20Var = nh.N(t40Var);
                }
            }
            if (D02 == A0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [t20] */
    /* JADX WARN: Type inference failed for: r2v37 */
    public final void Q0(t20 t20Var, c60 c60Var, long j, bt btVar, int i, boolean z, float f, boolean z2) {
        xx xxVar;
        char c;
        int i2;
        t20 N;
        h40 h40Var = btVar.e;
        if (t20Var == null) {
            H0(c60Var, j, btVar, i, z);
            return;
        }
        if (!c60Var.d(t20Var)) {
            Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f, z2);
            return;
        }
        int i3 = i;
        boolean z3 = z;
        if (i3 == 3 || i3 == 4) {
            oi oiVar = t20Var;
            t40 t40Var = null;
            while (true) {
                if (oiVar == 0) {
                    break;
                }
                if (oiVar instanceof yc0) {
                    int i4 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i4);
                    iy iyVar = this.y;
                    xx xxVar2 = iyVar.B;
                    long j2 = Long.MIN_VALUE & Long.MIN_VALUE;
                    xx xxVar3 = xx.e;
                    if (j2 == 0 || xxVar2 == xxVar3) {
                        xxVar = xxVar3;
                        c = 30;
                        i2 = (int) Long.MIN_VALUE;
                    } else {
                        xxVar = xxVar3;
                        c = 30;
                        i2 = (int) (Long.MIN_VALUE >> 30);
                    }
                    if (intBitsToFloat >= (-(i2 & 32767))) {
                        if (Float.intBitsToFloat(i4) < M() + (((j2 == 0 || iyVar.B == xxVar) ? (int) (0 >> c) : (int) Long.MIN_VALUE) & 32767)) {
                            int i5 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i5) >= (-(((int) (Long.MIN_VALUE >> 15)) & 32767))) {
                                if (Float.intBitsToFloat(i5) < (((int) (Long.MIN_VALUE >> 45)) & 32767) + L()) {
                                    c40 c40Var = btVar.f;
                                    int i6 = btVar.g;
                                    int i7 = h40Var.b;
                                    if (i6 == i7 - 1) {
                                        btVar.b(i6 + 1, i7);
                                        btVar.g++;
                                        h40Var.a(t20Var);
                                        c40Var.a(kw.c(0.0f, z3, true));
                                        Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i3, z3, f, z2);
                                        btVar.g = i6;
                                        return;
                                    }
                                    long a = btVar.a();
                                    int i8 = btVar.g;
                                    if (!lr0.z(a)) {
                                        if (lr0.q(a) > 0.0f) {
                                            int i9 = btVar.g;
                                            btVar.b(i9 + 1, h40Var.b);
                                            btVar.g++;
                                            h40Var.a(t20Var);
                                            c40Var.a(kw.c(0.0f, z3, true));
                                            Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z3, f, z2);
                                            btVar.g = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = h40Var.b;
                                    int i11 = i10 - 1;
                                    btVar.g = i11;
                                    btVar.b(i10, h40Var.b);
                                    btVar.g++;
                                    h40Var.a(t20Var);
                                    c40Var.a(kw.c(0.0f, z3, true));
                                    Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z3, f, z2);
                                    btVar.g = i11;
                                    if (lr0.q(btVar.a()) < 0.0f) {
                                        btVar.b(i8 + 1, btVar.g + 1);
                                    }
                                    btVar.g = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                        t20 t20Var2 = oiVar.t;
                        int i12 = 0;
                        N = oiVar;
                        t40Var = t40Var;
                        while (t20Var2 != null) {
                            if ((t20Var2.g & 16) != 0) {
                                i12++;
                                t40Var = t40Var;
                                if (i12 == 1) {
                                    N = t20Var2;
                                } else {
                                    if (t40Var == null) {
                                        t40Var = new t40(new t20[16]);
                                    }
                                    if (N != null) {
                                        t40Var.b(N);
                                        N = null;
                                    }
                                    t40Var.b(t20Var2);
                                }
                            }
                            t20Var2 = t20Var2.j;
                            N = N;
                            t40Var = t40Var;
                        }
                        if (i12 == 1) {
                            i3 = i;
                            z3 = z;
                            oiVar = N;
                            t40Var = t40Var;
                        }
                    }
                    N = nh.N(t40Var);
                    i3 = i;
                    z3 = z;
                    oiVar = N;
                    t40Var = t40Var;
                }
            }
        }
        if (z2) {
            F0(t20Var, c60Var, j, btVar, i, z, f);
        } else {
            W0(t20Var, c60Var, j, btVar, i, z, f);
        }
    }

    public abstract void R0(ma maVar, es esVar);

    public final void S0(long j, float f, pq pqVar) {
        Y0(pqVar, false);
        boolean a = xv.a(this.J, j);
        iy iyVar = this.y;
        if (!a) {
            nh.c0(iyVar).I(-4.0f);
            this.J = j;
            y80 y80Var = this.X;
            if (y80Var != null) {
                ((hs) y80Var).d(j);
            } else {
                d60 d60Var = this.A;
                if (d60Var != null) {
                    d60Var.I0();
                }
            }
            iyVar.F(this);
            w00.i0(this);
            e3 e3Var = iyVar.r;
            if (e3Var != null) {
                e3Var.t(iyVar);
            }
        }
        this.K = f;
        if (this == iyVar.H.d && !this.s) {
            nh.c0(iyVar).getRectManager().g(iyVar);
        }
        if (this.s) {
            return;
        }
        W(e0());
    }

    public final void T0(j40 j40Var, boolean z, boolean z2) {
        long j;
        y80 y80Var = this.X;
        if (y80Var != null) {
            if (this.C) {
                if (z2) {
                    long z0 = z0();
                    float f = j40Var.a;
                    float f2 = j40Var.b;
                    if (j40Var.c >= 0.0f) {
                        long j2 = this.g;
                        if (f <= ((int) (j2 >> 32)) && j40Var.d >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (z0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (z0 & 4294967295L));
                            float f3 = (intBitsToFloat - (j40Var.c - j40Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (j40Var.d - j40Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.g;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (z0 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (z0 & 4294967295L);
                            j40Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.g;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (z0 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (z0 & 4294967295L);
                    j40Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.g;
                    j40Var.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (j40Var.b()) {
                    return;
                }
            }
            hs hsVar = (hs) y80Var;
            float[] b = hsVar.b();
            if (!hsVar.w) {
                if (b == null) {
                    j40Var.a = 0.0f;
                    j40Var.b = 0.0f;
                    j40Var.c = 0.0f;
                    j40Var.d = 0.0f;
                } else {
                    u10.z(b, j40Var);
                }
            }
        }
        long j5 = this.J;
        float f9 = (int) (j5 >> 32);
        j40Var.a += f9;
        j40Var.c += f9;
        float f10 = (int) (j5 & 4294967295L);
        j40Var.b += f10;
        j40Var.d += f10;
    }

    public final void U0() {
        if (this.X != null) {
            Y0(null, false);
            this.y.M(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [t20] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [t40] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [t40] */
    public final void V0(v00 v00Var) {
        d60 d60Var;
        char c;
        long j;
        int i;
        v00 v00Var2 = this.H;
        if (v00Var != v00Var2) {
            this.H = v00Var;
            iy iyVar = this.y;
            if (v00Var2 == null || v00Var.d() != v00Var2.d() || v00Var.b() != v00Var2.b()) {
                int d = v00Var.d();
                int b = v00Var.b();
                y80 y80Var = this.X;
                if (y80Var != null) {
                    ((hs) y80Var).e((d << 32) | (b & 4294967295L));
                } else if (iyVar.C() && (d60Var = this.A) != null) {
                    d60Var.I0();
                }
                Q((b & 4294967295L) | (d << 32));
                if (this.D != null) {
                    Z0(false);
                }
                boolean f = e60.f(4);
                t20 A0 = A0();
                if (f || (A0 = A0.i) != null) {
                    for (t20 D0 = D0(f); D0 != null && (D0.h & 4) != 0; D0 = D0.j) {
                        if ((D0.g & 4) != 0) {
                            oi oiVar = D0;
                            ?? r9 = 0;
                            while (oiVar != 0) {
                                if (oiVar instanceof il) {
                                    ((il) oiVar).U();
                                } else if ((oiVar.g & 4) != 0 && (oiVar instanceof oi)) {
                                    t20 t20Var = oiVar.t;
                                    int i2 = 0;
                                    oiVar = oiVar;
                                    r9 = r9;
                                    while (t20Var != null) {
                                        if ((t20Var.g & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                oiVar = t20Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new t40(new t20[16]);
                                                }
                                                if (oiVar != 0) {
                                                    r9.b(oiVar);
                                                    oiVar = 0;
                                                }
                                                r9.b(t20Var);
                                            }
                                        }
                                        t20Var = t20Var.j;
                                        oiVar = oiVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oiVar = nh.N(r9);
                            }
                        }
                        if (D0 == A0) {
                            break;
                        }
                    }
                }
                e3 e3Var = iyVar.r;
                if (e3Var != null) {
                    e3Var.t(iyVar);
                }
                iyVar.F(this);
            }
            g40 g40Var = this.I;
            if ((g40Var == null || g40Var.e == 0) && v00Var.a().isEmpty()) {
                return;
            }
            g40 g40Var2 = this.I;
            Map a = v00Var.a();
            char c2 = 7;
            if (g40Var2 != null && g40Var2.e == a.size()) {
                Object[] objArr = g40Var2.b;
                int[] iArr = g40Var2.c;
                long[] jArr = g40Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop1: while (true) {
                    long j2 = jArr[i3];
                    long j3 = 255;
                    if ((((~j2) << c2) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        c = c2;
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & j3) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = objArr[i7];
                                j = j3;
                                int i8 = iArr[i7];
                                i = i4;
                                Integer num = (Integer) a.get((c2) obj);
                                if (num == null || num.intValue() != i8) {
                                    break loop1;
                                }
                            } else {
                                j = j3;
                                i = i4;
                            }
                            j2 >>= i;
                            i6++;
                            i4 = i;
                            j3 = j;
                        }
                        if (i5 != i4) {
                            return;
                        }
                    } else {
                        c = c2;
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    c2 = c;
                }
            } else {
                j = 255;
            }
            iyVar.I.o.A.f();
            g40 g40Var3 = this.I;
            if (g40Var3 == null) {
                g40 g40Var4 = n60.a;
                g40Var3 = new g40();
                this.I = g40Var3;
            }
            g40Var3.e = 0;
            long[] jArr2 = g40Var3.a;
            if (jArr2 != gi0.a) {
                o7.W(jArr2);
                long[] jArr3 = g40Var3.a;
                int i9 = g40Var3.d;
                int i10 = i9 >> 3;
                long j4 = j << ((i9 & 7) << 3);
                jArr3[i10] = (jArr3[i10] & (~j4)) | j4;
            }
            o7.V(g40Var3.b, 0, g40Var3.d);
            g40Var3.f = gi0.a(g40Var3.d) - g40Var3.e;
            for (Map.Entry entry : v00Var.a().entrySet()) {
                g40Var3.f(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void W0(t20 t20Var, c60 c60Var, long j, bt btVar, int i, boolean z, float f) {
        int i2;
        h40 h40Var = btVar.e;
        if (t20Var == null) {
            H0(c60Var, j, btVar, i, z);
            return;
        }
        if (!c60Var.d(t20Var)) {
            W0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f);
            return;
        }
        if (!c60Var.b(t20Var)) {
            Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f, false);
            return;
        }
        c40 c40Var = btVar.f;
        int i3 = btVar.g;
        int i4 = h40Var.b;
        if (i3 != i4 - 1) {
            long a = btVar.a();
            int i5 = btVar.g;
            int i6 = h40Var.b;
            int i7 = i6 - 1;
            btVar.g = i7;
            btVar.b(i6, h40Var.b);
            btVar.g++;
            h40Var.a(t20Var);
            c40Var.a(kw.c(f, z, false));
            Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f, false);
            btVar.g = i7;
            long a2 = btVar.a();
            if (btVar.g + 1 >= h40Var.b - 1 || lr0.g(a, a2) <= 0) {
                btVar.b(btVar.g + 1, h40Var.b);
            } else {
                int i8 = i5 + 1;
                boolean z2 = lr0.z(a2);
                int i9 = btVar.g;
                btVar.b(i8, z2 ? i9 + 2 : i9 + 1);
            }
            btVar.g = i5;
            return;
        }
        int i10 = i3 + 1;
        btVar.b(i10, i4);
        btVar.g++;
        h40Var.a(t20Var);
        c40Var.a(kw.c(f, z, false));
        Q0(j20.j(t20Var, c60Var.c()), c60Var, j, btVar, i, z, f, false);
        btVar.g = i3;
        if (i10 == h40Var.b - 1 || lr0.z(btVar.a())) {
            int i11 = btVar.g;
            int i12 = i11 + 1;
            h40Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = c40Var.b)) {
                z6.f("Index must be between 0 and size");
                return;
            }
            long[] jArr = c40Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                o7.Q(jArr, jArr, i12, i11 + 2, i2);
            }
            c40Var.b--;
        }
    }

    public final oe0 X0() {
        if (A0().r) {
            wx s = q3.s(this);
            j40 j40Var = this.L;
            if (j40Var == null) {
                j40Var = new j40();
                this.L = j40Var;
            }
            long r0 = r0(z0());
            float f = B0() ? this.O.a : 0.0f;
            float f2 = B0() ? this.O.b : 0.0f;
            float M = B0() ? this.O.c : M();
            float L = B0() ? this.O.d : L();
            int i = (int) (r0 >> 32);
            j40Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (r0 & 4294967295L);
            j40Var.b = f2 - Float.intBitsToFloat(i2);
            j40Var.c = Float.intBitsToFloat(i) + M;
            j40Var.d = Float.intBitsToFloat(i2) + L;
            while (this != s) {
                this.T0(j40Var, false, true);
                if (!j40Var.b()) {
                    this = this.A;
                    this.getClass();
                }
            }
            return new oe0(j40Var.a, j40Var.b, j40Var.c, j40Var.d);
        }
        return oe0.e;
    }

    @Override // defpackage.w00
    public final w00 Y() {
        return this.z;
    }

    public final void Y0(pq pqVar, boolean z) {
        e3 e3Var;
        t40 t40Var;
        Reference poll;
        u3 u3Var;
        t40 t40Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        iy iyVar = this.y;
        boolean z2 = (!z && this.D == pqVar && lw.i(this.E, iyVar.A) && this.F == iyVar.B) ? false : true;
        this.E = iyVar.A;
        this.F = iyVar.B;
        boolean B = iyVar.B();
        z50 z50Var = this.V;
        if (!B || pqVar == null) {
            this.D = null;
            y80 y80Var = this.X;
            if (y80Var != null) {
                hs hsVar = (hs) y80Var;
                if (!v10.j(hsVar.b())) {
                    iyVar.F(this);
                }
                hsVar.h = null;
                hsVar.i = null;
                hsVar.k = true;
                hsVar.f(false);
                ds dsVar = hsVar.f;
                if (dsVar != null) {
                    dsVar.a(hsVar.e);
                    e3 e3Var2 = hsVar.g;
                    p2 p2Var = e3Var2.s0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) p2Var.g;
                        t40Var = (t40) p2Var.f;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            t40Var.i(poll);
                        }
                    } while (poll != null);
                    t40Var.b(new WeakReference(hsVar, (ReferenceQueue) p2Var.g));
                    e3Var2.E.k(hsVar);
                }
                this.X = null;
                iyVar.K = true;
                z50Var.b();
                if (A0().r && iyVar.C() && (e3Var = iyVar.r) != null) {
                    e3Var.t(iyVar);
                }
            }
            this.W = false;
            return;
        }
        this.D = pqVar;
        if (this.X != null) {
            if (z2) {
                Z0(true);
                return;
            }
            return;
        }
        e3 c02 = nh.c0(iyVar);
        u3 u3Var2 = this.U;
        if (u3Var2 == null) {
            u3 u3Var3 = new u3(2, this, new z50(this, i));
            this.U = u3Var3;
            u3Var = u3Var3;
        } else {
            u3Var = u3Var2;
        }
        p2 p2Var2 = c02.s0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) p2Var2.g;
            t40Var2 = (t40) p2Var2.f;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                t40Var2.i(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = t40Var2.g;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) t40Var2.j(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        y80 y80Var2 = (y80) obj;
        if (y80Var2 != null) {
            hs hsVar2 = (hs) y80Var2;
            ds dsVar2 = hsVar2.f;
            if (dsVar2 == null) {
                throw j2.f("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!hsVar2.e.s) {
                cv.a("layer should have been released before reuse");
            }
            hsVar2.e = dsVar2.b();
            hsVar2.k = false;
            hsVar2.h = u3Var;
            hsVar2.i = z50Var;
            hsVar2.u = false;
            hsVar2.v = false;
            hsVar2.w = true;
            u10.E(hsVar2.l);
            float[] fArr = hsVar2.m;
            if (fArr != null) {
                u10.E(fArr);
            }
            hsVar2.s = zq0.a;
            hsVar2.x = false;
            hsVar2.j = 9223372034707292159L;
            hsVar2.t = null;
            hsVar2.r = 0;
        } else {
            y80Var2 = new hs(c02.getGraphicsContext().b(), c02.getGraphicsContext(), c02, u3Var, z50Var);
        }
        hs hsVar3 = (hs) y80Var2;
        hsVar3.e(this.g);
        hsVar3.d(this.J);
        this.X = y80Var2;
        Z0(true);
        iyVar.K = true;
        z50Var.b();
    }

    public final void Z0(boolean z) {
        long j;
        long j2;
        int i;
        boolean z2;
        e3 e3Var;
        v10 v10Var;
        eq eqVar;
        int i2;
        eq eqVar2;
        y80 y80Var = this.X;
        pq pqVar = this.D;
        if (y80Var == null) {
            if (pqVar == null) {
                return;
            }
            cv.b("null layer with a non-null layerBlock");
            return;
        }
        if (pqVar == null) {
            throw j2.f("updateLayerParameters requires a non-null layerBlock");
        }
        uf0 uf0Var = a0;
        if (uf0Var.f != 1.0f) {
            uf0Var.e |= 1;
            uf0Var.f = 1.0f;
        }
        if (uf0Var.g != 1.0f) {
            uf0Var.e |= 2;
            uf0Var.g = 1.0f;
        }
        if (uf0Var.h != 1.0f) {
            uf0Var.e |= 4;
            uf0Var.h = 1.0f;
        }
        if (uf0Var.i != 0.0f) {
            uf0Var.e |= 8;
            uf0Var.i = 0.0f;
        }
        if (uf0Var.j != 0.0f) {
            uf0Var.e |= 16;
            uf0Var.j = 0.0f;
        }
        if (uf0Var.k != 0.0f) {
            uf0Var.e |= 32;
            uf0Var.k = 0.0f;
        }
        long j3 = is.a;
        long j4 = uf0Var.l;
        int i3 = gc.g;
        if (!as0.a(j4, j3)) {
            uf0Var.e |= 64;
            uf0Var.l = j3;
        }
        if (!as0.a(uf0Var.m, j3)) {
            uf0Var.e |= 128;
            uf0Var.m = j3;
        }
        if (uf0Var.n != 0.0f) {
            uf0Var.e |= 256;
            uf0Var.n = 0.0f;
        }
        if (uf0Var.o != 0.0f) {
            uf0Var.e |= 512;
            uf0Var.o = 0.0f;
        }
        if (uf0Var.p != 0.0f) {
            uf0Var.e |= 1024;
            uf0Var.p = 0.0f;
        }
        if (uf0Var.q != 8.0f) {
            uf0Var.e |= 2048;
            uf0Var.q = 8.0f;
        }
        long j5 = zq0.a;
        if (uf0Var.r != j5) {
            uf0Var.e |= 4096;
            uf0Var.r = j5;
        }
        ot0 ot0Var = lw.q;
        if (!lw.i(uf0Var.s, ot0Var)) {
            uf0Var.e |= 8192;
            uf0Var.s = ot0Var;
        }
        if (uf0Var.t) {
            uf0Var.e |= 16384;
            uf0Var.t = false;
        }
        if (!lw.i(uf0Var.z, null)) {
            uf0Var.e |= 262144;
            uf0Var.z = null;
        }
        if (uf0Var.A != 3) {
            uf0Var.e |= 524288;
            uf0Var.A = 3;
        }
        if (uf0Var.u != 0) {
            uf0Var.e |= 32768;
            uf0Var.u = 0;
        }
        sx sxVar = sx.a;
        if (!lw.i(uf0Var.w, sxVar)) {
            uf0Var.e |= 1048576;
            uf0Var.w = sxVar;
        }
        uf0Var.v = 9205357640488583168L;
        uf0Var.B = null;
        uf0Var.e = 0;
        iy iyVar = this.y;
        uf0Var.x = iyVar.A;
        uf0Var.y = iyVar.B;
        uf0Var.v = t10.G(this.g);
        re0 re0Var = new re0();
        nh.c0(iyVar).getSnapshotObserver().a.b(this, Y, new v7(pqVar, this, re0Var, 5));
        tx txVar = this.M;
        if (txVar == null) {
            txVar = new tx();
            this.M = txVar;
        }
        tx txVar2 = b0;
        txVar2.getClass();
        txVar2.a = txVar.a;
        txVar2.b = txVar.b;
        txVar2.c = txVar.c;
        txVar2.d = txVar.d;
        txVar2.e = txVar.e;
        txVar2.f = txVar.f;
        txVar2.g = txVar.g;
        txVar2.h = txVar.h;
        txVar2.i = txVar.i;
        txVar.a = uf0Var.f;
        txVar.b = uf0Var.g;
        txVar.c = uf0Var.i;
        txVar.d = uf0Var.j;
        txVar.e = uf0Var.n;
        txVar.f = uf0Var.o;
        txVar.g = uf0Var.p;
        txVar.h = uf0Var.q;
        txVar.i = uf0Var.r;
        hs hsVar = (hs) y80Var;
        e3 e3Var2 = hsVar.g;
        int i4 = hsVar.r | uf0Var.e;
        hsVar.p = uf0Var.y;
        si siVar = uf0Var.x;
        hsVar.o = siVar;
        if ((i4 & 1048576) != 0) {
            es esVar = hsVar.e;
            uf0Var.w.getClass();
            int D = siVar.D(0.0f);
            uf0Var.w.getClass();
            int D2 = siVar.D(0.0f);
            j = j5;
            uf0Var.w.getClass();
            int D3 = siVar.D(0.0f);
            uf0Var.w.getClass();
            int D4 = siVar.D(0.0f);
            esVar.v = D;
            esVar.w = D2;
            esVar.x = D3;
            esVar.y = D4;
            esVar.a.g(D, D2, D3, D4);
            hsVar.c();
        } else {
            j = j5;
        }
        int i5 = i4 & 4096;
        if (i5 != 0) {
            hsVar.s = uf0Var.r;
        }
        if ((i4 & 1) != 0) {
            es esVar2 = hsVar.e;
            float f = uf0Var.f;
            gs gsVar = esVar2.a;
            if (gsVar.d() != f) {
                gsVar.n(f);
            }
        }
        if ((i4 & 2) != 0) {
            es esVar3 = hsVar.e;
            float f2 = uf0Var.g;
            gs gsVar2 = esVar3.a;
            if (gsVar2.I() != f2) {
                gsVar2.A(f2);
            }
        }
        if ((i4 & 4) != 0) {
            es esVar4 = hsVar.e;
            float f3 = uf0Var.h;
            gs gsVar3 = esVar4.a;
            if (gsVar3.a() != f3) {
                gsVar3.c(f3);
            }
        }
        if ((i4 & 8) != 0) {
            es esVar5 = hsVar.e;
            float f4 = uf0Var.i;
            gs gsVar4 = esVar5.a;
            if (gsVar4.r() != f4) {
                gsVar4.y(f4);
            }
        }
        if ((i4 & 16) != 0) {
            es esVar6 = hsVar.e;
            float f5 = uf0Var.j;
            gs gsVar5 = esVar6.a;
            if (gsVar5.h() != f5) {
                gsVar5.j(f5);
            }
        }
        if ((i4 & 32) != 0) {
            es esVar7 = hsVar.e;
            float f6 = uf0Var.k;
            gs gsVar6 = esVar7.a;
            if (gsVar6.G() != f6) {
                gsVar6.f(f6);
                esVar7.g = true;
                esVar7.a();
            }
            if (uf0Var.k > 0.0f && !hsVar.x && (eqVar2 = hsVar.i) != null) {
                eqVar2.b();
            }
        }
        if ((i4 & 64) != 0) {
            es esVar8 = hsVar.e;
            long j6 = uf0Var.l;
            gs gsVar7 = esVar8.a;
            long N = gsVar7.N();
            int i6 = gc.g;
            if (!as0.a(j6, N)) {
                gsVar7.l(j6);
            }
        }
        if ((i4 & 128) != 0) {
            es esVar9 = hsVar.e;
            long j7 = uf0Var.m;
            gs gsVar8 = esVar9.a;
            long k = gsVar8.k();
            int i7 = gc.g;
            if (!as0.a(j7, k)) {
                gsVar8.z(j7);
            }
        }
        if ((i4 & 1024) != 0) {
            es esVar10 = hsVar.e;
            float f7 = uf0Var.p;
            gs gsVar9 = esVar10.a;
            if (gsVar9.K() != f7) {
                gsVar9.i(f7);
            }
        }
        if ((i4 & 256) != 0) {
            es esVar11 = hsVar.e;
            float f8 = uf0Var.n;
            gs gsVar10 = esVar11.a;
            if (gsVar10.v() != f8) {
                gsVar10.J(f8);
            }
        }
        if ((i4 & 512) != 0) {
            es esVar12 = hsVar.e;
            float f9 = uf0Var.o;
            gs gsVar11 = esVar12.a;
            if (gsVar11.D() != f9) {
                gsVar11.b(f9);
            }
        }
        if ((i4 & 2048) != 0) {
            es esVar13 = hsVar.e;
            float f10 = uf0Var.q;
            gs gsVar12 = esVar13.a;
            if (gsVar12.p() != f10) {
                gsVar12.F(f10);
            }
        }
        if (i5 != 0) {
            boolean z3 = hsVar.s == j;
            es esVar14 = hsVar.e;
            if (z3) {
                j2 = 4294967295L;
                if (!s60.b(esVar14.z, 9205357640488583168L)) {
                    esVar14.z = 9205357640488583168L;
                    esVar14.a.M(9205357640488583168L);
                }
            } else {
                j2 = 4294967295L;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hsVar.s & 4294967295L)) * ((int) (hsVar.j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r13 >> 32)) * ((int) (hsVar.j >> 32))) << 32);
                if (!s60.b(esVar14.z, floatToRawIntBits)) {
                    esVar14.z = floatToRawIntBits;
                    esVar14.a.M(floatToRawIntBits);
                }
            }
        } else {
            j2 = 4294967295L;
        }
        if ((i4 & 16384) != 0) {
            es esVar15 = hsVar.e;
            boolean z4 = uf0Var.t;
            if (esVar15.A != z4) {
                esVar15.A = z4;
                esVar15.g = true;
                esVar15.a();
            }
        }
        if ((131072 & i4) != 0) {
            gs gsVar13 = hsVar.e.a;
        }
        if ((i4 & 262144) != 0) {
            es esVar16 = hsVar.e;
            l8 l8Var = uf0Var.z;
            gs gsVar14 = esVar16.a;
            if (!lw.i(gsVar14.w(), l8Var)) {
                gsVar14.E(l8Var);
            }
        }
        if ((i4 & 524288) != 0) {
            es esVar17 = hsVar.e;
            int i8 = uf0Var.A;
            gs gsVar15 = esVar17.a;
            if (gsVar15.L() != i8) {
                gsVar15.o(i8);
            }
        }
        if ((i4 & 32768) != 0) {
            es esVar18 = hsVar.e;
            int i9 = uf0Var.u;
            if (i9 == 0) {
                i2 = 0;
            } else if (i9 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (i9 != 2) {
                    z6.m("Not supported composition strategy");
                    return;
                }
            }
            gs gsVar16 = esVar18.a;
            if (gsVar16.u() != i2) {
                gsVar16.x(i2);
            }
        }
        if ((i4 & 7963) != 0) {
            hsVar.u = true;
            hsVar.v = true;
        }
        if (lw.i(hsVar.t, uf0Var.B)) {
            i = i4;
            z2 = false;
        } else {
            v10 v10Var2 = uf0Var.B;
            hsVar.t = v10Var2;
            if (v10Var2 == null) {
                i = i4;
            } else {
                es esVar19 = hsVar.e;
                if (v10Var2 instanceof t80) {
                    oe0 oe0Var = ((t80) v10Var2).b;
                    float f11 = oe0Var.a;
                    float f12 = oe0Var.b;
                    i = i4;
                    esVar19.e(0.0f, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & j2), (Float.floatToRawIntBits(oe0Var.c - oe0Var.a) << 32) | (Float.floatToRawIntBits(oe0Var.d - f12) & j2));
                    v10Var = v10Var2;
                } else {
                    v10Var = v10Var2;
                    i = i4;
                    if (v10Var instanceof s80) {
                        c5 c5Var = ((s80) v10Var).b;
                        esVar19.k = null;
                        esVar19.i = 9205357640488583168L;
                        esVar19.h = 0L;
                        esVar19.j = 0.0f;
                        esVar19.g = true;
                        esVar19.n = false;
                        esVar19.l = c5Var;
                        esVar19.a();
                    } else {
                        if (!(v10Var instanceof u80)) {
                            z6.j();
                            return;
                        }
                        u80 u80Var = (u80) v10Var;
                        c5 c5Var2 = u80Var.c;
                        if (c5Var2 != null) {
                            esVar19.k = null;
                            esVar19.i = 9205357640488583168L;
                            esVar19.h = 0L;
                            esVar19.j = 0.0f;
                            esVar19.g = true;
                            esVar19.n = false;
                            esVar19.l = c5Var2;
                            esVar19.a();
                        } else {
                            esVar19.e(Float.intBitsToFloat((int) (u80Var.b.h >> 32)), (Float.floatToRawIntBits(r9.a) << 32) | (Float.floatToRawIntBits(r9.b) & j2), (Float.floatToRawIntBits(r9.c - r9.a) << 32) | (Float.floatToRawIntBits(r9.d - r9.b) & j2));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((v10Var instanceof s80) || ((v10Var instanceof u80) && !v10.k(((u80) v10Var).b))) && (eqVar = hsVar.i) != null)) {
                    eqVar.b();
                }
            }
            z2 = true;
        }
        hsVar.r = uf0Var.e;
        if (i != 0 || z2) {
            View view = hsVar.g;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
            if (e3.m()) {
                e3Var2.I(0.0f);
            }
        }
        boolean z5 = this.C;
        boolean z6 = uf0Var.t;
        this.C = z6;
        this.G = uf0Var.h;
        boolean z7 = txVar2.a == txVar.a && txVar2.b == txVar.b && txVar2.c == txVar.c && txVar2.d == txVar.d && txVar2.e == txVar.e && txVar2.f == txVar.f && txVar2.g == txVar.g && txVar2.h == txVar.h && txVar2.i == txVar.i;
        if (z && ((!z7 || z5 != z6 || re0Var.e) && (e3Var = iyVar.r) != null)) {
            e3Var.t(iyVar);
        }
        if (z7) {
            return;
        }
        iyVar.F(this);
        if (iyVar.O > 0) {
            e3 c02 = nh.c0(iyVar);
            p2 p2Var = c02.T.e;
            if (iyVar.O > 0) {
                ((t40) p2Var.f).b(iyVar);
                iyVar.N = true;
            }
            c02.C(null);
        }
    }

    @Override // defpackage.wx
    public final long a(long j) {
        if (!A0().r) {
            cv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return nh.c0(this.y).q(K0(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        y80 y80Var = this.X;
        if (y80Var == null || !this.C) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        es esVar = ((hs) y80Var).e;
        if (esVar.A) {
            v10 d = esVar.d();
            if (!(d instanceof t80)) {
                if (d instanceof u80) {
                    ng0 ng0Var = ((u80) d).b;
                    float f = ng0Var.c;
                    float f2 = ng0Var.b;
                    float f3 = ng0Var.d;
                    float f4 = ng0Var.a;
                    long j2 = ng0Var.f;
                    long j3 = ng0Var.h;
                    z = false;
                    z2 = true;
                    long j4 = ng0Var.g;
                    long j5 = ng0Var.e;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = p30.l(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, ng0Var.e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = p30.l(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, ng0Var.h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = p30.l(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, ng0Var.g);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = p30.l(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, ng0Var.f);
                                        }
                                    }
                                }
                            }
                        }
                        c5 a = e5.a();
                        c5.b(a, ng0Var);
                        z3 = p30.j(intBitsToFloat, intBitsToFloat2, a);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(d instanceof s80)) {
                        z6.j();
                        return false;
                    }
                    z3 = p30.j(intBitsToFloat, intBitsToFloat2, ((s80) d).b);
                }
                return z3 ? z2 : z;
            }
            oe0 oe0Var = ((t80) d).b;
            if (oe0Var.a > intBitsToFloat || intBitsToFloat >= oe0Var.c || oe0Var.b > intBitsToFloat2 || intBitsToFloat2 >= oe0Var.d) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    @Override // defpackage.w00
    public final boolean c0() {
        return this.H != null;
    }

    @Override // defpackage.wx
    public final long d(long j) {
        long K0 = K0(j);
        e3 c02 = nh.c0(this.y);
        c02.y();
        return u10.y(c02.b0, K0);
    }

    @Override // defpackage.w00
    public final iy d0() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.ec0, defpackage.w10
    public final Object e() {
        iy iyVar = this.y;
        if (!iyVar.H.c(64)) {
            return null;
        }
        A0();
        Object obj = null;
        for (t20 t20Var = iyVar.H.e; t20Var != null; t20Var = t20Var.i) {
            if ((t20Var.g & 64) != 0) {
                oi oiVar = t20Var;
                ?? r4 = 0;
                while (oiVar != 0) {
                    if (oiVar instanceof x90) {
                        obj = ((x90) oiVar).T(obj);
                    } else if ((oiVar.g & 64) != 0 && (oiVar instanceof oi)) {
                        t20 t20Var2 = oiVar.t;
                        int i = 0;
                        oiVar = oiVar;
                        r4 = r4;
                        while (t20Var2 != null) {
                            if ((t20Var2.g & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    oiVar = t20Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new t40(new t20[16]);
                                    }
                                    if (oiVar != 0) {
                                        r4.b(oiVar);
                                        oiVar = 0;
                                    }
                                    r4.b(t20Var2);
                                }
                            }
                            t20Var2 = t20Var2.j;
                            oiVar = oiVar;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    oiVar = nh.N(r4);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.w00
    public final v00 e0() {
        v00 v00Var = this.H;
        if (v00Var != null) {
            return v00Var;
        }
        z6.m("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.wx
    public final wx f() {
        boolean z = A0().r;
        iy iyVar = this.y;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (iy iyVar2 = iyVar; iyVar2 != null; iyVar2 = iyVar2.n()) {
                sb.append("\n|");
                sb.append(iyVar2);
                sb.append(" isAttached=");
                sb.append(iyVar2.B());
                sb.append(" modifier=");
                sb.append(iyVar2.L);
                sb.append(" tail=");
                sb.append(A0());
            }
            cv.b(sb.toString());
        }
        L0();
        return iyVar.H.d.A;
    }

    @Override // defpackage.w00
    public final w00 f0() {
        return this.A;
    }

    @Override // defpackage.si
    public final float g() {
        return this.y.A.g();
    }

    @Override // defpackage.w00
    public final long g0() {
        return this.J;
    }

    @Override // defpackage.w00
    public final xx getLayoutDirection() {
        return this.y.B;
    }

    @Override // defpackage.si
    public final float k() {
        return this.y.A.k();
    }

    @Override // defpackage.w00
    public final void n0() {
        P(this.J, this.K, this.D);
    }

    @Override // defpackage.w00, defpackage.z80
    public final boolean p() {
        return (this.X == null || this.B || !this.y.B()) ? false : true;
    }

    public final void p0(d60 d60Var, j40 j40Var, boolean z) {
        if (d60Var == this) {
            return;
        }
        d60 d60Var2 = this.A;
        if (d60Var2 != null) {
            d60Var2.p0(d60Var, j40Var, z);
        }
        long j = this.J;
        float f = (int) (j >> 32);
        j40Var.a -= f;
        j40Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        j40Var.b -= f2;
        j40Var.d -= f2;
        y80 y80Var = this.X;
        if (y80Var != null) {
            hs hsVar = (hs) y80Var;
            float[] a = hsVar.a();
            if (!hsVar.w) {
                if (a == null) {
                    j40Var.a = 0.0f;
                    j40Var.b = 0.0f;
                    j40Var.c = 0.0f;
                    j40Var.d = 0.0f;
                } else {
                    u10.z(a, j40Var);
                }
            }
            if (this.C && z) {
                long j2 = this.g;
                j40Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long q0(d60 d60Var, long j) {
        if (d60Var == this) {
            return j;
        }
        d60 d60Var2 = this.A;
        return (d60Var2 == null || lw.i(d60Var, d60Var2)) ? x0(j) : x0(d60Var2.q0(d60Var, j));
    }

    public final long r0(long j) {
        float M;
        float L;
        if (B0()) {
            oe0 oe0Var = this.O;
            M = oe0Var.c - oe0Var.a;
        } else {
            M = M();
        }
        if (B0()) {
            oe0 oe0Var2 = this.O;
            L = oe0Var2.d - oe0Var2.b;
        } else {
            L = L();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - M;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - L;
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float s0(long j, long j2) {
        if (M() >= Float.intBitsToFloat((int) (j2 >> 32)) && L() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long r0 = r0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (r0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (r0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - M());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - L())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void t0(ma maVar, es esVar) {
        float f;
        ma maVar2;
        Canvas canvas;
        ma maVar3;
        long j;
        Canvas canvas2;
        boolean z;
        long j2;
        boolean z2;
        float f2;
        y80 y80Var = this.X;
        if (y80Var == null) {
            long j3 = this.J;
            float f3 = (int) (j3 >> 32);
            float f4 = (int) (j3 & 4294967295L);
            maVar.e(f3, f4);
            u0(maVar, esVar);
            maVar.e(-f3, -f4);
            return;
        }
        hs hsVar = (hs) y80Var;
        v6 v6Var = hsVar.q.f;
        hsVar.g();
        hsVar.x = hsVar.e.a.G() > 0.0f;
        v6Var.z(maVar);
        v6Var.b = esVar;
        es esVar2 = hsVar.e;
        ma o = v6Var.o();
        es esVar3 = (es) v6Var.b;
        gs gsVar = esVar2.a;
        if (esVar2.s) {
            return;
        }
        long j4 = esVar2.h;
        Canvas a = o2.a(o);
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            f = 0.0f;
            maVar2 = o;
            canvas = a;
        } else {
            long j5 = esVar2.t;
            float f5 = (int) (j5 >> 32);
            float f6 = f5 - esVar2.v;
            float f7 = (int) (j5 & 4294967295L);
            float f8 = f7 - esVar2.w;
            f = 0.0f;
            long j6 = esVar2.u;
            maVar2 = o;
            float f9 = f5 + ((int) (j6 >> 32)) + esVar2.x;
            float f10 = f7 + ((int) (j6 & 4294967295L)) + esVar2.y;
            float a2 = gsVar.a();
            l8 w = gsVar.w();
            int L = gsVar.L();
            if (a2 < 1.0f || L != 3 || w != null || gsVar.u() == 1) {
                v4 v4Var = esVar2.p;
                if (v4Var == null) {
                    v4Var = dx0.b();
                    esVar2.p = v4Var;
                }
                v4Var.b(a2);
                v4Var.c(L);
                v4Var.e(w);
                f2 = f6;
                a.saveLayer(f2, f8, f9, f10, v4Var.a);
            } else {
                a.save();
                f2 = f6;
            }
            canvas = a;
            canvas.translate(f2, f8);
            Matrix B = gsVar.B();
            B.preTranslate(esVar2.v, esVar2.w);
            canvas.concat(B);
            long j7 = esVar2.h;
            float f11 = esVar2.v;
            esVar2.h = s60.d(j7, (Float.floatToRawIntBits(esVar2.w) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        }
        esVar2.a();
        if (!gsVar.H()) {
            try {
                esVar2.a.e(esVar2.b, esVar2.c, esVar2, esVar2.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = gsVar.G() > f;
        if (z3) {
            maVar2.n();
        }
        boolean z4 = !isHardwareAccelerated && esVar2.A;
        if (z4) {
            maVar2.i();
            v10 d = esVar2.d();
            if (d instanceof t80) {
                oe0 oe0Var = ((t80) d).b;
                j = j4;
                maVar3 = maVar2;
                maVar3.d(oe0Var.a, oe0Var.b, oe0Var.c, oe0Var.d, 1);
            } else {
                maVar3 = maVar2;
                j = j4;
                if (d instanceof u80) {
                    c5 c5Var = esVar2.m;
                    if (c5Var != null) {
                        c5Var.a.rewind();
                    } else {
                        c5Var = e5.a();
                        esVar2.m = c5Var;
                    }
                    c5.b(c5Var, ((u80) d).b);
                    maVar3.o(c5Var);
                } else {
                    if (!(d instanceof s80)) {
                        z6.j();
                        return;
                    }
                    maVar3.o(((s80) d).b);
                }
            }
        } else {
            maVar3 = maVar2;
            j = j4;
        }
        if (esVar3 != null) {
            r4 r4Var = esVar3.r;
            if (!r4Var.a) {
                bv.a("Only add dependencies during a tracking");
            }
            l40 l40Var = (l40) r4Var.d;
            if (l40Var != null) {
                l40Var.a(esVar2);
            } else if (((es) r4Var.b) != null) {
                int i = hi0.a;
                l40 l40Var2 = new l40();
                es esVar4 = (es) r4Var.b;
                esVar4.getClass();
                l40Var2.a(esVar4);
                l40Var2.a(esVar2);
                r4Var.d = l40Var2;
                r4Var.b = null;
            } else {
                r4Var.b = esVar2;
            }
            l40 l40Var3 = (l40) r4Var.e;
            if (l40Var3 != null) {
                z2 = !l40Var3.k(esVar2);
            } else if (((es) r4Var.c) != esVar2) {
                z2 = true;
            } else {
                r4Var.c = null;
                z2 = false;
            }
            if (z2) {
                esVar2.q++;
            }
        }
        if (((n2) maVar3).a.isHardwareAccelerated()) {
            canvas2 = canvas;
            z = isHardwareAccelerated;
            j2 = j;
            gsVar.s(maVar3);
        } else {
            oa oaVar = esVar2.o;
            if (oaVar == null) {
                oaVar = new oa();
                esVar2.o = oaVar;
            }
            v6 v6Var2 = oaVar.f;
            si siVar = esVar2.b;
            xx xxVar = esVar2.c;
            long G = t10.G(esVar2.u);
            si p = v6Var2.p();
            xx r = v6Var2.r();
            canvas2 = canvas;
            ma o2 = v6Var2.o();
            z = isHardwareAccelerated;
            j2 = j;
            long s = v6Var2.s();
            es esVar5 = (es) v6Var2.b;
            v6Var2.A(siVar);
            v6Var2.B(xxVar);
            v6Var2.z(maVar3);
            v6Var2.C(G);
            v6Var2.b = esVar2;
            maVar3.i();
            try {
                esVar2.c(oaVar);
            } finally {
                maVar3.g();
                v6Var2.A(p);
                v6Var2.B(r);
                v6Var2.z(o2);
                v6Var2.C(s);
                v6Var2.b = esVar5;
            }
        }
        if (z4) {
            maVar3.g();
        }
        if (z3) {
            maVar3.j();
        }
        if (!z) {
            canvas2.restore();
        }
        esVar2.h = j2;
    }

    public final void u0(ma maVar, es esVar) {
        d60 d60Var;
        ma maVar2;
        es esVar2;
        t20 C0 = C0(4);
        if (C0 == null) {
            R0(maVar, esVar);
            return;
        }
        iy iyVar = this.y;
        iyVar.getClass();
        ky sharedDrawScope = nh.c0(iyVar).getSharedDrawScope();
        long G = t10.G(this.g);
        sharedDrawScope.getClass();
        t40 t40Var = null;
        while (C0 != null) {
            if (C0 instanceof il) {
                d60Var = this;
                maVar2 = maVar;
                esVar2 = esVar;
                sharedDrawScope.b(maVar2, G, d60Var, (il) C0, esVar2);
            } else {
                d60Var = this;
                maVar2 = maVar;
                esVar2 = esVar;
                if ((C0.g & 4) != 0 && (C0 instanceof oi)) {
                    int i = 0;
                    for (t20 t20Var = ((oi) C0).t; t20Var != null; t20Var = t20Var.j) {
                        if ((t20Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                C0 = t20Var;
                            } else {
                                if (t40Var == null) {
                                    t40Var = new t40(new t20[16]);
                                }
                                if (C0 != null) {
                                    t40Var.b(C0);
                                    C0 = null;
                                }
                                t40Var.b(t20Var);
                            }
                        }
                    }
                    if (i == 1) {
                        maVar = maVar2;
                        this = d60Var;
                        esVar = esVar2;
                    }
                }
            }
            C0 = nh.N(t40Var);
            maVar = maVar2;
            this = d60Var;
            esVar = esVar2;
        }
    }

    @Override // defpackage.wx
    public final long v(wx wxVar, long j) {
        return z(wxVar, j);
    }

    public abstract void v0();

    public final d60 w0(d60 d60Var) {
        iy iyVar = d60Var.y;
        iy iyVar2 = this.y;
        if (iyVar == iyVar2) {
            t20 A0 = d60Var.A0();
            t20 A02 = A0();
            if (!A02.e.r) {
                cv.b("visitLocalAncestors called on an unattached node");
            }
            for (t20 t20Var = A02.e.i; t20Var != null; t20Var = t20Var.i) {
                if ((t20Var.g & 2) != 0 && t20Var == A0) {
                    return d60Var;
                }
            }
            return this;
        }
        while (iyVar.s > iyVar2.s) {
            iyVar = iyVar.n();
            iyVar.getClass();
        }
        iy iyVar3 = iyVar2;
        while (iyVar3.s > iyVar.s) {
            iyVar3 = iyVar3.n();
            iyVar3.getClass();
        }
        while (iyVar != iyVar3) {
            iyVar = iyVar.n();
            iyVar3 = iyVar3.n();
            if (iyVar == null || iyVar3 == null) {
                z6.l("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (iyVar3 != iyVar2) {
            if (iyVar != d60Var.y) {
                return iyVar.H.c;
            }
            return d60Var;
        }
        return this;
    }

    @Override // defpackage.wx
    public final boolean x() {
        return A0().r;
    }

    public final long x0(long j) {
        long j2 = this.J;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        y80 y80Var = this.X;
        if (y80Var != null) {
            hs hsVar = (hs) y80Var;
            float[] a = hsVar.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!hsVar.w) {
                return u10.y(a, floatToRawIntBits);
            }
        }
        return floatToRawIntBits;
    }

    public abstract y00 y0();

    @Override // defpackage.wx
    public final long z(wx wxVar, long j) {
        d60 d60Var;
        boolean z = wxVar instanceof z00;
        if (z) {
            z00 z00Var = (z00) wxVar;
            z00Var.e.y.L0();
            return z00Var.z(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        z00 z00Var2 = z ? (z00) wxVar : null;
        if (z00Var2 == null || (d60Var = z00Var2.e.y) == null) {
            wxVar.getClass();
            d60Var = (d60) wxVar;
        }
        d60Var.L0();
        d60 w0 = w0(d60Var);
        while (d60Var != w0) {
            y80 y80Var = d60Var.X;
            if (y80Var != null) {
                hs hsVar = (hs) y80Var;
                float[] b = hsVar.b();
                if (!hsVar.w) {
                    j = u10.y(b, j);
                }
            }
            j = kw.E(j, d60Var.J);
            d60Var = d60Var.A;
            d60Var.getClass();
        }
        return q0(w0, j);
    }

    public final long z0() {
        return this.E.K(this.y.C.c());
    }

    @Override // defpackage.w00
    public final wx b0() {
        return this;
    }
}
