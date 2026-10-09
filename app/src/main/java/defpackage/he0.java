package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class he0 extends go0 implements tq {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he0(int i, ng ngVar, int i2) {
        super(i, ngVar);
        this.e = i2;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        switch (this.e) {
            case 0:
                he0 he0Var = new he0(2, ngVar, 0);
                he0Var.f = obj;
                return he0Var;
            default:
                he0 he0Var2 = new he0(2, ngVar, 1);
                he0Var2.f = obj;
                return he0Var2;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((he0) create((ge0) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((he0) create((dl0) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                t30.z(obj);
                return Boolean.valueOf(((ge0) this.f) == ge0.e);
            default:
                t30.z(obj);
                return Boolean.valueOf(((dl0) this.f) != dl0.e);
        }
    }
}
