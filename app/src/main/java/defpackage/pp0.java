package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pp0 {
    public final om0 a;
    public final om0 b;
    public final om0 c;
    public final om0 d;

    public pp0(om0 om0Var, om0 om0Var2, om0 om0Var3, om0 om0Var4) {
        this.a = om0Var;
        this.b = om0Var2;
        this.c = om0Var3;
        this.d = om0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        return lw.i(this.a, pp0Var.a) && lw.i(this.b, pp0Var.b) && lw.i(this.c, pp0Var.c) && lw.i(this.d, pp0Var.d);
    }

    public final int hashCode() {
        om0 om0Var = this.a;
        int hashCode = (om0Var != null ? om0Var.hashCode() : 0) * 31;
        om0 om0Var2 = this.b;
        int hashCode2 = (hashCode + (om0Var2 != null ? om0Var2.hashCode() : 0)) * 31;
        om0 om0Var3 = this.c;
        int hashCode3 = (hashCode2 + (om0Var3 != null ? om0Var3.hashCode() : 0)) * 31;
        om0 om0Var4 = this.d;
        return hashCode3 + (om0Var4 != null ? om0Var4.hashCode() : 0);
    }
}
