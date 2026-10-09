package defpackage;

/* loaded from: /tmp/classes.dex */
public final class io extends og {
    public yj e;
    public /* synthetic */ Object f;
    public int g;
    public final /* synthetic */ yj h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(yj yjVar, ng ngVar) {
        super(ngVar);
        this.h = yjVar;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.d(null, this);
    }
}
