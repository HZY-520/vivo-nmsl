package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface si {
    default int D(float f) {
        float o = o(f);
        if (Float.isInfinite(o)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(o);
    }

    default long K(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float o = o(Float.intBitsToFloat((int) (j >> 32)));
        float o2 = o(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(o) << 32) | (Float.floatToRawIntBits(o2) & 4294967295L);
    }

    default float N(long j) {
        if (!cq0.a(bq0.b(j), 4294967296L)) {
            ev.b("Only Sp can convert to Px");
        }
        return o(y(j));
    }

    default long S(float f) {
        return m(a0(f));
    }

    default float a0(float f) {
        return f / k();
    }

    float g();

    float k();

    default long m(float f) {
        float[] fArr = tp.a;
        if (g() < 1.03f) {
            return u10.B(4294967296L, f / g());
        }
        sp a = tp.a(g());
        return u10.B(4294967296L, a != null ? a.a(f) : f / g());
    }

    default long n(long j) {
        if (j != 9205357640488583168L) {
            return dx0.a(a0(Float.intBitsToFloat((int) (j >> 32))), a0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float o(float f) {
        return k() * f;
    }

    default float y(long j) {
        if (!cq0.a(bq0.b(j), 4294967296L)) {
            ev.b("Only Sp can convert to Px");
        }
        float[] fArr = tp.a;
        if (g() < 1.03f) {
            return g() * bq0.c(j);
        }
        sp a = tp.a(g());
        if (a != null) {
            return a.b(bq0.c(j));
        }
        return g() * bq0.c(j);
    }
}
