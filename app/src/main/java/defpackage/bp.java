package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bp extends oi implements sj0, xr, df, q60, dr0 {
    public static final i2 z = new i2(19);
    public b40 u;
    public final e v;
    public mo w;
    public d60 x;
    public final yo y;

    public bp(b40 b40Var, e eVar) {
        this.u = b40Var;
        this.v = eVar;
        yo yoVar = new yo(0, new ap(2, this, bp.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 10);
        o0(yoVar);
        this.y = yoVar;
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        boolean a = this.y.t0().a();
        jx[] jxVarArr = zj0.a;
        ak0 ak0Var = yj0.l;
        jx jxVar = zj0.a[4];
        Boolean valueOf = Boolean.valueOf(a);
        ak0Var.getClass();
        bk0Var.a(ak0Var, valueOf);
        bk0Var.a(pj0.u, new p0(null, new b3(0, this, bp.class, "requestFocus", "requestFocus()Z", 0, 2)));
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.dr0
    public final Object i() {
        return z;
    }

    @Override // defpackage.xr
    public final void l(d60 d60Var) {
        this.x = d60Var;
        if (this.y.t0().a()) {
            if (!d60Var.A0().r) {
                s0();
                return;
            }
            d60 d60Var2 = this.x;
            if (d60Var2 == null || !d60Var2.A0().r) {
                return;
            }
            s0();
        }
    }

    public final void r0(b40 b40Var, gw gwVar) {
        if (!this.r) {
            b40Var.b(gwVar);
        } else {
            ww wwVar = (ww) ((mg) c0()).e.j(b2.N);
            q3.A(c0(), null, new f(b40Var, gwVar, wwVar != null ? wwVar.o(new c(2, b40Var, gwVar)) : null, null, 5), 3);
        }
    }

    public final void s0() {
        y50 y50Var;
        if (this.r) {
            if (!this.e.r) {
                cv.b("visitAncestors called on an unattached node");
            }
            t20 t20Var = this.e.i;
            iy a0 = nh.a0(this);
            while (a0 != null) {
                if ((a0.H.f.h & 262144) != 0) {
                    while (t20Var != null) {
                        if ((t20Var.g & 262144) != 0) {
                            t20 t20Var2 = t20Var;
                            t40 t40Var = null;
                            while (t20Var2 != null) {
                                if (t20Var2 instanceof dr0) {
                                    if (cp.s == ((dr0) t20Var2).i()) {
                                        return;
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
        }
    }

    public final void t0(b40 b40Var) {
        mo moVar;
        if (lw.i(this.u, b40Var)) {
            return;
        }
        b40 b40Var2 = this.u;
        if (b40Var2 != null && (moVar = this.w) != null) {
            b40Var2.b(new no(moVar));
        }
        this.w = null;
        this.u = b40Var;
    }

    @Override // defpackage.q60
    public final void z() {
        ve0 ve0Var = new ve0();
        m20.h(this, new s2(7, ve0Var, this));
        if (ve0Var.e == null) {
            this.y.t0().a();
        } else {
            z6.c();
        }
    }

    @Override // defpackage.t20
    public final void i0() {
    }
}
