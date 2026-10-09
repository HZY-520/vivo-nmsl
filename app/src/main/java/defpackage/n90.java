package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n90 {
    public final b5 a;
    public final int b;
    public final int c;

    public n90(b5 b5Var, int i, int i2) {
        this.a = b5Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n90) {
            n90 n90Var = (n90) obj;
            if (this.a == n90Var.a && this.b == n90Var.b && this.c == n90Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + j2.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
