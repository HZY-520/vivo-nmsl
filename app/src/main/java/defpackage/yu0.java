package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yu0 implements View.OnApplyWindowInsetsListener {
    public final uu0 a;
    public yv0 b;

    public yu0(View view, uu0 uu0Var) {
        yv0 yv0Var;
        this.a = uu0Var;
        int i = ut0.a;
        yv0 a = rt0.a(view);
        if (a != null) {
            int i2 = Build.VERSION.SDK_INT;
            yv0Var = (i2 >= 36 ? new kv0(a) : i2 >= 35 ? new jv0(a) : i2 >= 34 ? new iv0(a) : i2 >= 31 ? new hv0(a) : i2 >= 30 ? new gv0(a) : i2 >= 29 ? new fv0(a) : new ev0(a)).b();
        } else {
            yv0Var = null;
        }
        this.b = yv0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = yv0.b(windowInsets, view);
            return view.getTag(2131034200) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        yv0 b = yv0.b(windowInsets, view);
        uv0 uv0Var = b.a;
        yv0 yv0Var = this.b;
        if (yv0Var == null) {
            int i = ut0.a;
            yv0Var = rt0.a(view);
            this.b = yv0Var;
        }
        if (yv0Var == null) {
            this.b = b;
            if (view.getTag(2131034200) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            uu0 j = zu0.j(view);
            if (j == null || !Objects.equals(j.e, b)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                yv0 yv0Var2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    nv h = uv0Var.h(i2);
                    nv h2 = yv0Var2.a.h(i2);
                    int i3 = h.a;
                    int i4 = h.d;
                    int i5 = h.c;
                    int i6 = h.b;
                    int i7 = h2.a;
                    int i8 = h2.d;
                    int[] iArr4 = iArr2;
                    int i9 = h2.c;
                    int i10 = h2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = b;
                    if (view.getTag(2131034200) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    yv0 yv0Var3 = this.b;
                    dv0 dv0Var = new dv0(i13, (i11 & 8) != 0 ? zu0.e : (i12 & 8) != 0 ? zu0.f : (i11 & 519) != 0 ? zu0.g : (i12 & 519) != 0 ? zu0.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    dv0Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(dv0Var.a.b());
                    nv h3 = uv0Var.h(i13);
                    nv h4 = yv0Var3.a.h(i13);
                    int min = Math.min(h3.a, h4.a);
                    int i14 = h3.b;
                    int i15 = h4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = h3.c;
                    int i17 = h4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = h3.d;
                    int i19 = h4.d;
                    p2 p2Var = new p2(21, nv.b(min, min2, min3, Math.min(i18, i19)), nv.b(Math.max(h3.a, h4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    zu0.g(view, dv0Var, b, false);
                    duration.addUpdateListener(new vu0(dv0Var, b, yv0Var3, i13, view));
                    duration.addListener(new wu0(dv0Var, view));
                    g70 g70Var = new g70(view, new xu0(view, dv0Var, p2Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(g70Var);
                    view.addOnAttachStateChangeListener(g70Var);
                    this.b = b;
                    if (view.getTag(2131034200) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(2131034200) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
