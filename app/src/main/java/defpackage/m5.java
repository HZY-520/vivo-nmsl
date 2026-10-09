package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m5 extends vg {
    public static final lo0 q = new lo0(new r3(5));
    public static final k5 r = new k5();
    public final Choreographer g;
    public final Handler h;
    public boolean m;
    public boolean n;
    public final p5 p;
    public final Object i = new Object();
    public final g7 j = new g7();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final l5 o = new l5(this);

    public m5(Choreographer choreographer, Handler handler) {
        this.g = choreographer;
        this.h = handler;
        this.p = new p5(choreographer, this);
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        synchronized (this.i) {
            this.j.addLast(runnable);
            if (!this.m) {
                this.m = true;
                this.h.post(this.o);
                if (!this.n) {
                    this.n = true;
                    this.g.postFrameCallback(this.o);
                }
            }
        }
    }

    public final void p() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.i) {
                g7 g7Var = this.j;
                runnable = (Runnable) (g7Var.isEmpty() ? null : g7Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.i) {
                    g7 g7Var2 = this.j;
                    runnable = (Runnable) (g7Var2.isEmpty() ? null : g7Var2.removeFirst());
                }
            }
            synchronized (this.i) {
                if (this.j.isEmpty()) {
                    z = false;
                    this.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
