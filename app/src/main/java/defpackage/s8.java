package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s8 implements b20 {
    public static final s8 b = new s8(0);
    public static final s8 c = new s8(1);
    public static final l0 d = new l0(19, (byte) 0);
    public static final s8 e = new s8(2);
    public static final s8 f = new s8(3);
    public final /* synthetic */ int a;

    public /* synthetic */ s8(int i) {
        this.a = i;
    }

    @Override // defpackage.b20
    public final v00 f(w00 w00Var, List list, long j) {
        int i = this.a;
        int i2 = 25;
        vm vmVar = vm.e;
        switch (i) {
            case 0:
                return w00Var.l0(wf.j(j), wf.i(j), vmVar, new l0(6, (byte) 0));
            case 1:
                return w00Var.l0(wf.h(j), wf.g(j), vmVar, d);
            case 2:
                return w00Var.l0(wf.j(j), wf.i(j), vmVar, new l0(25, (byte) 0));
            default:
                return w00Var.l0(wf.f(j) ? wf.h(j) : 0, wf.e(j) ? wf.g(j) : 0, vmVar, new zh0(i2));
        }
    }
}
