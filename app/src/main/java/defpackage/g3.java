package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class g3 {
    public static final void a(uj0 uj0Var, AccessibilityEvent accessibilityEvent) {
        qj0 qj0Var = uj0Var.d;
        Object g = qj0Var.e.g(yj0.J);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z6.c();
        } else {
            Object g2 = qj0Var.e.g(yj0.G);
            accessibilityEvent.setTextChangeTypes((((sp0) (g2 != null ? g2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }
}
