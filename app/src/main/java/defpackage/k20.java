package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k20 {
    public final SparseArray a;
    public rr0 b;

    public k20(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(rr0 rr0Var, int i, int i2) {
        int a = rr0Var.a(i);
        SparseArray sparseArray = this.a;
        k20 k20Var = (k20) sparseArray.get(a);
        if (k20Var == null) {
            k20Var = new k20(1);
            sparseArray.put(rr0Var.a(i), k20Var);
        }
        if (i2 > i) {
            k20Var.a(rr0Var, i + 1, i2);
        } else {
            k20Var.b = rr0Var;
        }
    }
}
