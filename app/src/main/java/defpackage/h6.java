package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h6 extends l6 {
    public float a;

    public h6(float f) {
        this.a = f;
    }

    @Override // defpackage.l6
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.l6
    public final int b() {
        return 1;
    }

    @Override // defpackage.l6
    public final l6 c() {
        return new h6(0.0f);
    }

    @Override // defpackage.l6
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.l6
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h6) && ((h6) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
