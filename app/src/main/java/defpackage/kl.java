package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kl extends CharacterStyle implements UpdateAppearance {
    public final t10 e;

    public kl(t10 t10Var) {
        this.e = t10Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            nn nnVar = nn.o;
            t10 t10Var = this.e;
            if (lw.i(t10Var, nnVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(t10Var instanceof tn0)) {
                z6.j();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            tn0 tn0Var = (tn0) t10Var;
            textPaint.setStrokeWidth(tn0Var.o);
            textPaint.setStrokeMiter(tn0Var.p);
            int i = tn0Var.r;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = tn0Var.q;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
