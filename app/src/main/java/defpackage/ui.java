package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ui implements ti, lw0 {
    public static final ui e = new ui();
    public static final ui f = new ui();

    @Override // defpackage.ti
    public float d(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.lw0
    public hw0 f(Context context, ti tiVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new hw0(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
