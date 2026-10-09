package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class c5 {
    public final Path a;
    public RectF b;
    public float[] c;

    public c5(Path path) {
        this.a = path;
    }

    public static void a(c5 c5Var, c5 c5Var2) {
        c5Var.a.addPath(c5Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(c5 c5Var, ng0 ng0Var) {
        RectF rectF = c5Var.b;
        if (rectF == null) {
            rectF = new RectF();
            c5Var.b = rectF;
        }
        float f = ng0Var.a;
        long j = ng0Var.h;
        long j2 = ng0Var.g;
        long j3 = ng0Var.f;
        long j4 = ng0Var.e;
        rectF.set(f, ng0Var.b, ng0Var.c, ng0Var.d);
        float[] fArr = c5Var.c;
        if (fArr == null) {
            fArr = new float[8];
            c5Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c5Var.a;
        RectF rectF2 = c5Var.b;
        rectF2.getClass();
        float[] fArr2 = c5Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void c() {
        this.a.reset();
    }
}
