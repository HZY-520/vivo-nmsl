package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.jf0;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class hf0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, xy xyVar) {
        xyVar.getClass();
        if (activity instanceof ez) {
            zy lifecycle = ((ez) activity).getLifecycle();
            if (lifecycle instanceof gz) {
                ((gz) lifecycle).e(xyVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            jf0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new jf0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new jf0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
