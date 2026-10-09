package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i5 extends TextPaint {
    public v4 a;
    public bp0 b;
    public int c;
    public rk0 d;
    public gc e;
    public dx0 f;
    public aj g;
    public hl0 h;
    public t10 i;

    public final v4 a() {
        v4 v4Var = this.a;
        if (v4Var != null) {
            return v4Var;
        }
        v4 v4Var2 = new v4(this);
        this.a = v4Var2;
        return v4Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().c(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.hl0.a(r1.a, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(dx0 dx0Var, long j, float f) {
        if (dx0Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (dx0Var instanceof jm0) {
            d(z20.p(((jm0) dx0Var).G, f));
            return;
        }
        if (!(dx0Var instanceof j9)) {
            z6.j();
            return;
        }
        if (lw.i(this.f, dx0Var)) {
            hl0 hl0Var = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = dx0Var;
            this.h = new hl0(j);
            f5 f5Var = new f5(dx0Var, j);
            v6 v6Var = dm0.a;
            this.g = new aj(f5Var);
        }
        v4 a = a();
        aj ajVar = this.g;
        Shader shader = ajVar != null ? (Shader) ajVar.getValue() : null;
        a.c = shader;
        a.a.setShader(shader);
        this.e = null;
        q3.M(this, f);
    }

    public final void d(long j) {
        gc gcVar = this.e;
        if ((gcVar == null ? false : as0.a(gcVar.a, j)) || j == 16) {
            return;
        }
        this.e = new gc(j);
        setColor(lw.F(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(t10 t10Var) {
        if (t10Var == null || lw.i(this.i, t10Var)) {
            return;
        }
        this.i = t10Var;
        if (t10Var.equals(nn.o)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(t10Var instanceof tn0)) {
            z6.j();
            return;
        }
        a().f(1);
        tn0 tn0Var = (tn0) t10Var;
        a().a.setStrokeWidth(tn0Var.o);
        a().a.setStrokeMiter(tn0Var.p);
        v4 a = a();
        int i = tn0Var.r;
        a.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
        v4 a2 = a();
        int i2 = tn0Var.q;
        a2.a.setStrokeCap(i2 == 2 ? Paint.Cap.SQUARE : i2 == 1 ? Paint.Cap.ROUND : i2 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        a().a.setPathEffect(null);
    }

    public final void f(rk0 rk0Var) {
        if (rk0Var == null || lw.i(this.d, rk0Var)) {
            return;
        }
        this.d = rk0Var;
        if (rk0Var.equals(rk0.d)) {
            clearShadowLayer();
            return;
        }
        rk0 rk0Var2 = this.d;
        float f = rk0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (rk0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), lw.F(this.d.a));
    }

    public final void g(bp0 bp0Var) {
        if (bp0Var == null || lw.i(this.b, bp0Var)) {
            return;
        }
        this.b = bp0Var;
        int i = bp0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
