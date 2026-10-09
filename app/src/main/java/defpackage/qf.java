package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qf extends o9 {
    public final m9 t;

    public qf(int i, m9 m9Var) {
        super(i);
        this.t = m9Var;
        if (m9Var == m9.e) {
            z6.h("This implementation does not support suspension for senders, use ", we0.a(o9.class).b(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        z6.d(j2.h("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Object obj, boolean z) {
        m9 m9Var = this.t;
        m9 m9Var2 = m9.g;
        fs0 fs0Var = fs0.a;
        if (m9Var == m9Var2) {
            Object p = super.p(obj);
            return (!(p instanceof bb) || (p instanceof ab)) ? p : fs0Var;
        }
        Object obj2 = q9.d;
        cb cbVar = (cb) p7.a.getObjectVolatile(this, o9.r);
        while (true) {
            long andIncrement = o9.f.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean t = t(andIncrement, false);
            int i = q9.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (cbVar.d != j3) {
                cb i3 = i(j3, cbVar);
                if (i3 != null) {
                    cbVar = i3;
                } else if (t) {
                    return new ab(o());
                }
            }
            int G = G(cbVar, i2, obj, j, obj2, t);
            if (G == 0) {
                cbVar.a();
                return fs0Var;
            }
            if (G == 1) {
                break;
            }
            if (G != 2) {
                if (G == 3) {
                    z6.m("unexpected");
                    return null;
                }
                if (G == 4) {
                    if (j < m()) {
                        cbVar.a();
                    }
                    return new ab(o());
                }
                if (G == 5) {
                    cbVar.a();
                }
            } else {
                if (t) {
                    cbVar.h();
                    return new ab(o());
                }
                mu0 mu0Var = obj2 instanceof mu0 ? (mu0) obj2 : null;
                if (mu0Var != null) {
                    mu0Var.b(cbVar, i2 + i);
                }
                f((cbVar.d * j2) + i2);
            }
        }
    }

    @Override // defpackage.o9, defpackage.jk0
    public final Object c(ng ngVar, Object obj) {
        if (J(obj, true) instanceof ab) {
            throw o();
        }
        return fs0.a;
    }

    @Override // defpackage.o9, defpackage.jk0
    public final Object p(Object obj) {
        return J(obj, false);
    }

    @Override // defpackage.o9
    public final boolean w() {
        return this.t == m9.f;
    }
}
