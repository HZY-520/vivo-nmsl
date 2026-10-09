package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fg extends go0 implements tq {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ os0 g;
    public final /* synthetic */ hg h;
    public final /* synthetic */ d9 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ ww k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(os0 os0Var, hg hgVar, d9 d9Var, long j, ww wwVar, ng ngVar) {
        super(2, ngVar);
        this.g = os0Var;
        this.h = hgVar;
        this.i = d9Var;
        this.j = j;
        this.k = wwVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        fg fgVar = new fg(this.g, this.h, this.i, this.j, this.k, ngVar);
        fgVar.f = obj;
        return fgVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((fg) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            t30.z(obj);
            kj0 kj0Var = (kj0) this.f;
            long j = this.j;
            hg hgVar = this.h;
            d9 d9Var = this.i;
            float o0 = hgVar.o0(d9Var, j);
            os0 os0Var = this.g;
            os0Var.e = o0;
            v5 v5Var = new v5(hgVar, os0Var, this.k, kj0Var);
            v7 v7Var = new v7(hgVar, os0Var, d9Var, 2);
            this.e = 1;
            Object a = os0Var.a(v5Var, v7Var, this);
            dh dhVar = dh.e;
            if (a == dhVar) {
                return dhVar;
            }
        } else {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t30.z(obj);
        }
        return fs0.a;
    }
}
