package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class oi0 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ pi0 f;

    public /* synthetic */ oi0(pi0 pi0Var, int i) {
        this.e = i;
        this.f = pi0Var;
    }

    @Override // defpackage.eq
    public final Object b() {
        int g;
        int i = this.e;
        pi0 pi0Var = this.f;
        switch (i) {
            case 0:
                g = pi0Var.s.a.g();
                break;
            default:
                g = pi0Var.s.f.g();
                break;
        }
        return Float.valueOf(g);
    }
}
