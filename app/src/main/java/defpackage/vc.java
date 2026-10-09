package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vc extends px implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vc(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                k6 k6Var = (k6) obj;
                float f = k6Var.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = k6Var.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = k6Var.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = k6Var.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new gc(gc.a(lw.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, qc.x), (nc) obj2));
            default:
                jl jlVar = (jl) obj;
                es esVar = (es) obj2;
                c5 c5Var = esVar.l;
                if (esVar.n && esVar.A && c5Var != null) {
                    v6 t = jlVar.t();
                    long s = t.s();
                    t.o().i();
                    try {
                        ((v6) ((t3) t.a).f).o().o(c5Var);
                        esVar.c(jlVar);
                    } finally {
                        t.o().g();
                        t.C(s);
                    }
                } else {
                    esVar.c(jlVar);
                }
                return fs0.a;
        }
    }
}
