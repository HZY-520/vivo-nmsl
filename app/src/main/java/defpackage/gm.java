package defpackage;

import android.content.Context;
import android.view.View;
import com.vivo.cnm.lico.PhoneLayoutHook;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class gm implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gm(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                t3 t3Var = (t3) this.f;
                q3 q3Var = (q3) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    rp m = dx0.m((Context) t3Var.f);
                    if (m == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    qp qpVar = (qp) m.a;
                    synchronized (qpVar.g) {
                        qpVar.i = threadPoolExecutor;
                    }
                    m.a.c(new hm(q3Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    q3Var.F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                PhoneLayoutHook.synchronizeStrip$lambda$55((View) this.f, (Class) this.g, this.h);
                return;
        }
    }
}
