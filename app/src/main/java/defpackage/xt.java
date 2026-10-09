package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xt {
    public final wt a;
    public final int b;

    public xt(wt wtVar, int i) {
        this.a = wtVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return this.a.equals(xtVar.a) && this.b == xtVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
