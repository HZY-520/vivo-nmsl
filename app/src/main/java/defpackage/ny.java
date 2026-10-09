package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ny extends t20 implements x90 {
    public float s;
    public boolean t;

    @Override // defpackage.x90
    public final Object T(Object obj) {
        sg0 sg0Var = obj instanceof sg0 ? (sg0) obj : null;
        if (sg0Var == null) {
            sg0Var = new sg0();
            sg0Var.a = 0.0f;
            sg0Var.b = true;
        }
        sg0Var.a = this.s;
        sg0Var.b = this.t;
        return sg0Var;
    }
}
