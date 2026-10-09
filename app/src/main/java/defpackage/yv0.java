package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yv0 {
    public static final yv0 b;
    public final uv0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = sv0.w;
        } else if (i >= 30) {
            b = qv0.v;
        } else {
            b = uv0.b;
        }
    }

    public yv0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new tv0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new sv0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new rv0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new qv0(this, windowInsets);
        } else if (i >= 29) {
            this.a = new pv0(this, windowInsets);
        } else {
            this.a = new ov0(this, windowInsets);
        }
    }

    public static yv0 b(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        yv0 yv0Var = new yv0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = ut0.a;
            yv0 a = rt0.a(view);
            uv0 uv0Var = yv0Var.a;
            uv0Var.v(a);
            View rootView = view.getRootView();
            uv0Var.d(rootView);
            uv0Var.o(rootView);
            uv0Var.p();
            uv0Var.x(view.getWindowSystemUiVisibility());
        }
        return yv0Var;
    }

    public final WindowInsets a() {
        uv0 uv0Var = this.a;
        if (uv0Var instanceof mv0) {
            return ((mv0) uv0Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yv0) {
            return Objects.equals(this.a, ((yv0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        uv0 uv0Var = this.a;
        if (uv0Var == null) {
            return 0;
        }
        return uv0Var.hashCode();
    }

    public yv0() {
        this.a = new uv0(this);
    }
}
