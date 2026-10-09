package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class c50 implements ha, mu0 {
    public final ja e;
    public final /* synthetic */ d50 f;

    public c50(d50 d50Var, ja jaVar) {
        this.f = d50Var;
        this.e = jaVar;
    }

    @Override // defpackage.ha
    public final boolean a() {
        return this.e.q() instanceof m60;
    }

    @Override // defpackage.mu0
    public final void b(nj0 nj0Var, int i) {
        this.e.b(nj0Var, i);
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.e.i;
    }

    @Override // defpackage.ha
    public final mm h(Object obj, uq uqVar) {
        d50 d50Var = this.f;
        ia iaVar = new ia(d50Var, this);
        mm h = this.e.h((fs0) obj, iaVar);
        if (h != null) {
            d50.h.set(d50Var, null);
        }
        return h;
    }

    @Override // defpackage.ha
    public final boolean i(Throwable th) {
        return this.e.i(th);
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        this.e.resumeWith(obj);
    }

    @Override // defpackage.ha
    public final void v(Object obj) {
        this.e.v(obj);
    }
}
