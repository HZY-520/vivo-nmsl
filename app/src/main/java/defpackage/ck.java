package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ck implements Comparable {
    public final float e;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.e, ((ck) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck) {
            return Float.compare(this.e, ((ck) obj).e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }

    public final String toString() {
        return c(this.e);
    }
}
