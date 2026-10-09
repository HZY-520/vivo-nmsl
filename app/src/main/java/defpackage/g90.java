package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g90 extends t20 implements ay {
    public f90 s;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        f90 f90Var = this.s;
        xx layoutDirection = w00Var.getLayoutDirection();
        xx xxVar = xx.e;
        float f = layoutDirection == xxVar ? f90Var.a : f90Var.c;
        f90 f90Var2 = this.s;
        float f2 = f90Var2.b;
        float f3 = w00Var.getLayoutDirection() == xxVar ? f90Var2.c : f90Var2.a;
        float f4 = this.s.d;
        if (!((ck.a(f, 0.0f) >= 0) & (ck.a(f2, 0.0f) >= 0) & (ck.a(f3, 0.0f) >= 0) & (ck.a(f4, 0.0f) >= 0))) {
            av.a("Padding must be non-negative");
        }
        int D = w00Var.D(f);
        int D2 = w00Var.D(f3) + D;
        int D3 = w00Var.D(f2);
        int D4 = w00Var.D(f4) + D3;
        ec0 b = w10Var.b(xf.h(-D2, -D4, j));
        return w00Var.l0(xf.f(j, b.e + D2), xf.e(j, b.f + D4), vm.e, new qv(b, D, D3, 2));
    }
}
