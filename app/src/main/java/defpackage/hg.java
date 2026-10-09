package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hg extends t20 implements df, c20 {
    public q80 s;
    public final mj0 t;
    public boolean u;
    public final cj0 v;
    public boolean x;
    public boolean z;
    public final t3 w = new t3(1);
    public long y = -1;

    public hg(q80 q80Var, mj0 mj0Var, boolean z, cj0 cj0Var) {
        this.s = q80Var;
        this.t = mj0Var;
        this.u = z;
        this.v = cj0Var;
    }

    public static boolean q0(hg hgVar, oe0 oe0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = hgVar.p0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long s0 = hgVar.s0(oe0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (s0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (s0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.c20
    public final void b(long j) {
        int m;
        long p0 = p0();
        this.y = j;
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            m = lw.m((int) (j & 4294967295L), (int) (p0 & 4294967295L));
        } else {
            if (ordinal != 1) {
                z6.j();
                return;
            }
            m = lw.m((int) (j >> 32), (int) (p0 >> 32));
        }
        if (m >= 0) {
            return;
        }
        long j2 = !this.u ? this.s == q80.e ? (((int) (p0 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (p0 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        oe0 oe0Var = (oe0) this.v.b();
        if (oe0Var == null || this.z || this.x || !q0(this, oe0Var, p0, 0L, 2) || q0(this, oe0Var, 0L, j2, 1)) {
            return;
        }
        this.x = true;
        r0(j2);
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    public final float o0(d9 d9Var, long j) {
        float f;
        oe0 oe0Var;
        int compare;
        long j2 = this.y;
        t40 t40Var = (t40) this.w.f;
        int i = t40Var.g - 1;
        Object[] objArr = t40Var.e;
        if (i < objArr.length) {
            oe0Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                oe0 oe0Var2 = (oe0) ((eg) objArr[i]).a.b();
                if (oe0Var2 != null) {
                    long b = oe0Var2.b();
                    long G = t10.G(p0());
                    f = 0.0f;
                    int ordinal = this.s.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (b & 4294967295L)), Float.intBitsToFloat((int) (G & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            z6.j();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (G >> 32)));
                    }
                    if (compare <= 0) {
                        oe0Var = oe0Var2;
                    } else if (oe0Var == null) {
                        oe0Var = oe0Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            oe0Var = null;
        }
        if (oe0Var == null) {
            oe0 oe0Var3 = this.x ? (oe0) this.v.b() : null;
            if (oe0Var3 == null) {
                return f;
            }
            oe0Var = oe0Var3;
        }
        long G2 = t10.G(j2);
        int ordinal2 = this.s.ordinal();
        if (ordinal2 == 0) {
            float f2 = oe0Var.b;
            return d9Var.a(f2 - ((int) (j & 4294967295L)), oe0Var.d - f2, Float.intBitsToFloat((int) (G2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = oe0Var.a;
            return d9Var.a(f3 - ((int) (j >> 32)), oe0Var.c - f3, Float.intBitsToFloat((int) (G2 >> 32)));
        }
        z6.j();
        return f;
    }

    public final long p0() {
        long j = this.y;
        if (ew.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void r0(long j) {
        lf lfVar = f9.a;
        d9 d9Var = (d9) q3.o(this, lfVar);
        if (this.z) {
            fv.c("launchAnimation called when previous animation was running");
        }
        ((d9) q3.o(this, lfVar)).getClass();
        d9.a.getClass();
        q3.A(c0(), null, new gg(this, new os0(c9.b), d9Var, j, null), 1);
    }

    public final long s0(oe0 oe0Var, long j, long j2) {
        long G = t10.G(j);
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            d9 d9Var = (d9) q3.o(this, f9.a);
            float f = oe0Var.b;
            float a = d9Var.a(f - ((int) (j2 & 4294967295L)), oe0Var.d - f, Float.intBitsToFloat((int) (G & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        }
        if (ordinal != 1) {
            z6.j();
            return 0L;
        }
        d9 d9Var2 = (d9) q3.o(this, f9.a);
        float f2 = oe0Var.a;
        return (Float.floatToRawIntBits(d9Var2.a(f2 - ((int) (j2 >> 32)), oe0Var.c - f2, Float.intBitsToFloat((int) (G >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }
}
