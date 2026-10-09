package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class js implements gs {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final pa b;
    public final oa c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public l8 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public js(e3 e3Var, pa paVar, oa oaVar) {
        this.b = paVar;
        this.c = oaVar;
        RenderNode create = RenderNode.create("Compose", e3Var);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            gf0.c(create, gf0.a(create));
            gf0.d(create, gf0.b(create));
            ff0.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = gc.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.gs
    public final void A(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.gs
    public final Matrix B() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.gs
    public final void C(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean a = ew.a(this.e, j);
        this.e = j;
        S();
        if (a) {
            return;
        }
        if (this.n || s60.b(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.gs
    public final float D() {
        return this.x;
    }

    @Override // defpackage.gs
    public final void E(l8 l8Var) {
        this.l = l8Var;
        if (l8Var == null) {
            Q();
            return;
        }
        P(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(l8Var.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.gs
    public final void F(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.gs
    public final float G() {
        return this.t;
    }

    @Override // defpackage.gs
    public final boolean H() {
        return this.d.isValid();
    }

    @Override // defpackage.gs
    public final float I() {
        return this.q;
    }

    @Override // defpackage.gs
    public final void J(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.gs
    public final float K() {
        return this.y;
    }

    @Override // defpackage.gs
    public final int L() {
        return this.k;
    }

    @Override // defpackage.gs
    public final void M(long j) {
        this.o = j;
        R();
    }

    @Override // defpackage.gs
    public final long N() {
        return this.u;
    }

    public final void O() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.gs
    public final float a() {
        return this.m;
    }

    @Override // defpackage.gs
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.gs
    public final void c(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.gs
    public final float d() {
        return this.p;
    }

    @Override // defpackage.gs
    public final void e(si siVar, xx xxVar, es esVar, vc vcVar) {
        DisplayListCanvas displayListCanvas;
        n2 n2Var;
        Canvas canvas;
        DisplayListCanvas displayListCanvas2;
        si p;
        xx r;
        ma o;
        Canvas canvas2;
        long s;
        es esVar2;
        long j;
        int i;
        int i2;
        oa oaVar = this.c;
        v6 v6Var = oaVar.f;
        DisplayListCanvas start = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        float f2 = this.C;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            n2Var = this.b.a;
            canvas = n2Var.a;
            n2Var.a = (Canvas) start;
        } catch (Throwable th) {
            th = th;
            displayListCanvas = start;
        }
        try {
            try {
                if (this.B <= 0.0f) {
                    try {
                        if (this.C <= 0.0f) {
                            long G = t10.G(this.e);
                            p = v6Var.p();
                            r = v6Var.r();
                            o = v6Var.o();
                            canvas2 = canvas;
                            s = v6Var.s();
                            displayListCanvas2 = start;
                            esVar2 = (es) v6Var.b;
                            v6Var.A(siVar);
                            v6Var.B(xxVar);
                            v6Var.z(n2Var);
                            v6Var.C(G);
                            v6Var.b = esVar;
                            n2Var.i();
                            try {
                                vcVar.invoke(oaVar);
                                n2Var.a = canvas2;
                                this.d.end(displayListCanvas2);
                                return;
                            } finally {
                                n2Var.g();
                                v6Var.A(p);
                                v6Var.B(r);
                                v6Var.z(o);
                                v6Var.C(s);
                                v6Var.b = esVar2;
                            }
                        }
                        displayListCanvas2 = start;
                        j = 4294967295L;
                        canvas2 = canvas;
                    } catch (Throwable th2) {
                        th = th2;
                        displayListCanvas2 = start;
                        displayListCanvas = displayListCanvas2;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                } else {
                    displayListCanvas2 = start;
                    canvas2 = canvas;
                    j = 4294967295L;
                }
                vcVar.invoke(oaVar);
                n2Var.g();
                v6Var.A(p);
                v6Var.B(r);
                v6Var.z(o);
                v6Var.C(s);
                v6Var.b = esVar2;
                n2Var.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                n2Var.a = canvas2;
                this.d.end(displayListCanvas2);
                return;
            } catch (Throwable th3) {
                displayListCanvas = displayListCanvas2;
                try {
                    throw th3;
                } catch (Throwable th4) {
                    th = th4;
                    this.d.end(displayListCanvas);
                    throw th;
                }
            }
            i = (int) (floatToRawIntBits >> 32);
            i2 = (int) (floatToRawIntBits & j);
            n2Var.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            long G2 = t10.G(this.e);
            p = v6Var.p();
            r = v6Var.r();
            o = v6Var.o();
            s = v6Var.s();
            esVar2 = (es) v6Var.b;
            v6Var.A(siVar);
            v6Var.B(xxVar);
            v6Var.z(n2Var);
            v6Var.C(G2);
            v6Var.b = esVar;
            n2Var.i();
        } catch (Throwable th5) {
            th = th5;
            displayListCanvas = displayListCanvas2;
            this.d.end(displayListCanvas);
            throw th;
        }
    }

    @Override // defpackage.gs
    public final void f(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.gs
    public final void g(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            bv.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.gs
    public final float h() {
        return this.s;
    }

    @Override // defpackage.gs
    public final void i(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.gs
    public final void j(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.gs
    public final long k() {
        return this.v;
    }

    @Override // defpackage.gs
    public final void l(long j) {
        this.u = j;
        gf0.c(this.d, lw.F(j));
    }

    @Override // defpackage.gs
    public final void m(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // defpackage.gs
    public final void n(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.gs
    public final void o(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(t10.F(i)));
        Q();
    }

    @Override // defpackage.gs
    public final float p() {
        return this.z;
    }

    @Override // defpackage.gs
    public final void q() {
        ff0.a(this.d);
    }

    @Override // defpackage.gs
    public final float r() {
        return this.r;
    }

    @Override // defpackage.gs
    public final void s(ma maVar) {
        Canvas canvas = o2.a;
        DisplayListCanvas displayListCanvas = ((n2) maVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.gs
    public final void t(boolean z) {
        this.A = z;
        O();
    }

    @Override // defpackage.gs
    public final int u() {
        return this.j;
    }

    @Override // defpackage.gs
    public final float v() {
        return this.w;
    }

    @Override // defpackage.gs
    public final l8 w() {
        return this.l;
    }

    @Override // defpackage.gs
    public final void x(int i) {
        this.j = i;
        Q();
    }

    @Override // defpackage.gs
    public final void y(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.gs
    public final void z(long j) {
        this.v = j;
        gf0.d(this.d, lw.F(j));
    }
}
