package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zg extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(zg.class, "workerCtl$volatile");
    public static final /* synthetic */ long n = p7.a.objectFieldOffset(zg.class.getDeclaredField("workerCtl$volatile"));
    public final vw0 e;
    public final ve0 f;
    public ah g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ bh l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public zg(bh bhVar, int i) {
        this.l = bhVar;
        setDaemon(true);
        setContextClassLoader(bh.class.getClassLoader());
        this.e = new vw0();
        this.f = new ve0();
        this.g = ah.h;
        this.nextParkedWorker = bh.o;
        int nanoTime = (int) System.nanoTime();
        this.j = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final vo0 a(boolean z) {
        vo0 e;
        vo0 e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        ah ahVar = this.g;
        bh bhVar = this.l;
        vo0 vo0Var = null;
        vw0 vw0Var = this.e;
        ah ahVar2 = ah.e;
        if (ahVar != ahVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = bh.m;
            do {
                j = atomicLongFieldUpdater.get(bhVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    vw0Var.getClass();
                    long j2 = vw0.f;
                    loop1: while (true) {
                        unsafe = p7.a;
                        vo0 vo0Var2 = (vo0) unsafe.getObjectVolatile(vw0Var, j2);
                        if (vo0Var2 != null && vo0Var2.f) {
                            do {
                                unsafe2 = p7.a;
                                if (unsafe2.compareAndSwapObject(vw0Var, vw0.f, vo0Var2, (Object) null)) {
                                    vo0Var = vo0Var2;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(vw0Var, j2) == vo0Var2);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(vw0Var, vw0.e);
                    int intVolatile2 = unsafe.getIntVolatile(vw0Var, vw0.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || p7.a.getIntVolatile(vw0Var, vw0.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        vo0 d = vw0Var.d(intVolatile2, true);
                        if (d != null) {
                            vo0Var = d;
                            break;
                        }
                    }
                    if (vo0Var != null) {
                        return vo0Var;
                    }
                    vo0 vo0Var3 = (vo0) bhVar.j.d();
                    return vo0Var3 == null ? i(1) : vo0Var3;
                }
            } while (!bh.m.compareAndSet(bhVar, j, j - 4398046511104L));
            this.g = ahVar2;
        }
        if (z) {
            boolean z2 = d(bhVar.e * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            vw0Var.getClass();
            vo0 vo0Var4 = (vo0) p7.a.getAndSetObject(vw0Var, vw0.f, (Object) null);
            if (vo0Var4 == null) {
                vo0Var4 = vw0Var.c();
            }
            if (vo0Var4 != null) {
                return vo0Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            vo0 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final vo0 e() {
        int d = d(2);
        bh bhVar = this.l;
        yr yrVar = bhVar.j;
        yr yrVar2 = bhVar.i;
        if (d == 0) {
            vo0 vo0Var = (vo0) yrVar2.d();
            return vo0Var != null ? vo0Var : (vo0) yrVar.d();
        }
        vo0 vo0Var2 = (vo0) yrVar.d();
        return vo0Var2 != null ? vo0Var2 : (vo0) yrVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.h);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ah ahVar) {
        ah ahVar2 = this.g;
        boolean z = ahVar2 == ah.e;
        if (z) {
            bh.m.addAndGet(this.l, 4398046511104L);
        }
        if (ahVar2 != ahVar) {
            this.g = ahVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vo0 i(int i) {
        int i2;
        long j;
        vo0 vo0Var;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = bh.m;
        bh bhVar = this.l;
        int i4 = (int) (atomicLongFieldUpdater.get(bhVar) & 2097151);
        vo0 vo0Var2 = null;
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        int i5 = 0;
        long j4 = Long.MAX_VALUE;
        while (i5 < i4) {
            d++;
            if (d > i4) {
                d = 1;
            }
            zg zgVar = (zg) bhVar.k.b(d);
            if (zgVar == null || zgVar == this) {
                i2 = i4;
            } else {
                vw0 vw0Var = zgVar.e;
                if (i3 == 3) {
                    vo0Var = vw0Var.c();
                    i2 = i4;
                    j = 0;
                } else {
                    vw0Var.getClass();
                    Unsafe unsafe2 = p7.a;
                    int intVolatile = unsafe2.getIntVolatile(vw0Var, vw0.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(vw0Var, vw0.g);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (p7.a.getIntVolatile(vw0Var, vw0.d) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        vo0 d2 = vw0Var.d(intVolatile, z);
                        if (d2 != null) {
                            vo0Var = d2;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    vo0Var = vo0Var2;
                }
                ve0 ve0Var = this.f;
                if (vo0Var == null) {
                    j2 = -1;
                    long j5 = vw0.f;
                    while (true) {
                        vo0 vo0Var3 = (vo0) p7.a.getObjectVolatile(vw0Var, j5);
                        if (vo0Var3 == null) {
                            break;
                        }
                        if (((vo0Var3.f ? 1 : 2) & i) == 0) {
                            break;
                        }
                        xo0.f.getClass();
                        vw0 vw0Var2 = vw0Var;
                        long nanoTime = System.nanoTime() - vo0Var3.e;
                        long j6 = xo0.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = p7.a;
                            if (unsafe.compareAndSwapObject(vw0Var2, vw0.f, vo0Var3, (Object) null)) {
                                ve0Var.e = vo0Var3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(vw0Var2, j5) == vo0Var3);
                        vw0Var = vw0Var2;
                    }
                } else {
                    ve0Var.e = vo0Var;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    vo0 vo0Var4 = (vo0) ve0Var.e;
                    ve0Var.e = null;
                    return vo0Var4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            vo0Var2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.i = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ah ahVar;
        loop0: while (true) {
            boolean z = false;
            while (bh.n.get(this.l) == 0) {
                ah ahVar2 = this.g;
                ah ahVar3 = ah.i;
                if (ahVar2 == ahVar3) {
                    break loop0;
                }
                vo0 a = a(this.k);
                if (a != null) {
                    this.i = 0L;
                    bh bhVar = this.l;
                    this.h = 0L;
                    if (this.g == ah.g) {
                        this.g = ah.f;
                    }
                    if (a.f) {
                        if (h(ah.f) && !bhVar.f() && !bhVar.e(bh.m.get(bhVar))) {
                            bhVar.f();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        bh.m.addAndGet(bhVar, -2097152L);
                        if (this.g != ahVar3) {
                            this.g = ah.h;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.k = false;
                    if (this.i == 0) {
                        Object obj = this.nextParkedWorker;
                        mm mmVar = bh.o;
                        if (obj != mmVar) {
                            int i = -1;
                            p7.a.putIntVolatile(this, n, -1);
                            while (this.nextParkedWorker != bh.o) {
                                Unsafe unsafe = p7.a;
                                long j = n;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    bh bhVar2 = this.l;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bh.n;
                                    if (atomicIntegerFieldUpdater.get(bhVar2) != 0) {
                                        break;
                                    }
                                    ah ahVar4 = this.g;
                                    ah ahVar5 = ah.i;
                                    if (ahVar4 == ahVar5) {
                                        break;
                                    }
                                    h(ah.g);
                                    Thread.interrupted();
                                    if (this.h == 0) {
                                        ahVar = ahVar5;
                                        this.h = System.nanoTime() + this.l.g;
                                    } else {
                                        ahVar = ahVar5;
                                    }
                                    LockSupport.parkNanos(this.l.g);
                                    if (System.nanoTime() - this.h >= 0) {
                                        this.h = 0L;
                                        bh bhVar3 = this.l;
                                        synchronized (bhVar3.k) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater.get(bhVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = bh.m;
                                                    if (((int) (atomicLongFieldUpdater.get(bhVar3) & 2097151)) > bhVar3.e) {
                                                        if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            f(0);
                                                            bhVar3.d(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bhVar3) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Object b = bhVar3.k.b(andDecrement);
                                                                b.getClass();
                                                                zg zgVar = (zg) b;
                                                                bhVar3.k.c(i2, zgVar);
                                                                zgVar.f(i2);
                                                                bhVar3.d(zgVar, andDecrement, i2);
                                                            }
                                                            bhVar3.k.c(andDecrement, null);
                                                            this.g = ahVar;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    i = -1;
                                }
                            }
                        } else {
                            bh bhVar4 = this.l;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = bh.l;
                            if (this.nextParkedWorker == mmVar) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(bhVar4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = bhVar4.k.b((int) (j2 & 2097151));
                                    bh bhVar5 = bhVar4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(bhVar5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    bhVar4 = bhVar5;
                                }
                            }
                        }
                    } else if (z) {
                        h(ah.g);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.i);
                        this.i = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(ah.i);
    }
}
