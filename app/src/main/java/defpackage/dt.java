package defpackage;

import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class dt implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ dt(int i, int i2) {
        this.e = i2;
        this.f = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 Header$lambda$4;
        fs0 GestureGuideCard$lambda$12;
        fs0 InfoCard$lambda$30;
        int i = this.e;
        se seVar = (se) obj;
        int intValue = ((Integer) obj2).intValue();
        int i2 = this.f;
        switch (i) {
            case 0:
                Header$lambda$4 = HomeScreenKt.Header$lambda$4(i2, seVar, intValue);
                return Header$lambda$4;
            case 1:
                GestureGuideCard$lambda$12 = HomeScreenKt.GestureGuideCard$lambda$12(i2, seVar, intValue);
                return GestureGuideCard$lambda$12;
            default:
                InfoCard$lambda$30 = HomeScreenKt.InfoCard$lambda$30(i2, seVar, intValue);
                return InfoCard$lambda$30;
        }
    }
}
