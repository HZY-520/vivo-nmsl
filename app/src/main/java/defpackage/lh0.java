package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lh0 implements cz, AutoCloseable {
    public final String e;
    public final kh0 f;
    public boolean g;

    public lh0(String str, kh0 kh0Var) {
        this.e = str;
        this.f = kh0Var;
    }

    public final void d(rh0 rh0Var, zy zyVar) {
        rh0Var.getClass();
        zyVar.getClass();
        if (this.g) {
            z6.m("Already attached to lifecycleOwner");
            return;
        }
        this.g = true;
        zyVar.a(this);
        rh0Var.c(this.e, (od) this.f.a.e);
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        if (xyVar == xy.ON_DESTROY) {
            this.g = false;
            ezVar.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
