package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q40 implements List, gx {
    public final t40 e;

    public q40(t40 t40Var) {
        this.e = t40Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.e.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        t40 t40Var = this.e;
        return t40Var.e(t40Var.g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.e.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.e.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u40.a(i, this);
        return this.e.e[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        t40 t40Var = this.e;
        Object[] objArr = t40Var.e;
        int i = t40Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (lw.i(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s40(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        t40 t40Var = this.e;
        Object[] objArr = t40Var.e;
        for (int i = t40Var.g - 1; i >= 0; i--) {
            if (lw.i(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new s40(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        u40.a(i, this);
        return this.e.j(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        t40 t40Var = this.e;
        int i = t40Var.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            t40Var.i(it.next());
        }
        return i != t40Var.g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        t40 t40Var = this.e;
        int i = t40Var.g;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(t40Var.e[i2])) {
                t40Var.j(i2);
            }
        }
        return i != t40Var.g;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        u40.a(i, this);
        Object[] objArr = this.e.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        u40.b(this, i, i2);
        return new r40(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lr0.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lr0.L(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.e.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new s40(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.e.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.i(obj);
    }
}
