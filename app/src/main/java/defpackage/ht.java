package defpackage;

import android.content.Context;
import com.vivo.cnm.lico.MainActivityKt;
import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ht implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ ht(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // defpackage.eq
    public final Object b() {
        fs0 InfoCard$lambda$29$lambda$28$lambda$26$lambda$25;
        fs0 HomeRoute$lambda$5$lambda$4;
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                InfoCard$lambda$29$lambda$28$lambda$26$lambda$25 = HomeScreenKt.InfoCard$lambda$29$lambda$28$lambda$26$lambda$25(ad.a, context);
                return InfoCard$lambda$29$lambda$28$lambda$26$lambda$25;
            default:
                HomeRoute$lambda$5$lambda$4 = MainActivityKt.HomeRoute$lambda$5$lambda$4(context);
                return HomeRoute$lambda$5$lambda$4;
        }
    }
}
