package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jb0 extends y implements Collection, fx {
    public b0 e;
    public Object[] f;
    public Object[] g;
    public int h;
    public i2 i = new i2(26);
    public Object[] j;
    public Object[] k;
    public int l;

    public jb0(b0 b0Var, Object[] objArr, Object[] objArr2, int i) {
        this.e = b0Var;
        this.f = objArr;
        this.g = objArr2;
        this.h = i;
        this.j = objArr;
        this.k = objArr2;
        this.l = b0Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.l - i;
        Object[] objArr2 = this.k;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] k = k(objArr2);
        o7.R(objArr2, k, i3, i3 + 1, i4);
        k[i4 - 1] = null;
        this.j = objArr;
        this.k = k;
        this.l = (i + i4) - 1;
        this.h = i2;
        return obj2;
    }

    public final int B() {
        int i = this.l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        int t = u10.t(i2, i);
        Object[] k = k(objArr);
        if (i != 0) {
            Object obj2 = k[t];
            obj2.getClass();
            k[t] = C((Object[]) obj2, i - 5, i2, obj, t3Var);
            return k;
        }
        if (k != objArr) {
            ((AbstractList) this).modCount++;
        }
        t3Var.f = k[t];
        k[t] = obj;
        return k;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m;
        if (i3 < 1) {
            dd0.a("requires at least one nullBuffer");
        }
        Object[] k = k(objArr);
        objArr2[0] = k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            o7.R(k, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m = k;
            } else {
                m = m();
                i3--;
                objArr2[i3] = m;
            }
            int i7 = i2 - i6;
            o7.R(k, objArr3, 0, i7, i2);
            o7.R(k, m, size + 1, i4, i7);
            objArr3 = m;
        }
        Iterator it = collection.iterator();
        d(k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m2 = m();
            d(m2, 0, it);
            objArr2[i8] = m2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.y
    public final int a() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        kw.h(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            h(this.j, i - B, obj);
            return;
        }
        t3 t3Var = new t3(13, (Object) null);
        Object[] objArr = this.j;
        objArr.getClass();
        h(g(objArr, this.h, i, obj, t3Var), 0, t3Var.f);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] m;
        kw.h(i, this.l);
        if (i == this.l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.k;
            Object[] k = k(objArr);
            o7.R(objArr, k, size2 + 1, i3, E());
            d(k, i3, collection.iterator());
            this.k = k;
            this.l = collection.size() + this.l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int E = E();
        int size3 = collection.size() + this.l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            m = m();
            collection2 = collection;
            D(collection2, i, this.k, E, objArr2, size, m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.k;
            if (size3 > E) {
                int i4 = size3 - E;
                Object[] l = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, l);
                objArr2 = objArr2;
                m = l;
            } else {
                m = m();
                int i5 = E - size3;
                o7.R(objArr3, m, 0, i5, E);
                int i6 = 32 - i5;
                Object[] l2 = l(i6, this.k);
                int i7 = size - 1;
                objArr2[i7] = l2;
                f(collection2, i, i6, objArr2, i7, l2);
                collection2 = collection2;
            }
        }
        this.j = s(this.j, i2, objArr2);
        this.k = m;
        this.l = collection2.size() + this.l;
        return true;
    }

    @Override // defpackage.y
    public final Object b(int i) {
        kw.g(i, a());
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            return A(this.j, B, this.h, i - B);
        }
        t3 t3Var = new t3(13, this.k[0]);
        Object[] objArr = this.j;
        objArr.getClass();
        A(z(objArr, this.h, i, t3Var), B, this.h, 0);
        return t3Var.f;
    }

    public final b0 c() {
        b0 pl0Var;
        Object[] objArr = this.j;
        if (objArr == this.f && this.k == this.g) {
            pl0Var = this.e;
        } else {
            this.i = new i2(26);
            this.f = objArr;
            Object[] objArr2 = this.k;
            this.g = objArr2;
            pl0Var = objArr == null ? objArr2.length == 0 ? pl0.f : new pl0(Arrays.copyOf(objArr2, this.l)) : new ib0(objArr, objArr2, this.l, this.h);
        }
        this.e = pl0Var;
        return pl0Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.j == null) {
            z6.m("root is null");
            return;
        }
        int i4 = i >> 5;
        x j = j(B() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (j.e - 1 != i4) {
            Object[] objArr4 = (Object[]) j.previous();
            o7.R(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = l(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) j.previous();
        int B = i3 - (((B() >> 5) - 1) - i4);
        if (B < i3) {
            objArr2 = objArr[B];
            objArr2.getClass();
        }
        D(collection, i, objArr5, 32, objArr, B, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        Object obj2;
        int t = u10.t(i2, i);
        if (i == 0) {
            t3Var.f = objArr[31];
            Object[] k = k(objArr);
            o7.R(objArr, k, t + 1, t, 31);
            k[t] = obj;
            return k;
        }
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = k2[t];
        obj3.getClass();
        k2[t] = g((Object[]) obj3, i3, i2, obj, t3Var);
        while (true) {
            t++;
            if (t >= 32 || (obj2 = k2[t]) == null) {
                break;
            }
            k2[t] = g((Object[]) obj2, i3, 0, t3Var.f, t3Var);
        }
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        kw.g(i, a());
        if (B() <= i) {
            objArr = this.k;
        } else {
            Object[] objArr2 = this.j;
            objArr2.getClass();
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[u10.t(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int E = E();
        Object[] k = k(this.k);
        Object[] objArr2 = this.k;
        if (E >= 32) {
            Object obj2 = objArr2[31];
            o7.R(objArr2, k, i + 1, i, 31);
            k[i] = obj;
            t(objArr, k, n(obj2));
            return;
        }
        o7.R(objArr2, k, i + 1, i, E);
        k[i] = obj;
        this.j = objArr;
        this.k = k;
        this.l++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final x j(int i) {
        Object[] objArr = this.j;
        if (objArr == null) {
            z6.m("Invalid root");
            return null;
        }
        int B = B() >> 5;
        kw.h(i, B);
        int i2 = this.h;
        return i2 == 0 ? new l9(i, objArr) : new er0(objArr, i, B, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        o7.T(objArr, m, 0, length, 6);
        return m;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            o7.R(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] m = m();
        o7.R(objArr, m, i, 0, 32 - i);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        kw.h(i, this.l);
        return new lb0(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            dd0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int t = u10.t(i, i2);
        Object obj = objArr[t];
        obj.getClass();
        Object o = o((Object[]) obj, i, i2 - 5);
        if (t < 31) {
            int i3 = t + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m = m();
                o7.R(objArr, m, 0, 0, i3);
                objArr = m;
            }
        }
        if (o == objArr[t]) {
            return objArr;
        }
        Object[] k = k(objArr);
        k[t] = o;
        return k;
    }

    public final Object[] p(Object[] objArr, int i, int i2, t3 t3Var) {
        Object[] p;
        int t = u10.t(i2 - 1, i);
        if (i == 5) {
            t3Var.f = objArr[t];
            p = null;
        } else {
            Object obj = objArr[t];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, t3Var);
        }
        if (p == null && t == 0) {
            return null;
        }
        Object[] k = k(objArr);
        k[t] = p;
        return k;
    }

    public final void q(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.k = objArr;
            this.l = i;
            this.h = i2;
            return;
        }
        t3 t3Var = new t3(13, obj);
        objArr.getClass();
        Object[] p = p(objArr, i2, i, t3Var);
        p.getClass();
        Object obj2 = t3Var.f;
        obj2.getClass();
        this.k = (Object[]) obj2;
        this.l = i;
        if (p[1] == null) {
            this.j = (Object[]) p[0];
            this.h = i2 - 5;
        } else {
            this.j = p;
            this.h = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            dd0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            dd0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] k = k(objArr);
        int t = u10.t(i, i2);
        int i3 = i2 - 5;
        k[t] = r((Object[]) k[t], i, i3, it);
        while (true) {
            t++;
            if (t >= 32 || !it.hasNext()) {
                break;
            }
            k[t] = r((Object[]) k[t], 0, i3, it);
        }
        return k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new a0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        t tVar = new t(objArr2);
        int i2 = i >> 5;
        int i3 = this.h;
        Object[] r = i2 < (1 << i3) ? r(objArr, i, i3, tVar) : k(objArr);
        while (tVar.hasNext()) {
            this.h += 5;
            r = n(r);
            int i4 = this.h;
            r(r, 1 << i4, i4, tVar);
        }
        return r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        kw.g(i, a());
        if (B() > i) {
            t3 t3Var = new t3(13, (Object) null);
            Object[] objArr = this.j;
            objArr.getClass();
            this.j = C(objArr, this.h, i, obj, t3Var);
            return t3Var.f;
        }
        Object[] k = k(this.k);
        if (k != this.k) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = k[i2];
        k[i2] = obj;
        this.k = k;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.l;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            this.j = u(this.h + 5, n(objArr), objArr2);
            this.k = objArr3;
            this.h += 5;
            this.l++;
            return;
        }
        if (objArr == null) {
            this.j = objArr2;
            this.k = objArr3;
            this.l = i + 1;
        } else {
            this.j = u(i3, objArr, objArr2);
            this.k = objArr3;
            this.l++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int t = u10.t(a() - 1, i);
        Object[] k = k(objArr);
        if (i == 5) {
            k[t] = objArr2;
            return k;
        }
        k[t] = u(i - 5, (Object[]) k[t], objArr2);
        return k;
    }

    public final int v(pq pqVar, Object[] objArr, int i, int i2, t3 t3Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = t3Var.f;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) pqVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        t3Var.f = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(pq pqVar, Object[] objArr, int i, t3 t3Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) pqVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        t3Var.f = objArr2;
        return i2;
    }

    public final int x(pq pqVar, int i, t3 t3Var) {
        int w = w(pqVar, this.k, i, t3Var);
        Object obj = t3Var.f;
        if (w == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w, i, (Object) null);
        this.k = objArr;
        this.l -= i - w;
        return w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (x(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(pq pqVar) {
        int i;
        pq pqVar2 = pqVar;
        int E = E();
        Object[] objArr = null;
        t3 t3Var = new t3(13, objArr);
        boolean z = false;
        if (this.j != null) {
            x j = j(0);
            int i2 = 32;
            while (i2 == 32 && j.hasNext()) {
                i2 = w(pqVar2, (Object[]) j.next(), 32, t3Var);
            }
            if (i2 == 32) {
                int x = x(pqVar2, E, t3Var);
                if (x == 0) {
                    q(this.j, this.l, this.h);
                }
            } else {
                int i3 = (j.e - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (j.hasNext()) {
                    i4 = v(pqVar2, (Object[]) j.next(), 32, i4, t3Var, arrayList2, arrayList);
                    pqVar2 = pqVar;
                }
                int v = v(pqVar, this.k, E, i4, t3Var, arrayList2, arrayList);
                Object obj = t3Var.f;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, v, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.j;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = r(objArr3, i3, this.h, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    dd0.a("invalid size");
                }
                if (size == 0) {
                    this.h = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.h;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.h = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = o(objArr3, i5, i);
                }
                this.j = objArr;
                this.k = objArr2;
                this.l = size + v;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, t3 t3Var) {
        int t = u10.t(i2, i);
        if (i == 0) {
            Object obj = objArr[t];
            Object[] k = k(objArr);
            o7.R(objArr, k, t, t + 1, 32);
            k[31] = t3Var.f;
            t3Var.f = obj;
            return k;
        }
        int t2 = objArr[31] == null ? u10.t(B() - 1, i) : 31;
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        int i4 = t + 1;
        if (i4 <= t2) {
            while (true) {
                Object obj2 = k2[t2];
                obj2.getClass();
                k2[t2] = z((Object[]) obj2, i3, 0, t3Var);
                if (t2 == i4) {
                    break;
                }
                t2--;
            }
        }
        Object obj3 = k2[t];
        obj3.getClass();
        k2[t] = z((Object[]) obj3, i3, i2, t3Var);
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E = E();
        if (E < 32) {
            Object[] k = k(this.k);
            k[E] = obj;
            this.k = k;
            this.l = a() + 1;
        } else {
            t(this.j, this.k, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        Iterator it = collection.iterator();
        if (32 - E >= collection.size()) {
            Object[] k = k(this.k);
            d(k, E, it);
            this.k = k;
            this.l = collection.size() + this.l;
            return true;
        }
        int size = ((collection.size() + E) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] k2 = k(this.k);
        d(k2, E, it);
        objArr[0] = k2;
        for (int i = 1; i < size; i++) {
            Object[] m = m();
            d(m, 0, it);
            objArr[i] = m;
        }
        this.j = s(this.j, B(), objArr);
        Object[] m2 = m();
        d(m2, 0, it);
        this.k = m2;
        this.l = collection.size() + this.l;
        return true;
    }
}
