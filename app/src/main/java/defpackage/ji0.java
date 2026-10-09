package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class ji0 extends q implements eh {
    public final ng h;

    public ji0(ng ngVar, tg tgVar) {
        super(tgVar, true);
        this.h = ngVar;
    }

    @Override // defpackage.cx
    public final boolean O() {
        return true;
    }

    @Override // defpackage.eh
    public final eh getCallerFrame() {
        ng ngVar = this.h;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    @Override // defpackage.cx
    public void u(Object obj) {
        dx0.C(lr0.x(this.h), nh.X(obj));
    }

    @Override // defpackage.cx
    public void w(Object obj) {
        this.h.resumeWith(nh.X(obj));
    }
}
