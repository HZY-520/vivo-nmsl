package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p5 implements rg {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public p5(p5 p5Var) {
        this.e = 2;
        this.f = p5Var;
        this.g = new qx();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pq pqVar, og ogVar) {
        ta0 ta0Var;
        dh dhVar;
        int i;
        boolean z;
        Object p;
        Object c;
        int i2 = 0;
        int i3 = 1;
        switch (this.e) {
            case 0:
                m5 m5Var = (m5) this.g;
                ja jaVar = new ja(1, lr0.x(ogVar));
                jaVar.r();
                o5 o5Var = new o5(jaVar, this, pqVar);
                if (lw.i(m5Var.g, (Choreographer) this.f)) {
                    synchronized (m5Var.i) {
                        m5Var.k.add(o5Var);
                        if (!m5Var.n) {
                            m5Var.n = true;
                            m5Var.g.postFrameCallback(m5Var.o);
                        }
                    }
                    jaVar.t(new n5(i2, m5Var, o5Var));
                } else {
                    ((Choreographer) this.f).postFrameCallback(o5Var);
                    jaVar.t(new n5(i3, this, o5Var));
                }
                return jaVar.p();
            case 1:
                ja jaVar2 = new ja(1, lr0.x(ogVar));
                jaVar2.r();
                x7 x7Var = (x7) this.g;
                h9 h9Var = new h9();
                h9Var.a = jaVar2;
                h9Var.b = pqVar;
                jaVar2.t(new i9(i2, x7Var.a(h9Var, (ee0) this.f)));
                return jaVar2.p();
            default:
                if (ogVar instanceof ta0) {
                    ta0Var = (ta0) ogVar;
                    int i4 = ta0Var.h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ta0Var.h = i4 - Integer.MIN_VALUE;
                        Object obj = ta0Var.f;
                        dhVar = dh.e;
                        i = ta0Var.h;
                        if (i != 0) {
                            t30.z(obj);
                            qx qxVar = (qx) this.g;
                            ta0Var.e = pqVar;
                            ta0Var.h = 1;
                            synchronized (qxVar.a) {
                                z = qxVar.d;
                            }
                            if (!z) {
                                ja jaVar3 = new ja(1, lr0.x(ta0Var));
                                jaVar3.r();
                                synchronized (qxVar.a) {
                                    qxVar.b.add(jaVar3);
                                }
                                jaVar3.t(new n5(3, qxVar, jaVar3));
                                p = jaVar3.p();
                                if (p != dhVar) {
                                    p = fs0.a;
                                    break;
                                }
                            } else {
                                p = fs0.a;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    t30.z(obj);
                                    return obj;
                                }
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pqVar = ta0Var.e;
                            t30.z(obj);
                        }
                        p5 p5Var = (p5) this.f;
                        ta0Var.e = null;
                        ta0Var.h = 2;
                        c = p5Var.c(pqVar, ta0Var);
                        if (c != dhVar) {
                            return c;
                        }
                        return dhVar;
                    }
                }
                ta0Var = new ta0(this, ogVar);
                Object obj2 = ta0Var.f;
                dhVar = dh.e;
                i = ta0Var.h;
                if (i != 0) {
                }
                p5 p5Var2 = (p5) this.f;
                ta0Var.e = null;
                ta0Var.h = 2;
                c = p5Var2.c(pqVar, ta0Var);
                if (c != dhVar) {
                }
                return dhVar;
        }
    }

    @Override // defpackage.tg
    public final tg g(tg tgVar) {
        switch (this.e) {
        }
        return q3.H(this, tgVar);
    }

    @Override // defpackage.rg
    public sg getKey() {
        return b2.O;
    }

    @Override // defpackage.tg
    public final rg j(sg sgVar) {
        switch (this.e) {
        }
        return q3.t(this, sgVar);
    }

    @Override // defpackage.tg
    public final Object m(tq tqVar, Object obj) {
        switch (this.e) {
        }
        return tqVar.invoke(obj, this);
    }

    @Override // defpackage.tg
    public final tg q(sg sgVar) {
        switch (this.e) {
        }
        return q3.C(this, sgVar);
    }

    public p5(Choreographer choreographer, m5 m5Var) {
        this.e = 0;
        this.f = choreographer;
        this.g = m5Var;
    }

    public p5(ee0 ee0Var) {
        this.e = 1;
        this.f = ee0Var;
        this.g = new x7();
    }
}
