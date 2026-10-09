package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class so implements pq {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ so(int i, Collection collection) {
        this.f = i;
        this.g = collection;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        boolean w0;
        int i = this.e;
        Object obj2 = this.g;
        int i2 = this.f;
        switch (i) {
            case 0:
                w0 = ((yo) obj).w0(i2);
                ((ve0) obj2).e = Boolean.valueOf(w0);
                break;
            default:
                w0 = ((List) obj).addAll(i2, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(w0);
    }

    public /* synthetic */ so(ve0 ve0Var, int i) {
        this.g = ve0Var;
        this.f = i;
    }
}
