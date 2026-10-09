package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class l30 implements pq {
    public final /* synthetic */ o30 e;
    public final /* synthetic */ ve0 f;
    public final /* synthetic */ se0 g;
    public final /* synthetic */ mj0 h;
    public final /* synthetic */ re0 i;

    public /* synthetic */ l30(o30 o30Var, ve0 ve0Var, se0 se0Var, mj0 mj0Var, re0 re0Var) {
        this.e = o30Var;
        this.f = ve0Var;
        this.g = se0Var;
        this.h = mj0Var;
        this.i = re0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        o30 o30Var = this.e;
        j30 g = o30.g(o30Var.g);
        if (g != null) {
            p2 p2Var = o30Var.e;
            long j = g.b;
            long j2 = g.a;
            ((ht0) p2Var.f).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((ht0) p2Var.g).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            ve0 ve0Var = this.f;
            j30 a = ((j30) ve0Var.e).a(g);
            ve0Var.e = a;
            long j3 = a.a;
            mj0 mj0Var = this.h;
            this.g.e = mj0Var.j(mj0Var.f(j3));
            this.i.e = !p30.k(r0 - floatValue);
        }
        return Boolean.valueOf(g != null);
    }
}
