package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class gw0 {
    public static final y30 a;
    public static final ew0[] b;

    static {
        y30 y30Var = new y30(8);
        ew0.a.getClass();
        fw0 fw0Var = dw0.g;
        y30Var.h(1, fw0Var);
        fw0 fw0Var2 = dw0.f;
        y30Var.h(2, fw0Var2);
        fw0 fw0Var3 = dw0.b;
        y30Var.h(4, fw0Var3);
        fw0 fw0Var4 = dw0.d;
        y30Var.h(8, fw0Var4);
        fw0 fw0Var5 = dw0.h;
        y30Var.h(16, fw0Var5);
        fw0 fw0Var6 = dw0.e;
        y30Var.h(32, fw0Var6);
        fw0 fw0Var7 = dw0.i;
        y30Var.h(64, fw0Var7);
        fw0 fw0Var8 = dw0.c;
        y30Var.h(128, fw0Var8);
        a = y30Var;
        b = new ew0[]{fw0Var, fw0Var2, fw0Var3, fw0Var7, fw0Var5, fw0Var6, fw0Var4, dw0.j, fw0Var8};
    }

    public static final void a(u00 u00Var, jv jvVar, long j, int i, int i2) {
        if (v10.d(j, -1L)) {
            return;
        }
        u00Var.a(jvVar.b, (int) ((j >>> 48) & 65535));
        u00Var.a(jvVar.c, (int) ((j >>> 32) & 65535));
        u00Var.a(jvVar.d, i - ((int) ((j >>> 16) & 65535)));
        u00Var.a(jvVar.e, i2 - ((int) (j & 65535)));
    }
}
