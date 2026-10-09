package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a00 extends y implements RandomAccess, Serializable {
    public static final a00 h;
    public Object[] e;
    public int f;
    public boolean g;

    static {
        a00 a00Var = new a00(0);
        a00Var.g = true;
        h = a00Var;
    }

    public a00(int i) {
        if (i >= 0) {
            this.e = new Object[i];
        } else {
            z6.l("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.y
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return;
        }
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        d(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.y
    public final Object b(int i) {
        f();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return h(i);
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        g(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.e[i + i3] = it.next();
        }
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (lw.i(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i2) {
        int i3 = this.f + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.e;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArr = Arrays.copyOf(objArr, i4);
            this.e = objArr;
        }
        o7.R(objArr, objArr, i + i2, i, this.f);
        this.f += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return this.e[i];
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        o7.R(objArr, objArr, i, i + 1, this.f);
        Object[] objArr2 = this.e;
        int i2 = this.f - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.e;
        int i = this.f;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.e;
        o7.R(objArr, objArr, i, i + i2, this.f);
        Object[] objArr2 = this.e;
        int i3 = this.f;
        nh.d0(objArr2, i3 - i2, i3);
        this.f -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f; i++) {
            if (lw.i(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.e;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.e;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        o7.R(objArr, objArr, i + i4, i2 + i, this.f);
        Object[] objArr3 = this.e;
        int i7 = this.f;
        nh.d0(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f - 1; i >= 0; i--) {
            if (lw.i(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            return new zs(this, i);
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        f();
        return j(0, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        f();
        return j(0, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        q3.j(i, i2, this.f);
        return new zz(this.e, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f;
        Object[] objArr2 = this.e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        o7.R(objArr2, objArr, 0, 0, i);
        int i2 = this.f;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return nh.h0(this.e, 0, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f;
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.e[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return o7.U(this.e, 0, this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        f();
        int size = collection.size();
        d(this.f, collection, size);
        return size > 0;
    }
}
