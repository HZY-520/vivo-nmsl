package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class tf {
    public final nc a;
    public final nc b;
    public final nc c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tf(nc ncVar, nc ncVar2, int i) {
        this(ncVar2, r0, r1, r6);
        nc d = t10.l(ncVar.b, 12884901888L) ? dx0.d(ncVar) : ncVar;
        nc d2 = t10.l(ncVar2.b, 12884901888L) ? dx0.d(ncVar2) : ncVar2;
        float[] fArr = lr0.l;
        float[] fArr2 = null;
        if (i == 3) {
            boolean l = t10.l(ncVar.b, 12884901888L);
            boolean l2 = t10.l(ncVar2.b, 12884901888L);
            if ((!l || !l2) && (l || l2)) {
                qu0 qu0Var = ((bg0) (l ? ncVar : ncVar2)).d;
                float[] a = l ? qu0Var.a() : fArr;
                fArr = l2 ? qu0Var.a() : fArr;
                fArr2 = new float[]{a[0] / fArr[0], a[1] / fArr[1], a[2] / fArr[2]};
            }
        }
    }

    public long a(long j) {
        float g = gc.g(j);
        float f = gc.f(j);
        float d = gc.d(j);
        float c = gc.c(j);
        nc ncVar = this.b;
        long d2 = ncVar.d(g, f, d);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e = ncVar.e(g, f, d);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e, c, this.a);
    }

    public tf(nc ncVar, nc ncVar2, nc ncVar3, float[] fArr) {
        this.a = ncVar;
        this.b = ncVar2;
        this.c = ncVar3;
        this.d = fArr;
    }
}
