package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j70 extends m80 {
    public static final j70 c = new j70(0, 2, 1);

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        er erVar = (er) o80Var.b(0);
        Object b = o80Var.b(1);
        if (b instanceof lr) {
            lr lrVar = (lr) b;
            bf0Var.d.b(lrVar);
            bf0Var.c.a(lrVar);
        }
        if (ol0Var.n != 0) {
            ue.a("Can only append a slot if not current inserting");
        }
        int i = ol0Var.i;
        int i2 = ol0Var.j;
        int c2 = ol0Var.c(erVar);
        int f = ol0Var.f(ol0Var.b, ol0Var.p(c2 + 1));
        ol0Var.i = f;
        ol0Var.j = f;
        ol0Var.v(1, c2);
        if (i >= f) {
            i++;
            i2++;
        }
        ol0Var.c[f] = b;
        ol0Var.i = i;
        ol0Var.j = i2;
    }
}
