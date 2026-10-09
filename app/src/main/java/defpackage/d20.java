package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class d20 implements cz {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d20(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                f20 f20Var = (f20) obj;
                f20Var.getClass();
                if (xyVar == xy.ON_DESTROY) {
                    f20Var.a();
                    break;
                }
                break;
            default:
                th0 th0Var = (th0) obj;
                if (xyVar != xy.ON_START) {
                    if (xyVar == xy.ON_STOP) {
                        th0Var.h = false;
                        break;
                    }
                } else {
                    th0Var.h = true;
                    break;
                }
                break;
        }
    }
}
