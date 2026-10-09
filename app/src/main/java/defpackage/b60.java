package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b60 implements c60 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t20] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.c60
    public final boolean b(t20 t20Var) {
        ?? r0 = 0;
        while (true) {
            int i = 0;
            if (t20Var == 0) {
                return false;
            }
            if (t20Var instanceof yc0) {
                if (((yc0) t20Var).W()) {
                    return true;
                }
            } else if ((t20Var.g & 16) != 0 && (t20Var instanceof oi)) {
                t20 t20Var2 = t20Var.t;
                r0 = r0;
                t20Var = t20Var;
                while (t20Var2 != null) {
                    if ((t20Var2.g & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            t20Var = t20Var2;
                        } else {
                            if (r0 == 0) {
                                r0 = new t40(new t20[16]);
                            }
                            if (t20Var != 0) {
                                r0.b(t20Var);
                                t20Var = 0;
                            }
                            r0.b(t20Var2);
                        }
                    }
                    t20Var2 = t20Var2.j;
                    r0 = r0;
                    t20Var = t20Var;
                }
                if (i == 1) {
                }
            }
            t20Var = nh.N(r0);
        }
    }

    @Override // defpackage.c60
    public final int c() {
        return 16;
    }

    @Override // defpackage.c60
    public final void f(iy iyVar, long j, bt btVar, int i, boolean z) {
        iyVar.u(j, btVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [t20] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.c60
    public final boolean g(bt btVar, iy iyVar) {
        d60 d60Var = iyVar.H.d;
        d60Var.getClass();
        t20 D0 = d60Var.D0(e60.f(16));
        if (D0 != null && D0.r) {
            if (!D0.e.r) {
                cv.b("visitLocalDescendants called on an unattached node");
            }
            t20 t20Var = D0.e;
            if ((t20Var.h & 16) != 0) {
                while (t20Var != null) {
                    if ((t20Var.g & 16) != 0) {
                        oi oiVar = t20Var;
                        ?? r3 = 0;
                        while (oiVar != 0) {
                            if (oiVar instanceof yc0) {
                                if (((yc0) oiVar).I()) {
                                    btVar.g = btVar.e.b - 1;
                                    return true;
                                }
                            } else if ((oiVar.g & 16) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var2 = oiVar.t;
                                int i = 0;
                                oiVar = oiVar;
                                r3 = r3;
                                while (t20Var2 != null) {
                                    if ((t20Var2.g & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            oiVar = t20Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r3.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r3.b(t20Var2);
                                        }
                                    }
                                    t20Var2 = t20Var2.j;
                                    oiVar = oiVar;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            oiVar = nh.N(r3);
                        }
                    }
                    t20Var = t20Var.j;
                }
            }
        }
        return false;
    }

    @Override // defpackage.c60
    public final boolean i(iy iyVar) {
        return true;
    }
}
