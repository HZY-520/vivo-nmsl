package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class oo {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final oe0 a(View view, e3 e3Var) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        e3Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + r1.left;
        return new oe0(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final lo c(int i) {
        if (i == 1) {
            return new lo(2);
        }
        if (i == 2) {
            return new lo(1);
        }
        if (i == 17) {
            return new lo(3);
        }
        if (i == 33) {
            return new lo(5);
        }
        if (i == 66) {
            return new lo(4);
        }
        if (i != 130) {
            return null;
        }
        return new lo(6);
    }
}
