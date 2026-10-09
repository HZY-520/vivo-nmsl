package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yt0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        au0 au0Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                if (!(view instanceof au0) || (outline2 = (au0Var = (au0) view).i) == null) {
                    return;
                }
                outline.set(outline2);
                float f = au0Var.o;
                if (f == 0.0f && au0Var.p == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) au0Var.p);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
