package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class aw0 extends t30 {
    public final WindowInsetsController a;
    public final Window b;

    public aw0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    public final void D(boolean z, int i, int i2) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (~i));
        }
    }

    @Override // defpackage.t30
    public void u(boolean z) {
        D(z, 16, 16);
    }

    @Override // defpackage.t30
    public void v(boolean z) {
        D(z, 8192, 8);
    }
}
