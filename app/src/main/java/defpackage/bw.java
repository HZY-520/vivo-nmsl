package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bw {
    public static final bw e = new bw(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bw(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return this.a == bwVar.a && this.b == bwVar.b && this.c == bwVar.c && this.d == bwVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j2.b(this.c, j2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
    }
}
