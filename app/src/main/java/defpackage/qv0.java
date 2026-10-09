package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class qv0 extends pv0 {
    public static final yv0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = yv0.b(windowInsets, null);
    }

    public qv0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var, windowInsets);
    }

    @Override // defpackage.mv0, defpackage.uv0
    public nv h(int i) {
        Insets insets;
        insets = this.c.getInsets(wv0.a(i));
        return nv.c(insets);
    }

    @Override // defpackage.mv0, defpackage.uv0
    public nv i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(wv0.a(i));
        return nv.c(insetsIgnoringVisibility);
    }

    @Override // defpackage.mv0, defpackage.uv0
    public boolean s(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(wv0.a(i));
        return isVisible;
    }

    @Override // defpackage.mv0, defpackage.uv0
    public final void d(View view) {
    }
}
