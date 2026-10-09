package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s50 extends og {
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ t50 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(t50 t50Var, og ogVar) {
        super(ogVar);
        this.g = t50Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.M(0L, this);
    }
}
