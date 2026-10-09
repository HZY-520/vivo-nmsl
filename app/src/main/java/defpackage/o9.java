package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class o9 implements va {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(o9.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final /* synthetic */ AtomicLongFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = p7.a;
        s = unsafe.objectFieldOffset(o9.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(o9.class, "receivers$volatile");
        q = unsafe.objectFieldOffset(o9.class.getDeclaredField("receivers$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(o9.class, "bufferEnd$volatile");
        l = unsafe.objectFieldOffset(o9.class.getDeclaredField("bufferEnd$volatile"));
        i = AtomicLongFieldUpdater.newUpdater(o9.class, "completedExpandBuffersAndPauseFlag$volatile");
        o = unsafe.objectFieldOffset(o9.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        r = unsafe.objectFieldOffset(o9.class.getDeclaredField("sendSegment$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "receiveSegment$volatile");
        p = unsafe.objectFieldOffset(o9.class.getDeclaredField("receiveSegment$volatile"));
        m = unsafe.objectFieldOffset(o9.class.getDeclaredField("bufferEndSegment$volatile"));
        k = unsafe.objectFieldOffset(o9.class.getDeclaredField("_closeCause$volatile"));
        n = unsafe.objectFieldOffset(o9.class.getDeclaredField("closeHandler$volatile"));
    }

    public o9(int i2) {
        this.e = i2;
        if (i2 < 0) {
            z6.d(j2.h("Invalid channel capacity: ", i2, ", should be >=0"));
            throw null;
        }
        cb cbVar = q9.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j();
        cb cbVar2 = new cb(0L, null, this, 3);
        this.sendSegment$volatile = cbVar2;
        this.receiveSegment$volatile = cbVar2;
        if (x()) {
            cbVar2 = q9.a;
            cbVar2.getClass();
        }
        this.bufferEndSegment$volatile = cbVar2;
        this._closeCause$volatile = q9.s;
    }

    public static boolean E(Object obj) {
        if (!(obj instanceof ha)) {
            z6.e(obj, "Unexpected waiter: ");
            return false;
        }
        ha haVar = (ha) obj;
        cb cbVar = q9.a;
        mm h2 = haVar.h(fs0.a, null);
        if (h2 == null) {
            return false;
        }
        haVar.v(h2);
        return true;
    }

    public final void A(Object obj, ja jaVar) {
        jaVar.resumeWith(new qf0(o()));
    }

    public final Object B(ng ngVar) {
        cb cbVar;
        Throwable th;
        cb cbVar2;
        Unsafe unsafe = p7.a;
        long j2 = p;
        cb cbVar3 = (cb) unsafe.getObjectVolatile(this, j2);
        while (!this.u()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = q9.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (cbVar3.d != j4) {
                cb h2 = this.h(j4, cbVar3);
                if (h2 == null) {
                    continue;
                } else {
                    cbVar = h2;
                }
            } else {
                cbVar = cbVar3;
            }
            o9 o9Var = this;
            Object F = o9Var.F(cbVar, i2, andIncrement, null);
            mm mmVar = q9.m;
            if (F == mmVar) {
                z6.m("unexpected");
                return null;
            }
            mm mmVar2 = q9.o;
            if (F == mmVar2) {
                if (andIncrement < o9Var.q()) {
                    cbVar.a();
                }
                this = o9Var;
                cbVar3 = cbVar;
            } else {
                if (F != q9.n) {
                    cbVar.a();
                    return F;
                }
                ja t = lr0.t(lr0.x(ngVar));
                try {
                    Object F2 = o9Var.F(cbVar, i2, andIncrement, t);
                    if (F2 == mmVar) {
                        t.b(cbVar, i2);
                    } else {
                        if (F2 == mmVar2) {
                            if (andIncrement < o9Var.q()) {
                                cbVar.a();
                            }
                            cb cbVar4 = (cb) p7.a.getObjectVolatile(o9Var, j2);
                            while (true) {
                                if (o9Var.u()) {
                                    t.resumeWith(new qf0(o9Var.l()));
                                    break;
                                }
                                ja jaVar = t;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(o9Var);
                                    long j5 = q9.b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (cbVar4.d != j6) {
                                        try {
                                            cb h3 = o9Var.h(j6, cbVar4);
                                            if (h3 == null) {
                                                t = jaVar;
                                            } else {
                                                cbVar2 = h3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            t = jaVar;
                                            t.y();
                                            throw th;
                                        }
                                    } else {
                                        cbVar2 = cbVar4;
                                    }
                                    o9 o9Var2 = o9Var;
                                    F2 = o9Var2.F(cbVar2, i3, andIncrement2, jaVar);
                                    o9Var = o9Var2;
                                    cb cbVar5 = cbVar2;
                                    t = jaVar;
                                    if (F2 == q9.m) {
                                        t.b(cbVar5, i3);
                                        break;
                                    }
                                    if (F2 == q9.o) {
                                        if (andIncrement2 < o9Var.q()) {
                                            cbVar5.a();
                                        }
                                        cbVar4 = cbVar5;
                                    } else {
                                        if (F2 == q9.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        cbVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    t = jaVar;
                                    th = th;
                                    t.y();
                                    throw th;
                                }
                            }
                        } else {
                            cbVar.a();
                        }
                        t.z(F2, null);
                    }
                    return t.p();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable l2 = this.l();
        int i4 = vm0.a;
        throw l2;
    }

    public final void C(mu0 mu0Var, boolean z) {
        if (mu0Var instanceof ha) {
            ((ng) mu0Var).resumeWith(new qf0(z ? l() : o()));
            return;
        }
        if (!(mu0Var instanceof n9)) {
            z6.e(mu0Var, "Unexpected waiter: ");
            return;
        }
        n9 n9Var = (n9) mu0Var;
        ja jaVar = n9Var.f;
        jaVar.getClass();
        n9Var.f = null;
        n9Var.e = q9.l;
        Throwable k2 = n9Var.g.k();
        if (k2 == null) {
            jaVar.resumeWith(Boolean.FALSE);
        } else {
            jaVar.resumeWith(new qf0(k2));
        }
    }

    public final boolean D(Object obj, Object obj2) {
        if (!(obj instanceof n9)) {
            if (!(obj instanceof ha)) {
                z6.e(obj, "Unexpected receiver type: ");
                return false;
            }
            ha haVar = (ha) obj;
            cb cbVar = q9.a;
            mm h2 = haVar.h(obj2, null);
            if (h2 == null) {
                return false;
            }
            haVar.v(h2);
            return true;
        }
        n9 n9Var = (n9) obj;
        ja jaVar = n9Var.f;
        jaVar.getClass();
        n9Var.f = null;
        n9Var.e = obj2;
        Boolean bool = Boolean.TRUE;
        n9Var.g.getClass();
        cb cbVar2 = q9.a;
        mm h3 = jaVar.h(bool, null);
        if (h3 == null) {
            return false;
        }
        jaVar.v(h3);
        return true;
    }

    public final Object F(cb cbVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = cbVar.h;
        Object k2 = cbVar.k(i2);
        long j3 = s;
        if (k2 == null) {
            if (j2 >= (p7.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return q9.n;
                }
                if (cbVar.j(i2, k2, obj)) {
                    g();
                    return q9.m;
                }
            }
        } else if (k2 == q9.d && cbVar.j(i2, k2, q9.i)) {
            g();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            cbVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = cbVar.k(i2);
            if (k3 == null || k3 == q9.e) {
                if (j2 < (p7.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (cbVar.j(i2, k3, q9.h)) {
                        g();
                        return q9.o;
                    }
                } else {
                    if (obj == null) {
                        return q9.n;
                    }
                    if (cbVar.j(i2, k3, obj)) {
                        g();
                        return q9.m;
                    }
                }
            } else if (k3 != q9.d) {
                mm mmVar = q9.j;
                if (k3 == mmVar) {
                    return q9.o;
                }
                if (k3 == q9.h) {
                    return q9.o;
                }
                if (k3 == q9.l) {
                    g();
                    return q9.o;
                }
                if (k3 != q9.g && cbVar.j(i2, k3, q9.f)) {
                    boolean z = k3 instanceof nu0;
                    if (z) {
                        k3 = ((nu0) k3).a;
                    }
                    if (E(k3)) {
                        cbVar.n(i2, q9.i);
                        g();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        cbVar.m(i2, null);
                        return obj3;
                    }
                    cbVar.n(i2, mmVar);
                    cbVar.h();
                    if (z) {
                        g();
                    }
                    return q9.o;
                }
            } else if (cbVar.j(i2, k3, q9.i)) {
                g();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                cbVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int G(cb cbVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        cbVar.m(i2, obj);
        if (z) {
            return H(cbVar, i2, obj, j2, obj2, z);
        }
        Object k2 = cbVar.k(i2);
        if (k2 == null) {
            if (a(j2)) {
                if (cbVar.j(i2, null, q9.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (cbVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof mu0) {
            cbVar.m(i2, null);
            if (D(k2, obj)) {
                cbVar.n(i2, q9.i);
                return 0;
            }
            mm mmVar = q9.k;
            if (cbVar.h.getAndSet((i2 * 2) + 1, mmVar) == mmVar) {
                return 5;
            }
            cbVar.l(i2, true);
            return 5;
        }
        return H(cbVar, i2, obj, j2, obj2, z);
    }

    public final int H(cb cbVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = cbVar.k(i2);
            if (k2 == null) {
                if (!a(j2) || z) {
                    if (z) {
                        if (cbVar.j(i2, null, q9.j)) {
                            cbVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (cbVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (cbVar.j(i2, null, q9.d)) {
                    break;
                }
            } else {
                if (k2 != q9.e) {
                    mm mmVar = q9.k;
                    if (k2 == mmVar) {
                        cbVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == q9.h) {
                        cbVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == q9.l) {
                        cbVar.m(i2, null);
                        v();
                        return 4;
                    }
                    cbVar.m(i2, null);
                    if (k2 instanceof nu0) {
                        k2 = ((nu0) k2).a;
                    }
                    if (D(k2, obj)) {
                        cbVar.n(i2, q9.i);
                        return 0;
                    }
                    if (cbVar.h.getAndSet((i2 * 2) + 1, mmVar) != mmVar) {
                        cbVar.l(i2, true);
                    }
                    return 5;
                }
                if (cbVar.j(i2, k2, q9.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j2) {
        o9 o9Var = this;
        if (o9Var.x()) {
            return;
        }
        while (o9Var.j() <= j2) {
            o9Var = this;
        }
        int i2 = q9.c;
        int i3 = 0;
        while (true) {
            long j3 = o;
            if (i3 < i2) {
                long j4 = o9Var.j();
                if (j4 == (p7.a.getLongVolatile(o9Var, j3) & 4611686018427387903L) && j4 == o9Var.j()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = p7.a;
                    long longVolatile = unsafe.getLongVolatile(o9Var, j3);
                    if (unsafe.compareAndSwapLong(o9Var, o, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        o9Var = this;
                    }
                }
                while (true) {
                    long j5 = o9Var.j();
                    Unsafe unsafe2 = p7.a;
                    long longVolatile2 = unsafe2.getLongVolatile(o9Var, j3);
                    long j6 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (j5 == j6 && j5 == o9Var.j()) {
                        break;
                    }
                    if (z) {
                        o9Var = this;
                    } else {
                        o9Var = this;
                        unsafe2.compareAndSwapLong(o9Var, o, longVolatile2, j6 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = p7.a;
                    long longVolatile3 = unsafe3.getLongVolatile(o9Var, j3);
                    if (unsafe3.compareAndSwapLong(o9Var, o, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        o9Var = this;
                    }
                }
            }
        }
    }

    public final boolean a(long j2) {
        return j2 < j() || j2 < m() + ((long) this.e);
    }

    @Override // defpackage.va
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        d(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // defpackage.jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(ng ngVar, Object obj) {
        Object obj2;
        Object obj3;
        Object p2;
        Object obj4;
        String str;
        int i2;
        o9 o9Var = this;
        Unsafe unsafe = p7.a;
        long j2 = r;
        cb cbVar = (cb) unsafe.getObjectVolatile(o9Var, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(o9Var);
            long j3 = andIncrement & 1152921504606846975L;
            boolean t = o9Var.t(andIncrement, false);
            int i3 = q9.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = cbVar.d;
            Object obj5 = dh.e;
            obj2 = fs0.a;
            if (j6 != j5) {
                cb i5 = o9Var.i(j5, cbVar);
                if (i5 != null) {
                    cbVar = i5;
                } else if (t) {
                    Object z = z(ngVar, obj);
                    if (z == obj5) {
                        return z;
                    }
                }
            }
            int G = o9Var.G(cbVar, i4, obj, j3, null, t);
            if (G == 0) {
                cbVar.a();
                return obj2;
            }
            if (G == 1) {
                break;
            }
            if (G != 2) {
                if (G == 3) {
                    ja t2 = lr0.t(lr0.x(ngVar));
                    try {
                        int G2 = G(cbVar, i4, obj, j3, t2, false);
                        if (G2 != 0) {
                            if (G2 == 1) {
                                obj3 = obj5;
                                t2.resumeWith(obj2);
                            } else if (G2 != 2) {
                                if (G2 != 4) {
                                    String str2 = "unexpected";
                                    if (G2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    cbVar.a();
                                    cb cbVar2 = (cb) p7.a.getObjectVolatile(this, j2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j7 = andIncrement2 & 1152921504606846975L;
                                        boolean t3 = t(andIncrement2, false);
                                        int i6 = q9.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                                        long j8 = i6;
                                        obj3 = obj5;
                                        long j9 = j7 / j8;
                                        int i7 = (int) (j7 % j8);
                                        if (cbVar2.d != j9) {
                                            cb i8 = i(j9, cbVar2);
                                            if (i8 != null) {
                                                str = str2;
                                                i2 = i7;
                                                cbVar2 = i8;
                                            } else {
                                                if (t3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            }
                                        } else {
                                            str = str2;
                                            i2 = i7;
                                        }
                                        int G3 = G(cbVar2, i2, obj, j7, t2, t3);
                                        if (G3 == 0) {
                                            cbVar2.a();
                                            break;
                                        }
                                        if (G3 == 1) {
                                            break;
                                        }
                                        if (G3 != 2) {
                                            if (G3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (G3 != 4) {
                                                if (G3 == 5) {
                                                    cbVar2.a();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater2;
                                                obj5 = obj3;
                                            } else if (j7 < m()) {
                                                cbVar2.a();
                                            }
                                        } else if (t3) {
                                            cbVar2.h();
                                        } else {
                                            t2.b(cbVar2, i2 + i6);
                                        }
                                    }
                                } else {
                                    obj3 = obj5;
                                    if (j3 < m()) {
                                        cbVar.a();
                                    }
                                }
                                A(obj, t2);
                            } else {
                                obj3 = obj5;
                                t2.b(cbVar, i4 + i3);
                            }
                            p2 = t2.p();
                            obj4 = obj3;
                            if (p2 != obj4) {
                                p2 = obj2;
                            }
                            if (p2 != obj4) {
                                return p2;
                            }
                        } else {
                            obj3 = obj5;
                            cbVar.a();
                        }
                        t2.resumeWith(obj2);
                        p2 = t2.p();
                        obj4 = obj3;
                        if (p2 != obj4) {
                        }
                        if (p2 != obj4) {
                            break;
                        }
                    } catch (Throwable th) {
                        t2.y();
                        throw th;
                    }
                } else if (G != 4) {
                    if (G == 5) {
                        cbVar.a();
                    }
                    o9Var = this;
                } else {
                    if (j3 < m()) {
                        cbVar.a();
                    }
                    Object z2 = z(ngVar, obj);
                    if (z2 == obj5) {
                        return z2;
                    }
                }
            } else if (t) {
                cbVar.h();
                Object z3 = z(ngVar, obj);
                if (z3 == obj5) {
                    return z3;
                }
            }
        }
        return obj2;
    }

    public final boolean d(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        o9 o9Var = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = p7.a;
                long j5 = s;
                long longVolatile3 = unsafe4.getLongVolatile(o9Var, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                cb cbVar = q9.a;
                if (unsafe4.compareAndSwapLong(o9Var, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                o9Var = this;
            }
        }
        mm mmVar = q9.s;
        while (true) {
            Unsafe unsafe5 = p7.a;
            long j6 = k;
            if (unsafe5.compareAndSwapObject(this, j6, mmVar, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != mmVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = p7.a;
                j4 = s;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = p7.a;
                j2 = s;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        v();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = p7.a;
                long j7 = n;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                mm mmVar2 = objectVolatile == null ? q9.q : q9.r;
                do {
                    unsafe2 = p7.a;
                    if (unsafe2.compareAndSwapObject(this, n, objectVolatile, mmVar2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                lr0.e(1, objectVolatile);
                ((pq) objectVolatile).invoke(k());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (defpackage.cb) ((defpackage.pf) defpackage.p7.a.getObjectVolatile(r0, defpackage.pf.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cb e(long j2) {
        pf pfVar;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = p7.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, m);
        cb cbVar = (cb) unsafe2.getObjectVolatile(this, r);
        if (cbVar.d > ((cb) objectVolatile).d) {
            objectVolatile = cbVar;
        }
        cb cbVar2 = (cb) unsafe2.getObjectVolatile(this, p);
        if (cbVar2.d > ((cb) objectVolatile).d) {
            objectVolatile = cbVar2;
        }
        pf pfVar2 = (pf) objectVolatile;
        loop0: while (true) {
            pfVar = pfVar2;
            while (true) {
                int i2 = pf.c;
                pfVar.getClass();
                Object objectVolatile2 = p7.a.getObjectVolatile(pfVar, pf.a);
                mm mmVar = kw.f;
                if (objectVolatile2 == mmVar) {
                    break loop0;
                }
                pfVar2 = (pf) objectVolatile2;
                if (pfVar2 == null) {
                    do {
                        unsafe = p7.a;
                        j4 = pf.a;
                        if (unsafe.compareAndSwapObject(pfVar, j4, (Object) null, mmVar)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(pfVar, j4) == null);
                }
            }
        }
        cb cbVar3 = (cb) pfVar;
        if (w()) {
            cb cbVar4 = cbVar3;
            loop3: do {
                int i3 = q9.b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j3 = (cbVar4.d * q9.b) + i3;
                    if (j3 < m()) {
                        break loop3;
                    }
                    while (true) {
                        Object k2 = cbVar4.k(i3);
                        if (k2 != null && k2 != q9.e) {
                            if (k2 == q9.d) {
                                break loop3;
                            }
                        } else {
                            if (cbVar4.j(i3, k2, q9.l)) {
                                cbVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (cbVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                f(j3);
            }
        }
        Object obj = null;
        loop6: for (cb cbVar5 = cbVar3; cbVar5 != null; cbVar5 = (cb) ((pf) p7.a.getObjectVolatile(cbVar5, pf.b))) {
            for (int i4 = q9.b - 1; -1 < i4; i4--) {
                if ((cbVar5.d * q9.b) + i4 < j2) {
                    break loop6;
                }
                while (true) {
                    Object k3 = cbVar5.k(i4);
                    if (k3 != null && k3 != q9.e) {
                        if (!(k3 instanceof nu0)) {
                            if (!(k3 instanceof mu0)) {
                                break;
                            }
                            if (cbVar5.j(i4, k3, q9.l)) {
                                obj = nh.M(obj, k3);
                                cbVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (cbVar5.j(i4, k3, q9.l)) {
                                obj = nh.M(obj, ((nu0) k3).a);
                                cbVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (cbVar5.j(i4, k3, q9.l)) {
                            cbVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C((mu0) obj, true);
                return cbVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                C((mu0) arrayList.get(size), true);
            }
        }
        return cbVar3;
    }

    public final void f(long j2) {
        cb cbVar = (cb) p7.a.getObjectVolatile(this, p);
        while (true) {
            Unsafe unsafe = p7.a;
            long j3 = q;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(this.e + longVolatile, this.j())) {
                return;
            }
            o9 o9Var = this;
            if (unsafe.compareAndSwapLong(o9Var, j3, longVolatile, 1 + longVolatile)) {
                long j4 = q9.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (cbVar.d != j5) {
                    cb h2 = o9Var.h(j5, cbVar);
                    if (h2 != null) {
                        cbVar = h2;
                    }
                }
                cb cbVar2 = cbVar;
                if (o9Var.F(cbVar2, i2, longVolatile, null) != q9.o) {
                    cbVar2.a();
                } else if (longVolatile < o9Var.q()) {
                    cbVar2.a();
                }
                this = o9Var;
                cbVar = cbVar2;
            }
            this = o9Var;
        }
    }

    public final void g() {
        Object o2;
        Unsafe unsafe;
        if (x()) {
            return;
        }
        Unsafe unsafe2 = p7.a;
        long j2 = m;
        cb cbVar = (cb) unsafe2.getObjectVolatile(this, j2);
        loop0: while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j3 = andIncrement / q9.b;
            if (q() <= andIncrement) {
                if (cbVar.d < j3 && cbVar.b() != null) {
                    y(j3, cbVar);
                }
                r(1L);
                return;
            }
            if (cbVar.d != j3) {
                p9 p9Var = p9.m;
                while (true) {
                    o2 = kw.o(cbVar, j3, p9Var);
                    if (!j20.f(o2)) {
                        nj0 e = j20.e(o2);
                        while (true) {
                            nj0 nj0Var = (nj0) p7.a.getObjectVolatile(this, j2);
                            if (nj0Var.d >= e.d) {
                                break;
                            }
                            if (!e.i()) {
                                break;
                            }
                            do {
                                unsafe = p7.a;
                                if (unsafe.compareAndSwapObject(this, m, nj0Var, e)) {
                                    if (nj0Var.e()) {
                                        nj0Var.d();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == nj0Var);
                            if (e.e()) {
                                e.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                cb cbVar2 = null;
                if (j20.f(o2)) {
                    v();
                    y(j3, cbVar);
                    r(1L);
                } else {
                    cb cbVar3 = (cb) j20.e(o2);
                    long j4 = cbVar3.d;
                    if (j4 > j3) {
                        long j5 = q9.b * j4;
                        if (p7.a.compareAndSwapLong(this, l, 1 + andIncrement, j5)) {
                            r(j5 - andIncrement);
                        } else {
                            r(1L);
                        }
                    } else {
                        cbVar2 = cbVar3;
                    }
                }
                if (cbVar2 == null) {
                    continue;
                } else {
                    cbVar = cbVar2;
                }
            }
            int i2 = (int) (andIncrement % q9.b);
            Object k2 = cbVar.k(i2);
            boolean z = k2 instanceof mu0;
            long j6 = q;
            if (!z || andIncrement < p7.a.getLongVolatile(this, j6) || !cbVar.j(i2, k2, q9.g)) {
                while (true) {
                    Object k3 = cbVar.k(i2);
                    if (!(k3 instanceof mu0)) {
                        if (k3 != q9.j) {
                            if (k3 != null) {
                                if (k3 == q9.d || k3 == q9.h || k3 == q9.i || k3 == q9.k || k3 == q9.l) {
                                    break loop0;
                                } else if (k3 != q9.f) {
                                    z6.e(k3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (cbVar.j(i2, k3, q9.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < p7.a.getLongVolatile(this, j6)) {
                        if (cbVar.j(i2, k3, new nu0((mu0) k3))) {
                            break loop0;
                        }
                    } else if (cbVar.j(i2, k3, q9.g)) {
                        if (E(k3)) {
                            cbVar.n(i2, q9.d);
                            break;
                        } else {
                            cbVar.n(i2, q9.j);
                            cbVar.h();
                        }
                    }
                }
            } else if (E(k2)) {
                cbVar.n(i2, q9.d);
                break;
            } else {
                cbVar.n(i2, q9.j);
                cbVar.h();
                r(1L);
            }
        }
        r(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.e() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cb h(long j2, cb cbVar) {
        Object o2;
        cb cbVar2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        cb cbVar3 = q9.a;
        p9 p9Var = p9.m;
        loop0: while (true) {
            o2 = kw.o(cbVar, j2, p9Var);
            if (!j20.f(o2)) {
                nj0 e = j20.e(o2);
                while (true) {
                    Unsafe unsafe3 = p7.a;
                    long j4 = p;
                    nj0 nj0Var = (nj0) unsafe3.getObjectVolatile(this, j4);
                    if (nj0Var.d >= e.d) {
                        break loop0;
                    }
                    if (!e.i()) {
                        break;
                    }
                    do {
                        unsafe2 = p7.a;
                        if (unsafe2.compareAndSwapObject(this, p, nj0Var, e)) {
                            if (nj0Var.e()) {
                                nj0Var.d();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == nj0Var);
                    if (e.e()) {
                        e.d();
                    }
                }
            } else {
                break;
            }
        }
        if (j20.f(o2)) {
            v();
            if (cbVar.d * q9.b < q()) {
                cbVar.a();
                return null;
            }
        } else {
            cb cbVar4 = (cb) j20.e(o2);
            long j5 = cbVar4.d;
            if (!x() && j2 <= j() / q9.b) {
                while (true) {
                    Unsafe unsafe4 = p7.a;
                    long j6 = m;
                    nj0 nj0Var2 = (nj0) unsafe4.getObjectVolatile(this, j6);
                    if (nj0Var2.d >= j5 || !cbVar4.i()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe5 = p7.a;
                        cbVar2 = cbVar4;
                        if (unsafe5.compareAndSwapObject(this, m, nj0Var2, cbVar4)) {
                            if (nj0Var2.e()) {
                                nj0Var2.d();
                            }
                        } else {
                            if (unsafe5.getObjectVolatile(this, j6) != nj0Var2) {
                                break;
                            }
                            cbVar4 = cbVar2;
                        }
                    }
                    cbVar4 = cbVar2;
                }
            }
            cbVar2 = cbVar4;
            if (j5 <= j2) {
                return cbVar2;
            }
            long j7 = j5 * q9.b;
            do {
                unsafe = p7.a;
                j3 = q;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * q9.b < q()) {
                cbVar2.a();
            }
        }
        return null;
    }

    public final cb i(long j2, cb cbVar) {
        Object o2;
        cb cbVar2;
        long j3;
        Unsafe unsafe;
        o9 o9Var = this;
        cb cbVar3 = q9.a;
        p9 p9Var = p9.m;
        loop0: while (true) {
            o2 = kw.o(cbVar, j2, p9Var);
            if (!j20.f(o2)) {
                nj0 e = j20.e(o2);
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    long j4 = r;
                    nj0 nj0Var = (nj0) unsafe2.getObjectVolatile(o9Var, j4);
                    if (nj0Var.d >= e.d) {
                        break loop0;
                    }
                    if (!e.i()) {
                        break;
                    }
                    do {
                        unsafe = p7.a;
                        if (unsafe.compareAndSwapObject(o9Var, r, nj0Var, e)) {
                            if (nj0Var.e()) {
                                nj0Var.d();
                            }
                        }
                    } while (unsafe.getObjectVolatile(o9Var, j4) == nj0Var);
                    if (e.e()) {
                        e.d();
                    }
                }
            } else {
                break;
            }
        }
        cb cbVar4 = null;
        if (j20.f(o2)) {
            o9Var.v();
            if (cbVar.d * q9.b >= o9Var.m()) {
                return null;
            }
            cbVar.a();
            return null;
        }
        cb cbVar5 = (cb) j20.e(o2);
        long j5 = cbVar5.d;
        if (j5 <= j2) {
            return cbVar5;
        }
        long j6 = j5 * q9.b;
        while (true) {
            Unsafe unsafe3 = p7.a;
            long j7 = s;
            long longVolatile = unsafe3.getLongVolatile(o9Var, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                cbVar2 = cbVar4;
                j3 = j5;
                break;
            }
            cbVar2 = cbVar4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(o9Var, j7, longVolatile, j8 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            o9Var = this;
            cbVar4 = cbVar2;
            j5 = j3;
        }
        if (j3 * q9.b >= m()) {
            return cbVar2;
        }
        cbVar5.a();
        return cbVar2;
    }

    @Override // defpackage.va
    public final n9 iterator() {
        return new n9(this);
    }

    public final long j() {
        return p7.a.getLongVolatile(this, l);
    }

    public final Throwable k() {
        return (Throwable) p7.a.getObjectVolatile(this, k);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new yb("Channel was closed") : k2;
    }

    public final long m() {
        return p7.a.getLongVolatile(this, q);
    }

    @Override // defpackage.va
    public final Object n() {
        cb cbVar;
        o9 o9Var;
        int i2;
        bb bbVar = lw.i;
        Unsafe unsafe = p7.a;
        long longVolatile = unsafe.getLongVolatile(this, q);
        long longVolatile2 = unsafe.getLongVolatile(this, s);
        if (t(longVolatile2, true)) {
            return new ab(k());
        }
        if (longVolatile >= (longVolatile2 & 1152921504606846975L)) {
            return bbVar;
        }
        Object obj = q9.k;
        cb cbVar2 = (cb) unsafe.getObjectVolatile(this, p);
        while (!this.u()) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = q9.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (cbVar2.d != j3) {
                cb h2 = this.h(j3, cbVar2);
                if (h2 == null) {
                    continue;
                } else {
                    cbVar = h2;
                    i2 = i3;
                    o9Var = this;
                }
            } else {
                cbVar = cbVar2;
                o9Var = this;
                i2 = i3;
            }
            Object F = o9Var.F(cbVar, i2, andIncrement, obj);
            cbVar2 = cbVar;
            if (F == q9.m) {
                mu0 mu0Var = obj instanceof mu0 ? (mu0) obj : null;
                if (mu0Var != null) {
                    mu0Var.b(cbVar2, i2);
                }
                o9Var.I(andIncrement);
                cbVar2.h();
                return bbVar;
            }
            if (F != q9.o) {
                if (F != q9.n) {
                    cbVar2.a();
                    return F;
                }
                z6.m("unexpected");
                return null;
            }
            if (andIncrement < o9Var.q()) {
                cbVar2.a();
            }
            this = o9Var;
        }
        return new ab(this.k());
    }

    public final Throwable o() {
        Throwable k2 = k();
        return k2 == null ? new zb("Channel was closed") : k2;
    }

    @Override // defpackage.jk0
    public Object p(Object obj) {
        o9 o9Var = this;
        bb bbVar = lw.i;
        Unsafe unsafe = p7.a;
        long j2 = 1152921504606846975L;
        if (o9Var.t(unsafe.getLongVolatile(o9Var, s), false) ? false : !o9Var.a(r2 & 1152921504606846975L)) {
            return bbVar;
        }
        Object obj2 = q9.j;
        cb cbVar = (cb) unsafe.getObjectVolatile(o9Var, r);
        while (true) {
            long andIncrement = f.getAndIncrement(o9Var);
            long j3 = andIncrement & j2;
            boolean t = o9Var.t(andIncrement, false);
            int i2 = q9.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (cbVar.d != j5) {
                cb i4 = o9Var.i(j5, cbVar);
                if (i4 != null) {
                    cbVar = i4;
                } else {
                    if (t) {
                        return new ab(o9Var.o());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int G = o9Var.G(cbVar, i3, obj, j3, obj2, t);
            fs0 fs0Var = fs0.a;
            if (G == 0) {
                cbVar.a();
                return fs0Var;
            }
            if (G == 1) {
                return fs0Var;
            }
            if (G == 2) {
                if (t) {
                    cbVar.h();
                    return new ab(o());
                }
                mu0 mu0Var = obj2 instanceof mu0 ? (mu0) obj2 : null;
                if (mu0Var != null) {
                    mu0Var.b(cbVar, i3 + i2);
                }
                cbVar.h();
                return bbVar;
            }
            if (G == 3) {
                z6.m("unexpected");
                return null;
            }
            if (G == 4) {
                if (j3 < m()) {
                    cbVar.a();
                }
                return new ab(o());
            }
            if (G == 5) {
                cbVar.a();
            }
            j2 = 1152921504606846975L;
            o9Var = this;
        }
    }

    public final long q() {
        return p7.a.getLongVolatile(this, s) & 1152921504606846975L;
    }

    public final void r(long j2) {
        if ((i.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((p7.a.getLongVolatile(this, o) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (defpackage.cb) ((defpackage.pf) defpackage.p7.a.getObjectVolatile(r12, defpackage.pf.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                e(j2 & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = p7.a;
                        long j3 = p;
                        cb cbVar = (cb) unsafe.getObjectVolatile(this, j3);
                        long m2 = m();
                        if (q() <= m2) {
                            break;
                        }
                        long j4 = q9.b;
                        long j5 = m2 / j4;
                        if (cbVar.d != j5 && (cbVar = h(j5, cbVar)) == null) {
                            if (((cb) unsafe.getObjectVolatile(this, j3)).d < j5) {
                                break;
                            }
                        } else {
                            cbVar.a();
                            int i3 = (int) (m2 % j4);
                            while (true) {
                                Object k2 = cbVar.k(i3);
                                if (k2 == null || k2 == q9.e) {
                                    if (cbVar.j(i3, k2, q9.h)) {
                                        g();
                                        break;
                                    }
                                } else {
                                    if (k2 == q9.d) {
                                        break;
                                    }
                                    if (k2 != q9.j) {
                                        if (k2 != q9.l) {
                                            if (k2 != q9.i) {
                                                if (k2 != q9.h) {
                                                    if (k2 == q9.g) {
                                                        break;
                                                    }
                                                    if (k2 != q9.f && m2 == m()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            p7.a.compareAndSwapLong(this, q, m2, m2 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(j2.g("unexpected close status: ", i2).toString());
                }
                cb e = e(j2 & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i4 = q9.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (e.d * q9.b) + i4;
                        while (true) {
                            Object k3 = e.k(i4);
                            if (k3 == q9.i) {
                                break loop0;
                            }
                            if (k3 == q9.d) {
                                if (j6 < m()) {
                                    break loop0;
                                }
                                if (e.j(i4, k3, q9.l)) {
                                    e.m(i4, null);
                                    e.h();
                                    break;
                                }
                            } else if (k3 != q9.e && k3 != null) {
                                if (!(k3 instanceof mu0) && !(k3 instanceof nu0)) {
                                    mm mmVar = q9.g;
                                    if (k3 == mmVar || k3 == q9.f) {
                                        break loop0;
                                    }
                                    if (k3 != mmVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < m()) {
                                        break loop0;
                                    }
                                    mu0 mu0Var = k3 instanceof nu0 ? ((nu0) k3).a : (mu0) k3;
                                    if (e.j(i4, k3, q9.l)) {
                                        obj = nh.M(obj, mu0Var);
                                        e.m(i4, null);
                                        e.h();
                                        break;
                                    }
                                }
                            } else if (e.j(i4, k3, q9.l)) {
                                e.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (e != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            C((mu0) arrayList.get(size), false);
                        }
                    } else {
                        C((mu0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
    
        r3 = (defpackage.cb) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = p7.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, s) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.e + ',');
        sb.append("data=[");
        int i2 = 0;
        List C = kw.C(unsafe.getObjectVolatile(this, p), unsafe.getObjectVolatile(this, r), unsafe.getObjectVolatile(this, m));
        ArrayList arrayList = new ArrayList();
        for (Object obj : C) {
            if (((cb) obj) != q9.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((cb) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((cb) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        cb cbVar = (cb) next;
        long m2 = m();
        long q2 = q();
        loop2: while (true) {
            int i3 = q9.b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (cbVar.d * q9.b) + i4;
                if (j4 >= q2 && j4 >= m2) {
                    break loop2;
                }
                Object k2 = cbVar.k(i4);
                Object obj2 = cbVar.h.get(i4 * 2);
                if (k2 instanceof ha) {
                    str = (j4 >= m2 || j4 < q2) ? (j4 >= q2 || j4 < m2) ? "cont" : "send" : "receive";
                } else if (k2 instanceof nu0) {
                    str = "EB(" + k2 + ')';
                } else if (lw.i(k2, q9.f) || lw.i(k2, q9.g)) {
                    str = "resuming_sender";
                } else {
                    if (k2 != null && !k2.equals(q9.e) && !k2.equals(q9.i) && !k2.equals(q9.h) && !k2.equals(q9.k) && !k2.equals(q9.j) && !k2.equals(q9.l)) {
                        str = k2.toString();
                    }
                    i4++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return t(p7.a.getLongVolatile(this, s), true);
    }

    public final boolean v() {
        return t(p7.a.getLongVolatile(this, s), false);
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j2 = j();
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.e() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j2, cb cbVar) {
        o9 o9Var;
        cb cbVar2;
        cb cbVar3;
        while (cbVar.d < j2 && (cbVar3 = (cb) cbVar.b()) != null) {
            cbVar = cbVar3;
        }
        while (true) {
            cb cbVar4 = cbVar;
            while (cbVar4.c() && (cbVar2 = (cb) cbVar4.b()) != null) {
                cbVar4 = cbVar2;
            }
            while (true) {
                Unsafe unsafe = p7.a;
                long j3 = m;
                nj0 nj0Var = (nj0) unsafe.getObjectVolatile(this, j3);
                if (nj0Var.d >= cbVar4.d) {
                    return;
                }
                if (!cbVar4.i()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    o9Var = this;
                    if (unsafe2.compareAndSwapObject(o9Var, m, nj0Var, cbVar4)) {
                        if (nj0Var.e()) {
                            nj0Var.d();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(o9Var, j3) != nj0Var) {
                        break;
                    } else {
                        this = o9Var;
                    }
                }
                this = o9Var;
            }
            cbVar = cbVar4;
        }
    }

    public final Object z(ng ngVar, Object obj) {
        ja jaVar = new ja(1, lr0.x(ngVar));
        jaVar.r();
        jaVar.resumeWith(new qf0(o()));
        Object p2 = jaVar.p();
        return p2 == dh.e ? p2 : fs0.a;
    }
}
