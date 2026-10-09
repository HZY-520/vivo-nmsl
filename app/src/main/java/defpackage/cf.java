package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cf implements we {
    public final xe e;
    public final v6 f;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final n40 i;
    public final ll0 j;
    public final k40 k;
    public final l40 l;
    public final l40 m;
    public final k40 n;
    public final ta o;
    public final ta p;
    public final k40 q;
    public k40 r;
    public boolean s;
    public cf t;
    public int u;
    public final i2 v;
    public final bf0 w;
    public final gr x;
    public int y;

    public cf(xe xeVar, v6 v6Var) {
        this.e = xeVar;
        this.f = v6Var;
        n40 n40Var = new n40(new l40());
        this.i = n40Var;
        ll0 ll0Var = new ll0();
        if (((Boolean) le0.z.get()).booleanValue()) {
            ll0Var.o = new y30();
        }
        this.j = ll0Var;
        this.k = u10.i();
        this.l = new l40();
        this.m = new l40();
        this.n = u10.i();
        ta taVar = new ta();
        this.o = taVar;
        ta taVar2 = new ta();
        this.p = taVar2;
        this.q = u10.i();
        this.r = u10.i();
        i2 i2Var = new i2(xeVar);
        this.v = i2Var;
        this.w = new bf0();
        this.x = new gr(v6Var, xeVar, nl0.a(ll0Var), n40Var, taVar, taVar2, i2Var, this);
    }

    public final void a() {
        this.g.set(null);
        this.o.u.L();
        this.p.u.L();
        n40 n40Var = this.i;
        if (n40Var.e.g()) {
            return;
        }
        bf0 bf0Var = this.w;
        this.x.getClass();
        try {
            bf0Var.e(n40Var);
            bf0Var.b();
        } finally {
            bf0Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object g = this.k.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof l40;
        sw swVar = sw.e;
        l40 l40Var = this.l;
        l40 l40Var2 = this.m;
        k40 k40Var = this.q;
        if (!z2) {
            de0 de0Var = (de0) g;
            if (u10.C(k40Var, obj, de0Var) || de0Var.b(obj) == swVar) {
                return;
            }
            if (de0Var.g == null || z) {
                l40Var.a(de0Var);
                return;
            } else {
                l40Var2.a(de0Var);
                return;
            }
        }
        l40 l40Var3 = (l40) g;
        Object[] objArr = l40Var3.b;
        long[] jArr = l40Var3.a;
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
                    if ((255 & j) < 128) {
                        de0 de0Var2 = (de0) objArr[(i << 3) + i3];
                        if (!u10.C(k40Var, obj, de0Var2) && de0Var2.b(obj) != swVar) {
                            if (de0Var2.g == null || z) {
                                l40Var.a(de0Var2);
                            } else {
                                l40Var2.a(de0Var2);
                            }
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

    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof ii0;
        k40 k40Var = this.n;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            l40 l40Var = ((ii0) set).e;
            Object[] objArr = l40Var.b;
            long[] jArr10 = l40Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c3 = c4;
                                if (obj2 instanceof de0) {
                                    ((de0) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object g = k40Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof l40) {
                                            l40 l40Var2 = (l40) g;
                                            Object[] objArr2 = l40Var2.b;
                                            long[] jArr11 = l40Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((aj) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            b((aj) g, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof de0) {
                    ((de0) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object g2 = k40Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof l40) {
                            l40 l40Var3 = (l40) g2;
                            Object[] objArr3 = l40Var3.b;
                            long[] jArr13 = l40Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((aj) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((aj) g2, z);
                        }
                    }
                }
            }
        }
        k40 k40Var2 = this.k;
        l40 l40Var4 = this.l;
        if (z) {
            l40 l40Var5 = this.m;
            if (l40Var5.h()) {
                long[] jArr14 = k40Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = k40Var2.b[i18];
                                    Object obj5 = k40Var2.c[i18];
                                    if (obj5 instanceof l40) {
                                        l40 l40Var6 = (l40) obj5;
                                        Object[] objArr4 = l40Var6.b;
                                        long[] jArr15 = l40Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            de0 de0Var = (de0) objArr5[i22];
                                                            if (l40Var5.c(de0Var) || l40Var4.c(de0Var)) {
                                                                l40Var6.l(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = l40Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        de0 de0Var2 = (de0) obj5;
                                        z2 = l40Var5.c(de0Var2) || l40Var4.c(de0Var2);
                                    }
                                    if (z2) {
                                        k40Var2.k(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                l40Var5.b();
                h();
                return;
            }
        }
        if (l40Var4.h()) {
            long[] jArr17 = k40Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = k40Var2.b[i26];
                                Object obj7 = k40Var2.c[i26];
                                if (obj7 instanceof l40) {
                                    l40 l40Var7 = (l40) obj7;
                                    Object[] objArr6 = l40Var7.b;
                                    long[] jArr18 = l40Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (l40Var4.c((de0) objArr7[i30])) {
                                                            l40Var7.l(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = l40Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = l40Var4.c((de0) obj7);
                                }
                                if (c2) {
                                    k40Var2.k(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            h();
            l40Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                l();
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        bf0 bf0Var = this.w;
                        n40 n40Var = this.i;
                        this.x.getClass();
                        try {
                            bf0Var.e(n40Var);
                            bf0Var.b();
                            bf0Var.a();
                        } catch (Throwable th2) {
                            bf0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void e(ta taVar) {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        int i3;
        ta taVar2 = this.p;
        this.x.getClass();
        bf0 bf0Var = this.w;
        bf0Var.e(this.i);
        try {
            if (taVar.u.N()) {
                try {
                    if (taVar2.u.N()) {
                        bf0Var.b();
                    }
                    return;
                } finally {
                }
            }
            v6 v6Var = this.f;
            Trace.beginSection("Compose:applyChanges");
            try {
                ol0 c2 = nl0.a(this.j).c();
                int i4 = 0;
                try {
                    taVar.P(v6Var, c2, bf0Var, null);
                    c2.e(true);
                    v6Var.w();
                    Trace.endSection();
                    bf0Var.c();
                    t40 t40Var = bf0Var.f;
                    if (t40Var.g != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            Object[] objArr = t40Var.e;
                            int i5 = t40Var.g;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((eq) objArr[i6]).b();
                            }
                            t40Var.g();
                            Trace.endSection();
                        } finally {
                        }
                    }
                    if (this.s) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.s = false;
                            k40 k40Var = this.k;
                            long[] jArr3 = k40Var.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j3 = jArr3[i7];
                                    char c3 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8;
                                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                                        int i10 = i4;
                                        while (i10 < i9) {
                                            if ((j3 & 255) < 128) {
                                                c = c3;
                                                int i11 = (i7 << 3) + i10;
                                                j2 = j4;
                                                Object obj = k40Var.b[i11];
                                                Object obj2 = k40Var.c[i11];
                                                if (obj2 instanceof l40) {
                                                    l40 l40Var = (l40) obj2;
                                                    Object[] objArr2 = l40Var.b;
                                                    long[] jArr4 = l40Var.a;
                                                    int i12 = i8;
                                                    int length2 = jArr4.length - 2;
                                                    if (length2 >= 0) {
                                                        jArr2 = jArr3;
                                                        int i13 = 0;
                                                        while (true) {
                                                            long j5 = jArr4[i13];
                                                            j = j3;
                                                            if ((((~j5) << c) & j5 & j2) != j2) {
                                                                int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                int i15 = 0;
                                                                while (i15 < i14) {
                                                                    if ((j5 & 255) < 128) {
                                                                        i3 = i10;
                                                                        int i16 = (i13 << 3) + i15;
                                                                        if (!((de0) objArr2[i16]).a()) {
                                                                            l40Var.l(i16);
                                                                        }
                                                                    } else {
                                                                        i3 = i10;
                                                                    }
                                                                    j5 >>= i12;
                                                                    i15++;
                                                                    i10 = i3;
                                                                }
                                                                i = i10;
                                                                if (i14 != i12) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i = i10;
                                                            }
                                                            if (i13 == length2) {
                                                                break;
                                                            }
                                                            i13++;
                                                            j3 = j;
                                                            i10 = i;
                                                            i12 = 8;
                                                        }
                                                    } else {
                                                        i = i10;
                                                        jArr2 = jArr3;
                                                        j = j3;
                                                    }
                                                    z = l40Var.g();
                                                } else {
                                                    i = i10;
                                                    jArr2 = jArr3;
                                                    j = j3;
                                                    obj2.getClass();
                                                    z = !((de0) obj2).a();
                                                }
                                                if (z) {
                                                    k40Var.k(i11);
                                                }
                                                i2 = 8;
                                            } else {
                                                i = i10;
                                                jArr2 = jArr3;
                                                j = j3;
                                                c = c3;
                                                j2 = j4;
                                                i2 = i8;
                                            }
                                            j3 = j >> i2;
                                            i8 = i2;
                                            c3 = c;
                                            j4 = j2;
                                            jArr3 = jArr2;
                                            i10 = i + 1;
                                        }
                                        jArr = jArr3;
                                        if (i9 != i8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    jArr3 = jArr;
                                    i4 = 0;
                                }
                            }
                            h();
                            Trace.endSection();
                        } finally {
                        }
                    }
                    try {
                        if (taVar2.u.N()) {
                            bf0Var.b();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    c2.e(false);
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (taVar2.u.N()) {
                    bf0Var.b();
                }
                throw th2;
            } finally {
            }
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                ta taVar = this.p;
                taVar.getClass();
                if (!taVar.u.N()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        bf0 bf0Var = this.w;
                        n40 n40Var = this.i;
                        this.x.getClass();
                        try {
                            bf0Var.e(n40Var);
                            bf0Var.b();
                            bf0Var.a();
                        } catch (Throwable th2) {
                            bf0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        bf0 bf0Var;
        synchronized (this.h) {
            try {
                this.x.v = null;
                if (!this.i.e.g()) {
                    bf0Var = this.w;
                    n40 n40Var = this.i;
                    this.x.getClass();
                    try {
                        bf0Var.e(n40Var);
                        bf0Var.b();
                        bf0Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        bf0Var = this.w;
                        n40 n40Var2 = this.i;
                        this.x.getClass();
                        try {
                            bf0Var.e(n40Var2);
                            bf0Var.b();
                            bf0Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        k40 k40Var = this.n;
        long[] jArr3 = k40Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = k40Var.b[i10];
                            Object obj2 = k40Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof l40;
                            j5 = j8;
                            k40 k40Var2 = this.k;
                            if (z2) {
                                l40 l40Var = (l40) obj2;
                                Object[] objArr = l40Var.b;
                                long[] jArr4 = l40Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!k40Var2.c((aj) objArr[i15])) {
                                                        l40Var.l(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = l40Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !k40Var2.c((aj) obj2);
                            }
                            if (z) {
                                k40Var.k(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        l40 l40Var2 = this.m;
        if (!l40Var2.h()) {
            return;
        }
        Object[] objArr2 = l40Var2.b;
        long[] jArr5 = l40Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((de0) objArr2[i20]).g == null) {
                            l40Var2.l(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void i(be beVar) {
        try {
            synchronized (this.h) {
                k();
                k40 k40Var = this.r;
                this.r = u10.i();
                try {
                    gr grVar = this.x;
                    if (!grVar.e.u.N()) {
                        ue.a("Expected applyChanges() to have been called");
                    }
                    grVar.m(k40Var, beVar);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.i.e.g()) {
                    bf0 bf0Var = this.w;
                    n40 n40Var = this.i;
                    this.x.getClass();
                    try {
                        bf0Var.e(n40Var);
                        bf0Var.b();
                        bf0Var.a();
                    } catch (Throwable th2) {
                        bf0Var.a();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final void j(be beVar) {
        ge0 ge0Var;
        boolean contains;
        o40 C;
        le0 le0Var = (le0) this.e;
        boolean z = this.x.F;
        synchronized (le0Var.c) {
            ge0 ge0Var2 = (ge0) le0Var.u.getValue();
            ge0Var = ge0.f;
            contains = ge0Var2.compareTo(ge0Var) > 0 ? true ^ le0Var.h().contains(this) : true;
        }
        try {
            l lVar = new l(19, this);
            c cVar = new c(6, this, null);
            ql0 h = xl0.h();
            o40 o40Var = h instanceof o40 ? (o40) h : null;
            if (o40Var == null || (C = o40Var.C(lVar, cVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ql0 j = C.j();
                try {
                    i(beVar);
                    synchronized (le0Var.c) {
                        if (((ge0) le0Var.u.getValue()).compareTo(ge0Var) > 0 && !le0Var.h().contains(this)) {
                            le0Var.f.add(this);
                            le0Var.g = null;
                        }
                    }
                    if (!z) {
                        xl0.h().m();
                    }
                    try {
                        synchronized (le0Var.c) {
                            ArrayList arrayList = le0Var.k;
                            if (arrayList.size() > 0) {
                                ((r30) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            d();
                            f();
                            if (z) {
                                return;
                            }
                            xl0.h().m();
                        } catch (Throwable th) {
                            le0Var.m(th, null);
                        }
                    } catch (Throwable th2) {
                        le0Var.m(th2, this);
                    }
                } finally {
                    ql0.q(j);
                }
            } finally {
                le0.a(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (le0Var.c) {
                }
            }
            le0Var.m(th3, this);
        }
    }

    public final void k() {
        Object obj = nh.g;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                ue.b("pending composition has not been applied");
                throw new id();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ue.b("corrupt pendingModifications drain: " + atomicReference);
                throw new id();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void l() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (lw.i(andSet, nh.g)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            ue.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            return;
        }
        ue.b("corrupt pendingModifications drain: " + atomicReference);
        throw new id();
    }

    public final void m(ArrayList arrayList) {
        n40 n40Var = this.i;
        gr grVar = this.x;
        if (arrayList.size() > 0) {
            ((r30) ((k90) arrayList.get(0)).e).getClass();
            ue.a("Check failed");
        }
        try {
            grVar.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    grVar.x(arrayList);
                    grVar.h();
                } catch (Throwable th) {
                    grVar.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!n40Var.e.g()) {
                    bf0 bf0Var = this.w;
                    grVar.getClass();
                    try {
                        bf0Var.e(n40Var);
                        bf0Var.b();
                        bf0Var.a();
                    } catch (Throwable th3) {
                        bf0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final sw n(de0 de0Var, Object obj) {
        cf cfVar;
        int i = de0Var.b;
        if ((i & 2) != 0) {
            de0Var.b = i | 4;
        }
        er erVar = de0Var.c;
        if (erVar == null || !erVar.a()) {
            return sw.e;
        }
        ll0 ll0Var = this.j;
        ll0Var.getClass();
        er erVar2 = de0Var.c;
        if (erVar2 != null && ll0Var.d(q3.c(erVar2))) {
            if (de0Var.d == null) {
                return sw.e;
            }
            sw o = o(de0Var, erVar, obj);
            if (o != sw.e) {
                this.v.getClass();
            }
            return o;
        }
        synchronized (this.h) {
            cfVar = this.t;
        }
        if (cfVar != null) {
            gr grVar = cfVar.x;
            if (grVar.F && grVar.T(de0Var, obj)) {
                return sw.h;
            }
        }
        return sw.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0009, B:6:0x000d, B:8:0x0015, B:10:0x001c, B:13:0x0026, B:15:0x0030, B:20:0x0046, B:22:0x004c, B:26:0x0057, B:31:0x005d, B:32:0x0066, B:35:0x006c, B:36:0x0072, B:38:0x0078, B:40:0x007c, B:43:0x0088, B:45:0x0098, B:47:0x00a4, B:49:0x00ae, B:54:0x00b9, B:60:0x00c1, B:62:0x00c4, B:65:0x00c9, B:90:0x0021), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sw o(de0 de0Var, er erVar, Object obj) {
        ha haVar;
        synchronized (this.h) {
            try {
                cf cfVar = this.t;
                if (cfVar != null) {
                    ll0 ll0Var = this.j;
                    int i = this.u;
                    if (ll0Var.k) {
                        ue.a("Writer is active");
                    }
                    if (i < 0 || i >= ll0Var.f) {
                        ue.a("Invalid group index");
                    }
                    er c = q3.c(erVar);
                    if (ll0Var.d(c)) {
                        int i2 = ll0Var.e[(i * 5) + 3] + i;
                        int i3 = c.a;
                        if (i <= i3 && i3 < i2) {
                            if (cfVar == null) {
                                gr grVar = this.x;
                                if (grVar.F && grVar.T(de0Var, obj)) {
                                    return sw.h;
                                }
                                if (obj == null) {
                                    this.r.l(de0Var, b2.V);
                                } else {
                                    boolean z = obj instanceof aj;
                                    k40 k40Var = this.r;
                                    if (z) {
                                        Object g = k40Var.g(de0Var);
                                        if (g != null) {
                                            if (g instanceof l40) {
                                                l40 l40Var = (l40) g;
                                                Object[] objArr = l40Var.b;
                                                long[] jArr = l40Var.a;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    int i4 = 0;
                                                    loop0: while (true) {
                                                        long j = jArr[i4];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                            for (int i6 = 0; i6 < i5; i6++) {
                                                                if ((j & 255) < 128 && objArr[(i4 << 3) + i6] == b2.V) {
                                                                    break loop0;
                                                                }
                                                                j >>= 8;
                                                            }
                                                            if (i5 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i4 == length) {
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                            } else if (g == b2.V) {
                                            }
                                        }
                                        u10.a(this.r, de0Var, obj);
                                    } else {
                                        k40Var.l(de0Var, b2.V);
                                    }
                                }
                            }
                            if (cfVar == null) {
                                return cfVar.o(de0Var, erVar, obj);
                            }
                            le0 le0Var = (le0) this.e;
                            synchronized (le0Var.c) {
                                if (le0Var.i.h(this)) {
                                    haVar = null;
                                } else {
                                    le0Var.i.b(this);
                                    haVar = le0Var.c();
                                }
                            }
                            if (haVar != null) {
                                ((ja) haVar).resumeWith(fs0.a);
                            }
                            return this.x.F ? sw.g : sw.f;
                        }
                    }
                }
                cfVar = null;
                if (cfVar == null) {
                }
                if (cfVar == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(Object obj) {
        Object g = this.k.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof l40;
        sw swVar = sw.h;
        k40 k40Var = this.q;
        if (!z) {
            de0 de0Var = (de0) g;
            if (de0Var.b(obj) != swVar || (obj instanceof aj)) {
                return;
            }
            u10.a(k40Var, obj, de0Var);
            return;
        }
        l40 l40Var = (l40) g;
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
                    if ((255 & j) < 128) {
                        de0 de0Var2 = (de0) objArr[(i << 3) + i3];
                        if (de0Var2.b(obj) == swVar && !(obj instanceof aj)) {
                            u10.a(k40Var, obj, de0Var2);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(Set set) {
        boolean z = set instanceof ii0;
        k40 k40Var = this.n;
        k40 k40Var2 = this.k;
        if (z) {
            l40 l40Var = ((ii0) set).e;
            Object[] objArr = l40Var.b;
            long[] jArr = l40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (k40Var2.c(obj) || k40Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (k40Var2.c(obj2) || k40Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.h) {
            k();
            try {
                k40 k40Var = this.r;
                this.r = u10.i();
                try {
                    gr grVar = this.x;
                    ta taVar = grVar.e;
                    if (!taVar.u.N()) {
                        ue.a("Expected applyChanges() to have been called");
                    }
                    if (k40Var.e > 0 || !grVar.s.isEmpty()) {
                        grVar.m(k40Var, null);
                        z = !taVar.u.N();
                    } else {
                        z = false;
                    }
                    if (!z) {
                        l();
                    }
                } catch (Throwable th) {
                    this.r = k40Var;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.i.e.g()) {
                        bf0 bf0Var = this.w;
                        n40 n40Var = this.i;
                        this.x.getClass();
                        try {
                            bf0Var.e(n40Var);
                            bf0Var.b();
                            bf0Var.a();
                        } catch (Throwable th3) {
                            bf0Var.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void s(ii0 ii0Var) {
        ii0 ii0Var2;
        while (true) {
            Object obj = this.g.get();
            if (obj == null || obj.equals(nh.g)) {
                ii0Var2 = ii0Var;
            } else if (obj instanceof Set) {
                ii0Var2 = new Set[]{obj, ii0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.g).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = ii0Var;
                ii0Var2 = copyOf;
            }
            AtomicReference atomicReference = this.g;
            while (!atomicReference.compareAndSet(obj, ii0Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.h) {
                    l();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(Object obj) {
        de0 u;
        int i;
        boolean z;
        int i2;
        gr grVar = this.x;
        if (grVar.A > 0 || (u = grVar.u()) == null) {
            return;
        }
        int i3 = u.b | 1;
        u.b = i3;
        if ((i3 & 32) == 0) {
            g40 g40Var = u.f;
            if (g40Var == null) {
                g40Var = new g40();
                u.f = g40Var;
            }
            int i4 = u.e;
            int b = g40Var.b(obj);
            if (b < 0) {
                b = ~b;
                i = -1;
            } else {
                i = g40Var.c[b];
            }
            g40Var.b[b] = obj;
            g40Var.c[b] = i4;
            if (i == u.e) {
                z = true;
                this.v.getClass();
                if (z) {
                    if (obj instanceof hn0) {
                        ((hn0) obj).f(1);
                    }
                    u10.a(this.k, obj, u);
                    if (obj instanceof aj) {
                        aj ajVar = (aj) obj;
                        zi h = ajVar.h();
                        k40 k40Var = this.n;
                        u10.D(k40Var, obj);
                        g40 g40Var2 = h.e;
                        Object[] objArr = g40Var2.b;
                        long[] jArr = g40Var2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            gn0 gn0Var = (gn0) objArr[(i5 << 3) + i8];
                                            i2 = i6;
                                            if (gn0Var instanceof hn0) {
                                                ((hn0) gn0Var).f(1);
                                            }
                                            u10.a(k40Var, gn0Var, obj);
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i6 = i2;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Object obj2 = h.f;
                        k40 k40Var2 = u.g;
                        if (k40Var2 == null) {
                            k40Var2 = new k40();
                            u.g = k40Var2;
                        }
                        k40Var2.l(ajVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.v.getClass();
        if (z) {
        }
    }

    public final void u(Object obj) {
        synchronized (this.h) {
            try {
                p(obj);
                Object g = this.n.g(obj);
                if (g != null) {
                    if (g instanceof l40) {
                        l40 l40Var = (l40) g;
                        Object[] objArr = l40Var.b;
                        long[] jArr = l40Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            p((aj) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        p((aj) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
