package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class rt0 {
    public static yv0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        yv0 b = yv0.b(rootWindowInsets, null);
        uv0 uv0Var = b.a;
        uv0Var.v(b);
        View rootView = view.getRootView();
        uv0Var.d(rootView);
        uv0Var.o(rootView);
        uv0Var.p();
        return b;
    }
}
