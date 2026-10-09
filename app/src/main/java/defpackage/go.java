package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class go extends go0 implements uq {
    public int e;
    public /* synthetic */ bo f;
    public /* synthetic */ Object g;
    public final /* synthetic */ tq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(tq tqVar, ng ngVar) {
        super(3, ngVar);
        this.h = tqVar;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        go goVar = new go(this.h, (ng) obj3);
        goVar.f = (bo) obj;
        goVar.g = obj2;
        return goVar.invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.d(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r4) goto L15;
     */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bo boVar;
        int i = this.e;
        dh dhVar = dh.e;
        if (i == 0) {
            t30.z(obj);
            boVar = this.f;
            Object obj2 = this.g;
            this.f = boVar;
            this.e = 1;
            obj = this.h.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    t30.z(obj);
                    return fs0.a;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boVar = this.f;
            t30.z(obj);
        }
        this.f = null;
        this.e = 2;
    }
}
