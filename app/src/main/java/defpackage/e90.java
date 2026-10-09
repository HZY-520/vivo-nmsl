package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class e90 extends y20 {
    public final f90 a;

    public e90(f90 f90Var) {
        this.a = f90Var;
    }

    @Override // defpackage.y20
    public final t20 d() {
        g90 g90Var = new g90();
        g90Var.s = this.a;
        return g90Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ((g90) t20Var).s = this.a;
    }

    public final boolean equals(Object obj) {
        e90 e90Var = obj instanceof e90 ? (e90) obj : null;
        if (e90Var == null) {
            return false;
        }
        return lw.i(this.a, e90Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
