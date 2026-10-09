package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rx implements cf0, wg {
    public final tg e;
    public final tq f;
    public final mg g;
    public wm0 h;

    public rx(tg tgVar, tq tqVar) {
        this.e = tgVar;
        this.f = tqVar;
        this.g = t10.a(tgVar.g(this));
    }

    @Override // defpackage.cf0
    public final void c() {
        wm0 wm0Var = this.h;
        if (wm0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            wm0Var.b(cancellationException);
        }
        this.h = q3.A(this.g, null, this.f, 3);
    }

    @Override // defpackage.cf0
    public final void e() {
        wm0 wm0Var = this.h;
        if (wm0Var != null) {
            wm0Var.y(new eb());
        }
        this.h = null;
    }

    @Override // defpackage.tg
    public final tg g(tg tgVar) {
        return q3.H(this, tgVar);
    }

    @Override // defpackage.rg
    public final sg getKey() {
        return b2.E;
    }

    @Override // defpackage.cf0
    public final void h() {
        wm0 wm0Var = this.h;
        if (wm0Var != null) {
            wm0Var.y(new eb());
        }
        this.h = null;
    }

    @Override // defpackage.tg
    public final rg j(sg sgVar) {
        return q3.t(this, sgVar);
    }

    @Override // defpackage.wg
    public final void k(tg tgVar, Throwable th) {
        wg wgVar = (wg) this.e.j(b2.E);
        if (wgVar == null) {
            throw th;
        }
        wgVar.k(tgVar, th);
    }

    @Override // defpackage.tg
    public final Object m(tq tqVar, Object obj) {
        return tqVar.invoke(obj, this);
    }

    @Override // defpackage.tg
    public final tg q(sg sgVar) {
        return q3.C(this, sgVar);
    }
}
