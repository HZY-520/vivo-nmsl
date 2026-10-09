package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zz extends y implements RandomAccess, Serializable {
    public Object[] e;
    public final int f;
    public int g;
    public final zz h;
    public final a00 i;

    public zz(Object[] objArr, int i, int i2, zz zzVar, a00 a00Var) {
        int i3;
        objArr.getClass();
        this.e = objArr;
        this.f = i;
        this.g = i2;
        this.h = zzVar;
        this.i = a00Var;
        i3 = ((AbstractList) a00Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.y
    public final int a() {
        f();
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
        } else {
            e(this.f + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        d(this.f + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.y
    public final Object b(int i) {
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return h(this.f + i);
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f, this.g);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        a00 a00Var = this.i;
        zz zzVar = this.h;
        if (zzVar != null) {
            zzVar.d(i, collection, i2);
        } else {
            a00 a00Var2 = a00.h;
            a00Var.d(i, collection, i2);
        }
        this.e = a00Var.e;
        this.g += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        a00 a00Var = this.i;
        zz zzVar = this.h;
        if (zzVar != null) {
            zzVar.e(i, obj);
        } else {
            a00 a00Var2 = a00.h;
            a00Var.e(i, obj);
        }
        this.e = a00Var.e;
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.g;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (lw.i(objArr[this.f + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.i).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.i.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.e[this.f + i];
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        zz zzVar = this.h;
        if (zzVar != null) {
            h = zzVar.h(i);
        } else {
            a00 a00Var = a00.h;
            h = this.i.h(i);
        }
        this.g--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.e;
        int i = this.g;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        zz zzVar = this.h;
        if (zzVar != null) {
            zzVar.i(i, i2);
        } else {
            a00 a00Var = a00.h;
            this.i.i(i, i2);
        }
        this.g -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.g; i++) {
            if (lw.i(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int j;
        zz zzVar = this.h;
        if (zzVar != null) {
            j = zzVar.j(i, i2, collection, z);
        } else {
            a00 a00Var = a00.h;
            j = this.i.j(i, i2, collection, z);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.g - 1; i >= 0; i--) {
            if (lw.i(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            return new zs(this, i);
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
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
        g();
        f();
        return j(this.f, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.f, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        int i3 = this.f;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        q3.j(i, i2, this.g);
        return new zz(this.e, this.f + i, i2 - i, this, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.g;
        Object[] objArr2 = this.e;
        int i2 = this.f;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        o7.R(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return nh.h0(this.e, this.f, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f + this.g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.e;
        int i = this.g;
        int i2 = this.f;
        return o7.U(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.f + this.g, collection, size);
        return size > 0;
    }
}
