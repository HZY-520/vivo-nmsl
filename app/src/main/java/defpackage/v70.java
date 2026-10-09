package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v70 extends m80 {
    public static final v70 d;
    public static final v70 e;
    public static final v70 f;
    public static final v70 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new v70(i, 2, 0);
        int i2 = 1;
        e = new v70(i2, i2, 1);
        f = new v70(i, 2, 2);
        int i3 = 1;
        g = new v70(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v70(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        switch (this.c) {
            case 0:
                Object b = ((eq) o80Var.b(0)).b();
                er erVar = (er) o80Var.b(1);
                int a = o80Var.a(0);
                erVar.getClass();
                ol0Var.R(ol0Var.c(erVar), b);
                x6Var.d(a, b);
                x6Var.b(b);
                break;
            case 1:
                er erVar2 = (er) o80Var.b(0);
                int a2 = o80Var.a(0);
                x6Var.i();
                erVar2.getClass();
                x6Var.a(a2, ol0Var.A(ol0Var.c(erVar2)));
                break;
            case 2:
                Object b2 = o80Var.b(0);
                er erVar3 = (er) o80Var.b(1);
                int a3 = o80Var.a(0);
                if (b2 instanceof lr) {
                    lr lrVar = (lr) b2;
                    bf0Var.d.b(lrVar);
                    bf0Var.c.a(lrVar);
                }
                Object H = ol0Var.H(ol0Var.c(erVar3), a3, b2);
                if (!(H instanceof lr)) {
                    if (H instanceof de0) {
                        ((de0) H).c();
                        break;
                    }
                } else {
                    bf0Var.d((lr) H);
                    break;
                }
                break;
            default:
                Object b3 = o80Var.b(0);
                int a4 = o80Var.a(0);
                if (b3 instanceof lr) {
                    lr lrVar2 = (lr) b3;
                    bf0Var.d.b(lrVar2);
                    bf0Var.c.a(lrVar2);
                }
                Object H2 = ol0Var.H(ol0Var.t, a4, b3);
                if (!(H2 instanceof lr)) {
                    if (H2 instanceof de0) {
                        ((de0) H2).c();
                        break;
                    }
                } else {
                    bf0Var.d((lr) H2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.m80
    public er b(o80 o80Var) {
        switch (this.c) {
            case 0:
                return (er) o80Var.b(1);
            case 1:
                return (er) o80Var.b(0);
            default:
                return super.b(o80Var);
        }
    }
}
