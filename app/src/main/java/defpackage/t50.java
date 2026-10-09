package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t50 extends t20 implements dr0, o50 {
    public final o50 s;
    public final l20 t;
    public t50 u;
    public final String v;

    public t50(bj0 bj0Var, l20 l20Var) {
        this.s = bj0Var;
        this.t = l20Var == null ? new l20() : l20Var;
        this.v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.o50
    public final long A(int i, long j, long j2) {
        long A = this.s.A(i, j, j2);
        t50 p0 = this.r ? p0() : null;
        return s60.e(A, p0 != null ? p0.A(i, s60.e(j, A), s60.d(j2, A)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.o50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, ng ngVar) {
        s50 s50Var;
        Object obj;
        int i;
        dh dhVar;
        long j2;
        long j3;
        if (ngVar instanceof s50) {
            s50Var = (s50) ngVar;
            int i2 = s50Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s50Var.h = i2 - Integer.MIN_VALUE;
                obj = s50Var.f;
                i = s50Var.h;
                dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    t50 p0 = this.r ? p0() : null;
                    if (p0 == null) {
                        j2 = 0;
                        long d = ft0.d(j, j2);
                        s50Var.e = j2;
                        s50Var.h = 2;
                        obj = this.s.M(d, s50Var);
                        if (obj != dhVar) {
                            j3 = j2;
                            return new ft0(ft0.e(j3, ((ft0) obj).a));
                        }
                        return dhVar;
                    }
                    s50Var.e = j;
                    s50Var.h = 1;
                    obj = p0.M(j, s50Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = s50Var.e;
                        t30.z(obj);
                        return new ft0(ft0.e(j3, ((ft0) obj).a));
                    }
                    j = s50Var.e;
                    t30.z(obj);
                }
                j2 = ((ft0) obj).a;
                long d2 = ft0.d(j, j2);
                s50Var.e = j2;
                s50Var.h = 2;
                obj = this.s.M(d2, s50Var);
                if (obj != dhVar) {
                }
                return dhVar;
            }
        }
        s50Var = new s50(this, (og) ngVar);
        obj = s50Var.f;
        i = s50Var.h;
        dhVar = dh.e;
        if (i != 0) {
        }
        j2 = ((ft0) obj).a;
        long d22 = ft0.d(j, j2);
        s50Var.e = j2;
        s50Var.h = 2;
        obj = this.s.M(d22, s50Var);
        if (obj != dhVar) {
        }
        return dhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.o50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(long j, long j2, og ogVar) {
        r50 r50Var;
        int i;
        t50 t50Var;
        long j3;
        long j4;
        long j5;
        boolean z;
        long j6;
        long j7;
        if (ogVar instanceof r50) {
            r50Var = (r50) ogVar;
            int i2 = r50Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r50Var.i = i2 - Integer.MIN_VALUE;
                r50 r50Var2 = r50Var;
                Object obj = r50Var2.g;
                i = r50Var2.i;
                t50Var = null;
                dh dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    r50Var2.e = j;
                    r50Var2.f = j2;
                    r50Var2.i = 1;
                    obj = this.s.b0(j, j2, r50Var2);
                    if (obj != dhVar) {
                        j3 = j;
                        j4 = j2;
                    }
                    return dhVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = r50Var2.e;
                    t30.z(obj);
                    j6 = ((ft0) obj).a;
                    j5 = j7;
                    return new ft0(ft0.e(j5, j6));
                }
                j4 = r50Var2.f;
                j3 = r50Var2.e;
                t30.z(obj);
                j5 = ((ft0) obj).a;
                z = this.r;
                if (z) {
                    t50Var = this.u;
                } else if (z) {
                    t50Var = p0();
                }
                if (t50Var != null) {
                    j6 = 0;
                    return new ft0(ft0.e(j5, j6));
                }
                long e = ft0.e(j3, j5);
                long d = ft0.d(j4, j5);
                r50Var2.e = j5;
                r50Var2.i = 2;
                obj = t50Var.b0(e, d, r50Var2);
                if (obj != dhVar) {
                    j7 = j5;
                    j6 = ((ft0) obj).a;
                    j5 = j7;
                    return new ft0(ft0.e(j5, j6));
                }
                return dhVar;
            }
        }
        r50Var = new r50(this, ogVar);
        r50 r50Var22 = r50Var;
        Object obj2 = r50Var22.g;
        i = r50Var22.i;
        t50Var = null;
        dh dhVar2 = dh.e;
        if (i != 0) {
        }
        j5 = ((ft0) obj2).a;
        z = this.r;
        if (z) {
        }
        if (t50Var != null) {
        }
    }

    @Override // defpackage.o50
    public final long f(long j, int i) {
        t50 p0 = this.r ? p0() : null;
        long f = p0 != null ? p0.f(j, i) : 0L;
        return s60.e(f, this.s.f(s60.d(j, f), i));
    }

    @Override // defpackage.t20
    public final void g0() {
        l20 l20Var = this.t;
        l20Var.e = this;
        l20Var.f = null;
        this.u = null;
        l20Var.g = new f5(9, this);
        l20Var.h = c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [t20] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.t20
    public final void h0() {
        y50 y50Var;
        ve0 ve0Var = new ve0();
        r2 r2Var = new r2(ve0Var, 2);
        t50 t50Var = this;
        if (!t50Var.e.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var = t50Var.e.i;
        iy a0 = nh.a0(this);
        loop0: while (a0 != null) {
            if ((a0.H.f.h & 262144) != 0) {
                while (t20Var != null) {
                    if ((t20Var.g & 262144) != 0) {
                        oi oiVar = t20Var;
                        ?? r7 = 0;
                        while (oiVar != 0) {
                            boolean z = true;
                            if (oiVar instanceof dr0) {
                                dr0 dr0Var = (dr0) oiVar;
                                if (lw.i(i(), dr0Var.i()) && getClass() == dr0Var.getClass()) {
                                    z = ((Boolean) r2Var.invoke(dr0Var)).booleanValue();
                                }
                                if (!z) {
                                    break loop0;
                                }
                            } else if ((oiVar.g & 262144) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var2 = oiVar.t;
                                int i = 0;
                                oiVar = oiVar;
                                r7 = r7;
                                while (t20Var2 != null) {
                                    if ((t20Var2.g & 262144) != 0) {
                                        i++;
                                        r7 = r7;
                                        if (i == 1) {
                                            oiVar = t20Var2;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r7.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r7.b(t20Var2);
                                        }
                                    }
                                    t20Var2 = t20Var2.j;
                                    oiVar = oiVar;
                                    r7 = r7;
                                }
                                if (i == 1) {
                                }
                            }
                            oiVar = nh.N(r7);
                        }
                    }
                    t20Var = t20Var.i;
                }
            }
            a0 = a0.n();
            t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
        }
        t50 t50Var2 = (t50) ((dr0) ve0Var.e);
        this.u = t50Var2;
        l20 l20Var = this.t;
        l20Var.f = t50Var2;
        if (((t50) l20Var.e) == this) {
            l20Var.e = null;
            l20Var.h = null;
            l20Var.g = lr0.m;
        }
    }

    @Override // defpackage.dr0
    public final Object i() {
        return this.v;
    }

    public final ch o0() {
        t50 p0 = p0();
        ch o0 = p0 != null ? p0.o0() : null;
        if (o0 != null) {
            ww wwVar = (ww) o0.e().j(b2.N);
            if (wwVar != null ? wwVar.a() : true) {
                return o0;
            }
        }
        ch chVar = (ch) this.t.h;
        if (chVar != null) {
            return chVar;
        }
        z6.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final t50 p0() {
        y50 y50Var;
        dr0 dr0Var = null;
        if (!this.r) {
            return null;
        }
        if (!this.e.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var = this.e.i;
        iy a0 = nh.a0(this);
        loop0: while (true) {
            if (a0 == null) {
                break;
            }
            if ((a0.H.f.h & 262144) != 0) {
                while (t20Var != null) {
                    if ((t20Var.g & 262144) != 0) {
                        t20 t20Var2 = t20Var;
                        t40 t40Var = null;
                        while (t20Var2 != null) {
                            if (t20Var2 instanceof dr0) {
                                dr0 dr0Var2 = (dr0) t20Var2;
                                if (lw.i(this.v, dr0Var2.i()) && t50.class == dr0Var2.getClass()) {
                                    dr0Var = dr0Var2;
                                    break loop0;
                                }
                            }
                            if ((t20Var2.g & 262144) != 0 && (t20Var2 instanceof oi)) {
                                int i = 0;
                                for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                    if ((t20Var3.g & 262144) != 0) {
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
        return (t50) dr0Var;
    }
}
