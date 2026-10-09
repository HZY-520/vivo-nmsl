package defpackage;

import android.content.Context;
import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ia implements uq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ia(d50 d50Var, c50 c50Var) {
        this.e = 2;
        this.f = d50Var;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        fs0 InfoCard$lambda$29;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((l) obj4).invoke((Throwable) obj);
                break;
            case 1:
                InfoCard$lambda$29 = HomeScreenKt.InfoCard$lambda$29((Context) obj4, (zc) obj, (se) obj2, ((Integer) obj3).intValue());
                break;
            case 2:
                d50 d50Var = (d50) obj4;
                d50.h.set(d50Var, null);
                d50Var.d(null);
                break;
            default:
                ((gk0) obj4).b();
                break;
        }
        return fs0Var;
    }

    public /* synthetic */ ia(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
