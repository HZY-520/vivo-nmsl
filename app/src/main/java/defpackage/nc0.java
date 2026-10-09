package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nc0 {
    public final boolean a;
    public final int b;

    public nc0() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc0)) {
            return false;
        }
        nc0 nc0Var = (nc0) obj;
        return this.a == nc0Var.a && this.b == nc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + om.a(this.b) + ")";
    }

    public nc0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
