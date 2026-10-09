package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l5 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ m5 e;

    public l5(m5 m5Var) {
        this.e = m5Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.h.removeCallbacks(this);
        this.e.p();
        m5 m5Var = this.e;
        synchronized (m5Var.i) {
            if (m5Var.n) {
                m5Var.n = false;
                ArrayList arrayList = m5Var.k;
                m5Var.k = m5Var.l;
                m5Var.l = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.p();
        m5 m5Var = this.e;
        synchronized (m5Var.i) {
            if (m5Var.k.isEmpty()) {
                m5Var.g.removeFrameCallback(this);
                m5Var.n = false;
            }
        }
    }
}
