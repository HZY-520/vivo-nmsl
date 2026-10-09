package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ap extends dr implements tq {
    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        boolean a;
        xo xoVar = (xo) obj;
        xo xoVar2 = (xo) obj2;
        bp bpVar = (bp) this.f;
        if (bpVar.r && (a = xoVar2.a()) != xoVar.a()) {
            e eVar = bpVar.v;
            if (eVar != null) {
                eVar.invoke(Boolean.valueOf(a));
            }
            ng ngVar = null;
            if (a) {
                q3.A(bpVar.c0(), null, new qh(bpVar, ngVar, 1), 1);
                ve0 ve0Var = new ve0();
                m20.h(bpVar, new s2(7, ve0Var, bpVar));
                if (ve0Var.e != null) {
                    z6.c();
                    return null;
                }
                d60 d60Var = bpVar.x;
                if (d60Var != null && d60Var.A0().r) {
                    bpVar.s0();
                }
            } else {
                bpVar.s0();
            }
            p30.i(bpVar);
            b40 b40Var = bpVar.u;
            if (b40Var != null) {
                mo moVar = bpVar.w;
                if (a) {
                    if (moVar != null) {
                        bpVar.r0(b40Var, new no(moVar));
                        bpVar.w = null;
                    }
                    mo moVar2 = new mo();
                    bpVar.r0(b40Var, moVar2);
                    bpVar.w = moVar2;
                } else if (moVar != null) {
                    bpVar.r0(b40Var, new no(moVar));
                    bpVar.w = null;
                }
            }
        }
        return fs0.a;
    }
}
