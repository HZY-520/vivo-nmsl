package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nv0 extends mv0 {
    public nv r;

    public nv0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.uv0
    public yv0 b() {
        return yv0.b(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.uv0
    public yv0 c() {
        return yv0.b(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.uv0
    public final nv k() {
        nv nvVar = this.r;
        if (nvVar != null) {
            return nvVar;
        }
        WindowInsets windowInsets = this.c;
        nv b = nv.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.r = b;
        return b;
    }

    @Override // defpackage.uv0
    public boolean q() {
        return this.c.isConsumed();
    }

    @Override // defpackage.uv0
    public void w(nv nvVar) {
        this.r = nvVar;
    }
}
