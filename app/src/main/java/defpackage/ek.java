package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ek {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ek) {
            return this.a == ((ek) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ck.c(Float.intBitsToFloat((int) (j >> 32))) + ", " + ck.c(Float.intBitsToFloat((int) (4294967295L & j))) + ")";
    }
}
