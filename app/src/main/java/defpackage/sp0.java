package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sp0 {
    public static final long b = p30.b(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ sp0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sp0) {
            return this.a == ((sp0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return "TextRange(" + ((int) (j >> 32)) + ", " + ((int) (j & 4294967295L)) + ")";
    }
}
