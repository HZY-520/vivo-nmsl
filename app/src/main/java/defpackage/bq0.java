package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bq0 {
    public static final cq0[] b = {new cq0(0), new cq0(4294967296L), new cq0(8589934592L)};
    public static final long c = u10.B(0, Float.NaN);
    public final long a;

    public /* synthetic */ bq0(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (cq0.a(b2, 0L)) {
            return "Unspecified";
        }
        if (cq0.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!cq0.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bq0) {
            return this.a == ((bq0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
