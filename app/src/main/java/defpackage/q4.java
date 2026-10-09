package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q4(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                r4 r4Var = (r4) this.f;
                Context context = view.getContext();
                if (!r4Var.a) {
                    context.getApplicationContext().registerComponentCallbacks((p4) r4Var.e);
                    r4Var.a = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                r4 r4Var = (r4) obj;
                Context context = view.getContext();
                if (r4Var.a) {
                    context.getApplicationContext().unregisterComponentCallbacks((p4) r4Var.e);
                    r4Var.a = false;
                    break;
                }
                break;
            case 1:
                p pVar = (p) obj;
                ViewParent parent = pVar.getParent();
                for (Object obj2 : parent == null ? xm.a : new pr(new f5(14, parent), xt0.m)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(2131034177);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                pVar.d();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((wm0) obj).b(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
