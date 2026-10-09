package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class c3 implements Runnable {
    public final /* synthetic */ e3 e;

    public c3(e3 e3Var) {
        this.e = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        e3 e3Var = this.e;
        e3Var.removeCallbacks(this);
        MotionEvent motionEvent = e3Var.q0;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7) {
            if (actionMasked == 8) {
                i = 9;
            } else if (actionMasked != 9) {
                i = 2;
            }
        }
        e3Var.F(motionEvent, i, e3Var.r0, false);
    }
}
