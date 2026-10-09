package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class h50 {
    public f50 a;
    public boolean b;

    public final void a() {
        f50 f50Var = this.a;
        if (f50Var == null) {
            z6.m("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            f50Var.b(this, null);
        }
        i50 i50Var = f50Var.b;
        b70 b70Var = f50Var.a;
        if (equals(i50Var.f) && -1 == i50Var.e) {
            i50Var.b();
            i50Var.e = 0;
            i50Var.f = null;
            ((d70) b70Var.a).a.run();
            i50Var.a.i(null, j50.a);
        }
        this.b = false;
    }

    public void b() {
    }
}
