package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.view.SurfaceControl;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract /* synthetic */ class m2 {
    public static /* synthetic */ BlendModeColorFilter d(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* bridge */ /* synthetic */ SurfaceControl e(Object obj) {
        return (SurfaceControl) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return SurfaceControl.class;
    }

    public static /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof SurfaceControl;
    }
}
