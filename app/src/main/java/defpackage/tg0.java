package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class tg0 {
    public static final ug0 a = new ug0(lr0.a, b2.o);

    public static final ug0 a(a7 a7Var, i8 i8Var, gr grVar, int i) {
        if (a7Var.equals(lr0.a) && i8Var.equals(b2.o)) {
            grVar.P(-1073830487);
            grVar.o(false);
            return a;
        }
        grVar.P(-1073779616);
        boolean z = (((i & 14) ^ 6) > 4 && grVar.e(a7Var)) || (i & 6) == 4;
        Object G = grVar.G();
        if (z || G == re.a) {
            G = new ug0(a7Var, i8Var);
            grVar.Y(G);
        }
        ug0 ug0Var = (ug0) G;
        grVar.o(false);
        return ug0Var;
    }
}
