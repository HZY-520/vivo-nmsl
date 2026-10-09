package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class md0 extends q implements va, jk0 {
    public final o9 h;

    public md0(tg tgVar, o9 o9Var) {
        super(tgVar, true);
        this.h = o9Var;
    }

    @Override // defpackage.cx, defpackage.ww
    public final void b(CancellationException cancellationException) {
        Object J = J();
        if (J instanceof hd) {
            return;
        }
        if ((J instanceof bx) && ((bx) J).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new xw(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // defpackage.q
    public final void b0(Throwable th, boolean z) {
        if (this.h.d(th, false) || z) {
            return;
        }
        lw.w(this.g, th);
    }

    @Override // defpackage.jk0
    public final Object c(ng ngVar, Object obj) {
        return this.h.c(ngVar, obj);
    }

    @Override // defpackage.q
    public final void c0(Object obj) {
        this.h.d(null, false);
    }

    @Override // defpackage.va
    public final n9 iterator() {
        o9 o9Var = this.h;
        o9Var.getClass();
        return new n9(o9Var);
    }

    @Override // defpackage.va
    public final Object n() {
        return this.h.n();
    }

    @Override // defpackage.jk0
    public final Object p(Object obj) {
        return this.h.p(obj);
    }

    @Override // defpackage.cx
    public final void y(CancellationException cancellationException) {
        this.h.d(cancellationException, true);
        x(cancellationException);
    }
}
