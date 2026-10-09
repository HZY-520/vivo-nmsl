package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class fv0 extends lv0 {
    public final WindowInsets.Builder e;

    public fv0(yv0 yv0Var) {
        super(yv0Var);
        WindowInsets a = yv0Var.a();
        this.e = a != null ? c30.j(a) : c30.i();
    }

    @Override // defpackage.lv0
    public yv0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        yv0 b = yv0.b(build, null);
        nv[] nvVarArr = this.b;
        uv0 uv0Var = b.a;
        uv0Var.u(nvVarArr);
        uv0Var.t(null);
        uv0Var.y(this.c);
        uv0Var.z(this.d);
        return b;
    }

    @Override // defpackage.lv0
    public void e(nv nvVar) {
        this.e.setMandatorySystemGestureInsets(nvVar.d());
    }

    @Override // defpackage.lv0
    public void f(nv nvVar) {
        this.e.setSystemGestureInsets(nvVar.d());
    }

    @Override // defpackage.lv0
    public void g(nv nvVar) {
        this.e.setSystemWindowInsets(nvVar.d());
    }

    @Override // defpackage.lv0
    public void h(nv nvVar) {
        this.e.setTappableElementInsets(nvVar.d());
    }

    public fv0() {
        this.e = c30.i();
    }
}
