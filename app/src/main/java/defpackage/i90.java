package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class i90 extends y20 {
    public final h90 a;
    public final j8 b;
    public final float c;
    public final l8 d;

    public i90(h90 h90Var, j8 j8Var, float f, l8 l8Var) {
        this.a = h90Var;
        this.b = j8Var;
        this.c = f;
        this.d = l8Var;
    }

    @Override // defpackage.y20
    public final t20 d() {
        j90 j90Var = new j90();
        j90Var.s = this.a;
        j90Var.t = true;
        j90Var.u = this.b;
        j90Var.v = ig.a;
        j90Var.w = this.c;
        j90Var.x = this.d;
        return j90Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        j90 j90Var = (j90) t20Var;
        boolean z = j90Var.t;
        h90 h90Var = this.a;
        boolean z2 = (z && hl0.a(j90Var.s.d(), h90Var.d())) ? false : true;
        j90Var.s = h90Var;
        j90Var.t = true;
        j90Var.u = this.b;
        j90Var.v = ig.a;
        j90Var.w = this.c;
        j90Var.x = this.d;
        if (z2) {
            kw.x(j90Var);
        }
        lw.x(j90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return lw.i(this.a, i90Var.a) && lw.i(this.b, i90Var.b) && Float.compare(this.c, i90Var.c) == 0 && lw.i(this.d, i90Var.d);
    }

    public final int hashCode() {
        int a = j2.a(this.c, (ig.a.hashCode() + ((this.b.hashCode() + j2.e(true, this.a.hashCode() * 31, 31)) * 31)) * 31, 31);
        l8 l8Var = this.d;
        return a + (l8Var == null ? 0 : l8Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + ig.a + ", alpha=" + this.c + ", colorFilter=" + this.d + ")";
    }
}
