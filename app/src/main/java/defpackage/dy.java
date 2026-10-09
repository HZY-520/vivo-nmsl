package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dy extends d60 {
    public static final v4 g0;
    public ay e0;
    public cy f0;

    static {
        v4 b = dx0.b();
        b.d(gc.d);
        b.a.setStrokeWidth(1.0f);
        b.f(1);
        g0 = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dy(iy iyVar, ay ayVar) {
        super(iyVar);
        this.e0 = ayVar;
        this.f0 = iyVar.l != null ? new cy(this) : null;
        if ((((t20) ayVar).e.g & 512) == 0) {
            return;
        }
        z6.c();
        throw null;
    }

    @Override // defpackage.d60
    public final t20 A0() {
        return ((t20) this.e0).e;
    }

    @Override // defpackage.ec0
    public final void P(long j, float f, pq pqVar) {
        S0(j, f, pqVar);
        if (this.r) {
            return;
        }
        N0();
        d60 d60Var = this.z;
        d60Var.getClass();
        boolean z = d60Var.s;
        d60Var.s = this.s;
        e0().e();
        d60Var.s = z;
    }

    @Override // defpackage.d60
    public final void R0(ma maVar, es esVar) {
        d60 d60Var;
        d60 d60Var2 = this.z;
        d60Var2.getClass();
        d60Var2.t0(maVar, esVar);
        if (!nh.c0(this.y).getShowLayoutBounds() || (d60Var = this.z) == null) {
            return;
        }
        if (ew.a(this.g, d60Var.g) && xv.a(d60Var.J, 0L)) {
            return;
        }
        long j = this.g;
        maVar.l(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, g0);
    }

    @Override // defpackage.w00
    public final int U(c2 c2Var) {
        cy cyVar = this.f0;
        if (cyVar == null) {
            return nh.i(this, c2Var);
        }
        g40 g40Var = cyVar.D;
        int c = g40Var.c(c2Var);
        if (c >= 0) {
            return g40Var.c[c];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.w10
    public final ec0 b(long j) {
        R(j);
        ay ayVar = this.e0;
        d60 d60Var = this.z;
        d60Var.getClass();
        V0(ayVar.J(this, d60Var, j));
        M0();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(ay ayVar) {
        if (ayVar.equals(this.e0) || (((t20) ayVar).e.g & 512) == 0) {
            this.e0 = ayVar;
        } else {
            z6.c();
        }
    }

    @Override // defpackage.d60
    public final void v0() {
        if (this.f0 == null) {
            this.f0 = new cy(this);
        }
    }

    @Override // defpackage.d60
    public final y00 y0() {
        return this.f0;
    }
}
