package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class wc {
    public static final yc a = new yc(lr0.b);

    public static final yc a(e7 e7Var, gr grVar, int i) {
        h8 h8Var = b2.q;
        if (e7Var.equals(lr0.b) && h8Var.equals(h8Var)) {
            grVar.P(-1446604504);
            grVar.o(false);
            return a;
        }
        grVar.P(-1446550657);
        boolean e = ((((i & 14) ^ 6) > 4 && grVar.e(e7Var)) || (i & 6) == 4) | grVar.e(h8Var);
        Object G = grVar.G();
        if (e || G == re.a) {
            G = new yc(e7Var);
            grVar.Y(G);
        }
        yc ycVar = (yc) G;
        grVar.o(false);
        return ycVar;
    }
}
