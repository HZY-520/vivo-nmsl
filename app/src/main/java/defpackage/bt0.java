package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bt0 extends h90 {
    public final w90 e = p30.m(new hl0(0));
    public final w90 f = p30.m(Boolean.FALSE);
    public final ws0 g;
    public final w90 h;
    public float i;
    public l8 j;

    public bt0(os osVar) {
        ws0 ws0Var = new ws0(osVar);
        ws0Var.f = new f5(19, this);
        this.g = ws0Var;
        this.h = new w90(fs0.a, b2.R);
        this.i = 1.0f;
    }

    @Override // defpackage.h90
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.h90
    public final void b(l8 l8Var) {
        this.j = l8Var;
    }

    @Override // defpackage.h90
    public final long d() {
        return ((hl0) this.e.getValue()).a;
    }

    @Override // defpackage.h90
    public final void e(jl jlVar) {
        l8 l8Var = this.j;
        ws0 ws0Var = this.g;
        if (l8Var == null) {
            l8Var = (l8) ws0Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && jlVar.getLayoutDirection() == xx.f) {
            long H = jlVar.H();
            v6 t = jlVar.t();
            long s = t.s();
            t.o().i();
            try {
                ((t3) t.a).z(-1.0f, 1.0f, H);
                ws0Var.e(jlVar, this.i, l8Var);
            } finally {
                t.o().g();
                t.C(s);
            }
        } else {
            ws0Var.e(jlVar, this.i, l8Var);
        }
        this.h.getValue();
    }
}
