package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class cx implements ww {
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = p7.a;
        f = unsafe.objectFieldOffset(cx.class.getDeclaredField("_state$volatile"));
        e = unsafe.objectFieldOffset(cx.class.getDeclaredField("_parentHandle$volatile"));
    }

    public cx(boolean z) {
        this._state$volatile = z ? dx0.r : dx0.q;
    }

    public static hb R(m00 m00Var) {
        while (m00Var.k()) {
            m00Var = m00Var.j();
        }
        while (true) {
            m00Var = m00Var.i();
            if (!m00Var.k()) {
                if (m00Var instanceof hb) {
                    return (hb) m00Var;
                }
                if (m00Var instanceof f60) {
                    return null;
                }
            }
        }
    }

    public static String Y(Object obj) {
        if (!(obj instanceof bx)) {
            return obj instanceof fu ? ((fu) obj).a() ? "Active" : "New" : obj instanceof hd ? "Cancelled" : "Completed";
        }
        bx bxVar = (bx) obj;
        return bxVar.e() ? "Cancelling" : bxVar.f() ? "Completing" : "Active";
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && G();
    }

    public final void C(fu fuVar, Object obj) {
        Unsafe unsafe = p7.a;
        long j = e;
        gb gbVar = (gb) unsafe.getObjectVolatile(this, j);
        if (gbVar != null) {
            gbVar.b();
            unsafe.putObjectVolatile(this, j, i60.e);
        }
        id idVar = null;
        hd hdVar = obj instanceof hd ? (hd) obj : null;
        Throwable th = hdVar != null ? hdVar.a : null;
        if (fuVar instanceof zw) {
            try {
                ((zw) fuVar).n(th);
                return;
            } catch (Throwable th2) {
                L(new id("Exception in completion handler " + fuVar + " for " + this, th2));
                return;
            }
        }
        f60 d = fuVar.d();
        if (d != null) {
            d.e(new b00(1), 1);
            Object h = d.h();
            h.getClass();
            for (m00 m00Var = (m00) h; !m00Var.equals(d); m00Var = m00Var.i()) {
                if (m00Var instanceof zw) {
                    try {
                        ((zw) m00Var).n(th);
                    } catch (Throwable th3) {
                        if (idVar != null) {
                            lw.h(idVar, th3);
                        } else {
                            idVar = new id("Exception in completion handler " + m00Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (idVar != null) {
                L(idVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable D(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        cx cxVar = (cx) obj;
        Object J = cxVar.J();
        if (J instanceof bx) {
            cancellationException = ((bx) J).c();
        } else if (J instanceof hd) {
            cancellationException = ((hd) J).a;
        } else {
            if (J instanceof fu) {
                z6.e(J, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new xw("Parent job is ".concat(Y(J)), cancellationException, cxVar) : cancellationException2;
    }

    public final Object E(bx bxVar, Object obj) {
        bx bxVar2;
        Throwable th;
        Throwable F;
        cx cxVar;
        bx bxVar3;
        hd hdVar = obj instanceof hd ? (hd) obj : null;
        Throwable th2 = hdVar != null ? hdVar.a : null;
        synchronized (bxVar) {
            try {
                bxVar.e();
                ArrayList g = bxVar.g(th2);
                F = F(bxVar, g);
                if (F != null) {
                    try {
                        if (g.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                            int size = g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != F && th3 != F && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    lw.h(F, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bxVar2 = bxVar;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                bxVar2 = bxVar;
                th = th5;
            }
        }
        if (F != null && F != th2) {
            obj = new hd(F, false);
        }
        if (F != null && (z(F) || K(F))) {
            obj.getClass();
            p7.a.compareAndSwapInt((hd) obj, hd.b, 0, 1);
        }
        T(obj);
        Object guVar = obj instanceof fu ? new gu((fu) obj) : obj;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = f;
            cxVar = this;
            bxVar3 = bxVar;
            if (!unsafe.compareAndSwapObject(cxVar, j, bxVar3, guVar) && unsafe.getObjectVolatile(cxVar, j) == bxVar3) {
                this = cxVar;
                bxVar = bxVar3;
            }
        }
        cxVar.C(bxVar3, obj);
        return obj;
    }

    public final Throwable F(bx bxVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (bxVar.e()) {
                return new xw(A(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof nq0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof nq0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean G() {
        return true;
    }

    public boolean H() {
        return false;
    }

    public final f60 I(fu fuVar) {
        f60 d = fuVar.d();
        if (d != null) {
            return d;
        }
        if (fuVar instanceof pm) {
            return new f60();
        }
        if (fuVar instanceof zw) {
            W((zw) fuVar);
            return null;
        }
        z6.e(fuVar, "State should have list: ");
        return null;
    }

    public final Object J() {
        return p7.a.getObjectVolatile(this, f);
    }

    public boolean K(Throwable th) {
        return false;
    }

    public final void M(ww wwVar) {
        long j = e;
        i60 i60Var = i60.e;
        if (wwVar == null) {
            p7.a.putObjectVolatile(this, j, i60Var);
            return;
        }
        wwVar.d();
        gb f2 = wwVar.f(this);
        Unsafe unsafe = p7.a;
        unsafe.putObjectVolatile(this, j, f2);
        if (J() instanceof fu) {
            return;
        }
        f2.b();
        unsafe.putObjectVolatile(this, j, i60Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tj N(boolean z, zw zwVar) {
        cx cxVar;
        zw zwVar2;
        i60 i60Var;
        boolean e2;
        zwVar.h = this;
        loop0: while (true) {
            Object J = this.J();
            if (J instanceof pm) {
                pm pmVar = (pm) J;
                if (pmVar.e) {
                    while (true) {
                        Unsafe unsafe = p7.a;
                        long j = f;
                        cxVar = this;
                        zwVar2 = zwVar;
                        if (unsafe.compareAndSwapObject(cxVar, j, J, zwVar2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(cxVar, j) != J) {
                            break;
                        }
                        this = cxVar;
                        zwVar = zwVar2;
                    }
                } else {
                    cxVar = this;
                    zwVar2 = zwVar;
                    cxVar.V(pmVar);
                }
                this = cxVar;
                zwVar = zwVar2;
            } else {
                cxVar = this;
                zwVar2 = zwVar;
                boolean z2 = J instanceof fu;
                i60Var = i60.e;
                if (z2) {
                    fu fuVar = (fu) J;
                    f60 d = fuVar.d();
                    if (d == null) {
                        cxVar.W((zw) J);
                    } else {
                        if (zwVar2.m()) {
                            bx bxVar = fuVar instanceof bx ? (bx) fuVar : null;
                            Throwable c = bxVar != null ? bxVar.c() : null;
                            if (c == null) {
                                e2 = d.e(zwVar2, 5);
                            } else if (z) {
                                zwVar2.n(c);
                                return i60Var;
                            }
                        } else {
                            e2 = d.e(zwVar2, 1);
                        }
                        if (e2) {
                            break;
                        }
                    }
                    this = cxVar;
                    zwVar = zwVar2;
                } else if (z) {
                    Object J2 = cxVar.J();
                    hd hdVar = J2 instanceof hd ? (hd) J2 : null;
                    zwVar2.n(hdVar != null ? hdVar.a : null);
                }
            }
        }
        return i60Var;
    }

    public boolean O() {
        return this instanceof m8;
    }

    public final Object P(Object obj) {
        Object Z;
        do {
            Z = Z(J(), obj);
            if (Z == dx0.l) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                hd hdVar = obj instanceof hd ? (hd) obj : null;
                throw new IllegalStateException(str, hdVar != null ? hdVar.a : null);
            }
        } while (Z == dx0.n);
        return Z;
    }

    public String Q() {
        return getClass().getSimpleName();
    }

    public final void S(f60 f60Var, Throwable th) {
        f60Var.e(new b00(4), 4);
        Object h = f60Var.h();
        h.getClass();
        id idVar = null;
        for (m00 m00Var = (m00) h; !m00Var.equals(f60Var); m00Var = m00Var.i()) {
            if ((m00Var instanceof zw) && ((zw) m00Var).m()) {
                try {
                    ((zw) m00Var).n(th);
                } catch (Throwable th2) {
                    if (idVar != null) {
                        lw.h(idVar, th2);
                    } else {
                        idVar = new id("Exception in completion handler " + m00Var + " for " + this, th2);
                    }
                }
            }
        }
        if (idVar != null) {
            L(idVar);
        }
        z(th);
    }

    public final void V(pm pmVar) {
        f60 f60Var = new f60();
        Object euVar = pmVar.e ? f60Var : new eu(f60Var);
        while (true) {
            Unsafe unsafe = p7.a;
            long j = f;
            cx cxVar = this;
            pm pmVar2 = pmVar;
            if (unsafe.compareAndSwapObject(cxVar, j, pmVar2, euVar) || unsafe.getObjectVolatile(cxVar, j) != pmVar2) {
                return;
            }
            this = cxVar;
            pmVar = pmVar2;
        }
    }

    public final void W(zw zwVar) {
        zw zwVar2;
        cx cxVar;
        f60 f60Var = new f60();
        Unsafe unsafe = p7.a;
        unsafe.putObjectVolatile(f60Var, m00.f, zwVar);
        long j = m00.e;
        unsafe.putObjectVolatile(f60Var, j, zwVar);
        loop0: while (true) {
            if (zwVar.h() != zwVar) {
                zwVar2 = zwVar;
                break;
            }
            while (true) {
                Unsafe unsafe2 = p7.a;
                zwVar2 = zwVar;
                if (unsafe2.compareAndSwapObject(zwVar2, m00.e, zwVar, f60Var)) {
                    f60Var.g(zwVar2);
                    break loop0;
                }
                cxVar = this;
                zwVar = zwVar2;
                if (unsafe2.getObjectVolatile(zwVar2, j) != zwVar2) {
                    break;
                } else {
                    this = cxVar;
                }
            }
            this = cxVar;
        }
        m00 i = zwVar2.i();
        while (true) {
            Unsafe unsafe3 = p7.a;
            long j2 = f;
            cx cxVar2 = this;
            if (unsafe3.compareAndSwapObject(cxVar2, j2, zwVar2, i) || unsafe3.getObjectVolatile(cxVar2, j2) != zwVar2) {
                return;
            } else {
                this = cxVar2;
            }
        }
    }

    public final int X(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof pm;
        long j = f;
        if (z) {
            if (((pm) obj).e) {
                return 0;
            }
            pm pmVar = dx0.r;
            do {
                unsafe2 = p7.a;
                if (unsafe2.compareAndSwapObject(this, f, obj, pmVar)) {
                    U();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof eu)) {
            return 0;
        }
        f60 f60Var = ((eu) obj).e;
        do {
            unsafe = p7.a;
            if (unsafe.compareAndSwapObject(this, f, obj, f60Var)) {
                U();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object Z(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof fu)) {
            return dx0.l;
        }
        if ((!(obj instanceof pm) && !(obj instanceof zw)) || (obj instanceof hb) || (obj2 instanceof hd)) {
            cx cxVar = this;
            fu fuVar = (fu) obj;
            f60 I = cxVar.I(fuVar);
            if (I == null) {
                return dx0.n;
            }
            bx bxVar = fuVar instanceof bx ? (bx) fuVar : null;
            if (bxVar == null) {
                bxVar = new bx(I, null);
            }
            bx bxVar2 = bxVar;
            synchronized (bxVar2) {
                if (bxVar2.f()) {
                    return dx0.l;
                }
                p7.a.putIntVolatile(bxVar2, bx.g, 1);
                if (bxVar2 != fuVar) {
                    do {
                        unsafe = p7.a;
                        j = f;
                        cx cxVar2 = cxVar;
                        cxVar = cxVar2;
                        if (unsafe.compareAndSwapObject(cxVar2, j, fuVar, bxVar2)) {
                        }
                    } while (unsafe.getObjectVolatile(cxVar, j) == fuVar);
                    return dx0.n;
                }
                boolean e2 = bxVar2.e();
                hd hdVar = obj2 instanceof hd ? (hd) obj2 : null;
                if (hdVar != null) {
                    bxVar2.b(hdVar.a);
                }
                Throwable c = e2 ? null : bxVar2.c();
                if (c != null) {
                    cxVar.S(I, c);
                }
                hb R = R(I);
                if (R != null && cxVar.a0(bxVar2, R, obj2)) {
                    return dx0.m;
                }
                I.e(new b00(2), 2);
                hb R2 = R(I);
                return (R2 == null || !cxVar.a0(bxVar2, R2, obj2)) ? cxVar.E(bxVar2, obj2) : dx0.m;
            }
        }
        fu fuVar2 = (fu) obj;
        Object guVar = obj2 instanceof fu ? new gu((fu) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = p7.a;
            long j2 = f;
            cx cxVar3 = this;
            if (unsafe2.compareAndSwapObject(cxVar3, j2, fuVar2, guVar)) {
                cxVar3.T(obj2);
                cxVar3.C(fuVar2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(cxVar3, j2) != fuVar2) {
                return dx0.n;
            }
            this = cxVar3;
        }
    }

    @Override // defpackage.ww
    public boolean a() {
        Object J = J();
        return (J instanceof fu) && ((fu) J).a();
    }

    public final boolean a0(bx bxVar, hb hbVar, Object obj) {
        while (q3.y(hbVar.i, false, new ax(this, bxVar, hbVar, obj)) == i60.e) {
            hbVar = R(hbVar);
            if (hbVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ww
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new xw(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // defpackage.ww
    public final boolean d() {
        int X;
        do {
            X = X(J());
            if (X == 0) {
                return false;
            }
        } while (X != 1);
        return true;
    }

    @Override // defpackage.ww
    public final gb f(cx cxVar) {
        cx cxVar2;
        hb hbVar = new hb(cxVar);
        hbVar.h = this;
        loop0: while (true) {
            Object J = this.J();
            if (J instanceof pm) {
                pm pmVar = (pm) J;
                if (pmVar.e) {
                    while (true) {
                        Unsafe unsafe = p7.a;
                        long j = f;
                        cxVar2 = this;
                        if (unsafe.compareAndSwapObject(cxVar2, j, J, hbVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(cxVar2, j) != J) {
                            break;
                        }
                        this = cxVar2;
                    }
                } else {
                    cxVar2 = this;
                    cxVar2.V(pmVar);
                }
                this = cxVar2;
            } else {
                cxVar2 = this;
                boolean z = J instanceof fu;
                i60 i60Var = i60.e;
                if (!z) {
                    Object J2 = cxVar2.J();
                    hd hdVar = J2 instanceof hd ? (hd) J2 : null;
                    hbVar.n(hdVar != null ? hdVar.a : null);
                    return i60Var;
                }
                f60 d = ((fu) J).d();
                if (d == null) {
                    cxVar2.W((zw) J);
                    this = cxVar2;
                } else if (!d.e(hbVar, 7)) {
                    boolean e2 = d.e(hbVar, 3);
                    Object J3 = cxVar2.J();
                    if (J3 instanceof bx) {
                        r0 = ((bx) J3).c();
                    } else {
                        hd hdVar2 = J3 instanceof hd ? (hd) J3 : null;
                        if (hdVar2 != null) {
                            r0 = hdVar2.a;
                        }
                    }
                    hbVar.n(r0);
                    if (e2) {
                        break loop0;
                    }
                    return i60Var;
                }
            }
        }
        return hbVar;
    }

    @Override // defpackage.tg
    public final tg g(tg tgVar) {
        return q3.H(this, tgVar);
    }

    @Override // defpackage.rg
    public final sg getKey() {
        return b2.N;
    }

    @Override // defpackage.tg
    public final rg j(sg sgVar) {
        return q3.t(this, sgVar);
    }

    @Override // defpackage.ww
    public final CancellationException l() {
        CancellationException cancellationException;
        Object J = J();
        if (J instanceof bx) {
            Throwable c = ((bx) J).c();
            if (c == null) {
                z6.e(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new xw(concat, c, this) : cancellationException;
        }
        if (J instanceof fu) {
            z6.e(this, "Job is still new or active: ");
            return null;
        }
        if (!(J instanceof hd)) {
            return new xw(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((hd) J).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new xw(A(), th, this) : cancellationException;
    }

    @Override // defpackage.tg
    public final Object m(tq tqVar, Object obj) {
        return tqVar.invoke(obj, this);
    }

    @Override // defpackage.ww
    public final tj o(pq pqVar) {
        return N(true, new uw(pqVar));
    }

    @Override // defpackage.tg
    public final tg q(sg sgVar) {
        return q3.C(this, sgVar);
    }

    @Override // defpackage.ww
    public final Object s(og ogVar) {
        Object J;
        fs0 fs0Var;
        do {
            J = J();
            boolean z = J instanceof fu;
            fs0Var = fs0.a;
            if (!z) {
                q3.r(ogVar.getContext());
                return fs0Var;
            }
        } while (X(J) < 0);
        ja jaVar = new ja(1, lr0.x(ogVar));
        jaVar.r();
        jaVar.u(new fa(1, q3.y(this, true, new sf0(jaVar))));
        Object p = jaVar.p();
        dh dhVar = dh.e;
        if (p != dhVar) {
            p = fs0Var;
        }
        return p == dhVar ? p : fs0Var;
    }

    @Override // defpackage.ww
    public final tj t(boolean z, boolean z2, e eVar) {
        return N(z2, z ? new tw(eVar) : new uw(eVar));
    }

    public final String toString() {
        return (Q() + '{' + Y(J()) + '}') + '@' + nh.y(this);
    }

    public void w(Object obj) {
        u(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == defpackage.dx0.m) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(Object obj) {
        cx cxVar;
        mm mmVar;
        Object obj2;
        Object obj3 = dx0.l;
        if (H()) {
            do {
                Object J = J();
                if (!(J instanceof fu) || ((J instanceof bx) && ((bx) J).f())) {
                    obj3 = dx0.l;
                    break;
                }
                obj3 = Z(J, new hd(D(obj), false));
            } while (obj3 == dx0.n);
        }
        if (obj3 == dx0.l) {
            Throwable th = null;
            loop1: while (true) {
                Object J2 = this.J();
                if (!(J2 instanceof bx)) {
                    if (!(J2 instanceof fu)) {
                        cxVar = this;
                        obj2 = dx0.o;
                        break;
                    }
                    if (th == null) {
                        th = this.D(obj);
                    }
                    fu fuVar = (fu) J2;
                    if (fuVar.a()) {
                        f60 I = this.I(fuVar);
                        if (I == null) {
                            cxVar = this;
                        } else {
                            bx bxVar = new bx(I, th);
                            while (true) {
                                Unsafe unsafe = p7.a;
                                long j = f;
                                cxVar = this;
                                if (unsafe.compareAndSwapObject(cxVar, j, fuVar, bxVar)) {
                                    cxVar.S(I, th);
                                    obj2 = dx0.l;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(cxVar, j) != fuVar) {
                                    break;
                                }
                                this = cxVar;
                            }
                        }
                        this = cxVar;
                    } else {
                        cxVar = this;
                        obj2 = cxVar.Z(J2, new hd(th, false));
                        if (obj2 == dx0.l) {
                            z6.e(J2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != dx0.n) {
                            break;
                        }
                        this = cxVar;
                    }
                } else {
                    synchronized (J2) {
                        if (p7.a.getObjectVolatile((bx) J2, bx.f) == dx0.p) {
                            mmVar = dx0.o;
                        } else {
                            boolean e2 = ((bx) J2).e();
                            if (th == null) {
                                th = this.D(obj);
                            }
                            ((bx) J2).b(th);
                            Throwable c = e2 ? null : ((bx) J2).c();
                            if (c != null) {
                                this.S(((bx) J2).e, c);
                            }
                            mmVar = dx0.l;
                        }
                    }
                    cxVar = this;
                    obj3 = mmVar;
                }
            }
            obj3 = obj2;
        } else {
            cxVar = this;
        }
        if (obj3 != dx0.l && obj3 != dx0.m) {
            if (obj3 == dx0.o) {
                return false;
            }
            cxVar.u(obj3);
            return true;
        }
        return true;
    }

    public void y(CancellationException cancellationException) {
        x(cancellationException);
    }

    public final boolean z(Throwable th) {
        if (O()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        gb gbVar = (gb) p7.a.getObjectVolatile(this, e);
        return (gbVar == null || gbVar == i60.e) ? z : gbVar.c(th) || z;
    }

    public void U() {
    }

    public void L(id idVar) {
        throw idVar;
    }

    public void T(Object obj) {
    }

    public void u(Object obj) {
    }
}
