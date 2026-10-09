package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ne implements tq {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ pe f;
    public final /* synthetic */ e3 g;
    public final /* synthetic */ be h;

    public /* synthetic */ ne(e3 e3Var, pe peVar, be beVar) {
        this.g = e3Var;
        this.f = peVar;
        this.h = beVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        be beVar = this.h;
        e3 e3Var = this.g;
        pe peVar = this.f;
        se seVar = (se) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                gr grVar = (gr) seVar;
                if (!grVar.I(intValue & 1, (intValue & 3) != 2)) {
                    grVar.L();
                    break;
                } else {
                    grVar.P(866651995);
                    kf.a(e3Var, peVar.l, beVar, grVar, 0);
                    grVar.o(false);
                    break;
                }
            default:
                num.getClass();
                peVar.a(e3Var, beVar, seVar, v10.q(1));
                break;
        }
        return fs0Var;
    }

    public /* synthetic */ ne(pe peVar, e3 e3Var, be beVar, int i) {
        this.f = peVar;
        this.g = e3Var;
        this.h = beVar;
    }
}
