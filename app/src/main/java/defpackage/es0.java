package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class es0 implements tu0 {
    public final tu0 a;
    public final tu0 b;

    public es0(tu0 tu0Var, tu0 tu0Var2) {
        this.a = tu0Var;
        this.b = tu0Var2;
    }

    @Override // defpackage.tu0
    public final int a(w00 w00Var, xx xxVar) {
        return Math.max(this.a.a(w00Var, xxVar), this.b.a(w00Var, xxVar));
    }

    @Override // defpackage.tu0
    public final int b(w00 w00Var) {
        return Math.max(this.a.b(w00Var), this.b.b(w00Var));
    }

    @Override // defpackage.tu0
    public final int c(w00 w00Var, xx xxVar) {
        return Math.max(this.a.c(w00Var, xxVar), this.b.c(w00Var, xxVar));
    }

    @Override // defpackage.tu0
    public final int d(w00 w00Var) {
        return Math.max(this.a.d(w00Var), this.b.d(w00Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es0)) {
            return false;
        }
        es0 es0Var = (es0) obj;
        return lw.i(es0Var.a, this.a) && lw.i(es0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
