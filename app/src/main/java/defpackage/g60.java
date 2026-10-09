package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class g60 {
    public final t40 a = new t40(new v50[16]);
    public final h40 b = new h40(10);

    public boolean a(s00 s00Var, wx wxVar, p2 p2Var, boolean z) {
        t40 t40Var = this.a;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((v50) objArr[i2]).a(s00Var, wxVar, p2Var, z) || z2;
        }
        return z2;
    }

    public void b(p2 p2Var) {
        t40 t40Var = this.a;
        int i = t40Var.g;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((v50) t40Var.e[i]).d.e == 0) {
                t40Var.j(i);
            }
        }
    }
}
