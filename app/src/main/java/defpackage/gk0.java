package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class gk0 {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ia a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = p7.a;
        f = unsafe.objectFieldOffset(gk0.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(gk0.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(gk0.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(gk0.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(gk0.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(gk0.class.getDeclaredField("_availablePermits$volatile"));
    }

    public gk0() {
        ik0 ik0Var = new ik0(0L, null, 2);
        this.head$volatile = ik0Var;
        this.tail$volatile = ik0Var;
        this._availablePermits$volatile = 1;
        this.a = new ia(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r5.e() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c50 c50Var) {
        Object o;
        fs0 fs0Var;
        long j;
        ek0 ek0Var;
        long j2;
        long j3;
        ja jaVar = c50Var.e;
        d50 d50Var = c50Var.f;
        while (true) {
            int andDecrement = d.getAndDecrement(this);
            if (andDecrement <= 1) {
                int i = 0;
                fs0 fs0Var2 = fs0.a;
                if (andDecrement > 0) {
                    d50.h.set(d50Var, null);
                    jaVar.A(fs0Var2, jaVar.g, new ia(i, new l(d50Var, c50Var)));
                    return;
                }
                Unsafe unsafe = p7.a;
                long j4 = g;
                ik0 ik0Var = (ik0) unsafe.getObjectVolatile(this, j4);
                long andIncrement = c.getAndIncrement(this);
                ek0 ek0Var2 = ek0.m;
                long j5 = andIncrement / hk0.f;
                while (true) {
                    o = kw.o(ik0Var, j5, ek0Var2);
                    if (j20.f(o)) {
                        fs0Var = fs0Var2;
                        break;
                    }
                    nj0 e2 = j20.e(o);
                    while (true) {
                        nj0 nj0Var = (nj0) p7.a.getObjectVolatile(this, j4);
                        fs0Var = fs0Var2;
                        j = j4;
                        if (nj0Var.d >= e2.d) {
                            break;
                        }
                        if (!e2.i()) {
                            break;
                        }
                        ek0Var = ek0Var2;
                        while (true) {
                            Unsafe unsafe2 = p7.a;
                            j2 = j5;
                            if (!unsafe2.compareAndSwapObject(this, g, nj0Var, e2)) {
                                j3 = j;
                                if (unsafe2.getObjectVolatile(this, j3) != nj0Var) {
                                    break;
                                }
                                j = j3;
                                j5 = j2;
                            } else if (nj0Var.e()) {
                                nj0Var.d();
                            }
                        }
                        j4 = j3;
                        ek0Var2 = ek0Var;
                        j5 = j2;
                        fs0Var2 = fs0Var;
                    }
                    fs0Var2 = fs0Var;
                    j4 = j;
                }
                ik0 ik0Var2 = (ik0) j20.e(o);
                AtomicReferenceArray atomicReferenceArray = ik0Var2.g;
                int i2 = (int) (andIncrement % hk0.f);
                while (!atomicReferenceArray.compareAndSet(i2, null, c50Var)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        mm mmVar = hk0.b;
                        mm mmVar2 = hk0.c;
                        while (!atomicReferenceArray.compareAndSet(i2, mmVar, mmVar2)) {
                            fs0 fs0Var3 = fs0Var;
                            if (atomicReferenceArray.get(i2) != mmVar) {
                                break;
                            } else {
                                fs0Var = fs0Var3;
                            }
                        }
                        d50.h.set(d50Var, null);
                        jaVar.A(fs0Var, jaVar.g, new ia(0, new l(d50Var, c50Var)));
                        return;
                    }
                }
                c50Var.b(ik0Var2, i2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r5.e() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object o;
        boolean z;
        boolean z2;
        long j;
        long j2;
        gk0 gk0Var = this;
        do {
            int andIncrement = d.getAndIncrement(gk0Var);
            boolean z3 = true;
            if (andIncrement >= 1) {
                while (true) {
                    Unsafe unsafe = p7.a;
                    long j3 = e;
                    int intVolatile = unsafe.getIntVolatile(gk0Var, j3);
                    if (intVolatile <= 1 || unsafe.compareAndSwapInt(gk0Var, j3, intVolatile, 1)) {
                        break;
                    } else {
                        gk0Var = this;
                    }
                }
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = p7.a;
            long j4 = f;
            ik0 ik0Var = (ik0) unsafe2.getObjectVolatile(gk0Var, j4);
            long andIncrement2 = b.getAndIncrement(gk0Var);
            long j5 = andIncrement2 / hk0.f;
            fk0 fk0Var = fk0.m;
            while (true) {
                o = kw.o(ik0Var, j5, fk0Var);
                if (j20.f(o)) {
                    z = z3;
                    break;
                }
                nj0 e2 = j20.e(o);
                while (true) {
                    nj0 nj0Var = (nj0) p7.a.getObjectVolatile(gk0Var, j4);
                    z = z3;
                    j = j4;
                    if (nj0Var.d >= e2.d) {
                        break;
                    }
                    if (!e2.i()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = p7.a;
                        if (!unsafe3.compareAndSwapObject(gk0Var, f, nj0Var, e2)) {
                            j2 = j;
                            if (unsafe3.getObjectVolatile(gk0Var, j2) != nj0Var) {
                                break;
                            } else {
                                j = j2;
                            }
                        } else if (nj0Var.e()) {
                            nj0Var.d();
                        }
                    }
                    j4 = j2;
                    z3 = z;
                }
                z3 = z;
                j4 = j;
            }
            ik0 ik0Var2 = (ik0) j20.e(o);
            AtomicReferenceArray atomicReferenceArray = ik0Var2.g;
            ik0Var2.a();
            boolean z4 = false;
            if (ik0Var2.d <= j5) {
                int i = (int) (andIncrement2 % hk0.f);
                Object andSet = atomicReferenceArray.getAndSet(i, hk0.b);
                if (andSet == null) {
                    int i2 = hk0.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (atomicReferenceArray.get(i) != hk0.c) {
                        }
                    }
                    mm mmVar = hk0.b;
                    mm mmVar2 = hk0.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, mmVar, mmVar2)) {
                            if (atomicReferenceArray.get(i) != mmVar) {
                                break;
                            }
                        } else {
                            z4 = z;
                            break;
                        }
                    }
                    z2 = !z4;
                } else if (andSet != hk0.e) {
                    if (!(andSet instanceof ha)) {
                        z6.e(andSet, "unexpected: ");
                        return;
                    }
                    ha haVar = (ha) andSet;
                    mm h = haVar.h(fs0.a, gk0Var.a);
                    if (h != null) {
                        haVar.v(h);
                    }
                }
                z2 = z;
                break;
            }
            z2 = false;
        } while (!z2);
    }
}
