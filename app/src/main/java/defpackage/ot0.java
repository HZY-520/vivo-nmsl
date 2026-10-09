package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ot0 implements tk0 {
    public static final ot0 b = new ot0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ot0(int i) {
        this.a = i;
    }

    @Override // defpackage.tk0
    public final v10 a(long j, xx xxVar, si siVar) {
        switch (this.a) {
            case 0:
                float D = siVar.D(30.0f);
                return new t80(new oe0(-D, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + D, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new t80(z20.a(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
