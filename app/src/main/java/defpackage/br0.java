package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class br0 extends ql0 {
    public final ql0 e;
    public final boolean f;
    public final boolean g;
    public pq h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(ql0 ql0Var, pq pqVar, boolean z, boolean z2) {
        super(0L, vl0.i);
        pq e;
        zh0 zh0Var = xl0.a;
        this.e = ql0Var;
        this.f = z;
        this.g = z2;
        this.h = xl0.i(pqVar, (ql0Var == null || (e = ql0Var.e()) == null) ? xl0.j.e : e, z);
        this.i = v10.c();
    }

    @Override // defpackage.ql0
    public final void c() {
        ql0 ql0Var;
        this.c = true;
        if (!this.g || (ql0Var = this.e) == null) {
            return;
        }
        ql0Var.c();
    }

    @Override // defpackage.ql0
    public final vl0 d() {
        return v().d();
    }

    @Override // defpackage.ql0
    public final pq e() {
        return this.h;
    }

    @Override // defpackage.ql0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ql0
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ql0
    public final pq i() {
        return null;
    }

    @Override // defpackage.ql0
    public final void k() {
        t30.B();
        throw null;
    }

    @Override // defpackage.ql0
    public final void l() {
        t30.B();
        throw null;
    }

    @Override // defpackage.ql0
    public final void m() {
        v().m();
    }

    @Override // defpackage.ql0
    public final void n(gn0 gn0Var) {
        v().n(gn0Var);
    }

    @Override // defpackage.ql0
    public final ql0 u(pq pqVar) {
        pq i = xl0.i(pqVar, this.h, true);
        return !this.f ? xl0.e(v().u(null), i, true) : v().u(i);
    }

    public final ql0 v() {
        ql0 ql0Var = this.e;
        return ql0Var == null ? xl0.j : ql0Var;
    }
}
