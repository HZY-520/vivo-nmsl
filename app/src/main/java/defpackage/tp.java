package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class tp {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile qm0 b = new qm0();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new up(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new up(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new up(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new up(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new up(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.e[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ev.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static sp a(float f) {
        float f2;
        sp spVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        qm0 qm0Var = b;
        int i = (int) (f * 100.0f);
        qm0Var.getClass();
        sp spVar2 = (sp) q3.l(qm0Var, i);
        if (spVar2 != null) {
            return spVar2;
        }
        qm0 qm0Var2 = b;
        int j = lw.j(qm0Var2.e, qm0Var2.g, i);
        if (j >= 0) {
            return (sp) b.d(j);
        }
        int i2 = -(j + 1);
        int i3 = i2 - 1;
        if (i2 >= b.g) {
            up upVar = new up(new float[]{1.0f}, new float[]{f});
            b(f, upVar);
            return upVar;
        }
        if (i3 < 0) {
            spVar = new up(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.e[i3] / 100.0f;
            spVar = (sp) b.d(i3);
        }
        float f3 = b.e[i2] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        sp spVar3 = (sp) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float b2 = spVar.b(f4);
            fArr2[i4] = ((spVar3.b(f4) - b2) * max) + b2;
        }
        up upVar2 = new up(fArr, fArr2);
        b(f, upVar2);
        return upVar2;
    }

    public static void b(float f, up upVar) {
        synchronized (c) {
            qm0 clone = b.clone();
            clone.c((int) (f * 100.0f), upVar);
            b = clone;
        }
    }
}
