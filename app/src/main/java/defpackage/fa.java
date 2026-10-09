package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fa implements m60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((pq) obj).getClass().getSimpleName() + '@' + nh.y(this) + ']';
            default:
                return "DisposeOnCancel[" + ((tj) obj) + ']';
        }
    }
}
