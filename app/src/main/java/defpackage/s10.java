package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class s10 {
    public static final ll a = new ll(new hf(16), 1);

    public static final void a(kc kcVar, h30 h30Var, xk0 xk0Var, wr0 wr0Var, tq tqVar, se seVar, int i) {
        int i2;
        gr grVar = (gr) seVar;
        grVar.Q(904511636);
        if ((i & 6) == 0) {
            i2 = (grVar.e(kcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= grVar.e(h30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= grVar.e(xk0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= grVar.e(wr0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= grVar.g(tqVar) ? 16384 : 8192;
        }
        if (grVar.I(i2 & 1, (i2 & 9363) != 9362)) {
            grVar.N();
            if ((i & 1) != 0 && !grVar.v()) {
                grVar.L();
            }
            grVar.p();
            ig0 a2 = gg0.a();
            long j = kcVar.a;
            boolean d = grVar.d(j);
            Object G = grVar.G();
            if (d || G == re.a) {
                G = new tp0(j, gc.b(j, 0.4f));
                grVar.Y(G);
            }
            nh.c(new xd0[]{mc.a.a(kcVar), a.a(h30Var), ju.a.a(a2), yk0.a.a(xk0Var), up0.a.a((tp0) G), xr0.a.a(wr0Var)}, kw.J(-1750539308, new z9(wr0Var, tqVar, 1), grVar), grVar, 56);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new sa(kcVar, h30Var, xk0Var, wr0Var, tqVar, i);
        }
    }

    public static final void b(kc kcVar, xk0 xk0Var, wr0 wr0Var, tq tqVar, se seVar, final int i) {
        int i2;
        kc kcVar2;
        final tq tqVar2;
        final wr0 wr0Var2;
        final xk0 xk0Var2;
        gr grVar = (gr) seVar;
        grVar.Q(-449719819);
        if ((i & 6) == 0) {
            i2 = (grVar.e(kcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= grVar.g(tqVar) ? 2048 : 1024;
        }
        if (grVar.I(i2 & 1, (i2 & 1171) != 1170)) {
            grVar.N();
            if ((i & 1) == 0 || grVar.v()) {
                xk0Var = (xk0) grVar.i(yk0.a);
                wr0Var = (wr0) grVar.i(xr0.a);
            } else {
                grVar.L();
            }
            int i3 = i2 & (-1009);
            xk0 xk0Var3 = xk0Var;
            wr0 wr0Var3 = wr0Var;
            grVar.p();
            kcVar2 = kcVar;
            a(kcVar2, (h30) grVar.i(a), xk0Var3, wr0Var3, tqVar, grVar, (i3 & 14) | ((i3 << 3) & 57344));
            tqVar2 = tqVar;
            xk0Var2 = xk0Var3;
            wr0Var2 = wr0Var3;
        } else {
            kcVar2 = kcVar;
            tqVar2 = tqVar;
            grVar.L();
            wr0Var2 = wr0Var;
            xk0Var2 = xk0Var;
        }
        de0 q = grVar.q();
        if (q != null) {
            final kc kcVar3 = kcVar2;
            q.d = new tq() { // from class: r10
                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s10.b(kc.this, xk0Var2, wr0Var2, tqVar2, (se) obj, v10.q(i | 1));
                    return fs0.a;
                }
            };
        }
    }
}
