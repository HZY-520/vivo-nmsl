package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k5 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            m5 m5Var = new m5(choreographer, Handler.createAsync(myLooper));
            return q3.H(m5Var, m5Var.p);
        }
        z6.m("no Looper on this thread");
        return null;
    }
}
