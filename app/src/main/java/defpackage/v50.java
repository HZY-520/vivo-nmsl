package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v50 extends g60 {
    public final t20 c;
    public final jd d;
    public final s00 e;
    public d60 f;
    public rc0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public v50(t20 t20Var) {
        this.c = t20Var;
        jd jdVar = new jd();
        jdVar.f = new long[2];
        this.d = jdVar;
        this.e = new s00(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [t20] */
    /* JADX WARN: Type inference failed for: r5v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [t20] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.g60
    public final boolean a(s00 s00Var, wx wxVar, p2 p2Var, boolean z) {
        jd jdVar;
        s00 s00Var2;
        Object obj;
        boolean z2;
        boolean z3;
        rc0 rc0Var;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        int i5;
        vc0 vc0Var;
        wx wxVar2 = wxVar;
        boolean a = super.a(s00Var, wxVar, p2Var, z);
        oi oiVar = this.c;
        boolean z7 = true;
        if (oiVar.r) {
            ?? r8 = 0;
            while (oiVar != 0) {
                if (oiVar instanceof yc0) {
                    this.f = nh.Y((yc0) oiVar, 16);
                } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                    t20 t20Var = oiVar.t;
                    int i6 = 0;
                    oiVar = oiVar;
                    r8 = r8;
                    while (t20Var != null) {
                        if ((t20Var.g & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                oiVar = t20Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new t40(new t20[16]);
                                }
                                if (oiVar != 0) {
                                    r8.b(oiVar);
                                    oiVar = 0;
                                }
                                r8.b(t20Var);
                            }
                        }
                        t20Var = t20Var.j;
                        oiVar = oiVar;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                oiVar = nh.N(r8);
            }
            if (this.f != null) {
                int d = s00Var.d();
                int i7 = 0;
                while (true) {
                    jdVar = this.d;
                    s00Var2 = this.e;
                    if (i7 >= d) {
                        break;
                    }
                    long a2 = s00Var.a(i7);
                    vc0 vc0Var2 = (vc0) s00Var.e(i7);
                    if (jdVar.c(a2)) {
                        boolean z8 = z7;
                        long j = vc0Var2.g;
                        long j2 = vc0Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z6 = z8;
                            z5 = a;
                            ArrayList arrayList = new ArrayList(vc0Var2.b().size());
                            List b = vc0Var2.b();
                            i3 = d;
                            int size = b.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list = b;
                                xs xsVar = (xs) b.get(i8);
                                s00 s00Var3 = s00Var2;
                                long j3 = a2;
                                long j4 = xsVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    vc0Var = vc0Var2;
                                    long j5 = xsVar.a;
                                    i5 = size;
                                    d60 d60Var = this.f;
                                    d60Var.getClass();
                                    arrayList.add(new xs(j5, d60Var.z(wxVar2, j4), xsVar.c, xsVar.d, xsVar.e));
                                } else {
                                    i5 = size;
                                    vc0Var = vc0Var2;
                                }
                                i8++;
                                size = i5;
                                b = list;
                                s00Var2 = s00Var3;
                                a2 = j3;
                                vc0Var2 = vc0Var;
                            }
                            s00 s00Var4 = s00Var2;
                            long j6 = a2;
                            d60 d60Var2 = this.f;
                            d60Var2.getClass();
                            long z9 = d60Var2.z(wxVar2, j);
                            d60 d60Var3 = this.f;
                            d60Var3.getClass();
                            vc0 vc0Var3 = new vc0(vc0Var2.a, vc0Var2.b, d60Var3.z(wxVar2, j2), vc0Var2.d, vc0Var2.e, vc0Var2.f, z9, vc0Var2.h, vc0Var2.i, arrayList, vc0Var2.j, vc0Var2.k, vc0Var2.l, vc0Var2.n);
                            vc0 vc0Var4 = vc0Var2.q;
                            if (vc0Var4 == null) {
                                vc0Var4 = vc0Var2;
                            }
                            vc0Var3.q = vc0Var4;
                            vc0 vc0Var5 = vc0Var2.q;
                            if (vc0Var5 != null) {
                                vc0Var2 = vc0Var5;
                            }
                            vc0Var3.q = vc0Var2;
                            s00Var4.b(j6, vc0Var3);
                        } else {
                            z5 = a;
                            i3 = d;
                            i4 = i7;
                            z6 = z8;
                        }
                    } else {
                        z5 = a;
                        i3 = d;
                        z6 = z7;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    wxVar2 = wxVar;
                    z7 = z6;
                    d = i3;
                    a = z5;
                }
                boolean z10 = a;
                boolean z11 = z7;
                if (s00Var2.d() == 0) {
                    jdVar.e = 0;
                    this.a.g();
                    return z11;
                }
                int i9 = jdVar.e;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) jdVar.f)[i9];
                    if (s00Var.e) {
                        int i10 = s00Var.h;
                        long[] jArr = s00Var.f;
                        Object[] objArr = s00Var.g;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != kw.h) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        s00Var.e = false;
                        s00Var.h = i11;
                    }
                    if (lw.k(s00Var.f, s00Var.h, j7) < 0 && i9 < (i2 = jdVar.e)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) jdVar.f;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        jdVar.e--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(s00Var2.d());
                int d2 = s00Var2.d();
                for (int i16 = 0; i16 < d2; i16++) {
                    arrayList2.add(s00Var2.e(i16));
                }
                rc0 rc0Var2 = new rc0(arrayList2, p2Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (p2Var.g(((vc0) obj).a)) {
                        break;
                    }
                    i17++;
                }
                vc0 vc0Var6 = (vc0) obj;
                if (vc0Var6 != null) {
                    boolean z12 = vc0Var6.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z12 || vc0Var6.h)) {
                            d60 d60Var4 = this.f;
                            d60Var4.getClass();
                            long j8 = d60Var4.g;
                            long j9 = vc0Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            z4 = !((intBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z11 : false) | (intBitsToFloat2 < 0.0f ? z11 : false) | (intBitsToFloat > ((float) i18) ? z11 : false) | (intBitsToFloat < 0.0f ? z11 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z13 = this.h;
                    if (z4 == z13 || !((i = rc0Var2.c) == 3 || i == 4 || i == 5)) {
                        int i19 = rc0Var2.c;
                        if (i19 == 4 && z13 && !this.j) {
                            rc0Var2.c = 3;
                        } else if (i19 == 5 && z4 && z12) {
                            rc0Var2.c = 3;
                        }
                    } else {
                        rc0Var2.c = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z10 && rc0Var2.c == 3 && (rc0Var = this.g) != null) {
                    ?? r1 = rc0Var.a;
                    int size3 = r1.size();
                    ?? r4 = rc0Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (s60.b(((vc0) r1.get(r5)).c, ((vc0) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = rc0Var2;
                        return z3;
                    }
                }
                z3 = z11;
                this.g = rc0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.g60
    public final void b(p2 p2Var) {
        super.b(p2Var);
        rc0 rc0Var = this.g;
        if (rc0Var == null) {
            return;
        }
        this.h = this.i;
        List list = rc0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vc0 vc0Var = (vc0) list.get(i);
            boolean z = vc0Var.d;
            long j = vc0Var.a;
            boolean g = p2Var.g(j);
            boolean z2 = this.i;
            if ((!z && !g) || (!z && !z2)) {
                this.d.f(j);
            }
        }
        this.i = false;
        this.j = rc0Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [t40] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [t40] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [t20] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [t20] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        t40 t40Var = this.a;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((v50) objArr[i2]).c();
        }
        oi oiVar = this.c;
        ?? r1 = 0;
        while (oiVar != 0) {
            if (oiVar instanceof yc0) {
                ((yc0) oiVar).P();
            } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                t20 t20Var = oiVar.t;
                int i3 = 0;
                r1 = r1;
                oiVar = oiVar;
                while (t20Var != null) {
                    if ((t20Var.g & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            oiVar = t20Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new t40(new t20[16]);
                            }
                            if (oiVar != 0) {
                                r1.b(oiVar);
                                oiVar = 0;
                            }
                            r1.b(t20Var);
                        }
                    }
                    t20Var = t20Var.j;
                    r1 = r1;
                    oiVar = oiVar;
                }
                if (i3 == 1) {
                }
            }
            oiVar = nh.N(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009e A[LOOP:0: B:5:0x009c->B:6:0x009e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(p2 p2Var) {
        boolean z;
        iy iyVar;
        int i;
        int i2;
        s00 s00Var = this.e;
        if (s00Var.d() != 0) {
            t20 t20Var = this.c;
            if (t20Var.r) {
                d60 d60Var = t20Var.l;
                if ((d60Var == null || (iyVar = d60Var.y) == null) ? false : iyVar.C()) {
                    rc0 rc0Var = this.g;
                    rc0Var.getClass();
                    d60 d60Var2 = this.f;
                    d60Var2.getClass();
                    long j = d60Var2.g;
                    oi oiVar = t20Var;
                    ?? r8 = 0;
                    while (true) {
                        z = true;
                        if (oiVar == 0) {
                            break;
                        }
                        if (oiVar instanceof yc0) {
                            ((yc0) oiVar).x(rc0Var, sc0.g, j);
                        } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                            t20 t20Var2 = oiVar.t;
                            int i3 = 0;
                            oiVar = oiVar;
                            r8 = r8;
                            while (t20Var2 != null) {
                                if ((t20Var2.g & 16) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
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
                            if (i3 == 1) {
                            }
                        }
                        oiVar = nh.N(r8);
                    }
                    if (t20Var.r) {
                        t40 t40Var = this.a;
                        Object[] objArr = t40Var.e;
                        int i4 = t40Var.g;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ((v50) objArr[i5]).d(p2Var);
                        }
                    }
                    b(p2Var);
                    i = s00Var.h;
                    Object[] objArr2 = s00Var.g;
                    for (i2 = 0; i2 < i; i2++) {
                        objArr2[i2] = null;
                    }
                    s00Var.h = 0;
                    s00Var.e = false;
                    this.f = null;
                    return z;
                }
            }
        }
        z = false;
        b(p2Var);
        i = s00Var.h;
        Object[] objArr22 = s00Var.g;
        while (i2 < i) {
        }
        s00Var.h = 0;
        s00Var.e = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [t40] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [t40] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v10, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(p2 p2Var, boolean z) {
        iy iyVar;
        if (this.e.d() == 0) {
            return false;
        }
        oi oiVar = this.c;
        if (oiVar.r) {
            d60 d60Var = oiVar.l;
            if ((d60Var == null || (iyVar = d60Var.y) == null) ? false : iyVar.C()) {
                rc0 rc0Var = this.g;
                rc0Var.getClass();
                d60 d60Var2 = this.f;
                d60Var2.getClass();
                long j = d60Var2.g;
                oi oiVar2 = oiVar;
                ?? r7 = 0;
                while (oiVar2 != 0) {
                    if (oiVar2 instanceof yc0) {
                        ((yc0) oiVar2).x(rc0Var, sc0.e, j);
                    } else if ((oiVar2.g & 16) != 0 && (oiVar2 instanceof oi)) {
                        t20 t20Var = oiVar2.t;
                        int i = 0;
                        oiVar2 = oiVar2;
                        r7 = r7;
                        while (t20Var != null) {
                            if ((t20Var.g & 16) != 0) {
                                i++;
                                r7 = r7;
                                if (i == 1) {
                                    oiVar2 = t20Var;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new t40(new t20[16]);
                                    }
                                    if (oiVar2 != 0) {
                                        r7.b(oiVar2);
                                        oiVar2 = 0;
                                    }
                                    r7.b(t20Var);
                                }
                            }
                            t20Var = t20Var.j;
                            oiVar2 = oiVar2;
                            r7 = r7;
                        }
                        if (i == 1) {
                        }
                    }
                    oiVar2 = nh.N(r7);
                }
                if (oiVar.r) {
                    t40 t40Var = this.a;
                    Object[] objArr = t40Var.e;
                    int i2 = t40Var.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        v50 v50Var = (v50) objArr[i3];
                        this.f.getClass();
                        v50Var.e(p2Var, z);
                    }
                }
                if (oiVar.r) {
                    ?? r13 = 0;
                    while (oiVar != 0) {
                        if (oiVar instanceof yc0) {
                            ((yc0) oiVar).x(rc0Var, sc0.f, j);
                        } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                            t20 t20Var2 = oiVar.t;
                            int i4 = 0;
                            oiVar = oiVar;
                            r13 = r13;
                            while (t20Var2 != null) {
                                if ((t20Var2.g & 16) != 0) {
                                    i4++;
                                    r13 = r13;
                                    if (i4 == 1) {
                                        oiVar = t20Var2;
                                    } else {
                                        if (r13 == 0) {
                                            r13 = new t40(new t20[16]);
                                        }
                                        if (oiVar != 0) {
                                            r13.b(oiVar);
                                            oiVar = 0;
                                        }
                                        r13.b(t20Var2);
                                    }
                                }
                                t20Var2 = t20Var2.j;
                                oiVar = oiVar;
                                r13 = r13;
                            }
                            if (i4 == 1) {
                            }
                        }
                        oiVar = nh.N(r13);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, h40 h40Var) {
        jd jdVar = this.d;
        if (jdVar.c(j) && !h40Var.e(this)) {
            jdVar.f(j);
            this.e.c(j);
        }
        t40 t40Var = this.a;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((v50) objArr[i2]).f(j, h40Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
