package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class r2 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ ve0 f;

    public /* synthetic */ r2(ve0 ve0Var, int i) {
        this.e = i;
        this.f = ve0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        boolean z = true;
        ve0 ve0Var = this.f;
        switch (i) {
            case 0:
                ve0Var.e = (yo) obj;
                return Boolean.TRUE;
            case 1:
                rr rrVar = (rr) obj;
                if (lw.i(rrVar.X(), "waiting")) {
                    ve0Var.e = rrVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Object obj2 = (dr0) obj;
                if (((t20) obj2).e.r) {
                    ve0Var.e = obj2;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
