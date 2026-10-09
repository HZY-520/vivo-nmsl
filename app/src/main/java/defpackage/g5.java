package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g5 extends t20 implements df, il, ux {
    public boolean A;
    public eg0 C;
    public fg0 D;
    public final b40 s;
    public final boolean t;
    public final float u;
    public final t3 v;
    public final pi w;
    public r4 x;
    public float y;
    public long z = 0;
    public final h40 B = new h40();

    public g5(b40 b40Var, boolean z, float f, t3 t3Var, pi piVar) {
        this.s = b40Var;
        this.t = z;
        this.u = f;
        this.v = t3Var;
        this.w = piVar;
    }

    @Override // defpackage.il
    public final void B(ky kyVar) {
        oa oaVar = kyVar.e;
        kyVar.a();
        r4 r4Var = this.x;
        if (r4Var != null) {
            float f = this.y;
            long r = this.v.r();
            float floatValue = ((Number) ((y5) r4Var.c).c.f.getValue()).floatValue();
            if (floatValue > 0.0f) {
                long b = gc.b(r, floatValue);
                if (r4Var.a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (oaVar.u() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (oaVar.u() & 4294967295L));
                    v6 v6Var = oaVar.f;
                    long s = v6Var.s();
                    v6Var.o().i();
                    try {
                        ((v6) ((t3) v6Var.a).f).o().d(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        jl.G(kyVar, b, f);
                    } finally {
                        v6Var.o().g();
                        v6Var.C(s);
                    }
                } else {
                    jl.G(kyVar, b, f);
                }
            }
        }
        ma o = oaVar.f.o();
        fg0 fg0Var = this.D;
        if (fg0Var != null) {
            long j = this.z;
            int B = t10.B(this.y);
            long r2 = this.v.r();
            this.w.b();
            fg0Var.e(B, j, r2);
            fg0Var.draw(o2.a(o));
        }
    }

    @Override // defpackage.ux, defpackage.c20
    public final void b(long j) {
        float o;
        this.A = true;
        si siVar = nh.a0(this).A;
        this.z = t10.G(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.z;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            o = s60.c((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                o += siVar.o(10.0f);
            }
        } else {
            o = siVar.o(f);
        }
        this.y = o;
        h40 h40Var = this.B;
        Object[] objArr = h40Var.a;
        int i = h40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            o0((jd0) objArr[i2]);
        }
        h40Var.d();
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.t20
    public final void g0() {
        q3.A(c0(), null, new d(this, null, 11), 3);
    }

    @Override // defpackage.t20
    public final void h0() {
        eg0 eg0Var = this.C;
        if (eg0Var != null) {
            this.D = null;
            lw.x(this);
            p2 p2Var = eg0Var.h;
            fg0 fg0Var = (fg0) ((LinkedHashMap) p2Var.f).get(this);
            if (fg0Var != null) {
                fg0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) p2Var.f;
                fg0 fg0Var2 = (fg0) linkedHashMap.get(this);
                if (fg0Var2 != null) {
                }
                linkedHashMap.remove(this);
                eg0Var.g.add(fg0Var);
            }
        }
    }

    public final void o0(jd0 jd0Var) {
        fg0 fg0Var;
        if (!(jd0Var instanceof hd0)) {
            if (jd0Var instanceof id0) {
                fg0 fg0Var2 = this.D;
                if (fg0Var2 != null) {
                    fg0Var2.d();
                    return;
                }
                return;
            }
            if (!(jd0Var instanceof gd0) || (fg0Var = this.D) == null) {
                return;
            }
            fg0Var.d();
            return;
        }
        hd0 hd0Var = (hd0) jd0Var;
        long j = this.z;
        float f = this.y;
        eg0 eg0Var = this.C;
        int i = 0;
        if (eg0Var == null) {
            Object obj = (View) q3.o(this, s3.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    z6.h("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    eg0 eg0Var2 = new eg0(viewGroup.getContext());
                    viewGroup.addView(eg0Var2);
                    eg0Var = eg0Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof eg0) {
                        eg0Var = (eg0) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.C = eg0Var;
        }
        ArrayList arrayList = eg0Var.f;
        p2 p2Var = eg0Var.h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) p2Var.f;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) p2Var.f;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) p2Var.g;
        fg0 fg0Var3 = (fg0) linkedHashMap.get(this);
        if (fg0Var3 == null) {
            ArrayList arrayList2 = eg0Var.g;
            arrayList2.getClass();
            fg0Var3 = (fg0) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (fg0Var3 == null) {
                if (eg0Var.i > kw.v(arrayList)) {
                    fg0Var3 = new fg0(eg0Var.getContext());
                    eg0Var.addView(fg0Var3);
                    arrayList.add(fg0Var3);
                } else {
                    fg0Var3 = (fg0) arrayList.get(eg0Var.i);
                    g5 g5Var = (g5) linkedHashMap3.get(fg0Var3);
                    if (g5Var != null) {
                        g5Var.D = null;
                        lw.x(g5Var);
                        fg0 fg0Var4 = (fg0) linkedHashMap2.get(g5Var);
                        if (fg0Var4 != null) {
                        }
                        linkedHashMap2.remove(g5Var);
                        fg0Var3.c();
                    }
                }
                int i3 = eg0Var.i;
                if (i3 < eg0Var.e - 1) {
                    eg0Var.i = i3 + 1;
                } else {
                    eg0Var.i = 0;
                }
            }
            linkedHashMap2.put(this, fg0Var3);
            linkedHashMap3.put(fg0Var3, this);
        }
        int B = t10.B(f);
        long r = this.v.r();
        this.w.b();
        fg0 fg0Var5 = fg0Var3;
        fg0Var5.b(hd0Var, this.t, j, B, r, new f5(i, this));
        this.D = fg0Var5;
        lw.x(this);
    }
}
