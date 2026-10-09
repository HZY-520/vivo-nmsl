package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xk0 {
    public final pg0 a;
    public final pg0 b;
    public final pg0 c;
    public final pg0 d;
    public final pg0 e;
    public final pg0 f;
    public final pg0 g;
    public final pg0 h;

    public xk0() {
        pg0 pg0Var = uk0.a;
        pg0 pg0Var2 = uk0.b;
        pg0 pg0Var3 = uk0.c;
        pg0 pg0Var4 = uk0.d;
        pg0 pg0Var5 = uk0.f;
        pg0 pg0Var6 = uk0.e;
        pg0 pg0Var7 = uk0.g;
        pg0 pg0Var8 = uk0.h;
        this.a = pg0Var;
        this.b = pg0Var2;
        this.c = pg0Var3;
        this.d = pg0Var4;
        this.e = pg0Var5;
        this.f = pg0Var6;
        this.g = pg0Var7;
        this.h = pg0Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk0)) {
            return false;
        }
        xk0 xk0Var = (xk0) obj;
        return lw.i(this.a, xk0Var.a) && lw.i(this.b, xk0Var.b) && lw.i(this.c, xk0Var.c) && lw.i(this.d, xk0Var.d) && lw.i(this.e, xk0Var.e) && lw.i(this.f, xk0Var.f) && lw.i(this.g, xk0Var.g) && lw.i(this.h, xk0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
