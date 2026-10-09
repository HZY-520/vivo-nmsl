package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class ku extends y20 {
    public final b40 a;
    public final mu b;

    public ku(b40 b40Var, mu muVar) {
        this.a = b40Var;
        this.b = muVar;
    }

    @Override // defpackage.y20
    public final t20 d() {
        ni a = this.b.a(this.a);
        lu luVar = new lu();
        luVar.u = a;
        luVar.o0(a);
        return luVar;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        lu luVar = (lu) t20Var;
        ni a = this.b.a(this.a);
        luVar.p0(luVar.u);
        luVar.u = a;
        luVar.o0(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return lw.i(this.a, kuVar.a) && this.b.equals(kuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
