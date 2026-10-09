package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n50 extends ql0 {
    public final pq e;
    public final ql0 f;

    public n50(long j, vl0 vl0Var, pq pqVar, ql0 ql0Var) {
        super(j, vl0Var);
        this.e = pqVar;
        this.f = ql0Var;
        ql0Var.k();
    }

    @Override // defpackage.ql0
    public final void c() {
        ql0 ql0Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != ql0Var.g()) {
            a();
        }
        ql0Var.l();
        this.c = true;
        synchronized (xl0.c) {
            o();
        }
    }

    @Override // defpackage.ql0
    public final pq e() {
        return this.e;
    }

    @Override // defpackage.ql0
    public final boolean f() {
        return true;
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
    public final void n(gn0 gn0Var) {
        zh0 zh0Var = xl0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ql0
    public final ql0 u(pq pqVar) {
        return new n50(this.b, this.a, xl0.i(pqVar, this.e, true), this.f);
    }

    @Override // defpackage.ql0
    public final void m() {
    }
}
