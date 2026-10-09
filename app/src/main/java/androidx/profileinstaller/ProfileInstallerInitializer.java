package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.ic0;
import defpackage.zu;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class ProfileInstallerInitializer implements zu {
    @Override // defpackage.zu
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.zu
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: pd0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                createAsync.postDelayed(new qd0(applicationContext, 0), nextInt + 5000);
            }
        });
        return new ic0(5);
    }
}
