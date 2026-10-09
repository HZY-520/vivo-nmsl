package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class bo0 {
    public static final ll a = new ll(new hf(26), 0);

    public static final void a(u20 u20Var, tk0 tk0Var, long j, long j2, float f, be beVar, se seVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            tk0Var = lw.q;
        }
        if ((i2 & 8) != 0) {
            j2 = mc.b(j, seVar);
        }
        if ((i2 & 32) != 0) {
            f = 0.0f;
        }
        gr grVar = (gr) seVar;
        ll llVar = a;
        float f2 = ((ck) grVar.i(llVar)).e + 0.0f;
        nh.c(new xd0[]{dg.a.a(new gc(j2)), llVar.a(new ck(f2))}, kw.J(421772006, new zn0(u20Var, tk0Var, j, f2, f, beVar), grVar), grVar, 56);
    }

    public static final u20 b(u20 u20Var, tk0 tk0Var, long j, float f) {
        u20 u20Var2;
        r20 r20Var = r20.a;
        if (f > 0.0f) {
            long j2 = zq0.a;
            long j3 = is.a;
            u20Var2 = lw.v(r20Var, f, j2, tk0Var, false, j3, j3, 524288);
        } else {
            u20Var2 = r20Var;
        }
        return q3.k(dx0.i(u20Var.c(u20Var2).c(r20Var), j, tk0Var), tk0Var);
    }

    public static final long c(long j, float f, gr grVar) {
        kc kcVar = (kc) grVar.i(mc.a);
        boolean booleanValue = ((Boolean) grVar.i(mc.b)).booleanValue();
        long j2 = kcVar.p;
        int i = gc.g;
        if (!as0.a(j, j2) || !booleanValue) {
            return j;
        }
        if (ck.b(f, 0.0f)) {
            return j2;
        }
        return lw.o(gc.b(kcVar.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
