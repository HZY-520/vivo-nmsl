package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ll extends vd0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll(eq eqVar, int i) {
        super(eqVar);
        this.b = i;
    }

    @Override // defpackage.vd0
    public final xd0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new xd0(this, obj, obj == null, b2.W, null, true);
            default:
                return new xd0(this, obj, obj == null, null, null, false);
        }
    }
}
