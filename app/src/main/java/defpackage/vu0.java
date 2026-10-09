package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ dv0 a;
    public final /* synthetic */ yv0 b;
    public final /* synthetic */ yv0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public vu0(dv0 dv0Var, yv0 yv0Var, yv0 yv0Var2, int i, View view) {
        this.a = dv0Var;
        this.b = yv0Var;
        this.c = yv0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        dv0 dv0Var;
        yv0 yv0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        dv0 dv0Var2 = this.a;
        cv0 cv0Var = dv0Var2.a;
        cv0Var.e(animatedFraction);
        float c = cv0Var.c();
        PathInterpolator pathInterpolator = zu0.e;
        int i = Build.VERSION.SDK_INT;
        yv0 yv0Var2 = this.b;
        lv0 kv0Var = i >= 36 ? new kv0(yv0Var2) : i >= 35 ? new jv0(yv0Var2) : i >= 34 ? new iv0(yv0Var2) : i >= 31 ? new hv0(yv0Var2) : i >= 30 ? new gv0(yv0Var2) : i >= 29 ? new fv0(yv0Var2) : new ev0(yv0Var2);
        int i2 = 1;
        while (i2 <= 512) {
            int i3 = this.d & i2;
            uv0 uv0Var = yv0Var2.a;
            if (i3 == 0) {
                kv0Var.d(i2, uv0Var.h(i2));
                f = c;
                dv0Var = dv0Var2;
                yv0Var = yv0Var2;
            } else {
                nv h = uv0Var.h(i2);
                nv h2 = this.c.a.h(i2);
                int i4 = h.a;
                int i5 = h.d;
                int i6 = h.c;
                int i7 = h.b;
                float f2 = 1.0f - c;
                int i8 = (int) (((i4 - h2.a) * f2) + 0.5d);
                int i9 = (int) (((i7 - h2.b) * f2) + 0.5d);
                f = c;
                dv0Var = dv0Var2;
                int i10 = (int) (((i6 - h2.c) * f2) + 0.5d);
                float f3 = (i5 - h2.d) * f2;
                yv0Var = yv0Var2;
                int i11 = (int) (f3 + 0.5d);
                int max = Math.max(0, i4 - i8);
                int max2 = Math.max(0, i7 - i9);
                int max3 = Math.max(0, i6 - i10);
                int max4 = Math.max(0, i5 - i11);
                kv0Var.d(i2, (max == i8 && max2 == i9 && max3 == i10 && max4 == i11) ? h : nv.b(max, max2, max3, max4));
            }
            i2 <<= 1;
            dv0Var2 = dv0Var;
            yv0Var2 = yv0Var;
            c = f;
        }
        zu0.h(this.e, kv0Var.b(), Collections.singletonList(dv0Var2));
    }
}
