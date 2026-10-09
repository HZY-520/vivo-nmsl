package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i3 extends og {
    public z30 e;
    public n9 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ k3 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, og ogVar) {
        super(ogVar);
        this.h = k3Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(this);
    }
}
