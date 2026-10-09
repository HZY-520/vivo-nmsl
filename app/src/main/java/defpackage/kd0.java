package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kd0 extends qm {
    final /* synthetic */ ld0 this$0;

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class a extends qm {
        final /* synthetic */ ld0 this$0;

        public a(ld0 ld0Var) {
            this.this$0 = ld0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ld0 ld0Var = this.this$0;
            int i = ld0Var.e + 1;
            ld0Var.e = i;
            if (i == 1 && ld0Var.h) {
                ld0Var.j.e(xy.ON_START);
                ld0Var.h = false;
            }
        }
    }

    public kd0(ld0 ld0Var) {
        this.this$0 = ld0Var;
    }

    @Override // defpackage.qm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = jf0.f;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((jf0) findFragmentByTag).e = this.this$0.l;
        }
    }

    @Override // defpackage.qm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ld0 ld0Var = this.this$0;
        int i = ld0Var.f - 1;
        ld0Var.f = i;
        if (i == 0) {
            Handler handler = ld0Var.i;
            handler.getClass();
            handler.postDelayed(ld0Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        bg.i(activity, new a(this.this$0));
    }

    @Override // defpackage.qm, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ld0 ld0Var = this.this$0;
        int i = ld0Var.e - 1;
        ld0Var.e = i;
        if (i == 0 && ld0Var.g) {
            ld0Var.j.e(xy.ON_STOP);
            ld0Var.h = true;
        }
    }
}
