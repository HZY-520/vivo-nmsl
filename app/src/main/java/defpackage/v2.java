package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ e3 f;

    public /* synthetic */ v2(e3 e3Var, int i) {
        this.e = i;
        this.f = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        e3 e3Var = this.f;
        switch (i) {
            case 0:
                g7 g7Var = e3Var.m;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!g7Var.isEmpty()) {
                    try {
                        ((eq) g7Var.removeLast()).b();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                e3Var.A0 = false;
                MotionEvent motionEvent = e3Var.q0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    e3Var.E(motionEvent);
                    return;
                } else {
                    z6.m("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                e3.k(e3Var.getRoot());
                return;
            default:
                e3.k(e3Var.getRoot());
                return;
        }
    }
}
