package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qk0 extends CharacterStyle implements UpdateAppearance {
    public final j9 e;
    public final float f;
    public final w90 g = p30.m(new hl0(9205357640488583168L));
    public final aj h;

    public qk0(j9 j9Var, float f) {
        this.e = j9Var;
        this.f = f;
        f5 f5Var = new f5(15, this);
        v6 v6Var = dm0.a;
        this.h = new aj(f5Var);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        q3.M(textPaint, this.f);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
