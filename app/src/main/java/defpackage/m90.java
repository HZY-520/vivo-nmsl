package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m90 {
    public final x4 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public m90(x4 x4Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = x4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final int a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return t30.g(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m90) {
            m90 m90Var = (m90) obj;
            if (this.a == m90Var.a && this.b == m90Var.b && this.c == m90Var.c && this.d == m90Var.d && this.e == m90Var.e && Float.compare(this.f, m90Var.f) == 0 && Float.compare(this.g, m90Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + j2.a(this.f, j2.b(this.e, j2.b(this.d, j2.b(this.c, j2.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
