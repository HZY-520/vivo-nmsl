package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qp implements dm {
    public final Context e;
    public final pp f;
    public final Object g = new Object();
    public Handler h;
    public ThreadPoolExecutor i;
    public ThreadPoolExecutor j;
    public q3 k;

    public qp(Context context, pp ppVar) {
        m20.d(context, "Context cannot be null");
        this.e = context.getApplicationContext();
        this.f = ppVar;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                this.k = null;
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.h = null;
                ThreadPoolExecutor threadPoolExecutor = this.j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.i = null;
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zp b() {
        try {
            Context context = this.e;
            Object[] objArr = {this.f};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            jd a = op.a(context, Collections.unmodifiableList(arrayList));
            int i = a.e;
            if (i != 0) {
                throw new RuntimeException(j2.h("fetchFonts failed (", i, ")"));
            }
            zp[] zpVarArr = (zp[]) ((List) a.f).get(0);
            if (zpVarArr == null || zpVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return zpVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.dm
    public final void c(q3 q3Var) {
        synchronized (this.g) {
            this.k = q3Var;
        }
        synchronized (this.g) {
            try {
                if (this.k == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.i;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new nf("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.j = threadPoolExecutor2;
                    this.i = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new o(4, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
