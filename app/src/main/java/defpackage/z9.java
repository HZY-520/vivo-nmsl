package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z9 implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ br g;

    public /* synthetic */ z9(Object obj, br brVar, int i) {
        this.e = i;
        this.f = obj;
        this.g = brVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        br brVar = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                se seVar = (se) obj;
                int intValue = ((Number) obj2).intValue();
                gr grVar = (gr) seVar;
                if (!grVar.I(intValue & 1, (intValue & 3) != 2)) {
                    grVar.L();
                    break;
                } else {
                    u20 E = nh.E(t10.k(u9.b, u9.c), (f90) obj3);
                    uq uqVar = (uq) brVar;
                    ug0 a = tg0.a(lr0.c, b2.p, grVar, 54);
                    int hashCode = Long.hashCode(grVar.Q);
                    xa0 k = grVar.k();
                    u20 z = dx0.z(grVar, E);
                    le.c.getClass();
                    grVar.R();
                    if (grVar.P) {
                        grVar.j();
                    } else {
                        grVar.b0();
                    }
                    t30.t(grVar, b2.x, a);
                    t30.t(grVar, b2.w, k);
                    bd bdVar = b2.y;
                    if (grVar.P || !lw.i(grVar.G(), Integer.valueOf(hashCode))) {
                        grVar.Y(Integer.valueOf(hashCode));
                        grVar.b(bdVar, Integer.valueOf(hashCode));
                    }
                    t30.t(grVar, b2.v, z);
                    uqVar.c(wg0.a, grVar, 6);
                    grVar.o(true);
                    break;
                }
            default:
                se seVar2 = (se) obj;
                int intValue2 = ((Number) obj2).intValue();
                gr grVar2 = (gr) seVar2;
                if (!grVar2.I(intValue2 & 1, (intValue2 & 3) != 2)) {
                    grVar2.L();
                    break;
                } else {
                    kp0.a(((wr0) obj3).j, (tq) brVar, grVar2, 0);
                    break;
                }
        }
        return fs0Var;
    }
}
