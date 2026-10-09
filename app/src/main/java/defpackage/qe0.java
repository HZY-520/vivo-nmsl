package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qe0 {
    public final vv a;
    public final e3 b;
    public final t4 c;
    public final mq0 d;
    public final h40 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public u2 i;
    public long j;
    public final f5 k;
    public final j40 l;

    public qe0(y30 y30Var, e3 e3Var) {
        this.a = y30Var;
        this.b = e3Var;
        t4 t4Var = new t4();
        t4Var.b = new long[192];
        t4Var.c = new long[192];
        this.c = t4Var;
        this.d = new mq0();
        this.e = new h40();
        this.j = -1L;
        this.k = new f5(11, this);
        this.l = new j40();
    }

    public static boolean c(d60 d60Var) {
        y80 y80Var = d60Var.X;
        return (y80Var == null || v10.j(((hs) y80Var).b())) ? false : true;
    }

    public static long f(iy iyVar) {
        y50 y50Var = iyVar.H;
        d60 d60Var = y50Var.d;
        long j = 0;
        for (d60 d60Var2 = y50Var.c; d60Var2 != null && d60Var2 != d60Var; d60Var2 = d60Var2.A) {
            if (c(d60Var2)) {
                return 9223372034707292159L;
            }
            j = xv.c(j, d60Var2.J);
        }
        return j;
    }

    public static void i(iy iyVar) {
        if (!iyVar.g || c(iyVar.H.d)) {
            return;
        }
        iyVar.g = false;
        if (iyVar.i) {
            iyVar.h = f(iyVar);
            iyVar.i = false;
        }
        if (xv.a(iyVar.h, 9223372034707292159L)) {
            return;
        }
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            i((iy) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        u2 u2Var = this.i;
        if (u2Var != null) {
            this.b.removeCallbacks(u2Var);
            this.i = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f;
        boolean z2 = z || this.g;
        t4 t4Var = this.c;
        mq0 mq0Var = this.d;
        if (z) {
            this.f = false;
            h40 h40Var = this.e;
            Object[] objArr = h40Var.a;
            int i = h40Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((eq) objArr[i2]).b();
            }
            long[] jArr = (long[]) t4Var.b;
            int i3 = t4Var.a;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j5 = jArr[i4 + 2];
                if ((((int) (j5 >> 60)) & 1) != 0) {
                    long j6 = jArr[i4];
                    long j7 = jArr[i4 + 1];
                }
            }
            long[] jArr2 = (long[]) t4Var.b;
            int i5 = t4Var.a;
            for (int i6 = 0; i6 < jArr2.length - 2 && i6 < i5; i6 += 3) {
                int i7 = i6 + 2;
                jArr2[i7] = jArr2[i7] & (-1152921504606846977L);
            }
        }
        if (this.g) {
            this.g = false;
            j = 128;
            long j8 = mq0Var.c;
            y30 y30Var = mq0Var.a;
            Object[] objArr2 = y30Var.c;
            long[] jArr3 = y30Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                c = 7;
                j2 = 255;
                while (true) {
                    long j9 = jArr3[i8];
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j9 & 255) < 128) {
                            }
                            j9 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (z2) {
                    long j10 = mq0Var.c;
                }
                if (this.h) {
                    this.h = false;
                    long[] jArr4 = (long[]) t4Var.b;
                    int i11 = t4Var.a;
                    long[] jArr5 = (long[]) t4Var.c;
                    int i12 = 0;
                    for (int i13 = 0; i13 < jArr4.length - 2 && i12 < jArr5.length - 2 && i13 < i11; i13 += 3) {
                        int i14 = i13 + 2;
                        if (jArr4[i14] != pe0.a) {
                            jArr5[i12] = jArr4[i13];
                            jArr5[i12 + 1] = jArr4[i13 + 1];
                            jArr5[i12 + 2] = jArr4[i14];
                            i12 += 3;
                        }
                    }
                    t4Var.a = i12;
                    t4Var.b = jArr5;
                    t4Var.c = jArr4;
                }
                j4 = mq0Var.b;
                if (j4 <= currentTimeMillis) {
                    y30 y30Var2 = mq0Var.a;
                    Object[] objArr3 = y30Var2.c;
                    long[] jArr6 = y30Var2.a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr6[i15];
                            if ((((~j11) << c) & j11 & j3) != j3) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j) {
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length2) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                    j4 = -1;
                    mq0Var.b = -1L;
                }
                if (j4 <= 0) {
                    j();
                    return;
                }
                return;
            }
        } else {
            j = 128;
        }
        c = 7;
        j2 = 255;
        j3 = -9187201950435737472L;
        if (z2) {
        }
        if (this.h) {
        }
        j4 = mq0Var.b;
        if (j4 <= currentTimeMillis) {
        }
        if (j4 <= 0) {
        }
    }

    public final long b(iy iyVar) {
        if (iyVar.k == -4) {
            return 9223372034707292159L;
        }
        return (((int) r4) & 4294967295L) | (((int) (((long[]) this.c.b)[d(iyVar)] >> 32)) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(iy iyVar) {
        int i = iyVar.k;
        if (i != -4) {
            int i2 = iyVar.f;
            t4 t4Var = this.c;
            long[] jArr = (long[]) t4Var.b;
            if (i < 0 || i >= t4Var.a - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = t4Var.a;
                for (int i5 = 0; i5 < i4 - 2; i5 += 3) {
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                }
            }
            if (i == -4) {
                cv.a("LayoutNode " + iyVar.f + " not found in RectList");
            }
            iyVar.k = i;
            return i;
        }
        i = -4;
        if (i == -4) {
        }
        iyVar.k = i;
        return i;
    }

    public final void e(iy iyVar) {
        iyVar.g = true;
        y50 y50Var = iyVar.H;
        d60 d60Var = y50Var.d;
        a20 a20Var = iyVar.I.o;
        int M = a20Var.M();
        float L = a20Var.L();
        j40 j40Var = this.l;
        j40Var.a = 0.0f;
        j40Var.b = 0.0f;
        j40Var.c = M;
        j40Var.d = L;
        while (true) {
            if (d60Var == null) {
                break;
            }
            iy iyVar2 = d60Var.y;
            if (d60Var == iyVar2.H.d && !iyVar2.g) {
                if (!xv.a(b(iyVar2), 9223372034707292159L)) {
                    j40Var.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            y80 y80Var = d60Var.X;
            if (y80Var != null) {
                float[] b = ((hs) y80Var).b();
                if (!v10.j(b)) {
                    u10.z(b, j40Var);
                }
            }
            long j = d60Var.J;
            j40Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            d60Var = d60Var.A;
        }
        int i = (int) j40Var.a;
        int i2 = (int) j40Var.b;
        int i3 = (int) j40Var.c;
        int i4 = (int) j40Var.d;
        int i5 = iyVar.f;
        int i6 = iyVar.k;
        t4 t4Var = this.c;
        if (i6 != -4) {
            int d = d(iyVar);
            long[] jArr = (long[]) t4Var.b;
            jArr[d] = (i << 32) | (i2 & 4294967295L);
            jArr[d + 1] = (4294967295L & i4) | (i3 << 32);
            int i7 = d + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            iy n = iyVar.n();
            iyVar.k = t4Var.a(i5, i, i2, i3, i4, n != null ? n.f : -1, n != null ? d(n) : -4, y50Var.c(1024), y50Var.c(16), this.d.a.a(i5));
        }
        iyVar.j = false;
        this.f = true;
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i8 = t.g;
        for (int i9 = 0; i9 < i8; i9++) {
            iy iyVar3 = (iy) objArr[i9];
            if (iyVar3.C()) {
                e(iyVar3);
            }
        }
    }

    public final void g(iy iyVar) {
        long j;
        boolean C = iyVar.C();
        y50 y50Var = iyVar.H;
        if (C && iyVar.j) {
            iy n = iyVar.n();
            if (n == null || n.g) {
                j = n == null ? 0L : 9223372034707292159L;
            } else {
                if (n.i) {
                    n.i = false;
                    n.h = f(n);
                }
                j = n.h;
            }
            d60 d60Var = y50Var.d;
            if (xv.a(j, 9223372034707292159L) || c(d60Var)) {
                e(iyVar);
            } else if (iyVar.g) {
                e(iyVar);
                i(iyVar);
            } else {
                long c = xv.c(j, d60Var.J);
                a20 a20Var = iyVar.I.o;
                int M = a20Var.M();
                int L = a20Var.L();
                int i = iyVar.k;
                t4 t4Var = this.c;
                if (i != -4) {
                    int d = d(iyVar);
                    if (n != null) {
                        int d2 = d(n);
                        int i2 = (int) (c >> 32);
                        int i3 = (int) (c & 4294967295L);
                        long[] jArr = (long[]) t4Var.b;
                        long j2 = jArr[d2];
                        int i4 = ((int) (j2 >> 32)) + i2;
                        int i5 = ((int) j2) + i3;
                        int i6 = L + i5;
                        long j3 = jArr[d];
                        int i7 = i4 - ((int) (j3 >> 32));
                        int i8 = i5 - ((int) j3);
                        int i9 = d + 2;
                        long j4 = jArr[i9];
                        jArr[d] = (i5 & 4294967295L) | (i4 << 32);
                        jArr[d + 1] = ((M + i4) << 32) | (i6 & 4294967295L);
                        jArr[i9] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i7 != 0 || i8 != 0) {
                            t4Var.b(j4, d, i7, i8);
                        }
                    } else {
                        int d3 = d(iyVar);
                        int i10 = (int) (c >> 32);
                        int i11 = (int) (c & 4294967295L);
                        long[] jArr2 = (long[]) t4Var.b;
                        long j5 = jArr2[d3];
                        jArr2[d3] = (i10 << 32) | (i11 & 4294967295L);
                        jArr2[d3 + 1] = ((L + i11) & 4294967295L) | ((M + i10) << 32);
                        int i12 = d3 + 2;
                        long j6 = jArr2[i12];
                        jArr2[i12] = (((j6 >> 63) & 1) << 60) | j6;
                        int i13 = i10 - ((int) (j5 >> 32));
                        int i14 = i11 - ((int) j5);
                        if (i13 != 0 || i14 != 0) {
                            t4Var.b(j6, d3, i13, i14);
                        }
                    }
                } else {
                    int i15 = iyVar.f;
                    boolean c2 = y50Var.c(1024);
                    boolean c3 = y50Var.c(16);
                    boolean a = this.d.a.a(i15);
                    if (n != null) {
                        int i16 = n.f;
                        int d4 = d(n);
                        int i17 = (int) (c >> 32);
                        int i18 = (int) (c & 4294967295L);
                        int i19 = i15 & 33554431;
                        long[] jArr3 = (long[]) t4Var.b;
                        if ((((int) jArr3[d4 + 2]) & 33554431) != (33554431 & i16)) {
                            cv.a("Inserted child " + i19 + " without valid parent index or parent " + i16 + " not found");
                        }
                        long j7 = jArr3[d4];
                        int i20 = ((int) (j7 >> 32)) + i17;
                        int i21 = ((int) j7) + i18;
                        iyVar.k = t4Var.a(i19, i20, i21, i20 + M, i21 + L, i16, d4, c2, c3, a);
                    } else {
                        int i22 = (int) (c >> 32);
                        int i23 = (int) (c & 4294967295L);
                        iyVar.k = t4Var.a(i15, i22, i23, i22 + M, i23 + L, -1, -4, c2, c3, a);
                    }
                }
            }
            iyVar.j = false;
            this.f = true;
            j();
        }
    }

    public final void h(iy iyVar) {
        if (iyVar.k != -4) {
            int d = d(iyVar);
            long[] jArr = (long[]) this.c.b;
            jArr[d] = -1;
            jArr[d + 1] = -1;
            jArr[d + 2] = pe0.a;
            iyVar.k = -4;
            iyVar.j = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        u2 u2Var = this.i;
        boolean z = u2Var != null;
        long j = this.d.b;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            e3 e3Var = this.b;
            if (u2Var != null) {
                e3Var.removeCallbacks(u2Var);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.j = max;
            u2 u2Var2 = new u2(this.k, 1);
            e3Var.postDelayed(u2Var2, max - currentTimeMillis);
            this.i = u2Var2;
        }
    }
}
