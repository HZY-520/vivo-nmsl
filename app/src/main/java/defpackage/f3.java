package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class f3 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ k3 f;

    public /* synthetic */ f3(k3 k3Var, int i) {
        this.e = i;
        this.f = k3Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        k3 k3Var = this.f;
        switch (i) {
            case 0:
                View view = k3Var.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                qi0 qi0Var = (qi0) obj;
                if (qi0Var.f.contains(qi0Var)) {
                    a90 snapshotObserver = k3Var.h.getSnapshotObserver();
                    snapshotObserver.a.b(qi0Var, k3Var.Q, new s2(1, qi0Var, k3Var));
                }
                return fs0.a;
        }
    }
}
