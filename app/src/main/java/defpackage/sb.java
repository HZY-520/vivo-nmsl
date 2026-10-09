package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sb implements uq {
    public final /* synthetic */ mu e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ eq g;

    public sb(mu muVar, boolean z, eq eqVar) {
        this.e = muVar;
        this.f = z;
        this.g = eqVar;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        gr grVar = (gr) ((se) obj2);
        grVar.P(-1525724089);
        Object G = grVar.G();
        if (G == re.a) {
            G = new b40();
            grVar.Y(G);
        }
        b40 b40Var = (b40) G;
        ll llVar = ju.a;
        u20 c = new ku(b40Var, this.e).c(new rb(b40Var, null, false, this.f, this.g));
        grVar.o(false);
        return c;
    }
}
