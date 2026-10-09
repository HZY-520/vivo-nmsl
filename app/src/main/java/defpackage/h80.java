package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h80 extends m80 {
    public static final h80 c = new h80(1, 0, 2);

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        int a = o80Var.a(0);
        int i = ol0Var.v;
        int K = ol0Var.K(ol0Var.b, ol0Var.p(i));
        int f = ol0Var.f(ol0Var.b, ol0Var.p(i + 1));
        for (int max = Math.max(K, f - a); max < f; max++) {
            Object obj = ol0Var.c[ol0Var.g(max)];
            if (obj instanceof lr) {
                bf0Var.d((lr) obj);
            } else if (obj instanceof de0) {
                ((de0) obj).c();
            }
        }
        if (a <= 0) {
            ue.a("Check failed");
        }
        int i2 = ol0Var.v;
        int K2 = ol0Var.K(ol0Var.b, ol0Var.p(i2));
        int f2 = ol0Var.f(ol0Var.b, ol0Var.p(i2 + 1)) - a;
        if (f2 < K2) {
            ue.a("Check failed");
        }
        ol0Var.G(f2, a, i2);
        int i3 = ol0Var.i;
        if (i3 >= K2) {
            ol0Var.i = i3 - a;
        }
    }
}
