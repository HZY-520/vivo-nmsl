package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ve implements cz {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ ve(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                new HashMap();
                nr[] nrVarArr = (nr[]) obj;
                if (nrVarArr.length > 0) {
                    nr nrVar = nrVarArr[0];
                    throw null;
                }
                if (nrVarArr.length <= 0) {
                    return;
                }
                nr nrVar2 = nrVarArr[0];
                throw null;
            default:
                if (xyVar == xy.ON_CREATE) {
                    ezVar.getLifecycle().b(this);
                    ((nh0) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + xyVar).toString());
                }
        }
    }
}
