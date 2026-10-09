package defpackage;

import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class f10 implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ f10(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 onCreate$lambda$2$lambda$1;
        fs0 onCreate$lambda$2;
        fs0 onCreate$lambda$2$lambda$1$lambda$0;
        int i = this.e;
        MainActivity mainActivity = this.f;
        se seVar = (se) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                onCreate$lambda$2$lambda$1 = MainActivity.onCreate$lambda$2$lambda$1(mainActivity, seVar, intValue);
                return onCreate$lambda$2$lambda$1;
            case 1:
                onCreate$lambda$2 = MainActivity.onCreate$lambda$2(mainActivity, seVar, intValue);
                return onCreate$lambda$2;
            default:
                onCreate$lambda$2$lambda$1$lambda$0 = MainActivity.onCreate$lambda$2$lambda$1$lambda$0(mainActivity, seVar, intValue);
                return onCreate$lambda$2$lambda$1$lambda$0;
        }
    }
}
