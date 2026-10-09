package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fb extends zw {
    public final ja i;

    public fb(ja jaVar) {
        this.i = jaVar;
    }

    @Override // defpackage.zw
    public final boolean m() {
        return true;
    }

    @Override // defpackage.zw
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        CancellationException l = l().l();
        ja jaVar = this.i;
        if (jaVar.w()) {
            lj ljVar = (lj) jaVar.h;
            long j = lj.l;
            loop0: while (true) {
                Object objectVolatile = p7.a.getObjectVolatile(ljVar, j);
                mm mmVar = dx0.d;
                if (lw.i(objectVolatile, mmVar)) {
                    do {
                        unsafe = p7.a;
                        if (unsafe.compareAndSwapObject(ljVar, lj.l, mmVar, l)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ljVar, j) == mmVar);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = p7.a;
                        if (unsafe2.compareAndSwapObject(ljVar, lj.l, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(ljVar, j) == objectVolatile);
                }
            }
        }
        jaVar.i(l);
        if (jaVar.w()) {
            return;
        }
        jaVar.n();
    }
}
