package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gh0 implements cf0 {
    public xh0 e;
    public hh0 f;
    public String g;
    public Object h;
    public Object[] i;
    public v6 j;
    public final f5 k = new f5(12, this);

    public gh0(xh0 xh0Var, hh0 hh0Var, String str, Object obj, Object[] objArr) {
        this.e = xh0Var;
        this.f = hh0Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    public final void a() {
        String f;
        hh0 hh0Var = this.f;
        v6 v6Var = this.j;
        if (v6Var != null) {
            z6.h("entry(", v6Var, ") is not null");
            return;
        }
        if (hh0Var != null) {
            f5 f5Var = this.k;
            Object b = f5Var.b();
            if (b == null || hh0Var.b(b)) {
                this.j = hh0Var.a(this.g, f5Var);
                return;
            }
            if (b instanceof bm0) {
                bm0 bm0Var = (bm0) b;
                if (bm0Var.d() == b2.R || bm0Var.d() == b2.W || bm0Var.d() == b2.U) {
                    f = "MutableState containing " + bm0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    f = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                f = p30.f(b);
            }
            throw new IllegalArgumentException(f);
        }
    }

    @Override // defpackage.cf0
    public final void c() {
        a();
    }

    @Override // defpackage.cf0
    public final void e() {
        v6 v6Var = this.j;
        if (v6Var != null) {
            v6Var.D();
        }
    }

    @Override // defpackage.cf0
    public final void h() {
        v6 v6Var = this.j;
        if (v6Var != null) {
            v6Var.D();
        }
    }
}
