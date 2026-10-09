package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class o10 extends AbstractCollection implements Collection, fx {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ o10(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((m10) obj).clear();
                break;
            default:
                ((wa0) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((m10) obj2).containsValue(obj);
            default:
                return ((wa0) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((m10) this.f).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new j10((m10) obj, 2);
            default:
                wa0 wa0Var = (wa0) obj;
                gr0[] gr0VarArr = new gr0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    gr0VarArr[i2] = new hr0(2);
                }
                return new db0(wa0Var, gr0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                m10 m10Var = (m10) this.f;
                m10Var.b();
                int g = m10Var.g(obj);
                if (g < 0) {
                    return false;
                }
                m10Var.j(g);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((m10) this.f).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((m10) this.f).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((m10) obj).m;
            default:
                return ((wa0) obj).i;
        }
    }
}
