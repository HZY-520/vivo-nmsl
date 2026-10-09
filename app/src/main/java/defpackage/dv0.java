package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dv0 {
    public cv0 a;

    public dv0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new bv0(a1.i(i, interpolator, j));
        } else {
            this.a = new zu0(i, interpolator, j);
        }
    }

    public static void a(View view, uu0 uu0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(uu0Var != null ? new av0(uu0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = zu0.e;
        View.OnApplyWindowInsetsListener yu0Var = uu0Var != null ? new yu0(view, uu0Var) : null;
        view.setTag(2131034209, yu0Var);
        if (view.getTag(2131034199) == null && view.getTag(2131034200) == null) {
            view.setOnApplyWindowInsetsListener(yu0Var);
        }
    }
}
