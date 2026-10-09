package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mg0 implements b20 {
    public static final mg0 b = new mg0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ mg0(int i) {
        this.a = i;
    }

    @Override // defpackage.b20
    public final v00 f(w00 w00Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                vm vmVar = vm.e;
                if (size == 0) {
                    return w00Var.l0(wf.j(j), wf.i(j), vmVar, new a60(14));
                }
                if (size == 1) {
                    ec0 b2 = ((w10) list.get(0)).b(j);
                    return w00Var.l0(xf.f(j, b2.e), xf.e(j, b2.f), vmVar, new z2(b2, 3));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    ec0 b3 = ((w10) list.get(i3)).b(j);
                    i = Math.max(b3.e, i);
                    i2 = Math.max(b3.f, i2);
                    arrayList.add(b3);
                }
                return w00Var.l0(xf.f(j, i), xf.e(j, i2), vmVar, new l(21, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
