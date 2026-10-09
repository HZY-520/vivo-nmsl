package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ b40 g;
    public final /* synthetic */ hd0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hd0 hd0Var, b40 b40Var, ng ngVar) {
        super(2, ngVar);
        this.e = 0;
        this.h = hd0Var;
        this.g = b40Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        hd0 hd0Var = this.h;
        b40 b40Var = this.g;
        switch (i) {
            case 0:
                return new h(hd0Var, b40Var, ngVar);
            case 1:
                return new h(b40Var, hd0Var, ngVar, 1);
            default:
                return new h(b40Var, hd0Var, ngVar, 2);
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
        return ((h) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        hd0 hd0Var = this.h;
        b40 b40Var = this.g;
        dh dhVar = dh.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    id0 id0Var = new id0(hd0Var);
                    this.f = 1;
                    if (b40Var.a(id0Var, this) == dhVar) {
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
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    if (b40Var.a(hd0Var, this) == dhVar) {
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
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    if (b40Var.a(hd0Var, this) == dhVar) {
                        break;
                    }
                } else if (i4 != 1) {
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
    public /* synthetic */ h(b40 b40Var, hd0 hd0Var, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = b40Var;
        this.h = hd0Var;
    }
}
