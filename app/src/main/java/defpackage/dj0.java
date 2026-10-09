package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dj0 extends go0 implements tq {
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(long j, ng ngVar) {
        super(2, ngVar);
        this.f = j;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        dj0 dj0Var = new dj0(this.f, ngVar);
        dj0Var.e = obj;
        return dj0Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        dj0 dj0Var = (dj0) create((kj0) obj, (ng) obj2);
        fs0 fs0Var = fs0.a;
        dj0Var.invokeSuspend(fs0Var);
        return fs0Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        t30.z(obj);
        mj0 mj0Var = ((kj0) this.e).a;
        mj0Var.d(mj0Var.k, this.f, 1);
        return fs0.a;
    }
}
