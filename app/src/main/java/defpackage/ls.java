package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ls implements gs {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final pa b;
    public final oa c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public l8 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public ls() {
        pa paVar = new pa();
        oa oaVar = new oa();
        this.b = paVar;
        this.c = oaVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = gc.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.G = 0;
    }

    @Override // defpackage.gs
    public final void A(float f) {
        this.n = f;
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
        this.E = i;
        this.F = i2;
        boolean a = hl0.a(this.e, t10.G(j));
        this.e = t10.G(j);
        S();
        if (a || !s60.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.gs
    public final float D() {
        return this.u;
    }

    @Override // defpackage.gs
    public final void E(l8 l8Var) {
        this.k = l8Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(l8Var != null ? l8Var.a : null);
        Q();
    }

    @Override // defpackage.gs
    public final void F(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.gs
    public final float G() {
        return this.q;
    }

    @Override // defpackage.gs
    public final boolean H() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.gs
    public final float I() {
        return this.n;
    }

    @Override // defpackage.gs
    public final void J(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.gs
    public final float K() {
        return this.v;
    }

    @Override // defpackage.gs
    public final int L() {
        return this.j;
    }

    @Override // defpackage.gs
    public final void M(long j) {
        this.l = j;
        R();
    }

    @Override // defpackage.gs
    public final long N() {
        return this.r;
    }

    public final void O() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.G;
        if (i != 1 && this.j == 3 && this.k == null) {
            P(this.d, i);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.gs
    public final float a() {
        return this.i;
    }

    @Override // defpackage.gs
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.gs
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.gs
    public final float d() {
        return this.m;
    }

    @Override // defpackage.gs
    public final void e(si siVar, xx xxVar, es esVar, vc vcVar) {
        RecordingCanvas beginRecording;
        oa oaVar = this.c;
        beginRecording = this.d.beginRecording();
        float f = this.y;
        float f2 = this.z;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            pa paVar = this.b;
            n2 n2Var = paVar.a;
            Canvas canvas = n2Var.a;
            n2Var.a = beginRecording;
            v6 v6Var = oaVar.f;
            v6Var.A(siVar);
            v6Var.B(xxVar);
            v6Var.b = esVar;
            v6Var.C(this.e);
            v6Var.z(n2Var);
            if (this.y <= 0.0f && this.z <= 0.0f) {
                vcVar.invoke(oaVar);
                paVar.a.a = canvas;
                this.d.endRecording();
            }
            int i = (int) (floatToRawIntBits >> 32);
            int i2 = (int) (floatToRawIntBits & 4294967295L);
            n2Var.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            vcVar.invoke(oaVar);
            n2Var.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            paVar.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    @Override // defpackage.gs
    public final void f(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.gs
    public final void g(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            bv.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.gs
    public final float h() {
        return this.p;
    }

    @Override // defpackage.gs
    public final void i(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.gs
    public final void j(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.gs
    public final long k() {
        return this.s;
    }

    @Override // defpackage.gs
    public final void l(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(lw.F(j));
    }

    @Override // defpackage.gs
    public final void m(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // defpackage.gs
    public final void n(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.gs
    public final void o(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(t10.D(i));
        Q();
    }

    @Override // defpackage.gs
    public final float p() {
        return this.w;
    }

    @Override // defpackage.gs
    public final void q() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.gs
    public final float r() {
        return this.o;
    }

    @Override // defpackage.gs
    public final void s(ma maVar) {
        Canvas canvas = o2.a;
        ((n2) maVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.gs
    public final void t(boolean z) {
        this.x = z;
        O();
    }

    @Override // defpackage.gs
    public final int u() {
        return this.G;
    }

    @Override // defpackage.gs
    public final float v() {
        return this.t;
    }

    @Override // defpackage.gs
    public final l8 w() {
        return this.k;
    }

    @Override // defpackage.gs
    public final void x(int i) {
        this.G = i;
        Q();
    }

    @Override // defpackage.gs
    public final void y(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.gs
    public final void z(long j) {
        this.s = j;
        this.d.setSpotShadowColor(lw.F(j));
    }
}
