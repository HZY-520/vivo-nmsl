package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j6 extends l6 {
    public float a;
    public float b;
    public float c;

    public j6(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.l6
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.l6
    public final int b() {
        return 3;
    }

    @Override // defpackage.l6
    public final l6 c() {
        return new j6(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.l6
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.l6
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return j6Var.a == this.a && j6Var.b == this.b && j6Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + j2.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
