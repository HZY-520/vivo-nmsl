package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ko extends go0 implements tq {
    public /* synthetic */ int e;

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        ko koVar = new ko(2, ngVar);
        koVar.e = ((Number) obj).intValue();
        return koVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((ko) create(Integer.valueOf(((Number) obj).intValue()), (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        t30.z(obj);
        return Boolean.valueOf(this.e > 0);
    }
}
