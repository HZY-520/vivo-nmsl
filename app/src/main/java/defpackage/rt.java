package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class rt implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ u20 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rt(Object obj, u20 u20Var, long j, int i, int i2) {
        this.e = i2;
        this.i = obj;
        this.f = u20Var;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = this.h;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int q = v10.q(i2 | 1);
                st.a((wt) obj3, this.f, this.g, (se) obj, q);
                break;
            default:
                ((Integer) obj2).getClass();
                int q2 = v10.q(i2 | 1);
                st.b((h90) obj3, this.f, this.g, (se) obj, q2);
                break;
        }
        return fs0Var;
    }
}
