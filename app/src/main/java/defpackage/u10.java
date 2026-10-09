package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class u10 {
    /* JADX WARN: Multi-variable type inference failed */
    public static List A(ol0 ol0Var, int i, ol0 ol0Var2, boolean z, boolean z2, boolean z3) {
        um umVar;
        boolean z4;
        int i2;
        int i3;
        int s = ol0Var.s(i);
        int i4 = i + s;
        int f = ol0Var.f(ol0Var.b, ol0Var.p(i));
        int f2 = ol0Var.f(ol0Var.b, ol0Var.p(i4));
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (ol0Var.b[(ol0Var.p(i) * 5) + 1] & 201326592) != 0;
        ol0Var2.u(s);
        ol0Var2.v(i5, ol0Var2.t);
        if (ol0Var.g < i4) {
            ol0Var.y(i4);
        }
        if (ol0Var.k < f2) {
            ol0Var.z(f2, i4);
        }
        int[] iArr = ol0Var2.b;
        int i6 = ol0Var2.t;
        int i7 = i6 * 5;
        o7.P(ol0Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = ol0Var2.c;
        int i8 = ol0Var2.i;
        System.arraycopy(ol0Var.c, f, objArr, i8, i5);
        int i9 = ol0Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + s;
        int f3 = i8 - ol0Var2.f(iArr, i6);
        int i12 = ol0Var2.m;
        int i13 = ol0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int f4 = ol0Var2.f(iArr, i15) + f3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = ol0Var2.k;
            }
            iArr2[(i15 * 5) + 4] = ol0.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        ol0Var2.m = i14;
        int b = nl0.b(ol0Var.d, i, ol0Var.n());
        int b2 = nl0.b(ol0Var.d, i4, ol0Var.n());
        if (b < b2) {
            ArrayList arrayList = ol0Var.d;
            ArrayList arrayList2 = new ArrayList(b2 - b);
            for (int i17 = b; i17 < b2; i17++) {
                er erVar = (er) arrayList.get(i17);
                erVar.a += i10;
                arrayList2.add(erVar);
            }
            ol0Var2.d.addAll(nl0.b(ol0Var2.d, ol0Var2.t, ol0Var2.n()), arrayList2);
            arrayList.subList(b, b2).clear();
            umVar = arrayList2;
        } else {
            umVar = um.e;
        }
        if (!umVar.isEmpty()) {
            HashMap hashMap = ol0Var.e;
            HashMap hashMap2 = ol0Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = umVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = ol0Var2.v;
        ol0Var2.L(i9);
        int B = ol0Var.B(ol0Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = B >= 0;
            if (z7) {
                ol0Var.M();
                ol0Var.a(B - ol0Var.t);
                ol0Var.M();
            }
            ol0Var.a(i - ol0Var.t);
            boolean E = ol0Var.E();
            if (z7) {
                ol0Var.J();
                ol0Var.i();
                ol0Var.J();
                ol0Var.i();
            }
            z4 = E;
        } else {
            boolean F = ol0Var.F(i, s);
            ol0Var.G(f, i5, i - 1);
            z4 = F;
        }
        if (z4) {
            ue.a("Unexpectedly removed anchors");
        }
        int i20 = ol0Var2.o;
        int i21 = iArr3[i7 + 1];
        ol0Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            ol0Var2.t = i11;
            ol0Var2.i = i8 + i5;
        }
        if (z6) {
            ol0Var2.Q(i9);
        }
        return umVar;
    }

    public static final long B(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        cq0[] cq0VarArr = bq0.b;
        return floatToRawIntBits;
    }

    public static final boolean C(k40 k40Var, Object obj, Object obj2) {
        Object g = k40Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof l40)) {
            if (!g.equals(obj2)) {
                return false;
            }
            k40Var.j(obj);
            return true;
        }
        l40 l40Var = (l40) g;
        boolean k = l40Var.k(obj2);
        if (k && l40Var.g()) {
            k40Var.j(obj);
        }
        return k;
    }

    public static final void D(k40 k40Var, Object obj) {
        boolean z;
        long[] jArr = k40Var.a;
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
                        int i4 = (i << 3) + i3;
                        Object obj2 = k40Var.b[i4];
                        Object obj3 = k40Var.c[i4];
                        if (obj3 instanceof l40) {
                            l40 l40Var = (l40) obj3;
                            l40Var.k(obj);
                            z = l40Var.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            k40Var.k(i4);
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

    public static final void E(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final boolean F(int i, v5 v5Var, yo yoVar, oe0 oe0Var) {
        yo m;
        t40 t40Var = new t40(new yo[16]);
        if (!yoVar.e.r) {
            cv.b("visitChildren called on an unattached node");
        }
        t40 t40Var2 = new t40(new t20[16]);
        t20 t20Var = yoVar.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var2, t20Var);
        } else {
            t40Var2.b(t20Var2);
        }
        while (true) {
            int i2 = t40Var2.g;
            if (i2 == 0) {
                break;
            }
            t20 t20Var3 = (t20) t40Var2.j(i2 - 1);
            if ((t20Var3.h & 1024) == 0) {
                nh.e(t40Var2, t20Var3);
            } else {
                while (true) {
                    if (t20Var3 == null) {
                        break;
                    }
                    if ((t20Var3.g & 1024) != 0) {
                        t40 t40Var3 = null;
                        while (t20Var3 != null) {
                            if (t20Var3 instanceof yo) {
                                yo yoVar2 = (yo) t20Var3;
                                if (yoVar2.r) {
                                    t40Var.b(yoVar2);
                                }
                            } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                int i3 = 0;
                                for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                    if ((t20Var4.g & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            t20Var3 = t20Var4;
                                        } else {
                                            if (t40Var3 == null) {
                                                t40Var3 = new t40(new t20[16]);
                                            }
                                            if (t20Var3 != null) {
                                                t40Var3.b(t20Var3);
                                                t20Var3 = null;
                                            }
                                            t40Var3.b(t20Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            t20Var3 = nh.N(t40Var3);
                        }
                    } else {
                        t20Var3 = t20Var3.j;
                    }
                }
            }
        }
        while (t40Var.g != 0 && (m = m(t40Var, oe0Var, i)) != null) {
            if (m.q0().a) {
                return ((Boolean) v5Var.invoke(m)).booleanValue();
            }
            if (o(i, v5Var, m, oe0Var)) {
                return true;
            }
            t40Var.i(m);
        }
        return false;
    }

    public static String G(long j) {
        return "PointerId(value=" + j + ")";
    }

    public static void H(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static final Boolean I(int i, v5 v5Var, yo yoVar, oe0 oe0Var) {
        int ordinal = yoVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (q == null) {
                    z6.m("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = q.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean I = I(i, v5Var, q, oe0Var);
                        if (!lw.i(I, Boolean.FALSE)) {
                            return I;
                        }
                        if (oe0Var == null) {
                            if (q.t0() != xo.f) {
                                z6.m("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            yo m = kw.m(q);
                            if (m == null) {
                                z6.m("ActiveParent must have a focusedChild");
                                return null;
                            }
                            oe0Var = kw.p(m);
                        }
                        return Boolean.valueOf(o(i, v5Var, yoVar, oe0Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            z6.j();
                            return null;
                        }
                        z6.m("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (oe0Var == null) {
                    oe0Var = kw.p(q);
                }
                return Boolean.valueOf(o(i, v5Var, yoVar, oe0Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return yoVar.q0().a ? (Boolean) v5Var.invoke(yoVar) : oe0Var == null ? Boolean.valueOf(n(yoVar, i, v5Var)) : Boolean.valueOf(F(i, v5Var, yoVar, oe0Var));
                }
                z6.j();
                return null;
            }
        }
        return Boolean.valueOf(n(yoVar, i, v5Var));
    }

    public static final void J(e6 e6Var, g6 g6Var) {
        g6Var.f.setValue(e6Var.e.getValue());
        l6 l6Var = g6Var.g;
        l6 l6Var2 = e6Var.f;
        int b = l6Var.b();
        for (int i = 0; i < b; i++) {
            l6Var.e(l6Var2.a(i), i);
        }
        g6Var.i = e6Var.h;
        g6Var.h = e6Var.g;
        g6Var.j = ((Boolean) e6Var.i.getValue()).booleanValue();
    }

    public static ss0 K(String str, int i) {
        return new ss0(new rv(0, 0, 0, 0), str);
    }

    public static final void a(k40 k40Var, Object obj, Object obj2) {
        int f = k40Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : k40Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof l40) {
                ((l40) obj3).a(obj2);
            } else if (obj3 != obj2) {
                l40 l40Var = new l40();
                l40Var.a(obj3);
                l40Var.a(obj2);
                obj2 = l40Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            k40Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        k40Var.b[i] = obj;
        k40Var.c[i] = obj2;
    }

    public static void b(ol0 ol0Var, List list, cf cfVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c = ol0Var.c((er) list.get(i));
            int K = ol0Var.K(ol0Var.b, ol0Var.p(c));
            Object obj = K < ol0Var.f(ol0Var.b, ol0Var.p(c + 1)) ? ol0Var.c[ol0Var.g(K)] : re.a;
            de0 de0Var = obj instanceof de0 ? (de0) obj : null;
            if (de0Var != null) {
                de0Var.a = cfVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x003a, blocks: (B:16:0x0035, B:18:0x00cd, B:20:0x00e2, B:25:0x0105), top: B:15:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g6 g6Var, c6 c6Var, long j, final pq pqVar, ng ngVar) {
        fo0 fo0Var;
        fo0 fo0Var2;
        int i;
        dh dhVar;
        final ve0 ve0Var;
        final g6 g6Var2;
        g6 g6Var3;
        final float q;
        pq pqVar2;
        ve0 ve0Var2;
        pq pqVar3;
        e6 e6Var;
        e6 e6Var2;
        Object obj;
        pq pqVar4;
        final c6 c6Var2 = c6Var;
        if (ngVar instanceof fo0) {
            fo0Var = (fo0) ngVar;
            int i2 = fo0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo0Var.j = i2 - Integer.MIN_VALUE;
                fo0Var2 = fo0Var;
                Object obj2 = fo0Var2.i;
                i = fo0Var2.j;
                int i3 = 0;
                dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj2);
                    final Object b = c6Var2.b(0L);
                    final l6 f = c6Var2.f(0L);
                    ve0Var = new ve0();
                    if (j == Long.MIN_VALUE) {
                        try {
                            q = q(fo0Var2.getContext());
                            g6Var2 = g6Var;
                        } catch (CancellationException e) {
                            e = e;
                            g6Var2 = g6Var;
                        }
                        try {
                            pqVar2 = new pq() { // from class: co0
                                @Override // defpackage.pq
                                public final Object invoke(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    c6 c6Var3 = c6Var2;
                                    kr0 d = c6Var3.d();
                                    Object e2 = c6Var3.e();
                                    g6 g6Var4 = g6Var2;
                                    e6 e6Var3 = new e6(b, d, f, longValue, e2, longValue, new do0(g6Var4, 1));
                                    u10.k(e6Var3, longValue, q, c6Var3, g6Var4, pqVar);
                                    ve0.this.e = e6Var3;
                                    return fs0.a;
                                }
                            };
                            ve0Var2 = ve0Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            g6Var3 = g6Var2;
                            e6Var = (e6) ve0Var.e;
                            if (e6Var != null) {
                            }
                            e6Var2 = (e6) ve0Var.e;
                            if (e6Var2 != null) {
                                g6Var3.j = false;
                            }
                            throw e;
                        }
                        try {
                            fo0Var2.e = g6Var2;
                            fo0Var2.f = c6Var2;
                            fo0Var2.g = pqVar;
                            fo0Var2.h = ve0Var2;
                            fo0Var2.j = 1;
                            if (g(c6Var2, pqVar2, fo0Var2) != dhVar) {
                                g6Var3 = g6Var2;
                                pqVar3 = pqVar;
                            }
                            return dhVar;
                        } catch (CancellationException e3) {
                            e = e3;
                            g6Var3 = g6Var2;
                            ve0Var = ve0Var2;
                            e6Var = (e6) ve0Var.e;
                            if (e6Var != null) {
                            }
                            e6Var2 = (e6) ve0Var.e;
                            if (e6Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    ve0Var2 = ve0Var;
                    try {
                        e6 e6Var3 = new e6(b, c6Var2.d(), f, j, c6Var2.e(), j, new do0(g6Var, i3));
                        k(e6Var3, j, q(fo0Var2.getContext()), c6Var2, g6Var, pqVar);
                        ve0Var2.e = e6Var3;
                        g6Var3 = g6Var;
                        c6Var2 = c6Var;
                        pqVar3 = pqVar;
                    } catch (CancellationException e4) {
                        e = e4;
                        g6Var3 = g6Var;
                        ve0Var = ve0Var2;
                        e6Var = (e6) ve0Var.e;
                        if (e6Var != null) {
                            e6Var.i.setValue(Boolean.FALSE);
                        }
                        e6Var2 = (e6) ve0Var.e;
                        if (e6Var2 != null && e6Var2.g == g6Var3.h) {
                            g6Var3.j = false;
                        }
                        throw e;
                    }
                    ve0Var = ve0Var2;
                } else {
                    if (i != 1 && i != 2) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ve0Var = fo0Var2.h;
                    pqVar3 = fo0Var2.g;
                    c6Var2 = fo0Var2.f;
                    g6Var3 = fo0Var2.e;
                    try {
                        t30.z(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        e6Var = (e6) ve0Var.e;
                        if (e6Var != null) {
                        }
                        e6Var2 = (e6) ve0Var.e;
                        if (e6Var2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = ve0Var.e;
                    obj.getClass();
                    if (((Boolean) ((e6) obj).i.getValue()).booleanValue()) {
                        return fs0.a;
                    }
                    final float q2 = q(fo0Var2.getContext());
                    final ve0 ve0Var3 = ve0Var;
                    final pq pqVar5 = pqVar3;
                    final c6 c6Var3 = c6Var2;
                    final g6 g6Var4 = g6Var3;
                    try {
                        pqVar4 = new pq() { // from class: eo0
                            @Override // defpackage.pq
                            public final Object invoke(Object obj3) {
                                long longValue = ((Long) obj3).longValue();
                                Object obj4 = ve0.this.e;
                                obj4.getClass();
                                u10.k((e6) obj4, longValue, q2, c6Var3, g6Var4, pqVar5);
                                return fs0.a;
                            }
                        };
                        ve0Var = ve0Var3;
                        c6Var2 = c6Var3;
                        g6Var3 = g6Var4;
                        pqVar3 = pqVar5;
                        fo0Var2.e = g6Var3;
                        fo0Var2.f = c6Var2;
                        fo0Var2.g = pqVar3;
                        fo0Var2.h = ve0Var;
                        fo0Var2.j = 2;
                    } catch (CancellationException e6) {
                        e = e6;
                        ve0Var = ve0Var3;
                        g6Var3 = g6Var4;
                        e6Var = (e6) ve0Var.e;
                        if (e6Var != null) {
                        }
                        e6Var2 = (e6) ve0Var.e;
                        if (e6Var2 != null) {
                        }
                        throw e;
                    }
                } while (g(c6Var2, pqVar4, fo0Var2) != dhVar);
                return dhVar;
            }
        }
        fo0Var = new fo0(ngVar);
        fo0Var2 = fo0Var;
        Object obj22 = fo0Var2.i;
        i = fo0Var2.j;
        int i32 = 0;
        dhVar = dh.e;
        if (i != 0) {
        }
        do {
            obj = ve0Var.e;
            obj.getClass();
            if (((Boolean) ((e6) obj).i.getValue()).booleanValue()) {
            }
        } while (g(c6Var2, pqVar4, fo0Var2) != dhVar);
        return dhVar;
    }

    public static float d(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.z6.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.z6.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(oe0 oe0Var, oe0 oe0Var2, oe0 oe0Var3, int i) {
        boolean f = f(i, oe0Var3, oe0Var);
        float f2 = oe0Var3.b;
        float f3 = oe0Var3.d;
        float f4 = oe0Var3.a;
        float f5 = oe0Var3.c;
        float f6 = oe0Var.d;
        float f7 = oe0Var.b;
        float f8 = oe0Var.c;
        float f9 = oe0Var.a;
        if (!f && f(i, oe0Var2, oe0Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            z6.m("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean f(int i, oe0 oe0Var, oe0 oe0Var2) {
        if (i == 3 || i == 4) {
            return oe0Var.d > oe0Var2.b && oe0Var.b < oe0Var2.d;
        }
        if (i == 5 || i == 6) {
            return oe0Var.c > oe0Var2.a && oe0Var.a < oe0Var2.c;
        }
        z6.m("This function should only be used for 2-D focus search");
        return false;
    }

    public static final Object g(c6 c6Var, pq pqVar, fo0 fo0Var) {
        if (!c6Var.a()) {
            return z20.l(fo0Var.getContext()).c(new wr(pqVar, 2), fo0Var);
        }
        if (fo0Var.getContext().j(b2.M) == null) {
            return z20.l(fo0Var.getContext()).c(pqVar, fo0Var);
        }
        z6.c();
        return null;
    }

    public static final void h(yo yoVar, t40 t40Var) {
        if (!yoVar.e.r) {
            cv.b("visitChildren called on an unattached node");
        }
        t40 t40Var2 = new t40(new t20[16]);
        t20 t20Var = yoVar.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var2, t20Var);
        } else {
            t40Var2.b(t20Var2);
        }
        while (true) {
            int i = t40Var2.g;
            if (i == 0) {
                return;
            }
            t20 t20Var3 = (t20) t40Var2.j(i - 1);
            if ((t20Var3.h & 1024) == 0) {
                nh.e(t40Var2, t20Var3);
            } else {
                while (true) {
                    if (t20Var3 == null) {
                        break;
                    }
                    if ((t20Var3.g & 1024) != 0) {
                        t40 t40Var3 = null;
                        while (t20Var3 != null) {
                            if (t20Var3 instanceof yo) {
                                yo yoVar2 = (yo) t20Var3;
                                if (yoVar2.r && !nh.a0(yoVar2).P) {
                                    if (yoVar2.q0().a) {
                                        t40Var.b(yoVar2);
                                    } else {
                                        h(yoVar2, t40Var);
                                    }
                                }
                            } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                int i2 = 0;
                                for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                    if ((t20Var4.g & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            t20Var3 = t20Var4;
                                        } else {
                                            if (t40Var3 == null) {
                                                t40Var3 = new t40(new t20[16]);
                                            }
                                            if (t20Var3 != null) {
                                                t40Var3.b(t20Var3);
                                                t20Var3 = null;
                                            }
                                            t40Var3.b(t20Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            t20Var3 = nh.N(t40Var3);
                        }
                    } else {
                        t20Var3 = t20Var3.j;
                    }
                }
            }
        }
    }

    public static k40 i() {
        long[] jArr = gi0.a;
        return new k40();
    }

    public static float[] j() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void k(e6 e6Var, long j, float f, c6 c6Var, g6 g6Var, pq pqVar) {
        long c = f == 0.0f ? c6Var.c() : (long) ((j - e6Var.c) / f);
        e6Var.g = j;
        e6Var.e.setValue(c6Var.b(c));
        e6Var.f = c6Var.f(c);
        if (c6Var.g(c)) {
            e6Var.h = e6Var.g;
            e6Var.i.setValue(Boolean.FALSE);
        }
        J(e6Var, g6Var);
        pqVar.invoke(e6Var);
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final yo m(t40 t40Var, oe0 oe0Var, int i) {
        oe0 e;
        yo yoVar = null;
        if (i == 3) {
            e = oe0Var.e((oe0Var.c - oe0Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            e = oe0Var.e(-((oe0Var.c - oe0Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            e = oe0Var.e(0.0f, (oe0Var.d - oe0Var.b) + 1.0f);
        } else {
            if (i != 6) {
                z6.m("This function should only be used for 2-D focus search");
                return null;
            }
            e = oe0Var.e(0.0f, -((oe0Var.d - oe0Var.b) + 1.0f));
        }
        Object[] objArr = t40Var.e;
        int i2 = t40Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            yo yoVar2 = (yo) objArr[i3];
            if (kw.y(yoVar2)) {
                oe0 p = kw.p(yoVar2);
                if (v(p, e, oe0Var, i)) {
                    yoVar = yoVar2;
                    e = p;
                }
            }
        }
        return yoVar;
    }

    public static final boolean n(yo yoVar, int i, pq pqVar) {
        oe0 oe0Var;
        t40 t40Var = new t40(new yo[16]);
        h(yoVar, t40Var);
        int i2 = t40Var.g;
        if (i2 <= 1) {
            yo yoVar2 = (yo) (i2 == 0 ? null : t40Var.e[0]);
            if (yoVar2 != null) {
                return ((Boolean) pqVar.invoke(yoVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                oe0 p = kw.p(yoVar);
                float f = p.a;
                float f2 = p.b;
                oe0Var = new oe0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    z6.m("This function should only be used for 2-D focus search");
                    return false;
                }
                oe0 p2 = kw.p(yoVar);
                float f3 = p2.c;
                float f4 = p2.d;
                oe0Var = new oe0(f3, f4, f3, f4);
            }
            yo m = m(t40Var, oe0Var, i);
            if (m != null) {
                return ((Boolean) pqVar.invoke(m)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean o(int i, v5 v5Var, yo yoVar, oe0 oe0Var) {
        if (F(i, v5Var, yoVar, oe0Var)) {
            return true;
        }
        ((uo) nh.b0(yoVar).getFocusOwner()).f();
        kw.O(yoVar);
        return false;
    }

    public static final ez p(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131034216);
            ez ezVar = tag instanceof ez ? (ez) tag : null;
            if (ezVar != null) {
                return ezVar;
            }
            Object l = t30.l(view);
            view = l instanceof View ? (View) l : null;
        }
        return null;
    }

    public static final float q(tg tgVar) {
        a30 a30Var = (a30) tgVar.j(b2.P);
        float r = a30Var != null ? a30Var.r() : 1.0f;
        if (r >= 0.0f) {
            return r;
        }
        fd0.b("negative scale factor");
        return r;
    }

    public static final long r(double d) {
        return B(4294967296L, (float) d);
    }

    public static final long s(int i) {
        return B(4294967296L, i);
    }

    public static final int t(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean u(uj0 uj0Var) {
        qj0 k = uj0Var.k();
        return k.e.c(yj0.z);
    }

    public static final boolean v(oe0 oe0Var, oe0 oe0Var2, oe0 oe0Var3, int i) {
        if (!w(i, oe0Var, oe0Var3)) {
            return false;
        }
        if (w(i, oe0Var2, oe0Var3) && !e(oe0Var3, oe0Var, oe0Var2, i)) {
            return !e(oe0Var3, oe0Var2, oe0Var, i) && x(i, oe0Var3, oe0Var) < x(i, oe0Var3, oe0Var2);
        }
        return true;
    }

    public static final boolean w(int i, oe0 oe0Var, oe0 oe0Var2) {
        if (i == 3) {
            float f = oe0Var2.c;
            float f2 = oe0Var2.a;
            float f3 = oe0Var.c;
            return (f > f3 || f2 >= f3) && f2 > oe0Var.a;
        }
        if (i == 4) {
            float f4 = oe0Var2.a;
            float f5 = oe0Var2.c;
            float f6 = oe0Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < oe0Var.c;
        }
        if (i == 5) {
            float f7 = oe0Var2.d;
            float f8 = oe0Var2.b;
            float f9 = oe0Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > oe0Var.b;
        }
        if (i != 6) {
            z6.m("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = oe0Var2.b;
        float f11 = oe0Var2.d;
        float f12 = oe0Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < oe0Var.d;
    }

    public static final long x(int i, oe0 oe0Var, oe0 oe0Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = oe0Var.a;
            f2 = oe0Var2.c;
        } else if (i == 4) {
            f = oe0Var2.a;
            f2 = oe0Var.c;
        } else if (i == 5) {
            f = oe0Var.b;
            f2 = oe0Var2.d;
        } else {
            if (i != 6) {
                z6.m("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = oe0Var2.b;
            f2 = oe0Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = oe0Var.b;
            f3 = ((oe0Var.d - f7) / 2.0f) + f7;
            f4 = oe0Var2.b;
            f5 = oe0Var2.d;
        } else {
            if (i != 5 && i != 6) {
                z6.m("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = oe0Var.a;
            f3 = ((oe0Var.c - f8) / 2.0f) + f8;
            f4 = oe0Var2.a;
            f5 = oe0Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final long y(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static final void z(float[] fArr, j40 j40Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = j40Var.a;
        float f11 = j40Var.b;
        float f12 = j40Var.c;
        float f13 = j40Var.d;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        j40Var.a = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        j40Var.b = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        j40Var.c = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        j40Var.d = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }
}
