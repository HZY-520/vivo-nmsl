package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class va0 implements qg {
    public final float a;

    public va0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            fv.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.qg
    public final float a(long j, si siVar) {
        return (this.a / 100.0f) * hl0.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va0) && Float.compare(this.a, ((va0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
