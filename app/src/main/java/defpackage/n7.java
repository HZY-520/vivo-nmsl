package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class n7 implements Collection, Set, fx, ix {
    public int[] e = lw.j;
    public Object[] f = lw.l;
    public int g;

    public final Object a(int i) {
        int i2 = this.g;
        Object[] objArr = this.f;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                o7.P(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.f;
                o7.R(objArr2, objArr2, i, i4, i2);
            }
            this.f[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.e = iArr2;
            this.f = new Object[i5];
            if (i > 0) {
                o7.S(iArr, iArr2, 0, i, 6);
                o7.T(objArr, this.f, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                o7.P(iArr, this.e, i, i6, i2);
                o7.R(objArr, this.f, i, i6, i2);
            }
        }
        if (i2 != this.g) {
            throw new ConcurrentModificationException();
        }
        this.g = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int u;
        int i2 = this.g;
        if (obj == null) {
            u = t10.u(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            u = t10.u(this, obj, hashCode);
        }
        if (u >= 0) {
            return false;
        }
        int i3 = ~u;
        int[] iArr = this.e;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f;
            int[] iArr2 = new int[i4];
            this.e = iArr2;
            this.f = new Object[i4];
            if (i2 != this.g) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                o7.S(iArr, iArr2, 0, iArr.length, 6);
                o7.T(objArr, this.f, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.e;
            int i5 = i3 + 1;
            o7.P(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f;
            o7.R(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.g;
        if (i2 == i6) {
            int[] iArr4 = this.e;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f[i3] = obj;
                this.g = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f;
            int[] iArr2 = new int[size];
            this.e = iArr2;
            this.f = new Object[size];
            if (i > 0) {
                o7.S(iArr, iArr2, 0, i, 6);
                o7.T(objArr, this.f, 0, this.g, 6);
            }
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.g;
        if (i != 0) {
            this.e = lw.j;
            this.f = lw.l;
            i = 0;
            this.g = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? t10.u(this, null, 0) : t10.u(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.g != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.e;
        int i = this.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i7(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int u = obj == null ? t10.u(this, null, 0) : t10.u(this, obj, obj.hashCode());
        if (u < 0) {
            return false;
        }
        a(u);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.g - 1; -1 < i; i--) {
            if (!ac.Y(collection, this.f[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        o7.R(this.f, objArr, 0, 0, this.g);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 14);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return o7.U(this.f, 0, this.g);
    }
}
