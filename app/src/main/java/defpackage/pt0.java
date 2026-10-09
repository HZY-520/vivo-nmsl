package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pt0 implements View.OnApplyWindowInsetsListener {
    public yv0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ x60 c;

    public pt0(View view, x60 x60Var) {
        this.b = view;
        this.c = x60Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        yv0 b = yv0.b(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        x60 x60Var = this.c;
        if (i < 30) {
            qt0.a(windowInsets, this.b);
            if (b.equals(this.a)) {
                return x60Var.a(view, b).a();
            }
        }
        this.a = b;
        yv0 a = x60Var.a(view, b);
        if (i >= 30) {
            return a.a();
        }
        int i2 = ut0.a;
        view.requestApplyInsets();
        return a.a();
    }
}
