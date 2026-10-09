package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class xl0 {
    public static final zh0 a;
    public static final v6 b = new v6(8);
    public static final Object c = new Object();
    public static vl0 d;
    public static long e;
    public static final q5 f;
    public static final t4 g;
    public static List h;
    public static List i;
    public static final zr j;
    public static final q7 k;

    static {
        int i2 = 24;
        a = new zh0(i2);
        vl0 vl0Var = vl0.i;
        d = vl0Var;
        e = 2L;
        q5 q5Var = new q5();
        q5Var.c = new long[16];
        q5Var.d = new int[16];
        int[] iArr = new int[16];
        byte b2 = 0;
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        q5Var.e = iArr;
        f = q5Var;
        t4 t4Var = new t4();
        t4Var.b = new int[16];
        t4Var.c = new pu0[16];
        g = t4Var;
        um umVar = um.e;
        h = umVar;
        i = umVar;
        long j2 = e;
        e = 1 + j2;
        zr zrVar = new zr(j2, vl0Var, null, new l0(i2, b2));
        d = d.e(zrVar.b);
        j = zrVar;
        k = new q7(0);
    }

    public static final vl0 a(vl0 vl0Var, long j2, long j3) {
        while (lw.n(j2, j3) < 0) {
            vl0Var = vl0Var.e(j2);
            j2++;
        }
        return vl0Var;
    }

    public static final Object b(pq pqVar) {
        l40 l40Var;
        Object u;
        zr zrVar = j;
        synchronized (c) {
            try {
                l40Var = zrVar.h;
                if (l40Var != null) {
                    k.addAndGet(1);
                }
                u = u(zrVar, pqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l40Var != null) {
            try {
                List list = h;
                ii0 ii0Var = new ii0(l40Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((tq) list.get(i2)).invoke(ii0Var, zrVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            d();
            if (l40Var != null) {
                Object[] objArr = l40Var.b;
                long[] jArr = l40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((gn0) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return u;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        t4 t4Var = g;
        int i2 = t4Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            pu0 pu0Var = ((pu0[]) t4Var.c)[i3];
            Object obj = pu0Var != null ? pu0Var.get() : null;
            if (obj != null && o((gn0) obj)) {
                if (i4 != i3) {
                    ((pu0[]) t4Var.c)[i4] = pu0Var;
                    int[] iArr = (int[]) t4Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((pu0[]) t4Var.c)[i5] = null;
            ((int[]) t4Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            t4Var.a = i4;
        }
    }

    public static final ql0 e(ql0 ql0Var, pq pqVar, boolean z) {
        boolean z2 = ql0Var instanceof o40;
        if (z2 || ql0Var == null) {
            return new ar0(z2 ? (o40) ql0Var : null, pqVar, null, false, z);
        }
        return new br0(ql0Var, pqVar, false, z);
    }

    public static final in0 f(in0 in0Var) {
        in0 r;
        ql0 h2 = h();
        in0 r2 = r(in0Var, h2.g(), h2.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            ql0 h3 = h();
            r = r(in0Var, h3.g(), h3.d());
        }
        if (r != null) {
            return r;
        }
        q();
        throw null;
    }

    public static final in0 g(in0 in0Var, ql0 ql0Var) {
        in0 r;
        in0 r2 = r(in0Var, ql0Var.g(), ql0Var.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            r = r(in0Var, ql0Var.g(), ql0Var.d());
        }
        if (r != null) {
            return r;
        }
        q();
        throw null;
    }

    public static final ql0 h() {
        ql0 ql0Var = (ql0) b.n();
        return ql0Var == null ? j : ql0Var;
    }

    public static final pq i(pq pqVar, pq pqVar2, boolean z) {
        if (!z) {
            pqVar2 = null;
        }
        return (pqVar == null || pqVar2 == null || pqVar == pqVar2) ? pqVar == null ? pqVar2 : pqVar : new wl0(pqVar, pqVar2, 0);
    }

    public static final pq j(pq pqVar, pq pqVar2) {
        return (pqVar == null || pqVar2 == null || pqVar == pqVar2) ? pqVar == null ? pqVar2 : pqVar : new wl0(pqVar, pqVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final in0 k(in0 in0Var, gn0 gn0Var) {
        in0 a2 = gn0Var.a();
        long j2 = e;
        q5 q5Var = f;
        if (q5Var.a > 0) {
            j2 = ((long[]) q5Var.c)[0];
        }
        long j3 = j2 - 1;
        in0 in0Var2 = null;
        in0 in0Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && lw.n(j4, j3) <= 0 && !vl0.i.c(j4)) {
                if (in0Var3 == null) {
                    in0Var3 = a2;
                } else if (lw.n(a2.a, in0Var3.a) >= 0) {
                    in0Var2 = in0Var3;
                }
            }
            a2 = a2.b;
        }
        if (in0Var2 != null) {
            in0Var2.a = Long.MAX_VALUE;
            return in0Var2;
        }
        in0 b2 = in0Var.b(Long.MAX_VALUE);
        b2.b = gn0Var.a();
        gn0Var.c(b2);
        return b2;
    }

    public static final void l(ql0 ql0Var, gn0 gn0Var) {
        ql0Var.t(ql0Var.h() + 1);
        pq i2 = ql0Var.i();
        if (i2 != null) {
            i2.invoke(gn0Var);
        }
    }

    public static final HashMap m(long j2, o40 o40Var, vl0 vl0Var) {
        long[] jArr;
        vl0 vl0Var2;
        long[] jArr2;
        vl0 vl0Var3;
        int i2;
        int i3;
        in0 r;
        l40 x = o40Var.x();
        if (x != null) {
            long g2 = o40Var.g();
            vl0 d2 = o40Var.d().e(g2).d(o40Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                gn0 gn0Var = (gn0) objArr[(i4 << 3) + i7];
                                in0 a2 = gn0Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                in0 r2 = r(a2, j2, vl0Var);
                                if (r2 == null || (r = r(a2, g2, d2)) == null || r2.equals(r)) {
                                    vl0Var3 = d2;
                                } else {
                                    vl0Var3 = d2;
                                    in0 r3 = r(a2, g2, o40Var.d());
                                    if (r3 == null) {
                                        q();
                                        throw null;
                                    }
                                    in0 b2 = gn0Var.b(r, r2, r3);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(r2, b2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                vl0Var3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = vl0Var3;
                        }
                        jArr = jArr3;
                        vl0Var2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        vl0Var2 = d2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    d2 = vl0Var2;
                }
            }
        }
        return null;
    }

    public static final in0 n(in0 in0Var, hn0 hn0Var, ql0 ql0Var, in0 in0Var2) {
        in0 k2;
        if (ql0Var.f()) {
            ql0Var.n(hn0Var);
        }
        long g2 = ql0Var.g();
        if (in0Var2.a == g2) {
            return in0Var2;
        }
        synchronized (c) {
            k2 = k(in0Var, hn0Var);
        }
        k2.a = g2;
        ql0Var.n(hn0Var);
        return k2;
    }

    public static final boolean o(gn0 gn0Var) {
        in0 in0Var;
        long j2 = e;
        q5 q5Var = f;
        if (q5Var.a > 0) {
            j2 = ((long[]) q5Var.c)[0];
        }
        in0 in0Var2 = null;
        in0 in0Var3 = null;
        int i2 = 0;
        for (in0 a2 = gn0Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (lw.n(j3, j2) >= 0) {
                    i2++;
                } else if (in0Var2 == null) {
                    i2++;
                    in0Var2 = a2;
                } else {
                    if (lw.n(a2.a, in0Var2.a) < 0) {
                        in0Var = in0Var2;
                        in0Var2 = a2;
                    } else {
                        in0Var = a2;
                    }
                    if (in0Var3 == null) {
                        in0Var3 = gn0Var.a();
                        in0 in0Var4 = in0Var3;
                        while (true) {
                            if (in0Var3 == null) {
                                in0Var3 = in0Var4;
                                break;
                            }
                            if (lw.n(in0Var3.a, j2) >= 0) {
                                break;
                            }
                            if (lw.n(in0Var4.a, in0Var3.a) < 0) {
                                in0Var4 = in0Var3;
                            }
                            in0Var3 = in0Var3.b;
                        }
                    }
                    in0Var2.a = 0L;
                    in0Var2.a(in0Var3);
                    in0Var2 = in0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(gn0 gn0Var) {
        if (o(gn0Var)) {
            t4 t4Var = g;
            int i2 = t4Var.a;
            int identityHashCode = System.identityHashCode(gn0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = t4Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) t4Var.b)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        pu0 pu0Var = ((pu0[]) t4Var.c)[i6];
                        if (gn0Var != (pu0Var != null ? pu0Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) t4Var.b)[i8] == identityHashCode; i8--) {
                                pu0 pu0Var2 = ((pu0[]) t4Var.c)[i8];
                                if ((pu0Var2 != null ? pu0Var2.get() : null) == gn0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = t4Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(t4Var.a + 1);
                                    break;
                                } else {
                                    if (((int[]) t4Var.b)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    pu0 pu0Var3 = ((pu0[]) t4Var.c)[i6];
                                    if ((pu0Var3 != null ? pu0Var3.get() : null) == gn0Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            pu0[] pu0VarArr = (pu0[]) t4Var.c;
            int length = pu0VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                pu0[] pu0VarArr2 = new pu0[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(pu0VarArr, i10, pu0VarArr2, i12, i2 - i10);
                System.arraycopy((pu0[]) t4Var.c, 0, pu0VarArr2, 0, i10);
                o7.P((int[]) t4Var.b, iArr, i12, i10, i2);
                o7.S((int[]) t4Var.b, iArr, 0, i10, 6);
                t4Var.c = pu0VarArr2;
                t4Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(pu0VarArr, i10, pu0VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) t4Var.b;
                o7.P(iArr2, iArr2, i13, i10, i2);
            }
            ((pu0[]) t4Var.c)[i10] = new pu0(gn0Var);
            ((int[]) t4Var.b)[i10] = identityHashCode;
            t4Var.a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final in0 r(in0 in0Var, long j2, vl0 vl0Var) {
        in0 in0Var2 = null;
        while (in0Var != null) {
            long j3 = in0Var.a;
            if (j3 != 0 && lw.n(j3, j2) <= 0 && !vl0Var.c(j3) && (in0Var2 == null || lw.n(in0Var2.a, in0Var.a) < 0)) {
                in0Var2 = in0Var;
            }
            in0Var = in0Var.b;
        }
        if (in0Var2 != null) {
            return in0Var2;
        }
        return null;
    }

    public static final in0 s(in0 in0Var, gn0 gn0Var) {
        in0 r;
        ql0 h2 = h();
        pq e2 = h2.e();
        if (e2 != null) {
            e2.invoke(gn0Var);
        }
        in0 r2 = r(in0Var, h2.g(), h2.d());
        if (r2 != null) {
            return r2;
        }
        synchronized (c) {
            ql0 h3 = h();
            in0 a2 = gn0Var.a();
            a2.getClass();
            r = r(a2, h3.g(), h3.d());
            if (r == null) {
                q();
                throw null;
            }
        }
        return r;
    }

    public static final void t(int i2) {
        q5 q5Var = f;
        int i3 = ((int[]) q5Var.e)[i2];
        q5Var.e(i3, q5Var.a - 1);
        q5Var.a--;
        long[] jArr = (long[]) q5Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (lw.n(jArr[i5], j2) <= 0) {
                break;
            }
            q5Var.e(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) q5Var.c;
        int i6 = q5Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < q5Var.a && lw.n(jArr2[i7], jArr2[i8]) < 0) {
                if (lw.n(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                q5Var.e(i7, i3);
                i3 = i7;
            } else {
                if (lw.n(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                q5Var.e(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) q5Var.e)[i2] = q5Var.b;
        q5Var.b = i2;
    }

    public static final Object u(zr zrVar, pq pqVar) {
        long j2 = zrVar.b;
        Object invoke = pqVar.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        vl0 b2 = d.b(j2);
        d = b2;
        zrVar.b = j3;
        zrVar.a = b2;
        zrVar.g = 0;
        zrVar.h = null;
        zrVar.o();
        d = d.e(j3);
        return invoke;
    }

    public static final void v(ql0 ql0Var) {
        Long valueOf;
        if (d.c(ql0Var.g())) {
            return;
        }
        long g2 = ql0Var.g();
        boolean z = ql0Var.c;
        o40 o40Var = ql0Var instanceof o40 ? (o40) ql0Var : null;
        String valueOf2 = o40Var != null ? Boolean.valueOf(o40Var.m) : "read-only";
        synchronized (c) {
            q5 q5Var = f;
            valueOf = Long.valueOf(q5Var.a > 0 ? ((long[]) q5Var.c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + g2 + ", disposed=" + z + ", applied=" + valueOf2 + ", lowestPin=" + valueOf).toString());
    }

    public static final in0 w(in0 in0Var, gn0 gn0Var, ql0 ql0Var) {
        in0 r;
        in0 r2;
        if (ql0Var.f()) {
            ql0Var.n(gn0Var);
        }
        long g2 = ql0Var.g();
        in0 r3 = r(in0Var, g2, ql0Var.d());
        if (r3 == null) {
            synchronized (c) {
                ql0 h2 = h();
                in0 a2 = gn0Var.a();
                a2.getClass();
                r2 = r(a2, h2.g(), h2.d());
                if (r2 == null) {
                    q();
                    throw null;
                }
            }
            r3 = r2;
        }
        if (r3.a == ql0Var.g()) {
            return r3;
        }
        synchronized (c) {
            r = r(gn0Var.a(), g2, ql0Var.d());
            if (r == null) {
                q();
                throw null;
            }
            if (r.a != g2) {
                in0 k2 = k(r, gn0Var);
                k2.a(r);
                k2.a = ql0Var.g();
                r = k2;
            }
        }
        ql0Var.n(gn0Var);
        return r;
    }
}
