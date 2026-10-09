package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pn extends t20 implements ay {
    public jj s;
    public float t;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (!wf.d(j) || this.s == jj.e) {
            j2 = wf.j(j);
            h = wf.h(j);
        } else {
            int round = Math.round(wf.h(j) * this.t);
            int j3 = wf.j(j);
            j2 = wf.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        }
        if (!wf.c(j) || this.s == jj.f) {
            int i3 = wf.i(j);
            int g = wf.g(j);
            i = i3;
            i2 = g;
        } else {
            int round2 = Math.round(wf.g(j) * this.t);
            int i4 = wf.i(j);
            i = wf.g(j);
            if (round2 < i4) {
                round2 = i4;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        ec0 b = w10Var.b(xf.a(j2, h, i, i2));
        return w00Var.l0(b.e, b.f, vm.e, new z2(b, 1));
    }
}
