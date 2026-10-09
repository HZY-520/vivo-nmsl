package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n70 extends m80 {
    public static final n70 c = new n70(0, 2, 1);

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        int i;
        cw cwVar = (cw) o80Var.b(0);
        int c2 = ol0Var.c((er) o80Var.b(1));
        if (ol0Var.t >= c2) {
            ue.a("Check failed");
        }
        p30.n(ol0Var, x6Var, c2);
        int i2 = ol0Var.t;
        int i3 = ol0Var.v;
        while (i3 >= 0 && !ol0Var.w(i3)) {
            i3 = ol0Var.B(ol0Var.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (ol0Var.t(i2, i4)) {
                if (ol0Var.w(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += ol0Var.w(i4) ? 1 : ol0Var.b[(ol0Var.p(i4) * 5) + 1] & 67108863;
                i4 += ol0Var.s(i4);
            }
        }
        while (true) {
            i = ol0Var.t;
            if (i >= c2) {
                break;
            }
            if (ol0Var.t(c2, i)) {
                int i6 = ol0Var.t;
                if (i6 < ol0Var.u && (ol0Var.b[(ol0Var.p(i6) * 5) + 1] & 1073741824) != 0) {
                    x6Var.b(ol0Var.A(ol0Var.t));
                    i5 = 0;
                }
                ol0Var.M();
            } else {
                i5 += ol0Var.I();
            }
        }
        if (i != c2) {
            ue.a("Check failed");
        }
        cwVar.a = i5;
    }
}
