package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vi implements si {
    public final float e;
    public final float f;

    public vi(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj;
        return Float.compare(this.e, viVar.e) == 0 && Float.compare(this.f, viVar.f) == 0;
    }

    @Override // defpackage.si
    public final float g() {
        return this.f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    @Override // defpackage.si
    public final float k() {
        return this.e;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.e + ", fontScale=" + this.f + ")";
    }
}
