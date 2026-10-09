package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w9 extends go0 implements tq {
    public int e;
    public final /* synthetic */ y5 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ x9 i;
    public final /* synthetic */ gw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(y5 y5Var, float f, boolean z, x9 x9Var, gw gwVar, ng ngVar) {
        super(2, ngVar);
        this.f = y5Var;
        this.g = f;
        this.h = z;
        this.i = x9Var;
        this.j = gwVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        return new w9(this.f, this.g, this.h, this.i, this.j, ngVar);
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((w9) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if ((r0 instanceof defpackage.mo) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0 A[RETURN] */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        jr0 jr0Var = null;
        if (i == 0) {
            t30.z(obj);
            y5 y5Var = this.f;
            float f = ((ck) y5Var.e.getValue()).e;
            float f2 = this.g;
            if (!ck.b(f, f2)) {
                boolean z = this.h;
                dh dhVar = dh.e;
                if (z) {
                    float f3 = ((ck) y5Var.e.getValue()).e;
                    gw hd0Var = ck.b(f3, 0.0f) ? new hd0(0L) : ck.b(f3, this.i.a) ? new ot() : ck.b(f3, 0.0f) ? new mo() : null;
                    this.e = 2;
                    jr0 jr0Var2 = zl.b;
                    jr0 jr0Var3 = zl.a;
                    gw gwVar = this.j;
                    if (gwVar != null) {
                        if ((gwVar instanceof hd0) || (gwVar instanceof al) || (gwVar instanceof ot) || (gwVar instanceof mo)) {
                            jr0Var = jr0Var3;
                        }
                    } else if (hd0Var != null) {
                        if (!(hd0Var instanceof hd0) && !(hd0Var instanceof al)) {
                            if (hd0Var instanceof ot) {
                                jr0Var = zl.c;
                            }
                        }
                        jr0Var = jr0Var2;
                    }
                    if (jr0Var == null ? (c = y5Var.c(new ck(f2), this)) != dhVar : (c = y5.a(y5Var, new ck(f2), jr0Var, this)) != dhVar) {
                        c = fs0Var;
                    }
                    if (c == dhVar) {
                    }
                } else {
                    ck ckVar = new ck(f2);
                    this.e = 1;
                    if (y5Var.c(ckVar, this) == dhVar) {
                        return dhVar;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t30.z(obj);
        }
        return fs0Var;
    }
}
