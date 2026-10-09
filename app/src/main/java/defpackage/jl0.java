package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jl0 extends t20 implements ay {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // defpackage.ay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        int i;
        int i2;
        int i3;
        int j2;
        int h;
        int i4;
        int g;
        long a;
        int i5 = 0;
        if (Float.isNaN(this.u)) {
            i = Integer.MAX_VALUE;
        } else {
            i = w00Var.D(this.u);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = w00Var.D(this.v);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.s)) {
            i3 = w00Var.D(this.s);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.t)) {
            int D = w00Var.D(this.t);
            if (D < 0) {
                D = 0;
            }
            if (D > i2) {
                D = i2;
            }
            if (D != Integer.MAX_VALUE) {
                i5 = D;
            }
        }
        long a2 = xf.a(i3, i, i5, i2);
        if (this.w) {
            int j3 = wf.j(j);
            int h2 = wf.h(j);
            int i6 = wf.i(j);
            int g2 = wf.g(j);
            int j4 = wf.j(a2);
            if (j4 < j3) {
                j4 = j3;
            }
            if (j4 > h2) {
                j4 = h2;
            }
            int h3 = wf.h(a2);
            if (h3 >= j3) {
                j3 = h3;
            }
            if (j3 <= h2) {
                h2 = j3;
            }
            int i7 = wf.i(a2);
            if (i7 < i6) {
                i7 = i6;
            }
            if (i7 > g2) {
                i7 = g2;
            }
            int g3 = wf.g(a2);
            if (g3 >= i6) {
                i6 = g3;
            }
            if (i6 <= g2) {
                g2 = i6;
            }
            a = xf.a(j4, h2, i7, g2);
        } else {
            if (Float.isNaN(this.s)) {
                j2 = wf.j(j);
                int h4 = wf.h(a2);
                if (j2 > h4) {
                    j2 = h4;
                }
            } else {
                j2 = wf.j(a2);
            }
            if (Float.isNaN(this.u)) {
                h = wf.h(j);
                int j5 = wf.j(a2);
                if (h < j5) {
                    h = j5;
                }
            } else {
                h = wf.h(a2);
            }
            if (Float.isNaN(this.t)) {
                i4 = wf.i(j);
                int g4 = wf.g(a2);
                if (i4 > g4) {
                    i4 = g4;
                }
            } else {
                i4 = wf.i(a2);
            }
            if (Float.isNaN(this.v)) {
                g = wf.g(j);
                int i8 = wf.i(a2);
                if (g < i8) {
                    g = i8;
                }
            } else {
                g = wf.g(a2);
            }
            a = xf.a(j2, h, i4, g);
        }
        ec0 b = w10Var.b(a);
        return w00Var.l0(b.e, b.f, vm.e, new z2(b, 4));
    }
}
