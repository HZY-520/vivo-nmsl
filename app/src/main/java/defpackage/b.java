package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class b implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ tb f;

    public /* synthetic */ b(tb tbVar, int i) {
        this.e = i;
        this.f = tbVar;
    }

    @Override // defpackage.eq
    public final Object b() {
        ni niVar;
        int i = this.e;
        tb tbVar = this.f;
        switch (i) {
            case 0:
                mu muVar = (mu) q3.o(tbVar, ju.a);
                if (muVar == null) {
                    fv.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + muVar);
                }
                mu muVar2 = tbVar.A;
                tbVar.A = muVar;
                if (muVar2 != null && !lw.i(muVar, muVar2) && ((niVar = tbVar.D) != null || !tbVar.K)) {
                    if (niVar != null) {
                        tbVar.p0(niVar);
                    }
                    tbVar.D = null;
                    tbVar.v0();
                }
                return fs0.a;
            default:
                tbVar.w0();
                return Boolean.TRUE;
        }
    }
}
