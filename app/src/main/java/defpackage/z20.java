package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class z20 {
    public static wt a;
    public static long b;
    public static Method c;

    public static final oe0 a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new oe0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void b(x30 x30Var, int i) {
        if (x30Var.b == 0 || !(x30Var.b(0) == i || x30Var.b(x30Var.b - 1) == i)) {
            int i2 = x30Var.b;
            x30Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int b2 = x30Var.b(i3);
                if (i <= b2) {
                    break;
                }
                x30Var.d(i2, b2);
                i2 = i3;
            }
            x30Var.d(i2, i);
        }
    }

    public static final void c(t3 t3Var, vc0 vc0Var) {
        e10 e10Var = (e10) t3Var.f;
        ht0 ht0Var = e10Var.b;
        ht0 ht0Var2 = e10Var.a;
        boolean c2 = t30.c(vc0Var);
        long j = vc0Var.b;
        if (c2) {
            lh[] lhVarArr = ht0Var2.d;
            Arrays.fill(lhVarArr, 0, lhVarArr.length, (Object) null);
            ht0Var2.e = 0;
            lh[] lhVarArr2 = ht0Var.d;
            Arrays.fill(lhVarArr2, 0, lhVarArr2.length, (Object) null);
            ht0Var.e = 0;
            e10Var.c = 0L;
        }
        if (!t30.d(vc0Var)) {
            List b2 = vc0Var.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                xs xsVar = (xs) b2.get(i);
                e10Var.a(xsVar.a, s60.e(xsVar.e, 0L));
            }
            e10Var.a(j, s60.e(vc0Var.n, 0L));
        }
        if (t30.d(vc0Var) && j - e10Var.c > 40) {
            lh[] lhVarArr3 = ht0Var2.d;
            Arrays.fill(lhVarArr3, 0, lhVarArr3.length, (Object) null);
            ht0Var2.e = 0;
            lh[] lhVarArr4 = ht0Var.d;
            Arrays.fill(lhVarArr4, 0, lhVarArr4.length, (Object) null);
            ht0Var.e = 0;
            e10Var.c = 0L;
        }
        e10Var.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(yo yoVar, v5 v5Var) {
        int ordinal = yoVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (q == null) {
                    z6.m("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = q.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                z6.j();
                                return false;
                            }
                            z6.m("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (d(q, v5Var) || j(yoVar, q, 2, v5Var) || (q.q0().a && ((Boolean) v5Var.invoke(q)).booleanValue())) {
                        return true;
                    }
                }
                return j(yoVar, q, 2, v5Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    z6.j();
                    return false;
                }
                if (!q(yoVar, v5Var)) {
                    if (!(yoVar.q0().a ? ((Boolean) v5Var.invoke(yoVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return q(yoVar, v5Var);
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static kh0 g(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            kh0 kh0Var = new kh0();
            new LinkedHashMap();
            kh0Var.a = new x7(vm.e);
            return kh0Var;
        }
        ClassLoader classLoader = kh0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        m10 m10Var = new m10(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            m10Var.put(str, bundle.get(str));
        }
        m10Var.b();
        m10Var.q = true;
        if (m10Var.m <= 0) {
            m10Var = m10.r;
            m10Var.getClass();
        }
        kh0 kh0Var2 = new kh0();
        new LinkedHashMap();
        kh0Var2.a = new x7(m10Var);
        return kh0Var2;
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean i(yo yoVar, v5 v5Var) {
        int ordinal = yoVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (q != null) {
                    return i(q, v5Var) || j(yoVar, q, 1, v5Var);
                }
                z6.m("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return yoVar.q0().a ? ((Boolean) v5Var.invoke(yoVar)).booleanValue() : r(yoVar, v5Var);
                }
                z6.j();
                return false;
            }
        }
        return r(yoVar, v5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0199 A[EDGE_INSN: B:154:0x0199->B:136:0x0199 BREAK  A[LOOP:5: B:95:0x012e->B:149:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(yo yoVar, yo yoVar2, int i, v5 v5Var) {
        boolean z;
        t20 t20Var;
        iy a0;
        y50 y50Var;
        if (yoVar.t0() == xo.f) {
            yo[] yoVarArr = new yo[16];
            if (!yoVar.e.r) {
                cv.b("visitChildren called on an unattached node");
            }
            t40 t40Var = new t40(new t20[16]);
            t20 t20Var2 = yoVar.e;
            t20 t20Var3 = t20Var2.j;
            if (t20Var3 == null) {
                nh.e(t40Var, t20Var2);
            } else {
                t40Var.b(t20Var3);
            }
            int i2 = 0;
            while (true) {
                int i3 = t40Var.g;
                t20Var = null;
                if (i3 == 0) {
                    break;
                }
                t20 t20Var4 = (t20) t40Var.j(i3 - 1);
                if ((t20Var4.h & 1024) == 0) {
                    nh.e(t40Var, t20Var4);
                } else {
                    while (true) {
                        if (t20Var4 == null) {
                            break;
                        }
                        if ((t20Var4.g & 1024) != 0) {
                            t40 t40Var2 = null;
                            while (t20Var4 != null) {
                                if (t20Var4 instanceof yo) {
                                    yo yoVar3 = (yo) t20Var4;
                                    int i4 = i2 + 1;
                                    if (yoVarArr.length < i4) {
                                        int length = yoVarArr.length;
                                        ?? r11 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(yoVarArr, 0, r11, 0, length);
                                        yoVarArr = r11;
                                    }
                                    yoVarArr[i2] = yoVar3;
                                    i2 = i4;
                                } else if ((t20Var4.g & 1024) != 0 && (t20Var4 instanceof oi)) {
                                    int i5 = 0;
                                    for (t20 t20Var5 = ((oi) t20Var4).t; t20Var5 != null; t20Var5 = t20Var5.j) {
                                        if ((t20Var5.g & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                t20Var4 = t20Var5;
                                            } else {
                                                if (t40Var2 == null) {
                                                    t40Var2 = new t40(new t20[16]);
                                                }
                                                if (t20Var4 != null) {
                                                    t40Var2.b(t20Var4);
                                                    t20Var4 = null;
                                                }
                                                t40Var2.b(t20Var5);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                t20Var4 = nh.N(t40Var2);
                            }
                        } else {
                            t20Var4 = t20Var4.j;
                        }
                    }
                }
            }
            Arrays.sort(yoVarArr, 0, i2, zo.f);
            if (i == 1) {
                aw C = t30.C(0, i2);
                int i6 = C.e;
                int i7 = C.f;
                if (i6 <= i7) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            yo yoVar4 = yoVarArr[i6];
                            if (kw.y(yoVar4) && i(yoVar4, v5Var)) {
                                break;
                            }
                        }
                        if (lw.i(yoVarArr[i6], yoVar2)) {
                            z2 = true;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                    z = true;
                }
                if (i != 1 && yoVar.q0().a) {
                    if (!yoVar.e.r) {
                        cv.b("visitAncestors called on an unattached node");
                    }
                    t20 t20Var6 = yoVar.e.i;
                    a0 = nh.a0(yoVar);
                    loop5: while (true) {
                        if (a0 == null) {
                            break;
                        }
                        if ((a0.H.f.h & 1024) != 0) {
                            while (t20Var6 != null) {
                                if ((t20Var6.g & 1024) != 0) {
                                    t20 t20Var7 = t20Var6;
                                    t40 t40Var3 = null;
                                    while (t20Var7 != null) {
                                        if (t20Var7 instanceof yo) {
                                            t20Var = t20Var7;
                                            break loop5;
                                        }
                                        if ((t20Var7.g & 1024) != 0 && (t20Var7 instanceof oi)) {
                                            int i8 = 0;
                                            for (t20 t20Var8 = ((oi) t20Var7).t; t20Var8 != null; t20Var8 = t20Var8.j) {
                                                if ((t20Var8.g & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        t20Var7 = t20Var8;
                                                    } else {
                                                        if (t40Var3 == null) {
                                                            t40Var3 = new t40(new t20[16]);
                                                        }
                                                        if (t20Var7 != null) {
                                                            t40Var3.b(t20Var7);
                                                            t20Var7 = null;
                                                        }
                                                        t40Var3.b(t20Var8);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        t20Var7 = nh.N(t40Var3);
                                    }
                                }
                                t20Var6 = t20Var6.i;
                            }
                        }
                        a0 = a0.n();
                        t20Var6 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
                    }
                    if (t20Var != null) {
                        z = ((Boolean) v5Var.invoke(yoVar)).booleanValue();
                    }
                }
            } else if (i == 2) {
                aw C2 = t30.C(0, i2);
                int i9 = C2.e;
                int i10 = C2.f;
                if (i9 <= i10) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            yo yoVar5 = yoVarArr[i10];
                            if (kw.y(yoVar5) && d(yoVar5, v5Var)) {
                                break;
                            }
                        }
                        if (lw.i(yoVarArr[i10], yoVar2)) {
                            z3 = true;
                        }
                        if (i10 == i9) {
                            break;
                        }
                        i10--;
                    }
                    z = true;
                }
                if (i != 1) {
                    if (!yoVar.e.r) {
                    }
                    t20 t20Var62 = yoVar.e.i;
                    a0 = nh.a0(yoVar);
                    loop5: while (true) {
                        if (a0 == null) {
                        }
                    }
                    if (t20Var != null) {
                    }
                }
            } else {
                z6.m("This function should only be used for 1-D focus search");
            }
            if (!z) {
                return true;
            }
            ((uo) nh.b0(yoVar).getFocusOwner()).getClass();
            kw.O(yoVar);
            return false;
        }
        z6.m("This function should only be used within a parent that has focus.");
        z = false;
        if (!z) {
        }
    }

    public static final boolean k(zp0 zp0Var) {
        nc0 nc0Var;
        qc0 qc0Var = zp0Var.c;
        om omVar = (qc0Var == null || (nc0Var = qc0Var.a) == null) ? null : new om(nc0Var.b);
        boolean z = false;
        if (omVar != null && omVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final p5 l(tg tgVar) {
        p5 p5Var = (p5) tgVar.j(b2.O);
        if (p5Var != null) {
            return p5Var;
        }
        z6.m("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final Object m(qj0 qj0Var, ak0 ak0Var) {
        Object g = qj0Var.e.g(ak0Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final boolean n(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return tq0.a();
        }
        try {
            Method method = c;
            if (method == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                c = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final long p(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : gc.b(j, gc.c(j) * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean q(yo yoVar, v5 v5Var) {
        yo[] yoVarArr = new yo[16];
        if (!yoVar.e.r) {
            cv.b("visitChildren called on an unattached node");
        }
        t40 t40Var = new t40(new t20[16]);
        t20 t20Var = yoVar.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var, t20Var);
        } else {
            t40Var.b(t20Var2);
        }
        int i = 0;
        while (true) {
            int i2 = t40Var.g;
            if (i2 == 0) {
                break;
            }
            t20 t20Var3 = (t20) t40Var.j(i2 - 1);
            if ((t20Var3.h & 1024) == 0) {
                nh.e(t40Var, t20Var3);
            } else {
                while (true) {
                    if (t20Var3 == null) {
                        break;
                    }
                    if ((t20Var3.g & 1024) != 0) {
                        t40 t40Var2 = null;
                        while (t20Var3 != null) {
                            if (t20Var3 instanceof yo) {
                                yo yoVar2 = (yo) t20Var3;
                                int i3 = i + 1;
                                if (yoVarArr.length < i3) {
                                    int length = yoVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(yoVarArr, 0, r10, 0, length);
                                    yoVarArr = r10;
                                }
                                yoVarArr[i] = yoVar2;
                                i = i3;
                            } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                int i4 = 0;
                                for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                    if ((t20Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t20Var3 = t20Var4;
                                        } else {
                                            if (t40Var2 == null) {
                                                t40Var2 = new t40(new t20[16]);
                                            }
                                            if (t20Var3 != null) {
                                                t40Var2.b(t20Var3);
                                                t20Var3 = null;
                                            }
                                            t40Var2.b(t20Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t20Var3 = nh.N(t40Var2);
                        }
                    } else {
                        t20Var3 = t20Var3.j;
                    }
                }
            }
        }
        Arrays.sort(yoVarArr, 0, i, zo.f);
        int i5 = i - 1;
        if (i5 < yoVarArr.length) {
            while (i5 >= 0) {
                yo yoVar3 = yoVarArr[i5];
                if (kw.y(yoVar3) && d(yoVar3, v5Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean r(yo yoVar, v5 v5Var) {
        yo[] yoVarArr = new yo[16];
        if (!yoVar.e.r) {
            cv.b("visitChildren called on an unattached node");
        }
        t40 t40Var = new t40(new t20[16]);
        t20 t20Var = yoVar.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var, t20Var);
        } else {
            t40Var.b(t20Var2);
        }
        int i = 0;
        while (true) {
            int i2 = t40Var.g;
            if (i2 == 0) {
                break;
            }
            t20 t20Var3 = (t20) t40Var.j(i2 - 1);
            if ((t20Var3.h & 1024) == 0) {
                nh.e(t40Var, t20Var3);
            } else {
                while (true) {
                    if (t20Var3 == null) {
                        break;
                    }
                    if ((t20Var3.g & 1024) != 0) {
                        t40 t40Var2 = null;
                        while (t20Var3 != null) {
                            if (t20Var3 instanceof yo) {
                                yo yoVar2 = (yo) t20Var3;
                                int i3 = i + 1;
                                if (yoVarArr.length < i3) {
                                    int length = yoVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(yoVarArr, 0, r10, 0, length);
                                    yoVarArr = r10;
                                }
                                yoVarArr[i] = yoVar2;
                                i = i3;
                            } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                int i4 = 0;
                                for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                    if ((t20Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t20Var3 = t20Var4;
                                        } else {
                                            if (t40Var2 == null) {
                                                t40Var2 = new t40(new t20[16]);
                                            }
                                            if (t20Var3 != null) {
                                                t40Var2.b(t20Var3);
                                                t20Var3 = null;
                                            }
                                            t40Var2.b(t20Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t20Var3 = nh.N(t40Var2);
                        }
                    } else {
                        t20Var3 = t20Var3.j;
                    }
                }
            }
        }
        Arrays.sort(yoVarArr, 0, i, zo.f);
        for (int i5 = 0; i5 < i; i5++) {
            yo yoVar3 = yoVarArr[i5];
            if (kw.y(yoVar3) && i(yoVar3, v5Var)) {
                return true;
            }
        }
        return false;
    }

    public static final void s(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            cv.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float h = h(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * h);
                }
            }
            float sqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : h(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float h2 = h(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    h2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = h2 / fArr11[i14];
        }
    }

    public static void t(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            e1.e(window);
        } else if (i >= 30) {
            e1.d(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public static final Object u(ji0 ji0Var, ji0 ji0Var2, tq tqVar) {
        Object hdVar;
        Object P;
        try {
            lr0.e(2, tqVar);
            hdVar = tqVar.invoke(ji0Var2, ji0Var);
        } catch (Throwable th) {
            hdVar = new hd(th, false);
        }
        dh dhVar = dh.e;
        if (hdVar == dhVar || (P = ji0Var.P(hdVar)) == dx0.m) {
            return dhVar;
        }
        if (P instanceof hd) {
            throw ((hd) P).a;
        }
        return dx0.G(P);
    }

    public static final int v(x30 x30Var) {
        int b2;
        int i = x30Var.b;
        int b3 = x30Var.b(0);
        while (x30Var.b != 0 && x30Var.b(0) == b3) {
            int i2 = x30Var.b;
            if (i2 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            x30Var.d(0, x30Var.a[i2 - 1]);
            x30Var.c(x30Var.b - 1);
            int i3 = x30Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int b4 = x30Var.b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int b5 = x30Var.b(i7);
                if (i6 >= i3 || (b2 = x30Var.b(i6)) <= b5) {
                    if (b5 > b4) {
                        x30Var.d(i5, b5);
                        x30Var.d(i7, b4);
                        i5 = i7;
                    }
                } else if (b2 > b4) {
                    x30Var.d(i5, b2);
                    x30Var.d(i6, b4);
                    i5 = i6;
                }
            }
        }
        return b3;
    }
}
