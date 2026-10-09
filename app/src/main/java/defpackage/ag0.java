package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ag0 extends px implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ bg0 f;

    public /* synthetic */ ag0(bg0 bg0Var, int i) {
        this.e = i;
        this.f = bg0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        bg0 bg0Var = this.f;
        switch (i) {
            case 0:
                return Double.valueOf(bg0Var.n.b(t30.e(((Number) obj).doubleValue(), bg0Var.e, bg0Var.f)));
            default:
                return Double.valueOf(t30.e(bg0Var.k.b(((Number) obj).doubleValue()), bg0Var.e, bg0Var.f));
        }
    }
}
