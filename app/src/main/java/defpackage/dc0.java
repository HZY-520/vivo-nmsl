package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class dc0 implements si {
    public boolean e;

    public static void e(dc0 dc0Var, ec0 ec0Var, int i, int i2) {
        dc0Var.d(ec0Var);
        ec0Var.P(xv.c((i2 & 4294967295L) | (i << 32), ec0Var.i), 0.0f, null);
    }

    public static void f(dc0 dc0Var, ec0 ec0Var, long j) {
        dc0Var.d(ec0Var);
        ec0Var.P(xv.c(j, ec0Var.i), 0.0f, null);
    }

    public static void h(dc0 dc0Var, ec0 ec0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (dc0Var.b() == xx.e || dc0Var.c() == 0) {
            dc0Var.d(ec0Var);
            ec0Var.P(xv.c(j, ec0Var.i), 0.0f, null);
        } else {
            int c = (dc0Var.c() - ec0Var.e) - ((int) (j >> 32));
            dc0Var.d(ec0Var);
            ec0Var.P(xv.c((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), ec0Var.i), 0.0f, null);
        }
    }

    public static void i(dc0 dc0Var, ec0 ec0Var, int i, int i2) {
        a60 a60Var = fc0.a;
        long j = (i << 32) | (i2 & 4294967295L);
        if (dc0Var.b() == xx.e || dc0Var.c() == 0) {
            dc0Var.d(ec0Var);
            ec0Var.P(xv.c(j, ec0Var.i), 0.0f, a60Var);
        } else {
            int c = (dc0Var.c() - ec0Var.e) - ((int) (j >> 32));
            dc0Var.d(ec0Var);
            ec0Var.P(xv.c((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), ec0Var.i), 0.0f, a60Var);
        }
    }

    public float a(mt mtVar) {
        return Float.NaN;
    }

    public abstract xx b();

    public abstract int c();

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(ec0 ec0Var) {
        if (ec0Var instanceof g30) {
            ((g30) ec0Var).h(this.e);
        }
    }
}
