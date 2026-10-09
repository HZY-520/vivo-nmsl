package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yw0 implements we, cz {
    public final e3 e;
    public final cf f;
    public boolean g;
    public zy h;
    public be i = q3.f;

    public yw0(e3 e3Var, cf cfVar) {
        this.e = e3Var;
        this.f = cfVar;
    }

    public final void d() {
        e3 e3Var = this.e;
        if (!this.g) {
            this.g = true;
            e3Var.getView().setTag(2131034221, null);
            zy zyVar = this.h;
            if (zyVar != null) {
                zyVar.b(this);
            }
            this.h = null;
            uj ujVar = e3Var.k;
            if (ujVar != null) {
                ujVar.b.b();
            }
            e3Var.k = null;
        }
        cf cfVar = this.f;
        synchronized (cfVar.h) {
            try {
                if (cfVar.x.F) {
                    dd0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (cfVar.y != 3) {
                    cfVar.y = 3;
                    cfVar.x.getClass();
                    boolean z = cfVar.j.f == 0;
                    if (!z || !cfVar.i.e.g()) {
                        bf0 bf0Var = cfVar.w;
                        n40 n40Var = cfVar.i;
                        cfVar.x.getClass();
                        try {
                            bf0Var.e(n40Var);
                            if (!z) {
                                ll0 ll0Var = cfVar.j;
                                bf0 bf0Var2 = cfVar.w;
                                ol0 c = ll0Var.c();
                                try {
                                    ue.c(c, bf0Var2);
                                    c.e(true);
                                    cfVar.f.k();
                                    cfVar.f.w();
                                    bf0Var.c();
                                } catch (Throwable th) {
                                    c.e(false);
                                    throw th;
                                }
                            }
                            bf0Var.b();
                            bf0Var.a();
                        } catch (Throwable th2) {
                            bf0Var.a();
                            throw th2;
                        }
                    }
                    cfVar.q.a();
                    cfVar.x.l();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        le0 le0Var = (le0) cfVar.e;
        synchronized (le0Var.c) {
            if (le0Var.f.remove(cfVar)) {
                le0Var.g = null;
            }
            le0Var.i.i(cfVar);
            le0Var.j.remove(cfVar);
        }
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        if (xyVar == xy.ON_DESTROY) {
            d();
        } else {
            if (xyVar != xy.ON_CREATE || this.g) {
                return;
            }
            f(this.i);
        }
    }

    public final void f(be beVar) {
        this.e.setOnReadyForComposition(new c(11, this, beVar));
    }
}
