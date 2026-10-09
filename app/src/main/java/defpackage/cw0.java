package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cw0 {
    public static final WeakHashMap w = new WeakHashMap();
    public final u5 a;
    public final u5 b;
    public final u5 c;
    public final u5 d;
    public final u5 e;
    public final u5 f;
    public final u5 g;
    public final u5 h;
    public final u5 i;
    public final ss0 j;
    public final w90 k;
    public final es0 l;
    public final ss0 m;
    public final ss0 n;
    public final ss0 o;
    public final ss0 p;
    public final ss0 q;
    public final ss0 r;
    public final ss0 s;
    public final boolean t;
    public int u;
    public final pv v;

    public cw0(View view) {
        u5 u5Var = new u5("captionBar", 4);
        this.a = u5Var;
        u5 u5Var2 = new u5("displayCutout", 128);
        this.b = u5Var2;
        u5 u5Var3 = new u5("ime", 8);
        this.c = u5Var3;
        u5 u5Var4 = new u5("mandatorySystemGestures", 32);
        this.d = u5Var4;
        u5 u5Var5 = new u5("navigationBars", 2);
        this.e = u5Var5;
        u5 u5Var6 = new u5("statusBars", 1);
        this.f = u5Var6;
        u5 u5Var7 = new u5("systemBars", 519);
        this.g = u5Var7;
        u5 u5Var8 = new u5("systemGestures", 16);
        this.h = u5Var8;
        u5 u5Var9 = new u5("tappableElement", 64);
        this.i = u5Var9;
        ss0 ss0Var = new ss0(new rv(0, 0, 0, 0), "waterfall");
        this.j = ss0Var;
        this.k = p30.m(null);
        es0 es0Var = new es0(new es0(u5Var7, u5Var3), u5Var2);
        this.l = es0Var;
        new es0(es0Var, new es0(new es0(new es0(u5Var9, u5Var4), u5Var8), ss0Var));
        this.m = u10.K("captionBarIgnoringVisibility", 4);
        this.n = u10.K("navigationBarsIgnoringVisibility", 2);
        this.o = u10.K("statusBarsIgnoringVisibility", 1);
        this.p = u10.K("systemBarsIgnoringVisibility", 519);
        this.q = u10.K("tappableElementIgnoringVisibility", 64);
        this.r = new ss0(new rv(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new ss0(new rv(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(2131034164) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new pv(this);
        int i = ut0.a;
        yv0 a = rt0.a(view);
        if (a != null) {
            uv0 uv0Var = a.a;
            u5Var.f(uv0Var.s(4));
            u5Var2.f(uv0Var.s(128));
            u5Var3.f(uv0Var.s(8));
            u5Var4.f(uv0Var.s(32));
            u5Var5.f(uv0Var.s(2));
            u5Var6.f(uv0Var.s(1));
            u5Var7.f(uv0Var.s(519));
            u5Var8.f(uv0Var.s(16));
            u5Var9.f(uv0Var.s(64));
        }
    }

    public static void a(cw0 cw0Var, yv0 yv0Var) {
        boolean z = false;
        cw0Var.a.g(yv0Var, 0);
        cw0Var.c.g(yv0Var, 0);
        cw0Var.b.g(yv0Var, 0);
        cw0Var.e.g(yv0Var, 0);
        cw0Var.f.g(yv0Var, 0);
        cw0Var.g.g(yv0Var, 0);
        cw0Var.h.g(yv0Var, 0);
        cw0Var.i.g(yv0Var, 0);
        cw0Var.d.g(yv0Var, 0);
        cw0Var.m.f(v10.o(yv0Var.a.i(4)));
        cw0Var.n.f(v10.o(yv0Var.a.i(2)));
        cw0Var.o.f(v10.o(yv0Var.a.i(1)));
        cw0Var.p.f(v10.o(yv0Var.a.i(519)));
        cw0Var.q.f(v10.o(yv0Var.a.i(64)));
        qj g = yv0Var.a.g();
        cw0Var.j.f(v10.o(g != null ? g.a() : nv.e));
        c5 c5Var = null;
        if (g != null) {
            Path c = Build.VERSION.SDK_INT >= 31 ? x3.c(g.a) : null;
            if (c != null) {
                c5Var = new c5(c);
            }
        }
        cw0Var.k.setValue(c5Var);
        synchronized (xl0.c) {
            l40 l40Var = xl0.j.h;
            if (l40Var != null) {
                if (l40Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            xl0.c();
        }
    }
}
