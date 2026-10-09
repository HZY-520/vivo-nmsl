package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class th extends jn implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final th o;
    public static final long p;

    static {
        Long l;
        th thVar = new th();
        o = thVar;
        thVar.v(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        p = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.jn
    public final Thread B() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.jn
    public final void D(long j, hn hnVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void F() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = p7.a;
            unsafe.putObjectVolatile(this, jn.m, (Object) null);
            unsafe.putObjectVolatile(this, jn.k, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.jn, defpackage.mi
    public final tj e(long j, Runnable runnable, tg tgVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return i60.e;
        }
        long nanoTime = System.nanoTime();
        gn gnVar = new gn(j2 + nanoTime, runnable);
        E(nanoTime, gnVar);
        return gnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean C;
        gq0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (C) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long w = w();
                    if (w == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = p + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            F();
                            if (C()) {
                                return;
                            }
                            B();
                            return;
                        }
                        if (w > j2) {
                            w = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (w > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            F();
                            if (C()) {
                                return;
                            }
                            B();
                            return;
                        }
                        LockSupport.parkNanos(this, w);
                    }
                }
            }
        } finally {
            _thread = null;
            F();
            if (!C()) {
                B();
            }
        }
    }

    @Override // defpackage.jn, defpackage.en
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.vg
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.jn
    public final void y(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.y(runnable);
    }
}
