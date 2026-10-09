package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sk0 extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public sk0(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
