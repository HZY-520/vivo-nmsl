package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bh implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(bh.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(bh.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(bh.class, "_isTerminated$volatile");
    public static final mm o = new mm("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final yr i;
    public final yr j;
    public final kf0 k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public bh(int i, int i2, long j, String str) {
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str;
        if (i < 1) {
            z6.d(j2.h("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            z6.d(j2.i("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            z6.d(j2.h("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.i = new yr();
        this.j = new yr();
        this.k = new kf0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(bh bhVar, Runnable runnable, int i) {
        bhVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.k) {
            try {
                if (n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.e) {
                    return 0;
                }
                if (i >= this.f) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.k.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                zg zgVar = new zg(this, i3);
                this.k.c(i3, zgVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                zgVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        vo0 wo0Var;
        ah ahVar;
        xo0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof vo0) {
            wo0Var = (vo0) runnable;
            wo0Var.e = nanoTime;
            wo0Var.f = z;
        } else {
            wo0Var = new wo0(runnable, nanoTime, z);
        }
        boolean z3 = wo0Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        zg zgVar = currentThread instanceof zg ? (zg) currentThread : null;
        if (zgVar == null || zgVar.l != this) {
            zgVar = null;
        }
        if (zgVar != null && (ahVar = zgVar.g) != ah.i && (wo0Var.f || ahVar != ah.f)) {
            zgVar.k = true;
            vw0 vw0Var = zgVar.e;
            if (z2) {
                wo0Var = vw0Var.a(wo0Var);
            } else {
                vw0Var.getClass();
                vo0 vo0Var = (vo0) p7.a.getAndSetObject(vw0Var, vw0.f, wo0Var);
                wo0Var = vo0Var == null ? null : vw0Var.a(vo0Var);
            }
        }
        if (wo0Var != null) {
            if (!(wo0Var.f ? this.j.a(wo0Var) : this.i.a(wo0Var))) {
                throw new RejectedExecutionException(this.h + " was terminated");
            }
        }
        boolean z4 = z2 && zgVar != null;
        if (z3) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        vo0 vo0Var;
        if (n.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            zg zgVar = currentThread instanceof zg ? (zg) currentThread : null;
            if (zgVar == null || zgVar.l != this) {
                zgVar = null;
            }
            synchronized (this.k) {
                i = (int) (m.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.k.b(i2);
                    b.getClass();
                    zg zgVar2 = (zg) b;
                    if (zgVar2 != zgVar) {
                        while (zgVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(zgVar2);
                            zgVar2.join(10000L);
                        }
                        vw0 vw0Var = zgVar2.e;
                        yr yrVar = this.j;
                        vw0Var.getClass();
                        vo0 vo0Var2 = (vo0) p7.a.getAndSetObject(vw0Var, vw0.f, (Object) null);
                        if (vo0Var2 != null) {
                            yrVar.a(vo0Var2);
                        }
                        while (true) {
                            vo0 c = vw0Var.c();
                            if (c == null) {
                                break;
                            } else {
                                yrVar.a(c);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.b();
            this.i.b();
            while (true) {
                if (zgVar != null) {
                    vo0Var = zgVar.a(true);
                }
                vo0Var = (vo0) this.i.d();
                if (vo0Var == null && (vo0Var = (vo0) this.j.d()) == null) {
                    break;
                }
                try {
                    vo0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (zgVar != null) {
                zgVar.h(ah.i);
            }
            l.set(this, 0L);
            m.set(this, 0L);
        }
    }

    public final void d(zg zgVar, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = zgVar.c();
                    while (true) {
                        if (c == o) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        zg zgVar2 = (zg) c;
                        int b = zgVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = zgVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                bh bhVar = this;
                if (atomicLongFieldUpdater.compareAndSet(bhVar, j, j3)) {
                    return;
                } else {
                    this = bhVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.e;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        bh bhVar;
        mm mmVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            long j = atomicLongFieldUpdater.get(this);
            zg zgVar = (zg) this.k.b((int) (2097151 & j));
            if (zgVar == null) {
                zgVar = null;
                bhVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = zgVar.c();
                while (true) {
                    mmVar = o;
                    if (c == mmVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    zg zgVar2 = (zg) c;
                    i = zgVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = zgVar2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    bh bhVar2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(bhVar2, j, j2 | i);
                    bhVar = bhVar2;
                    if (compareAndSet) {
                        zgVar.g(mmVar);
                    }
                    this = bhVar;
                } else {
                    continue;
                }
            }
            if (zgVar == null) {
                return false;
            }
            if (zg.m.compareAndSet(zgVar, -1, 0)) {
                LockSupport.unpark(zgVar);
                return true;
            }
            this = bhVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kf0 kf0Var = this.k;
        int a = kf0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            zg zgVar = (zg) kf0Var.b(i6);
            if (zgVar != null) {
                vw0 vw0Var = zgVar.e;
                vw0Var.getClass();
                Object objectVolatile = p7.a.getObjectVolatile(vw0Var, vw0.f);
                int b = vw0Var.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = zgVar.g.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        z6.j();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(nh.y(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.e;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
