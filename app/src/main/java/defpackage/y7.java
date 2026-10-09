package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class y7 extends y20 {
    public final long a;
    public final tk0 b;

    public y7(long j, tk0 tk0Var) {
        this.a = j;
        this.b = tk0Var;
    }

    @Override // defpackage.y20
    public final t20 d() {
        z7 z7Var = new z7();
        z7Var.s = this.a;
        z7Var.t = this.b;
        z7Var.u = 9205357640488583168L;
        return z7Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        z7 z7Var = (z7) t20Var;
        z7Var.s = this.a;
        tk0 tk0Var = z7Var.t;
        tk0 tk0Var2 = this.b;
        if (!lw.i(tk0Var, tk0Var2)) {
            z7Var.t = tk0Var2;
            p30.i(z7Var);
        }
        lw.x(z7Var);
    }

    public final boolean equals(Object obj) {
        y7 y7Var = obj instanceof y7 ? (y7) obj : null;
        if (y7Var == null) {
            return false;
        }
        long j = y7Var.a;
        int i = gc.g;
        return as0.a(this.a, j) && lw.i(this.b, y7Var.b);
    }

    public final int hashCode() {
        int i = gc.g;
        return this.b.hashCode() + j2.a(1.0f, Long.hashCode(this.a) * 961, 31);
    }
}
