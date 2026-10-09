package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n5 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n5(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                m5 m5Var = (m5) this.g;
                o5 o5Var = (o5) this.f;
                synchronized (m5Var.i) {
                    m5Var.k.remove(o5Var);
                }
                return fs0.a;
            case 1:
                ((Choreographer) ((p5) this.g).f).removeFrameCallback((o5) this.f);
                return fs0.a;
            case 2:
                vl0 vl0Var = (vl0) obj;
                synchronized (xl0.c) {
                    j = xl0.e;
                    xl0.e = 1 + j;
                }
                return new o40(j, vl0Var, (pq) this.g, (pq) this.f);
            default:
                qx qxVar = (qx) this.g;
                Object obj2 = qxVar.a;
                ja jaVar = (ja) this.f;
                synchronized (obj2) {
                    qxVar.b.remove(jaVar);
                }
                return fs0.a;
        }
    }
}
