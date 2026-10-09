package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hk extends t20 implements dr0, ux {
    public hk s;
    public hk t;
    public long u;

    @Override // defpackage.ux, defpackage.c20
    public final void b(long j) {
        this.u = j;
    }

    @Override // defpackage.t20
    public final void h0() {
        this.t = null;
        this.s = null;
    }

    @Override // defpackage.dr0
    public final Object i() {
        return b2.G;
    }

    public final boolean o0() {
        hk hkVar = this.s;
        if (hkVar != null) {
            return hkVar.o0();
        }
        hk hkVar2 = this.t;
        if (hkVar2 != null) {
            return hkVar2.o0();
        }
        return false;
    }

    public final void p0() {
        hk hkVar = this.t;
        if (hkVar != null) {
            hkVar.p0();
            return;
        }
        hk hkVar2 = this.s;
        if (hkVar2 != null) {
            hkVar2.p0();
        }
    }

    public final void q0() {
        hk hkVar = this.t;
        if (hkVar != null) {
            hkVar.q0();
        }
        hk hkVar2 = this.s;
        if (hkVar2 != null) {
            hkVar2.q0();
        }
        this.s = null;
    }

    public final void r0(t3 t3Var) {
        dr0 dr0Var;
        hk hkVar;
        hk hkVar2 = this.s;
        if (hkVar2 == null || !q3.n(hkVar2, nh.z(t3Var))) {
            if (this.e.r) {
                ve0 ve0Var = new ve0();
                p30.q(this, new gk(ve0Var, this, t3Var));
                dr0Var = (dr0) ve0Var.e;
            } else {
                dr0Var = null;
            }
            hkVar = (hk) dr0Var;
        } else {
            hkVar = hkVar2;
        }
        if (hkVar != null && hkVar2 == null) {
            hkVar.p0();
            hkVar.r0(t3Var);
            hk hkVar3 = this.t;
            if (hkVar3 != null) {
                hkVar3.q0();
            }
        } else if (hkVar == null && hkVar2 != null) {
            hk hkVar4 = this.t;
            if (hkVar4 != null) {
                hkVar4.p0();
                hkVar4.r0(t3Var);
            }
            hkVar2.q0();
        } else if (!lw.i(hkVar, hkVar2)) {
            if (hkVar != null) {
                hkVar.p0();
                hkVar.r0(t3Var);
            }
            if (hkVar2 != null) {
                hkVar2.q0();
            }
        } else if (hkVar != null) {
            hkVar.r0(t3Var);
        } else {
            hk hkVar5 = this.t;
            if (hkVar5 != null) {
                hkVar5.r0(t3Var);
            }
        }
        this.s = hkVar;
    }

    public final void s0() {
        hk hkVar = this.t;
        if (hkVar != null) {
            hkVar.s0();
            return;
        }
        hk hkVar2 = this.s;
        if (hkVar2 != null) {
            hkVar2.s0();
        }
    }
}
