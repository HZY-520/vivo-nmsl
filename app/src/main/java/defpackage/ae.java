package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ae extends a2 implements tq {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.l = i3;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.l;
        fs0 fs0Var = fs0.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((be) obj3).a((se) obj, ((Number) obj2).intValue());
                break;
            case 1:
                ej0 ej0Var = (ej0) obj3;
                q3.A(ej0Var.N.j(), null, new k0(ej0Var, ((ft0) obj).a, null, 2), 3);
                break;
            default:
                ej0 ej0Var2 = (ej0) obj3;
                q3.A(ej0Var2.N.j(), null, new k0(ej0Var2, ((ft0) obj).a, null, 3), 3);
                break;
        }
        return fs0Var;
    }
}
