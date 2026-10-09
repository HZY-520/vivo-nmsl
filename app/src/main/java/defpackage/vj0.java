package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vj0 {
    public final qj0 a;
    public final z30 b;

    public vj0(uj0 uj0Var, vv vvVar) {
        List i;
        this.a = uj0Var.d;
        i = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
        this.b = new z30(i.size());
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            uj0 uj0Var2 = (uj0) i.get(i2);
            if (vvVar.a(uj0Var2.f)) {
                this.b.a(uj0Var2.f);
            }
        }
    }
}
