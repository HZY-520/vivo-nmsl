package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oa implements jl {
    public final na e;
    public final v6 f;
    public v4 g;
    public v4 h;

    public oa() {
        vi viVar = nh.h;
        na naVar = new na();
        naVar.a = viVar;
        naVar.b = xx.e;
        naVar.c = rm.a;
        naVar.d = 0L;
        this.e = naVar;
        v6 v6Var = new v6();
        v6Var.c = this;
        v6Var.a = new t3(2, v6Var);
        this.f = v6Var;
    }

    public static v4 a(oa oaVar, long j, t10 t10Var, int i) {
        v4 c = oaVar.c(t10Var);
        Paint paint = c.a;
        long a = c.a();
        int i2 = gc.g;
        if (!as0.a(a, j)) {
            c.d(j);
        }
        if (c.c != null) {
            c.c = null;
            paint.setShader(null);
        }
        if (!lw.i(c.d, null)) {
            c.e(null);
        }
        if (c.b != i) {
            c.c(i);
        }
        if (paint.isFilterBitmap()) {
            return c;
        }
        paint.setFilterBitmap(true);
        return c;
    }

    @Override // defpackage.jl
    public final void C(s4 s4Var, long j, long j2, long j3, float f, l8 l8Var, int i) {
        this.e.c.c(s4Var, j, j2, j3, b(null, nn.o, f, l8Var, 3, i));
    }

    public final v4 b(dx0 dx0Var, t10 t10Var, float f, l8 l8Var, int i, int i2) {
        v4 c = c(t10Var);
        Paint paint = c.a;
        if (dx0Var != null) {
            dx0Var.e(f, u(), c);
        } else {
            if (c.c != null) {
                c.c = null;
                paint.setShader(null);
            }
            long a = c.a();
            long j = gc.b;
            if (!as0.a(a, j)) {
                c.d(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c.b(f);
            }
        }
        if (!lw.i(c.d, l8Var)) {
            c.e(l8Var);
        }
        if (c.b != i) {
            c.c(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v4 c(t10 t10Var) {
        int i;
        int i2;
        float strokeMiter;
        float f;
        int i3;
        int i4;
        int i5 = 0;
        if (lw.i(t10Var, nn.o)) {
            v4 v4Var = this.g;
            if (v4Var != null) {
                return v4Var;
            }
            v4 b = dx0.b();
            b.f(0);
            this.g = b;
            return b;
        }
        if (!(t10Var instanceof tn0)) {
            z6.j();
            return null;
        }
        v4 v4Var2 = this.h;
        if (v4Var2 == null) {
            v4Var2 = dx0.b();
            v4Var2.f(1);
            this.h = v4Var2;
        }
        Paint paint = v4Var2.a;
        float strokeWidth = paint.getStrokeWidth();
        tn0 tn0Var = (tn0) t10Var;
        float f2 = tn0Var.o;
        if (strokeWidth != f2) {
            paint.setStrokeWidth(f2);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i6 = strokeCap == null ? -1 : w4.a[strokeCap.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i = 1;
            } else if (i6 == 3) {
                i = 2;
            }
            i2 = tn0Var.q;
            if (i != i2) {
                paint.setStrokeCap(i2 == 2 ? Paint.Cap.SQUARE : i2 == 1 ? Paint.Cap.ROUND : i2 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
            }
            strokeMiter = paint.getStrokeMiter();
            f = tn0Var.p;
            if (strokeMiter != f) {
                paint.setStrokeMiter(f);
            }
            Paint.Join strokeJoin = paint.getStrokeJoin();
            i3 = strokeJoin != null ? w4.b[strokeJoin.ordinal()] : -1;
            if (i3 != 1) {
                if (i3 == 2) {
                    i5 = 2;
                } else if (i3 == 3) {
                    i5 = 1;
                }
            }
            i4 = tn0Var.r;
            if (i5 != i4) {
                return v4Var2;
            }
            paint.setStrokeJoin(i4 == 0 ? Paint.Join.MITER : i4 == 2 ? Paint.Join.BEVEL : i4 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
            return v4Var2;
        }
        i = 0;
        i2 = tn0Var.q;
        if (i != i2) {
        }
        strokeMiter = paint.getStrokeMiter();
        f = tn0Var.p;
        if (strokeMiter != f) {
        }
        Paint.Join strokeJoin2 = paint.getStrokeJoin();
        if (strokeJoin2 != null) {
        }
        if (i3 != 1) {
        }
        i4 = tn0Var.r;
        if (i5 != i4) {
        }
    }

    @Override // defpackage.si
    public final float g() {
        return this.e.a.g();
    }

    @Override // defpackage.jl
    public final xx getLayoutDirection() {
        return this.e.b;
    }

    @Override // defpackage.jl
    public final void j(float f, long j, long j2) {
        this.e.c.b(f, j2, a(this, j, nn.o, 3));
    }

    @Override // defpackage.si
    public final float k() {
        return this.e.a.k();
    }

    @Override // defpackage.jl
    public final void r(c5 c5Var, dx0 dx0Var, float f, t10 t10Var, int i) {
        this.e.c.f(c5Var, b(dx0Var, t10Var, f, null, i, 1));
    }

    @Override // defpackage.jl
    public final void s(long j, long j2, long j3, t10 t10Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, t10Var, i));
    }

    @Override // defpackage.jl
    public final v6 t() {
        return this.f;
    }
}
