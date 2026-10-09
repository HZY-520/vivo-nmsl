package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class qt0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131034209);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void b(View view, x60 x60Var) {
        pt0 pt0Var = x60Var != null ? new pt0(view, x60Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131034200, pt0Var);
        }
        if (view.getTag(2131034199) != null) {
            return;
        }
        if (pt0Var != null) {
            view.setOnApplyWindowInsetsListener(pt0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131034209));
        }
    }
}
