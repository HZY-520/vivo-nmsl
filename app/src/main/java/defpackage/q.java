package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class q extends cx implements ng, ch {
    public final tg g;

    public q(tg tgVar, boolean z) {
        super(z);
        M((ww) tgVar.j(b2.N));
        this.g = tgVar.g(this);
    }

    @Override // defpackage.cx
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.cx
    public final void L(id idVar) {
        lw.w(this.g, idVar);
    }

    @Override // defpackage.cx
    public final void T(Object obj) {
        if (!(obj instanceof hd)) {
            c0(obj);
        } else {
            hd hdVar = (hd) obj;
            b0(hdVar.a, p7.a.getIntVolatile(hdVar, hd.b) != 0);
        }
    }

    public final void d0(fh fhVar, q qVar, tq tqVar) {
        Object invoke;
        int ordinal = fhVar.ordinal();
        fs0 fs0Var = fs0.a;
        if (ordinal == 0) {
            try {
                dx0.C(lr0.x(lr0.h(qVar, this, tqVar)), fs0Var);
                return;
            } finally {
                resumeWith(new qf0(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                tqVar.getClass();
                lr0.x(lr0.h(qVar, this, tqVar)).resumeWith(fs0Var);
                return;
            }
            if (ordinal != 3) {
                z6.j();
                return;
            }
            try {
                tg tgVar = this.g;
                Object R = kw.R(tgVar, null);
                try {
                    if (tqVar instanceof b8) {
                        lr0.e(2, tqVar);
                        invoke = tqVar.invoke(qVar, this);
                    } else {
                        invoke = lr0.O(tqVar, qVar, this);
                    }
                    kw.M(tgVar, R);
                    if (invoke != dh.e) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    kw.M(tgVar, R);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.ch
    public final tg e() {
        return this.g;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.g;
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        Throwable a = rf0.a(obj);
        if (a != null) {
            obj = new hd(a, false);
        }
        Object P = P(obj);
        if (P == dx0.m) {
            return;
        }
        w(P);
    }

    public void c0(Object obj) {
    }

    public void b0(Throwable th, boolean z) {
    }
}
