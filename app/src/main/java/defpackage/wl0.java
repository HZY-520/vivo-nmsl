package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class wl0 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ pq f;
    public final /* synthetic */ pq g;

    public /* synthetic */ wl0(pq pqVar, pq pqVar2, int i) {
        this.e = i;
        this.f = pqVar;
        this.g = pqVar2;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        pq pqVar = this.g;
        pq pqVar2 = this.f;
        switch (i) {
            case 0:
                pqVar2.invoke(obj);
                pqVar.invoke(obj);
                break;
            default:
                pqVar2.invoke(obj);
                pqVar.invoke(obj);
                break;
        }
        return fs0Var;
    }
}
