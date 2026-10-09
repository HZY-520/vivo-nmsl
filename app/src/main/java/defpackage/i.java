package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ b40 g;
    public final /* synthetic */ hd0 h;
    public final /* synthetic */ tb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(b40 b40Var, hd0 hd0Var, tb tbVar, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = b40Var;
        this.h = hd0Var;
        this.i = tbVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        switch (this.e) {
            case 0:
                return new i(this.g, this.h, this.i, ngVar, 0);
            default:
                return new i(this.g, this.h, this.i, ngVar, 1);
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
        return ((i) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.q3.p(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.q3.p(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        tb tbVar = this.i;
        b40 b40Var = this.g;
        dh dhVar = dh.e;
        hd0 hd0Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    long j = ub.a;
                    this.f = 1;
                    break;
                } else if (i2 == 1) {
                    t30.z(obj);
                } else if (i2 != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    tbVar.I = hd0Var;
                    break;
                }
                this.f = 2;
                break;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    long j2 = ub.a;
                    this.f = 1;
                    break;
                } else if (i3 == 1) {
                    t30.z(obj);
                } else if (i3 != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    tbVar.E = hd0Var;
                    break;
                }
                this.f = 2;
                break;
        }
        return fs0Var;
    }
}
