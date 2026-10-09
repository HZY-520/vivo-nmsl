package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hm extends q3 {
    public final /* synthetic */ q3 p;
    public final /* synthetic */ ThreadPoolExecutor q;

    public hm(q3 q3Var, ThreadPoolExecutor threadPoolExecutor) {
        this.p = q3Var;
        this.q = threadPoolExecutor;
    }

    @Override // defpackage.q3
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.q3
    public final void G(l20 l20Var) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.G(l20Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
