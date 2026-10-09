package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jo0 implements si, ng {
    public final /* synthetic */ ko0 e;
    public final ja f;
    public ja g;
    public sc0 h = sc0.f;
    public final /* synthetic */ ko0 i;

    public jo0(ko0 ko0Var, ja jaVar) {
        this.i = ko0Var;
        this.e = ko0Var;
        this.f = jaVar;
    }

    @Override // defpackage.si
    public final int D(float f) {
        return this.e.D(f);
    }

    @Override // defpackage.si
    public final long K(long j) {
        return this.e.K(j);
    }

    @Override // defpackage.si
    public final float N(long j) {
        return this.e.N(j);
    }

    @Override // defpackage.si
    public final long S(float f) {
        return this.e.S(f);
    }

    @Override // defpackage.si
    public final float a0(float f) {
        return f / this.e.k();
    }

    public final Object b(sc0 sc0Var, b8 b8Var) {
        ja jaVar = new ja(1, lr0.x(b8Var));
        jaVar.r();
        this.h = sc0Var;
        this.g = jaVar;
        return jaVar.p();
    }

    @Override // defpackage.si
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return sm.e;
    }

    @Override // defpackage.si
    public final float k() {
        return this.e.k();
    }

    @Override // defpackage.si
    public final long m(float f) {
        return this.e.m(f);
    }

    @Override // defpackage.si
    public final long n(long j) {
        return this.e.n(j);
    }

    @Override // defpackage.si
    public final float o(float f) {
        return this.e.k() * f;
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        ko0 ko0Var = this.i;
        synchronized (ko0Var.y) {
            ko0Var.x.i(this);
        }
        this.f.resumeWith(obj);
    }

    @Override // defpackage.si
    public final float y(long j) {
        return this.e.y(j);
    }
}
