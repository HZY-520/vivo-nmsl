package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xw0 extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ yw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw0(yw0 yw0Var, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = yw0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        yw0 yw0Var = this.g;
        switch (i) {
            case 0:
                return new xw0(yw0Var, ngVar, 0);
            default:
                return new xw0(yw0Var, ngVar, 1);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ch chVar = (ch) obj;
        ng ngVar = (ng) obj2;
        switch (i) {
        }
        return ((xw0) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        yw0 yw0Var = this.g;
        dh dhVar = dh.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    e3 e3Var = yw0Var.e;
                    this.f = 1;
                    Object d = e3Var.A.d(this);
                    if (d != dhVar) {
                        d = fs0Var;
                    }
                    if (d == dhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                }
                break;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    e3 e3Var2 = yw0Var.e;
                    this.f = 1;
                    Object d2 = e3Var2.B.d(this);
                    if (d2 != dhVar) {
                        d2 = fs0Var;
                    }
                    if (d2 == dhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                }
                break;
        }
        return dhVar;
    }
}
