package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i9 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i9(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                ((ka) this.f).cancel();
                return fs0.a;
            case 1:
                vl0 vl0Var = (vl0) obj;
                synchronized (xl0.c) {
                    j = xl0.e;
                    xl0.e = 1 + j;
                }
                return new ae0(j, vl0Var, (pq) this.f);
            default:
                Throwable th = (Throwable) obj;
                jo0 jo0Var = (jo0) this.f;
                ja jaVar = jo0Var.g;
                if (jaVar != null) {
                    jaVar.i(th);
                }
                jo0Var.g = null;
                return fs0.a;
        }
    }
}
