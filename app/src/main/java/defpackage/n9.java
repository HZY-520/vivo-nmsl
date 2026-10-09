package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n9 implements mu0 {
    public Object e = q9.p;
    public ja f;
    public final /* synthetic */ o9 g;

    public n9(o9 o9Var) {
        this.g = o9Var;
    }

    public final Object a(og ogVar) {
        cb cbVar;
        Object obj = this.e;
        boolean z = true;
        if (obj == q9.p || obj == q9.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o9.j;
            o9 o9Var = this.g;
            cb cbVar2 = (cb) atomicReferenceFieldUpdater.get(o9Var);
            while (true) {
                if (o9Var.u()) {
                    this.e = q9.l;
                    Throwable k = o9Var.k();
                    if (k != null) {
                        int i = vm0.a;
                        throw k;
                    }
                    z = false;
                } else {
                    long andIncrement = o9.g.getAndIncrement(o9Var);
                    long j = q9.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (cbVar2.d != j2) {
                        cbVar = o9Var.h(j2, cbVar2);
                        if (cbVar == null) {
                            continue;
                        }
                    } else {
                        cbVar = cbVar2;
                    }
                    Object F = o9Var.F(cbVar, i2, andIncrement, null);
                    mm mmVar = q9.m;
                    if (F == mmVar) {
                        z6.m("unreachable");
                        return null;
                    }
                    mm mmVar2 = q9.o;
                    if (F == mmVar2) {
                        if (andIncrement < o9Var.q()) {
                            cbVar.a();
                        }
                        cbVar2 = cbVar;
                    } else {
                        if (F == q9.n) {
                            o9 o9Var2 = this.g;
                            ja t = lr0.t(lr0.x(ogVar));
                            try {
                                this.f = t;
                                Object F2 = o9Var2.F(cbVar, i2, andIncrement, this);
                                if (F2 == mmVar) {
                                    b(cbVar, i2);
                                } else {
                                    if (F2 == mmVar2) {
                                        if (andIncrement < o9Var2.q()) {
                                            cbVar.a();
                                        }
                                        cb cbVar3 = (cb) o9.j.get(o9Var2);
                                        while (true) {
                                            if (o9Var2.u()) {
                                                ja jaVar = this.f;
                                                jaVar.getClass();
                                                this.f = null;
                                                this.e = q9.l;
                                                Throwable k2 = o9Var.k();
                                                if (k2 == null) {
                                                    jaVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    jaVar.resumeWith(new qf0(k2));
                                                }
                                            } else {
                                                long andIncrement2 = o9.g.getAndIncrement(o9Var2);
                                                long j3 = q9.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (cbVar3.d != j4) {
                                                    cb h = o9Var2.h(j4, cbVar3);
                                                    if (h != null) {
                                                        cbVar3 = h;
                                                    }
                                                }
                                                Object F3 = o9Var2.F(cbVar3, i3, andIncrement2, this);
                                                if (F3 == q9.m) {
                                                    b(cbVar3, i3);
                                                    break;
                                                }
                                                if (F3 == q9.o) {
                                                    if (andIncrement2 < o9Var2.q()) {
                                                        cbVar3.a();
                                                    }
                                                } else {
                                                    if (F3 == q9.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    cbVar3.a();
                                                    this.e = F3;
                                                    this.f = null;
                                                }
                                            }
                                        }
                                    } else {
                                        cbVar.a();
                                        this.e = F2;
                                        this.f = null;
                                    }
                                    t.z(Boolean.TRUE, null);
                                }
                                return t.p();
                            } catch (Throwable th) {
                                t.y();
                                throw th;
                            }
                        }
                        cbVar.a();
                        this.e = F;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mu0
    public final void b(nj0 nj0Var, int i) {
        ja jaVar = this.f;
        if (jaVar != null) {
            jaVar.b(nj0Var, i);
        }
    }

    public final Object c() {
        Object obj = this.e;
        mm mmVar = q9.p;
        if (obj == mmVar) {
            z6.m("`hasNext()` has not been invoked");
            return null;
        }
        this.e = mmVar;
        if (obj != q9.l) {
            return obj;
        }
        Throwable l = this.g.l();
        int i = vm0.a;
        throw l;
    }
}
