package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k extends go0 implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ tb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(tb tbVar, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.f = tbVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        tb tbVar = this.f;
        switch (i) {
            case 0:
                return new k(tbVar, ngVar, 0);
            default:
                return new k(tbVar, ngVar, 1);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ch chVar = (ch) obj;
        ng ngVar = (ng) obj2;
        switch (i) {
            case 0:
                ((k) create(chVar, ngVar)).invokeSuspend(fs0Var);
                break;
            default:
                ((k) create(chVar, ngVar)).invokeSuspend(fs0Var);
                break;
        }
        return fs0Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        tb tbVar = this.f;
        switch (i) {
            case 0:
                t30.z(obj);
                if (tbVar.F == null) {
                    ot otVar = new ot();
                    b40 b40Var = tbVar.u;
                    if (b40Var != null) {
                        q3.A(tbVar.c0(), null, new d(b40Var, otVar, null, 0), 3);
                    }
                    tbVar.F = otVar;
                    break;
                }
                break;
            default:
                t30.z(obj);
                ot otVar2 = tbVar.F;
                if (otVar2 != null) {
                    pt ptVar = new pt(otVar2);
                    b40 b40Var2 = tbVar.u;
                    if (b40Var2 != null) {
                        q3.A(tbVar.c0(), null, new d(b40Var2, ptVar, null, 1), 3);
                    }
                    tbVar.F = null;
                    break;
                }
                break;
        }
        return fs0Var;
    }
}
