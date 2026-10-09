package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ra {
    public final float a;

    public ra(float f, float f2) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ra)) {
            return false;
        }
        return ck.b(0.0f, 0.0f) && ck.b(0.0f, 0.0f) && ck.b(0.0f, 0.0f) && ck.b(this.a, ((ra) obj).a) && ck.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + j2.a(this.a, j2.a(0.0f, j2.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
