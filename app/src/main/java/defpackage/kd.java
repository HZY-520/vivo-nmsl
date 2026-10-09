package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class kd implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ kd(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.eq
    public final Object b() {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = 0;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                d70 d70Var = new d70(new ld(mainActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (lw.i(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.getLifecycle().a(new md(i2, d70Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new w3(1, mainActivity, d70Var));
                    }
                }
                return d70Var;
            case 1:
                mainActivity.reportFullyDrawn();
                return fs0Var;
            case 2:
                return xd.d(mainActivity);
            case 3:
                ij ijVar = new ij();
                f50 navigationEventDispatcher = mainActivity.getNavigationEventDispatcher();
                if (navigationEventDispatcher.c.add(ijVar)) {
                    navigationEventDispatcher.b.a(navigationEventDispatcher, ijVar, -1);
                }
                return ijVar;
            case 4:
                return new vh0(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            case Gates.MAX_WINDOWS /* 5 */:
                return lr0.v(mainActivity);
            default:
                mainActivity.getLifecycle().a(new ne0(mainActivity, i2));
                return fs0Var;
        }
    }
}
