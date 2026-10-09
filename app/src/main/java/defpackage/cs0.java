package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cs0 extends ji0 {
    public final ThreadLocal i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cs0(tg tgVar, go0 go0Var) {
        super(go0Var, tgVar.j(r0) == null ? tgVar.g(r0) : tgVar);
        ds0 ds0Var = ds0.e;
        this.i = new ThreadLocal();
        if (go0Var.getContext().j(b2.D) instanceof vg) {
            return;
        }
        Object R = kw.R(tgVar, null);
        kw.M(tgVar, R);
        f0(tgVar, R);
    }

    public final boolean e0() {
        boolean z = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return !z;
    }

    public final void f0(tg tgVar, Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new k90(tgVar, obj));
    }

    @Override // defpackage.ji0, defpackage.cx
    public final void w(Object obj) {
        if (this.threadLocalIsSet) {
            k90 k90Var = (k90) this.i.get();
            if (k90Var != null) {
                kw.M((tg) k90Var.e, k90Var.f);
            }
            this.i.remove();
        }
        Object X = nh.X(obj);
        ng ngVar = this.h;
        tg context = ngVar.getContext();
        Object R = kw.R(context, null);
        cs0 l0 = R != kw.s ? nh.l0(ngVar, context, R) : null;
        try {
            this.h.resumeWith(X);
            if (l0 == null || l0.e0()) {
                kw.M(context, R);
            }
        } catch (Throwable th) {
            if (l0 == null || l0.e0()) {
                kw.M(context, R);
            }
            throw th;
        }
    }
}
