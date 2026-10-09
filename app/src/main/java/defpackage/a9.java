package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a9 extends t20 implements x8, ux {
    public hg s;
    public boolean t;

    public static final oe0 o0(a9 a9Var, d60 d60Var, s2 s2Var) {
        oe0 oe0Var;
        if (a9Var.r && a9Var.t) {
            d60 Z = nh.Z(a9Var);
            if (!d60Var.A0().r) {
                d60Var = null;
            }
            if (d60Var != null && (oe0Var = (oe0) s2Var.b()) != null) {
                float f = Z.A(d60Var, false).a;
                return oe0Var.f((Float.floatToRawIntBits(r4.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.x8
    public final Object V(d60 d60Var, s2 s2Var, go0 go0Var) {
        Object j = t10.j(new z8(this, d60Var, s2Var, new v7(this, d60Var, s2Var, 1), null), go0Var);
        return j == dh.e ? j : fs0.a;
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.ux
    public final void h(wx wxVar) {
        this.t = true;
    }
}
