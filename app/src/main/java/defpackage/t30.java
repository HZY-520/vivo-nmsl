package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class t30 {
    public static final long A(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final void B() {
        throw new UnsupportedOperationException();
    }

    public static aw C(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new aw(i, i2 - 1, 1);
        }
        aw awVar = aw.h;
        return aw.h;
    }

    public static final uj0 a(iy iyVar, boolean z) {
        t20 t20Var = iyVar.H.f;
        Object obj = null;
        if ((t20Var.h & 8) != 0) {
            loop0: while (true) {
                if (t20Var == null) {
                    break;
                }
                if ((t20Var.g & 8) != 0) {
                    t20 t20Var2 = t20Var;
                    t40 t40Var = null;
                    while (t20Var2 != null) {
                        if (t20Var2 instanceof sj0) {
                            obj = t20Var2;
                            break loop0;
                        }
                        if ((t20Var2.g & 8) != 0 && (t20Var2 instanceof oi)) {
                            int i = 0;
                            for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                if ((t20Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        t20Var2 = t20Var3;
                                    } else {
                                        if (t40Var == null) {
                                            t40Var = new t40(new t20[16]);
                                        }
                                        if (t20Var2 != null) {
                                            t40Var.b(t20Var2);
                                            t20Var2 = null;
                                        }
                                        t40Var.b(t20Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        t20Var2 = nh.N(t40Var);
                    }
                }
                if ((t20Var.h & 8) == 0) {
                    break;
                }
                t20Var = t20Var.j;
            }
        }
        obj.getClass();
        t20 t20Var4 = ((t20) ((sj0) obj)).e;
        qj0 q = iyVar.q();
        if (q == null) {
            q = new qj0();
        }
        return new uj0(t20Var4, z, iyVar, q);
    }

    public static void b(StringBuilder sb, Object obj, pq pqVar) {
        if (pqVar != null) {
            sb.append((CharSequence) pqVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean c(vc0 vc0Var) {
        return !vc0Var.h && vc0Var.d;
    }

    public static final boolean d(vc0 vc0Var) {
        return vc0Var.h && !vc0Var.d;
    }

    public static double e(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float f(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final qf0 h(Throwable th) {
        th.getClass();
        return new qf0(th);
    }

    public static final int i(int i, List list) {
        int i2;
        int i3 = ((m90) ac.e0(list)).c;
        if (i > ((m90) ac.e0(list)).c) {
            dv.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        byte b = 0;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            m90 m90Var = (m90) list.get(i2);
            char c = m90Var.b > i ? (char) 1 : m90Var.c <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        dv.a("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + c00.a(list, null, new l0(28, b), 31) + "]");
        return i2;
    }

    public static final int j(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            m90 m90Var = (m90) list.get(i3);
            char c = m90Var.d > i ? (char) 1 : m90Var.e <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final long k(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final ViewParent l(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131034215);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] n(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        o7.T(objArr, objArr2, 0, i, 6);
        o7.R(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final long o(vc0 vc0Var, boolean z) {
        long d = s60.d(vc0Var.c, vc0Var.g);
        if (z || !vc0Var.c()) {
            return d;
        }
        return 0L;
    }

    public static final void p(se seVar) {
        ((gr) seVar).b(new ei0(21), fs0.a);
    }

    public static final Object[] q(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        o7.T(objArr, objArr2, 0, i, 6);
        o7.R(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] r(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        o7.T(objArr, objArr2, 0, i, 6);
        o7.R(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zp0 s(zp0 zp0Var, xx xxVar) {
        long j;
        gp0 gp0Var;
        int i;
        int i2;
        rp0 rp0Var;
        om0 om0Var = zp0Var.a;
        ep0 ep0Var = pm0.d;
        ep0 ep0Var2 = om0Var.a;
        if (ep0Var2.equals(b2.X)) {
            ep0Var2 = pm0.d;
        }
        ep0 ep0Var3 = ep0Var2;
        long j2 = om0Var.b;
        cq0[] cq0VarArr = bq0.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = pm0.a;
        }
        long j3 = j2;
        xp xpVar = om0Var.c;
        if (xpVar == null) {
            xpVar = xp.g;
        }
        xp xpVar2 = xpVar;
        vp vpVar = om0Var.d;
        vp vpVar2 = new vp(vpVar != null ? vpVar.a : 0);
        wp wpVar = om0Var.e;
        wp wpVar2 = new wp(wpVar != null ? wpVar.a : 65535);
        no0 no0Var = om0Var.f;
        if (no0Var == null) {
            no0Var = no0.a;
        }
        no0 no0Var2 = no0Var;
        String str = om0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = om0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = pm0.b;
        }
        long j5 = j4;
        c8 c8Var = om0Var.i;
        float f = c8Var != null ? c8Var.a : 0.0f;
        c8 c8Var2 = new c8(Float.isNaN(f) ? 0.0f : f);
        fp0 fp0Var = om0Var.j;
        if (fp0Var == null) {
            fp0Var = fp0.c;
        }
        fp0 fp0Var2 = fp0Var;
        h00 h00Var = om0Var.k;
        if (h00Var == null) {
            h00 h00Var2 = h00.g;
            h00Var = lw.u();
        }
        h00 h00Var3 = h00Var;
        long j6 = om0Var.l;
        if (j6 == 16) {
            j6 = pm0.c;
        }
        long j7 = j6;
        bp0 bp0Var = om0Var.m;
        if (bp0Var == null) {
            bp0Var = bp0.b;
        }
        bp0 bp0Var2 = bp0Var;
        rk0 rk0Var = om0Var.n;
        if (rk0Var == null) {
            rk0Var = rk0.d;
        }
        rk0 rk0Var2 = rk0Var;
        t10 t10Var = om0Var.o;
        if (t10Var == null) {
            t10Var = nn.o;
        }
        om0 om0Var2 = new om0(ep0Var3, j3, xpVar2, vpVar2, wpVar2, no0Var2, str2, j5, c8Var2, fp0Var2, h00Var3, j7, bp0Var2, rk0Var2, t10Var);
        q90 q90Var = zp0Var.b;
        int i3 = r90.b;
        int i4 = q90Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = q90Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = xxVar.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        z6.j();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = q90Var.c;
            if ((j & 1095216660480L) == 0) {
                j = r90.a;
            }
            gp0Var = q90Var.d;
            if (gp0Var == null) {
                gp0Var = gp0.c;
            }
            nc0 nc0Var = q90Var.e;
            rz rzVar = q90Var.f;
            i = q90Var.g;
            if (i == 0) {
                i = mz.b;
            }
            i2 = q90Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            rp0Var = q90Var.i;
            if (rp0Var == null) {
                rp0Var = rp0.c;
            }
            return new zp0(om0Var2, new q90(i4, i6, j, gp0Var, nc0Var, rzVar, i, i2, rp0Var), zp0Var.c);
        }
        int ordinal2 = xxVar.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            z6.j();
            return null;
        }
        i6 = i5;
        j = q90Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        gp0Var = q90Var.d;
        if (gp0Var == null) {
        }
        nc0 nc0Var2 = q90Var.e;
        rz rzVar2 = q90Var.f;
        i = q90Var.g;
        if (i == 0) {
        }
        i2 = q90Var.h;
        if (i2 == 0) {
        }
        rp0Var = q90Var.i;
        if (rp0Var == null) {
        }
        return new zp0(om0Var2, new q90(i4, i6, j, gp0Var, nc0Var2, rzVar2, i, i2, rp0Var), zp0Var.c);
    }

    public static final void t(se seVar, tq tqVar, Object obj) {
        if (((gr) seVar).P || !lw.i(((gr) seVar).G(), obj)) {
            gr grVar = (gr) seVar;
            grVar.Y(obj);
            grVar.b(tqVar, obj);
        }
    }

    public static final void w(p80 p80Var, int i, Object obj) {
        p80Var.e[(p80Var.f - p80Var.a[p80Var.b - 1].b) + i] = obj;
    }

    public static final void x(p80 p80Var, int i, Object obj, int i2, Object obj2) {
        int i3 = p80Var.f - p80Var.a[p80Var.b - 1].b;
        Object[] objArr = p80Var.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static yv y(aw awVar) {
        awVar.getClass();
        return new yv(awVar.e, awVar.f, awVar.g > 0 ? 2 : -2);
    }

    public static final void z(Object obj) {
        if (obj instanceof qf0) {
            throw ((qf0) obj).e;
        }
    }

    public abstract void u(boolean z);

    public abstract void v(boolean z);
}
