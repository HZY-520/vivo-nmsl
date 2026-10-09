package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class r40 implements List, gx {
    public final List e;
    public final int f;
    public int g;

    public r40(List list, int i, int i2) {
        this.e = list;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.e.add(i + this.f, obj);
        this.g++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.e.addAll(i + this.f, collection);
        int size = collection.size();
        this.g += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.g - 1;
        int i2 = this.f;
        if (i2 <= i) {
            while (true) {
                this.e.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.g = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.g;
        for (int i2 = this.f; i2 < i; i2++) {
            if (lw.i(this.e.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u40.a(i, this);
        return this.e.get(i + this.f);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.g;
        int i2 = this.f;
        for (int i3 = i2; i3 < i; i3++) {
            if (lw.i(this.e.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == this.f;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s40(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.g - 1;
        int i2 = this.f;
        if (i2 > i) {
            return -1;
        }
        while (!lw.i(this.e.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new s40(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.g;
        for (int i2 = this.f; i2 < i; i2++) {
            List list = this.e;
            if (lw.i(list.get(i2), obj)) {
                list.remove(i2);
                this.g--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.g;
        int i2 = i - 1;
        int i3 = this.f;
        if (i3 <= i2) {
            while (true) {
                List list = this.e;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.g--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.g;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        u40.a(i, this);
        return this.e.set(i + this.f, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g - this.f;
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
    public final ListIterator listIterator(int i) {
        return new s40(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.g;
        this.g = i + 1;
        this.e.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.e.addAll(this.g, collection);
        int size = collection.size();
        this.g += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        u40.a(i, this);
        this.g--;
        return this.e.remove(i + this.f);
    }
}
