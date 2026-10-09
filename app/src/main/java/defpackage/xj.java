package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xj extends og {
    public /* synthetic */ Object e;
    public final /* synthetic */ yj f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(yj yjVar, ng ngVar) {
        super(ngVar);
        this.f = yjVar;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
