package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nc {
    public final String a;
    public final long b;
    public final int c;

    public nc(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            z6.l("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            z6.l("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nc ncVar = (nc) obj;
        if (this.c == ncVar.c && this.a.equals(ncVar.a)) {
            return t10.l(this.b, ncVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, nc ncVar);

    public int hashCode() {
        return j2.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        long j = this.b;
        return this.a + " (id=" + this.c + ", model=" + (t10.l(j, 12884901888L) ? "Rgb" : t10.l(j, 12884901889L) ? "Xyz" : t10.l(j, 12884901890L) ? "Lab" : t10.l(j, 17179869187L) ? "Cmyk" : "Unknown") + ")";
    }
}
