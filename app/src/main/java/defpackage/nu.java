package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nu {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof nu) {
            return this.a == ((nu) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return j2.h("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ")");
    }
}
