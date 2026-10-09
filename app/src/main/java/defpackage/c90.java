package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class c90 extends y20 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public c90(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            av.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.y20
    public final t20 d() {
        d90 d90Var = new d90();
        d90Var.s = this.a;
        d90Var.t = this.b;
        d90Var.u = this.c;
        d90Var.v = this.d;
        d90Var.w = true;
        return d90Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        d90 d90Var = (d90) t20Var;
        d90Var.s = this.a;
        d90Var.t = this.b;
        d90Var.u = this.c;
        d90Var.v = this.d;
        d90Var.w = true;
    }

    public final boolean equals(Object obj) {
        c90 c90Var = obj instanceof c90 ? (c90) obj : null;
        return c90Var != null && ck.b(this.a, c90Var.a) && ck.b(this.b, c90Var.b) && ck.b(this.c, c90Var.c) && ck.b(this.d, c90Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j2.a(this.d, j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
