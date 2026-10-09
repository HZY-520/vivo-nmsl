package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class po0 extends t20 implements ay, dr0 {
    public tu0 s;
    public tu0 t;
    public tu0 u;
    public xs0 v;
    public cw0 w;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        int a = this.t.a(w00Var, w00Var.getLayoutDirection()) - this.s.a(w00Var, w00Var.getLayoutDirection());
        int b = this.t.b(w00Var) - this.s.b(w00Var);
        int c = (this.t.c(w00Var, w00Var.getLayoutDirection()) - this.s.c(w00Var, w00Var.getLayoutDirection())) + a;
        int d = (this.t.d(w00Var) - this.s.d(w00Var)) + b;
        ec0 b2 = w10Var.b(xf.h(-c, -d, j));
        return w00Var.l0(xf.f(j, b2.e + c), xf.e(j, b2.f + d), vm.e, new qv(b2, a, b, 0));
    }

    @Override // defpackage.t20
    public final void g0() {
        cw0 cw0Var;
        View L = kw.L(this);
        WeakHashMap weakHashMap = cw0.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(L);
                if (obj == null) {
                    obj = new cw0(L);
                    weakHashMap.put(L, obj);
                }
                cw0Var = (cw0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        pv pvVar = cw0Var.v;
        if (cw0Var.u == 0) {
            pvVar.h = false;
            pvVar.i = false;
            pvVar.j = null;
            int i = ut0.a;
            qt0.b(L, pvVar);
            if (L.isAttachedToWindow()) {
                L.requestApplyInsets();
            }
            L.addOnAttachStateChangeListener(pvVar);
            dv0.a(L, pvVar);
        }
        cw0Var.u++;
        this.v.getClass();
        es0 es0Var = cw0Var.l;
        if (!lw.i(es0Var, this.u)) {
            this.u = es0Var;
            o0();
        }
        this.w = cw0Var;
        p30.p(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new l(16, this));
        o0();
    }

    @Override // defpackage.t20
    public final void h0() {
        View L = kw.L(this);
        cw0 cw0Var = this.w;
        if (cw0Var != null) {
            int i = cw0Var.u - 1;
            cw0Var.u = i;
            if (i == 0) {
                int i2 = ut0.a;
                qt0.b(L, null);
                dv0.a(L, null);
                L.removeOnAttachStateChangeListener(cw0Var.v);
            }
        }
        this.t = this.s;
        p0();
    }

    @Override // defpackage.dr0
    public final Object i() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.t20
    public final void i0() {
        this.s = lr0.s;
    }

    public final void o0() {
        this.t = new es0(this.s, this.u);
        p0();
        kw.x(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void p0() {
        cr0 cr0Var;
        if (!this.e.r) {
            cv.b("visitSubtreeIf called on an unattached node");
        }
        t40 t40Var = new t40(new t20[16]);
        t20 t20Var = this.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var, t20Var);
        } else {
            t40Var.b(t20Var2);
        }
        while (true) {
            int i = t40Var.g;
            if (i == 0) {
                return;
            }
            t20 t20Var3 = (t20) t40Var.j(i - 1);
            if ((t20Var3.h & 262144) != 0) {
                for (t20 t20Var4 = t20Var3; t20Var4 != null && t20Var4.r; t20Var4 = t20Var4.j) {
                    if ((t20Var4.g & 262144) != 0) {
                        oi oiVar = t20Var4;
                        ?? r7 = 0;
                        while (oiVar != 0) {
                            if (oiVar instanceof dr0) {
                                dr0 dr0Var = (dr0) oiVar;
                                boolean equals = "androidx.compose.foundation.layout.ConsumedInsetsProvider".equals(dr0Var.i());
                                cr0 cr0Var2 = cr0.f;
                                if (equals) {
                                    po0 po0Var = (po0) dr0Var;
                                    tu0 tu0Var = this.t;
                                    if (!lw.i(po0Var.s, tu0Var)) {
                                        po0Var.s = tu0Var;
                                        po0Var.o0();
                                    }
                                    cr0Var = cr0Var2;
                                } else {
                                    cr0Var = cr0.e;
                                }
                                if (cr0Var == cr0.g) {
                                    return;
                                }
                                if (cr0Var == cr0Var2) {
                                    break;
                                }
                            } else if ((oiVar.g & 262144) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var5 = oiVar.t;
                                int i2 = 0;
                                oiVar = oiVar;
                                r7 = r7;
                                while (t20Var5 != null) {
                                    if ((t20Var5.g & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            oiVar = t20Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r7.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r7.b(t20Var5);
                                        }
                                    }
                                    t20Var5 = t20Var5.j;
                                    oiVar = oiVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            oiVar = nh.N(r7);
                        }
                    }
                }
            }
            nh.e(t40Var, t20Var3);
        }
    }
}
