package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class n00 {
    public static final /* synthetic */ long a = p7.a.objectFieldOffset(n00.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new p00(8, false);

    public final boolean a(Runnable runnable) {
        n00 n00Var;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = a;
            p00 p00Var = (p00) unsafe.getObjectVolatile(this, j);
            int a2 = p00Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                p00 c = p00Var.c();
                while (true) {
                    Unsafe unsafe2 = p7.a;
                    n00Var = this;
                    if (!unsafe2.compareAndSwapObject(n00Var, a, p00Var, c) && unsafe2.getObjectVolatile(n00Var, j) == p00Var) {
                        this = n00Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                n00Var = this;
            }
            this = n00Var;
        }
    }

    public final void b() {
        n00 n00Var;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = a;
            p00 p00Var = (p00) unsafe.getObjectVolatile(this, j);
            if (p00Var.b()) {
                return;
            }
            p00 c = p00Var.c();
            while (true) {
                n00Var = this;
                if (!p7.a.compareAndSwapObject(n00Var, a, p00Var, c) && p7.a.getObjectVolatile(n00Var, j) == p00Var) {
                    this = n00Var;
                }
            }
            this = n00Var;
        }
    }

    public final int c() {
        p00 p00Var = (p00) p7.a.getObjectVolatile(this, a);
        p00Var.getClass();
        long longVolatile = p7.a.getLongVolatile(p00Var, p00.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        n00 n00Var;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = a;
            p00 p00Var = (p00) unsafe.getObjectVolatile(this, j);
            Object d = p00Var.d();
            if (d != p00.e) {
                return d;
            }
            p00 c = p00Var.c();
            while (true) {
                n00Var = this;
                if (!p7.a.compareAndSwapObject(n00Var, a, p00Var, c) && p7.a.getObjectVolatile(n00Var, j) == p00Var) {
                    this = n00Var;
                }
            }
            this = n00Var;
        }
    }
}
