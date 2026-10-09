package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k8 extends h90 {
    public final s4 e;
    public final long f;
    public final int g = 1;
    public final long h;
    public float i;
    public l8 j;

    public k8(s4 s4Var) {
        int i;
        long width = (s4Var.a.getWidth() << 32) | (s4Var.a.getHeight() & 4294967295L);
        this.e = s4Var;
        this.f = width;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > s4Var.a.getWidth() || i > s4Var.a.getHeight()) {
            z6.l("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // defpackage.h90
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.h90
    public final void b(l8 l8Var) {
        this.j = l8Var;
    }

    @Override // defpackage.h90
    public final long d() {
        return t10.G(this.h);
    }

    @Override // defpackage.h90
    public final void e(jl jlVar) {
        int round = Math.round(Float.intBitsToFloat((int) (jlVar.u() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)));
        jl.E(jlVar, this.e, this.f, (round << 32) | (round2 & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return lw.i(this.e, k8Var.e) && xv.a(0L, 0L) && ew.a(this.f, k8Var.f) && this.g == k8Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + j2.c(j2.c(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String d = xv.d(0L);
        String b = ew.b(this.f);
        int i = this.g;
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + d + ", srcSize=" + b + ", filterQuality=" + (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown") + ")";
    }
}
