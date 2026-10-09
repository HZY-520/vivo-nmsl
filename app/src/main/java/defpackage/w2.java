package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.vivo.cnm.lico.Gates;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class w2 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ e3 f;

    public /* synthetic */ w2(e3 e3Var, int i) {
        this.e = i;
        this.f = e3Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        e3 e3Var = this.f;
        switch (i) {
            case 0:
                eq eqVar = (eq) obj;
                Handler handler = e3Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    eqVar.b();
                } else {
                    Handler handler2 = e3Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new u2(eqVar, 0));
                    }
                }
                return fs0Var;
            case 1:
                ro focusOwner = e3Var.getFocusOwner();
                int i2 = ((lo) obj).a;
                uo uoVar = (uo) focusOwner;
                e3 e3Var2 = uoVar.a;
                ve0 ve0Var = new ve0();
                ve0Var.e = Boolean.FALSE;
                yo f = uoVar.f();
                Boolean e = uoVar.e(i2, e3Var2.getEmbeddedViewFocusRect(), new so(ve0Var, i2));
                if ((!lw.i(e, Boolean.TRUE) || f == uoVar.f()) && e != null && ve0Var.e != null && e.booleanValue()) {
                    ((Boolean) ve0Var.e).getClass();
                }
                return fs0Var;
            case 2:
                return e3Var.getSavedStateRegistry();
            case 3:
                return Boolean.valueOf(e3Var.getScrollCaptureInProgress());
            case 4:
                return e3Var.getInputModeManager();
            case Gates.MAX_WINDOWS /* 5 */:
                return e3Var.getTextInputService();
            case 6:
                return e3Var.getSoftwareKeyboardController();
            case 7:
                return e3Var.getTextToolbar();
            default:
                return e3Var.getPointerIconService();
        }
    }
}
