package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class ks0 extends y20 {
    public final float a;
    public final float b;

    public ks0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.y20
    public final t20 d() {
        ls0 ls0Var = new ls0();
        ls0Var.s = this.a;
        ls0Var.t = this.b;
        return ls0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ls0 ls0Var = (ls0) t20Var;
        ls0Var.s = this.a;
        ls0Var.t = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return ck.b(this.a, ks0Var.a) && ck.b(this.b, ks0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
