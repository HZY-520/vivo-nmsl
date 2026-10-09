package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class uj0 {
    public final t20 a;
    public final boolean b;
    public final iy c;
    public final qj0 d;
    public uj0 e;
    public final int f;

    public uj0(t20 t20Var, boolean z, iy iyVar, qj0 qj0Var) {
        this.a = t20Var;
        this.b = z;
        this.c = iyVar;
        this.d = qj0Var;
        this.f = iyVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final oe0 a(d60 d60Var) {
        oi oiVar;
        uj0 l = l();
        if (l == null) {
            return oe0.e;
        }
        t20 t20Var = l.c.H.f;
        if ((t20Var.h & 8) != 0) {
            loop0: while (t20Var != null) {
                if ((t20Var.g & 8) != 0) {
                    oiVar = t20Var;
                    ?? r5 = 0;
                    while (oiVar != 0) {
                        if (oiVar instanceof sj0) {
                            if (oiVar.c()) {
                                break loop0;
                            }
                        } else if ((oiVar.g & 8) != 0 && (oiVar instanceof oi)) {
                            t20 t20Var2 = oiVar.t;
                            int i = 0;
                            oiVar = oiVar;
                            r5 = r5;
                            while (t20Var2 != null) {
                                if ((t20Var2.g & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        oiVar = t20Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new t40(new t20[16]);
                                        }
                                        if (oiVar != 0) {
                                            r5.b(oiVar);
                                            oiVar = 0;
                                        }
                                        r5.b(t20Var2);
                                    }
                                }
                                t20Var2 = t20Var2.j;
                                oiVar = oiVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        oiVar = nh.N(r5);
                    }
                }
                if ((t20Var.h & 8) == 0) {
                    break;
                }
                t20Var = t20Var.j;
            }
        }
        oiVar = 0;
        sj0 sj0Var = (sj0) oiVar;
        d60 Y = sj0Var != null ? nh.Y(sj0Var, 8) : null;
        return Y == null ? l.a(d60Var) : Y.A(d60Var, true);
    }

    public final uj0 b(jg0 jg0Var, pq pqVar) {
        qj0 qj0Var = new qj0();
        qj0Var.g = false;
        qj0Var.h = false;
        pqVar.invoke(qj0Var);
        uj0 uj0Var = new uj0(new tj0(pqVar), false, new iy(true, this.f + (jg0Var != null ? 1000000000 : 2000000000)), qj0Var);
        uj0Var.e = this;
        return uj0Var;
    }

    public final void c(iy iyVar, ArrayList arrayList) {
        t40 s = iyVar.s();
        Object[] objArr = s.e;
        int i = s.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            if (iyVar2.B() && !iyVar2.P) {
                if (iyVar2.H.c(8)) {
                    arrayList.add(t30.a(iyVar2, this.b));
                } else {
                    c(iyVar2, arrayList);
                }
            }
        }
    }

    public final d60 d() {
        if (!n()) {
            sj0 f = f();
            return f != null ? nh.Y(f, 8) : this.c.H.c;
        }
        uj0 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            uj0 uj0Var = (uj0) arrayList.get(size2);
            if (uj0Var.o()) {
                arrayList2.add(uj0Var);
            } else if (!uj0Var.d.h) {
                uj0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sj0 f() {
        t20 t20Var;
        boolean z;
        boolean z2 = this.d.g;
        Object obj = null;
        iy iyVar = this.c;
        if (!z2) {
            t20 t20Var2 = iyVar.H.f;
            if ((t20Var2.h & 8) != 0) {
                loop3: while (t20Var2 != null) {
                    if ((t20Var2.g & 8) != 0) {
                        t20Var = t20Var2;
                        t40 t40Var = null;
                        while (t20Var != null) {
                            if (t20Var instanceof sj0) {
                                if (((sj0) t20Var).c()) {
                                    obj = t20Var;
                                }
                            } else if ((t20Var.g & 8) != 0 && (t20Var instanceof oi)) {
                                int i = 0;
                                for (t20 t20Var3 = ((oi) t20Var).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                    if ((t20Var3.g & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            t20Var = t20Var3;
                                        } else {
                                            if (t40Var == null) {
                                                t40Var = new t40(new t20[16]);
                                            }
                                            if (t20Var != null) {
                                                t40Var.b(t20Var);
                                                t20Var = null;
                                            }
                                            t40Var.b(t20Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            t20Var = nh.N(t40Var);
                        }
                    }
                    if ((t20Var2.h & 8) == 0) {
                        break;
                    }
                    t20Var2 = t20Var2.j;
                }
            }
            return (sj0) obj;
        }
        t20 t20Var4 = iyVar.H.f;
        if ((t20Var4.h & 8) != 0) {
            t20Var = null;
            while (t20Var4 != null) {
                if ((t20Var4.g & 8) != 0) {
                    t20 t20Var5 = t20Var4;
                    t40 t40Var2 = null;
                    while (t20Var5 != null) {
                        if (t20Var5 instanceof sj0) {
                            sj0 sj0Var = (sj0) t20Var5;
                            if (sj0Var.c()) {
                                if (sj0Var.R()) {
                                    return sj0Var;
                                }
                                if (t20Var == null) {
                                    t20Var = sj0Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (t20Var5.g & 8) != 0 && (t20Var5 instanceof oi)) {
                            int i2 = 0;
                            for (t20 t20Var6 = ((oi) t20Var5).t; t20Var6 != null; t20Var6 = t20Var6.j) {
                                if ((t20Var6.g & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        t20Var5 = t20Var6;
                                    } else {
                                        if (t40Var2 == null) {
                                            t40Var2 = new t40(new t20[16]);
                                        }
                                        if (t20Var5 != null) {
                                            t40Var2.b(t20Var5);
                                            t20Var5 = null;
                                        }
                                        t40Var2.b(t20Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        t20Var5 = nh.N(t40Var2);
                    }
                }
                if ((t20Var4.h & 8) == 0) {
                    break;
                }
                t20Var4 = t20Var4.j;
            }
            obj = t20Var;
        }
        return (sj0) obj;
    }

    public final oe0 g() {
        d60 d = d();
        if (d != null) {
            if (!d.A0().r) {
                d = null;
            }
            if (d != null) {
                return q3.s(d).A(d, true);
            }
        }
        return oe0.e;
    }

    public final oe0 h() {
        d60 d = d();
        if (d != null) {
            if (!d.A0().r) {
                d = null;
            }
            if (d != null) {
                return q3.e(d, true);
            }
        }
        return oe0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return um.e;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final qj0 k() {
        boolean o = o();
        qj0 qj0Var = this.d;
        if (!o) {
            return qj0Var;
        }
        qj0 b = qj0Var.b();
        p(new ArrayList(), b);
        return b;
    }

    public final uj0 l() {
        iy iyVar;
        uj0 uj0Var = this.e;
        if (uj0Var != null) {
            return uj0Var;
        }
        iy iyVar2 = this.c;
        boolean z = this.b;
        if (z) {
            iyVar = iyVar2.n();
            while (iyVar != null) {
                qj0 q = iyVar.q();
                if (q != null && q.g) {
                    break;
                }
                iyVar = iyVar.n();
            }
        }
        iyVar = null;
        if (iyVar == null) {
            iy n = iyVar2.n();
            while (true) {
                if (n == null) {
                    iyVar = null;
                    break;
                }
                if (n.H.c(8)) {
                    iyVar = n;
                    break;
                }
                n = n.n();
            }
        }
        if (iyVar == null) {
            return null;
        }
        return t30.a(iyVar, z);
    }

    public final oe0 m() {
        Object f = f();
        if (f == null) {
            return this.c.H.c.X0();
        }
        t20 t20Var = ((t20) f).e;
        Object g = this.d.e.g(pj0.b);
        if (g == null) {
            g = null;
        }
        return p30.e(t20Var, g != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.g;
    }

    public final void p(ArrayList arrayList, qj0 qj0Var) {
        if (this.d.h) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            uj0 uj0Var = (uj0) arrayList.get(size2);
            if (!uj0Var.o()) {
                qj0Var.d(uj0Var.d);
                uj0Var.p(arrayList, qj0Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return um.e;
        }
        c(this.c, arrayList);
        if (z) {
            qj0 qj0Var = this.d;
            k40 k40Var = qj0Var.e;
            Object g = k40Var.g(yj0.x);
            if (g == null) {
                g = null;
            }
            jg0 jg0Var = (jg0) g;
            if (jg0Var != null && qj0Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(jg0Var, new l(24, jg0Var)));
            }
            ak0 ak0Var = yj0.a;
            if (k40Var.c(ak0Var) && !arrayList.isEmpty() && qj0Var.g) {
                Object g2 = k40Var.g(ak0Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) ac.a0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new l(25, str)));
                }
            }
        }
        return arrayList;
    }
}
