package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cs extends oi implements il {
    public final /* synthetic */ int u = 1;
    public final i4 v;
    public final ql w;
    public Object x;

    public cs(ko0 ko0Var, i4 i4Var, ql qlVar, f90 f90Var) {
        this.v = i4Var;
        this.w = qlVar;
        this.x = f90Var;
        o0(ko0Var);
    }

    public static boolean r0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean s0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.il
    public final void B(ky kyVar) {
        boolean z;
        long j;
        char c;
        RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i = this.u;
        i4 i4Var = this.v;
        ql qlVar = this.w;
        switch (i) {
            case 0:
                f90 f90Var = (f90) this.x;
                oa oaVar = kyVar.e;
                i4Var.j(oaVar.u());
                if (hl0.c(oaVar.u())) {
                    kyVar.a();
                    return;
                }
                kyVar.a();
                i4Var.d.getValue();
                Canvas a = o2.a(oaVar.f.o());
                boolean f3 = ql.f(qlVar.f);
                xx xxVar = xx.e;
                if (f3) {
                    EdgeEffect c2 = qlVar.c();
                    float f4 = -Float.intBitsToFloat((int) (oaVar.u() & 4294967295L));
                    z = s0(270.0f, (Float.floatToRawIntBits(kyVar.o(kyVar.getLayoutDirection() == xxVar ? f90Var.a : f90Var.c)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), c2, a);
                } else {
                    z = false;
                }
                if (ql.f(qlVar.d)) {
                    z = s0(0.0f, (((long) Float.floatToRawIntBits(kyVar.o(f90Var.b))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), qlVar.e(), a) || z;
                }
                if (ql.f(qlVar.g)) {
                    z = s0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(kyVar.o(kyVar.getLayoutDirection() == xxVar ? f90Var.c : f90Var.a) + (-((float) t10.B(Float.intBitsToFloat((int) (oaVar.u() >> 32))))))) & 4294967295L), qlVar.d(), a) || z;
                }
                if (ql.f(qlVar.e)) {
                    EdgeEffect b = qlVar.b();
                    z = s0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (oaVar.u() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (oaVar.u() & 4294967295L))) + kyVar.o(f90Var.d))) & 4294967295L), b, a) || z;
                }
                if (z) {
                    i4Var.d();
                    return;
                }
                return;
            default:
                oa oaVar2 = kyVar.e;
                i4Var.j(oaVar2.u());
                Canvas a2 = o2.a(oaVar2.f.o());
                i4Var.d.getValue();
                if (hl0.c(oaVar2.u())) {
                    kyVar.a();
                    return;
                }
                if (!a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = qlVar.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = qlVar.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = qlVar.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = qlVar.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = qlVar.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = qlVar.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = qlVar.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = qlVar.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    kyVar.a();
                    return;
                }
                float o = kyVar.o(30.0f);
                boolean z4 = ql.f(qlVar.d) || ql.g(qlVar.h) || ql.f(qlVar.e) || ql.g(qlVar.i);
                boolean z5 = ql.f(qlVar.f) || ql.g(qlVar.j) || ql.f(qlVar.g) || ql.g(qlVar.k);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    t0().setPosition(0, 0, a2.getWidth(), a2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        t0().setPosition(0, 0, (t10.B(o) * 2) + a2.getWidth(), a2.getHeight());
                    } else {
                        if (!z5) {
                            kyVar.a();
                            return;
                        }
                        t0().setPosition(0, 0, a2.getWidth(), (t10.B(o) * 2) + a2.getHeight());
                    }
                }
                beginRecording = t0().beginRecording();
                boolean g = ql.g(qlVar.j);
                q80 q80Var = q80.f;
                if (g) {
                    EdgeEffect edgeEffect9 = qlVar.j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = qlVar.a(q80Var);
                        qlVar.j = edgeEffect9;
                    }
                    r0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (ql.f(qlVar.f)) {
                    EdgeEffect c3 = qlVar.c();
                    z3 = r0(270.0f, c3, beginRecording);
                    if (ql.g(qlVar.f)) {
                        z2 = z5;
                        float intBitsToFloat = Float.intBitsToFloat((int) (i4Var.c() & j));
                        EdgeEffect edgeEffect10 = qlVar.j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = qlVar.a(q80Var);
                            qlVar.j = edgeEffect10;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float d = i2 >= 31 ? x3.d(c3) : 0.0f;
                        float f5 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            x3.f(edgeEffect10, d, f5);
                        } else {
                            edgeEffect10.onPull(d, f5);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean g2 = ql.g(qlVar.h);
                q80 q80Var2 = q80.e;
                if (g2) {
                    EdgeEffect edgeEffect11 = qlVar.h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = qlVar.a(q80Var2);
                        qlVar.h = edgeEffect11;
                    }
                    r0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (ql.f(qlVar.d)) {
                    EdgeEffect e = qlVar.e();
                    z3 = r0(0.0f, e, beginRecording) || z3;
                    if (ql.g(qlVar.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (i4Var.c() >> c));
                        EdgeEffect edgeEffect12 = qlVar.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = qlVar.a(q80Var2);
                            qlVar.h = edgeEffect12;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float d2 = i3 >= 31 ? x3.d(e) : 0.0f;
                        if (i3 >= 31) {
                            x3.f(edgeEffect12, d2, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(d2, intBitsToFloat2);
                        }
                    }
                }
                if (ql.g(qlVar.k)) {
                    EdgeEffect edgeEffect13 = qlVar.k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = qlVar.a(q80Var);
                        qlVar.k = edgeEffect13;
                    }
                    r0(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (ql.f(qlVar.g)) {
                    EdgeEffect d3 = qlVar.d();
                    z3 = r0(90.0f, d3, beginRecording) || z3;
                    if (ql.g(qlVar.g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (i4Var.c() & j));
                        EdgeEffect edgeEffect14 = qlVar.k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = qlVar.a(q80Var);
                            qlVar.k = edgeEffect14;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float d4 = i4 >= 31 ? x3.d(d3) : 0.0f;
                        if (i4 >= 31) {
                            x3.f(edgeEffect14, d4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(d4, intBitsToFloat3);
                        }
                    }
                }
                if (ql.g(qlVar.i)) {
                    EdgeEffect edgeEffect15 = qlVar.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = qlVar.a(q80Var2);
                        qlVar.i = edgeEffect15;
                    }
                    r0(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (ql.f(qlVar.e)) {
                    EdgeEffect b2 = qlVar.b();
                    boolean z6 = r0(180.0f, b2, beginRecording) || z3;
                    if (ql.g(qlVar.e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (i4Var.c() >> c));
                        EdgeEffect edgeEffect16 = qlVar.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = qlVar.a(q80Var2);
                            qlVar.i = edgeEffect16;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float d5 = i5 >= 31 ? x3.d(b2) : 0.0f;
                        float f6 = 1.0f - intBitsToFloat4;
                        if (i5 >= 31) {
                            x3.f(edgeEffect16, d5, f6);
                        } else {
                            edgeEffect16.onPull(d5, f6);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    i4Var.d();
                }
                float f7 = z2 ? 0.0f : o;
                float f8 = z4 ? 0.0f : o;
                xx layoutDirection = kyVar.getLayoutDirection();
                n2 n2Var = new n2();
                n2Var.a = beginRecording;
                long u = oaVar2.u();
                si p = oaVar2.f.p();
                xx r = oaVar2.f.r();
                ma o2 = oaVar2.f.o();
                long s = oaVar2.f.s();
                v6 v6Var = oaVar2.f;
                es esVar = (es) v6Var.b;
                v6Var.A(kyVar);
                v6Var.B(layoutDirection);
                v6Var.z(n2Var);
                v6Var.C(u);
                v6Var.b = null;
                n2Var.i();
                try {
                    ((t3) oaVar2.f.a).B(f7, f8);
                    try {
                        kyVar.a();
                        n2Var.g();
                        v6 v6Var2 = oaVar2.f;
                        v6Var2.A(p);
                        v6Var2.B(r);
                        v6Var2.z(o2);
                        v6Var2.C(s);
                        v6Var2.b = esVar;
                        t0().endRecording();
                        int save = a2.save();
                        a2.translate(f, f2);
                        a2.drawRenderNode(t0());
                        a2.restoreToCount(save);
                        return;
                    } finally {
                        ((t3) oaVar2.f.a).B(-f7, -f8);
                    }
                } catch (Throwable th) {
                    n2Var.g();
                    v6 v6Var3 = oaVar2.f;
                    v6Var3.A(p);
                    v6Var3.B(r);
                    v6Var3.z(o2);
                    v6Var3.C(s);
                    v6Var3.b = esVar;
                    throw th;
                }
        }
    }

    public RenderNode t0() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode h = c30.h();
        this.x = h;
        return h;
    }

    public cs(ko0 ko0Var, i4 i4Var, ql qlVar) {
        this.v = i4Var;
        this.w = qlVar;
        o0(ko0Var);
    }
}
