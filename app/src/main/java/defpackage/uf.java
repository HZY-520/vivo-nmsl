package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class uf {
    public static final y30 a;

    static {
        bg0 bg0Var = qc.e;
        int i = bg0Var.c;
        rf rfVar = new rf(bg0Var, bg0Var, 1);
        int i2 = bg0Var.c;
        w60 w60Var = qc.x;
        int i3 = (w60Var.c << 6) | i2;
        tf tfVar = new tf(bg0Var, w60Var, 0);
        int i4 = (i2 << 6) | w60Var.c;
        tf tfVar2 = new tf(w60Var, bg0Var, 0);
        y30 y30Var = wv.a;
        y30 y30Var2 = new y30();
        y30Var2.h(i | (i << 6), rfVar);
        y30Var2.h(i3, tfVar);
        y30Var2.h(i4, tfVar2);
        a = y30Var2;
    }
}
