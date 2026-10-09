package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ys {
    public final wx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final h40 f = new h40();
    public final g60 g = new g60();
    public final d40 h = new d40(10);

    public ys(wx wxVar) {
        this.a = wxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(long j, List list, boolean z) {
        int i;
        d40 d40Var;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        v50 v50Var;
        v50 v50Var2;
        int size = list.size();
        g60 g60Var = this.g;
        g60 g60Var2 = g60Var;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = 8;
            d40Var = this.h;
            if (i4 >= size) {
                break;
            }
            t20 t20Var = (t20) list.get(i4);
            if (t20Var.r) {
                t20Var.q = new s2(i, this, t20Var);
                if (z2) {
                    t40 t40Var = g60Var2.a;
                    ?? r14 = t40Var.e;
                    int i5 = t40Var.g;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            v50Var2 = 0;
                            break;
                        }
                        v50Var2 = r14[i6];
                        if (((v50) v50Var2).c.equals(t20Var)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    v50Var = v50Var2;
                    if (v50Var != null) {
                        v50Var.i = true;
                        v50Var.d.b(j);
                        if (z) {
                            Object d = d40Var.d(j);
                            if (d == null) {
                                d = new h40();
                                d40Var.f(j, d);
                            }
                            ((h40) d).a(v50Var);
                        }
                        g60Var2 = v50Var;
                    } else {
                        z2 = false;
                    }
                }
                v50Var = new v50(t20Var);
                v50Var.d.b(j);
                if (z) {
                    Object d2 = d40Var.d(j);
                    if (d2 == null) {
                        d2 = new h40();
                        d40Var.f(j, d2);
                    }
                    ((h40) d2).a(v50Var);
                }
                g60Var2.a.b(v50Var);
                g60Var2 = v50Var;
            }
            i4++;
        }
        if (z) {
            long[] jArr3 = d40Var.b;
            Object[] objArr = d40Var.c;
            long[] jArr4 = d40Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j2 = jArr4[i7];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((255 & j2) < 128) {
                                int i10 = (i7 << 3) + i9;
                                long j3 = jArr3[i10];
                                h40 h40Var = (h40) objArr[i10];
                                t40 t40Var2 = g60Var.a;
                                i3 = i;
                                Object[] objArr2 = t40Var2.e;
                                int i11 = t40Var2.g;
                                jArr2 = jArr3;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    ((v50) objArr2[i12]).f(j3, h40Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i3 = i;
                            }
                            j2 >>= i3;
                            i9++;
                            jArr3 = jArr2;
                            i = i3;
                        }
                        jArr = jArr3;
                        i2 = i;
                        if (i8 != i2) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    i = i2;
                    jArr3 = jArr;
                }
            }
        }
        d40Var.a();
    }

    public final boolean b(p2 p2Var, boolean z) {
        g60 g60Var = this.g;
        t40 t40Var = g60Var.a;
        if (!g60Var.a((s00) p2Var.f, this.a, p2Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((v50) objArr[i2]).e(p2Var, z) || z3;
        }
        Object[] objArr2 = t40Var.e;
        int i3 = t40Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((v50) objArr2[i4]).d(p2Var) || z4;
        }
        g60Var.b(p2Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            h40 h40Var = this.f;
            int i5 = h40Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((t20) h40Var.g(i6));
            }
            h40Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            g60Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        g60 g60Var = this.g;
        t40 t40Var = g60Var.a;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((v50) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            g60Var.a.g();
        }
    }

    public final void d(t20 t20Var) {
        if (this.b) {
            this.e = true;
            this.f.a(t20Var);
            return;
        }
        g60 g60Var = this.g;
        h40 h40Var = g60Var.b;
        h40Var.d();
        h40Var.a(g60Var);
        while (h40Var.j()) {
            g60 g60Var2 = (g60) h40Var.l(h40Var.b - 1);
            int i = 0;
            while (true) {
                t40 t40Var = g60Var2.a;
                if (i < t40Var.g) {
                    v50 v50Var = (v50) t40Var.e[i];
                    if (v50Var.c.equals(t20Var)) {
                        g60Var2.a.i(v50Var);
                        v50Var.c();
                    } else {
                        h40Var.a(v50Var);
                        i++;
                    }
                }
            }
        }
    }
}
