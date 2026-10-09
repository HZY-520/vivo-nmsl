package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class u60 extends y20 {
    @Override // defpackage.y20
    public final t20 d() {
        v60 v60Var = new v60();
        v60Var.s = 27.0f;
        v60Var.t = 31.0f;
        v60Var.u = true;
        return v60Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        v60 v60Var = (v60) t20Var;
        if (!ck.b(v60Var.s, 27.0f) || !ck.b(v60Var.t, 31.0f) || !v60Var.u) {
            nh.a0(v60Var).M(false);
        }
        v60Var.s = 27.0f;
        v60Var.t = 31.0f;
        v60Var.u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u60 ? (u60) obj : null) != null && ck.b(27.0f, 27.0f) && ck.b(31.0f, 31.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j2.a(31.0f, Float.hashCode(27.0f) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ck.c(27.0f) + ", y=" + ck.c(31.0f) + ", rtlAware=true)";
    }
}
