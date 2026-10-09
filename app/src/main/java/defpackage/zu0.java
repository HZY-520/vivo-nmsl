package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zu0 extends cv0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final ln f = new ln();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(dv0 dv0Var, View view) {
        uu0 j = j(view);
        if (j != null) {
            j.b(dv0Var);
            if (j.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(dv0Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, dv0 dv0Var, yv0 yv0Var, boolean z) {
        uu0 j = j(view);
        if (j != null) {
            j.e = yv0Var;
            if (!z) {
                j.c(dv0Var);
                z = j.f == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), dv0Var, yv0Var, z);
            }
        }
    }

    public static void h(View view, yv0 yv0Var, List list) {
        uu0 j = j(view);
        if (j != null) {
            yv0Var = j.d(yv0Var, list);
            if (j.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), yv0Var, list);
            }
        }
    }

    public static void i(View view, dv0 dv0Var, p2 p2Var) {
        uu0 j = j(view);
        if (j != null) {
            j.e(dv0Var, p2Var);
            if (j.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), dv0Var, p2Var);
            }
        }
    }

    public static uu0 j(View view) {
        Object tag = view.getTag(2131034209);
        if (tag instanceof yu0) {
            return ((yu0) tag).a;
        }
        return null;
    }
}
