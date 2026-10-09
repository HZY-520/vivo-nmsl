package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pv extends uu0 implements Runnable, x60, View.OnAttachStateChangeListener {
    public final cw0 g;
    public boolean h;
    public boolean i;
    public yv0 j;

    public pv(cw0 cw0Var) {
        super(!cw0Var.t ? 1 : 0);
        this.g = cw0Var;
    }

    @Override // defpackage.x60
    public final yv0 a(View view, yv0 yv0Var) {
        this.j = yv0Var;
        cw0 cw0Var = this.g;
        ss0 ss0Var = cw0Var.r;
        uv0 uv0Var = yv0Var.a;
        ss0Var.f(v10.o(uv0Var.h(8)));
        if (this.h) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.i) {
            cw0Var.s.f(v10.o(uv0Var.h(8)));
            cw0.a(cw0Var, yv0Var);
        }
        return cw0Var.t ? yv0.b : yv0Var;
    }

    @Override // defpackage.uu0
    public final void b(dv0 dv0Var) {
        this.h = false;
        this.i = false;
        yv0 yv0Var = this.j;
        if (dv0Var.a.b() > 0 && yv0Var != null) {
            uv0 uv0Var = yv0Var.a;
            cw0 cw0Var = this.g;
            cw0Var.s.f(v10.o(uv0Var.h(8)));
            cw0Var.r.f(v10.o(uv0Var.h(8)));
            cw0.a(cw0Var, yv0Var);
        }
        this.j = null;
    }

    @Override // defpackage.uu0
    public final void c(dv0 dv0Var) {
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.uu0
    public final yv0 d(yv0 yv0Var, List list) {
        cw0 cw0Var = this.g;
        cw0.a(cw0Var, yv0Var);
        return cw0Var.t ? yv0.b : yv0Var;
    }

    @Override // defpackage.uu0
    public final p2 e(dv0 dv0Var, p2 p2Var) {
        this.h = false;
        return p2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.h = false;
            this.i = false;
            yv0 yv0Var = this.j;
            if (yv0Var != null) {
                cw0 cw0Var = this.g;
                cw0Var.s.f(v10.o(yv0Var.a.h(8)));
                cw0.a(cw0Var, yv0Var);
                this.j = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
