package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jr0 implements f6 {
    public final int a;
    public final nl b;

    public jr0(int i, nl nlVar) {
        this.a = i;
        this.b = nlVar;
    }

    @Override // defpackage.f6
    public final et0 a(kr0 kr0Var) {
        jd jdVar = new jd();
        int i = this.a;
        jdVar.e = i;
        jdVar.f = new l20((xn) new zn(i, this.b));
        return jdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jr0)) {
            return false;
        }
        jr0 jr0Var = (jr0) obj;
        return jr0Var.a == this.a && lw.i(jr0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a * 31)) * 31;
    }
}
