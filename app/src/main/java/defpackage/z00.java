package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z00 implements wx {
    public final y00 e;

    public z00(y00 y00Var) {
        this.e = y00Var;
    }

    @Override // defpackage.wx
    public final oe0 A(wx wxVar, boolean z) {
        return this.e.y.A(wxVar, z);
    }

    @Override // defpackage.wx
    public final long B() {
        y00 y00Var = this.e;
        return (y00Var.e << 32) | (y00Var.f & 4294967295L);
    }

    @Override // defpackage.wx
    public final long a(long j) {
        return this.e.y.a(s60.e(0L, b()));
    }

    public final long b() {
        y00 y00Var = this.e;
        y00 p = t10.p(y00Var);
        return s60.d(z(p.B, 0L), y00Var.y.z(p.y, 0L));
    }

    @Override // defpackage.wx
    public final long d(long j) {
        return this.e.y.d(s60.e(j, b()));
    }

    @Override // defpackage.wx
    public final wx f() {
        y00 y0;
        if (!x()) {
            cv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d60 d60Var = this.e.y.y.H.d.A;
        if (d60Var == null || (y0 = d60Var.y0()) == null) {
            return null;
        }
        return y0.B;
    }

    @Override // defpackage.wx
    public final long v(wx wxVar, long j) {
        return z(wxVar, j);
    }

    @Override // defpackage.wx
    public final boolean x() {
        return this.e.y.A0().r;
    }

    @Override // defpackage.wx
    public final long z(wx wxVar, long j) {
        boolean z = wxVar instanceof z00;
        y00 y00Var = this.e;
        if (!z) {
            y00 p = t10.p(y00Var);
            d60 d60Var = p.y;
            long z2 = z(p.B, j);
            float f = (int) (p.z & 4294967295L);
            long d = s60.d(z2, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!d60Var.A0().r) {
                cv.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            d60Var.L0();
            d60 d60Var2 = d60Var.A;
            if (d60Var2 != null) {
                d60Var = d60Var2;
            }
            return s60.e(d, d60Var.z(wxVar, 0L));
        }
        y00 y00Var2 = ((z00) wxVar).e;
        d60 d60Var3 = y00Var2.y;
        d60Var3.L0();
        y00 y0 = y00Var.y.w0(d60Var3).y0();
        if (y0 != null) {
            long b = xv.b(xv.c(y00Var2.r0(y0, false), kw.N(j)), y00Var.r0(y0, false));
            return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
        }
        y00 p2 = t10.p(y00Var2);
        long c = xv.c(xv.c(y00Var2.r0(p2, false), p2.z), kw.N(j));
        y00 p3 = t10.p(y00Var);
        long b2 = xv.b(c, xv.c(y00Var.r0(p3, false), p3.z));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
        d60 d60Var4 = p3.y.A;
        d60Var4.getClass();
        d60 d60Var5 = p2.y.A;
        d60Var5.getClass();
        return d60Var4.z(d60Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }
}
