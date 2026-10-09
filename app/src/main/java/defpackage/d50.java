package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class d50 extends gk0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d50.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long i = p7.a.objectFieldOffset(d50.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = t10.i;

    public final Object c(go0 go0Var) {
        d50 d50Var;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = gk0.e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > 1) {
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    long j2 = gk0.e;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    if (intVolatile2 <= 1) {
                        d50Var = this;
                        break;
                    }
                    d50 d50Var2 = this;
                    d50Var = d50Var2;
                    if (unsafe2.compareAndSwapInt(d50Var2, j2, intVolatile2, 1)) {
                        break;
                    }
                    this = d50Var;
                }
            } else {
                d50Var = this;
                fs0 fs0Var = fs0.a;
                if (intVolatile <= 0) {
                    ja t = lr0.t(lr0.x(go0Var));
                    try {
                        d50Var.a(new c50(d50Var, t));
                        Object p = t.p();
                        dh dhVar = dh.e;
                        if (p != dhVar) {
                            p = fs0Var;
                        }
                        return p == dhVar ? p : fs0Var;
                    } catch (Throwable th) {
                        t.y();
                        throw th;
                    }
                }
                if (unsafe.compareAndSwapInt(d50Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(d50Var, i, (Object) null);
                    return fs0Var;
                }
            }
            this = d50Var;
        }
    }

    public final void d(Object obj) {
        while (true) {
            Unsafe unsafe = p7.a;
            if (Math.max(unsafe.getIntVolatile(this, gk0.e), 0) != 0) {
                z6.m("This mutex is not locked");
                return;
            }
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            mm mmVar = t10.i;
            if (objectVolatile != mmVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    d50 d50Var = this;
                    if (unsafe2.compareAndSwapObject(d50Var, i, objectVolatile, mmVar)) {
                        d50Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(d50Var, j) != objectVolatile) {
                            this = d50Var;
                            break;
                        }
                        this = d50Var;
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(nh.y(this));
        sb.append("[isLocked=");
        Unsafe unsafe = p7.a;
        sb.append(Math.max(unsafe.getIntVolatile(this, gk0.e), 0) == 0);
        sb.append(",owner=");
        sb.append(unsafe.getObjectVolatile(this, i));
        sb.append(']');
        return sb.toString();
    }
}
