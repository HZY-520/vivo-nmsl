package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ qd0(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new qd0(context, 1));
                break;
            default:
                q3.Q(context, new nd0(), q3.n, false);
                break;
        }
    }
}
