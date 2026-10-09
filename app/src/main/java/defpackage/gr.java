package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gr implements se {
    public int A;
    public int B;
    public boolean C;
    public final fr D;
    public final ArrayList E;
    public boolean F;
    public kl0 G;
    public ll0 H;
    public ol0 I;
    public boolean J;
    public xa0 K;
    public final te L;
    public er M;
    public rn N;
    public final tg O;
    public boolean P;
    public long Q;
    public hr R;
    public final v6 a;
    public final xe b;
    public final ll0 c;
    public final n40 d;
    public final ta e;
    public final ta f;
    public final i2 g;
    public final cf h;
    public kr j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public w30 p;
    public boolean q;
    public boolean r;
    public y30 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final fw n = new fw();
    public final ArrayList s = new ArrayList();
    public final fw t = new fw();
    public xa0 u = xa0.h;
    public final fw x = new fw();
    public int z = -1;

    public gr(v6 v6Var, xe xeVar, ll0 ll0Var, n40 n40Var, ta taVar, ta taVar2, i2 i2Var, cf cfVar) {
        this.a = v6Var;
        this.b = xeVar;
        this.c = ll0Var;
        this.d = n40Var;
        this.e = taVar;
        this.f = taVar2;
        this.g = i2Var;
        this.h = cfVar;
        AtomicReference atomicReference = le0.z;
        this.C = ((Boolean) atomicReference.get()).booleanValue();
        this.D = new fr(0, this);
        this.E = new ArrayList();
        kl0 b = ll0Var.b();
        b.c();
        this.G = b;
        ll0 ll0Var2 = new ll0();
        if (((Boolean) atomicReference.get()).booleanValue()) {
            ll0Var2.o = new y30();
        }
        this.H = ll0Var2;
        ol0 c = ll0Var2.c();
        c.e(true);
        this.I = c;
        this.L = new te(this, taVar);
        kl0 b2 = this.H.b();
        try {
            er a = b2.a(0);
            b2.c();
            this.M = a;
            this.N = new rn();
            this.O = ((le0) xeVar).w.g(sm.e);
        } catch (Throwable th) {
            b2.c();
            throw th;
        }
    }

    public static final int H(gr grVar, int i, boolean z, int i2) {
        te teVar = grVar.L;
        kl0 kl0Var = grVar.G;
        int[] iArr = kl0Var.b;
        int[] iArr2 = kl0Var.b;
        int i3 = i * 5;
        int i4 = iArr[i3 + 1];
        if ((134217728 & i4) != 0) {
            int h = kl0Var.h(i);
            Object n = kl0Var.n(iArr2, i);
            if (h == 206 && lw.i(n, ue.e)) {
                kl0Var.g(i, 0);
                return kl0Var.m(i);
            }
            if (!kl0Var.j(i)) {
                return kl0Var.m(i);
            }
        } else if ((i4 & 67108864) != 0) {
            int i5 = iArr[i3 + 3] + i;
            int i6 = 0;
            for (int i7 = i + 1; i7 < i5; i7 += iArr2[(i7 * 5) + 3]) {
                boolean j = kl0Var.j(i7);
                if (j) {
                    teVar.c();
                    Object l = kl0Var.l(i7);
                    teVar.c();
                    teVar.h.add(l);
                }
                i6 += H(grVar, i7, j || z, j ? 0 : i2 + i6);
                if (j) {
                    teVar.c();
                    teVar.a();
                }
            }
            if (!kl0Var.j(i)) {
                return i6;
            }
        } else if (!kl0Var.j(i)) {
            return kl0Var.m(i);
        }
        return 1;
    }

    public final int A(int i) {
        int o = this.G.o(i) + 1;
        int i2 = 0;
        while (o < i) {
            if (!this.G.i(o)) {
                i2++;
            }
            o += this.G.b[(o * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(cf cfVar, cf cfVar2, Integer num, List list, eq eqVar) {
        Object b;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                k90 k90Var = (k90) list.get(i2);
                de0 de0Var = (de0) k90Var.e;
                Object obj = k90Var.f;
                if (obj != null) {
                    T(de0Var, obj);
                } else {
                    T(de0Var, null);
                }
            }
            if (cfVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (cfVar2 == null || cfVar2 == cfVar || intValue < 0) {
                    b = eqVar.b();
                } else {
                    cfVar.t = cfVar2;
                    cfVar.u = intValue;
                    try {
                        b = eqVar.b();
                        cfVar.t = null;
                        cfVar.u = 0;
                    } catch (Throwable th) {
                        cfVar.t = null;
                        cfVar.u = 0;
                        throw th;
                    }
                }
            }
            b = eqVar.b();
            this.F = z;
            this.k = i;
            return b;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.b < r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        rw rwVar;
        int i;
        boolean z;
        de0 de0Var;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        g40 g40Var;
        long j;
        int n;
        long rotateLeft;
        int hashCode;
        Object b;
        boolean z3 = this.F;
        boolean z4 = true;
        this.F = true;
        kl0 kl0Var = this.G;
        int i6 = kl0Var.i;
        int i7 = (i6 * 5) + 3;
        int i8 = kl0Var.b[i7] + i6;
        int i9 = this.k;
        long j2 = this.Q;
        int i10 = this.l;
        int i11 = this.m;
        int i12 = kl0Var.g;
        ArrayList arrayList = this.s;
        int n2 = kw.n(i12, arrayList);
        if (n2 < 0) {
            n2 = -(n2 + 1);
        }
        if (n2 < arrayList.size()) {
            rwVar = (rw) arrayList.get(n2);
        }
        rwVar = null;
        boolean z5 = false;
        int i13 = i6;
        while (rwVar != null) {
            boolean z6 = z4;
            de0 de0Var2 = rwVar.a;
            int i14 = rwVar.b;
            int n3 = kw.n(i14, arrayList);
            if (n3 >= 0) {
            }
            Object obj = rwVar.c;
            if (obj == null) {
                de0Var2.getClass();
                z = z3;
                de0Var = de0Var2;
                i = i7;
            } else {
                int i15 = 8;
                k40 k40Var = de0Var2.g;
                if (k40Var == null) {
                    z = z3;
                    de0Var = de0Var2;
                    i = i7;
                } else {
                    i = i7;
                    if (obj instanceof aj) {
                        aj ajVar = (aj) obj;
                        z2 = !lw.i(ajVar.h().f, k40Var.g(ajVar));
                        z = z3;
                        de0Var = de0Var2;
                        i2 = i9;
                        i3 = i10;
                        i4 = i11;
                    } else if (obj instanceof l40) {
                        l40 l40Var = (l40) obj;
                        if (l40Var.h()) {
                            Object[] objArr = l40Var.b;
                            long[] jArr = l40Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i3 = i10;
                                i4 = i11;
                                int i16 = 0;
                                while (true) {
                                    long j3 = jArr[i16];
                                    z = z3;
                                    de0Var = de0Var2;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j3 & 255) < 128) {
                                                i5 = i18;
                                                Object obj2 = objArr[(i16 << 3) + i18];
                                                i2 = i9;
                                                if (!(obj2 instanceof aj)) {
                                                    break;
                                                }
                                                aj ajVar2 = (aj) obj2;
                                                if (!lw.i(ajVar2.h().f, k40Var.g(ajVar2))) {
                                                    break;
                                                }
                                            } else {
                                                i5 = i18;
                                                i2 = i9;
                                            }
                                            j3 >>= i15;
                                            i18 = i5 + 1;
                                            i9 = i2;
                                        }
                                        i2 = i9;
                                        if (i17 != i15) {
                                            break;
                                        }
                                    } else {
                                        i2 = i9;
                                    }
                                    if (i16 == length) {
                                        break;
                                    }
                                    i16++;
                                    z3 = z;
                                    de0Var2 = de0Var;
                                    i9 = i2;
                                    i15 = 8;
                                }
                                z2 = false;
                            }
                        }
                        z = z3;
                        de0Var = de0Var2;
                        i2 = i9;
                        i3 = i10;
                        i4 = i11;
                        z2 = false;
                    } else {
                        z = z3;
                        de0Var = de0Var2;
                    }
                    if (z2) {
                        de0 de0Var3 = de0Var;
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(de0Var3);
                        this.g.getClass();
                        cf cfVar = de0Var3.a;
                        if (cfVar != null && (g40Var = de0Var3.f) != null) {
                            de0Var3.d(z6);
                            try {
                                Object[] objArr2 = g40Var.b;
                                int[] iArr = g40Var.c;
                                long[] jArr2 = g40Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        try {
                                            long j4 = jArr2[i19];
                                            Object[] objArr3 = objArr2;
                                            int[] iArr2 = iArr;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                int i21 = 0;
                                                while (i21 < i20) {
                                                    if ((j4 & 255) < 128) {
                                                        int i22 = (i19 << 3) + i21;
                                                        j = j4;
                                                        Object obj3 = objArr3[i22];
                                                        int i23 = iArr2[i22];
                                                        cfVar.t(obj3);
                                                    } else {
                                                        j = j4;
                                                    }
                                                    i21++;
                                                    j4 = j >> 8;
                                                }
                                                if (i20 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i19 == length2) {
                                                break;
                                            }
                                            i19++;
                                            objArr2 = objArr3;
                                            iArr = iArr2;
                                        } catch (Throwable th) {
                                            th = th;
                                            de0Var3 = de0Var3;
                                            de0Var3.d(false);
                                            throw th;
                                        }
                                    }
                                }
                                de0Var3.d(false);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        z6 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.G.p(i14);
                        int i24 = this.G.g;
                        F(i13, i24, i6);
                        int o = this.G.o(i24);
                        while (o != i6 && !this.G.j(o)) {
                            o = this.G.o(o);
                        }
                        int i25 = this.G.j(o) ? 0 : i2;
                        if (o != i24) {
                            int a0 = (a0(o) - this.G.m(i24)) + i25;
                            while (i25 < a0 && o != i14) {
                                o++;
                                while (o < i14) {
                                    kl0 kl0Var2 = this.G;
                                    int i26 = kl0Var2.b[(o * 5) + 3] + o;
                                    if (i14 >= i26) {
                                        i25 += kl0Var2.j(o) ? z6 ? 1 : 0 : a0(o);
                                        o = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i25;
                        this.m = A(i24);
                        int o2 = this.G.o(i24);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (o2 >= 0) {
                            if (o2 == i6) {
                                rotateLeft = Long.rotateLeft(j2, i28);
                            } else {
                                kl0 kl0Var3 = this.G;
                                boolean i29 = kl0Var3.i(o2);
                                int[] iArr3 = kl0Var3.b;
                                if (i29) {
                                    Object n4 = kl0Var3.n(iArr3, o2);
                                    hashCode = n4 != null ? n4 instanceof Enum ? ((Enum) n4).ordinal() : n4.hashCode() : 0;
                                } else {
                                    int h = kl0Var3.h(o2);
                                    hashCode = (h != 207 || (b = kl0Var3.b(iArr3, o2)) == null || b.equals(re.a)) ? h : b.hashCode();
                                }
                                if (hashCode == 126665345) {
                                    rotateLeft = Long.rotateLeft(hashCode, i28);
                                } else {
                                    j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.G.i(o2) ? 0 : A(o2), i28);
                                    i27 = (i27 + 6) % 64;
                                    i28 = (i28 + 6) % 64;
                                    o2 = this.G.o(o2);
                                }
                            }
                            j5 ^= rotateLeft;
                            break;
                        }
                        this.Q = j5;
                        this.K = null;
                        tq tqVar = de0Var.d;
                        if (tqVar == null) {
                            z6.m("Invalid restart scope");
                            return;
                        }
                        tqVar.invoke(this, Integer.valueOf(z6 ? 1 : 0));
                        this.K = null;
                        kl0 kl0Var4 = this.G;
                        int i30 = kl0Var4.b[i] + i6;
                        int i31 = kl0Var4.g;
                        if (i31 < i6 || i31 > i30) {
                            ue.a("Index " + i6 + " is not a parent of " + i31);
                        }
                        kl0Var4.i = i6;
                        kl0Var4.h = i30;
                        kl0Var4.l = 0;
                        kl0Var4.m = 0;
                        i13 = i24;
                        z5 = z6 ? 1 : 0;
                    }
                    n = kw.n(this.G.g, arrayList);
                    if (n < 0) {
                        n = -(n + 1);
                    }
                    if (n < arrayList.size()) {
                        rw rwVar2 = (rw) arrayList.get(n);
                        if (rwVar2.b < i8) {
                            rwVar = rwVar2;
                            z4 = z6;
                            i7 = i;
                            i10 = i3;
                            i11 = i4;
                            z3 = z;
                            i9 = i2;
                        }
                    }
                    rwVar = null;
                    z4 = z6;
                    i7 = i;
                    i10 = i3;
                    i11 = i4;
                    z3 = z;
                    i9 = i2;
                }
            }
            i2 = i9;
            i3 = i10;
            i4 = i11;
            z2 = z6 ? 1 : 0;
            if (z2) {
            }
            n = kw.n(this.G.g, arrayList);
            if (n < 0) {
            }
            if (n < arrayList.size()) {
            }
            rwVar = null;
            z4 = z6;
            i7 = i;
            i10 = i3;
            i11 = i4;
            z3 = z;
            i9 = i2;
        }
        boolean z7 = z3;
        int i32 = i9;
        int i33 = i10;
        int i34 = i11;
        if (z5) {
            F(i13, i6, i6);
            this.G.r();
            int a02 = a0(i6);
            this.k = i32 + a02;
            this.l = i33 + a02;
            this.m = i34;
        } else {
            K();
        }
        this.Q = j2;
        this.F = z7;
    }

    public final void D() {
        int i;
        kl0 kl0Var = this.G;
        int i2 = kl0Var.g;
        boolean j = kl0Var.j(i2);
        te teVar = this.L;
        if (j) {
            teVar.c();
            Object l = this.G.l(i2);
            teVar.c();
            teVar.h.add(l);
        }
        H(this, i2, j, 0);
        teVar.c();
        if (j) {
            teVar.a();
        }
        teVar.d(false);
        gr grVar = teVar.a;
        fw fwVar = teVar.d;
        kl0 kl0Var2 = grVar.G;
        if (kl0Var2.c > 0 && fwVar.a(-2) != (i = kl0Var2.i)) {
            if (!teVar.c && teVar.e) {
                teVar.d(false);
                teVar.b.u.O(u70.c);
                teVar.c = true;
            }
            if (i > 0) {
                er a = kl0Var2.a(i);
                fwVar.c(i);
                teVar.d(false);
                p80 p80Var = teVar.b.u;
                p80Var.O(t70.c);
                t30.w(p80Var, 0, a);
                teVar.c = true;
            }
        }
        teVar.b.u.O(b80.c);
        int i3 = teVar.f;
        kl0 kl0Var3 = grVar.G;
        teVar.f = kl0Var3.b[(kl0Var3.g * 5) + 3] + i3;
    }

    public final void E(xa0 xa0Var) {
        y30 y30Var = this.v;
        if (y30Var == null) {
            y30Var = new y30();
            this.v = y30Var;
        }
        y30Var.h(this.G.g, xa0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(int i, int i2, int i3) {
        kl0 kl0Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (kl0Var.o(i) == i2) {
                    i3 = i2;
                } else if (kl0Var.o(i2) != i) {
                    if (kl0Var.o(i) == kl0Var.o(i2)) {
                        i3 = kl0Var.o(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = kl0Var.o(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = kl0Var.o(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = kl0Var.o(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = kl0Var.o(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = kl0Var.o(i14)) {
                            i3 = kl0Var.o(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!kl0Var.j(i)) {
                    this.L.a();
                }
                i = kl0Var.o(i);
            }
            n(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!kl0Var.j(i)) {
            }
            i = kl0Var.o(i);
        }
        n(i2, i3);
    }

    public final Object G() {
        boolean z = this.P;
        i2 i2Var = re.a;
        if (!z) {
            Object k = this.G.k();
            if (!this.y) {
                return k instanceof lr ? ((lr) k).a : k;
            }
        } else if (this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected");
            return i2Var;
        }
        return i2Var;
    }

    public final boolean I(int i, boolean z) {
        return ((i & 1) == 0 && (this.P || this.y)) || z || !w();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.q() + this.l;
            return;
        }
        kl0 kl0Var = this.G;
        int f = kl0Var.f();
        int[] iArr = kl0Var.b;
        int i = kl0Var.g;
        Object n = i < kl0Var.h ? kl0Var.n(iArr, i) : null;
        Object e = kl0Var.e();
        int i2 = this.m;
        i2 i2Var = re.a;
        if (n != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ (n instanceof Enum ? ((Enum) n).ordinal() : n.hashCode()), 3);
        } else {
            if (e != null && f == 207 && !e.equals(i2Var)) {
                this.Q = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ e.hashCode(), 3) ^ i2;
                O(null, (iArr[(kl0Var.g * 5) + 1] & 1073741824) != 0);
                C();
                kl0Var.d();
                if (n == null) {
                    if (n instanceof Enum) {
                        this.Q = Long.rotateRight(Long.rotateRight(this.Q, 3) ^ ((Enum) n).ordinal(), 3);
                        return;
                    } else {
                        this.Q = Long.rotateRight(Long.rotateRight(this.Q, 3) ^ n.hashCode(), 3);
                        return;
                    }
                }
                if (e == null || f != 207 || e.equals(i2Var)) {
                    this.Q = Long.rotateRight(f ^ Long.rotateRight(this.Q ^ i2, 3), 3);
                    return;
                } else {
                    this.Q = Long.rotateRight(Long.rotateRight(this.Q ^ i2, 3) ^ e.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ f, 3) ^ i2;
        }
        this.Q = rotateLeft;
        O(null, (iArr[(kl0Var.g * 5) + 1] & 1073741824) != 0);
        C();
        kl0Var.d();
        if (n == null) {
        }
    }

    public final void K() {
        kl0 kl0Var = this.G;
        int i = kl0Var.i;
        this.l = i >= 0 ? kl0Var.b[(i * 5) + 1] & 67108863 : 0;
        kl0Var.r();
    }

    public final void L() {
        if (this.l != 0) {
            ue.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.P) {
            return;
        }
        de0 u = u();
        if (u != null) {
            int i = u.b;
            if ((i & 128) == 0) {
                u.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            K();
        } else {
            C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Type inference failed for: r2v7, types: [ol0] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object, xa0, ya0] */
    /* JADX WARN: Type inference failed for: r3v46, types: [ol0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [i2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(int i, h70 h70Var, int i2, xa0 xa0Var) {
        long rotateLeft;
        boolean z;
        kr krVar;
        kr krVar2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        h70 h70Var2 = h70Var;
        if (this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        ?? r8 = re.a;
        if (h70Var2 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ h70Var2.a.hashCode(), 3);
        } else {
            if (xa0Var != 0 && i == 207 && !xa0Var.equals(r8)) {
                this.Q = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ xa0Var.hashCode(), 3) ^ i9;
                if (h70Var2 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.P) {
                    this.G.k++;
                    ?? r3 = this.I;
                    int i10 = r3.t;
                    if (z3) {
                        r3.N(i, r8, true, r8);
                    } else if (xa0Var != 0) {
                        if (h70Var2 == null) {
                            h70Var2 = r8;
                        }
                        r3.N(i, h70Var2, false, xa0Var);
                    } else {
                        if (h70Var2 == null) {
                            h70Var2 = r8;
                        }
                        r3.N(i, h70Var2, false, r8);
                    }
                    kr krVar3 = this.j;
                    if (krVar3 != null) {
                        int i11 = (-2) - i10;
                        mx mxVar = new mx(-1, i, i11, -1);
                        krVar3.e.h(i11, new ps(-1, this.k - krVar3.b, 0));
                        krVar3.d.add(mxVar);
                    }
                    s(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int f = this.G.f();
                    if (!z4 && f == i) {
                        kl0 kl0Var = this.G;
                        int i12 = kl0Var.g;
                        if (lw.i(h70Var2, i12 < kl0Var.h ? kl0Var.n(kl0Var.b, i12) : null)) {
                            O(xa0Var, z3);
                        }
                    }
                    kl0 kl0Var2 = this.G;
                    int[] iArr = kl0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (kl0Var2.k <= 0) {
                        int i13 = kl0Var2.g;
                        while (i13 < kl0Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object n = kl0Var2.n(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new mx(n, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new kr(this.k, arrayList);
                    krVar = this.j;
                    if (krVar != null) {
                        ArrayList arrayList2 = krVar.d;
                        y30 y30Var = krVar.e;
                        int i17 = krVar.b;
                        Object dxVar = h70Var2 != null ? new dx(Integer.valueOf(i), h70Var2) : Integer.valueOf(i);
                        k40 k40Var = ((u30) krVar.f.getValue()).a;
                        Object g = k40Var.g(dxVar);
                        if (g == null) {
                            g = null;
                        } else if (g instanceof h40) {
                            h40 h40Var = (h40) g;
                            Object l = h40Var.l(0);
                            if (h40Var.i()) {
                                k40Var.j(dxVar);
                            }
                            if (h40Var.b == 1) {
                                k40Var.l(dxVar, h40Var.f());
                            }
                            g = l;
                        } else {
                            k40Var.j(dxVar);
                        }
                        mx mxVar2 = (mx) g;
                        if (z || mxVar2 == null) {
                            this.G.k++;
                            this.P = true;
                            this.K = null;
                            if (this.I.w) {
                                ol0 c = this.H.c();
                                this.I = c;
                                c.J();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            ?? r2 = this.I;
                            int i18 = r2.t;
                            h70 h70Var3 = r8;
                            if (z3) {
                                r2.N(i, r8, true, r8);
                                i3 = 0;
                            } else if (xa0Var != 0) {
                                if (h70Var != null) {
                                    h70Var3 = h70Var;
                                }
                                i3 = 0;
                                r2.N(i, h70Var3, false, xa0Var);
                            } else {
                                i3 = 0;
                                r2.N(i, h70Var == null ? r8 : h70Var, false, r8);
                            }
                            this.M = this.I.b(i18);
                            int i19 = (-2) - i18;
                            mx mxVar3 = new mx(-1, i, i19, -1);
                            y30Var.h(i19, new ps(-1, this.k - i17, i3));
                            arrayList2.add(mxVar3);
                            krVar2 = new kr(z3 ? i3 : this.k, new ArrayList());
                            s(z3, krVar2);
                            return;
                        }
                        int i20 = mxVar2.c;
                        arrayList2.add(mxVar2);
                        ps psVar = (ps) y30Var.b(i20);
                        this.k = (psVar != null ? psVar.b : -1) + i17;
                        ps psVar2 = (ps) y30Var.b(i20);
                        int i21 = psVar2 != null ? psVar2.a : -1;
                        int i22 = krVar.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = y30Var.c;
                            long[] jArr = y30Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                ps psVar3 = (ps) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = psVar3.a;
                                                if (i28 == i21) {
                                                    psVar3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    psVar3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = y30Var.c;
                                long[] jArr2 = y30Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) < 128) {
                                                    ps psVar4 = (ps) objArr4[(i29 << 3) + i31];
                                                    int i32 = psVar4.a;
                                                    if (i32 == i21) {
                                                        psVar4.a = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            psVar4.a = i32 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        te teVar = this.L;
                        int i33 = teVar.f;
                        gr grVar = teVar.a;
                        teVar.f = (i20 - grVar.G.g) + i33;
                        this.G.p(i20);
                        if (i4 > 0) {
                            teVar.d(false);
                            fw fwVar = teVar.d;
                            kl0 kl0Var3 = grVar.G;
                            if (kl0Var3.c > 0 && fwVar.a(-2) != (i5 = kl0Var3.i)) {
                                if (!teVar.c && teVar.e) {
                                    teVar.d(false);
                                    teVar.b.u.O(u70.c);
                                    teVar.c = true;
                                }
                                if (i5 > 0) {
                                    er a = kl0Var3.a(i5);
                                    fwVar.c(i5);
                                    teVar.d(false);
                                    p80 p80Var = teVar.b.u;
                                    p80Var.O(t70.c);
                                    t30.w(p80Var, 0, a);
                                    teVar.c = true;
                                }
                            }
                            p80 p80Var2 = teVar.b.u;
                            p80Var2.O(y70.c);
                            p80Var2.c[p80Var2.d - p80Var2.a[p80Var2.b - 1].a] = i4;
                        }
                        O(xa0Var, z3);
                    }
                    krVar2 = null;
                    s(z3, krVar2);
                    return;
                }
                z = z4;
                krVar = this.j;
                if (krVar != null) {
                }
                krVar2 = null;
                s(z3, krVar2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ i, 3) ^ i9;
        }
        this.Q = rotateLeft;
        if (h70Var2 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.P) {
        }
    }

    public final void N() {
        M(-127, null, 0, null);
    }

    public final void O(Object obj, boolean z) {
        if (z) {
            kl0 kl0Var = this.G;
            if (kl0Var.k <= 0) {
                if ((kl0Var.b[(kl0Var.g * 5) + 1] & 1073741824) == 0) {
                    dd0.a("Expected a node group");
                }
                kl0Var.s();
                return;
            }
            return;
        }
        if (obj != null && this.G.e() != obj) {
            te teVar = this.L;
            teVar.getClass();
            teVar.d(false);
            p80 p80Var = teVar.b.u;
            p80Var.O(i80.c);
            t30.w(p80Var, 0, obj);
        }
        this.G.s();
    }

    public final void P(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            M(i, null, 0, null);
            return;
        }
        if (this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.Q = Long.rotateLeft(Long.rotateLeft(this.Q, 3) ^ i, 3) ^ this.m;
        this.m++;
        kl0 kl0Var = this.G;
        boolean z = this.P;
        i2 i2Var = re.a;
        if (z) {
            kl0Var.k++;
            this.I.N(i, i2Var, false, i2Var);
            s(false, null);
            return;
        }
        if (kl0Var.f() == i && ((i3 = kl0Var.g) >= kl0Var.h || (kl0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            kl0Var.s();
            s(false, null);
            return;
        }
        if (kl0Var.k <= 0 && (i2 = kl0Var.g) != kl0Var.h) {
            int i4 = this.k;
            D();
            this.L.e(i4, kl0Var.q());
            kw.K(this.s, i2, kl0Var.g);
        }
        kl0Var.k++;
        this.P = true;
        this.K = null;
        if (this.I.w) {
            ol0 c = this.H.c();
            this.I = c;
            c.J();
            this.J = false;
            this.K = null;
        }
        ol0 ol0Var = this.I;
        ol0Var.d();
        int i5 = ol0Var.t;
        ol0Var.N(i, i2Var, false, i2Var);
        this.M = ol0Var.b(i5);
        s(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gr Q(int i) {
        de0 de0Var;
        boolean z;
        int i2;
        P(i);
        boolean z2 = this.P;
        i2 i2Var = this.g;
        ArrayList arrayList = this.E;
        cf cfVar = this.h;
        if (z2) {
            de0 de0Var2 = new de0(cfVar);
            arrayList.add(de0Var2);
            Z(de0Var2);
            de0Var2.e = this.B;
            de0Var2.b &= -17;
            i2Var.getClass();
            return this;
        }
        int i3 = this.G.i;
        ArrayList arrayList2 = this.s;
        int n = kw.n(i3, arrayList2);
        rw rwVar = n >= 0 ? (rw) arrayList2.remove(n) : null;
        Object k = this.G.k();
        if (lw.i(k, re.a)) {
            de0Var = new de0(cfVar);
            Z(de0Var);
        } else {
            k.getClass();
            de0Var = (de0) k;
        }
        if (rwVar == null) {
            int i4 = de0Var.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                de0Var.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = de0Var.b;
                de0Var.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(de0Var);
                de0Var.e = this.B;
                de0Var.b &= -17;
                i2Var.getClass();
                i2 = de0Var.b;
                if ((i2 & 256) != 0) {
                    de0Var.b = (i2 & (-257)) | 512;
                    p80 p80Var = this.L.b.u;
                    p80Var.O(g80.c);
                    t30.w(p80Var, 0, de0Var);
                    if (!this.y) {
                        int i6 = de0Var.b;
                        if ((i6 & 128) != 0) {
                            this.y = true;
                            this.z = this.G.i;
                            de0Var.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = de0Var.b;
        de0Var.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(de0Var);
        de0Var.e = this.B;
        de0Var.b &= -17;
        i2Var.getClass();
        i2 = de0Var.b;
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void R() {
        M(125, null, 2, null);
        this.r = true;
    }

    public final void S() {
        this.m = 0;
        this.G = this.c.b();
        M(100, null, 0, null);
        xa0 xa0Var = ye.a;
        this.x.c(this.w ? 1 : 0);
        this.w = e(xa0Var);
        this.K = null;
        if (!this.q) {
            this.q = false;
        }
        boolean z = this.C;
        if (!z) {
            this.C = false;
            z = false;
        }
        if (z) {
            ll llVar = bf.a;
            llVar.getClass();
            xa0Var = xa0Var.b(llVar, new jn0(null));
        }
        this.u = xa0Var;
        Set set = (Set) kw.F(xa0Var, sv.a);
        if (set != null) {
            hr hrVar = this.R;
            if (hrVar == null) {
                hrVar = new hr(this.h);
                this.R = hrVar;
            }
            set.add(hrVar);
        }
        M(Long.hashCode(1000L), null, 0, null);
    }

    public final boolean T(de0 de0Var, Object obj) {
        er erVar = de0Var.c;
        if (erVar == null) {
            return false;
        }
        int a = this.G.a.a(q3.c(erVar));
        if (!this.F || a < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int n = kw.n(a, arrayList);
        if (n < 0) {
            int i = -(n + 1);
            if (!(obj instanceof aj)) {
                obj = null;
            }
            arrayList.add(i, new rw(de0Var, a, obj));
            return true;
        }
        rw rwVar = (rw) arrayList.get(n);
        if (!(obj instanceof aj)) {
            rwVar.c = null;
            return true;
        }
        Object obj2 = rwVar.c;
        if (obj2 == null) {
            rwVar.c = obj;
            return true;
        }
        if (obj2 instanceof l40) {
            ((l40) obj2).a(obj);
            return true;
        }
        int i2 = hi0.a;
        l40 l40Var = new l40(2);
        l40Var.j(obj2);
        l40Var.j(obj);
        rwVar.c = l40Var;
        return true;
    }

    public final void U(k40 k40Var) {
        ArrayList arrayList = this.s;
        for (int v = kw.v(arrayList); -1 < v; v--) {
            rw rwVar = (rw) arrayList.get(v);
            er erVar = rwVar.a.c;
            er c = erVar != null ? q3.c(erVar) : null;
            if (c == null || !c.a()) {
                arrayList.remove(v);
            } else {
                int i = rwVar.b;
                int i2 = c.a;
                if (i != i2) {
                    rwVar.b = i2;
                }
            }
        }
        Object[] objArr = k40Var.b;
        Object[] objArr2 = k40Var.c;
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
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            de0 de0Var = (de0) obj;
                            er erVar2 = de0Var.c;
                            if (erVar2 != null) {
                                int i7 = q3.c(erVar2).a;
                                if (obj2 == b2.V) {
                                    obj2 = null;
                                }
                                arrayList.add(new rw(de0Var, i7, obj2));
                            }
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
        ec.W(arrayList, kw.g);
    }

    public final void V(int i, int i2) {
        if (a0(i) != i2) {
            if (i < 0) {
                w30 w30Var = this.p;
                if (w30Var == null) {
                    w30Var = new w30();
                    this.p = w30Var;
                }
                w30Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void W(int i, int i2) {
        int a0 = a0(i);
        if (a0 != i2) {
            int i3 = i2 - a0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int a02 = a0(i) + i3;
                V(i, a02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        kr krVar = (kr) arrayList.get(i4);
                        if (krVar != null && krVar.a(i, a02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                kl0 kl0Var = this.G;
                if (i < 0) {
                    i = kl0Var.i;
                } else if (kl0Var.j(i)) {
                    return;
                } else {
                    i = this.G.o(i);
                }
            }
        }
    }

    public final xa0 X(xa0 xa0Var, xa0 xa0Var2) {
        xa0Var.getClass();
        wa0 wa0Var = new wa0(xa0Var);
        wa0Var.putAll(xa0Var2);
        xa0 a = wa0Var.a();
        M(204, ue.d, 0, null);
        z();
        Z(a);
        z();
        Z(xa0Var2);
        o(false);
        return a;
    }

    public final void Y(Object obj) {
        if (obj instanceof cf0) {
            lr lrVar = new lr((cf0) obj, this.m - 1);
            if (this.P) {
                p80 p80Var = this.L.b.u;
                p80Var.O(a80.c);
                t30.w(p80Var, 0, lrVar);
            }
            this.d.add(obj);
            obj = lrVar;
        }
        Z(obj);
    }

    public final void Z(Object obj) {
        if (this.P) {
            ol0 ol0Var = this.I;
            if (ol0Var.n <= 0 || ol0Var.i == ol0Var.k) {
                ol0Var.C(obj);
                return;
            }
            y30 y30Var = ol0Var.s;
            if (y30Var == null) {
                y30Var = new y30();
            }
            ol0Var.s = y30Var;
            int i = ol0Var.v;
            Object b = y30Var.b(i);
            if (b == null) {
                b = new h40();
                y30Var.h(i, b);
            }
            ((h40) b).a(obj);
            return;
        }
        kl0 kl0Var = this.G;
        boolean z = kl0Var.n;
        te teVar = this.L;
        if (!z) {
            er a = kl0Var.a(kl0Var.i);
            p80 p80Var = teVar.b.u;
            p80Var.O(j70.c);
            t30.x(p80Var, 0, a, 1, obj);
            return;
        }
        int d = (kl0Var.l - nl0.d(kl0Var.b, kl0Var.i)) - 1;
        if (teVar.a.G.i - teVar.f >= 0) {
            teVar.d(true);
            p80 p80Var2 = teVar.b.u;
            p80Var2.O(v70.g);
            t30.w(p80Var2, 0, obj);
            p80Var2.c[p80Var2.d - p80Var2.a[p80Var2.b - 1].a] = d;
            return;
        }
        kl0 kl0Var2 = this.G;
        er a2 = kl0Var2.a(kl0Var2.i);
        p80 p80Var3 = teVar.b.u;
        p80Var3.O(v70.f);
        t30.x(p80Var3, 0, obj, 1, a2);
        p80Var3.c[p80Var3.d - p80Var3.a[p80Var3.b - 1].a] = d;
    }

    public final void a() {
        h();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        rn rnVar = this.N;
        rnVar.b.L();
        rnVar.a.L();
        this.Q = 0L;
        this.A = 0;
        this.r = false;
        this.P = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        kl0 kl0Var = this.G;
        if (!kl0Var.f) {
            kl0Var.c();
        }
        if (this.I.w) {
            return;
        }
        t();
    }

    public final int a0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.m(i) : i2;
        }
        w30 w30Var = this.p;
        if (w30Var == null || w30Var.c(i) < 0) {
            return 0;
        }
        int c = w30Var.c(i);
        if (c >= 0) {
            return w30Var.c[c];
        }
        throw new NoSuchElementException(j2.g("Cannot find value for key ", i));
    }

    public final void b(tq tqVar, Object obj) {
        if (this.P) {
            p80 p80Var = this.N.a;
            p80Var.O(j80.c);
            t30.w(p80Var, 0, obj);
            lr0.e(2, tqVar);
            t30.w(p80Var, 1, tqVar);
            return;
        }
        te teVar = this.L;
        teVar.b();
        p80 p80Var2 = teVar.b.u;
        p80Var2.O(j80.c);
        lr0.e(2, tqVar);
        t30.x(p80Var2, 0, obj, 1, tqVar);
    }

    public final void b0() {
        if (!this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.P) {
            ue.a("useNode() called while inserting");
        }
        kl0 kl0Var = this.G;
        Object l = kl0Var.l(kl0Var.i);
        te teVar = this.L;
        teVar.c();
        teVar.h.add(l);
        if (this.y && (l instanceof iy)) {
            teVar.b();
            teVar.b.u.O(l80.c);
        }
    }

    public final boolean c(int i) {
        Object z = z();
        if ((z instanceof Integer) && i == ((Number) z).intValue()) {
            return false;
        }
        Z(Integer.valueOf(i));
        return true;
    }

    public final boolean d(long j) {
        Object z = z();
        if ((z instanceof Long) && j == ((Number) z).longValue()) {
            return false;
        }
        Z(Long.valueOf(j));
        return true;
    }

    public final boolean e(Object obj) {
        if (lw.i(z(), obj)) {
            return false;
        }
        Z(obj);
        return true;
    }

    public final boolean f(boolean z) {
        Object z2 = z();
        if ((z2 instanceof Boolean) && z == ((Boolean) z2).booleanValue()) {
            return false;
        }
        Z(Boolean.valueOf(z));
        return true;
    }

    public final boolean g(Object obj) {
        if (z() == obj) {
            return false;
        }
        Z(obj);
        return true;
    }

    public final void h() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.Q = 0L;
        this.r = false;
        te teVar = this.L;
        teVar.c = false;
        teVar.d.b = 0;
        teVar.f = 0;
        teVar.e = true;
        teVar.g = 0;
        teVar.h.clear();
        teVar.i = -1;
        teVar.j = -1;
        teVar.k = -1;
        teVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final Object i(vd0 vd0Var) {
        return kw.F(k(), vd0Var);
    }

    public final void j() {
        if (!this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.P) {
            ue.a("createNode() can only be called when inserting");
        }
        fw fwVar = this.n;
        int i = fwVar.a[fwVar.b - 1];
        ol0 ol0Var = this.I;
        er b = ol0Var.b(ol0Var.v);
        this.l++;
        rn rnVar = this.N;
        p80 p80Var = rnVar.a;
        p80Var.O(v70.d);
        t30.w(p80Var, 0, iy.R);
        p80Var.c[p80Var.d - p80Var.a[p80Var.b - 1].a] = i;
        t30.w(p80Var, 1, b);
        p80 p80Var2 = rnVar.b;
        p80Var2.O(v70.e);
        p80Var2.c[p80Var2.d - p80Var2.a[p80Var2.b - 1].a] = i;
        t30.w(p80Var2, 0, b);
    }

    public final xa0 k() {
        xa0 xa0Var;
        xa0 xa0Var2 = this.K;
        if (xa0Var2 != null) {
            return xa0Var2;
        }
        int i = this.G.i;
        boolean z = this.P;
        h70 h70Var = ue.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.q(i2) == 202 && lw.i(this.I.r(i2), h70Var)) {
                    Object o = this.I.o(i2);
                    o.getClass();
                    xa0 xa0Var3 = (xa0) o;
                    this.K = xa0Var3;
                    return xa0Var3;
                }
                ol0 ol0Var = this.I;
                i2 = ol0Var.B(ol0Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.h(i) == 202) {
                    kl0 kl0Var = this.G;
                    if (lw.i(kl0Var.n(kl0Var.b, i), h70Var)) {
                        y30 y30Var = this.v;
                        if (y30Var == null || (xa0Var = (xa0) y30Var.b(i)) == null) {
                            kl0 kl0Var2 = this.G;
                            Object b = kl0Var2.b(kl0Var2.b, i);
                            b.getClass();
                            xa0Var = (xa0) b;
                        }
                        this.K = xa0Var;
                        return xa0Var;
                    }
                }
                i = this.G.o(i);
            }
        }
        xa0 xa0Var4 = this.u;
        this.K = xa0Var4;
        return xa0Var4;
    }

    public final void l() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.E.clear();
            this.s.clear();
            this.e.u.L();
            this.v = null;
            this.a.k();
        } finally {
            Trace.endSection();
        }
    }

    public final void m(k40 k40Var, be beVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            ue.a("Reentrant composition is not supported");
        }
        this.g.getClass();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(xl0.h().g());
            this.v = null;
            U(k40Var);
            this.k = 0;
            this.F = true;
            try {
                S();
                Object z = z();
                if (z != beVar && beVar != null) {
                    Z(beVar);
                }
                fr frVar = this.D;
                t40 a = dm0.a();
                try {
                    a.b(frVar);
                    h70 h70Var = ue.a;
                    if (beVar != null) {
                        M(200, h70Var, 0, null);
                        t10.w(this, beVar);
                        o(false);
                    } else if (!this.w || z == null || z.equals(re.a)) {
                        J();
                    } else {
                        M(200, h70Var, 0, null);
                        lr0.e(2, z);
                        t10.w(this, (tq) z);
                        o(false);
                    }
                    a.j(a.g - 1);
                    r();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        ue.a("Check failed");
                    }
                    t();
                } catch (Throwable th) {
                    a.j(a.g - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        n(this.G.o(i), i2);
        if (this.G.j(i)) {
            Object l = this.G.l(i);
            te teVar = this.L;
            teVar.c();
            teVar.h.add(l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ae  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z) {
        long rotateRight;
        fw fwVar;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        kl0 kl0Var;
        kr krVar;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        fw fwVar2;
        int i8;
        int i9;
        ArrayList arrayList2;
        l40 l40Var;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i12;
        kr krVar2;
        int i13;
        Object[] objArr;
        long[] jArr;
        int i14;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        Object[] objArr3;
        long[] jArr3;
        int i16;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        fw fwVar3 = this.n;
        int i17 = fwVar3.a[fwVar3.b - 2] - 1;
        boolean z3 = this.P;
        i2 i2Var = re.a;
        if (z3) {
            ol0 ol0Var = this.I;
            int i18 = ol0Var.v;
            int q = ol0Var.q(i18);
            Object r = this.I.r(i18);
            Object o = this.I.o(i18);
            if (r != null) {
                rotateRight2 = Long.rotateRight(this.Q, 3) ^ (r instanceof Enum ? ((Enum) r).ordinal() : r.hashCode());
            } else if (o == null || q != 207 || o.equals(i2Var)) {
                rotateRight2 = Long.rotateRight(this.Q ^ i17, 3) ^ q;
            } else {
                this.Q = Long.rotateRight(Long.rotateRight(this.Q ^ i17, 3) ^ o.hashCode(), 3);
            }
            this.Q = Long.rotateRight(rotateRight2, 3);
        } else {
            kl0 kl0Var2 = this.G;
            int i19 = kl0Var2.i;
            int h = kl0Var2.h(i19);
            kl0 kl0Var3 = this.G;
            Object n = kl0Var3.n(kl0Var3.b, i19);
            kl0 kl0Var4 = this.G;
            Object b = kl0Var4.b(kl0Var4.b, i19);
            if (n != null) {
                rotateRight = Long.rotateRight(this.Q, 3) ^ (n instanceof Enum ? ((Enum) n).ordinal() : n.hashCode());
            } else if (b == null || h != 207 || b.equals(i2Var)) {
                rotateRight = Long.rotateRight(this.Q ^ i17, 3) ^ h;
            } else {
                this.Q = Long.rotateRight(Long.rotateRight(this.Q ^ i17, 3) ^ b.hashCode(), 3);
            }
            this.Q = Long.rotateRight(rotateRight, 3);
        }
        int i20 = this.l;
        kr krVar3 = this.j;
        ArrayList arrayList5 = this.s;
        te teVar = this.L;
        if (krVar3 != null) {
            y30 y30Var = krVar3.e;
            int i21 = krVar3.b;
            ArrayList arrayList6 = krVar3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = krVar3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList7.get(i22));
                }
                i = -1;
                int i23 = hi0.a;
                l40 l40Var2 = new l40();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i24 < size3) {
                    mx mxVar = (mx) arrayList6.get(i24);
                    if (hashSet2.contains(mxVar)) {
                        fwVar2 = fwVar3;
                        i8 = i24;
                        if (!l40Var2.c(mxVar)) {
                            int i27 = i25;
                            if (i27 < size2) {
                                mx mxVar2 = (mx) arrayList7.get(i27);
                                if (mxVar2 != mxVar) {
                                    ps psVar = (ps) y30Var.b(mxVar2.c);
                                    int i28 = psVar != null ? psVar.b : -1;
                                    l40Var2.a(mxVar2);
                                    i9 = i27;
                                    i12 = i26;
                                    krVar2 = krVar3;
                                    if (i28 != i12) {
                                        ps psVar2 = (ps) y30Var.b(mxVar2.c);
                                        int i29 = psVar2 != null ? psVar2.c : mxVar2.d;
                                        l40Var = l40Var2;
                                        int i30 = i28 + i21;
                                        i10 = size2;
                                        int i31 = i12 + i21;
                                        if (i29 > 0) {
                                            i11 = i21;
                                            int i32 = teVar.l;
                                            if (i32 > 0) {
                                                arrayList3 = arrayList6;
                                                if (teVar.j == i30 - i32 && teVar.k == i31 - i32) {
                                                    teVar.l = i32 + i29;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            teVar.c();
                                            teVar.j = i30;
                                            teVar.k = i31;
                                            teVar.l = i29;
                                        } else {
                                            i11 = i21;
                                            arrayList3 = arrayList6;
                                            teVar.getClass();
                                        }
                                        if (i28 > i12) {
                                            Object[] objArr5 = y30Var.c;
                                            long[] jArr5 = y30Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j = jArr5[i33];
                                                    int i34 = i29;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j & 255) < 128) {
                                                                i16 = i36;
                                                                ps psVar3 = (ps) objArr5[(i33 << 3) + i36];
                                                                objArr4 = objArr5;
                                                                int i37 = psVar3.b;
                                                                jArr4 = jArr5;
                                                                if (i28 <= i37 && i37 < i28 + i34) {
                                                                    psVar3.b = (i37 - i28) + i12;
                                                                } else if (i12 <= i37 && i37 < i28) {
                                                                    psVar3.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i16 = i36;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i36 = i16 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i33 == length) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList5 = arrayList2;
                                                    i29 = i34;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i38 = i29;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i12 > i28) {
                                                Object[] objArr6 = y30Var.c;
                                                long[] jArr6 = y30Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i39 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i39];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i40 = 8 - ((~(i39 - length2)) >>> 31);
                                                            int i41 = 0;
                                                            while (i41 < i40) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    ps psVar4 = (ps) objArr6[(i39 << 3) + i41];
                                                                    jArr2 = jArr6;
                                                                    int i42 = psVar4.b;
                                                                    i15 = i28;
                                                                    if (i28 <= i42 && i42 < i15 + i38) {
                                                                        psVar4.b = (i42 - i15) + i12;
                                                                    } else if (i15 + 1 <= i42 && i42 < i12) {
                                                                        psVar4.b = i42 - i38;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i15 = i28;
                                                                }
                                                                j2 >>= 8;
                                                                i41++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i28 = i15;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i28;
                                                            if (i40 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i28;
                                                        }
                                                        if (i39 == length2) {
                                                            break;
                                                        }
                                                        i39++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i28 = i14;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = i8;
                                    } else {
                                        arrayList2 = arrayList5;
                                        l40Var = l40Var2;
                                        i10 = size2;
                                        i11 = i21;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i13 = i8;
                                } else {
                                    i9 = i27;
                                    arrayList2 = arrayList5;
                                    l40Var = l40Var2;
                                    i10 = size2;
                                    i11 = i21;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i26;
                                    krVar2 = krVar3;
                                    i13 = i8 + 1;
                                }
                                i25 = i9 + 1;
                                ps psVar5 = (ps) y30Var.b(mxVar2.c);
                                int i43 = i12 + (psVar5 != null ? psVar5.c : mxVar2.d);
                                i24 = i13;
                                krVar3 = krVar2;
                                l40Var2 = l40Var;
                                size2 = i10;
                                i21 = i11;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i26 = i43;
                                fwVar3 = fwVar2;
                            } else {
                                i25 = i27;
                                fwVar3 = fwVar2;
                                i24 = i8;
                            }
                        }
                    } else {
                        fwVar2 = fwVar3;
                        ps psVar6 = (ps) y30Var.b(mxVar.c);
                        int i44 = psVar6 != null ? psVar6.b : -1;
                        int i45 = mxVar.c;
                        i8 = i24;
                        teVar.e(i44 + i21, mxVar.d);
                        krVar3.a(i45, 0);
                        teVar.f = (i45 - teVar.a.G.g) + teVar.f;
                        this.G.p(i45);
                        D();
                        this.G.q();
                        kw.K(arrayList5, i45, this.G.b[(i45 * 5) + 3] + i45);
                    }
                    i24 = i8 + 1;
                    fwVar3 = fwVar2;
                }
                fwVar = fwVar3;
                arrayList = arrayList5;
                teVar.c();
                if (arrayList6.size() > 0) {
                    kl0 kl0Var5 = this.G;
                    teVar.f = (kl0Var5.h - teVar.a.G.g) + teVar.f;
                    kl0Var5.r();
                }
                z2 = this.P;
                if (!z2) {
                    kl0 kl0Var6 = this.G;
                    int i46 = kl0Var6.m - kl0Var6.l;
                    if (i46 > 0) {
                        if (i46 > 0) {
                            teVar.d(false);
                            fw fwVar4 = teVar.d;
                            kl0 kl0Var7 = teVar.a.G;
                            if (kl0Var7.c > 0 && fwVar4.a(-2) != (i7 = kl0Var7.i)) {
                                if (!teVar.c && teVar.e) {
                                    teVar.d(false);
                                    teVar.b.u.O(u70.c);
                                    teVar.c = true;
                                }
                                if (i7 > 0) {
                                    er a = kl0Var7.a(i7);
                                    fwVar4.c(i7);
                                    teVar.d(false);
                                    p80 p80Var = teVar.b.u;
                                    p80Var.O(t70.c);
                                    t30.w(p80Var, 0, a);
                                    teVar.c = true;
                                }
                            }
                            p80 p80Var2 = teVar.b.u;
                            p80Var2.O(h80.c);
                            p80Var2.c[p80Var2.d - p80Var2.a[p80Var2.b - 1].a] = i46;
                        } else {
                            teVar.getClass();
                        }
                    }
                }
                i2 = this.k;
                while (true) {
                    kl0Var = this.G;
                    if (kl0Var.k > 0 && (i6 = kl0Var.g) != kl0Var.h) {
                        D();
                        teVar.e(i2, this.G.q());
                        kw.K(arrayList, i6, this.G.g);
                    }
                }
                if (z2) {
                    if (z) {
                        teVar.a();
                    }
                    int i47 = teVar.a.G.i;
                    fw fwVar5 = teVar.d;
                    int i48 = i;
                    if (fwVar5.a(i48) > i47) {
                        ue.a("Missed recording an endGroup");
                    }
                    if (fwVar5.a(i48) == i47) {
                        teVar.d(false);
                        fwVar5.b();
                        teVar.b.u.O(q70.c);
                    }
                    int i49 = this.G.i;
                    if (i20 != a0(i49)) {
                        W(i49, i20);
                    }
                    if (z) {
                        i20 = 1;
                    }
                    this.G.d();
                    teVar.c();
                } else {
                    if (z) {
                        rn rnVar = this.N;
                        p80 p80Var3 = rnVar.b;
                        if (p80Var3.b == 0) {
                            ue.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        p80 p80Var4 = rnVar.a;
                        m80[] m80VarArr = p80Var3.a;
                        int i50 = p80Var3.b - 1;
                        p80Var3.b = i50;
                        m80 m80Var = m80VarArr[i50];
                        m80VarArr[i50] = null;
                        p80Var4.O(m80Var);
                        Object[] objArr7 = p80Var3.e;
                        Object[] objArr8 = p80Var4.e;
                        int i51 = p80Var4.f;
                        int i52 = m80Var.b;
                        int i53 = p80Var3.f;
                        int i54 = i53 - i52;
                        System.arraycopy(objArr7, i54, objArr8, i51 - i52, i53 - i54);
                        Object[] objArr9 = p80Var3.e;
                        int i55 = p80Var3.f;
                        Arrays.fill(objArr9, i55 - i52, i55, (Object) null);
                        int[] iArr = p80Var3.c;
                        int[] iArr2 = p80Var4.c;
                        int i56 = p80Var4.d;
                        int i57 = m80Var.a;
                        int i58 = p80Var3.d;
                        o7.P(iArr, iArr2, i56 - i57, i58 - i57, i58);
                        p80Var3.f -= i52;
                        p80Var3.d -= i57;
                        i20 = 1;
                    }
                    if (this.G.k <= 0) {
                        dd0.a("Unbalanced begin/end empty");
                    }
                    r4.k--;
                    ol0 ol0Var2 = this.I;
                    int i59 = ol0Var2.v;
                    ol0Var2.i();
                    if (this.G.k <= 0) {
                        int i60 = (-2) - i59;
                        this.I.j();
                        this.I.e(true);
                        er erVar = this.M;
                        boolean N = this.N.a.N();
                        ll0 ll0Var = this.H;
                        if (N) {
                            teVar.b();
                            teVar.d(false);
                            fw fwVar6 = teVar.d;
                            kl0 kl0Var8 = teVar.a.G;
                            if (kl0Var8.c > 0 && fwVar6.a(-2) != (i5 = kl0Var8.i)) {
                                if (!teVar.c && teVar.e) {
                                    teVar.d(false);
                                    teVar.b.u.O(u70.c);
                                    teVar.c = true;
                                }
                                if (i5 > 0) {
                                    er a2 = kl0Var8.a(i5);
                                    fwVar6.c(i5);
                                    teVar.d(false);
                                    p80 p80Var5 = teVar.b.u;
                                    p80Var5.O(t70.c);
                                    t30.w(p80Var5, 0, a2);
                                    i4 = 1;
                                    teVar.c = true;
                                    teVar.c();
                                    p80 p80Var6 = teVar.b.u;
                                    p80Var6.O(w70.c);
                                    t30.x(p80Var6, 0, erVar, i4, ll0Var);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            teVar.c();
                            p80 p80Var62 = teVar.b.u;
                            p80Var62.O(w70.c);
                            t30.x(p80Var62, 0, erVar, i4, ll0Var);
                            r3 = 0;
                        } else {
                            rn rnVar2 = this.N;
                            teVar.b();
                            teVar.d(false);
                            fw fwVar7 = teVar.d;
                            kl0 kl0Var9 = teVar.a.G;
                            if (kl0Var9.c > 0 && fwVar7.a(-2) != (i3 = kl0Var9.i)) {
                                if (!teVar.c && teVar.e) {
                                    teVar.d(false);
                                    teVar.b.u.O(u70.c);
                                    teVar.c = true;
                                }
                                if (i3 > 0) {
                                    er a3 = kl0Var9.a(i3);
                                    fwVar7.c(i3);
                                    teVar.d(false);
                                    p80 p80Var7 = teVar.b.u;
                                    p80Var7.O(t70.c);
                                    t30.w(p80Var7, 0, a3);
                                    teVar.c = true;
                                }
                            }
                            teVar.c();
                            p80 p80Var8 = teVar.b.u;
                            p80Var8.O(x70.c);
                            int i61 = p80Var8.f - p80Var8.a[p80Var8.b - 1].b;
                            Object[] objArr10 = p80Var8.e;
                            objArr10[i61] = erVar;
                            objArr10[i61 + 1] = ll0Var;
                            objArr10[i61 + 2] = rnVar2;
                            this.N = new rn();
                            r3 = 0;
                        }
                        this.P = r3;
                        if (this.c.f != 0) {
                            V(i60, r3);
                            W(i60, i20);
                        }
                    }
                }
                krVar = (kr) this.i.remove(r3.size() - 1);
                if (krVar != null && !z2) {
                    krVar.c++;
                }
                this.j = krVar;
                this.k = fwVar.b() + i20;
                this.m = fwVar.b();
                this.l = fwVar.b() + i20;
            }
        }
        fwVar = fwVar3;
        arrayList = arrayList5;
        i = -1;
        z2 = this.P;
        if (!z2) {
        }
        i2 = this.k;
        while (true) {
            kl0Var = this.G;
            if (kl0Var.k > 0) {
                break;
            }
            D();
            teVar.e(i2, this.G.q());
            kw.K(arrayList, i6, this.G.g);
        }
        if (z2) {
        }
        krVar = (kr) this.i.remove(r3.size() - 1);
        if (krVar != null) {
            krVar.c++;
        }
        this.j = krVar;
        this.k = fwVar.b() + i20;
        this.m = fwVar.b();
        this.l = fwVar.b() + i20;
    }

    public final void p() {
        o(false);
        de0 u = u();
        if (u != null) {
            int i = u.b;
            if ((i & 1) != 0) {
                u.b = i | 2;
            }
        }
    }

    public final de0 q() {
        de0 de0Var;
        er a;
        ce0 ce0Var;
        ArrayList arrayList = this.E;
        de0 de0Var2 = !arrayList.isEmpty() ? (de0) arrayList.remove(arrayList.size() - 1) : null;
        int i = 0;
        if (de0Var2 != null) {
            de0Var2.b &= -9;
            this.g.getClass();
            int i2 = this.B;
            g40 g40Var = de0Var2.f;
            if (g40Var != null && (de0Var2.b & 16) == 0) {
                Object[] objArr = g40Var.b;
                int[] iArr = g40Var.c;
                long[] jArr = g40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        ce0Var = new ce0(i2, i, de0Var2, g40Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
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
            ce0Var = null;
            te teVar = this.L;
            if (ce0Var != null) {
                p80 p80Var = teVar.b.u;
                p80Var.O(p70.c);
                t30.x(p80Var, 0, ce0Var, 1, this.h);
            }
            int i7 = de0Var2.b;
            if ((i7 & 512) != 0) {
                de0Var2.b = i7 & (-513);
                p80 p80Var2 = teVar.b.u;
                p80Var2.O(s70.c);
                t30.w(p80Var2, 0, de0Var2);
                int i8 = de0Var2.b;
                de0Var2.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    de0Var2.b = i8 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (de0Var2 != null) {
            int i9 = de0Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (de0Var2.c == null) {
                    if (this.P) {
                        ol0 ol0Var = this.I;
                        a = ol0Var.b(ol0Var.v);
                    } else {
                        kl0 kl0Var = this.G;
                        a = kl0Var.a(kl0Var.i);
                    }
                    de0Var2.c = a;
                }
                de0Var2.b &= -5;
                de0Var = de0Var2;
                o(false);
                return de0Var;
            }
        }
        de0Var = null;
        o(false);
        return de0Var;
    }

    public final void r() {
        o(false);
        o(false);
        te teVar = this.L;
        if (teVar.c) {
            teVar.d(false);
            teVar.d(false);
            teVar.b.u.O(q70.c);
            teVar.c = false;
        }
        teVar.b();
        if (teVar.d.b != 0) {
            ue.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ue.a("Start/end imbalance");
        }
        h();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void s(boolean z, kr krVar) {
        this.i.add(this.j);
        this.j = krVar;
        int i = this.l;
        fw fwVar = this.n;
        fwVar.c(i);
        fwVar.c(this.m);
        fwVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void t() {
        ll0 ll0Var = new ll0();
        if (this.C) {
            ll0Var.n = new HashMap();
        }
        if (((Boolean) le0.z.get()).booleanValue()) {
            ll0Var.o = new y30();
        }
        this.H = ll0Var;
        ol0 c = ll0Var.c();
        c.e(true);
        this.I = c;
    }

    public final de0 u() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (de0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean v() {
        if (!w() || this.w) {
            return true;
        }
        de0 u = u();
        return (u == null || (u.b & 4) == 0) ? false : true;
    }

    public final boolean w() {
        de0 u;
        return (this.P || this.y || this.w || (u = u()) == null || (u.b & 8) != 0) ? false : true;
    }

    public final void x(ArrayList arrayList) {
        gr grVar = this;
        te teVar = grVar.L;
        ta taVar = grVar.f;
        ta taVar2 = teVar.b;
        try {
            teVar.b = taVar;
            taVar.u.O(d80.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                k90 k90Var = (k90) arrayList.get(i);
                r30 r30Var = (r30) k90Var.e;
                r30Var.getClass();
                er c = q3.c(null);
                ll0 a = nl0.a(null);
                int a2 = a.a(c);
                cw cwVar = new cw();
                teVar.b();
                p80 p80Var = teVar.b.u;
                p80Var.O(n70.c);
                t30.x(p80Var, 0, cwVar, 1, c);
                if (a == grVar.H) {
                    if (!grVar.I.w) {
                        ue.a("Check failed");
                    }
                    grVar.t();
                }
                kl0 b = a.b();
                try {
                    b.p(a2);
                    teVar.f = a2;
                    ta taVar3 = new ta();
                    grVar.B(null, null, null, um.e, new v7(grVar, taVar3, b, r30Var));
                    ta taVar4 = teVar.b;
                    taVar4.getClass();
                    if (!taVar3.u.N()) {
                        p80 p80Var2 = taVar4.u;
                        p80Var2.O(k70.c);
                        t30.x(p80Var2, 0, taVar3, 1, cwVar);
                    }
                    b.c();
                    teVar.b.u.O(f80.c);
                    i++;
                    grVar = this;
                } catch (Throwable th) {
                    b.c();
                    throw th;
                }
            }
            teVar.b();
            teVar.b.u.O(r70.c);
            teVar.f = 0;
            teVar.b = taVar2;
        } catch (Throwable th2) {
            teVar.b = taVar2;
            throw th2;
        }
    }

    public final void y(xa0 xa0Var, Object obj) {
        M(126665345, null, 0, null);
        z();
        Z(obj);
        long j = this.Q;
        try {
            this.Q = 126665345L;
            if (this.P) {
                ol0 ol0Var = this.I;
                int i = ol0Var.v;
                int p = ol0Var.p(i);
                int[] iArr = ol0Var.b;
                int i2 = (p * 5) + 1;
                int i3 = iArr[i2];
                if ((i3 & 134217728) == 0) {
                    int i4 = (i3 & (-134217729)) | 134217728;
                    iArr[i2] = i4;
                    if ((67108864 & i4) == 0) {
                        ol0Var.Q(ol0Var.B(iArr, i));
                    }
                }
            }
            boolean z = (this.P || lw.i(this.G.e(), xa0Var)) ? false : true;
            if (z) {
                E(xa0Var);
            }
            M(202, ue.c, 0, xa0Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            t10.w(this, new be(-59194059, true, new n(6, obj)));
            this.w = z2;
        } finally {
        }
    }

    public final Object z() {
        boolean z = this.P;
        i2 i2Var = re.a;
        if (!z) {
            Object k = this.G.k();
            if (!this.y) {
                return k;
            }
        } else if (this.r) {
            ue.a("A call to createNode(), emitNode() or useNode() expected");
            return i2Var;
        }
        return i2Var;
    }
}
