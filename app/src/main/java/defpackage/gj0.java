package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gj0 extends y20 {
    public final ti0 a;

    public gj0(ti0 ti0Var) {
        this.a = ti0Var;
    }

    @Override // defpackage.y20
    public final t20 d() {
        pi0 pi0Var = new pi0();
        pi0Var.s = this.a;
        pi0Var.t = true;
        return pi0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        pi0 pi0Var = (pi0) t20Var;
        pi0Var.s = this.a;
        pi0Var.t = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gj0) {
            return lw.i(this.a, ((gj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j2.e(false, this.a.hashCode() * 31, 31);
    }
}
