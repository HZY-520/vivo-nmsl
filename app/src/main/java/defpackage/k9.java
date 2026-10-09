package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k9 implements ep0 {
    public final j9 e;
    public final float f;

    public k9(j9 j9Var, float f) {
        this.e = j9Var;
        this.f = f;
    }

    @Override // defpackage.ep0
    public final float a() {
        return this.f;
    }

    @Override // defpackage.ep0
    public final long b() {
        int i = gc.g;
        return gc.f;
    }

    @Override // defpackage.ep0
    public final dx0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k9) {
            k9 k9Var = (k9) obj;
            if (this.e == k9Var.e && Float.compare(this.f, k9Var.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.e + ", alpha=" + this.f + ")";
    }
}
