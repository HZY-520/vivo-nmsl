package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sq0 {
    public q80 a;
    public long b = 0;

    public sq0(q80 q80Var) {
        this.a = q80Var;
    }

    public static long a(sq0 sq0Var, long j, float f) {
        long e = s60.e(sq0Var.b, j);
        sq0Var.b = e;
        float c = sq0Var.a == null ? s60.c(e) : Math.abs(sq0Var.b(e));
        if (c <= 0.0f || c < f) {
            return 9205357640488583168L;
        }
        q80 q80Var = sq0Var.a;
        long j2 = sq0Var.b;
        if (q80Var == null) {
            float c2 = s60.c(j2);
            return s60.d(sq0Var.b, s60.f((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / c2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / c2) & 4294967295L), f));
        }
        float b = sq0Var.b(j2) - (Math.signum(sq0Var.b(sq0Var.b)) * f);
        long j3 = sq0Var.b;
        q80 q80Var2 = sq0Var.a;
        q80 q80Var3 = q80.f;
        float intBitsToFloat = Float.intBitsToFloat((int) (q80Var2 == q80Var3 ? j3 & 4294967295L : j3 >> 32));
        if (sq0Var.a == q80Var3) {
            return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == q80.f ? j >> 32 : j & 4294967295L));
    }
}
