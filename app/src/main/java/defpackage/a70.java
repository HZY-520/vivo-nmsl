package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a70 implements OnBackAnimationCallback {
    public final /* synthetic */ y60 a;

    public a70(y60 y60Var) {
        this.a = y60Var;
    }

    public final void onBackCancelled() {
        y60 y60Var = this.a;
        f50 f50Var = y60Var.a;
        if (f50Var == null) {
            z6.m("This input is not added to any dispatcher.");
            return;
        }
        if (!y60Var.b) {
            f50Var.b(y60Var, null);
        }
        i50 i50Var = f50Var.b;
        if (y60Var.equals(i50Var.f) && -1 == i50Var.e) {
            i50Var.b();
            i50Var.e = 0;
            i50Var.f = null;
            i50Var.a.i(null, j50.a);
        }
        y60Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        e50 a = v10.a(backEvent);
        y60 y60Var = this.a;
        f50 f50Var = y60Var.a;
        if (f50Var == null) {
            z6.m("This input is not added to any dispatcher.");
            return;
        }
        if (y60Var.b) {
            i50 i50Var = f50Var.b;
            if (y60Var.equals(i50Var.f) && -1 == i50Var.e) {
                i50Var.b();
                i50Var.a.i(null, new k50(a));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        e50 a = v10.a(backEvent);
        y60 y60Var = this.a;
        f50 f50Var = y60Var.a;
        if (f50Var == null) {
            z6.m("This input is not added to any dispatcher.");
        } else {
            if (y60Var.b) {
                return;
            }
            f50Var.b(y60Var, a);
            y60Var.b = true;
        }
    }
}
