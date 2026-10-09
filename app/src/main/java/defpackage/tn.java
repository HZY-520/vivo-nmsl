package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tn {
    public final float a;
    public final float b;

    public tn(float f, si siVar) {
        this.a = f;
        float k = siVar.k();
        float f2 = un.a;
        this.b = k * 386.0878f * 160.0f * 0.84f;
    }

    public final sn a(float f) {
        double b = b(f);
        double d = un.a;
        double d2 = d - 1.0d;
        return new sn(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = n4.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
