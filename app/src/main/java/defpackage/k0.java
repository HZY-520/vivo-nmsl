package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k0 extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ej0 g;
    public /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(ej0 ej0Var, long j, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = ej0Var;
        this.h = j;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        switch (this.e) {
            case 0:
                k0 k0Var = new k0(this.g, ngVar);
                k0Var.h = ((s60) obj).a;
                return k0Var;
            case 1:
                return new k0(this.g, this.h, ngVar, 1);
            case 2:
                return new k0(this.g, this.h, ngVar, 2);
            default:
                return new k0(this.g, this.h, ngVar, 3);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                long j = ((s60) obj).a;
                k0 k0Var = new k0(this.g, (ng) obj2);
                k0Var.h = j;
                break;
        }
        return ((k0) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ej0 ej0Var = this.g;
        dh dhVar = dh.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    long j = this.h;
                    this.f = 1;
                    Object a = zi0.a(ej0Var.V, j, this);
                    if (a == dhVar) {
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
                    mj0 mj0Var = ej0Var.V;
                    dj0 dj0Var = new dj0(this.h, null);
                    this.f = 1;
                    if (mj0Var.g(v40.f, dj0Var, this) == dhVar) {
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
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    mj0 mj0Var2 = ej0Var.V;
                    long j2 = this.h;
                    this.f = 1;
                    if (mj0Var2.c(j2, true, this) == dhVar) {
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
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    t30.z(obj);
                    mj0 mj0Var3 = ej0Var.V;
                    long j3 = this.h;
                    this.f = 1;
                    if (mj0Var3.c(j3, false, this) == dhVar) {
                        break;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ej0 ej0Var, ng ngVar) {
        super(2, ngVar);
        this.e = 0;
        this.g = ej0Var;
    }
}
