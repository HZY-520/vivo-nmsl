package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class he implements ScrollCaptureCallback {
    public final uj0 a;
    public final bw b;
    public final mi0 c;
    public final e3 d;
    public final mg e;
    public final af0 f;

    public he(uj0 uj0Var, bw bwVar, mg mgVar, mi0 mi0Var, e3 e3Var) {
        this.a = uj0Var;
        this.b = bwVar;
        this.c = mi0Var;
        this.d = e3Var;
        this.e = new mg(mgVar.e.g(kj.f));
        this.f = new af0(bwVar.d - bwVar.b, new ge(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r5 == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScrollCaptureSession scrollCaptureSession, bw bwVar, og ogVar) {
        fe feVar;
        int i;
        dh dhVar;
        int i2;
        int i3;
        l0 l0Var;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        bw bwVar2;
        int i5;
        int g;
        int g2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (ogVar instanceof fe) {
            feVar = (fe) ogVar;
            int i6 = feVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                feVar.k = i6 - Integer.MIN_VALUE;
                Object obj = feVar.i;
                i = feVar.k;
                af0 af0Var = this.f;
                dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    i2 = bwVar.b;
                    i3 = bwVar.d;
                    feVar.e = scrollCaptureSession;
                    feVar.f = bwVar;
                    feVar.g = i2;
                    feVar.h = i3;
                    feVar.k = 1;
                    if (i2 > i3) {
                        af0Var.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i2 + " ≤ max=" + i3).toString());
                    }
                    int i7 = i3 - i2;
                    int i8 = af0Var.a;
                    if (i7 > i8) {
                        z6.d(j2.i("Expected range (", i7, ") to be ≤ viewportSize=", i8));
                        return null;
                    }
                    Object a = af0Var.a((((i7 / 2) + i2) - (i8 / 2)) - af0Var.c, feVar);
                    Object obj2 = fs0.a;
                    if (a != dhVar) {
                        a = obj2;
                    }
                    if (a == dhVar) {
                        obj2 = a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = feVar.h;
                        i5 = feVar.g;
                        bwVar2 = feVar.f;
                        scrollCaptureSession2 = n3.h(feVar.e);
                        t30.z(obj);
                        g = t30.g(i5 - t10.B(af0Var.c), 0, af0Var.a);
                        g2 = t30.g(i4 - t10.B(af0Var.c), 0, af0Var.a);
                        int i9 = bwVar2.a;
                        int i10 = bwVar2.c;
                        if (g != g2) {
                            return bw.e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -g);
                            bw bwVar3 = this.b;
                            lockHardwareCanvas.translate(-bwVar3.a, -bwVar3.b);
                            this.d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int B = t10.B(af0Var.c);
                            return new bw(i9, g + B, i10, g2 + B);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = feVar.h;
                    int i12 = feVar.g;
                    bw bwVar4 = feVar.f;
                    ScrollCaptureSession h = n3.h(feVar.e);
                    t30.z(obj);
                    i2 = i12;
                    bwVar = bwVar4;
                    i3 = i11;
                    scrollCaptureSession = h;
                }
                l0Var = new l0(14, (byte) 0);
                feVar.e = scrollCaptureSession;
                feVar.f = bwVar;
                feVar.g = i2;
                feVar.h = i3;
                feVar.k = 2;
                if (z20.l(feVar.getContext()).c(l0Var, feVar) != dhVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    bwVar2 = bwVar;
                    i5 = i2;
                    g = t30.g(i5 - t10.B(af0Var.c), 0, af0Var.a);
                    g2 = t30.g(i4 - t10.B(af0Var.c), 0, af0Var.a);
                    int i92 = bwVar2.a;
                    int i102 = bwVar2.c;
                    if (g != g2) {
                    }
                }
                return dhVar;
            }
        }
        feVar = new fe(this, ogVar);
        Object obj3 = feVar.i;
        i = feVar.k;
        af0 af0Var2 = this.f;
        dhVar = dh.e;
        if (i != 0) {
        }
        l0Var = new l0(14, (byte) 0);
        feVar.e = scrollCaptureSession;
        feVar.f = bwVar;
        feVar.g = i2;
        feVar.h = i3;
        feVar.k = 2;
        if (z20.l(feVar.getContext()).c(l0Var, feVar) != dhVar) {
        }
        return dhVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        q3.A(this.e, h60.f, new d(this, runnable, null, 6), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final wm0 A = q3.A(this.e, null, new z5(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        A.o(new l(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: ie
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                wm0.this.b(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(m20.n(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
