package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gl0 extends t20 implements ay, sj0 {
    public float A;
    public float B;
    public long C;
    public tk0 D;
    public boolean E;
    public long F;
    public long G;
    public int H;
    public int I;
    public l8 J;
    public sx K;
    public l L;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        ec0 b = w10Var.b(j);
        return w00Var.l0(b.e, b.f, vm.e, new c(9, b, this));
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        if (this.E) {
            zj0.b(bk0Var, this.D);
        }
    }

    @Override // defpackage.sj0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    public final String toString() {
        float f = this.s;
        float f2 = this.t;
        float f3 = this.u;
        float f4 = this.v;
        float f5 = this.w;
        float f6 = this.x;
        float f7 = this.y;
        float f8 = this.z;
        float f9 = this.A;
        float f10 = this.B;
        long j = this.C;
        int i = zq0.b;
        return "SimpleGraphicsLayerModifier(scaleX=" + f + ", scaleY=" + f2 + ", alpha = " + f3 + ", translationX=" + f4 + ", translationY=" + f5 + ", shadowElevation=" + f6 + ", rotationX=" + f7 + ", rotationY=" + f8 + ", rotationZ=" + f9 + ", cameraDistance=" + f10 + ", transformOrigin=" + ("TransformOrigin(packedValue=" + j + ")") + ", shape=" + this.D + ", clip=" + this.E + ", renderEffect=null, ambientShadowColor=" + gc.h(this.F) + ", spotShadowColor=" + gc.h(this.G) + ", compositingStrategy=" + j2.h("CompositingStrategy(value=", this.H, ")") + ", blendMode=" + t10.H(this.I) + ", colorFilter=" + this.J + "outsets=" + this.K + ")";
    }
}
