package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class v5 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ v5(hg hgVar, os0 os0Var, ww wwVar, kj0 kj0Var) {
        this.e = 1;
        this.f = hgVar;
        this.g = wwVar;
        this.h = kj0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        boolean booleanValue;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                y5 y5Var = (y5) obj4;
                g6 g6Var = (g6) obj3;
                re0 re0Var = (re0) obj2;
                e6 e6Var = (e6) obj;
                u10.J(e6Var, y5Var.c);
                w90 w90Var = e6Var.e;
                Object b = y5Var.b(w90Var.getValue());
                if (!lw.i(b, w90Var.getValue())) {
                    y5Var.c.f.setValue(b);
                    g6Var.f.setValue(b);
                    e6Var.i.setValue(Boolean.FALSE);
                    e6Var.d.b();
                    re0Var.e = true;
                }
                return fs0Var;
            case 1:
                hg hgVar = (hg) obj4;
                ww wwVar = (ww) obj3;
                kj0 kj0Var = (kj0) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = hgVar.u ? 1.0f : -1.0f;
                mj0 mj0Var = hgVar.t;
                long f2 = mj0Var.f(mj0Var.i(f * floatValue));
                mj0 mj0Var2 = kj0Var.a;
                float h = mj0Var.h(mj0Var.f(mj0Var2.d(mj0Var2.k, f2, 1))) * f;
                if (Math.abs(h) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + h + " < " + floatValue + ")");
                    cancellationException.initCause(null);
                    wwVar.b(cancellationException);
                }
                return fs0Var;
            default:
                uo uoVar = (uo) obj3;
                pq pqVar = (pq) obj2;
                yo yoVar = (yo) obj;
                if (lw.i(yoVar, (yo) obj4)) {
                    booleanValue = false;
                } else {
                    if (lw.i(yoVar, uoVar.c)) {
                        z6.m("Focus search landed at the root.");
                        return null;
                    }
                    booleanValue = ((Boolean) pqVar.invoke(yoVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
        }
    }

    public /* synthetic */ v5(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
