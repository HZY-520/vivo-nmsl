package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class lv0 {
    public final yv0 a;
    public nv[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public lv0(yv0 yv0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = yv0Var;
        c(yv0Var);
    }

    public final void a() {
        nv[] nvVarArr = this.b;
        if (nvVarArr != null) {
            nv nvVar = nvVarArr[0];
            nv nvVar2 = nvVarArr[1];
            yv0 yv0Var = this.a;
            if (nvVar2 == null) {
                nvVar2 = yv0Var.a.h(2);
            }
            if (nvVar == null) {
                nvVar = yv0Var.a.h(1);
            }
            g(nv.a(nvVar, nvVar2));
            nv nvVar3 = this.b[p30.h(16)];
            if (nvVar3 != null) {
                f(nvVar3);
            }
            nv nvVar4 = this.b[p30.h(32)];
            if (nvVar4 != null) {
                e(nvVar4);
            }
            nv nvVar5 = this.b[p30.h(64)];
            if (nvVar5 != null) {
                h(nvVar5);
            }
        }
    }

    public abstract yv0 b();

    public void c(yv0 yv0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = yv0Var.a.e(i);
            int h = p30.h(i);
            this.c[h] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = yv0Var.a.f(i);
                this.d[h] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, nv nvVar) {
        if (this.b == null) {
            this.b = new nv[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[p30.h(i2)] = nvVar;
            }
        }
    }

    public abstract void g(nv nvVar);

    public lv0() {
        this(new yv0());
    }

    public void e(nv nvVar) {
    }

    public void f(nv nvVar) {
    }

    public void h(nv nvVar) {
    }
}
