package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kn0 implements n6 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof kn0) {
            return this.a.equals(((kn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j2.j("StringAnnotation(value=", this.a, ")");
    }
}
