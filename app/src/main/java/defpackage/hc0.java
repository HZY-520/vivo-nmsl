package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hc0 extends ReplacementSpan {
    public Paint.FontMetricsInt e;
    public boolean f;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.e;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        lw.E("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f) {
            return 0;
        }
        dv.b("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f = true;
        paint.getTextSize();
        this.e = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            dv.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
