package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class tw0 {
    public static final k40 a;

    static {
        long[] jArr = gi0.a;
        a = new k40();
    }

    public static final xe a(View view) {
        Object tag = view.getTag(2131034155);
        if (tag instanceof xe) {
            return (xe) tag;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final le0 b(View view) {
        tg tgVar;
        p5 p5Var;
        if (!view.isAttachedToWindow()) {
            cv.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object l = t30.l(view);
        while (l instanceof View) {
            View view2 = (View) l;
            if (view2.getId() == 16908290) {
                break;
            }
            l = view2.getParent();
            view = view2;
        }
        xe a2 = a(view);
        ng ngVar = null;
        if (a2 != null) {
            if (a2 instanceof le0) {
                return (le0) a2;
            }
            z6.m("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((mw0) nw0.a.get()).getClass();
        sm smVar = sm.e;
        lo0 lo0Var = m5.q;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            tgVar = (tg) m5.q.getValue();
        } else {
            tgVar = (tg) m5.r.get();
            if (tgVar == null) {
                z6.m("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        tg g = tgVar.g(smVar);
        p5 p5Var2 = (p5) g.j(b2.O);
        if (p5Var2 != null) {
            p5 p5Var3 = new p5(p5Var2);
            qx qxVar = (qx) p5Var3.g;
            synchronized (qxVar.a) {
                qxVar.d = false;
                p5Var = p5Var3;
            }
        } else {
            p5Var = 0;
        }
        ve0 ve0Var = new ve0();
        tg tgVar2 = (a30) g.j(b2.P);
        if (tgVar2 == null) {
            tgVar2 = new b30(view.getContext().getApplicationContext());
            ve0Var.e = tgVar2;
        }
        if (p5Var != 0) {
            smVar = p5Var;
        }
        tg g2 = g.g(smVar).g(tgVar2);
        le0 le0Var = new le0(g2);
        synchronized (le0Var.c) {
            le0Var.t = true;
        }
        mg a3 = t10.a(g2);
        ez p = u10.p(view);
        zy lifecycle = p != null ? p.getLifecycle() : null;
        if (lifecycle == null) {
            cv.c("ViewTreeLifecycleOwner not found from " + view);
            throw new id();
        }
        view.addOnAttachStateChangeListener(new ow0(view, le0Var));
        lifecycle.a(new qw0(a3, p5Var, le0Var, ve0Var));
        view.setTag(2131034155, le0Var);
        Handler handler = view.getHandler();
        int i = us.a;
        tg tgVar3 = new ts(handler, "windowRecomposer cleanup", false).j;
        d dVar = new d(le0Var, view, ngVar, 15);
        fh fhVar = fh.h;
        if ((2 & 1) != 0) {
            tgVar3 = sm.e;
        }
        int i2 = 2;
        if ((2 & 2) != 0) {
            fhVar = fh.e;
        }
        tg r = nh.r(sm.e, tgVar3, true);
        fi fiVar = pj.a;
        if (r != fiVar && r.j(b2.D) == null) {
            r = r.g(fiVar);
        }
        q pyVar = fhVar == fh.f ? new py(r, dVar) : new wm0(r, true);
        pyVar.d0(fhVar, pyVar, dVar);
        view.addOnAttachStateChangeListener(new q4(i2, pyVar));
        return le0Var;
    }
}
