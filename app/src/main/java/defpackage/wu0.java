package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ dv0 a;
    public final /* synthetic */ View b;

    public wu0(dv0 dv0Var, View view) {
        this.a = dv0Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dv0 dv0Var = this.a;
        dv0Var.a.e(1.0f);
        zu0.f(dv0Var, this.b);
    }
}
