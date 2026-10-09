package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mw extends of0 {
    public int e;
    public final /* synthetic */ tq f;
    public final /* synthetic */ ng g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ng ngVar, ng ngVar2, tq tqVar) {
        super(ngVar);
        this.f = tqVar;
        this.g = ngVar2;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                z6.m("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            t30.z(obj);
            return obj;
        }
        this.e = 1;
        t30.z(obj);
        tq tqVar = this.f;
        tqVar.getClass();
        lr0.e(2, tqVar);
        return tqVar.invoke(this.g, this);
    }
}
