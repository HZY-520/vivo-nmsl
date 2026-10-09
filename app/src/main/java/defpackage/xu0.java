package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xu0 implements Runnable {
    public final /* synthetic */ View e;
    public final /* synthetic */ dv0 f;
    public final /* synthetic */ p2 g;
    public final /* synthetic */ ValueAnimator h;

    public xu0(View view, dv0 dv0Var, p2 p2Var, ValueAnimator valueAnimator) {
        this.e = view;
        this.f = dv0Var;
        this.g = p2Var;
        this.h = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zu0.i(this.e, this.f, this.g);
        this.h.start();
    }
}
