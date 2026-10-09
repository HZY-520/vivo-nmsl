package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rh extends t20 implements il {
    public final b40 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public rh(b40 b40Var) {
        this.s = b40Var;
    }

    @Override // defpackage.il
    public final void B(ky kyVar) {
        kyVar.a();
        oa oaVar = kyVar.e;
        if (this.t) {
            jl.w(kyVar, gc.b(gc.b, 0.3f), oaVar.u(), 122);
        } else if (this.u || this.v) {
            jl.w(kyVar, gc.b(gc.b, 0.1f), oaVar.u(), 122);
        }
    }

    @Override // defpackage.t20
    public final void g0() {
        q3.A(c0(), null, new qh(this, null, 0), 3);
    }
}
