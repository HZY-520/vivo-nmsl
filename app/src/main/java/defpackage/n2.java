package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n2 implements ma {
    public Canvas a = o2.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.ma
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ma
    public final void b(float f, long j, v4 v4Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, v4Var.a);
    }

    @Override // defpackage.ma
    public final void c(s4 s4Var, long j, long j2, long j3, v4 v4Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (!(s4Var instanceof s4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = s4Var.a;
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, v4Var.a);
    }

    @Override // defpackage.ma
    public final void d(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.ma
    public final void e(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ma
    public final void f(c5 c5Var, v4 v4Var) {
        Canvas canvas = this.a;
        if (!(c5Var instanceof c5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c5Var.a, v4Var.a);
    }

    @Override // defpackage.ma
    public final void g() {
        this.a.restore();
    }

    @Override // defpackage.ma
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, v4 v4Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, v4Var.a);
    }

    @Override // defpackage.ma
    public final void i() {
        this.a.save();
    }

    @Override // defpackage.ma
    public final void j() {
        dx0.o(this.a, false);
    }

    @Override // defpackage.ma
    public final void k(oe0 oe0Var, v4 v4Var) {
        this.a.saveLayer(oe0Var.a, oe0Var.b, oe0Var.c, oe0Var.d, v4Var.a, 31);
    }

    @Override // defpackage.ma
    public final void l(float f, float f2, float f3, float f4, v4 v4Var) {
        this.a.drawRect(f, f2, f3, f4, dx0.v(v4Var));
    }

    @Override // defpackage.ma
    public final void m(float[] fArr) {
        if (v10.j(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // defpackage.ma
    public final void n() {
        dx0.o(this.a, true);
    }

    @Override // defpackage.ma
    public final void o(c5 c5Var) {
        Canvas canvas = this.a;
        if (!(c5Var instanceof c5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c5Var.a, Region.Op.INTERSECT);
    }
}
