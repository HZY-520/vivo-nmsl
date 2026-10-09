package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class bx0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yw0 a(p pVar, pe peVar, be beVar) {
        e3 e3Var;
        yw0 yw0Var;
        if (as.a.compareAndSet(false, true)) {
            o9 a2 = lw.a(1, 6, null);
            q3.A(t10.a((tg) m5.q.getValue()), null, new f(a2, null), 3);
            l lVar = new l(13, a2);
            synchronized (xl0.c) {
                xl0.i = ac.h0(xl0.i, lVar);
            }
            xl0.c();
        }
        if (pVar.getChildCount() > 0) {
            View childAt = pVar.getChildAt(0);
            e3Var = childAt instanceof e3 ? (e3) childAt : null;
            if (e3Var != null) {
                e3Var.setComposeViewContext(peVar);
                if (e3Var == null) {
                    e3Var = new e3(pVar.getContext(), peVar);
                    pVar.addView(e3Var.getView(), a);
                }
                e3Var.setComposeViewContext(peVar);
                if (pVar.getComposeViewContext$ui() != null) {
                    peVar.e();
                    e3Var.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = e3Var.getTag(2131034221);
                yw0Var = tag instanceof yw0 ? (yw0) tag : null;
                if (yw0Var == null) {
                    iy root = e3Var.getRoot();
                    v6 v6Var = new v6();
                    v6Var.a = root;
                    v6Var.b = new ArrayList();
                    v6Var.c = root;
                    yw0Var = new yw0(e3Var, new cf(peVar.c(), v6Var));
                    e3Var.setTag(2131034221, yw0Var);
                }
                yw0Var.f(beVar);
                e3Var.setFrameEndScheduler$ui(new ax0(peVar.c()));
                return yw0Var;
            }
        } else {
            pVar.removeAllViews();
        }
        e3Var = null;
        if (e3Var == null) {
        }
        e3Var.setComposeViewContext(peVar);
        if (pVar.getComposeViewContext$ui() != null) {
        }
        Object tag2 = e3Var.getTag(2131034221);
        if (tag2 instanceof yw0) {
        }
        if (yw0Var == null) {
        }
        yw0Var.f(beVar);
        e3Var.setFrameEndScheduler$ui(new ax0(peVar.c()));
        return yw0Var;
    }
}
