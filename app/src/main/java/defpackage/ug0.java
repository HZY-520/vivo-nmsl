package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ug0 implements b20, rg0 {
    public final a7 a;
    public final i8 b;

    public ug0(a7 a7Var, i8 i8Var) {
        this.a = a7Var;
        this.b = i8Var;
    }

    @Override // defpackage.rg0
    public final v00 a(ec0[] ec0VarArr, w00 w00Var, int[] iArr, int i, int i2) {
        return w00Var.l0(i, i2, vm.e, new xc(ec0VarArr, this, i2, iArr));
    }

    @Override // defpackage.rg0
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? xf.a(i, i2, 0, i3) : lw.t(i, i2, 0, i3);
    }

    @Override // defpackage.rg0
    public final int c(ec0 ec0Var) {
        return ec0Var.f;
    }

    @Override // defpackage.rg0
    public final void d(int i, w00 w00Var, int[] iArr, int[] iArr2) {
        this.a.e(w00Var, i, iArr, w00Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.rg0
    public final int e(ec0 ec0Var) {
        return ec0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) obj;
        return this.a.equals(ug0Var.a) && this.b.equals(ug0Var.b);
    }

    @Override // defpackage.b20
    public final v00 f(w00 w00Var, List list, long j) {
        return j20.i(this, wf.j(j), wf.i(j), wf.h(j), wf.g(j), w00Var.D(this.a.a()), w00Var, list, new ec0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
