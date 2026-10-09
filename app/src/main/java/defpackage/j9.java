package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j9 extends dx0 {
    public t3 G;
    public long H = 9205357640488583168L;
    public final /* synthetic */ Shader I;

    public j9(Shader shader) {
        this.I = shader;
    }

    @Override // defpackage.dx0
    public final void e(float f, long j, v4 v4Var) {
        Paint paint = v4Var.a;
        t3 t3Var = this.G;
        if (t3Var == null || !hl0.a(this.H, j)) {
            if (hl0.c(j)) {
                this.G = null;
                this.H = 9205357640488583168L;
                t3Var = null;
            } else {
                t3Var = this.G;
                if (t3Var == null) {
                    t3Var = new t3(23, false);
                    this.G = t3Var;
                }
                t3Var.f = this.I;
                this.G = t3Var;
                this.H = j;
            }
        }
        long a = v4Var.a();
        long j2 = gc.b;
        if (!as0.a(a, j2)) {
            v4Var.d(j2);
        }
        if (!lw.i(v4Var.c, t3Var != null ? (Shader) t3Var.f : null)) {
            Shader shader = t3Var != null ? (Shader) t3Var.f : null;
            v4Var.c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        v4Var.b(f);
    }
}
