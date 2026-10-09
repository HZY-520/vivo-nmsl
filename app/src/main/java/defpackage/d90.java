package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class d90 extends t20 implements ay {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        int D = w00Var.D(this.u) + w00Var.D(this.s);
        int D2 = w00Var.D(this.v) + w00Var.D(this.t);
        ec0 b = w10Var.b(xf.h(-D, -D2, j));
        return w00Var.l0(xf.f(j, b.e + D), xf.e(j, b.f + D2), vm.e, new c(5, this, b));
    }
}
