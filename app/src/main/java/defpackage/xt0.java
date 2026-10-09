package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class xt0 extends dr implements pq {
    public static final xt0 m = new xt0(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
