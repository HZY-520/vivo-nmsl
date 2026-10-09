package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class qv implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ec0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ qv(int i, ec0 ec0Var, int i2) {
        this.e = 1;
        this.f = i;
        this.g = ec0Var;
        this.h = i2;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = this.h;
        int i3 = this.f;
        ec0 ec0Var = this.g;
        dc0 dc0Var = (dc0) obj;
        switch (i) {
            case 0:
                dc0.e(dc0Var, ec0Var, i3, i2);
                break;
            case 1:
                dc0.e(dc0Var, ec0Var, t10.B((i3 - ec0Var.e) / 2.0f), t10.B((i2 - ec0Var.f) / 2.0f));
                break;
            default:
                dc0.e(dc0Var, ec0Var, i3, i2);
                break;
        }
        return fs0Var;
    }

    public /* synthetic */ qv(ec0 ec0Var, int i, int i2, int i3) {
        this.e = i3;
        this.g = ec0Var;
        this.f = i;
        this.h = i2;
    }
}
