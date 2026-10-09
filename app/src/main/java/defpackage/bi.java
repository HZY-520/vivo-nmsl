package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bi extends kn implements Executor {
    public static final bi g = new bi();
    public static final vg h;

    static {
        gs0 gs0Var = gs0.g;
        int i = qo0.a;
        if (64 >= i) {
            i = 64;
        }
        h = gs0Var.n(v10.n(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(sm.e, runnable);
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        h.h(tgVar, runnable);
    }

    @Override // defpackage.vg
    public final String toString() {
        return "Dispatchers.IO";
    }
}
