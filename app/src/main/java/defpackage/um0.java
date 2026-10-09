package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class um0 implements ng, eh {
    public final ng e;
    public final tg f;

    public um0(ng ngVar, tg tgVar) {
        this.e = ngVar;
        this.f = tgVar;
    }

    @Override // defpackage.eh
    public final eh getCallerFrame() {
        ng ngVar = this.e;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.f;
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        this.e.resumeWith(obj);
    }
}
