package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class o5 implements Choreographer.FrameCallback {
    public final /* synthetic */ ja e;
    public final /* synthetic */ pq f;

    public o5(ja jaVar, p5 p5Var, pq pqVar) {
        this.e = jaVar;
        this.f = pqVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object qf0Var;
        try {
            qf0Var = this.f.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        this.e.resumeWith(qf0Var);
    }
}
