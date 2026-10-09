package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mj extends ji0 {
    public static final /* synthetic */ long i = p7.a.objectFieldOffset(mj.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.ji0, defpackage.cx
    public final void u(Object obj) {
        w(obj);
    }

    @Override // defpackage.ji0, defpackage.cx
    public final void w(Object obj) {
        while (true) {
            Unsafe unsafe = p7.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    dx0.C(lr0.x(this.h), nh.X(obj));
                    return;
                } else {
                    z6.m("Already resumed");
                    return;
                }
            }
            mj mjVar = this;
            if (unsafe.compareAndSwapInt(mjVar, j, 0, 2)) {
                return;
            } else {
                this = mjVar;
            }
        }
    }
}
