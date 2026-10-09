package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h4 implements PointerInputEventHandler {
    public final /* synthetic */ i4 a;

    public h4(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zc0 zc0Var, ng ngVar) {
        Object h = dx0.h(zc0Var, new g4(this.a, null), ngVar);
        return h == dh.e ? h : fs0.a;
    }
}
