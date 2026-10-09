package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class r5 implements wt0 {
    public final ViewConfiguration a;

    public r5(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.wt0
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.wt0
    public final float b() {
        return this.a.getScaledTouchSlop();
    }
}
