package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class rb extends y20 {
    public final b40 a;
    public final mu b;
    public final boolean c;
    public final boolean d;
    public final eq e;

    public rb(b40 b40Var, mu muVar, boolean z, boolean z2, eq eqVar) {
        this.a = b40Var;
        this.b = muVar;
        this.c = z;
        this.d = z2;
        this.e = eqVar;
    }

    @Override // defpackage.y20
    public final t20 d() {
        return new tb(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    @Override // defpackage.y20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(t20 t20Var) {
        boolean z;
        boolean z2;
        ni niVar;
        tb tbVar = (tb) t20Var;
        bp bpVar = tbVar.z;
        b40 b40Var = tbVar.J;
        b40 b40Var2 = this.a;
        boolean z3 = true;
        if (lw.i(b40Var, b40Var2)) {
            z = false;
        } else {
            tbVar.t0();
            tbVar.J = b40Var2;
            tbVar.u = b40Var2;
            z = true;
        }
        mu muVar = tbVar.v;
        mu muVar2 = this.b;
        if (!lw.i(muVar, muVar2)) {
            tbVar.v = muVar2;
            z = true;
        }
        boolean z4 = tbVar.w;
        boolean z5 = this.c;
        if (z4 != z5) {
            tbVar.w = z5;
            if (z5) {
                tbVar.z();
            }
            z = true;
        }
        boolean z6 = tbVar.x;
        boolean z7 = this.d;
        if (z6 != z7) {
            if (z7) {
                tbVar.o0(bpVar);
            } else {
                tbVar.p0(bpVar);
                tbVar.t0();
            }
            p30.i(tbVar);
            if (!z7) {
                vr vrVar = tbVar.B;
                if (vrVar != null) {
                    tbVar.p0(vrVar);
                }
                tbVar.B = null;
                tbVar.C = "idle";
            }
            tbVar.x = z7;
        }
        tbVar.y = this.e;
        boolean z8 = tbVar.K;
        b40 b40Var3 = tbVar.J;
        if (z8 != (b40Var3 == null)) {
            z2 = b40Var3 == null;
            tbVar.K = z2;
            if (z2 || tbVar.D != null) {
                z8 = z2;
            }
            if (z3 && ((niVar = tbVar.D) != null || !z2)) {
                if (niVar != null) {
                    tbVar.p0(niVar);
                }
                tbVar.D = null;
                tbVar.v0();
            }
            bpVar.t0(tbVar.u);
        }
        z2 = z8;
        z3 = z;
        if (z3) {
            if (niVar != null) {
            }
            tbVar.D = null;
            tbVar.v0();
        }
        bpVar.t0(tbVar.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rb.class != obj.getClass()) {
            return false;
        }
        rb rbVar = (rb) obj;
        return lw.i(this.a, rbVar.a) && lw.i(this.b, rbVar.b) && this.c == rbVar.c && this.d == rbVar.d && this.e == rbVar.e;
    }

    public final int hashCode() {
        b40 b40Var = this.a;
        int hashCode = (b40Var != null ? b40Var.hashCode() : 0) * 31;
        mu muVar = this.b;
        return this.e.hashCode() + j2.e(this.d, j2.e(this.c, (hashCode + (muVar != null ? muVar.hashCode() : 0)) * 31, 31), 29791);
    }
}
