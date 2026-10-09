package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wa extends go0 implements tq {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ za h;
    public final /* synthetic */ bo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(za zaVar, bo boVar, Object obj, ng ngVar) {
        super(2, ngVar);
        this.h = zaVar;
        this.i = boVar;
        this.g = obj;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        bo boVar = this.i;
        za zaVar = this.h;
        switch (i) {
            case 0:
                return new wa(zaVar, boVar, this.g, ngVar);
            default:
                wa waVar = new wa(zaVar, boVar, ngVar);
                waVar.g = obj;
                return waVar;
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
        return ((wa) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        dh dhVar = dh.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    uq uqVar = this.h.i;
                    Object obj2 = this.g;
                    this.f = 1;
                    if (uqVar.c(this.i, obj2, this) == dhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    ch chVar = (ch) this.g;
                    ve0 ve0Var = new ve0();
                    za zaVar = this.h;
                    ao aoVar = zaVar.h;
                    ya yaVar = new ya(ve0Var, chVar, zaVar, this.i, 0);
                    this.f = 1;
                    if (aoVar.b(yaVar, this) == dhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
        }
        return dhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(za zaVar, bo boVar, ng ngVar) {
        super(2, ngVar);
        this.h = zaVar;
        this.i = boVar;
    }
}
