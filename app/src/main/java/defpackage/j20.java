package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class j20 {
    public j20() {
        new ConcurrentHashMap();
    }

    public static final void a(u20 u20Var, gr grVar) {
        s8 s8Var = s8.f;
        int hashCode = Long.hashCode(grVar.Q);
        u20 z = dx0.z(grVar, u20Var);
        xa0 k = grVar.k();
        le.c.getClass();
        grVar.R();
        if (grVar.P) {
            grVar.j();
        } else {
            grVar.b0();
        }
        t30.t(grVar, b2.x, s8Var);
        t30.t(grVar, b2.w, k);
        t30.p(grVar);
        t30.t(grVar, b2.v, z);
        t30.t(grVar, b2.y, Integer.valueOf(hashCode));
        grVar.o(true);
    }

    public static final void c(os osVar, ys0 ys0Var) {
        ArrayList arrayList = ys0Var.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            at0 at0Var = (at0) arrayList.get(i);
            if (at0Var instanceof ct0) {
                y90 y90Var = new y90();
                ct0 ct0Var = (ct0) at0Var;
                y90Var.d = ct0Var.f;
                y90Var.n = true;
                y90Var.c();
                y90Var.s.a.setFillType(ct0Var.g == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                y90Var.c();
                y90Var.c();
                y90Var.b = ct0Var.h;
                y90Var.c();
                y90Var.c = ct0Var.i;
                y90Var.c();
                y90Var.g = ct0Var.j;
                y90Var.c();
                y90Var.e = ct0Var.k;
                y90Var.c();
                y90Var.f = ct0Var.l;
                y90Var.o = true;
                y90Var.c();
                y90Var.h = ct0Var.m;
                y90Var.o = true;
                y90Var.c();
                y90Var.i = ct0Var.n;
                y90Var.o = true;
                y90Var.c();
                y90Var.j = ct0Var.o;
                y90Var.o = true;
                y90Var.c();
                y90Var.k = ct0Var.p;
                y90Var.p = true;
                y90Var.c();
                y90Var.l = ct0Var.q;
                y90Var.p = true;
                y90Var.c();
                y90Var.m = ct0Var.r;
                y90Var.p = true;
                y90Var.c();
                osVar.e(i, y90Var);
            } else if (at0Var instanceof ys0) {
                os osVar2 = new os();
                ys0 ys0Var2 = (ys0) at0Var;
                osVar2.k = ys0Var2.e;
                osVar2.c();
                osVar2.l = ys0Var2.f;
                osVar2.s = true;
                osVar2.c();
                osVar2.o = ys0Var2.i;
                osVar2.s = true;
                osVar2.c();
                osVar2.p = ys0Var2.j;
                osVar2.s = true;
                osVar2.c();
                osVar2.q = ys0Var2.k;
                osVar2.s = true;
                osVar2.c();
                osVar2.r = ys0Var2.l;
                osVar2.s = true;
                osVar2.c();
                osVar2.m = ys0Var2.g;
                osVar2.s = true;
                osVar2.c();
                osVar2.n = ys0Var2.h;
                osVar2.s = true;
                osVar2.c();
                osVar2.f = ys0Var2.m;
                osVar2.g = true;
                osVar2.c();
                c(osVar2, ys0Var2);
                osVar.e(i, osVar2);
            }
        }
    }

    public static final iu0 d(View view) {
        while (view != null) {
            Object tag = view.getTag(2131034220);
            iu0 iu0Var = tag instanceof iu0 ? (iu0) tag : null;
            if (iu0Var != null) {
                return iu0Var;
            }
            Object l = t30.l(view);
            view = l instanceof View ? (View) l : null;
        }
        return null;
    }

    public static final nj0 e(Object obj) {
        if (obj != kw.f) {
            return (nj0) obj;
        }
        z6.m("Does not contain segment");
        return null;
    }

    public static final boolean f(Object obj) {
        return obj == kw.f;
    }

    public static mk0 g(tq tqVar) {
        mk0 mk0Var = new mk0();
        mk0Var.g = lr0.h(mk0Var, mk0Var, tqVar);
        return mk0Var;
    }

    public static ql0 h(ql0 ql0Var) {
        if (ql0Var instanceof ar0) {
            ar0 ar0Var = (ar0) ql0Var;
            if (ar0Var.t == v10.c()) {
                ar0Var.r = null;
                return ql0Var;
            }
        }
        if (ql0Var instanceof br0) {
            br0 br0Var = (br0) ql0Var;
            if (br0Var.i == v10.c()) {
                br0Var.h = null;
                return ql0Var;
            }
        }
        ql0 e = xl0.e(ql0Var, null, false);
        e.j();
        return e;
    }

    public static v00 i(rg0 rg0Var, int i, int i2, int i3, int i4, int i5, w00 w00Var, List list, ec0[] ec0VarArr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        float f2 = 0.0f;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            w10 w10Var = (w10) list2.get(i12);
            long j2 = j;
            Object e = w10Var.e();
            sg0 sg0Var = e instanceof sg0 ? (sg0) e : null;
            float f3 = sg0Var != null ? sg0Var.a : 0.0f;
            if (f3 > 0.0f) {
                f2 += f3;
                i13++;
            } else {
                int i16 = i3 - i14;
                ec0 ec0Var = ec0VarArr[i12];
                if (ec0Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i9 = i16;
                        i10 = Integer.MAX_VALUE;
                    } else if (i16 < 0) {
                        i9 = i16;
                        i10 = 0;
                    } else {
                        i10 = i16;
                        i9 = i10;
                    }
                    ec0Var = w10Var.b(rg0Var.b(0, i10, i4, false));
                } else {
                    i9 = i16;
                }
                int e2 = rg0Var.e(ec0Var);
                int c = rg0Var.c(ec0Var);
                iArr[i12] = e2;
                int i17 = i9 - e2;
                if (i17 < 0) {
                    i17 = 0;
                }
                i15 = Math.min(i5, i17);
                i14 += e2 + i15;
                i11 = Math.max(i11, c);
                ec0VarArr[i12] = ec0Var;
            }
            i12++;
            j = j2;
        }
        long j3 = j;
        if (i13 == 0) {
            i14 -= i15;
            i7 = 0;
        } else {
            long j4 = (i13 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i14) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f4 = j5 / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                Object e3 = ((w10) list2.get(i18)).e();
                j5 -= Math.round(((e3 instanceof sg0 ? (sg0) e3 : null) != null ? r14.a : 0.0f) * f4);
            }
            int i19 = 0;
            int i20 = 0;
            while (i20 < i6) {
                if (ec0VarArr[i20] == null) {
                    w10 w10Var2 = (w10) list2.get(i20);
                    Object e4 = w10Var2.e();
                    f = f4;
                    sg0 sg0Var2 = e4 instanceof sg0 ? (sg0) e4 : null;
                    float f5 = sg0Var2 != null ? sg0Var2.a : 0.0f;
                    if (f5 <= 0.0f) {
                        av.b("All weights <= 0 should have placeables");
                    }
                    float f6 = f5;
                    int signum = Long.signum(j5);
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f6 * f) + signum);
                    if ((sg0Var2 != null ? sg0Var2.b : true) && max != Integer.MAX_VALUE) {
                        i8 = max;
                        ec0 b = w10Var2.b(rg0Var.b(i8, max, i4, true));
                        int e5 = rg0Var.e(b);
                        int c2 = rg0Var.c(b);
                        iArr[i20] = e5;
                        i19 += e5;
                        int max2 = Math.max(i11, c2);
                        ec0VarArr[i20] = b;
                        i11 = max2;
                    }
                    i8 = 0;
                    ec0 b2 = w10Var2.b(rg0Var.b(i8, max, i4, true));
                    int e52 = rg0Var.e(b2);
                    int c22 = rg0Var.c(b2);
                    iArr[i20] = e52;
                    i19 += e52;
                    int max22 = Math.max(i11, c22);
                    ec0VarArr[i20] = b2;
                    i11 = max22;
                } else {
                    f = f4;
                }
                i20++;
                list2 = list;
                f4 = f;
            }
            i7 = (int) (i19 + j4);
            int i21 = i3 - i14;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
        }
        int i22 = i7 + i14;
        if (i22 < 0) {
            i22 = 0;
        }
        int max3 = Math.max(i22, i);
        int max4 = Math.max(i11, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        rg0Var.d(max3, w00Var, iArr, iArr2);
        return rg0Var.a(ec0VarArr, w00Var, iArr2, max3, max4);
    }

    public static final t20 j(ni niVar, int i) {
        t20 t20Var = ((t20) niVar).e.j;
        if (t20Var == null || (t20Var.h & i) == 0) {
            return null;
        }
        while (t20Var != null) {
            int i2 = t20Var.g;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return t20Var;
            }
            t20Var = t20Var.j;
        }
        return null;
    }

    public static Object k(xc xcVar, eq eqVar) {
        ql0 ar0Var;
        ql0 ql0Var = (ql0) xl0.b.n();
        if (ql0Var instanceof ar0) {
            ar0 ar0Var2 = (ar0) ql0Var;
            if (ar0Var2.t == v10.c()) {
                pq pqVar = ar0Var2.r;
                pq pqVar2 = ar0Var2.s;
                try {
                    ((ar0) ql0Var).r = xl0.i(xcVar, pqVar, true);
                    ((ar0) ql0Var).s = pqVar2;
                    return eqVar.b();
                } finally {
                    ar0Var2.r = pqVar;
                    ar0Var2.s = pqVar2;
                }
            }
        }
        if (ql0Var == null || (ql0Var instanceof o40)) {
            ar0Var = new ar0(ql0Var instanceof o40 ? (o40) ql0Var : null, xcVar, null, true, false);
        } else {
            ar0Var = ql0Var.u(xcVar);
        }
        try {
            ql0 j = ar0Var.j();
            try {
                Object b = eqVar.b();
                ql0.q(j);
                ar0Var.c();
                return b;
            } catch (Throwable th) {
                ql0.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            ar0Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02d0  */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(ViewStructure viewStructure, iy iyVar, AutofillId autofillId, String str, qe0 qe0Var) {
        int i;
        boolean z;
        long j;
        long j2;
        char c;
        long j3;
        boolean z2;
        a4 a4Var;
        p6 p6Var;
        l4 l4Var;
        qq0 qq0Var;
        jg0 jg0Var;
        boolean z3;
        kg kgVar;
        Boolean bool;
        boolean z4;
        Integer num;
        Object obj;
        List list;
        Integer valueOf;
        iy iyVar2;
        boolean z5;
        String[] p;
        String p2;
        String[] p3;
        String[] p4;
        int i2;
        int i3;
        boolean z6;
        a4 a4Var2;
        qq0 qq0Var2;
        p6 p6Var2;
        l4 l4Var2;
        jg0 jg0Var2;
        boolean z7;
        ak0 ak0Var = yj0.a;
        ak0 ak0Var2 = pj0.a;
        qj0 q = iyVar.q();
        boolean z8 = true;
        if (q != null) {
            k40 k40Var = q.e;
            j = 128;
            Object[] objArr = k40Var.b;
            Object[] objArr2 = k40Var.c;
            long[] jArr = k40Var.a;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                z2 = true;
                int i4 = 0;
                a4Var2 = null;
                z3 = false;
                qq0Var2 = null;
                p6Var2 = null;
                l4Var2 = null;
                kgVar = null;
                bool = null;
                jg0Var2 = null;
                z4 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i4];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj2 = objArr[i7];
                                Object obj3 = objArr2[i7];
                                ak0 ak0Var3 = (ak0) obj2;
                                if (lw.i(ak0Var3, yj0.s)) {
                                    obj3.getClass();
                                    a4Var2 = (a4) obj3;
                                } else if (lw.i(ak0Var3, yj0.a)) {
                                    obj3.getClass();
                                    String str2 = (String) ac.a0((List) obj3);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (lw.i(ak0Var3, yj0.r)) {
                                    obj3.getClass();
                                    kgVar = (kg) obj3;
                                } else if (lw.i(ak0Var3, yj0.t)) {
                                    obj3.getClass();
                                    l4Var2 = (l4) obj3;
                                } else if (lw.i(ak0Var3, yj0.E)) {
                                    obj3.getClass();
                                    p6Var2 = (p6) obj3;
                                } else if (lw.i(ak0Var3, yj0.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (lw.i(ak0Var3, yj0.N)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (lw.i(ak0Var3, yj0.K)) {
                                    z4 = z8;
                                } else if (lw.i(ak0Var3, yj0.o)) {
                                    obj3.getClass();
                                    z2 = ((Boolean) obj3).booleanValue();
                                } else if (lw.i(ak0Var3, yj0.x)) {
                                    obj3.getClass();
                                    jg0Var2 = (jg0) obj3;
                                } else if (lw.i(ak0Var3, yj0.H)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (lw.i(ak0Var3, yj0.I)) {
                                    obj3.getClass();
                                    qq0Var2 = (qq0) obj3;
                                } else if (lw.i(ak0Var3, pj0.b)) {
                                    viewStructure.setClickable(z8);
                                } else if (lw.i(ak0Var3, pj0.c)) {
                                    viewStructure.setLongClickable(z8);
                                } else if (lw.i(ak0Var3, pj0.u)) {
                                    viewStructure.setFocusable(z8);
                                } else if (lw.i(ak0Var3, pj0.j)) {
                                    z3 = z8;
                                }
                                z7 = z8;
                                if (Build.VERSION.SDK_INT >= 34 && lw.i(ak0Var3, kw.r)) {
                                    obj = obj3;
                                }
                            } else {
                                z7 = z8;
                            }
                            j4 >>= 8;
                            i6++;
                            z8 = z7;
                        }
                        z6 = z8;
                        z6 = z6;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        z6 = z8;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    z8 = z6 ? 1 : 0;
                }
            } else {
                z6 = true;
                c = 7;
                j3 = -9187201950435737472L;
                z2 = true;
                a4Var2 = null;
                z3 = false;
                qq0Var2 = null;
                p6Var2 = null;
                l4Var2 = null;
                kgVar = null;
                bool = null;
                jg0Var2 = null;
                z4 = false;
                num = null;
                obj = null;
            }
            a4Var = a4Var2;
            qq0Var = qq0Var2;
            p6Var = p6Var2;
            l4Var = l4Var2;
            jg0Var = jg0Var2;
            z = z6;
        } else {
            i = 2;
            z = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z2 = true;
            a4Var = null;
            p6Var = null;
            l4Var = null;
            qq0Var = null;
            jg0Var = null;
            z3 = false;
            kgVar = null;
            bool = null;
            z4 = false;
            num = null;
            obj = null;
        }
        qj0 q2 = iyVar.q();
        if (q2 != null && q2.g && !q2.h) {
            q2 = q2.b();
            h40 h40Var = new h40(((q40) iyVar.i()).e.g);
            h40Var.c(iyVar.i());
            while (h40Var.j()) {
                iy iyVar3 = (iy) h40Var.l(h40Var.b - 1);
                qj0 q3 = iyVar3.q();
                if (q3 != null && !q3.g) {
                    q2.d(q3);
                    if (!q3.h) {
                        h40Var.c(iyVar3.i());
                    }
                }
            }
        }
        if (q2 != null) {
            k40 k40Var2 = q2.e;
            Object[] objArr3 = k40Var2.b;
            Object[] objArr4 = k40Var2.c;
            long[] jArr2 = k40Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 8;
                list = null;
                int i9 = 0;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j5 & j2) < j) {
                                int i12 = (i9 << 3) + i11;
                                Object obj4 = objArr5[i12];
                                Object obj5 = objArr4[i12];
                                i3 = i8;
                                ak0 ak0Var4 = (ak0) obj4;
                                i2 = i11;
                                if (lw.i(ak0Var4, yj0.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (lw.i(ak0Var4, yj0.A)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i2 = i11;
                                i3 = i8;
                            }
                            j5 >>= i3;
                            i11 = i2 + 1;
                            i8 = i3;
                        }
                        if (i10 != i8) {
                            break;
                        }
                    }
                    int i13 = i9;
                    if (i13 == length2) {
                        break;
                    }
                    i9 = i13 + 1;
                    objArr3 = objArr5;
                    jArr2 = jArr3;
                }
                Integer valueOf2 = Integer.valueOf(iyVar.f);
                if (iyVar.n() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = a4Var == null ? Integer.valueOf(a4Var.a) : z3 ? Integer.valueOf((int) z) : qq0Var != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (p6Var != null) {
                    String str3 = p6Var.f;
                    int length3 = str3.length();
                    String str4 = str3;
                    if (length3 > 5000) {
                        str4 = (Character.isHighSurrogate(str3.charAt(4999)) && Character.isLowSurrogate(str3.charAt(5000))) ? ln0.L(str3, 4999) : ln0.L(str3, 5000);
                    }
                    viewStructure.setAutofillValue(AutofillValue.forText(str4));
                }
                if (l4Var != null) {
                    viewStructure.setAutofillValue(l4Var.a);
                }
                if (kgVar != null && (p4 = lr0.p(kgVar)) != null) {
                    viewStructure.setAutofillHints(p4);
                }
                iyVar2 = (iy) qe0Var.a.b(iyVar.f);
                if (iyVar2 != null && iyVar2.k != -4) {
                    t4 t4Var = qe0Var.c;
                    int d = qe0Var.d(iyVar2);
                    long[] jArr4 = (long[]) t4Var.b;
                    long j6 = jArr4[d];
                    long j7 = jArr4[d + 1];
                    int i14 = (int) (j6 >> 32);
                    int i15 = (int) j6;
                    viewStructure.setDimens(i14, i15, 0, 0, ((int) (j7 >> 32)) - i14, ((int) j7) - i15);
                }
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (qq0Var == null) {
                    viewStructure.setCheckable(z);
                    viewStructure.setChecked(qq0Var == qq0.e);
                } else if (bool != null && (jg0Var == null || jg0Var.a != 4)) {
                    z5 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    kg.a.getClass();
                    p = lr0.p(jg.b);
                    p.getClass();
                    if (p.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    boolean z9 = (z4 || ((kgVar == null || (p3 = lr0.p(kgVar)) == null || o7.Y(p3, p[0]) < 0) ? false : z5)) ? z5 : false;
                    viewStructure.setDataIsSensitive((z9 || z2) ? z5 : false);
                    viewStructure.setVisibility(iyVar.H.d.J0() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        String str5 = "";
                        for (int i16 = 0; i16 < size; i16++) {
                            str5 = ((Object) str5) + ((p6) list.get(i16)).f + "\n";
                        }
                        viewStructure.setText(str5);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((q40) iyVar.i()).isEmpty() && jg0Var != null && (p2 = v10.p(jg0Var.a)) != null) {
                        viewStructure.setClassName(p2);
                    }
                    if (z3) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (z9) {
                            viewStructure.setInputType(129);
                        }
                    }
                    if (Build.VERSION.SDK_INT < 35 || obj == null) {
                        return;
                    }
                    z6.c();
                    return;
                }
                z5 = true;
                kg.a.getClass();
                p = lr0.p(jg.b);
                p.getClass();
                if (p.length == 0) {
                }
            }
        }
        list = null;
        Integer valueOf22 = Integer.valueOf(iyVar.f);
        if (iyVar.n() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (a4Var == null) {
        }
        if (valueOf != null) {
        }
        if (p6Var != null) {
        }
        if (l4Var != null) {
        }
        if (kgVar != null) {
            viewStructure.setAutofillHints(p4);
        }
        iyVar2 = (iy) qe0Var.a.b(iyVar.f);
        if (iyVar2 != null) {
            t4 t4Var2 = qe0Var.c;
            int d2 = qe0Var.d(iyVar2);
            long[] jArr42 = (long[]) t4Var2.b;
            long j62 = jArr42[d2];
            long j72 = jArr42[d2 + 1];
            int i142 = (int) (j62 >> 32);
            int i152 = (int) j62;
            viewStructure.setDimens(i142, i152, 0, 0, ((int) (j72 >> 32)) - i142, ((int) j72) - i152);
        }
        if (bool != null) {
        }
        if (qq0Var == null) {
        }
        z5 = true;
        kg.a.getClass();
        p = lr0.p(jg.b);
        p.getClass();
        if (p.length == 0) {
        }
    }

    public static i20 m(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    i20 i20Var = new i20();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    i20Var.h = duplicate;
                    i20Var.e = position;
                    int i6 = position - duplicate.getInt(position);
                    i20Var.f = i6;
                    i20Var.g = ((ByteBuffer) i20Var.h).getShort(i6);
                    return i20Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final bt0 n(wt wtVar, se seVar) {
        gr grVar = (gr) seVar;
        si siVar = (si) grVar.i(kf.h);
        float f = wtVar.j;
        boolean d = grVar.d((Float.floatToRawIntBits(siVar.k()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object G = grVar.G();
        if (d || G == re.a) {
            os osVar = new os();
            c(osVar, wtVar.f);
            float f2 = wtVar.b;
            float f3 = wtVar.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(siVar.o(f2)) << 32) | (Float.floatToRawIntBits(siVar.o(f3)) & 4294967295L);
            float f4 = wtVar.d;
            float f5 = wtVar.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            bt0 bt0Var = new bt0(osVar);
            String str = wtVar.a;
            long j = wtVar.g;
            l8 l8Var = j != 16 ? new l8(j, wtVar.h) : null;
            boolean z = wtVar.i;
            bt0Var.e.setValue(new hl0(floatToRawIntBits));
            bt0Var.f.setValue(Boolean.valueOf(z));
            ws0 ws0Var = bt0Var.g;
            ws0Var.g.setValue(l8Var);
            ws0Var.i.setValue(new hl0(floatToRawIntBits2));
            ws0Var.c = str;
            grVar.Y(bt0Var);
            G = bt0Var;
        }
        return (bt0) G;
    }

    public static void o(ic0 ic0Var) {
        cn0 cn0Var;
        hb0 hb0Var;
        hb0 hb0Var2;
        do {
            cn0Var = le0.y;
            hb0Var = (hb0) cn0Var.getValue();
            ya0 ya0Var = hb0Var.g;
            yz yzVar = (yz) ya0Var.get(ic0Var);
            if (yzVar == null) {
                hb0Var2 = hb0Var;
            } else {
                Object obj = yzVar.a;
                Object obj2 = yzVar.b;
                fr0 fr0Var = ya0Var.e;
                fr0 v = fr0Var.v(ic0Var != null ? ic0Var.hashCode() : 0, 0, ic0Var);
                if (fr0Var != v) {
                    ya0Var = v == null ? ya0.g : new ya0(v, ya0Var.f - 1);
                }
                b2 b2Var = b2.I;
                if (obj != b2Var) {
                    Object obj3 = ya0Var.get(obj);
                    obj3.getClass();
                    ya0Var = ya0Var.a(obj, new yz(((yz) obj3).a, obj2));
                }
                if (obj2 != b2Var) {
                    Object obj4 = ya0Var.get(obj2);
                    obj4.getClass();
                    ya0Var = ya0Var.a(obj2, new yz(obj, ((yz) obj4).b));
                }
                Object obj5 = obj != b2Var ? hb0Var.e : obj2;
                if (obj2 != b2Var) {
                    obj = hb0Var.f;
                }
                hb0Var2 = new hb0(obj5, obj, ya0Var);
            }
            if (hb0Var == hb0Var2) {
                return;
            }
        } while (!cn0Var.i(hb0Var, hb0Var2));
    }

    public static void p(ql0 ql0Var, ql0 ql0Var2, pq pqVar) {
        if (ql0Var != ql0Var2) {
            ql0Var2.getClass();
            ql0.q(ql0Var);
            ql0Var2.c();
        } else if (ql0Var instanceof ar0) {
            ((ar0) ql0Var).r = pqVar;
        } else if (ql0Var instanceof br0) {
            ((br0) ql0Var).h = pqVar;
        } else {
            z6.e(ql0Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final Object q(oq0 oq0Var, tq tqVar) {
        Object hdVar;
        Object P;
        q3.y(oq0Var, true, new wj(q3.v(oq0Var.h.getContext()).e(oq0Var.i, oq0Var, oq0Var.g)));
        try {
            if (tqVar instanceof b8) {
                lr0.e(2, tqVar);
                hdVar = tqVar.invoke(oq0Var, oq0Var);
            } else {
                hdVar = lr0.O(tqVar, oq0Var, oq0Var);
            }
        } catch (Throwable th) {
            hdVar = new hd(th, false);
        }
        dh dhVar = dh.e;
        if (hdVar == dhVar || (P = oq0Var.P(hdVar)) == dx0.m) {
            return dhVar;
        }
        if (P instanceof hd) {
            Throwable th2 = ((hd) P).a;
            if (!(th2 instanceof nq0)) {
                throw th2;
            }
            if (((nq0) th2).e != oq0Var) {
                throw th2;
            }
            if (hdVar instanceof hd) {
                throw ((hd) hdVar).a;
            }
        } else {
            hdVar = dx0.G(P);
        }
        return hdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(long j, tq tqVar, og ogVar) {
        pq0 pq0Var;
        int i;
        ve0 ve0Var;
        if (ogVar instanceof pq0) {
            pq0Var = (pq0) ogVar;
            int i2 = pq0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pq0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = pq0Var.f;
                i = pq0Var.g;
                if (i != 0) {
                    t30.z(obj);
                    if (j > 0) {
                        ve0 ve0Var2 = new ve0();
                        try {
                            pq0Var.e = ve0Var2;
                            pq0Var.g = 1;
                            oq0 oq0Var = new oq0(j, pq0Var);
                            ve0Var2.e = oq0Var;
                            Object q = q(oq0Var, tqVar);
                            dh dhVar = dh.e;
                            return q == dhVar ? dhVar : q;
                        } catch (nq0 e) {
                            e = e;
                            ve0Var = ve0Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ve0Var = pq0Var.e;
                try {
                    t30.z(obj);
                    return obj;
                } catch (nq0 e2) {
                    e = e2;
                }
                if (e.e != ve0Var.e) {
                    throw e;
                }
                return null;
            }
        }
        pq0Var = new pq0(ogVar);
        Object obj2 = pq0Var.f;
        i = pq0Var.g;
        if (i != 0) {
        }
        if (e.e != ve0Var.e) {
        }
        return null;
    }

    public abstract Typeface b(Context context, zp[] zpVarArr);
}
