package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class au0 extends View {
    public static final yt0 q = new yt0(0);
    public final gl e;
    public final pa f;
    public final oa g;
    public boolean h;
    public Outline i;
    public boolean j;
    public si k;
    public xx l;
    public pq m;
    public es n;
    public float o;
    public float p;

    public au0(gl glVar, pa paVar, oa oaVar) {
        super(glVar.getContext());
        this.e = glVar;
        this.f = paVar;
        this.g = oaVar;
        setOutlineProvider(q);
        this.j = true;
        this.k = nh.h;
        this.l = xx.e;
        gs.a.getClass();
        this.m = uc.h;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var;
        v6 v6Var;
        si p;
        xx r;
        ma o;
        long s;
        es esVar;
        float f = this.o;
        oa oaVar = this.g;
        pa paVar = this.f;
        if (f > 0.0f || this.p > 0.0f) {
            int save = canvas.save();
            canvas.translate(this.o, this.p);
            n2Var = paVar.a;
            Canvas canvas2 = n2Var.a;
            n2Var.a = canvas;
            si siVar = this.k;
            xx xxVar = this.l;
            float width = getWidth();
            float height = getHeight();
            long floatToRawIntBits = (4294967295L & Float.floatToRawIntBits(height)) | (Float.floatToRawIntBits(width) << 32);
            es esVar2 = this.n;
            pq pqVar = this.m;
            v6 v6Var2 = oaVar.f;
            v6Var = oaVar.f;
            p = v6Var2.p();
            r = v6Var.r();
            o = v6Var.o();
            s = v6Var.s();
            esVar = (es) v6Var.b;
            v6Var.A(siVar);
            v6Var.B(xxVar);
            v6Var.z(n2Var);
            v6Var.C(floatToRawIntBits);
            v6Var.b = esVar2;
            n2Var.i();
            try {
                pqVar.invoke(oaVar);
                n2Var.g();
                v6Var.A(p);
                v6Var.B(r);
                v6Var.z(o);
                v6Var.C(s);
                v6Var.b = esVar;
                paVar.a.a = canvas2;
                canvas.restoreToCount(save);
            } finally {
            }
        } else {
            n2Var = paVar.a;
            Canvas canvas3 = n2Var.a;
            n2Var.a = canvas;
            si siVar2 = this.k;
            xx xxVar2 = this.l;
            float width2 = getWidth();
            float height2 = getHeight();
            long floatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(height2)) | (Float.floatToRawIntBits(width2) << 32);
            es esVar3 = this.n;
            pq pqVar2 = this.m;
            v6 v6Var3 = oaVar.f;
            v6Var = oaVar.f;
            p = v6Var3.p();
            r = v6Var.r();
            o = v6Var.o();
            s = v6Var.s();
            esVar = (es) v6Var.b;
            v6Var.A(siVar2);
            v6Var.B(xxVar2);
            v6Var.z(n2Var);
            v6Var.C(floatToRawIntBits2);
            v6Var.b = esVar3;
            n2Var.i();
            try {
                pqVar2.invoke(oaVar);
                n2Var.g();
                v6Var.A(p);
                v6Var.B(r);
                v6Var.z(o);
                v6Var.C(s);
                v6Var.b = esVar;
                paVar.a.a = canvas3;
            } finally {
            }
        }
        this.h = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.j;
    }

    public final pa getCanvasHolder() {
        return this.f;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.j;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.h) {
            return;
        }
        this.h = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
