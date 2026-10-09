package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class ui0 extends y20 {
    public final ti0 a;
    public final q80 b;
    public final b40 c;
    public final boolean d;

    public ui0(ti0 ti0Var, q80 q80Var, b40 b40Var, boolean z) {
        this.a = ti0Var;
        this.b = q80Var;
        this.c = b40Var;
        this.d = z;
    }

    @Override // defpackage.y20
    public final t20 d() {
        vi0 vi0Var = new vi0();
        vi0Var.u = this.a;
        vi0Var.v = this.b;
        vi0Var.w = true;
        vi0Var.x = this.c;
        vi0Var.y = this.d;
        vi0Var.z = null;
        return vi0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ((vi0) t20Var).t0(null, this.c, this.b, this.a, this.d, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ui0.class == obj.getClass()) {
            ui0 ui0Var = (ui0) obj;
            if (this.a == ui0Var.a && this.b == ui0Var.b && lw.i(this.c, ui0Var.c) && this.d == ui0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = j2.e(false, j2.e(true, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 961);
        b40 b40Var = this.c;
        return j2.e(this.d, (e + (b40Var != null ? b40Var.hashCode() : 0)) * 961, 31);
    }
}
