package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hr {
    public final we a;

    public hr(we weVar) {
        this.a = weVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hr) {
            return this.a.equals(((hr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
