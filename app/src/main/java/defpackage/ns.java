package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ns implements gs {
    public static final ms H = new ms();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final gl b;
    public final pa c;
    public final au0 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public l8 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public ns(gl glVar) {
        pa paVar = new pa();
        oa oaVar = new oa();
        this.b = glVar;
        this.c = paVar;
        au0 au0Var = new au0(glVar, paVar, oaVar);
        this.d = au0Var;
        this.e = glVar.getResources();
        this.f = new Rect();
        glVar.addView(au0Var);
        au0Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = gc.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.gs
    public final void A(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.gs
    public final Matrix B() {
        return this.d.getMatrix();
    }

    @Override // defpackage.gs
    public final void C(int i, int i2, long j) {
        if (!ew.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            P();
            return;
        }
        int i3 = this.h;
        au0 au0Var = this.d;
        if (i3 != i) {
            au0Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            au0Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.gs
    public final float D() {
        return this.B;
    }

    @Override // defpackage.gs
    public final void E(l8 l8Var) {
        this.o = l8Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(l8Var != null ? l8Var.a : null);
        Q();
    }

    @Override // defpackage.gs
    public final void F(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.gs
    public final float G() {
        return this.x;
    }

    @Override // defpackage.gs
    public final float I() {
        return this.u;
    }

    @Override // defpackage.gs
    public final void J(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.gs
    public final float K() {
        return this.C;
    }

    @Override // defpackage.gs
    public final int L() {
        return this.n;
    }

    @Override // defpackage.gs
    public final void M(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // defpackage.gs
    public final long N() {
        return this.y;
    }

    public final void O(int i) {
        Paint paint = this.g;
        au0 au0Var = this.d;
        boolean z = true;
        if (i == 1) {
            au0Var.setLayerType(2, paint);
        } else if (i == 2) {
            au0Var.setLayerType(0, paint);
            z = false;
        } else {
            au0Var.setLayerType(0, paint);
        }
        au0Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void P() {
        boolean z = this.m;
        au0 au0Var = this.d;
        if (z || au0Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        au0Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            O(i);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z = this.r;
        au0 au0Var = this.d;
        if (z || s60.b(this.s, 9205357640488583168L)) {
            au0Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            au0Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            au0Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            au0Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.gs
    public final float a() {
        return this.q;
    }

    @Override // defpackage.gs
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.gs
    public final void c(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.gs
    public final float d() {
        return this.t;
    }

    @Override // defpackage.gs
    public final void e(si siVar, xx xxVar, es esVar, vc vcVar) {
        au0 au0Var = this.d;
        ViewParent parent = au0Var.getParent();
        gl glVar = this.b;
        if (parent == null) {
            glVar.addView(au0Var);
        }
        float f = this.D;
        float f2 = this.E;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        au0Var.k = siVar;
        au0Var.l = xxVar;
        au0Var.m = vcVar;
        au0Var.n = esVar;
        au0Var.o = intBitsToFloat;
        au0Var.p = intBitsToFloat2;
        if (au0Var.isAttachedToWindow()) {
            au0Var.setVisibility(4);
            au0Var.setVisibility(0);
            try {
                n2 n2Var = this.c.a;
                ms msVar = H;
                Canvas canvas = n2Var.a;
                n2Var.a = msVar;
                glVar.a(n2Var, au0Var, au0Var.getDrawingTime());
                n2Var.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.gs
    public final void f(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.gs
    public final void g(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            bv.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // defpackage.gs
    public final float h() {
        return this.w;
    }

    @Override // defpackage.gs
    public final void i(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.gs
    public final void j(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.gs
    public final long k() {
        return this.z;
    }

    @Override // defpackage.gs
    public final void l(long j) {
        this.y = j;
        this.d.setOutlineAmbientShadowColor(lw.F(j));
    }

    @Override // defpackage.gs
    public final void m(Outline outline, long j) {
        au0 au0Var = this.d;
        au0Var.i = outline;
        au0Var.invalidateOutline();
        if ((this.m || au0Var.getClipToOutline()) && outline != null) {
            au0Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.gs
    public final void n(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.gs
    public final void o(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(t10.F(i)));
        Q();
    }

    @Override // defpackage.gs
    public final float p() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.gs
    public final void q() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.gs
    public final float r() {
        return this.v;
    }

    @Override // defpackage.gs
    public final void s(ma maVar) {
        Rect rect;
        boolean z = this.k;
        au0 au0Var = this.d;
        if (z) {
            if ((this.m || au0Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = au0Var.getWidth();
                rect.bottom = au0Var.getHeight();
            } else {
                rect = null;
            }
            au0Var.setClipBounds(rect);
        }
        Canvas canvas = o2.a;
        if (((n2) maVar).a.isHardwareAccelerated()) {
            this.b.a(maVar, au0Var, au0Var.getDrawingTime());
        }
    }

    @Override // defpackage.gs
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.gs
    public final int u() {
        return this.p;
    }

    @Override // defpackage.gs
    public final float v() {
        return this.A;
    }

    @Override // defpackage.gs
    public final l8 w() {
        return this.o;
    }

    @Override // defpackage.gs
    public final void x(int i) {
        this.p = i;
        Q();
    }

    @Override // defpackage.gs
    public final void y(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.gs
    public final void z(long j) {
        this.z = j;
        this.d.setOutlineSpotShadowColor(lw.F(j));
    }
}
