package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class st {
    public static final u20 a = t10.C(v10.a);

    public static final void a(wt wtVar, u20 u20Var, long j, se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(-126890956);
        int i2 = (grVar.e(wtVar) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= grVar.e(u20Var) ? 256 : 128;
        }
        int i3 = i2 | (grVar.d(j) ? 2048 : 1024);
        if (grVar.I(i3 & 1, (i3 & 1171) != 1170)) {
            grVar.N();
            if ((i & 1) != 0 && !grVar.v()) {
                grVar.L();
            }
            grVar.p();
            b(j20.n(wtVar, grVar), u20Var, j, grVar, (i3 & 896) | 56 | (i3 & 7168));
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new rt(wtVar, u20Var, j, i, 0);
        }
    }

    public static final void b(h90 h90Var, u20 u20Var, long j, se seVar, int i) {
        int i2;
        u20 u20Var2;
        gr grVar = (gr) seVar;
        grVar.Q(-2142239481);
        if ((i & 6) == 0) {
            i2 = (grVar.g(h90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= grVar.e(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= grVar.e(u20Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= grVar.d(j) ? 2048 : 1024;
        }
        boolean z = true;
        if (grVar.I(i2 & 1, (i2 & 1171) != 1170)) {
            grVar.N();
            if ((i & 1) != 0 && !grVar.v()) {
                grVar.L();
            }
            grVar.p();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !grVar.d(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            Object G = grVar.G();
            if (z || G == re.a) {
                l8 l8Var = as0.a(j, gc.f) ? null : new l8(j, 5);
                grVar.Y(l8Var);
                G = l8Var;
            }
            l8 l8Var2 = (l8) G;
            grVar.P(-536832197);
            grVar.o(false);
            boolean a2 = hl0.a(h90Var.d(), 9205357640488583168L);
            r20 r20Var = r20.a;
            if (!a2) {
                long d = h90Var.d();
                if (!Float.isInfinite(Float.intBitsToFloat((int) (d >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (d & 4294967295L)))) {
                    u20Var2 = r20Var;
                    t8.a(kw.D(u20Var.c(u20Var2), h90Var, 0.0f, l8Var2, 22).c(r20Var), grVar, 0);
                }
            }
            u20Var2 = a;
            t8.a(kw.D(u20Var.c(u20Var2), h90Var, 0.0f, l8Var2, 22).c(r20Var), grVar, 0);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new rt(h90Var, u20Var, j, i, 1);
        }
    }
}
