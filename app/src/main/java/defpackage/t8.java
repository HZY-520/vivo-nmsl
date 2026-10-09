package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class t8 {
    public static final k40 a = b(true);
    public static final k40 b = b(false);
    public static final s8 c = s8.b;

    public static final void a(u20 u20Var, se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(-211209833);
        int i2 = (grVar.e(u20Var) ? 4 : 2) | i;
        if (grVar.I(i2 & 1, (i2 & 3) != 2)) {
            int hashCode = Long.hashCode(grVar.Q);
            u20 z = dx0.z(grVar, u20Var);
            xa0 k = grVar.k();
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, b2.x, c);
            t30.t(grVar, b2.w, k);
            t30.p(grVar);
            t30.t(grVar, b2.v, z);
            t30.t(grVar, b2.y, Integer.valueOf(hashCode));
            grVar.o(true);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new n(i, 2, u20Var);
        }
    }

    public static final k40 b(boolean z) {
        k40 k40Var = new k40(9);
        j8 j8Var = b2.f;
        k40Var.l(j8Var, new w8(j8Var, z));
        j8 j8Var2 = b2.g;
        k40Var.l(j8Var2, new w8(j8Var2, z));
        j8 j8Var3 = b2.h;
        k40Var.l(j8Var3, new w8(j8Var3, z));
        j8 j8Var4 = b2.i;
        k40Var.l(j8Var4, new w8(j8Var4, z));
        j8 j8Var5 = b2.j;
        k40Var.l(j8Var5, new w8(j8Var5, z));
        j8 j8Var6 = b2.k;
        k40Var.l(j8Var6, new w8(j8Var6, z));
        j8 j8Var7 = b2.l;
        k40Var.l(j8Var7, new w8(j8Var7, z));
        j8 j8Var8 = b2.m;
        k40Var.l(j8Var8, new w8(j8Var8, z));
        j8 j8Var9 = b2.n;
        k40Var.l(j8Var9, new w8(j8Var9, z));
        return k40Var;
    }

    public static final b20 c(j8 j8Var, boolean z) {
        b20 b20Var = (b20) (z ? a : b).g(j8Var);
        return b20Var == null ? new w8(j8Var, z) : b20Var;
    }

    public static final void d(dc0 dc0Var, ec0 ec0Var, w10 w10Var, xx xxVar, int i, int i2, j8 j8Var) {
        w10Var.e();
        dc0.f(dc0Var, ec0Var, j8Var.a((ec0Var.e << 32) | (ec0Var.f & 4294967295L), (i << 32) | (i2 & 4294967295L), xxVar));
    }
}
