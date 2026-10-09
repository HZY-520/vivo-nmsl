package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tv0 extends sv0 {
    public tv0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var, windowInsets);
    }

    @Override // defpackage.mv0, defpackage.uv0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(xv0.a(i));
        return boundingRects;
    }

    @Override // defpackage.mv0, defpackage.uv0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(xv0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.mv0, defpackage.uv0
    public void p() {
    }
}
