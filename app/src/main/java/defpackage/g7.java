package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g7 extends y {
    public static final Object[] h = new Object[0];
    public int e;
    public Object[] f = h;
    public int g;

    @Override // defpackage.y
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.g;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.g + 1);
        int h2 = h(this.e + i);
        int i3 = this.g;
        if (i < ((i3 + 1) >> 1)) {
            int length = h2 == 0 ? this.f.length - 1 : h2 - 1;
            int i4 = this.e;
            int length2 = i4 == 0 ? this.f.length - 1 : i4 - 1;
            Object[] objArr = this.f;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                o7.R(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                o7.R(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.f;
                objArr2[objArr2.length - 1] = objArr2[0];
                o7.R(objArr2, objArr2, 0, 1, length + 1);
            }
            this.f[length] = obj;
            this.e = length2;
        } else {
            int h3 = h(i3 + this.e);
            Object[] objArr3 = this.f;
            if (h2 < h3) {
                o7.R(objArr3, objArr3, h2 + 1, h2, h3);
            } else {
                o7.R(objArr3, objArr3, 1, 0, h3);
                Object[] objArr4 = this.f;
                objArr4[0] = objArr4[objArr4.length - 1];
                o7.R(objArr4, objArr4, h2 + 1, h2, objArr4.length - 1);
            }
            this.f[h2] = obj;
        }
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.g) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.g);
        int h2 = h(this.g + this.e);
        int h3 = h(this.e + i);
        int size = collection.size();
        if (i >= ((this.g + 1) >> 1)) {
            int i3 = h3 + size;
            Object[] objArr = this.f;
            if (h3 < h2) {
                int i4 = size + h2;
                if (i4 <= objArr.length) {
                    o7.R(objArr, objArr, i3, h3, h2);
                } else if (i3 >= objArr.length) {
                    o7.R(objArr, objArr, i3 - objArr.length, h3, h2);
                } else {
                    int length = h2 - (i4 - objArr.length);
                    o7.R(objArr, objArr, 0, length, h2);
                    Object[] objArr2 = this.f;
                    o7.R(objArr2, objArr2, i3, h3, length);
                }
            } else {
                o7.R(objArr, objArr, size, 0, h2);
                Object[] objArr3 = this.f;
                if (i3 >= objArr3.length) {
                    o7.R(objArr3, objArr3, i3 - objArr3.length, h3, objArr3.length);
                } else {
                    o7.R(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f;
                    o7.R(objArr4, objArr4, i3, h3, objArr4.length - size);
                }
            }
            c(h3, collection);
            return true;
        }
        int i5 = this.e;
        int i6 = i5 - size;
        Object[] objArr5 = this.f;
        if (h3 < i5) {
            o7.R(objArr5, objArr5, i6, i5, objArr5.length);
            Object[] objArr6 = this.f;
            if (size >= h3) {
                o7.R(objArr6, objArr6, objArr6.length - size, 0, h3);
            } else {
                o7.R(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f;
                o7.R(objArr7, objArr7, 0, size, h3);
            }
        } else if (i6 >= 0) {
            o7.R(objArr5, objArr5, i6, i5, h3);
        } else {
            i6 += objArr5.length;
            int i7 = h3 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                o7.R(objArr5, objArr5, i6, i5, h3);
            } else {
                o7.R(objArr5, objArr5, i6, i5, i5 + length2);
                Object[] objArr8 = this.f;
                o7.R(objArr8, objArr8, 0, this.e + length2, h3);
            }
        }
        this.e = i6;
        c(f(h3 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.g + 1);
        int i = this.e;
        if (i == 0) {
            i = this.f.length;
        }
        int i2 = i - 1;
        this.e = i2;
        this.f[i2] = obj;
        this.g++;
    }

    public final void addLast(Object obj) {
        i();
        d(this.g + 1);
        this.f[h(this.g + this.e)] = obj;
        this.g++;
    }

    @Override // defpackage.y
    public final Object b(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int h2 = h(this.e + i);
        Object[] objArr = this.f;
        Object obj = objArr[h2];
        int i3 = this.g >> 1;
        int i4 = this.e;
        if (i < i3) {
            if (h2 >= i4) {
                o7.R(objArr, objArr, i4 + 1, i4, h2);
            } else {
                o7.R(objArr, objArr, 1, 0, h2);
                Object[] objArr2 = this.f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.e;
                o7.R(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f;
            int i6 = this.e;
            objArr3[i6] = null;
            this.e = e(i6);
        } else {
            int h3 = h((a() - 1) + i4);
            Object[] objArr4 = this.f;
            if (h2 <= h3) {
                o7.R(objArr4, objArr4, h2, h2 + 1, h3 + 1);
            } else {
                o7.R(objArr4, objArr4, h2, h2 + 1, objArr4.length);
                Object[] objArr5 = this.f;
                objArr5[objArr5.length - 1] = objArr5[0];
                o7.R(objArr5, objArr5, 0, 1, h3 + 1);
            }
            this.f[h3] = null;
        }
        this.g--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f.length;
        while (i < length && it.hasNext()) {
            this.f[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f[i3] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.e, h(this.g + this.e));
        }
        this.e = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            z6.m("Deque is too big.");
            return;
        }
        Object[] objArr = this.f;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == h) {
            if (i < 10) {
                i = 10;
            }
            this.f = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        o7.R(objArr, objArr2, 0, this.e, objArr.length);
        Object[] objArr3 = this.f;
        int length2 = objArr3.length;
        int i3 = this.e;
        o7.R(objArr3, objArr2, length2 - i3, 0, i3);
        this.e = 0;
        this.f = objArr2;
    }

    public final int e(int i) {
        if (i == this.f.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.f.length : i;
    }

    public final void g(int i, int i2) {
        Object[] objArr = this.f;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.f[h(this.e + i)];
        }
        z6.f(j2.i("index: ", i, ", size: ", i2));
        return null;
    }

    public final int h(int i) {
        Object[] objArr = this.f;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int h2 = h(this.g + this.e);
        int i2 = this.e;
        if (i2 < h2) {
            while (i2 < h2) {
                if (lw.i(obj, this.f[i2])) {
                    i = this.e;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < h2) {
            return -1;
        }
        int length = this.f.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < h2; i3++) {
                    if (lw.i(obj, this.f[i3])) {
                        i2 = i3 + this.f.length;
                        i = this.e;
                    }
                }
                return -1;
            }
            if (lw.i(obj, this.f[i2])) {
                i = this.e;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f[h((a() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int h2 = h(this.g + this.e);
        int i2 = this.e;
        if (i2 < h2) {
            length = h2 - 1;
            if (i2 <= length) {
                while (!lw.i(obj, this.f[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (i2 > h2) {
            while (true) {
                h2--;
                Object[] objArr = this.f;
                if (-1 >= h2) {
                    length = objArr.length - 1;
                    int i3 = this.e;
                    if (i3 <= length) {
                        while (!lw.i(obj, this.f[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                } else if (lw.i(obj, objArr[h2])) {
                    length = h2 + this.f.length;
                    i = this.e;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int h2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int h3 = h(this.g + this.e);
            int i = this.e;
            if (i < h3) {
                h2 = i;
                while (true) {
                    objArr = this.f;
                    if (i >= h3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f[h2] = obj;
                        h2++;
                    }
                    i++;
                }
                Arrays.fill(objArr, h2, h3, (Object) null);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                h2 = h(i2);
                for (int i3 = 0; i3 < h3; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f[h2] = obj3;
                        h2 = e(h2);
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.g = f(h2 - this.e);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        this.e = e(i);
        this.g--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h2 = h((a() - 1) + this.e);
        Object[] objArr = this.f;
        Object obj = objArr[h2];
        objArr[h2] = null;
        this.g--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        q3.j(i, i2, this.g);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.g) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        i();
        int i4 = this.g - i2;
        int i5 = this.e;
        int i6 = this.e;
        if (i < i4) {
            int h2 = h((i - 1) + i5);
            int h3 = h((i2 - 1) + i6);
            while (i > 0) {
                int i7 = h2 + 1;
                int min = Math.min(i, Math.min(i7, h3 + 1));
                Object[] objArr = this.f;
                int i8 = h3 - min;
                int i9 = h2 - min;
                o7.R(objArr, objArr, i8 + 1, i9 + 1, i7);
                h2 = f(i9);
                h3 = f(i8);
                i -= min;
            }
            int h4 = h(this.e + i3);
            g(this.e, h4);
            this.e = h4;
        } else {
            int h5 = h(i5 + i2);
            int h6 = h(i6 + i);
            int i10 = this.g;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f;
                i2 = Math.min(i10, Math.min(objArr2.length - h5, objArr2.length - h6));
                Object[] objArr3 = this.f;
                int i11 = h5 + i2;
                o7.R(objArr3, objArr3, h6, h5, i11);
                h5 = h(i11);
                h6 = h(h6 + i2);
            }
            int h7 = h(this.g + this.e);
            g(f(h7 - i3), h7);
        }
        this.g -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int h3 = h(this.g + this.e);
            int i = this.e;
            if (i < h3) {
                h2 = i;
                while (true) {
                    objArr = this.f;
                    if (i >= h3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f[h2] = obj;
                        h2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, h2, h3, (Object) null);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                h2 = h(i2);
                for (int i3 = 0; i3 < h3; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f[h2] = obj3;
                        h2 = e(h2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.g = f(h2 - this.e);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return null;
        }
        int h2 = h(this.e + i);
        Object[] objArr = this.f;
        Object obj2 = objArr[h2];
        objArr[h2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.g;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int h2 = h(this.g + this.e);
        int i2 = this.e;
        if (i2 < h2) {
            o7.T(this.f, objArr, i2, h2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f;
            o7.R(objArr2, objArr, 0, this.e, objArr2.length);
            Object[] objArr3 = this.f;
            o7.R(objArr3, objArr, objArr3.length - this.e, 0, h2);
        }
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + this.g);
        c(h(this.g + this.e), collection);
        return true;
    }
}
