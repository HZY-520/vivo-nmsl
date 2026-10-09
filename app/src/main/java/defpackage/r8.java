package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class r8 implements q8, lw0 {
    public static final r8 e = new r8();
    public static final r8 f = new r8();

    @Override // defpackage.q8
    public Rect c(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.lw0
    public hw0 f(Context context, ti tiVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f2 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new hw0(bounds, f2);
    }
}
