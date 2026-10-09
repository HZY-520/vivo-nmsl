package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class us0 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ ws0 f;

    public /* synthetic */ us0(ws0 ws0Var, int i) {
        this.e = i;
        this.f = ws0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ws0 ws0Var = this.f;
        switch (i) {
            case 0:
                ws0Var.d = true;
                ws0Var.f.b();
                return fs0Var;
            default:
                jl jlVar = (jl) obj;
                os osVar = ws0Var.b;
                float f = ws0Var.k;
                float f2 = ws0Var.l;
                v6 t = jlVar.t();
                long s = t.s();
                t.o().i();
                try {
                    ((t3) t.a).z(f, f2, 0L);
                    osVar.a(jlVar);
                    return fs0Var;
                } finally {
                    t.o().g();
                    t.C(s);
                }
        }
    }
}
