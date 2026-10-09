package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class il0 extends y20 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public il0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.y20
    public final t20 d() {
        jl0 jl0Var = new jl0();
        jl0Var.s = this.a;
        jl0Var.t = this.b;
        jl0Var.u = this.c;
        jl0Var.v = this.d;
        jl0Var.w = true;
        return jl0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        jl0 jl0Var = (jl0) t20Var;
        jl0Var.s = this.a;
        jl0Var.t = this.b;
        jl0Var.u = this.c;
        jl0Var.v = this.d;
        jl0Var.w = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il0)) {
            return false;
        }
        il0 il0Var = (il0) obj;
        return ck.b(this.a, il0Var.a) && ck.b(this.b, il0Var.b) && ck.b(this.c, il0Var.c) && ck.b(this.d, il0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j2.a(this.d, j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
