package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dg0 {
    public final long a = gc.f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg0)) {
            return false;
        }
        long j = ((dg0) obj).a;
        int i = gc.g;
        return as0.a(this.a, j);
    }

    public final int hashCode() {
        int i = gc.g;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) gc.h(this.a)) + ", rippleAlpha=null)";
    }
}
