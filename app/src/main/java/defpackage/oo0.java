package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class oo0 extends y20 {
    @Override // defpackage.y20
    public final t20 d() {
        xs0 xs0Var = dx0.A;
        qn qnVar = lr0.s;
        po0 po0Var = new po0();
        po0Var.s = qnVar;
        po0Var.t = qnVar;
        po0Var.u = qnVar;
        po0Var.v = xs0Var;
        return po0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        po0 po0Var = (po0) t20Var;
        xs0 xs0Var = dx0.A;
        if (po0Var.v != xs0Var) {
            po0Var.v = xs0Var;
            cw0 cw0Var = po0Var.w;
            if (cw0Var != null) {
                es0 es0Var = cw0Var.l;
                if (lw.i(es0Var, po0Var.u)) {
                    return;
                }
                po0Var.u = es0Var;
                po0Var.o0();
            }
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oo0);
    }

    public final int hashCode() {
        return dx0.A.hashCode();
    }
}
