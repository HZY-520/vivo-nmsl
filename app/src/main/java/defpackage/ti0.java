package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ti0 implements fj0 {
    public static final p2 k = new p2(17, new ei0(1), new zh0(23));
    public final t90 a;
    public float g;
    public final aj i;
    public final aj j;
    public final t90 b = new t90(0);
    public final t90 c = new t90(0);
    public final w90 d = p30.m(Boolean.FALSE);
    public final b40 e = new b40();
    public final t90 f = new t90(Integer.MAX_VALUE);
    public final hi h = new hi(new l(22, this));

    public ti0(int i) {
        this.a = new t90(i);
        final int i2 = 0;
        eq eqVar = new eq(this) { // from class: si0
            public final /* synthetic */ ti0 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                int i3 = i2;
                ti0 ti0Var = this.f;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(ti0Var.a.g() < ti0Var.f.g());
                    default:
                        return Boolean.valueOf(ti0Var.a.g() > 0);
                }
            }
        };
        v6 v6Var = dm0.a;
        this.i = new aj(eqVar);
        final int i3 = 1;
        this.j = new aj(new eq(this) { // from class: si0
            public final /* synthetic */ ti0 f;

            {
                this.f = this;
            }

            @Override // defpackage.eq
            public final Object b() {
                int i32 = i3;
                ti0 ti0Var = this.f;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(ti0Var.a.g() < ti0Var.f.g());
                    default:
                        return Boolean.valueOf(ti0Var.a.g() > 0);
                }
            }
        });
    }

    @Override // defpackage.fj0
    public final boolean a() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.fj0
    public final Object b(v40 v40Var, f fVar, og ogVar) {
        Object b = this.h.b(v40Var, fVar, ogVar);
        return b == dh.e ? b : fs0.a;
    }

    @Override // defpackage.fj0
    public final boolean c() {
        return this.h.c();
    }

    @Override // defpackage.fj0
    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.fj0
    public final float e(float f) {
        return this.h.e(f);
    }
}
