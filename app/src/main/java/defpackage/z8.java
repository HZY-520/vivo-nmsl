package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z8 extends go0 implements tq {
    public /* synthetic */ Object e;
    public final /* synthetic */ a9 f;
    public final /* synthetic */ d60 g;
    public final /* synthetic */ s2 h;
    public final /* synthetic */ v7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(a9 a9Var, d60 d60Var, s2 s2Var, v7 v7Var, ng ngVar) {
        super(2, ngVar);
        this.f = a9Var;
        this.g = d60Var;
        this.h = s2Var;
        this.i = v7Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        z8 z8Var = new z8(this.f, this.g, this.h, this.i, ngVar);
        z8Var.e = obj;
        return z8Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((z8) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        t30.z(obj);
        ch chVar = (ch) this.e;
        s2 s2Var = this.h;
        a9 a9Var = this.f;
        q3.A(chVar, null, new f(a9Var, this.g, s2Var, null, 1), 3);
        return q3.A(chVar, null, new d(a9Var, this.i, null, 2), 3);
    }
}
