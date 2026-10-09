package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class vh implements pq {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ se0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vh(se0 se0Var, o30 o30Var, kj0 kj0Var, l30 l30Var) {
        this.f = se0Var;
        this.g = o30Var;
        this.h = kj0Var;
        this.i = l30Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        se0 se0Var = this.f;
        switch (i) {
            case 0:
                xh xhVar = (xh) obj2;
                e6 e6Var = (e6) obj;
                float floatValue = ((Number) e6Var.e.getValue()).floatValue() - se0Var.e;
                float a = ((ij0) obj3).a(floatValue);
                se0Var.e = ((Number) e6Var.e.getValue()).floatValue();
                ((se0) obj4).e = ((Number) e6Var.a.b.invoke(e6Var.f)).floatValue();
                if (Math.abs(floatValue - a) > 0.5f) {
                    e6Var.i.setValue(Boolean.FALSE);
                    e6Var.d.b();
                }
                xhVar.getClass();
                break;
            default:
                o30 o30Var = (o30) obj4;
                kj0 kj0Var = (kj0) obj3;
                l30 l30Var = (l30) obj2;
                e6 e6Var2 = (e6) obj;
                w90 w90Var = e6Var2.e;
                eq eqVar = e6Var2.d;
                w90 w90Var2 = e6Var2.i;
                float floatValue2 = ((Number) w90Var.getValue()).floatValue() - se0Var.e;
                if (!p30.k(floatValue2)) {
                    if (!p30.k(floatValue2 - o30Var.c(kj0Var, floatValue2))) {
                        w90Var2.setValue(Boolean.FALSE);
                        eqVar.b();
                        break;
                    } else {
                        se0Var.e += floatValue2;
                    }
                }
                if (((Boolean) l30Var.invoke(Float.valueOf(se0Var.e))).booleanValue()) {
                    w90Var2.setValue(Boolean.FALSE);
                    eqVar.b();
                    break;
                }
                break;
        }
        return fs0Var;
    }

    public /* synthetic */ vh(se0 se0Var, ij0 ij0Var, se0 se0Var2, xh xhVar) {
        this.f = se0Var;
        this.h = ij0Var;
        this.g = se0Var2;
        this.i = xhVar;
    }
}
