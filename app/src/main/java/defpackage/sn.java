package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sn {
    public final float a;
    public final float b;
    public final long c;

    public sn(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return Float.compare(this.a, snVar.a) == 0 && Float.compare(this.b, snVar.b) == 0 && this.c == snVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + j2.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ")";
    }
}
