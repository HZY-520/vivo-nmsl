package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x5 extends go0 implements pq {
    public final /* synthetic */ y5 e;
    public final /* synthetic */ ck f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(y5 y5Var, ck ckVar, ng ngVar) {
        super(1, ngVar);
        this.e = y5Var;
        this.f = ckVar;
    }

    @Override // defpackage.b8
    public final ng create(ng ngVar) {
        return new x5(this.e, this.f, ngVar);
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        x5 x5Var = (x5) create((ng) obj);
        fs0 fs0Var = fs0.a;
        x5Var.invokeSuspend(fs0Var);
        return fs0Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        t30.z(obj);
        y5 y5Var = this.e;
        g6 g6Var = y5Var.c;
        g6Var.g.d();
        g6Var.h = Long.MIN_VALUE;
        y5Var.d.setValue(Boolean.FALSE);
        Object b = y5Var.b(this.f);
        g6Var.f.setValue(b);
        y5Var.e.setValue(b);
        return fs0.a;
    }
}
