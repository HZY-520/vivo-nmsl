package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class pf {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = p7.a;
        a = unsafe.objectFieldOffset(pf.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(pf.class.getDeclaredField("_prev$volatile"));
    }

    public pf(nj0 nj0Var) {
        this._prev$volatile = nj0Var;
    }

    public final void a() {
        p7.a.putObjectVolatile(this, b, (Object) null);
    }

    public final pf b() {
        Object objectVolatile = p7.a.getObjectVolatile(this, a);
        if (objectVolatile == kw.f) {
            return null;
        }
        return (pf) objectVolatile;
    }

    public abstract boolean c();

    public final void d() {
        pf pfVar;
        Unsafe unsafe;
        if (b() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = p7.a;
            long j = b;
            pf pfVar2 = (pf) unsafe2.getObjectVolatile(this, j);
            while (pfVar2 != null && pfVar2.c()) {
                pfVar2 = (pf) p7.a.getObjectVolatile(pfVar2, j);
            }
            pf b2 = b();
            b2.getClass();
            do {
                pfVar = b2;
                if (!pfVar.c()) {
                    break;
                } else {
                    b2 = pfVar.b();
                }
            } while (b2 != null);
            while (true) {
                Object objectVolatile = p7.a.getObjectVolatile(pfVar, j);
                pf pfVar3 = ((pf) objectVolatile) == null ? null : pfVar2;
                do {
                    unsafe = p7.a;
                    if (unsafe.compareAndSwapObject(pfVar, b, objectVolatile, pfVar3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(pfVar, j) == objectVolatile);
            }
            if (pfVar2 != null) {
                unsafe.putObjectVolatile(pfVar2, a, pfVar);
            }
            if (!pfVar.c() || pfVar.b() == null) {
                if (pfVar2 == null || !pfVar2.c()) {
                    return;
                }
            }
        }
    }
}
