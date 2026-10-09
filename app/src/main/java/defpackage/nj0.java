package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nj0 extends pf implements m60 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(nj0.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = p7.a.objectFieldOffset(nj0.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public nj0(long j, nj0 nj0Var, int i) {
        super(nj0Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.pf
    public final boolean c() {
        return p7.a.getIntVolatile(this, f) == f() && b() != null;
    }

    public final boolean e() {
        return e.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, tg tgVar);

    public final void h() {
        if (e.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        while (true) {
            Unsafe unsafe = p7.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.f() && this.b() != null) {
                return false;
            }
            nj0 nj0Var = this;
            if (unsafe.compareAndSwapInt(nj0Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = nj0Var;
        }
    }
}
