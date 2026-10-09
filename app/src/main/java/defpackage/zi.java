package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zi extends in0 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public g40 e;
    public Object f;
    public int g;

    public zi(long j) {
        super(j);
        g40 g40Var = n60.a;
        g40Var.getClass();
        this.e = g40Var;
        this.f = h;
    }

    @Override // defpackage.in0
    public final void a(in0 in0Var) {
        in0Var.getClass();
        zi ziVar = (zi) in0Var;
        this.e = ziVar.e;
        this.f = ziVar.f;
        this.g = ziVar.g;
    }

    @Override // defpackage.in0
    public final in0 b(long j) {
        return new zi(j);
    }

    public final boolean c(aj ajVar, ql0 ql0Var) {
        boolean z;
        boolean z2;
        Object obj = xl0.c;
        synchronized (obj) {
            z = true;
            if (this.c == ql0Var.g()) {
                if (this.d == ql0Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(ajVar, ql0Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = ql0Var.g();
            this.d = ql0Var.h();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [zi] */
    /* JADX WARN: Type inference failed for: r13v5, types: [in0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [in0, java.lang.Object] */
    public final int d(aj ajVar, ql0 ql0Var) {
        g40 g40Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? g;
        synchronized (xl0.c) {
            g40Var = this.e;
        }
        int i5 = 7;
        if (g40Var.e == 0) {
            return 7;
        }
        t40 a = dm0.a();
        Object[] objArr3 = a.e;
        int i6 = a.g;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((fr) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = g40Var.b;
            int[] iArr = g40Var.c;
            long[] jArr3 = g40Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                gn0 gn0Var = (gn0) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (gn0Var instanceof aj) {
                                        aj ajVar2 = (aj) gn0Var;
                                        g = ajVar2.g((zi) xl0.g(ajVar2.g, ql0Var), ql0Var, z, ajVar2.f);
                                        g40 g40Var2 = g.e;
                                        Object[] objArr5 = g40Var2.b;
                                        long[] jArr4 = g40Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((gn0) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        g = xl0.g(gn0Var.a(), ql0Var);
                                    }
                                    i = (((i * 31) + System.identityHashCode(g)) * 31) + Long.hashCode(g.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = a.e;
            int i18 = a.g;
            for (int i19 = 0; i19 < i18; i19++) {
                ((fr) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = a.e;
            int i20 = a.g;
            for (int i21 = 0; i21 < i20; i21++) {
                ((fr) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
