package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dl extends go0 implements uq {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl(int i, ng ngVar, int i2) {
        super(i, ngVar);
        this.e = i2;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((s60) obj2).a;
                new dl(i2, (ng) obj3, 0).invokeSuspend(fs0Var);
                return fs0Var;
            case 1:
                ((Number) obj2).floatValue();
                new dl(i2, (ng) obj3, 1).invokeSuspend(fs0Var);
                return fs0Var;
            default:
                if (obj != null) {
                    z6.c();
                    return null;
                }
                long j2 = ((s60) obj2).a;
                new dl(i2, (ng) obj3, 2).invokeSuspend(fs0Var);
                return fs0Var;
        }
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                t30.z(obj);
                break;
            case 1:
                t30.z(obj);
                break;
            default:
                t30.z(obj);
                break;
        }
        return fs0Var;
    }
}
