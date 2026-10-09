package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a3 extends t20 implements x8, sj0, nx, ay, dr0 {
    public final l s = new l(4, this);
    public final /* synthetic */ e3 t;

    public a3(e3 e3Var) {
        this.t = e3Var;
    }

    @Override // defpackage.nx
    public final boolean F(KeyEvent keyEvent) {
        lo loVar;
        int[] iArr = oo.a;
        long b = lr0.b(keyEvent.getKeyCode());
        if (lx.a(b, lx.b)) {
            loVar = new lo(2);
        } else if (lx.a(b, lx.c)) {
            loVar = new lo(1);
        } else if (lx.a(b, lx.i)) {
            loVar = new lo(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            loVar = lx.a(b, lx.g) ? new lo(4) : lx.a(b, lx.f) ? new lo(3) : (lx.a(b, lx.d) || lx.a(b, lx.m)) ? new lo(5) : (lx.a(b, lx.e) || lx.a(b, lx.n)) ? new lo(6) : (lx.a(b, lx.h) || lx.a(b, lx.k) || lx.a(b, lx.o)) ? new lo(7) : (lx.a(b, lx.a) || lx.a(b, lx.l)) ? new lo(8) : null;
        }
        if (loVar != null) {
            int i = loVar.a;
            if (t10.r(keyEvent) == 2) {
                e3 e3Var = this.t;
                ((uo) e3Var.getFocusOwner()).f();
                Boolean e = ((uo) e3Var.getFocusOwner()).e(i, e3Var.getEmbeddedViewFocusRect(), new l(3, loVar));
                if (e == null) {
                    return true;
                }
                if (e.booleanValue()) {
                    e3Var.getPlayNavigationSoundEffect$ui().invoke(loVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer b2 = oo.b(i);
                int intValue = b2 != null ? b2.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = e3Var.getRootView();
                rootView.getClass();
                View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, e3Var.getView(), intValue);
                if (findNextFocus == null || findNextFocus.equals(e3Var)) {
                    return ((uo) e3Var.getFocusOwner()).g(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        ec0 b = w10Var.b(j);
        return w00Var.k0(b.e, b.f, vm.e, this.s, new z2(b, 0));
    }

    @Override // defpackage.x8
    public final Object V(d60 d60Var, s2 s2Var, go0 go0Var) {
        long K0 = d60Var.K0(0L);
        oe0 oe0Var = (oe0) s2Var.b();
        oe0 f = oe0Var != null ? oe0Var.f(K0) : null;
        if (f != null) {
            this.t.requestRectangleOnScreen(new Rect((int) f.a, (int) f.b, (int) f.c, (int) f.d), false);
        }
        return fs0.a;
    }

    @Override // defpackage.dr0
    public final Object i() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
    }
}
