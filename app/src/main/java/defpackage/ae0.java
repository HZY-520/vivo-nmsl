package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ae0 extends ql0 {
    public final pq e;
    public int f;

    public ae0(long j, vl0 vl0Var, pq pqVar) {
        super(j, vl0Var);
        this.e = pqVar;
        this.f = 1;
    }

    @Override // defpackage.ql0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.ql0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ql0
    public final void n(gn0 gn0Var) {
        zh0 zh0Var = xl0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ql0
    public final ql0 u(pq pqVar) {
        xl0.v(this);
        return new n50(this.b, this.a, xl0.i(pqVar, this.e, true), this);
    }

    @Override // defpackage.ql0
    public final void m() {
    }
}
