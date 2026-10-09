package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n10 extends z {
    public final /* synthetic */ int e;
    public final m10 f;

    public /* synthetic */ n10(m10 m10Var, int i) {
        this.e = i;
        this.f = m10Var;
    }

    @Override // defpackage.z
    public final int a() {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
        }
        return m10Var.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
            case 0:
                m10Var.clear();
                break;
            default:
                m10Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int f = m10Var.f(entry.getKey());
                if (f < 0) {
                    return false;
                }
                Object[] objArr = m10Var.f;
                objArr.getClass();
                return lw.i(objArr[f], entry.getValue());
            default:
                return m10Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.f.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
        }
        return m10Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
            case 0:
                return new j10(m10Var, 0);
            default:
                return new j10(m10Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.e;
        m10 m10Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    m10Var.b();
                    int f = m10Var.f(entry.getKey());
                    if (f >= 0) {
                        Object[] objArr = m10Var.f;
                        objArr.getClass();
                        if (lw.i(objArr[f], entry.getValue())) {
                            m10Var.j(f);
                            break;
                        }
                    }
                }
                break;
            default:
                m10Var.b();
                int f2 = m10Var.f(obj);
                if (f2 >= 0) {
                    m10Var.j(f2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        m10 m10Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                m10Var.b();
                break;
            default:
                m10Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        m10 m10Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                m10Var.b();
                break;
            default:
                m10Var.b();
                break;
        }
        return super.retainAll(collection);
    }
}
