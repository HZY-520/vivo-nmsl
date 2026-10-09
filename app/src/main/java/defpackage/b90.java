package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b90 implements kb {
    public final Class a;

    public b90(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b90) {
            return this.a.equals(((b90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
