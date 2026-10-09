package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vw0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = p7.a;
        f = unsafe.objectFieldOffset(vw0.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(vw0.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(vw0.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(vw0.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(vw0.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(vw0.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final vo0 a(vo0 vo0Var) {
        if (b() == 127) {
            return vo0Var;
        }
        if (vo0Var.f) {
            c.incrementAndGet(this);
        }
        int intVolatile = p7.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, vo0Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return p7.a.getIntVolatile(this, g) - p7.a.getIntVolatile(this, e);
    }

    public final vo0 c() {
        vo0 vo0Var;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            vw0 vw0Var = this;
            if (unsafe.compareAndSwapInt(vw0Var, j, intVolatile, intVolatile + 1) && (vo0Var = (vo0) vw0Var.a.getAndSet(i, null)) != null) {
                if (vo0Var.f) {
                    c.decrementAndGet(vw0Var);
                }
                return vo0Var;
            }
            this = vw0Var;
        }
    }

    public final vo0 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        vo0 vo0Var = (vo0) atomicReferenceArray.get(i2);
        if (vo0Var != null && vo0Var.f == z) {
            while (!atomicReferenceArray.compareAndSet(i2, vo0Var, null)) {
                if (atomicReferenceArray.get(i2) != vo0Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return vo0Var;
        }
        return null;
    }
}
