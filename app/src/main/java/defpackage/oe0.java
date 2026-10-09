package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oe0 {
    public static final oe0 e = new oe0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public oe0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long b() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final oe0 c(oe0 oe0Var) {
        return new oe0(Math.max(this.a, oe0Var.a), Math.max(this.b, oe0Var.b), Math.min(this.c, oe0Var.c), Math.min(this.d, oe0Var.d));
    }

    public final boolean d() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final oe0 e(float f, float f2) {
        return new oe0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe0)) {
            return false;
        }
        oe0 oe0Var = (oe0) obj;
        return Float.compare(this.a, oe0Var.a) == 0 && Float.compare(this.b, oe0Var.b) == 0 && Float.compare(this.c, oe0Var.c) == 0 && Float.compare(this.d, oe0Var.d) == 0;
    }

    public final oe0 f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new oe0(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + nh.j0(this.a) + ", " + nh.j0(this.b) + ", " + nh.j0(this.c) + ", " + nh.j0(this.d) + ")";
    }
}
