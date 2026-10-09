package defpackage;

import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class zd implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zd(xd0[] xd0VarArr, be beVar, int i) {
        this.e = 1;
        this.h = xd0VarArr;
        this.f = beVar;
        this.g = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 InfoRow$lambda$32;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = this.g;
        Object obj3 = this.h;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((be) obj4).d(obj3, (se) obj, v10.q(i2) | 1);
                return fs0Var;
            case 1:
                ((Integer) obj2).getClass();
                nh.c((xd0[]) obj3, (be) obj4, (se) obj, v10.q(i2 | 1));
                return fs0Var;
            default:
                InfoRow$lambda$32 = HomeScreenKt.InfoRow$lambda$32((String) obj4, (String) obj3, i2, (se) obj, ((Integer) obj2).intValue());
                return InfoRow$lambda$32;
        }
    }

    public /* synthetic */ zd(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.h = obj2;
        this.g = i;
    }
}
