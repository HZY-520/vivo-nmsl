package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x70 extends m80 {
    public static final x70 c = new x70(0, 3, 1);

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        p2 p2Var;
        ll0 ll0Var = (ll0) o80Var.b(1);
        er erVar = (er) o80Var.b(0);
        rn rnVar = (rn) o80Var.b(2);
        ol0 c2 = ll0Var.c();
        if (n80Var != null) {
            try {
                p2Var = new p2(13, n80Var, ol0Var);
            } catch (Throwable th) {
                c2.e(false);
                throw th;
            }
        } else {
            p2Var = null;
        }
        if (!rnVar.b.N()) {
            ue.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        rnVar.a.M(x6Var, c2, bf0Var, p2Var);
        c2.e(true);
        ol0Var.d();
        erVar.getClass();
        ol0Var.x(ll0Var, ll0Var.a(erVar));
        ol0Var.j();
    }
}
