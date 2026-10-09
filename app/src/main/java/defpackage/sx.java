package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sx {
    public static final sx a;

    static {
        sx sxVar = new sx();
        if (ck.a(0.0f, 0.0f) < 0 || ck.a(0.0f, 0.0f) < 0 || ck.a(0.0f, 0.0f) < 0 || ck.a(0.0f, 0.0f) < 0) {
            bv.a("Layer outsets must be non-negative");
        }
        a = sxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx) && ck.b(0.0f, 0.0f) && ck.b(0.0f, 0.0f) && ck.b(0.0f, 0.0f) && ck.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + j2.a(0.0f, j2.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        return "LayerOutsets(left=" + ck.c(0.0f) + ", top=" + ck.c(0.0f) + ", right=" + ck.c(0.0f) + ", bottom=" + ck.c(0.0f) + ")";
    }
}
