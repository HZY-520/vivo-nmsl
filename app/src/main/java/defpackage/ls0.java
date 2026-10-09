package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ls0 extends t20 implements ay {
    public float s;
    public float t;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        int j2;
        int i;
        if (Float.isNaN(this.s) || wf.j(j) != 0) {
            j2 = wf.j(j);
        } else {
            int D = w00Var.D(this.s);
            j2 = wf.h(j);
            if (D < 0) {
                D = 0;
            }
            if (D <= j2) {
                j2 = D;
            }
        }
        int h = wf.h(j);
        if (Float.isNaN(this.t) || wf.i(j) != 0) {
            i = wf.i(j);
        } else {
            int D2 = w00Var.D(this.t);
            i = wf.g(j);
            int i2 = D2 >= 0 ? D2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        ec0 b = w10Var.b(xf.a(j2, h, i, wf.g(j)));
        return w00Var.l0(b.e, b.f, vm.e, new z2(b, 6));
    }
}
