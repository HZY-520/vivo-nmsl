package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yc implements b20, rg0 {
    public final e7 a;

    public yc(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // defpackage.rg0
    public final v00 a(ec0[] ec0VarArr, w00 w00Var, int[] iArr, int i, int i2) {
        return w00Var.l0(i2, i, vm.e, new xc(ec0VarArr, this, i2, w00Var, iArr));
    }

    @Override // defpackage.rg0
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? xf.a(0, i3, i, i2) : lw.s(0, i3, i, i2);
    }

    @Override // defpackage.rg0
    public final int c(ec0 ec0Var) {
        return ec0Var.e;
    }

    @Override // defpackage.rg0
    public final void d(int i, w00 w00Var, int[] iArr, int[] iArr2) {
        this.a.h(i, w00Var, iArr, iArr2);
    }

    @Override // defpackage.rg0
    public final int e(ec0 ec0Var) {
        return ec0Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc) || !this.a.equals(((yc) obj).a)) {
            return false;
        }
        h8 h8Var = b2.q;
        return h8Var.equals(h8Var);
    }

    @Override // defpackage.b20
    public final v00 f(w00 w00Var, List list, long j) {
        return j20.i(this, wf.i(j), wf.j(j), wf.g(j), wf.h(j), w00Var.D(this.a.a()), w00Var, list, new ec0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + b2.q + ")";
    }
}
