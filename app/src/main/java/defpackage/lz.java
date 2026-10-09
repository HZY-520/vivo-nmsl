package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lz extends vg implements mi {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(lz.class, "runningWorkers$volatile");
    public static final /* synthetic */ long m = p7.a.objectFieldOffset(lz.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ mi g;
    public final vg h;
    public final int i;
    public final n00 j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public lz(vg vgVar, int i) {
        mi miVar = vgVar instanceof mi ? (mi) vgVar : null;
        this.g = miVar == null ? uh.a : miVar;
        this.h = vgVar;
        this.i = i;
        this.j = new n00();
        this.k = new Object();
    }

    @Override // defpackage.mi
    public final void c(long j, ja jaVar) {
        this.g.c(j, jaVar);
    }

    @Override // defpackage.mi
    public final tj e(long j, Runnable runnable, tg tgVar) {
        return this.g.e(j, runnable, tgVar);
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        boolean z;
        Runnable p;
        this.j.a(runnable);
        if (p7.a.getIntVolatile(this, m) < this.i) {
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                if (p7.a.getIntVolatile(this, m) >= this.i) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (p = p()) == null) {
                return;
            }
            this.h.h(this, new ss(this, p));
        }
    }

    public final Runnable p() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.vg
    public final String toString() {
        return this.h + ".limitedParallelism(" + this.i + ')';
    }
}
