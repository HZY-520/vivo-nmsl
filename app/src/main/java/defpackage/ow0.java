package defpackage;

import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ow0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View e;
    public final /* synthetic */ le0 f;

    public ow0(View view, le0 le0Var) {
        this.e = view;
        this.f = le0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.e.removeOnAttachStateChangeListener(this);
        this.f.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
