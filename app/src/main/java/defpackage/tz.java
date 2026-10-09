package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tz implements sp {
    public final float a;

    public tz(float f) {
        this.a = f;
    }

    @Override // defpackage.sp
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.sp
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz) && Float.compare(this.a, ((tz) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
