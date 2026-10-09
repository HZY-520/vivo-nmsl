package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bb0 extends z {
    public final /* synthetic */ int e;
    public final wa0 f;

    public /* synthetic */ bb0(int i, wa0 wa0Var) {
        this.e = i;
        this.f = wa0Var;
    }

    @Override // defpackage.z
    public final int a() {
        int i = this.e;
        wa0 wa0Var = this.f;
        switch (i) {
        }
        return wa0Var.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        wa0 wa0Var = this.f;
        switch (i) {
            case 0:
                wa0Var.clear();
                break;
            default:
                wa0Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    wa0 wa0Var = this.f;
                    Object obj2 = wa0Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && wa0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        wa0 wa0Var = this.f;
        switch (i) {
            case 0:
                return new cb0(wa0Var);
            default:
                gr0[] gr0VarArr = new gr0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    gr0VarArr[i2] = new hr0(1);
                }
                return new db0(wa0Var, gr0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f.remove(entry.getKey(), entry.getValue());
            default:
                wa0 wa0Var = this.f;
                if (!wa0Var.containsKey(obj)) {
                    return false;
                }
                wa0Var.remove(obj);
                return true;
        }
    }
}
