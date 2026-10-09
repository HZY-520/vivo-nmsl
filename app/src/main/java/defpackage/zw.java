package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class zw extends m00 implements tj, fu {
    public cx h;

    @Override // defpackage.fu
    public final boolean a() {
        return true;
    }

    @Override // defpackage.tj
    public final void b() {
        zw zwVar;
        Unsafe unsafe;
        long j;
        cx l = l();
        while (true) {
            Object J = l.J();
            if (J instanceof zw) {
                if (J != this) {
                    return;
                }
                pm pmVar = dx0.r;
                do {
                    unsafe = p7.a;
                    j = cx.f;
                    if (unsafe.compareAndSwapObject(l, j, J, pmVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(l, j) == J);
            } else {
                if (!(J instanceof fu) || ((fu) J).d() == null) {
                    return;
                }
                while (true) {
                    Object h = this.h();
                    if (h instanceof ef0) {
                        return;
                    }
                    if (h == this) {
                        return;
                    }
                    h.getClass();
                    m00 m00Var = (m00) h;
                    Unsafe unsafe2 = p7.a;
                    long j2 = m00.g;
                    ef0 ef0Var = (ef0) unsafe2.getObjectVolatile(m00Var, j2);
                    if (ef0Var == null) {
                        ef0Var = new ef0(m00Var);
                        unsafe2.putObjectVolatile(m00Var, j2, ef0Var);
                    }
                    ef0 ef0Var2 = ef0Var;
                    while (true) {
                        Unsafe unsafe3 = p7.a;
                        long j3 = m00.e;
                        zwVar = this;
                        if (unsafe3.compareAndSwapObject(zwVar, j3, h, ef0Var2)) {
                            m00Var.f();
                            return;
                        } else if (unsafe3.getObjectVolatile(zwVar, j3) != h) {
                            break;
                        } else {
                            this = zwVar;
                        }
                    }
                    this = zwVar;
                }
            }
        }
    }

    @Override // defpackage.fu
    public final f60 d() {
        return null;
    }

    public ww getParent() {
        return l();
    }

    public final cx l() {
        cx cxVar = this.h;
        if (cxVar != null) {
            return cxVar;
        }
        lw.E("job");
        throw null;
    }

    public abstract boolean m();

    public abstract void n(Throwable th);

    @Override // defpackage.m00
    public final String toString() {
        return getClass().getSimpleName() + '@' + nh.y(this) + "[job@" + nh.y(l()) + ']';
    }
}
