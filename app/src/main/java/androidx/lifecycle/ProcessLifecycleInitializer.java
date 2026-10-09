package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.az;
import defpackage.bz;
import defpackage.kd0;
import defpackage.ld0;
import defpackage.um;
import defpackage.v6;
import defpackage.xy;
import defpackage.z6;
import defpackage.zu;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ProcessLifecycleInitializer implements zu {
    @Override // defpackage.zu
    public final List a() {
        return um.e;
    }

    @Override // defpackage.zu
    public final Object b(Context context) {
        context.getClass();
        v6 q = v6.q(context);
        q.getClass();
        if (!((HashSet) q.b).contains(ProcessLifecycleInitializer.class)) {
            z6.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!bz.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new az());
        }
        ld0 ld0Var = ld0.m;
        ld0Var.getClass();
        ld0Var.i = new Handler();
        ld0Var.j.e(xy.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new kd0(ld0Var));
        return ld0Var;
    }
}
