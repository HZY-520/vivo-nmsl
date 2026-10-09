package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jj0 extends go0 implements tq {
    public mj0 e;
    public ue0 f;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ mj0 j;
    public final /* synthetic */ ue0 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(mj0 mj0Var, ue0 ue0Var, long j, ng ngVar) {
        super(2, ngVar);
        this.j = mj0Var;
        this.k = ue0Var;
        this.l = j;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        jj0 jj0Var = new jj0(this.j, this.k, this.l, ngVar);
        jj0Var.i = obj;
        return jj0Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((jj0) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        mj0 mj0Var;
        ue0 ue0Var;
        mj0 mj0Var2;
        long j;
        int i = this.h;
        q80 q80Var = q80.f;
        if (i == 0) {
            t30.z(obj);
            kj0 kj0Var = (kj0) this.i;
            mj0Var = this.j;
            ij0 ij0Var = new ij0(mj0Var, kj0Var);
            xh xhVar = mj0Var.c;
            ue0Var = this.k;
            long j2 = ue0Var.e;
            q80 q80Var2 = mj0Var.d;
            long j3 = this.l;
            float e = mj0Var.e(q80Var2 == q80Var ? ft0.b(j3) : ft0.c(j3));
            this.i = mj0Var;
            this.e = mj0Var;
            this.f = ue0Var;
            this.g = j2;
            this.h = 1;
            xhVar.getClass();
            obj = q3.P(xhVar.b, new wh(e, xhVar, ij0Var, null), this);
            dh dhVar = dh.e;
            if (obj == dhVar) {
                return dhVar;
            }
            mj0Var2 = mj0Var;
            j = j2;
        } else {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.g;
            ue0Var = this.f;
            mj0Var = this.e;
            mj0Var2 = (mj0) this.i;
            t30.z(obj);
        }
        float e2 = mj0Var2.e(((Number) obj).floatValue());
        ue0Var.e = mj0Var.d == q80Var ? ft0.a(j, e2, 0.0f, 2) : ft0.a(j, 0.0f, e2, 1);
        return fs0.a;
    }
}
