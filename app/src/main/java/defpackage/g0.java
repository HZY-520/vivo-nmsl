package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g0 extends nh {
    @Override // defpackage.nh
    public final void P(h0 h0Var, h0 h0Var2) {
        h0Var.b = h0Var2;
    }

    @Override // defpackage.nh
    public final void Q(h0 h0Var, Thread thread) {
        h0Var.a = thread;
    }

    @Override // defpackage.nh
    public final boolean k(i0 i0Var, e0 e0Var) {
        e0 e0Var2 = e0.b;
        synchronized (i0Var) {
            try {
                if (i0Var.f != e0Var) {
                    return false;
                }
                i0Var.f = e0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nh
    public final boolean l(i0 i0Var, Object obj, Object obj2) {
        synchronized (i0Var) {
            try {
                if (i0Var.e != obj) {
                    return false;
                }
                i0Var.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nh
    public final boolean m(i0 i0Var, h0 h0Var, h0 h0Var2) {
        synchronized (i0Var) {
            try {
                if (i0Var.g != h0Var) {
                    return false;
                }
                i0Var.g = h0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
