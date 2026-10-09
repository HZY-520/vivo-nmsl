package defpackage;

import com.vivo.cnm.lico.Gates;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class z2 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ ec0 f;

    public /* synthetic */ z2(ec0 ec0Var, int i) {
        this.e = i;
        this.f = ec0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ec0 ec0Var = this.f;
        dc0 dc0Var = (dc0) obj;
        switch (i) {
            case 0:
                dc0.e(dc0Var, ec0Var, 0, 0);
                break;
            case 1:
                dc0.h(dc0Var, ec0Var, 0, 0);
                break;
            case 2:
                dc0.h(dc0Var, ec0Var, 0, 0);
                break;
            case 3:
                dc0.i(dc0Var, ec0Var, 0, 0);
                break;
            case 4:
                dc0.h(dc0Var, ec0Var, 0, 0);
                break;
            case Gates.MAX_WINDOWS /* 5 */:
                dc0.e(dc0Var, ec0Var, 0, 0);
                break;
            default:
                dc0.h(dc0Var, ec0Var, 0, 0);
                break;
        }
        return fs0Var;
    }
}
