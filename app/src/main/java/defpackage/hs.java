package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hs implements y80 {
    public es e;
    public final ds f;
    public final e3 g;
    public tq h;
    public eq i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public v10 t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = u10.j();
    public si o = new vi(1.0f, 1.0f);
    public xx p = xx.e;
    public final oa q = new oa();
    public long s = zq0.a;
    public boolean w = true;
    public final l y = new l(14, this);

    public hs(es esVar, ds dsVar, e3 e3Var, tq tqVar, eq eqVar) {
        this.e = esVar;
        this.f = dsVar;
        this.g = e3Var;
        this.h = tqVar;
        this.i = eqVar;
    }

    public final float[] a() {
        float[] fArr = this.m;
        if (fArr == null) {
            fArr = u10.j();
            this.m = fArr;
        }
        if (this.v) {
            this.v = false;
            float[] b = b();
            if (this.w) {
                return b;
            }
            if (!dx0.x(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            es esVar = this.e;
            long j = esVar.z;
            gs gsVar = esVar.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = t30.k(t10.G(this.j));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float r = gsVar.r();
            float h = gsVar.h();
            float v = gsVar.v();
            float D = gsVar.D();
            float K = gsVar.K();
            float d = gsVar.d();
            float I = gsVar.I();
            double d2 = v * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f = -sin;
            float f2 = (h * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (h * sin);
            double d3 = D * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (r * cos2);
            float f10 = (f3 * cos2) + ((-r) * sin2);
            double d4 = K * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * d;
            float f14 = sin3 * cos * d;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * d;
            float f16 = f12 * I;
            float f17 = cos * cos3 * I;
            float f18 = ((cos3 * f6) + (f11 * f4)) * I;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = v10.j(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.n || this.k) {
            return;
        }
        this.g.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean m = e3.m();
        e3 e3Var = this.g;
        if (m) {
            e3Var.I(-4.0f);
        }
        es esVar = this.e;
        if (!xv.a(esVar.t, j)) {
            esVar.t = j;
            esVar.a.C((int) (j >> 32), (int) (j & 4294967295L), esVar.u);
        }
        ViewParent parent = e3Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(e3Var, e3Var);
        }
    }

    public final void e(long j) {
        if (ew.a(j, this.j)) {
            return;
        }
        if (e3.m()) {
            this.g.I(-4.0f);
        }
        this.j = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            e3 e3Var = this.g;
            h40 h40Var = e3Var.E;
            boolean z2 = e3Var.G;
            if (!z) {
                if (z2) {
                    return;
                }
                h40Var.k(this);
                h40 h40Var2 = e3Var.F;
                if (h40Var2 != null) {
                    h40Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                h40Var.a(this);
                return;
            }
            h40 h40Var3 = e3Var.F;
            if (h40Var3 == null) {
                h40Var3 = new h40();
                e3Var.F = h40Var3;
            }
            h40Var3.a(this);
        }
    }

    public final void g() {
        e3.m();
        if (this.n) {
            if (this.s != zq0.a && !ew.a(this.e.u, this.j)) {
                es esVar = this.e;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!s60.b(esVar.z, floatToRawIntBits)) {
                    esVar.z = floatToRawIntBits;
                    esVar.a.M(floatToRawIntBits);
                }
            }
            es esVar2 = this.e;
            si siVar = this.o;
            xx xxVar = this.p;
            long j = this.j;
            long j2 = esVar2.u;
            gs gsVar = esVar2.a;
            if (!ew.a(j2, j)) {
                esVar2.u = j;
                long j3 = esVar2.t;
                gsVar.C((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (esVar2.i == 9205357640488583168L) {
                    esVar2.g = true;
                    esVar2.a();
                }
            }
            esVar2.b = siVar;
            esVar2.c = xxVar;
            esVar2.d = this.y;
            gsVar.e(siVar, xxVar, esVar2, esVar2.e);
            f(false);
        }
    }
}
