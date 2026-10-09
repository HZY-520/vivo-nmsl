package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ai0 implements tq {
    public static final ai0 f = new ai0(0);
    public static final ai0 g = new ai0(1);
    public final /* synthetic */ int e;

    public /* synthetic */ ai0(int i) {
        this.e = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        String str;
        br brVar;
        switch (this.e) {
            case 0:
                long j = ((gc) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(lw.F(j));
            default:
                p0 p0Var = (p0) obj;
                p0 p0Var2 = (p0) obj2;
                if (p0Var == null || (str = p0Var.a) == null) {
                    str = p0Var2.a;
                }
                if (p0Var == null || (brVar = p0Var.b) == null) {
                    brVar = p0Var2.b;
                }
                return new p0(str, brVar);
        }
    }
}
