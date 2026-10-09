package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
final class fs extends y20 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final long k;
    public final tk0 l;
    public final boolean m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final l8 r;
    public final sx s;

    public fs(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tk0 tk0Var, boolean z, long j2, long j3, int i, int i2, l8 l8Var, sx sxVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = j;
        this.l = tk0Var;
        this.m = z;
        this.n = j2;
        this.o = j3;
        this.p = i;
        this.q = i2;
        this.r = l8Var;
        this.s = sxVar;
    }

    @Override // defpackage.y20
    public final t20 d() {
        gl0 gl0Var = new gl0();
        gl0Var.s = this.a;
        gl0Var.t = this.b;
        gl0Var.u = this.c;
        gl0Var.v = this.d;
        gl0Var.w = this.e;
        gl0Var.x = this.f;
        gl0Var.y = this.g;
        gl0Var.z = this.h;
        gl0Var.A = this.i;
        gl0Var.B = this.j;
        gl0Var.C = this.k;
        gl0Var.D = this.l;
        gl0Var.E = this.m;
        gl0Var.F = this.n;
        gl0Var.G = this.o;
        gl0Var.H = this.p;
        gl0Var.I = this.q;
        gl0Var.J = this.r;
        gl0Var.K = this.s;
        gl0Var.L = new l(26, gl0Var);
        return gl0Var;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        d60 d60Var;
        gl0 gl0Var = (gl0) t20Var;
        gl0Var.s = this.a;
        gl0Var.t = this.b;
        gl0Var.u = this.c;
        gl0Var.v = this.d;
        gl0Var.w = this.e;
        gl0Var.x = this.f;
        gl0Var.y = this.g;
        gl0Var.z = this.h;
        gl0Var.A = this.i;
        gl0Var.B = this.j;
        gl0Var.C = this.k;
        gl0Var.D = this.l;
        gl0Var.E = this.m;
        gl0Var.F = this.n;
        gl0Var.G = this.o;
        gl0Var.H = this.p;
        gl0Var.I = this.q;
        gl0Var.J = this.r;
        gl0Var.K = this.s;
        l lVar = gl0Var.L;
        if (gl0Var.e.r && (d60Var = nh.Y(gl0Var, 2).z) != null) {
            d60Var.Y0(lVar, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fs) {
            fs fsVar = (fs) obj;
            if (Float.compare(this.a, fsVar.a) == 0 && Float.compare(this.b, fsVar.b) == 0 && Float.compare(this.c, fsVar.c) == 0 && Float.compare(this.d, fsVar.d) == 0 && Float.compare(this.e, fsVar.e) == 0 && Float.compare(this.f, fsVar.f) == 0 && Float.compare(this.g, fsVar.g) == 0 && Float.compare(this.h, fsVar.h) == 0 && Float.compare(this.i, fsVar.i) == 0 && Float.compare(this.j, fsVar.j) == 0) {
                long j = fsVar.k;
                int i = zq0.b;
                if (this.k == j && lw.i(this.l, fsVar.l) && this.m == fsVar.m) {
                    long j2 = fsVar.n;
                    int i2 = gc.g;
                    if (as0.a(this.n, j2) && as0.a(this.o, fsVar.o) && this.p == fsVar.p && this.q == fsVar.q && lw.i(this.r, fsVar.r) && lw.i(this.s, fsVar.s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = j2.a(this.j, j2.a(this.i, j2.a(this.h, j2.a(this.g, j2.a(this.f, j2.a(this.e, j2.a(this.d, j2.a(this.c, j2.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = zq0.b;
        int e = j2.e(this.m, (this.l.hashCode() + j2.c(a, 31, this.k)) * 31, 961);
        int i2 = gc.g;
        int b = j2.b(this.q, j2.b(this.p, j2.c(j2.c(e, 31, this.n), 31, this.o), 31), 31);
        l8 l8Var = this.r;
        return this.s.hashCode() + ((b + (l8Var == null ? 0 : l8Var.hashCode())) * 31);
    }

    public final String toString() {
        int i = zq0.b;
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=" + this.f + ", rotationX=" + this.g + ", rotationY=" + this.h + ", rotationZ=" + this.i + ", cameraDistance=" + this.j + ", transformOrigin=" + ("TransformOrigin(packedValue=" + this.k + ")") + ", shape=" + this.l + ", clip=" + this.m + ", renderEffect=null, ambientShadowColor=" + gc.h(this.n) + ", spotShadowColor=" + gc.h(this.o) + ", compositingStrategy=" + j2.h("CompositingStrategy(value=", this.p, ")") + ", blendMode=" + t10.H(this.q) + ", colorFilter=" + this.r + ", outsets=" + this.s + ")";
    }
}
