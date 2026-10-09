package defpackage;

import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class z6 implements ka, ak, nl {
    public final /* synthetic */ int e;

    public /* synthetic */ z6(int i) {
        this.e = i;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void f(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void g(String str, int i, Object obj, int i2, Object obj2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + obj2);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void j() {
        throw new id();
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.ak
    public double b(double d) {
        switch (this.e) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case Gates.MAX_WINDOWS /* 5 */:
                float[] fArr = qc.a;
                return qc.b(qc.c, d);
            case 6:
                float[] fArr2 = qc.a;
                return qc.a(qc.c, d);
            case 7:
                float[] fArr3 = qc.a;
                return qc.d(qc.d, d);
            case MainActivity.$stable /* 8 */:
                float[] fArr4 = qc.a;
                return qc.c(qc.d, d);
            default:
                return d;
        }
    }

    @Override // defpackage.ka
    public void cancel() {
    }

    @Override // defpackage.nl
    public float a(float f) {
        return f;
    }
}
