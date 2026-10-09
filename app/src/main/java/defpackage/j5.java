package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j5 extends go0 implements tq {
    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        return new j5(2, ngVar);
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((j5) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        t30.z(obj);
        return Choreographer.getInstance();
    }
}
