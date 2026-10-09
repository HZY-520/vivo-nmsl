package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y60 extends h50 {
    public final OnBackInvokedDispatcher c;
    public final OnBackInvokedCallback d;
    public boolean e;

    public y60(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: z60
            public final void onBackInvoked() {
                y60.this.a();
            }
        } : new a70(this);
    }

    @Override // defpackage.h50
    public final void b() {
        if (this.e) {
            this.c.unregisterOnBackInvokedCallback(this.d);
            this.e = false;
        }
    }
}
