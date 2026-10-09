package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w8 implements b20 {
    public final j8 a;
    public final boolean b;

    public w8(j8 j8Var, boolean z) {
        this.a = j8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return this.a.equals(w8Var.a) && this.b == w8Var.b;
    }

    @Override // defpackage.b20
    public final v00 f(final w00 w00Var, final List list, long j) {
        boolean isEmpty = list.isEmpty();
        vm vmVar = vm.e;
        if (isEmpty) {
            return w00Var.l0(wf.j(j), wf.i(j), vmVar, new l0(7, (byte) 0));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final w10 w10Var = (w10) list.get(0);
            w10Var.e();
            final ec0 b = w10Var.b(j2);
            final int max = Math.max(wf.j(j), b.e);
            final int max2 = Math.max(wf.i(j), b.f);
            return w00Var.l0(max, max2, vmVar, new pq() { // from class: u8
                @Override // defpackage.pq
                public final Object invoke(Object obj) {
                    t8.d((dc0) obj, ec0.this, w10Var, w00Var.getLayoutDirection(), max, max2, this.a);
                    return fs0.a;
                }
            });
        }
        final ec0[] ec0VarArr = new ec0[list.size()];
        final te0 te0Var = new te0();
        te0Var.e = wf.j(j);
        final te0 te0Var2 = new te0();
        te0Var2.e = wf.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w10 w10Var2 = (w10) list.get(i);
            w10Var2.e();
            ec0 b2 = w10Var2.b(j2);
            ec0VarArr[i] = b2;
            te0Var.e = Math.max(te0Var.e, b2.e);
            te0Var2.e = Math.max(te0Var2.e, b2.f);
        }
        return w00Var.l0(te0Var.e, te0Var2.e, vmVar, new pq() { // from class: v8
            @Override // defpackage.pq
            public final Object invoke(Object obj) {
                dc0 dc0Var = (dc0) obj;
                ec0[] ec0VarArr2 = ec0VarArr;
                int length = ec0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    ec0 ec0Var = ec0VarArr2[i3];
                    ec0Var.getClass();
                    t8.d(dc0Var, ec0Var, (w10) list.get(i4), w00Var.getLayoutDirection(), te0Var.e, te0Var2.e, this.a);
                    i3++;
                    i2 = i4 + 1;
                }
                return fs0.a;
            }
        });
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
