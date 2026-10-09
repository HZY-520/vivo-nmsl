package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class pi implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ qi f;

    public /* synthetic */ pi(qi qiVar, int i) {
        this.e = i;
        this.f = qiVar;
    }

    @Override // defpackage.eq
    public final Object b() {
        int i = this.e;
        qi qiVar = this.f;
        switch (i) {
            case 0:
                dg0 dg0Var = (dg0) q3.o(qiVar, gg0.a);
                g5 g5Var = qiVar.y;
                if (dg0Var == null) {
                    if (g5Var != null) {
                        qiVar.p0(g5Var);
                    }
                    qiVar.y = null;
                } else if (g5Var == null) {
                    t3 t3Var = new t3(5, qiVar);
                    pi piVar = new pi(qiVar, 1);
                    b40 b40Var = qiVar.u;
                    boolean z = qiVar.v;
                    float f = qiVar.w;
                    jr0 jr0Var = hg0.a;
                    g5 g5Var2 = new g5(b40Var, z, f, t3Var, piVar);
                    qiVar.o0(g5Var2);
                    qiVar.y = g5Var2;
                }
                return fs0.a;
            default:
                return t10.k;
        }
    }
}
