package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fe extends og {
    public Object e;
    public bw f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ he j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(he heVar, og ogVar) {
        super(ogVar);
        this.j = heVar;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
