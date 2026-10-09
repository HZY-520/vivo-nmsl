package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class vj implements eq {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ rh0 f;
    public final /* synthetic */ String g;

    public /* synthetic */ vj(boolean z, rh0 rh0Var, String str) {
        this.e = z;
        this.f = rh0Var;
        this.g = str;
    }

    @Override // defpackage.eq
    public final Object b() {
        boolean z = this.e;
        rh0 rh0Var = this.f;
        String str = this.g;
        if (z) {
            th0 th0Var = rh0Var.a;
            synchronized (th0Var.c) {
            }
        }
        return fs0.a;
    }
}
