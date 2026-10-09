package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class w00 extends ec0 implements g30, z80, si {
    public static final l0 w;
    public static final l0 x;
    public u00 j;
    public pq k;
    public tq l;
    public pq m;
    public gc0 n;
    public k40 o;
    public boolean p;
    public k40 q;
    public boolean r;
    public boolean s;
    public final x00 t = new x00(0, this);
    public xg0 u;
    public k40 v;

    static {
        byte b = 0;
        w = new l0(26, b);
        x = new l0(27, b);
    }

    public static void i0(d60 d60Var) {
        jy jyVar;
        d60 d60Var2 = d60Var.z;
        iy iyVar = d60Var.y;
        if (!lw.i(d60Var2 != null ? d60Var2.y : null, iyVar)) {
            iyVar.I.o.A.f();
            return;
        }
        g2 l = iyVar.I.o.l();
        if (l == null || (jyVar = ((a20) l).A) == null) {
            return;
        }
        jyVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(iy iyVar, mt mtVar) {
        char c;
        long j;
        long j2;
        long j3;
        k40 k40Var;
        k40 k40Var2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        k40 k40Var3 = this.v;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (k40Var3 != null) {
            Object[] objArr = k40Var3.c;
            long[] jArr3 = k40Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                l40 l40Var = (l40) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = l40Var.b;
                                long[] jArr4 = l40Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    iy iyVar2 = (iy) ((ou0) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (iyVar2 != null) {
                                                        boolean B = iyVar2.B();
                                                        i4 = i8;
                                                        if (B) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    l40Var.l(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                k40Var = this.v;
                if (k40Var != null) {
                    long[] jArr5 = k40Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((l40) k40Var.c[i18]).g()) {
                                            k40Var.k(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                k40Var2 = this.v;
                if (k40Var2 == null) {
                    k40Var2 = new k40();
                    this.v = k40Var2;
                }
                g = k40Var2.g(mtVar);
                if (g == null) {
                    g = new l40();
                    k40Var2.l(mtVar, g);
                }
                ((l40) g).j(new ou0(iyVar));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        k40Var = this.v;
        if (k40Var != null) {
        }
        k40Var2 = this.v;
        if (k40Var2 == null) {
        }
        g = k40Var2.g(mtVar);
        if (g == null) {
        }
        ((l40) g).j(new ou0(iyVar));
    }

    public abstract int U(c2 c2Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(final gc0 gc0Var, final long j, final long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        iy iyVar;
        int i;
        char c2;
        long j6;
        w00 f0;
        a90 snapshotObserver;
        k40 k40Var = this.v;
        xg0 xg0Var = this.u;
        if (xg0Var == null) {
            xg0Var = new xg0();
            this.u = xg0Var;
        }
        xg0 xg0Var2 = xg0Var;
        e3 e3Var = d0().r;
        if (e3Var != null && (snapshotObserver = e3Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.b(gc0Var, w, new eq() { // from class: t00
                @Override // defpackage.eq
                public final Object b() {
                    w00 w00Var = w00.this;
                    w00Var.h0().e = false;
                    w00Var.h0().f = j;
                    w00Var.h0().g = j2;
                    pq c3 = gc0Var.e.c();
                    if (c3 != null) {
                        c3.invoke(w00Var.h0());
                    }
                    return fs0.a;
                }
            });
        }
        boolean j0 = j0();
        l40 l40Var = xg0Var2.e;
        l40 l40Var2 = xg0Var2.f;
        int i2 = xg0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = xg0Var2.d[i3];
            if (b == 3) {
                mt mtVar = xg0Var2.b[i3];
                mtVar.getClass();
                l40Var2.j(mtVar);
            } else if (b != 0 && k40Var != null) {
                mt mtVar2 = xg0Var2.b[i3];
                mtVar2.getClass();
                l40 l40Var3 = (l40) k40Var.j(mtVar2);
                if (l40Var3 != null) {
                    l40Var.i(l40Var3);
                }
            }
        }
        int i4 = xg0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = xg0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                mt[] mtVarArr = xg0Var2.b;
                mtVarArr[i6 - i5] = mtVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = xg0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            xg0Var2.b[i8] = null;
        }
        xg0Var2.a -= i5;
        w00 f02 = f0();
        Object[] objArr = l40Var2.b;
        long[] jArr = l40Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            mt mtVar3 = (mt) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            w00 w00Var = f02 == null ? this : f02;
                            i = i9;
                            w00 w00Var2 = w00Var;
                            while (true) {
                                xg0 xg0Var3 = w00Var2.u;
                                if ((xg0Var3 == null || o7.Y(xg0Var3.b, mtVar3) < 0) && (f0 = w00Var2.f0()) != null) {
                                    w00Var2 = f0;
                                }
                            }
                            k40 k40Var2 = w00Var2.v;
                            l40 l40Var4 = k40Var2 != null ? (l40) k40Var2.j(mtVar3) : null;
                            if (l40Var4 != null) {
                                w00Var.m0(l40Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        l40Var2.b();
        Object[] objArr2 = l40Var.b;
        long[] jArr2 = l40Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (iyVar = (iy) ((ou0) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (j0) {
                                iyVar.K(false);
                            } else {
                                iyVar.M(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        l40Var.b();
    }

    public final void W(v00 v00Var) {
        if (this.s) {
            return;
        }
        pq c = v00Var.c();
        long j = 9223372034707292159L;
        if (c == null) {
            o0();
            this.k = null;
            this.l = null;
            this.m = null;
            u00 u00Var = this.j;
            if (u00Var != null) {
                u00Var.e = false;
            }
            if (u00Var != null) {
                u00Var.f = 9223372034707292159L;
                return;
            }
            return;
        }
        this.l = null;
        this.m = null;
        boolean z = this.k != c;
        long j2 = 0;
        if (!z && h0().e) {
            wx b0 = b0();
            j = kw.N(b0.a(0L));
            j2 = b0.B();
            z = (xv.a(j, h0().f) && ew.a(j2, h0().g)) ? false : true;
        }
        long j3 = j2;
        long j4 = j;
        if (z) {
            gc0 gc0Var = this.n;
            if (gc0Var != null) {
                gc0Var.e = v00Var;
            } else {
                gc0Var = new gc0(v00Var, this, null);
                this.n = gc0Var;
            }
            V(gc0Var, j4, j3);
            this.k = v00Var.c();
        }
    }

    public final int X(c2 c2Var) {
        int U;
        if (!c0() || (U = U(c2Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = c2Var instanceof mt0;
        long j = this.i;
        return U + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    public abstract w00 Y();

    public abstract wx b0();

    public abstract boolean c0();

    public abstract iy d0();

    public abstract v00 e0();

    public abstract w00 f0();

    public abstract long g0();

    public abstract xx getLayoutDirection();

    @Override // defpackage.g30
    public final void h(boolean z) {
        w00 f0 = f0();
        iy d0 = f0 != null ? f0.d0() : null;
        if (lw.i(d0, d0())) {
            this.p = z;
            return;
        }
        if ((d0 != null ? d0.I.c : null) != fy.g) {
            if ((d0 != null ? d0.I.c : null) != fy.h) {
                return;
            }
        }
        this.p = z;
    }

    public final u00 h0() {
        u00 u00Var = this.j;
        if (u00Var != null) {
            return u00Var;
        }
        u00 u00Var2 = new u00(this);
        this.j = u00Var2;
        return u00Var2;
    }

    public boolean j0() {
        return false;
    }

    public final v00 k0(int i, int i2, Map map, l lVar, pq pqVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cv.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new v00(i, i2, map, lVar, pqVar, this);
    }

    public v00 l0(int i, int i2, Map map, pq pqVar) {
        return k0(i, i2, map, null, pqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(l40 l40Var) {
        iy iyVar;
        Object[] objArr = l40Var.b;
        long[] jArr = l40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (iyVar = (iy) ((ou0) objArr[(i << 3) + i3]).get()) != null) {
                        if (j0()) {
                            iyVar.K(false);
                        } else {
                            iyVar.M(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void n0();

    public final void o0() {
        xg0 xg0Var = this.u;
        if (xg0Var != null) {
            int i = xg0Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                xg0Var.b[i2] = null;
                xg0Var.c[i2] = Float.NaN;
                xg0Var.d[i2] = 0;
            }
            xg0Var.a = 0;
        }
        k40 k40Var = this.v;
        if (k40Var == null) {
            return;
        }
        Object[] objArr = k40Var.c;
        long[] jArr = k40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            m0((l40) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        k40Var.a();
    }

    public boolean p() {
        return d0().B();
    }
}
