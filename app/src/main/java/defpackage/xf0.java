package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class xf0 implements ak {
    public final /* synthetic */ int e;
    public final /* synthetic */ bg0 f;

    public /* synthetic */ xf0(bg0 bg0Var, int i) {
        this.e = i;
        this.f = bg0Var;
    }

    @Override // defpackage.ak
    public final double b(double d) {
        int i = this.e;
        bg0 bg0Var = this.f;
        switch (i) {
            case 0:
                return t30.e(bg0Var.k.b(d), bg0Var.e, bg0Var.f);
            default:
                return bg0Var.n.b(t30.e(d, bg0Var.e, bg0Var.f));
        }
    }
}
