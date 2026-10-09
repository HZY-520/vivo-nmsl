package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class u80 extends v10 {
    public final ng0 b;
    public final c5 c;

    public u80(ng0 ng0Var) {
        c5 c5Var;
        this.b = ng0Var;
        if (v10.k(ng0Var)) {
            c5Var = null;
        } else {
            c5Var = e5.a();
            c5.b(c5Var, ng0Var);
        }
        this.c = c5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u80) {
            return this.b.equals(((u80) obj).b);
        }
        return false;
    }

    @Override // defpackage.v10
    public final oe0 f() {
        ng0 ng0Var = this.b;
        return new oe0(ng0Var.a, ng0Var.b, ng0Var.c, ng0Var.d);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
