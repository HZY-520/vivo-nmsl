package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w50 {
    public t20 a;
    public int b;
    public h40 c;
    public h40 d;
    public boolean e;
    public final /* synthetic */ y50 f;

    public w50(y50 y50Var, t20 t20Var, int i, h40 h40Var, h40 h40Var2, boolean z) {
        this.f = y50Var;
        this.a = t20Var;
        this.b = i;
        this.c = h40Var;
        this.d = h40Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        s20 s20Var = (s20) this.c.g(this.b + i);
        s20 s20Var2 = (s20) this.d.g(this.b + i2);
        return lw.i(s20Var, s20Var2) || s20Var.getClass() == s20Var2.getClass();
    }
}
