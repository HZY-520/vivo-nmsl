package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t60 implements x6 {
    public final x6 a;
    public final int b;
    public int c;

    public t60(x6 x6Var, int i) {
        this.a = x6Var;
        this.b = i;
    }

    @Override // defpackage.x6
    public final void a(int i, Object obj) {
        this.a.a(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.x6
    public final void b(Object obj) {
        this.c++;
        this.a.b(obj);
    }

    @Override // defpackage.x6
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.x6
    public final void d(int i, Object obj) {
        this.a.d(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.x6
    public final void e(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.e(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.x6
    public final Object f() {
        return this.a.f();
    }

    @Override // defpackage.x6
    public final void g(int i, int i2) {
        this.a.g(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.x6
    public final void h(tq tqVar, Object obj) {
        this.a.h(tqVar, obj);
    }

    @Override // defpackage.x6
    public final void i() {
        if (this.c <= 0) {
            ue.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.i();
    }
}
