package defpackage;

import android.graphics.RectF;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s80 extends v10 {
    public final c5 b;

    public s80(c5 c5Var) {
        this.b = c5Var;
    }

    @Override // defpackage.v10
    public final oe0 f() {
        c5 c5Var = this.b;
        RectF rectF = c5Var.b;
        if (rectF == null) {
            rectF = new RectF();
            c5Var.b = rectF;
        }
        c5Var.a.computeBounds(rectF, true);
        return new oe0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
