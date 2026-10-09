package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class wl extends vl {
    @Override // defpackage.ul
    public void b(mo0 mo0Var, mo0 mo0Var2, Window window, View view, boolean z, boolean z2) {
        mo0Var.getClass();
        mo0Var2.getClass();
        window.getClass();
        view.getClass();
        z20.t(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        t30 bw0Var = i >= 35 ? new bw0(window) : i >= 30 ? new aw0(window) : new zv0(window);
        bw0Var.v(!z);
        bw0Var.u(!z2);
    }
}
