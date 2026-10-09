package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class oi extends t20 {
    public final int s = e60.d(this);
    public t20 t;

    @Override // defpackage.t20
    public final void e0() {
        super.e0();
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.n0(this.l);
            if (!t20Var.r) {
                t20Var.e0();
            }
        }
    }

    @Override // defpackage.t20
    public final void f0() {
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.f0();
        }
        super.f0();
    }

    @Override // defpackage.t20
    public final void j0() {
        super.j0();
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.j0();
        }
    }

    @Override // defpackage.t20
    public final void k0() {
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.k0();
        }
        super.k0();
    }

    @Override // defpackage.t20
    public final void l0() {
        super.l0();
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.l0();
        }
    }

    @Override // defpackage.t20
    public final void m0(t20 t20Var) {
        this.e = t20Var;
        for (t20 t20Var2 = this.t; t20Var2 != null; t20Var2 = t20Var2.j) {
            t20Var2.m0(t20Var);
        }
    }

    @Override // defpackage.t20
    public final void n0(d60 d60Var) {
        this.l = d60Var;
        for (t20 t20Var = this.t; t20Var != null; t20Var = t20Var.j) {
            t20Var.n0(d60Var);
        }
    }

    public final ni o0(ni niVar) {
        t20 t20Var = ((t20) niVar).e;
        if (t20Var != niVar) {
            t20 t20Var2 = niVar instanceof t20 ? (t20) niVar : null;
            t20 t20Var3 = t20Var2 != null ? t20Var2.i : null;
            if (t20Var != this.e || !lw.i(t20Var3, this)) {
                z6.m("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (t20Var.r) {
                cv.b("Cannot delegate to an already attached node");
            }
            t20Var.m0(this.e);
            int i = this.g;
            int e = e60.e(t20Var);
            t20Var.g = e;
            int i2 = this.g;
            int i3 = e & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof ay)) {
                cv.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + t20Var);
            }
            t20Var.j = this.t;
            this.t = t20Var;
            t20Var.i = this;
            q0(e | this.g, false);
            if (this.r) {
                if (i3 == 0 || (i & 2) != 0) {
                    n0(this.l);
                } else {
                    y50 y50Var = nh.a0(this).H;
                    this.e.n0(null);
                    y50Var.g();
                }
                t20Var.e0();
                t20Var.k0();
                if (!t20Var.r) {
                    cv.b("autoInvalidateInsertedNode called on unattached node");
                }
                e60.a(t20Var, -1, 1);
            }
        }
        return niVar;
    }

    public final void p0(ni niVar) {
        t20 t20Var = null;
        for (t20 t20Var2 = this.t; t20Var2 != null; t20Var2 = t20Var2.j) {
            if (t20Var2 == niVar) {
                boolean z = t20Var2.r;
                if (z) {
                    g40 g40Var = e60.a;
                    if (!z) {
                        cv.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    e60.a(t20Var2, -1, 2);
                    t20Var2.l0();
                    t20Var2.f0();
                }
                t20Var2.m0(t20Var2);
                t20Var2.h = 0;
                t20 t20Var3 = t20Var2.j;
                if (t20Var == null) {
                    this.t = t20Var3;
                } else {
                    t20Var.j = t20Var3;
                }
                t20Var2.j = null;
                t20Var2.i = null;
                int i = this.g;
                int e = e60.e(this);
                q0(e, true);
                if (this.r && (i & 2) != 0 && (e & 2) == 0) {
                    y50 y50Var = nh.a0(this).H;
                    this.e.n0(null);
                    y50Var.g();
                    return;
                }
                return;
            }
            t20Var = t20Var2;
        }
        z6.e(niVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void q0(int i, boolean z) {
        t20 t20Var;
        int i2 = this.g;
        this.g = i;
        if (i2 != i) {
            t20 t20Var2 = this.e;
            if (t20Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == t20Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == t20Var2) {
                    i = e60.e(t20Var2);
                    t20Var2.g = i;
                }
                int i3 = i | ((r2 == 0 || (t20Var = r2.j) == null) ? 0 : t20Var.h);
                for (t20 t20Var3 = r2; t20Var3 != null; t20Var3 = t20Var3.i) {
                    i3 |= t20Var3.g;
                    t20Var3.h = i3;
                }
            }
        }
    }
}
