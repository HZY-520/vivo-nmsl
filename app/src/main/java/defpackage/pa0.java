package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pa0 extends sa0 {
    public final float c;
    public final float d;

    public pa0(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) obj;
        return Float.compare(this.c, pa0Var.c) == 0 && Float.compare(this.d, pa0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
