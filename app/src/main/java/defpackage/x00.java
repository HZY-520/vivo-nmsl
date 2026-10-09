package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x00 extends dc0 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ x00(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.dc0
    public float a(mt mtVar) {
        pq pqVar;
        int Y;
        a90 snapshotObserver;
        int Y2;
        switch (this.f) {
            case 0:
                tq tqVar = mtVar.a;
                if (tqVar != null) {
                    return ((Number) tqVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                w00 w00Var = (w00) this.g;
                if (w00Var.s) {
                    return Float.NaN;
                }
                ve0 ve0Var = new ve0();
                ve0Var.e = w00Var;
                while (true) {
                    xg0 xg0Var = ((w00) ve0Var.e).u;
                    float f = (xg0Var == null || (Y2 = o7.Y(xg0Var.b, mtVar)) < 0) ? Float.NaN : xg0Var.c[Y2];
                    boolean isNaN = Float.isNaN(f);
                    Object obj = ve0Var.e;
                    if (!isNaN) {
                        ((w00) obj).T(w00Var.d0(), mtVar);
                        return mtVar.a(f, ((w00) ve0Var.e).b0(), w00Var.b0());
                    }
                    w00 w00Var2 = (w00) obj;
                    tq tqVar2 = w00Var2.l;
                    if (tqVar2 != null && (pqVar = w00Var2.m) != null && ((Boolean) pqVar.invoke(mtVar)).booleanValue()) {
                        w00 w00Var3 = (w00) ve0Var.e;
                        k40 k40Var = w00Var3.o;
                        if (k40Var == null) {
                            long[] jArr = gi0.a;
                            k40Var = new k40();
                            w00Var3.o = k40Var;
                        }
                        Object g = k40Var.g(mtVar);
                        if (g == null) {
                            g = new gc0(w00Var3.e0(), w00Var3, mtVar);
                            k40Var.l(mtVar, g);
                        }
                        gc0 gc0Var = (gc0) g;
                        gc0Var.e = w00Var3.e0();
                        e3 e3Var = w00Var.d0().r;
                        if (e3Var != null && (snapshotObserver = e3Var.getSnapshotObserver()) != null) {
                            snapshotObserver.a.b(gc0Var, w00.x, new v7(tqVar2, ve0Var, mtVar, 4));
                        }
                        ((w00) ve0Var.e).T(w00Var.d0(), mtVar);
                        xg0 xg0Var2 = ((w00) ve0Var.e).u;
                        float f2 = (xg0Var2 == null || (Y = o7.Y(xg0Var2.b, mtVar)) < 0) ? Float.NaN : xg0Var2.c[Y];
                        if (!Float.isNaN(f2)) {
                            return mtVar.a(f2, ((w00) ve0Var.e).b0(), w00Var.b0());
                        }
                    }
                    w00 f0 = ((w00) ve0Var.e).f0();
                    if (f0 == null) {
                        ((w00) ve0Var.e).T(w00Var.d0(), mtVar);
                        return Float.NaN;
                    }
                    ve0Var.e = f0;
                }
                break;
            default:
                return super.a(mtVar);
        }
    }

    @Override // defpackage.dc0
    public final xx b() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((w00) obj).getLayoutDirection();
            default:
                return ((e3) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.dc0
    public final int c() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((w00) obj).M();
            default:
                return ((e3) obj).getRoot().I.o.e;
        }
    }

    @Override // defpackage.si
    public final float g() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((w00) obj).g();
            default:
                return ((e3) obj).getDensity().g();
        }
    }

    @Override // defpackage.si
    public final float k() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((w00) obj).k();
            default:
                return ((e3) obj).getDensity().k();
        }
    }
}
