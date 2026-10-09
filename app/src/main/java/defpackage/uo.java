package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class uo implements ro {
    public final e3 a;
    public final e3 b;
    public final po d;
    public e40 f;
    public yo h;
    public final yo c = new yo(2, null, 14);
    public final to e = new to(this);
    public final h40 g = new h40(1);

    public uo(e3 e3Var, e3 e3Var2) {
        this.a = e3Var;
        this.b = e3Var2;
        this.d = new po(this, e3Var2);
    }

    public final boolean a(boolean z) {
        y50 y50Var;
        if (f() != null) {
            yo f = f();
            h(null);
            if (f != null) {
                xo xoVar = xo.e;
                xo xoVar2 = xo.g;
                f.p0(xoVar, xoVar2);
                if (!f.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var = f.e.i;
                iy a0 = nh.a0(f);
                while (a0 != null) {
                    if ((a0.H.f.h & 1024) != 0) {
                        while (t20Var != null) {
                            if ((t20Var.g & 1024) != 0) {
                                t20 t20Var2 = t20Var;
                                t40 t40Var = null;
                                while (t20Var2 != null) {
                                    if (t20Var2 instanceof yo) {
                                        ((yo) t20Var2).p0(xo.f, xoVar2);
                                    } else if ((t20Var2.g & 1024) != 0 && (t20Var2 instanceof oi)) {
                                        int i = 0;
                                        for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                            if ((t20Var3.g & 1024) != 0) {
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
                            t20Var = t20Var.i;
                        }
                    }
                    a0 = a0.n();
                    t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = nh.J(this.c).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    z6.j();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        e3 e3Var = this.a;
        if (e3Var.isFocused() || e3Var.hasFocus()) {
            e3Var.clearFocus();
        } else if (e3Var.hasFocus()) {
            View findFocus = e3Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            e3Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167 A[Catch: all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x0167, B:36:0x016d, B:37:0x0170, B:39:0x017b, B:42:0x0187, B:46:0x0191, B:49:0x0197, B:50:0x019c, B:52:0x01a4, B:54:0x01aa, B:56:0x01ae, B:58:0x01b6, B:60:0x01bc, B:66:0x01c4, B:68:0x01cd, B:69:0x01d1, B:64:0x01d4, B:75:0x01da, B:86:0x01df, B:89:0x01e2, B:91:0x01e8, B:98:0x01ec, B:103:0x01f3, B:105:0x01fb, B:110:0x020b, B:112:0x0210, B:146:0x0214, B:141:0x024d, B:114:0x0217, B:116:0x021d, B:118:0x0221, B:120:0x0229, B:122:0x022f, B:128:0x0237, B:130:0x0240, B:131:0x0244, B:126:0x0247, B:148:0x0252, B:152:0x0262, B:154:0x0267, B:188:0x026b, B:183:0x02ad, B:156:0x0277, B:158:0x027d, B:160:0x0281, B:162:0x0289, B:164:0x028f, B:170:0x0297, B:172:0x02a0, B:173:0x02a4, B:168:0x02a7, B:195:0x02b4, B:197:0x02bb, B:210:0x005b, B:212:0x0061, B:213:0x0064, B:215:0x006c, B:218:0x0078, B:222:0x0082, B:257:0x00d5, B:259:0x00d9, B:224:0x0087, B:226:0x008d, B:228:0x0091, B:230:0x0099, B:232:0x009f, B:238:0x00a7, B:240:0x00b0, B:241:0x00b4, B:236:0x00b7, B:247:0x00bd, B:261:0x00c2, B:264:0x00c5, B:266:0x00cb, B:273:0x00cf, B:278:0x00df, B:280:0x00e5, B:281:0x00e8, B:283:0x00f2, B:286:0x00fe, B:290:0x0108, B:325:0x015b, B:327:0x015f, B:292:0x010d, B:294:0x0113, B:296:0x0117, B:298:0x011f, B:300:0x0125, B:306:0x012d, B:308:0x0136, B:309:0x013a, B:304:0x013d, B:315:0x0143, B:330:0x0148, B:333:0x014b, B:335:0x0151, B:342:0x0155), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [t40] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [t40] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v24, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v28, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v29, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v33, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v41, types: [t20] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [t40] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, eq eqVar) {
        Object obj;
        t20 t20Var;
        y50 y50Var;
        Object obj2;
        y50 y50Var2;
        int size;
        y50 y50Var3;
        boolean z;
        yo yoVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!i(keyEvent)) {
                return false;
            }
            yo m = kw.m(yoVar);
            if (m != null) {
                if (!m.e.r) {
                    cv.b("visitLocalDescendants called on an unattached node");
                }
                t20 t20Var2 = m.e;
                if ((t20Var2.h & 9216) != 0) {
                    t20Var = null;
                    for (t20 t20Var3 = t20Var2.j; t20Var3 != null; t20Var3 = t20Var3.j) {
                        int i = t20Var3.g;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            t20Var = t20Var3;
                        }
                    }
                } else {
                    t20Var = null;
                }
            }
            if (m != null) {
                if (!m.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var4 = m.e;
                iy a0 = nh.a0(m);
                loop11: while (true) {
                    if (a0 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((a0.H.f.h & 8192) != 0) {
                        while (t20Var4 != null) {
                            if ((t20Var4.g & 8192) != 0) {
                                t40 t40Var = null;
                                t20 t20Var5 = t20Var4;
                                while (t20Var5 != null) {
                                    if (t20Var5 instanceof nx) {
                                        obj2 = t20Var5;
                                        break loop11;
                                    }
                                    if ((t20Var5.g & 8192) != 0 && (t20Var5 instanceof oi)) {
                                        t20 t20Var6 = ((oi) t20Var5).t;
                                        int i2 = 0;
                                        t20Var5 = t20Var5;
                                        t40Var = t40Var;
                                        while (t20Var6 != null) {
                                            if ((t20Var6.g & 8192) != 0) {
                                                i2++;
                                                t40Var = t40Var;
                                                if (i2 == 1) {
                                                    t20Var5 = t20Var6;
                                                } else {
                                                    if (t40Var == null) {
                                                        t40Var = new t40(new t20[16]);
                                                    }
                                                    if (t20Var5 != null) {
                                                        t40Var.b(t20Var5);
                                                        t20Var5 = null;
                                                    }
                                                    t40Var.b(t20Var6);
                                                }
                                            }
                                            t20Var6 = t20Var6.j;
                                            t20Var5 = t20Var5;
                                            t40Var = t40Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t20Var5 = nh.N(t40Var);
                                }
                            }
                            t20Var4 = t20Var4.i;
                        }
                    }
                    a0 = a0.n();
                    t20Var4 = (a0 == null || (y50Var2 = a0.H) == null) ? null : y50Var2.e;
                }
                Object obj3 = (nx) obj2;
                if (obj3 != null) {
                    t20Var = ((t20) obj3).e;
                    if (t20Var != null) {
                        if (!t20Var.e.r) {
                            cv.b("visitAncestors called on an unattached node");
                        }
                        t20 t20Var7 = t20Var.e.i;
                        iy a02 = nh.a0(t20Var);
                        ArrayList arrayList = null;
                        while (a02 != null) {
                            if ((a02.H.f.h & 8192) != 0) {
                                while (t20Var7 != null) {
                                    if ((t20Var7.g & 8192) != 0) {
                                        t20 t20Var8 = t20Var7;
                                        t40 t40Var2 = null;
                                        while (t20Var8 != null) {
                                            if (t20Var8 instanceof nx) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(t20Var8);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (t20Var8.g & 8192) != 0 && (t20Var8 instanceof oi)) {
                                                int i3 = 0;
                                                for (t20 t20Var9 = ((oi) t20Var8).t; t20Var9 != null; t20Var9 = t20Var9.j) {
                                                    if ((t20Var9.g & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            t20Var8 = t20Var9;
                                                        } else {
                                                            if (t40Var2 == null) {
                                                                t40Var2 = new t40(new t20[16]);
                                                            }
                                                            if (t20Var8 != null) {
                                                                t40Var2.b(t20Var8);
                                                                t20Var8 = null;
                                                            }
                                                            t40Var2.b(t20Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            t20Var8 = nh.N(t40Var2);
                                        }
                                    }
                                    t20Var7 = t20Var7.i;
                                }
                            }
                            a02 = a02.n();
                            t20Var7 = (a02 == null || (y50Var3 = a02.H) == null) ? null : y50Var3.e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                ((nx) arrayList.get(size)).getClass();
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        oi oiVar = t20Var.e;
                        ?? r0 = 0;
                        while (oiVar != 0) {
                            if (oiVar instanceof nx) {
                            } else if ((oiVar.g & 8192) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var10 = oiVar.t;
                                int i5 = 0;
                                r0 = r0;
                                oiVar = oiVar;
                                while (t20Var10 != null) {
                                    if ((t20Var10.g & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            oiVar = t20Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r0.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r0.b(t20Var10);
                                        }
                                    }
                                    t20Var10 = t20Var10.j;
                                    r0 = r0;
                                    oiVar = oiVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            oiVar = nh.N(r0);
                        }
                        if (((Boolean) eqVar.b()).booleanValue()) {
                            return true;
                        }
                        oi oiVar2 = t20Var.e;
                        ?? r14 = 0;
                        while (oiVar2 != 0) {
                            if (oiVar2 instanceof nx) {
                                if (((nx) oiVar2).F(keyEvent)) {
                                    return true;
                                }
                            } else if ((oiVar2.g & 8192) != 0 && (oiVar2 instanceof oi)) {
                                t20 t20Var11 = oiVar2.t;
                                int i6 = 0;
                                oiVar2 = oiVar2;
                                r14 = r14;
                                while (t20Var11 != null) {
                                    if ((t20Var11.g & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            oiVar2 = t20Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new t40(new t20[16]);
                                            }
                                            if (oiVar2 != 0) {
                                                r14.b(oiVar2);
                                                oiVar2 = 0;
                                            }
                                            r14.b(t20Var11);
                                        }
                                    }
                                    t20Var11 = t20Var11.j;
                                    oiVar2 = oiVar2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            oiVar2 = nh.N(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((nx) arrayList.get(i7)).F(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!yoVar.e.r) {
                cv.b("visitAncestors called on an unattached node");
            }
            t20 t20Var12 = yoVar.e.i;
            iy a03 = nh.a0(yoVar);
            loop15: while (true) {
                if (a03 == null) {
                    obj = null;
                    break;
                }
                if ((a03.H.f.h & 8192) != 0) {
                    while (t20Var12 != null) {
                        if ((t20Var12.g & 8192) != 0) {
                            t20 t20Var13 = t20Var12;
                            t40 t40Var3 = null;
                            while (t20Var13 != null) {
                                if (t20Var13 instanceof nx) {
                                    obj = t20Var13;
                                    break loop15;
                                }
                                if ((t20Var13.g & 8192) != 0 && (t20Var13 instanceof oi)) {
                                    t20 t20Var14 = ((oi) t20Var13).t;
                                    int i8 = 0;
                                    t20Var13 = t20Var13;
                                    t40Var3 = t40Var3;
                                    while (t20Var14 != null) {
                                        if ((t20Var14.g & 8192) != 0) {
                                            i8++;
                                            t40Var3 = t40Var3;
                                            if (i8 == 1) {
                                                t20Var13 = t20Var14;
                                            } else {
                                                if (t40Var3 == null) {
                                                    t40Var3 = new t40(new t20[16]);
                                                }
                                                if (t20Var13 != null) {
                                                    t40Var3.b(t20Var13);
                                                    t20Var13 = null;
                                                }
                                                t40Var3.b(t20Var14);
                                            }
                                        }
                                        t20Var14 = t20Var14.j;
                                        t20Var13 = t20Var13;
                                        t40Var3 = t40Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                t20Var13 = nh.N(t40Var3);
                            }
                        }
                        t20Var12 = t20Var12.i;
                    }
                }
                a03 = a03.n();
                t20Var12 = (a03 == null || (y50Var = a03.H) == null) ? null : y50Var.e;
            }
            Object obj4 = (nx) obj;
            t20Var = obj4 != null ? ((t20) obj4).e : null;
            if (t20Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x010c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, oe0 oe0Var, pq pqVar) {
        boolean d;
        yo yoVar;
        y50 y50Var;
        yo yoVar2 = this.c;
        yo m = kw.m(yoVar2);
        int i2 = 4;
        int i3 = 2;
        e3 e3Var = this.b;
        boolean z = false;
        if (m != null) {
            xx layoutDirection = e3Var.getLayoutDirection();
            vo q0 = m.q0();
            wo woVar = q0.h;
            wo woVar2 = q0.i;
            if (i == 1) {
                woVar = q0.b;
            } else if (i == 2) {
                woVar = q0.c;
            } else if (i == 5) {
                woVar = q0.d;
            } else if (i == 6) {
                woVar = q0.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        z6.j();
                        return null;
                    }
                    woVar = woVar2;
                }
                if (woVar == wo.b) {
                    woVar = null;
                }
                if (woVar == null) {
                    woVar = q0.f;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    woVar = woVar2;
                } else if (ordinal2 != 1) {
                    z6.j();
                    return null;
                }
                if (woVar == wo.b) {
                    woVar = null;
                }
                if (woVar == null) {
                    woVar = q0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    z6.m("invalid FocusDirection");
                    return null;
                }
                uo uoVar = (uo) nh.b0(m).getFocusOwner();
                yo f = uoVar.f();
                if (i == 7) {
                    q0.j.getClass();
                } else {
                    q0.k.getClass();
                }
                woVar = f != uoVar.f() ? wo.d : wo.b;
            }
            wo woVar3 = wo.c;
            if (!lw.i(woVar, woVar3)) {
                if (lw.i(woVar, wo.d)) {
                    yo m2 = kw.m(yoVar2);
                    if (m2 != null) {
                        return (Boolean) pqVar.invoke(m2);
                    }
                } else {
                    wo woVar4 = wo.b;
                    if (!lw.i(woVar, woVar4)) {
                        if (woVar == woVar4) {
                            z6.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (woVar == woVar3) {
                            z6.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        t40 t40Var = woVar.a;
                        int i4 = t40Var.g;
                        if (i4 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = t40Var.e;
                            boolean z2 = false;
                            for (int i5 = 0; i5 < i4; i5++) {
                                a8 a8Var = (a8) objArr[i5];
                                if (!a8Var.e.r) {
                                    cv.b("visitChildren called on an unattached node");
                                }
                                t40 t40Var2 = new t40(new t20[16]);
                                t20 t20Var = a8Var.e;
                                t20 t20Var2 = t20Var.j;
                                if (t20Var2 == null) {
                                    nh.e(t40Var2, t20Var);
                                } else {
                                    t40Var2.b(t20Var2);
                                }
                                while (true) {
                                    int i6 = t40Var2.g;
                                    if (i6 != 0) {
                                        t20 t20Var3 = (t20) t40Var2.j(i6 - 1);
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
                                                            if (((Boolean) pqVar.invoke((yo) t20Var3)).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                                            int i7 = 0;
                                                            for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                                                if ((t20Var4.g & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
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
                                                            if (i7 == 1) {
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
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        m = null;
        xx layoutDirection2 = e3Var.getLayoutDirection();
        v5 v5Var = new v5(m, this, pqVar, i3);
        if (i == 1 || i == 2) {
            if (i == 1) {
                d = z20.i(yoVar2, v5Var);
            } else {
                if (i != 2) {
                    z6.m("This function should only be used for 1-D focus search");
                    return null;
                }
                d = z20.d(yoVar2, v5Var);
            }
            return Boolean.valueOf(d);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return u10.I(i, v5Var, yoVar2, oe0Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    z6.j();
                    return null;
                }
                i2 = 3;
            }
            yo m3 = kw.m(yoVar2);
            if (m3 != null) {
                return u10.I(i2, v5Var, m3, oe0Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(lo.a(i)).toString());
        }
        yo m4 = kw.m(yoVar2);
        if (m4 != null) {
            if (!m4.e.r) {
                cv.b("visitAncestors called on an unattached node");
            }
            t20 t20Var5 = m4.e.i;
            iy a0 = nh.a0(m4);
            loop5: while (a0 != null) {
                if ((a0.H.f.h & 1024) != 0) {
                    while (t20Var5 != null) {
                        if ((t20Var5.g & 1024) != 0) {
                            t20 t20Var6 = t20Var5;
                            t40 t40Var4 = null;
                            while (t20Var6 != null) {
                                if (t20Var6 instanceof yo) {
                                    yo yoVar3 = (yo) t20Var6;
                                    if (yoVar3.q0().a) {
                                        yoVar = yoVar3;
                                        break loop5;
                                    }
                                } else if ((t20Var6.g & 1024) != 0 && (t20Var6 instanceof oi)) {
                                    int i8 = 0;
                                    for (t20 t20Var7 = ((oi) t20Var6).t; t20Var7 != null; t20Var7 = t20Var7.j) {
                                        if ((t20Var7.g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                t20Var6 = t20Var7;
                                            } else {
                                                if (t40Var4 == null) {
                                                    t40Var4 = new t40(new t20[16]);
                                                }
                                                if (t20Var6 != null) {
                                                    t40Var4.b(t20Var6);
                                                    t20Var6 = null;
                                                }
                                                t40Var4.b(t20Var7);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        t20Var6 = nh.N(t40Var4);
                                    }
                                }
                                t20Var6 = nh.N(t40Var4);
                            }
                        }
                        t20Var5 = t20Var5.i;
                    }
                }
                a0 = a0.n();
                t20Var5 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
            }
        }
        yoVar = null;
        if (yoVar != null && yoVar != yoVar2) {
            z = ((Boolean) v5Var.invoke(yoVar)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final yo f() {
        yo yoVar = this.h;
        if (yoVar == null || !yoVar.r) {
            return null;
        }
        return yoVar;
    }

    public final boolean g(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean e = e(i, null, new q2(i, 2));
        boolean booleanValue = e != null ? e.booleanValue() : false;
        if (!booleanValue) {
            c();
        }
        return booleanValue;
    }

    public final void h(yo yoVar) {
        yo yoVar2 = this.h;
        this.h = yoVar;
        h40 h40Var = this.g;
        Object[] objArr = h40Var.a;
        int i = h40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((qo) objArr[i2]).d(yoVar2, yoVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.d * 32, r0 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.o7.X(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
    
        if (r16 == 254) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r17 = r13;
        r13 = (r16 ^ (r16 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | ((r16 & 127) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0185, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018c, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019e, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c7, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        r37 = r7;
        r4.e = defpackage.gi0.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027a, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027e, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0297, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0299, code lost:
    
        r21 = r37 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029b, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.gi0.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021c, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022b, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022d, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0271, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x026b, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0342, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0344, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        int i;
        long j;
        boolean z;
        int i2;
        long b = lr0.b(keyEvent.getKeyCode());
        int r = t10.r(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        boolean z2 = true;
        if (r == 2) {
            e40 e40Var = this.f;
            if (e40Var == null) {
                e40Var = new e40(3);
                this.f = e40Var;
            }
            e40 e40Var2 = e40Var;
            int hashCode = Long.hashCode(b) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 >>> 7;
            int i7 = i5 & 127;
            int i8 = e40Var2.c;
            int i9 = i6 & i8;
            int i10 = 0;
            loop0: while (true) {
                long[] jArr = e40Var2.a;
                int i11 = i9 >> 3;
                int i12 = (i9 & 7) << 3;
                long j3 = (jArr[i11] >>> i12) | ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
                int i13 = i3;
                long j4 = i7;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                    long j7 = j2;
                    if (e40Var2.b[i2] == b) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                i3 = i13;
                j2 = j;
            }
            e40Var2.b[i2] = b;
            return z;
        }
        if (r != 1) {
            return true;
        }
        e40 e40Var3 = this.f;
        if (e40Var3 == null || !e40Var3.a(b)) {
            return false;
        }
        e40 e40Var4 = this.f;
        if (e40Var4 != null) {
            int hashCode2 = Long.hashCode(b) * (-862048943);
            int i14 = hashCode2 ^ (hashCode2 << 16);
            int i15 = i14 & 127;
            int i16 = e40Var4.c;
            int i17 = i14 >>> 7;
            loop5: while (true) {
                int i18 = i17 & i16;
                long[] jArr2 = e40Var4.a;
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                long j8 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
                long j9 = (i15 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i18) & i16;
                    if (e40Var4.b[i] == b) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i4 += 8;
                i17 = i18 + i4;
            }
            if (i >= 0) {
                e40Var4.d--;
                long[] jArr3 = e40Var4.a;
                int i21 = e40Var4.c;
                int i22 = i >> 3;
                int i23 = (i & 7) << 3;
                long j11 = (jArr3[i22] & (~(255 << i23))) | (254 << i23);
                jArr3[i22] = j11;
                jArr3[(((i - 7) & i21) + (i21 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
