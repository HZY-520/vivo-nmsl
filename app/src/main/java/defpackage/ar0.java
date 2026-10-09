package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ar0 extends o40 {
    public final o40 o;
    public final boolean p;
    public final boolean q;
    public pq r;
    public pq s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ar0(o40 o40Var, pq pqVar, pq pqVar2, boolean z, boolean z2) {
        super(0L, vl0.i, xl0.i(pqVar, (o40Var == null || (r0 = o40Var.e()) == null) ? xl0.j.e : r0, z), xl0.j(pqVar2, (o40Var == null || (r9 = o40Var.i()) == null) ? xl0.j.f : r9));
        pq i;
        pq e;
        zh0 zh0Var = xl0.a;
        this.o = o40Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = v10.c();
    }

    @Override // defpackage.o40
    public final void B(l40 l40Var) {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40
    public final o40 C(pq pqVar, pq pqVar2) {
        pq i = xl0.i(pqVar, this.r, true);
        pq j = xl0.j(pqVar2, this.s);
        return !this.p ? new ar0(D().C(null, j), i, j, false, true) : D().C(i, j);
    }

    public final o40 D() {
        o40 o40Var = this.o;
        return o40Var == null ? xl0.j : o40Var;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void c() {
        o40 o40Var;
        this.c = true;
        if (!this.q || (o40Var = this.o) == null) {
            return;
        }
        o40Var.c();
    }

    @Override // defpackage.ql0
    public final vl0 d() {
        return D().d();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final pq e() {
        return this.r;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ql0
    public final long g() {
        return D().g();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final int h() {
        return D().h();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final pq i() {
        return this.s;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void k() {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void l() {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void m() {
        D().m();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void n(gn0 gn0Var) {
        D().n(gn0Var);
    }

    @Override // defpackage.ql0
    public final void r(vl0 vl0Var) {
        t30.B();
        throw null;
    }

    @Override // defpackage.ql0
    public final void s(long j) {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.o40, defpackage.ql0
    public final ql0 u(pq pqVar) {
        pq i = xl0.i(pqVar, this.r, true);
        return !this.p ? xl0.e(D().u(null), i, true) : D().u(i);
    }

    @Override // defpackage.o40
    public final m20 w() {
        return D().w();
    }

    @Override // defpackage.o40
    public final l40 x() {
        return D().x();
    }

    @Override // defpackage.o40
    /* renamed from: y */
    public final pq e() {
        return this.r;
    }
}
