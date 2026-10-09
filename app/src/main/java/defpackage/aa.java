package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class aa implements tq {
    public final /* synthetic */ long e;
    public final /* synthetic */ f90 f;
    public final /* synthetic */ uq g;

    public aa(long j, f90 f90Var, uq uqVar) {
        this.e = j;
        this.f = f90Var;
        this.g = uqVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        se seVar = (se) obj;
        int intValue = ((Number) obj2).intValue();
        int i = 0;
        gr grVar = (gr) seVar;
        if (grVar.I(intValue & 1, (intValue & 3) != 2)) {
            p30.a(this.e, ((wr0) grVar.i(xr0.a)).m, kw.J(417635459, new z9(this.f, this.g, i), grVar), grVar, 384);
        } else {
            grVar.L();
        }
        return fs0.a;
    }
}
