package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l7 implements Collection {
    public final /* synthetic */ m7 e;

    public l7(m7 m7Var) {
        this.e = m7Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i7(this.e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        m7 m7Var = this.e;
        int a = m7Var.a(obj);
        if (a < 0) {
            return false;
        }
        m7Var.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        m7 m7Var = this.e;
        int i = m7Var.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(m7Var.h(i2))) {
                m7Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        m7 m7Var = this.e;
        int i = m7Var.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(m7Var.h(i2))) {
                m7Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        m7 m7Var = this.e;
        int i = m7Var.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = m7Var.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        m7 m7Var = this.e;
        int i = m7Var.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = m7Var.h(i2);
        }
        return objArr;
    }
}
