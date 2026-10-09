package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fp0 {
    public static final fp0 c = new fp0(1.0f, 0.0f);
    public final float a;
    public final float b;

    public fp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj;
        return this.a == fp0Var.a && this.b == fp0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }
}
