package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ja extends nj implements ha, eh, mu0 {
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final ng h;
    public final tg i;

    static {
        Unsafe unsafe = p7.a;
        j = unsafe.objectFieldOffset(ja.class.getDeclaredField("_decisionAndIndex$volatile"));
        l = unsafe.objectFieldOffset(ja.class.getDeclaredField("_state$volatile"));
        k = unsafe.objectFieldOffset(ja.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ja(int i, ng ngVar) {
        super(i);
        this.h = ngVar;
        this.i = ngVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = r1.a;
    }

    public static Object C(m60 m60Var, Object obj, int i, uq uqVar) {
        if (obj instanceof hd) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (uqVar != null || (m60Var instanceof fa)) {
            return new fd(obj, m60Var instanceof fa ? (fa) m60Var : null, uqVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void x(m60 m60Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + m60Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, uq uqVar) {
        ja jaVar;
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof m60)) {
                ja jaVar2 = this;
                if (objectVolatile instanceof la) {
                    la laVar = (la) objectVolatile;
                    if (unsafe.compareAndSwapInt(laVar, la.c, 0, 1)) {
                        if (uqVar != null) {
                            jaVar2.l(uqVar, laVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                z6.e(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object C = C((m60) objectVolatile, obj, i, uqVar);
            while (true) {
                Unsafe unsafe2 = p7.a;
                jaVar = this;
                if (unsafe2.compareAndSwapObject(jaVar, l, objectVolatile, C)) {
                    if (!jaVar.w()) {
                        jaVar.n();
                    }
                    jaVar.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(jaVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = jaVar;
                }
            }
            this = jaVar;
        }
    }

    public final void B(vg vgVar) {
        ng ngVar = this.h;
        lj ljVar = ngVar instanceof lj ? (lj) ngVar : null;
        A(fs0.a, (ljVar != null ? ljVar.h : null) == vgVar ? 4 : this.g, null);
    }

    @Override // defpackage.ha
    public final boolean a() {
        return q() instanceof m60;
    }

    @Override // defpackage.mu0
    public final void b(nj0 nj0Var, int i) {
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if ((intVolatile & 536870911) != 536870911) {
                z6.m("invokeOnCancellation should be called at most once");
                return;
            }
            ja jaVar = this;
            if (unsafe.compareAndSwapInt(jaVar, j2, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                jaVar.u(nj0Var);
                return;
            }
            this = jaVar;
        }
    }

    @Override // defpackage.nj
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ja jaVar;
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof m60) {
                z6.m("Not completed");
                return;
            }
            if (objectVolatile instanceof hd) {
                return;
            }
            if (objectVolatile instanceof fd) {
                fd fdVar = (fd) objectVolatile;
                if (fdVar.e != null) {
                    z6.m("Must be called at most once");
                    return;
                }
                fd a = fd.a(fdVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    ja jaVar2 = this;
                    if (unsafe2.compareAndSwapObject(jaVar2, l, objectVolatile, a)) {
                        fa faVar = fdVar.b;
                        if (faVar != null) {
                            jaVar2.k(faVar, cancellationException);
                        }
                        uq uqVar = fdVar.c;
                        if (uqVar != null) {
                            jaVar2.l(uqVar, cancellationException, fdVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(jaVar2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        jaVar = jaVar2;
                        break;
                    }
                    this = jaVar2;
                }
            } else {
                ja jaVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                fd fdVar2 = new fd(objectVolatile, (fa) null, (uq) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    fd fdVar3 = fdVar2;
                    Unsafe unsafe3 = p7.a;
                    jaVar = jaVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(jaVar, l, objectVolatile, fdVar3);
                    fdVar2 = fdVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(jaVar, j2) != objectVolatile) {
                        break;
                    } else {
                        jaVar3 = jaVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = jaVar;
        }
    }

    @Override // defpackage.nj
    public final ng d() {
        return this.h;
    }

    @Override // defpackage.nj
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.nj
    public final Object f(Object obj) {
        return obj instanceof fd ? ((fd) obj).a : obj;
    }

    @Override // defpackage.eh
    public final eh getCallerFrame() {
        ng ngVar = this.h;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.i;
    }

    @Override // defpackage.ha
    public final mm h(Object obj, uq uqVar) {
        ja jaVar;
        mm mmVar = kw.e;
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof m60)) {
                return null;
            }
            Object C = C((m60) objectVolatile, obj, this.g, uqVar);
            while (true) {
                Unsafe unsafe2 = p7.a;
                jaVar = this;
                if (unsafe2.compareAndSwapObject(jaVar, l, objectVolatile, C)) {
                    if (!jaVar.w()) {
                        jaVar.n();
                    }
                    return mmVar;
                }
                if (unsafe2.getObjectVolatile(jaVar, j2) != objectVolatile) {
                    break;
                }
                this = jaVar;
            }
            this = jaVar;
        }
    }

    @Override // defpackage.ha
    public final boolean i(Throwable th) {
        ja jaVar;
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof m60)) {
                return false;
            }
            la laVar = new la(this, th, (objectVolatile instanceof fa) || (objectVolatile instanceof nj0));
            while (true) {
                Unsafe unsafe2 = p7.a;
                jaVar = this;
                if (unsafe2.compareAndSwapObject(jaVar, l, objectVolatile, laVar)) {
                    m60 m60Var = (m60) objectVolatile;
                    if (m60Var instanceof fa) {
                        jaVar.k((fa) objectVolatile, th);
                    } else if (m60Var instanceof nj0) {
                        jaVar.m((nj0) objectVolatile, th);
                    }
                    if (!jaVar.w()) {
                        jaVar.n();
                    }
                    jaVar.o(jaVar.g);
                    return true;
                }
                if (unsafe2.getObjectVolatile(jaVar, j2) != objectVolatile) {
                    break;
                }
                this = jaVar;
            }
            this = jaVar;
        }
    }

    @Override // defpackage.nj
    public final Object j() {
        return q();
    }

    public final void k(fa faVar, Throwable th) {
        try {
            switch (faVar.a) {
                case 0:
                    ((pq) faVar.b).invoke(th);
                    break;
                default:
                    ((tj) faVar.b).b();
                    break;
            }
        } catch (Throwable th2) {
            lw.w(this.i, new id("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(uq uqVar, Throwable th, Object obj) {
        tg tgVar = this.i;
        try {
            uqVar.c(th, obj, tgVar);
        } catch (Throwable th2) {
            lw.w(tgVar, new id("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(nj0 nj0Var, Throwable th) {
        tg tgVar = this.i;
        int intVolatile = p7.a.getIntVolatile(this, j) & 536870911;
        if (intVolatile == 536870911) {
            z6.m("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nj0Var.g(intVolatile, tgVar);
        } catch (Throwable th2) {
            lw.w(tgVar, new id("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        Unsafe unsafe = p7.a;
        long j2 = k;
        tj tjVar = (tj) unsafe.getObjectVolatile(this, j2);
        if (tjVar == null) {
            return;
        }
        tjVar.b();
        unsafe.putObjectVolatile(this, j2, i60.e);
    }

    public final void o(int i) {
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    z6.m("Already resumed");
                    return;
                }
                boolean z = i == 4;
                ng ngVar = this.h;
                if (!z && (ngVar instanceof lj)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.g;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        lj ljVar = (lj) ngVar;
                        vg vgVar = ljVar.h;
                        tg context = ljVar.i.getContext();
                        if (vgVar.i(context)) {
                            vgVar.h(context, this);
                            return;
                        }
                        en a = gq0.a();
                        if (a.g >= 4294967296L) {
                            a.u(this);
                            return;
                        }
                        a.v(true);
                        try {
                            lw.A(this, ngVar, true);
                            do {
                            } while (a.x());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                lw.A(this, ngVar, z);
                return;
            }
            ja jaVar = this;
            if (unsafe.compareAndSwapInt(jaVar, j2, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = jaVar;
            }
        }
    }

    public final Object p() {
        ww wwVar;
        boolean w = w();
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    z6.m("Already suspended");
                    return null;
                }
                if (w) {
                    this.y();
                }
                Object q = this.q();
                if (q instanceof hd) {
                    throw ((hd) q).a;
                }
                int i2 = this.g;
                if ((i2 != 1 && i2 != 2) || (wwVar = (ww) this.i.j(b2.N)) == null || wwVar.a()) {
                    return this.f(q);
                }
                CancellationException l2 = wwVar.l();
                this.c(l2);
                throw l2;
            }
            ja jaVar = this;
            if (unsafe.compareAndSwapInt(jaVar, j2, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((tj) unsafe.getObjectVolatile(jaVar, k)) == null) {
                    jaVar.s();
                }
                if (w) {
                    jaVar.y();
                }
                return dh.e;
            }
            this = jaVar;
        }
    }

    public final Object q() {
        return p7.a.getObjectVolatile(this, l);
    }

    public final void r() {
        tj s = s();
        if (s == null || (q() instanceof m60)) {
            return;
        }
        s.b();
        p7.a.putObjectVolatile(this, k, i60.e);
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        Throwable a = rf0.a(obj);
        if (a != null) {
            obj = new hd(a, false);
        }
        A(obj, this.g, null);
    }

    public final tj s() {
        ww wwVar = (ww) this.i.j(b2.N);
        if (wwVar == null) {
            return null;
        }
        tj y = q3.y(wwVar, true, new fb(this));
        while (true) {
            Unsafe unsafe = p7.a;
            long j2 = k;
            ja jaVar = this;
            if (!unsafe.compareAndSwapObject(jaVar, j2, (Object) null, y) && unsafe.getObjectVolatile(jaVar, j2) == null) {
                this = jaVar;
            }
        }
        return y;
    }

    public final void t(pq pqVar) {
        u(new fa(0, pqVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(nh.i0(this.h));
        sb.append("){");
        Object q = q();
        sb.append(q instanceof m60 ? "Active" : q instanceof la ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(nh.y(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        x(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(m60 m60Var) {
        m60 m60Var2;
        ja jaVar;
        ja jaVar2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = p7.a;
            long j2 = l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof r1) {
                while (true) {
                    Unsafe unsafe3 = p7.a;
                    ja jaVar3 = this;
                    m60 m60Var3 = m60Var;
                    jaVar = jaVar3;
                    m60Var2 = m60Var3;
                    if (unsafe3.compareAndSwapObject(jaVar3, l, objectVolatile, m60Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(jaVar, j2) != objectVolatile) {
                        break;
                    }
                    this = jaVar;
                    m60Var = m60Var2;
                }
            } else {
                m60Var2 = m60Var;
                jaVar = this;
                if ((objectVolatile instanceof fa) || (objectVolatile instanceof nj0)) {
                    break;
                }
                if (objectVolatile instanceof hd) {
                    hd hdVar = (hd) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(hdVar, hd.b, 0, 1)) {
                        x(m60Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof la) {
                        Throwable th = hdVar.a;
                        if (m60Var2 instanceof fa) {
                            jaVar.k((fa) m60Var2, th);
                            return;
                        } else {
                            jaVar.m((nj0) m60Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof fd) {
                    fd fdVar = (fd) objectVolatile;
                    if (fdVar.b != null) {
                        x(m60Var2, objectVolatile);
                        throw null;
                    }
                    if (m60Var2 instanceof nj0) {
                        return;
                    }
                    fa faVar = (fa) m60Var2;
                    Throwable th2 = fdVar.e;
                    if (th2 != null) {
                        jaVar.k(faVar, th2);
                        return;
                    }
                    fd a = fd.a(fdVar, faVar, null, 29);
                    do {
                        unsafe = p7.a;
                        if (unsafe.compareAndSwapObject(jaVar, l, objectVolatile, a)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(jaVar, j2) == objectVolatile);
                } else {
                    if (m60Var2 instanceof nj0) {
                        return;
                    }
                    fd fdVar2 = new fd(objectVolatile, (fa) m60Var2, (uq) null, (Throwable) null, 28);
                    while (true) {
                        fd fdVar3 = fdVar2;
                        Unsafe unsafe4 = p7.a;
                        jaVar2 = jaVar;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(jaVar2, l, objectVolatile, fdVar3);
                        fdVar2 = fdVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(jaVar2, j2) != objectVolatile) {
                            break;
                        } else {
                            jaVar = jaVar2;
                        }
                    }
                    this = jaVar2;
                    m60Var = m60Var2;
                }
            }
            jaVar2 = jaVar;
            this = jaVar2;
            m60Var = m60Var2;
        }
    }

    @Override // defpackage.ha
    public final void v(Object obj) {
        o(this.g);
    }

    public final boolean w() {
        if (this.g == 2) {
            return p7.a.getObjectVolatile((lj) this.h, lj.l) != null;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.n();
        r9.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        ja jaVar;
        Unsafe unsafe;
        ng ngVar = this.h;
        Throwable th = null;
        lj ljVar = ngVar instanceof lj ? (lj) ngVar : null;
        if (ljVar == null) {
            return;
        }
        long j2 = lj.l;
        loop0: while (true) {
            Object objectVolatile = p7.a.getObjectVolatile(ljVar, j2);
            mm mmVar = dx0.d;
            if (objectVolatile != mmVar) {
                jaVar = this;
                if (!(objectVolatile instanceof Throwable)) {
                    z6.e(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = p7.a;
                    if (unsafe.compareAndSwapObject(ljVar, lj.l, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(ljVar, j2) == objectVolatile);
                z6.l("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = p7.a;
                ja jaVar2 = this;
                jaVar = jaVar2;
                if (unsafe2.compareAndSwapObject(ljVar, lj.l, mmVar, jaVar2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(ljVar, j2) != mmVar) {
                    break;
                } else {
                    this = jaVar;
                }
            }
            this = jaVar;
        }
    }

    public final void z(Object obj, uq uqVar) {
        A(obj, this.g, uqVar);
    }
}
