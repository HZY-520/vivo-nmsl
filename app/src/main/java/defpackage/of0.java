package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class of0 extends b8 {
    public of0(ng ngVar) {
        super(ngVar);
        if (ngVar == null || ngVar.getContext() == sm.e) {
            return;
        }
        z6.l("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return sm.e;
    }
}
