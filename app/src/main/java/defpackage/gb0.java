package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gb0 extends m {
    public final ya0 e;

    public gb0(ya0 ya0Var) {
        this.e = ya0Var;
    }

    @Override // defpackage.m
    public final int a() {
        return this.e.f;
    }

    @Override // defpackage.m, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        fr0 fr0Var = this.e.e;
        gr0[] gr0VarArr = new gr0[8];
        for (int i = 0; i < 8; i++) {
            gr0VarArr[i] = new hr0(2);
        }
        return new fb0(fr0Var, gr0VarArr);
    }
}
