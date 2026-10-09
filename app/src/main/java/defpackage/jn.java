package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class jn extends en implements mi {
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ int n = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = p7.a;
        m = unsafe.objectFieldOffset(jn.class.getDeclaredField("_queue$volatile"));
        k = unsafe.objectFieldOffset(jn.class.getDeclaredField("_delayed$volatile"));
        l = unsafe.objectFieldOffset(jn.class.getDeclaredField("_isCompleted$volatile"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(Runnable runnable) {
        jn jnVar;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = p7.a;
            long j = m;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, l) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = p7.a;
                    jn jnVar2 = this;
                    runnable2 = runnable;
                    jnVar = jnVar2;
                    if (unsafe4.compareAndSwapObject(jnVar2, m, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(jnVar, j) != null) {
                        break;
                    }
                    this = jnVar;
                    runnable = runnable2;
                }
                this = jnVar;
                runnable = runnable2;
            } else {
                jnVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof p00) {
                    p00 p00Var = (p00) objectVolatile;
                    int a = p00Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        p00 c = p00Var.c();
                        do {
                            unsafe2 = p7.a;
                            if (unsafe2.compareAndSwapObject(jnVar, m, objectVolatile, c)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(jnVar, j) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = jnVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == t10.d) {
                        break;
                    }
                    p00 p00Var2 = new p00(8, true);
                    p00Var2.a((Runnable) objectVolatile);
                    p00Var2.a(runnable2);
                    do {
                        unsafe = p7.a;
                        if (unsafe.compareAndSwapObject(jnVar, m, objectVolatile, p00Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(jnVar, j) == objectVolatile);
                    this = jnVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public abstract Thread B();

    public final boolean C() {
        g7 g7Var = this.i;
        if (g7Var != null ? g7Var.isEmpty() : true) {
            Unsafe unsafe = p7.a;
            in inVar = (in) unsafe.getObjectVolatile(this, k);
            if (inVar != null && inVar.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, m);
            if (objectVolatile != null) {
                if (objectVolatile instanceof p00) {
                    long longVolatile = unsafe.getLongVolatile((p00) objectVolatile, p00.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == t10.d) {
                }
            }
            return true;
        }
        return false;
    }

    public void D(long j, hn hnVar) {
        th.o.E(j, hnVar);
    }

    public final void E(long j, hn hnVar) {
        jn jnVar;
        int a;
        Unsafe unsafe;
        Thread B;
        long j2 = k;
        Unsafe unsafe2 = p7.a;
        if (unsafe2.getIntVolatile(this, l) != 0) {
            jnVar = this;
            a = 1;
        } else {
            in inVar = (in) unsafe2.getObjectVolatile(this, j2);
            if (inVar == null) {
                in inVar2 = new in();
                inVar2.c = j;
                while (true) {
                    unsafe = p7.a;
                    jnVar = this;
                    if (!unsafe.compareAndSwapObject(jnVar, k, (Object) null, inVar2) && unsafe.getObjectVolatile(jnVar, j2) == null) {
                        this = jnVar;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(jnVar, j2);
                objectVolatile.getClass();
                inVar = (in) objectVolatile;
                unsafe2 = unsafe;
            } else {
                jnVar = this;
            }
            a = hnVar.a(j, inVar, jnVar);
        }
        if (a != 0) {
            if (a == 1) {
                jnVar.D(j, hnVar);
                return;
            } else {
                if (a == 2) {
                    return;
                }
                z6.m("unexpected result");
                return;
            }
        }
        in inVar3 = (in) unsafe2.getObjectVolatile(jnVar, j2);
        if (inVar3 != null) {
            synchronized (inVar3) {
                hn[] hnVarArr = inVar3.a;
                r12 = hnVarArr != null ? hnVarArr[0] : null;
            }
        }
        if (r12 != hnVar || Thread.currentThread() == (B = jnVar.B())) {
            return;
        }
        LockSupport.unpark(B);
    }

    @Override // defpackage.mi
    public final void c(long j, ja jaVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            fn fnVar = new fn(this, j2 + nanoTime, jaVar);
            E(nanoTime, fnVar);
            jaVar.u(new fa(1, fnVar));
        }
    }

    @Override // defpackage.mi
    public tj e(long j, Runnable runnable, tg tgVar) {
        return uh.a.e(j, runnable, tgVar);
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        y(runnable);
    }

    @Override // defpackage.en
    public void shutdown() {
        mm mmVar;
        Unsafe unsafe;
        hn c;
        gq0.a.set(null);
        p7.a.putIntVolatile(this, l, 1);
        mm mmVar2 = t10.d;
        long j = m;
        loop0: while (true) {
            Object objectVolatile = p7.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    mmVar = mmVar2;
                    if (unsafe2.compareAndSwapObject(this, m, (Object) null, mmVar2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        mmVar2 = mmVar;
                    }
                }
                mmVar2 = mmVar;
            } else {
                mmVar = mmVar2;
                if (objectVolatile instanceof p00) {
                    ((p00) objectVolatile).b();
                    break;
                }
                if (objectVolatile == mmVar) {
                    break;
                }
                p00 p00Var = new p00(8, true);
                p00Var.a((Runnable) objectVolatile);
                do {
                    unsafe = p7.a;
                    if (unsafe.compareAndSwapObject(this, m, objectVolatile, p00Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                mmVar2 = mmVar;
            }
        }
        while (w() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            in inVar = (in) p7.a.getObjectVolatile(this, k);
            if (inVar == null) {
                return;
            }
            synchronized (inVar) {
                c = inVar.b() > 0 ? inVar.c(0) : null;
            }
            if (c == null) {
                return;
            } else {
                D(nanoTime, c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.en
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long w() {
        Unsafe unsafe;
        jn jnVar;
        Unsafe unsafe2;
        Runnable runnable;
        hn hnVar;
        mm mmVar = t10.d;
        long j = m;
        if (!x()) {
            z();
            loop0: while (true) {
                unsafe = p7.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    jnVar = this;
                    break;
                }
                if (objectVolatile instanceof p00) {
                    p00 p00Var = (p00) objectVolatile;
                    Object d = p00Var.d();
                    if (d != p00.e) {
                        Runnable runnable2 = (Runnable) d;
                        jnVar = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    p00 c = p00Var.c();
                    while (true) {
                        Unsafe unsafe3 = p7.a;
                        jnVar = this;
                        if (!unsafe3.compareAndSwapObject(jnVar, m, objectVolatile, c) && unsafe3.getObjectVolatile(jnVar, j) == objectVolatile) {
                            this = jnVar;
                        }
                    }
                    this = jnVar;
                } else {
                    jnVar = this;
                    if (objectVolatile == mmVar) {
                        break;
                    }
                    do {
                        unsafe2 = p7.a;
                        if (unsafe2.compareAndSwapObject(jnVar, m, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(jnVar, j) == objectVolatile);
                    this = jnVar;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            g7 g7Var = jnVar.i;
            if (((g7Var == null || g7Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(jnVar, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof p00) {
                        long longVolatile = unsafe2.getLongVolatile((p00) objectVolatile2, p00.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == mmVar) {
                        return Long.MAX_VALUE;
                    }
                }
                in inVar = (in) unsafe.getObjectVolatile(jnVar, k);
                if (inVar != null) {
                    synchronized (inVar) {
                        hn[] hnVarArr = inVar.a;
                        hnVar = hnVarArr != null ? hnVarArr[0] : null;
                    }
                    if (hnVar != null) {
                        long nanoTime = hnVar.e - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void y(Runnable runnable) {
        z();
        if (!A(runnable)) {
            th.o.y(runnable);
            return;
        }
        Thread B = B();
        if (Thread.currentThread() != B) {
            LockSupport.unpark(B);
        }
    }

    public final void z() {
        hn hnVar;
        in inVar = (in) p7.a.getObjectVolatile(this, k);
        if (inVar == null || inVar.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (inVar) {
                try {
                    hn[] hnVarArr = inVar.a;
                    hn hnVar2 = hnVarArr != null ? hnVarArr[0] : null;
                    if (hnVar2 != null) {
                        hnVar = ((nanoTime - hnVar2.e) > 0L ? 1 : ((nanoTime - hnVar2.e) == 0L ? 0 : -1)) >= 0 ? A(hnVar2) : false ? inVar.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (hnVar != null);
    }
}
