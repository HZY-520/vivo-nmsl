package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v4 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public l8 d;

    public v4(Paint paint) {
        this.a = paint;
    }

    public final long a() {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        return i >= 29 ? zw0.a.a(paint) : lw.c(paint.getColor());
    }

    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void c(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            zw0.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(t10.F(i)));
        }
    }

    public final void d(long j) {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i >= 29) {
            zw0.a.c(paint, j);
        } else {
            paint.setColor(lw.F(j));
        }
    }

    public final void e(l8 l8Var) {
        this.d = l8Var;
        this.a.setColorFilter(l8Var != null ? l8Var.a : null);
    }

    public final void f(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
