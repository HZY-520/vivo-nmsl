package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ tb g;
    public final /* synthetic */ hd0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(tb tbVar, hd0 hd0Var, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = tbVar;
        this.h = hd0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        hd0 hd0Var = this.h;
        tb tbVar = this.g;
        switch (i) {
            case 0:
                return new j(tbVar, hd0Var, ngVar, 0);
            case 1:
                return new j(tbVar, hd0Var, ngVar, 1);
            case 2:
                return new j(tbVar, hd0Var, ngVar, 2);
            default:
                return new j(tbVar, hd0Var, ngVar, 3);
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
        return ((j) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        hd0 hd0Var = this.h;
        tb tbVar = this.g;
        dh dhVar = dh.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    b40 b40Var = tbVar.u;
                    if (b40Var != null) {
                        gd0 gd0Var = new gd0(hd0Var);
                        this.f = 1;
                        if (b40Var.a(gd0Var, this) == dhVar) {
                            break;
                        }
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
                    b40 b40Var2 = tbVar.u;
                    if (b40Var2 != null) {
                        gd0 gd0Var2 = new gd0(hd0Var);
                        this.f = 1;
                        if (b40Var2.a(gd0Var2, this) == dhVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    b40 b40Var3 = tbVar.u;
                    if (b40Var3 != null) {
                        this.f = 1;
                        if (b40Var3.a(hd0Var, this) == dhVar) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    t30.z(obj);
                    b40 b40Var4 = tbVar.u;
                    if (b40Var4 != null) {
                        id0 id0Var = new id0(hd0Var);
                        this.f = 1;
                        if (b40Var4.a(id0Var, this) == dhVar) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
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
}
