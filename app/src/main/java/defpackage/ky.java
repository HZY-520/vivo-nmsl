package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ky implements jl {
    public final oa e = new oa();
    public il f;

    @Override // defpackage.jl
    public final void C(s4 s4Var, long j, long j2, long j3, float f, l8 l8Var, int i) {
        this.e.C(s4Var, j, j2, j3, f, l8Var, i);
    }

    @Override // defpackage.si
    public final int D(float f) {
        return this.e.D(f);
    }

    @Override // defpackage.jl
    public final long H() {
        return this.e.H();
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

    public final void a() {
        oa oaVar = this.e;
        v6 v6Var = oaVar.f;
        ma o = oaVar.f.o();
        ni niVar = this.f;
        if (niVar == null) {
            throw j2.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        t20 t20Var = (t20) niVar;
        t20 t20Var2 = t20Var.e.j;
        if (t20Var2 != null && (t20Var2.h & 4) != 0) {
            while (t20Var2 != null) {
                int i = t20Var2.g;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    t20Var2 = t20Var2.j;
                }
            }
        }
        t20Var2 = null;
        if (t20Var2 == null) {
            d60 Y = nh.Y(niVar, 4);
            if (Y.A0() == t20Var.e) {
                Y = Y.z;
                Y.getClass();
            }
            Y.R0(o, (es) v6Var.b);
            return;
        }
        t40 t40Var = null;
        while (t20Var2 != null) {
            if (t20Var2 instanceof il) {
                il ilVar = (il) t20Var2;
                es esVar = (es) v6Var.b;
                d60 Y2 = nh.Y(ilVar, 4);
                long G = t10.G(Y2.g);
                iy iyVar = Y2.y;
                iyVar.getClass();
                nh.c0(iyVar).getSharedDrawScope().b(o, G, Y2, ilVar, esVar);
            } else if ((t20Var2.g & 4) != 0 && (t20Var2 instanceof oi)) {
                int i2 = 0;
                for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                    if ((t20Var3.g & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            t20Var2 = t20Var3;
                        } else {
                            if (t40Var == null) {
                                t40Var = new t40(new t20[16]);
                            }
                            if (t20Var2 != null) {
                                t40Var.b(t20Var2);
                                t20Var2 = null;
                            }
                            t40Var.b(t20Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            t20Var2 = nh.N(t40Var);
        }
    }

    @Override // defpackage.si
    public final float a0(float f) {
        return f / this.e.k();
    }

    public final void b(ma maVar, long j, d60 d60Var, il ilVar, es esVar) {
        il ilVar2 = this.f;
        this.f = ilVar;
        xx xxVar = d60Var.y.B;
        v6 v6Var = this.e.f;
        si p = v6Var.p();
        xx r = v6Var.r();
        ma o = v6Var.o();
        long s = v6Var.s();
        es esVar2 = (es) v6Var.b;
        v6Var.A(d60Var);
        v6Var.B(xxVar);
        v6Var.z(maVar);
        v6Var.C(j);
        v6Var.b = esVar;
        maVar.i();
        try {
            ilVar.B(this);
            maVar.g();
            v6Var.A(p);
            v6Var.B(r);
            v6Var.z(o);
            v6Var.C(s);
            v6Var.b = esVar2;
            this.f = ilVar2;
        } catch (Throwable th) {
            maVar.g();
            v6Var.A(p);
            v6Var.B(r);
            v6Var.z(o);
            v6Var.C(s);
            v6Var.b = esVar2;
            throw th;
        }
    }

    public final void c(c5 c5Var, long j, t10 t10Var) {
        oa oaVar = this.e;
        oaVar.e.c.f(c5Var, oa.a(oaVar, j, t10Var, 3));
    }

    @Override // defpackage.si
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.jl
    public final xx getLayoutDirection() {
        return this.e.e.b;
    }

    @Override // defpackage.jl
    public final void j(float f, long j, long j2) {
        this.e.j(f, j, j2);
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

    @Override // defpackage.jl
    public final void r(c5 c5Var, dx0 dx0Var, float f, t10 t10Var, int i) {
        this.e.r(c5Var, dx0Var, f, t10Var, i);
    }

    @Override // defpackage.jl
    public final void s(long j, long j2, long j3, t10 t10Var, int i) {
        this.e.s(j, j2, j3, t10Var, i);
    }

    @Override // defpackage.jl
    public final v6 t() {
        return this.e.f;
    }

    @Override // defpackage.jl
    public final long u() {
        return this.e.u();
    }

    @Override // defpackage.si
    public final float y(long j) {
        return this.e.y(j);
    }
}
