package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class cj0 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;

    public /* synthetic */ cj0(ej0 ej0Var, int i) {
        this.e = i;
        this.f = ej0Var;
    }

    @Override // defpackage.eq
    public final Object b() {
        int i = this.e;
        ej0 ej0Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(ej0Var.r);
            default:
                yo yoVar = ej0Var.X;
                if (!yoVar.e.r) {
                    return null;
                }
                xo t0 = yoVar.t0();
                int ordinal = t0.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    z6.j();
                    return null;
                }
                if (t0.a()) {
                    return yoVar.r0(null);
                }
                yo f = ((uo) nh.b0(yoVar).getFocusOwner()).f();
                if (f != null) {
                    return f.r0(nh.Z(yoVar));
                }
                return null;
        }
    }
}
