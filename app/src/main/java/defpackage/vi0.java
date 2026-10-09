package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vi0 extends oi implements df, q60 {
    public ej0 A;
    public ni B;
    public j4 C;
    public i4 D;
    public boolean E;
    public fj0 u;
    public q80 v;
    public boolean w;
    public b40 x;
    public boolean y;
    public i4 z;

    @Override // defpackage.ni
    public final void Y() {
        boolean s0 = s0();
        if (this.E != s0) {
            this.E = s0;
            fj0 fj0Var = this.u;
            q80 q80Var = this.v;
            boolean z = this.y;
            t0(z ? this.D : this.z, this.x, q80Var, fj0Var, z, this.w);
        }
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.t20
    public final void g0() {
        this.E = s0();
        r0();
        if (this.A == null) {
            fj0 fj0Var = this.u;
            ej0 ej0Var = new ej0(this.y ? this.D : this.z, this.x, this.v, fj0Var, this.w, this.E);
            o0(ej0Var);
            this.A = ej0Var;
        }
    }

    @Override // defpackage.t20
    public final void h0() {
        ni niVar = this.B;
        if (niVar != null) {
            p0(niVar);
        }
    }

    public final void r0() {
        ni niVar = this.B;
        if (niVar != null) {
            if (((t20) niVar).e.r) {
                return;
            }
            o0(niVar);
            return;
        }
        if (this.y) {
            m20.h(this, new f5(13, this));
        }
        i4 i4Var = this.y ? this.D : this.z;
        if (i4Var != null) {
            oi oiVar = i4Var.i;
            if (oiVar.e.r) {
                return;
            }
            o0(oiVar);
            this.B = oiVar;
        }
    }

    public final boolean s0() {
        return (this.r ? nh.a0(this).B : xx.e) != xx.f || this.v == q80.e;
    }

    public final void t0(i4 i4Var, b40 b40Var, q80 q80Var, fj0 fj0Var, boolean z, boolean z2) {
        boolean z3;
        this.u = fj0Var;
        this.v = q80Var;
        boolean z4 = true;
        if (this.y != z) {
            this.y = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (lw.i(this.z, i4Var)) {
            z4 = false;
        } else {
            this.z = i4Var;
        }
        if (z3 || (z4 && !z)) {
            ni niVar = this.B;
            if (niVar != null) {
                p0(niVar);
            }
            this.B = null;
            r0();
        }
        this.w = z2;
        this.x = b40Var;
        boolean s0 = s0();
        this.E = s0;
        ej0 ej0Var = this.A;
        if (ej0Var != null) {
            ej0Var.E0(this.y ? this.D : this.z, b40Var, q80Var, fj0Var, z2, s0);
        }
    }

    @Override // defpackage.q60
    public final void z() {
        j4 j4Var = (j4) q3.o(this, x80.a);
        if (lw.i(j4Var, this.C)) {
            return;
        }
        this.C = j4Var;
        this.D = null;
        ni niVar = this.B;
        if (niVar != null) {
            p0(niVar);
        }
        this.B = null;
        r0();
        ej0 ej0Var = this.A;
        if (ej0Var != null) {
            fj0 fj0Var = this.u;
            q80 q80Var = this.v;
            ej0Var.E0(this.y ? this.D : this.z, this.x, q80Var, fj0Var, this.w, this.E);
        }
    }
}
