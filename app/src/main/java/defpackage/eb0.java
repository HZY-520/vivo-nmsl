package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eb0 extends m0 {
    public final /* synthetic */ int e;
    public final ya0 f;

    public /* synthetic */ eb0(ya0 ya0Var, int i) {
        this.e = i;
        this.f = ya0Var;
    }

    @Override // defpackage.m
    public final int a() {
        int i = this.e;
        ya0 ya0Var = this.f;
        switch (i) {
        }
        return ya0Var.f;
    }

    @Override // defpackage.m, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.e;
        ya0 ya0Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = ya0Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && ya0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return ya0Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        ya0 ya0Var = this.f;
        switch (i) {
            case 0:
                fr0 fr0Var = ya0Var.e;
                gr0[] gr0VarArr = new gr0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    gr0VarArr[i2] = new hr0(0);
                }
                return new fb0(fr0Var, gr0VarArr);
            default:
                fr0 fr0Var2 = ya0Var.e;
                gr0[] gr0VarArr2 = new gr0[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    gr0VarArr2[i3] = new hr0(1);
                }
                return new fb0(fr0Var2, gr0VarArr2);
        }
    }
}
