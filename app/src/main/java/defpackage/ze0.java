package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ze0 extends og {
    public /* synthetic */ Object e;
    public final /* synthetic */ af0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(af0 af0Var, og ogVar) {
        super(ogVar);
        this.f = af0Var;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0.0f, this);
    }
}
