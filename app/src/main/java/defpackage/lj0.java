package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lj0 extends go0 implements tq {
    public long e;
    public int f;
    public /* synthetic */ long g;
    public final /* synthetic */ mj0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(mj0 mj0Var, ng ngVar) {
        super(2, ngVar);
        this.h = mj0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        lj0 lj0Var = new lj0(this.h, ngVar);
        lj0Var.g = ((ft0) obj).a;
        return lj0Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        long j = ((ft0) obj).a;
        lj0 lj0Var = new lj0(this.h, (ng) obj2);
        lj0Var.g = j;
        return lj0Var.invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        mj0 mj0Var = this.h;
        dh dhVar = dh.e;
        if (i == 0) {
            t30.z(obj);
            j = this.g;
            l20 l20Var = mj0Var.f;
            this.g = j;
            this.f = 1;
            obj = l20Var.f(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.e;
                    j3 = this.g;
                    t30.z(obj);
                    return new ft0(ft0.d(j3, ft0.d(j4, ((ft0) obj).a)));
                }
                j2 = this.e;
                j = this.g;
                t30.z(obj);
                long j5 = ((ft0) obj).a;
                l20 l20Var2 = mj0Var.f;
                long d = ft0.d(j2, j5);
                this.g = j;
                this.e = j5;
                this.f = 3;
                obj = l20Var2.d(d, j5, this);
                if (obj != dhVar) {
                    j3 = j;
                    j4 = j5;
                    return new ft0(ft0.d(j3, ft0.d(j4, ((ft0) obj).a)));
                }
                return dhVar;
            }
            j = this.g;
            t30.z(obj);
        }
        long d2 = ft0.d(j, ((ft0) obj).a);
        this.g = j;
        this.e = d2;
        this.f = 2;
        obj = mj0Var.a(d2, this);
        if (obj != dhVar) {
            j2 = d2;
            long j52 = ((ft0) obj).a;
            l20 l20Var22 = mj0Var.f;
            long d3 = ft0.d(j2, j52);
            this.g = j;
            this.e = j52;
            this.f = 3;
            obj = l20Var22.d(d3, j52, this);
            if (obj != dhVar) {
            }
        }
        return dhVar;
    }
}
